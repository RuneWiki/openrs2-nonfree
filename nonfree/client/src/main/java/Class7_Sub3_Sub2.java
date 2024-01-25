import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class7_Sub3_Sub2 extends Class7_Sub3 {

	@OriginalMember(owner = "client!io", name = "Pb", descriptor = "Lclient!ja;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!io", name = "Tb", descriptor = "I")
	private int anInt3023;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(Z)I")
	public int method2798() {
		return super.aByteArray33[super.anInt3005++] - this.aClass107_1.method2888() & 0xFF;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(IB)V")
	public void method2799(@OriginalArg(0) int arg0) {
		super.aByteArray33[super.anInt3005++] = (byte) (this.aClass107_1.method2888() + arg0);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([IB)V")
	public void method2800(@OriginalArg(0) int[] arg0) {
		this.aClass107_1 = new Class107(arg0);
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(IZ)I")
	public int method2801(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3023;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II[BI)V")
	public void method2803(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray33[super.anInt3005++] - this.aClass107_1.method2888());
		}
	}

	@OriginalMember(owner = "client!io", name = "s", descriptor = "(I)V")
	public void method2805() {
		super.anInt3005 = (this.anInt3023 + 7) / 8;
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(II)I")
	public int method2806(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt3023 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt3023 & 0x7);
		this.anInt3023 += arg0;
		@Pc(23) int local23 = 0;
		while (arg0 > local15) {
			local23 += (super.aByteArray33[local8++] & Static96.anIntArray325[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local23 += super.aByteArray33[local8] & Static96.anIntArray325[local15];
		} else {
			local23 += super.aByteArray33[local8] >> local15 - arg0 & Static96.anIntArray325[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!io", name = "t", descriptor = "(I)V")
	public void method2808() {
		this.anInt3023 = super.anInt3005 * 8;
	}
}
