import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub14_Sub2 extends Class1_Sub14 {

	@OriginalMember(owner = "client!qf", name = "Kb", descriptor = "I")
	private int anInt5724;

	@OriginalMember(owner = "client!qf", name = "Yb", descriptor = "Lclient!pu;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "(B)I")
	public int method4556() {
		@Pc(29) int local29 = super.aByteArray65[super.anInt5695++] - this.aClass195_1.method4370() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray65[super.anInt5695++] - this.aClass195_1.method4370() & 0xFF);
	}

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "(II)I")
	public int method4557(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = this.anInt5724 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt5724 & 0x7);
		this.anInt5724 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (Static58.anIntArray54[local26] & super.aByteArray65[local18++]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += super.aByteArray65[local18] & Static58.anIntArray54[local26];
		} else {
			local34 += super.aByteArray65[local18] >> local26 - arg0 & Static58.anIntArray54[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "(I)V")
	public void method4559() {
		super.anInt5695 = (this.anInt5724 + 7) / 8;
	}

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "(B)Z")
	public boolean method4560() {
		@Pc(22) int local22 = super.aByteArray65[super.anInt5695] - this.aClass195_1.method4371() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "(II)V")
	public void method4562(@OriginalArg(1) int arg0) {
		super.aByteArray65[super.anInt5695++] = (byte) (this.aClass195_1.method4370() + arg0);
	}

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "(II)I")
	public int method4566(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5724;
	}

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "(I)V")
	public void method4567() {
		this.anInt5724 = super.anInt5695 * 8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([IB)V")
	public void method4568(@OriginalArg(0) int[] arg0) {
		this.aClass195_1 = new Class195(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(II[BI)V")
	public void method4569(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			arg1[local15] = (byte) (super.aByteArray65[super.anInt5695++] - this.aClass195_1.method4370());
		}
	}
}
