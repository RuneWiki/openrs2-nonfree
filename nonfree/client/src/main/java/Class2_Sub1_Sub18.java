import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
	private int anInt1604;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	private int anInt1605;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
	private int anInt1608;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
	private int anInt1611;

	@OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
	private int anInt1622;

	@OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
	private int anInt1626;

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "I")
	private int anInt1620;

	@OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
	private int anInt1616;

	@OriginalMember(owner = "client!ia", name = "sb", descriptor = "I")
	private int anInt1623;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(26) int[][] local26 = this.method2794(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static120.anInt2812; local52++) {
				this.method1039(local38[local52], local30[local52], local34[local52]);
				this.anInt1608 += this.anInt1620;
				if (this.anInt1608 < 0) {
					this.anInt1608 = 0;
				}
				if (this.anInt1608 > 4096) {
					this.anInt1608 = 4096;
				}
				for (this.anInt1622 += this.anInt1616; this.anInt1622 < 0; this.anInt1622 += 4096) {
				}
				this.anInt1604 += this.anInt1623;
				while (this.anInt1622 > 4096) {
					this.anInt1622 -= 4096;
				}
				if (this.anInt1604 < 0) {
					this.anInt1604 = 0;
				}
				if (this.anInt1604 > 4096) {
					this.anInt1604 = 4096;
				}
				this.method1038(this.anInt1608, this.anInt1604, this.anInt1622);
				local42[local52] = this.anInt1605;
				local46[local52] = this.anInt1626;
				local50[local52] = this.anInt1611;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1616 = arg0.method1400();
		} else if (arg1 == 1) {
			this.anInt1620 = (arg0.method1394() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1623 = (arg0.method1394() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	private void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
		if (local31 <= 0) {
			this.anInt1605 = this.anInt1626 = this.anInt1611 = arg1;
			return;
		}
		@Pc(47) int local47 = arg2 * 6;
		@Pc(54) int local54 = arg1 + arg1 - local31;
		@Pc(63) int local63 = (local31 - local54 << 12) / local31;
		@Pc(67) int local67 = local47 >> 12;
		@Pc(74) int local74 = local47 - (local67 << 12);
		@Pc(82) int local82 = local63 * local31 >> 12;
		@Pc(88) int local88 = local82 * local74 >> 12;
		@Pc(93) int local93 = local31 - local88;
		@Pc(97) int local97 = local88 + local54;
		if (local67 == 0) {
			this.anInt1626 = local97;
			this.anInt1611 = local54;
			this.anInt1605 = local31;
		} else if (local67 == 1) {
			this.anInt1626 = local31;
			this.anInt1611 = local54;
			this.anInt1605 = local93;
		} else if (local67 == 2) {
			this.anInt1605 = local54;
			this.anInt1611 = local97;
			this.anInt1626 = local31;
		} else if (local67 == 3) {
			this.anInt1605 = local54;
			this.anInt1626 = local93;
			this.anInt1611 = local31;
		} else if (local67 == 4) {
			this.anInt1605 = local97;
			this.anInt1626 = local54;
			this.anInt1611 = local31;
		} else if (local67 == 5) {
			this.anInt1605 = local31;
			this.anInt1626 = local54;
			this.anInt1611 = local93;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIII)V")
	private void method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 <= arg1 ? arg1 : arg2;
		@Pc(31) int local31 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(42) int local42 = arg0 < local31 ? arg0 : local31;
		@Pc(53) int local53 = arg0 <= local20 ? local20 : arg0;
		this.anInt1604 = (local42 + local53) / 2;
		@Pc(65) int local65 = local53 - local42;
		if (local65 <= 0) {
			return;
		}
		if (this.anInt1604 > 0 && this.anInt1604 < 4096) {
			this.anInt1608 = (local65 << 12) / (this.anInt1604 > 2048 ? 8192 - this.anInt1604 * 2 : this.anInt1604 * 2);
		}
		@Pc(109) int local109 = (local53 - arg2 << 12) / local65;
		@Pc(118) int local118 = (local53 - arg0 << 12) / local65;
		@Pc(127) int local127 = (local53 - arg1 << 12) / local65;
		if (local53 == arg2) {
			this.anInt1622 = arg1 == local42 ? local118 + 20480 : -local127 + 4096;
		} else if (arg1 == local53) {
			this.anInt1622 = local42 == arg0 ? local109 + 4096 : -local118 + 12288;
		} else {
			this.anInt1622 = arg2 == local42 ? local127 + 12288 : -local109 + 20480;
		}
		this.anInt1622 /= 6;
	}
}
