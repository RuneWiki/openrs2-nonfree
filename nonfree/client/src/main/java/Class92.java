import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class92 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!fu;")
	protected final Class63_Sub2 aClass63_Sub2_30;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	private final int anInt3910;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	private int anInt3909;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	private final int anInt3908;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!fu;I[BIZ)V")
	public Class92(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass63_Sub2_30 = arg0;
		this.anInt3910 = arg1;
		this.anInt3909 = arg3;
		this.aBoolean296 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl2;
		local16.glGenBuffersARB(1, Static122.anIntArray771, 0);
		this.anInt3908 = Static122.anIntArray771[0];
		this.method3590();
		local16.glBufferDataARB(arg1, this.anInt3909, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt3909), this.aBoolean296 ? 35040 : 35044);
		this.aClass63_Sub2_30.anInt2093 += this.anInt3909;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!fu;ILjava/nio/ByteBuffer;Z)V")
	public Class92(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass63_Sub2_30 = arg0;
		this.anInt3910 = arg1;
		this.anInt3909 = arg2.limit();
		this.aBoolean296 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl2;
		local17.glGenBuffersARB(1, Static122.anIntArray771, 0);
		this.anInt3908 = Static122.anIntArray771[0];
		this.method3590();
		local17.glBufferDataARB(arg1, this.anInt3909, arg2, this.aBoolean296 ? 35040 : 35044);
		this.aClass63_Sub2_30.anInt2093 += this.anInt3909;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()I")
	public int method3588() {
		return this.anInt3908;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BI)V")
	protected final void method3589(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method3590();
		if (arg1 > this.anInt3909) {
			this.aClass63_Sub2_30.anOpengl2.glBufferDataARB(this.anInt3910, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean296 ? 35040 : 35044);
			this.aClass63_Sub2_30.anInt2093 += arg1 - this.anInt3909;
			this.anInt3909 = arg1;
		} else {
			this.aClass63_Sub2_30.anOpengl2.glBufferSubDataARB(this.anInt3910, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
	protected abstract void method3590();

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass63_Sub2_30.method2125(this.anInt3908, this.anInt3909);
		super.finalize();
	}
}
