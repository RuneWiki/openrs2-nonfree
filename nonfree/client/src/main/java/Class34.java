import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public abstract class Class34 {

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
	private int anInt9767;

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
	private final int anInt9769;

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "Lclient!vf;")
	protected final Class100_Sub3 aClass100_Sub3_42;

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "Z")
	private final boolean aBoolean684;

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
	protected final int anInt9768;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!vf;I[BIZ)V")
	public Class34(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt9767 = arg3;
		this.anInt9769 = arg1;
		this.aClass100_Sub3_42 = arg0;
		this.aBoolean684 = arg4;
		OpenGL.glGenBuffersARB(1, Static198.anIntArray171, 0);
		this.anInt9768 = Static198.anIntArray171[0];
		this.method8309();
		OpenGL.glBufferDataARBub(arg1, this.anInt9767, arg2, 0, this.aBoolean684 ? 35040 : 35044);
		this.aClass100_Sub3_42.anInt10263 += this.anInt9767;
	}

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!vf;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class34(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean684 = arg4;
		this.anInt9767 = arg3;
		this.anInt9769 = arg1;
		this.aClass100_Sub3_42 = arg0;
		OpenGL.glGenBuffersARB(1, Static198.anIntArray171, 0);
		this.anInt9768 = Static198.anIntArray171[0];
		this.method8309();
		OpenGL.glBufferDataARBa(arg1, this.anInt9767, arg2.getAddress(), this.aBoolean684 ? 35040 : 35044);
		this.aClass100_Sub3_42.anInt10263 += this.anInt9767;
	}

	@OriginalMember(owner = "client!bga", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass100_Sub3_42.method8739(this.anInt9768, this.anInt9767);
		super.finalize();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([BII)V")
	protected final void method8308(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8309();
		if (arg1 <= this.anInt9767) {
			OpenGL.glBufferSubDataARBub(this.anInt9769, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt9769, arg1, arg0, 0, this.aBoolean684 ? 35040 : 35044);
			this.aClass100_Sub3_42.anInt10263 += arg1 - this.anInt9767;
			this.anInt9767 = arg1;
		}
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
	protected abstract void method8309();
}
