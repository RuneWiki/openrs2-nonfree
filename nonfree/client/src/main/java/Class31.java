import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class Class31 {

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	private int anInt7707;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
	private final boolean aBoolean653;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
	private final int anInt7712;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!qg;")
	protected final Class121_Sub2 aClass121_Sub2_43;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	protected final int anInt7709;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!qg;I[BIZ)V")
	public Class31(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7707 = arg3;
		this.aBoolean653 = arg4;
		this.anInt7712 = arg1;
		this.aClass121_Sub2_43 = arg0;
		OpenGL.glGenBuffersARB(1, Static186.anIntArray264, 0);
		this.anInt7709 = Static186.anIntArray264[0];
		this.method5940();
		OpenGL.glBufferDataARBub(arg1, this.anInt7707, arg2, 0, this.aBoolean653 ? 35040 : 35044);
		this.aClass121_Sub2_43.anInt5941 += this.anInt7707;
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!qg;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class31(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass121_Sub2_43 = arg0;
		this.anInt7712 = arg1;
		this.anInt7707 = arg3;
		this.aBoolean653 = arg4;
		OpenGL.glGenBuffersARB(1, Static186.anIntArray264, 0);
		this.anInt7709 = Static186.anIntArray264[0];
		this.method5940();
		OpenGL.glBufferDataARBa(arg1, this.anInt7707, arg2.b(), this.aBoolean653 ? 35040 : 35044);
		this.aClass121_Sub2_43.anInt5941 += this.anInt7707;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[BI)V")
	protected final void method5939(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5940();
		if (arg1 > this.anInt7707) {
			OpenGL.glBufferDataARBub(this.anInt7712, arg1, arg0, 0, this.aBoolean653 ? 35040 : 35044);
			this.aClass121_Sub2_43.anInt5941 += arg1 - this.anInt7707;
			this.anInt7707 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt7712, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)V")
	protected abstract void method5940();

	@OriginalMember(owner = "client!bq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass121_Sub2_43.method4717(this.anInt7709, this.anInt7707);
		super.finalize();
	}
}
