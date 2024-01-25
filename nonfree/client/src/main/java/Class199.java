import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class199 {

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	private int anInt6069;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!kd;")
	protected final Class39_Sub2 aClass39_Sub2_37;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
	private final boolean aBoolean425;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	private final int anInt6064;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	protected final int anInt6063;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!kd;I[BIZ)V")
	public Class199(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6069 = arg3;
		this.aClass39_Sub2_37 = arg0;
		this.aBoolean425 = arg4;
		this.anInt6064 = arg1;
		OpenGL.glGenBuffersARB(1, Static124.anIntArray645, 0);
		this.anInt6063 = Static124.anIntArray645[0];
		this.method5062();
		OpenGL.glBufferDataARBub(arg1, this.anInt6069, arg2, 0, this.aBoolean425 ? 35040 : 35044);
		this.aClass39_Sub2_37.anInt3781 += this.anInt6069;
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!kd;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class199(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub2_37 = arg0;
		this.anInt6064 = arg1;
		this.aBoolean425 = arg4;
		this.anInt6069 = arg3;
		OpenGL.glGenBuffersARB(1, Static124.anIntArray645, 0);
		this.anInt6063 = Static124.anIntArray645[0];
		this.method5062();
		OpenGL.glBufferDataARBa(arg1, this.anInt6069, arg2.b(), this.aBoolean425 ? 35040 : 35044);
		this.aClass39_Sub2_37.anInt3781 += this.anInt6069;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([BII)V")
	protected final void method5061(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5062();
		if (this.anInt6069 < arg1) {
			OpenGL.glBufferDataARBub(this.anInt6064, arg1, arg0, 0, this.aBoolean425 ? 35040 : 35044);
			this.aClass39_Sub2_37.anInt3781 += arg1 - this.anInt6069;
			this.anInt6069 = arg1;
		} else {
			OpenGL.glBufferSubDataARB(this.anInt6064, 0, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	protected abstract void method5062();

	@OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass39_Sub2_37.method3194(this.anInt6069, this.anInt6063);
		super.finalize();
	}
}
