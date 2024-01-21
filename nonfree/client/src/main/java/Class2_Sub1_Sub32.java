import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
	private int anInt3824;

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
	private int anInt3825;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
	private int anInt3826;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
	private int anInt3832;

	@OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
	private int anInt3836;

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
	private int anInt3829;

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
	private int anInt3823;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	private int anInt3831;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZ)V")
	private void method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(28) int local28 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local28 <= 0) {
			this.anInt3836 = this.anInt3827 = this.anInt3824 = arg0;
			return;
		}
		@Pc(51) int local51 = arg0 + arg0 - local28;
		@Pc(55) int local55 = arg1 * 6;
		@Pc(59) int local59 = local55 >> 12;
		@Pc(68) int local68 = (local28 - local51 << 12) / local28;
		@Pc(74) int local74 = local55 - (local59 << 12);
		@Pc(82) int local82 = local68 * local28 >> 12;
		@Pc(88) int local88 = local82 * local74 >> 12;
		@Pc(92) int local92 = local88 + local51;
		@Pc(96) int local96 = local28 - local88;
		if (local59 == 0) {
			this.anInt3824 = local51;
			this.anInt3827 = local92;
			this.anInt3836 = local28;
		} else if (local59 == 1) {
			this.anInt3827 = local28;
			this.anInt3824 = local51;
			this.anInt3836 = local96;
		} else if (local59 == 2) {
			this.anInt3836 = local51;
			this.anInt3827 = local28;
			this.anInt3824 = local92;
		} else if (local59 == 3) {
			this.anInt3836 = local51;
			this.anInt3824 = local28;
			this.anInt3827 = local96;
		} else if (local59 == 4) {
			this.anInt3824 = local28;
			this.anInt3827 = local51;
			this.anInt3836 = local92;
		} else if (local59 == 5) {
			this.anInt3824 = local96;
			this.anInt3836 = local28;
			this.anInt3827 = local51;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	private void method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(31) int local31 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(38) int local38 = arg1 < local20 ? arg1 : local20;
		@Pc(49) int local49 = local31 < arg1 ? arg1 : local31;
		@Pc(54) int local54 = local49 - local38;
		this.anInt3832 = (local49 + local38) / 2;
		if (local54 <= 0) {
			return;
		}
		if (this.anInt3832 > 0 && this.anInt3832 < 4096) {
			this.anInt3826 = (local54 << 12) / (this.anInt3832 <= 2048 ? this.anInt3832 * 2 : 8192 - (this.anInt3832 * 2));
		}
		@Pc(105) int local105 = (local49 - arg2 << 12) / local54;
		@Pc(114) int local114 = (local49 - arg1 << 12) / local54;
		@Pc(123) int local123 = (local49 - arg0 << 12) / local54;
		if (local49 == arg0) {
			this.anInt3825 = local38 == arg2 ? local114 + 20480 : -local105 + 4096;
		} else if (arg2 == local49) {
			this.anInt3825 = local38 == arg1 ? local123 + 4096 : 12288 - local114;
		} else {
			this.anInt3825 = local38 == arg0 ? local105 + 12288 : -local123 + 20480;
		}
		this.anInt3825 /= 6;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3829 = arg0.method2386();
		} else if (arg1 == 1) {
			this.anInt3823 = (arg0.method2392() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3831 = (arg0.method2392() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(17) int[][] local17 = this.method2991(arg0, 0);
			@Pc(21) int[] local21 = local17[2];
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local17[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static129.anInt3118; local43++) {
				this.method2641(local33[local43], local21[local43], local25[local43]);
				this.anInt3826 += this.anInt3823;
				this.anInt3832 += this.anInt3831;
				for (this.anInt3825 += this.anInt3829; this.anInt3825 < 0; this.anInt3825 += 4096) {
				}
				if (this.anInt3832 < 0) {
					this.anInt3832 = 0;
				}
				if (this.anInt3832 > 4096) {
					this.anInt3832 = 4096;
				}
				while (this.anInt3825 > 4096) {
					this.anInt3825 -= 4096;
				}
				if (this.anInt3826 < 0) {
					this.anInt3826 = 0;
				}
				if (this.anInt3826 > 4096) {
					this.anInt3826 = 4096;
				}
				this.method2640(this.anInt3832, this.anInt3825, this.anInt3826);
				local29[local43] = this.anInt3836;
				local37[local43] = this.anInt3827;
				local41[local43] = this.anInt3824;
			}
		}
		return local7;
	}
}
