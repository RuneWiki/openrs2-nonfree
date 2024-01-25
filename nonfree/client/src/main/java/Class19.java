import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public abstract class Class19 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!nm;")
	protected final Class164_Sub1 aClass164_Sub1_28;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	private final int anInt3802;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt3801;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
	private final boolean aBoolean372;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	private final int anInt3800;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!nm;I[BIZ)V")
	public Class19(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass164_Sub1_28 = arg0;
		this.anInt3802 = arg1;
		this.anInt3801 = arg3;
		this.aBoolean372 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static21.anIntArray481, 0);
		this.anInt3800 = Static21.anIntArray481[0];
		this.method3101();
		local16.glBufferDataARB(arg1, this.anInt3801, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt3801), this.aBoolean372 ? 35040 : 35044);
		this.aClass164_Sub1_28.anInt4058 += this.anInt3801;
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!nm;ILjava/nio/ByteBuffer;Z)V")
	public Class19(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass164_Sub1_28 = arg0;
		this.anInt3802 = arg1;
		this.anInt3801 = arg2.limit();
		this.aBoolean372 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static21.anIntArray481, 0);
		this.anInt3800 = Static21.anIntArray481[0];
		this.method3101();
		local17.glBufferDataARB(arg1, this.anInt3801, arg2, this.aBoolean372 ? 35040 : 35044);
		this.aClass164_Sub1_28.anInt4058 += this.anInt3801;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass164_Sub1_28.method3604(this.anInt3800, this.anInt3801);
		super.finalize();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	protected abstract void method3101();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V")
	protected final void method3102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3101();
		if (arg1 > this.anInt3801) {
			this.aClass164_Sub1_28.anOpengl1.glBufferDataARB(this.anInt3802, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean372 ? 35040 : 35044);
			this.aClass164_Sub1_28.anInt4058 += arg1 - this.anInt3801;
			this.anInt3801 = arg1;
		} else {
			this.aClass164_Sub1_28.anOpengl1.glBufferSubDataARB(this.anInt3802, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public int method3103() {
		return this.anInt3800;
	}
}
