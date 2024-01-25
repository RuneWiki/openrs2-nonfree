import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class Class91 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Lclient!en;")
	protected final Class90_Sub1 aClass90_Sub1_41;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	private int anInt9216;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Z")
	private final boolean aBoolean594;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	private final int anInt9218;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	protected final int anInt9219;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!en;I[BIZ)V")
	public Class91(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass90_Sub1_41 = arg0;
		this.anInt9216 = arg3;
		this.aBoolean594 = arg4;
		this.anInt9218 = arg1;
		OpenGL.glGenBuffersARB(1, Static36.anIntArray30, 0);
		this.anInt9219 = Static36.anIntArray30[0];
		this.method7304();
		OpenGL.glBufferDataARBub(arg1, this.anInt9216, arg2, 0, this.aBoolean594 ? 35040 : 35044);
		this.aClass90_Sub1_41.anInt2441 += this.anInt9216;
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!en;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class91(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass90_Sub1_41 = arg0;
		this.anInt9216 = arg3;
		this.aBoolean594 = arg4;
		this.anInt9218 = arg1;
		OpenGL.glGenBuffersARB(1, Static36.anIntArray30, 0);
		this.anInt9219 = Static36.anIntArray30[0];
		this.method7304();
		OpenGL.glBufferDataARBa(arg1, this.anInt9216, arg2.getAddress(), this.aBoolean594 ? 35040 : 35044);
		this.aClass90_Sub1_41.anInt2441 += this.anInt9216;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
	protected abstract void method7304();

	@OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass90_Sub1_41.method2129(this.anInt9219, this.anInt9216);
		super.finalize();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[BI)V")
	protected final void method7305(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method7304();
		if (arg1 > this.anInt9216) {
			OpenGL.glBufferDataARBub(this.anInt9218, arg1, arg0, 0, this.aBoolean594 ? 35040 : 35044);
			this.aClass90_Sub1_41.anInt2441 += arg1 - this.anInt9216;
			this.anInt9216 = arg1;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt9218, 0, arg1, arg0, 0);
		}
	}
}
