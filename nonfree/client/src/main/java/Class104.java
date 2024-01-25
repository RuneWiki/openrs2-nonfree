import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class Class104 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "Lclient!bv;")
	protected final Class30_Sub1 aClass30_Sub1_38;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
	private final int anInt6044;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
	private int anInt6041;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
	private final boolean aBoolean418;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	protected final int anInt6045;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!bv;I[BIZ)V")
	public Class104(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass30_Sub1_38 = arg0;
		this.anInt6044 = arg1;
		this.anInt6041 = arg3;
		this.aBoolean418 = arg4;
		OpenGL.glGenBuffersARB(1, Static57.anIntArray95, 0);
		this.anInt6045 = Static57.anIntArray95[0];
		this.method4729();
		OpenGL.glBufferDataARBub(arg1, this.anInt6041, arg2, 0, this.aBoolean418 ? 35040 : 35044);
		this.aClass30_Sub1_38.anInt1250 += this.anInt6041;
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!bv;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class104(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6041 = arg3;
		this.aBoolean418 = arg4;
		this.anInt6044 = arg1;
		this.aClass30_Sub1_38 = arg0;
		OpenGL.glGenBuffersARB(1, Static57.anIntArray95, 0);
		this.anInt6045 = Static57.anIntArray95[0];
		this.method4729();
		OpenGL.glBufferDataARBa(arg1, this.anInt6041, arg2.a(), this.aBoolean418 ? 35040 : 35044);
		this.aClass30_Sub1_38.anInt1250 += this.anInt6041;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z[BI)V")
	protected final void method4727(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4729();
		if (arg1 > this.anInt6041) {
			OpenGL.glBufferDataARBub(this.anInt6044, arg1, arg0, 0, this.aBoolean418 ? 35040 : 35044);
			this.aClass30_Sub1_38.anInt1250 += arg1 - this.anInt6041;
			this.anInt6041 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6044, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass30_Sub1_38.method965(this.anInt6045, this.anInt6041);
		super.finalize();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
	protected abstract void method4729();
}
