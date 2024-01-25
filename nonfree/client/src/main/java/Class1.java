import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public abstract class Class1 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!mi;")
	protected final Class155_Sub1 aClass155_Sub1_15;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	private final int anInt2628;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	private int anInt2626;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	private final int anInt2627;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!mi;I[BIZ)V")
	public Class1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass155_Sub1_15 = arg0;
		this.anInt2628 = arg1;
		this.anInt2626 = arg3;
		this.aBoolean200 = arg4;
		@Pc(16) opengl local16 = arg0.anOpengl1;
		local16.glGenBuffersARB(1, Static64.anIntArray277, 0);
		this.anInt2627 = Static64.anIntArray277[0];
		this.method2199();
		local16.glBufferDataARB(arg1, this.anInt2626, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.anInt2626), this.aBoolean200 ? 35040 : 35044);
		this.aClass155_Sub1_15.anInt3842 += this.anInt2626;
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!mi;ILjava/nio/ByteBuffer;Z)V")
	public Class1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ByteBuffer arg2, @OriginalArg(3) boolean arg3) {
		this.aClass155_Sub1_15 = arg0;
		this.anInt2628 = arg1;
		this.anInt2626 = arg2.limit();
		this.aBoolean200 = arg3;
		@Pc(17) opengl local17 = arg0.anOpengl1;
		local17.glGenBuffersARB(1, Static64.anIntArray277, 0);
		this.anInt2627 = Static64.anIntArray277[0];
		this.method2199();
		local17.glBufferDataARB(arg1, this.anInt2626, arg2, this.aBoolean200 ? 35040 : 35044);
		this.aClass155_Sub1_15.anInt3842 += this.anInt2626;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "()V")
	protected abstract void method2199();

	@OriginalMember(owner = "client!di", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass155_Sub1_15.method3632(this.anInt2627, this.anInt2626);
		super.finalize();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()I")
	public int method3932() {
		return this.anInt2627;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
	protected final void method2201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method2199();
		if (arg1 > this.anInt2626) {
			this.aClass155_Sub1_15.anOpengl1.glBufferDataARB(this.anInt2628, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.aBoolean200 ? 35040 : 35044);
			this.aClass155_Sub1_15.anInt3842 += arg1 - this.anInt2626;
			this.anInt2626 = arg1;
		} else {
			this.aClass155_Sub1_15.anOpengl1.glBufferSubDataARB(this.anInt2628, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
		}
	}
}
