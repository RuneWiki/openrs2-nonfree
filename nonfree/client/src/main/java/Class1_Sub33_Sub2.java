import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub33_Sub2 extends Class1_Sub33 {

	@OriginalMember(owner = "client!vg", name = "Gb", descriptor = "I")
	private int anInt6041;

	@OriginalMember(owner = "client!vg", name = "Ib", descriptor = "Lclient!rk;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub33_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "(B)I")
	public int method5190() {
		@Pc(22) int local22 = super.aByteArray86[super.lb++] - this.aClass202_1.method4533() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray86[super.lb++] - this.aClass202_1.method4533() & 0xFF);
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(BI)I")
	public int method5191(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6041 >> 3;
		@Pc(22) int local22 = 8 - (this.anInt6041 & 0x7);
		this.anInt6041 += arg0;
		@Pc(30) int local30 = 0;
		while (arg0 > local22) {
			local30 += (super.aByteArray86[local10++] & Static160.anIntArray345[local22]) << arg0 - local22;
			arg0 -= local22;
			local22 = 8;
		}
		if (local22 == arg0) {
			local30 += super.aByteArray86[local10] & Static160.anIntArray345[local22];
		} else {
			local30 += super.aByteArray86[local10] >> local22 - arg0 & Static160.anIntArray345[arg0];
		}
		return local30;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
	public void method5193() {
		super.lb = (this.anInt6041 + 7) / 8;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([IB)V")
	public void method5194(@OriginalArg(0) int[] arg0) {
		this.aClass202_1 = new Class202(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[BI)V")
	public void method5195(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray86[super.lb++] - this.aClass202_1.method4533());
		}
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(B)Z")
	public boolean method5196() {
		@Pc(23) int local23 = super.aByteArray86[super.lb] - this.aClass202_1.method4532() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(BI)V")
	public void method5198(@OriginalArg(1) int arg0) {
		super.aByteArray86[super.lb++] = (byte) (arg0 + this.aClass202_1.method4533());
	}

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "(B)V")
	public void method5200() {
		this.anInt6041 = super.lb * 8;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(BI)I")
	public int method5201(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt6041;
	}
}
