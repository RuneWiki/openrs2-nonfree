import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class149 {

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	private int anInt10151;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	private final int anInt10145;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!kw;")
	protected final Class5_Sub2 aClass5_Sub2_43;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Z")
	private final boolean aBoolean725;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	protected final int anInt10144;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kw;I[BIZ)V")
	public Class149(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10151 = arg3;
		this.anInt10145 = arg1;
		this.aClass5_Sub2_43 = arg0;
		this.aBoolean725 = arg4;
		OpenGL.glGenBuffersARB(1, Static412.anIntArray459, 0);
		this.anInt10144 = Static412.anIntArray459[0];
		this.method8700();
		OpenGL.glBufferDataARBub(arg1, this.anInt10151, arg2, 0, this.aBoolean725 ? 35040 : 35044);
		this.aClass5_Sub2_43.anInt5650 += this.anInt10151;
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kw;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class149(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10145 = arg1;
		this.anInt10151 = arg3;
		this.aBoolean725 = arg4;
		this.aClass5_Sub2_43 = arg0;
		OpenGL.glGenBuffersARB(1, Static412.anIntArray459, 0);
		this.anInt10144 = Static412.anIntArray459[0];
		this.method8700();
		OpenGL.glBufferDataARBa(arg1, this.anInt10151, arg2.getAddress(), this.aBoolean725 ? 35040 : 35044);
		this.aClass5_Sub2_43.anInt5650 += this.anInt10151;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	protected abstract void method8700();

	@OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass5_Sub2_43.method4999(this.anInt10151, this.anInt10144);
		super.finalize();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BII)V")
	protected final void method8703(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8700();
		if (this.anInt10151 >= arg1) {
			OpenGL.glBufferSubDataARBub(this.anInt10145, 0, arg1, arg0, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt10145, arg1, arg0, 0, this.aBoolean725 ? 35040 : 35044);
			this.aClass5_Sub2_43.anInt5650 += arg1 - this.anInt10151;
			this.anInt10151 = arg1;
		}
	}
}
