import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!k", name = "Qb", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!k", name = "Xb", descriptor = "Lclient!qf;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "(II)I")
	public int method1397(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1812;
	}

	@OriginalMember(owner = "client!k", name = "q", descriptor = "(B)V")
	public void method1398() {
		this.anInt1812 = super.anInt1793 * 8;
	}

	@OriginalMember(owner = "client!k", name = "o", descriptor = "(I)I")
	public int method1399() {
		return super.aByteArray16[super.anInt1793++] - this.aClass65_1.method2229() & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(IB)V")
	public void method1400(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt1793++] = (byte) (arg0 + this.aClass65_1.method2229());
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([IB)V")
	public void method1401(@OriginalArg(0) int[] arg0) {
		this.aClass65_1 = new Class65(arg0);
	}

	@OriginalMember(owner = "client!k", name = "k", descriptor = "(II)I")
	public int method1403(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt1812 >> 3;
		@Pc(8) int local8 = 0;
		@Pc(20) int local20 = 8 - (this.anInt1812 & 0x7);
		this.anInt1812 += arg0;
		while (local20 < arg0) {
			local8 += (super.aByteArray16[local6++] & Static99.anIntArray226[local20]) << arg0 - local20;
			arg0 -= local20;
			local20 = 8;
		}
		if (local20 == arg0) {
			local8 += super.aByteArray16[local6] & Static99.anIntArray226[local20];
		} else {
			local8 += super.aByteArray16[local6] >> local20 - arg0 & Static99.anIntArray226[arg0];
		}
		return local8;
	}

	@OriginalMember(owner = "client!k", name = "r", descriptor = "(B)V")
	public void method1406() {
		super.anInt1793 = (this.anInt1812 + 7) / 8;
	}
}
