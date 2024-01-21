import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
	private int anInt2745;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	private int anInt2747;

	@OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
	private int anInt2749;

	@OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
	private int anInt2750;

	@OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
	private int anInt2754;

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
	private int anInt2755;

	@OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
	private int anInt2752;

	@OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
	private int anInt2757;

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2757 = arg1.method1627();
		} else if (arg0 == 1) {
			this.anInt2758 = (arg1.method1611() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2752 = (arg1.method1611() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(IIII)V")
	private void method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(33) int local33 = arg0 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local33 <= 0) {
			this.anInt2755 = this.anInt2754 = this.anInt2745 = arg0;
			return;
		}
		@Pc(52) int local52 = arg1 * 6;
		@Pc(59) int local59 = arg0 + arg0 - local33;
		@Pc(68) int local68 = (local33 - local59 << 12) / local33;
		@Pc(72) int local72 = local52 >> 12;
		@Pc(78) int local78 = local52 - (local72 << 12);
		@Pc(86) int local86 = local68 * local33 >> 12;
		@Pc(92) int local92 = local86 * local78 >> 12;
		@Pc(97) int local97 = local33 - local92;
		@Pc(102) int local102 = local59 + local92;
		if (local72 == 0) {
			this.anInt2755 = local33;
			this.anInt2754 = local102;
			this.anInt2745 = local59;
		} else if (local72 == 1) {
			this.anInt2745 = local59;
			this.anInt2754 = local33;
			this.anInt2755 = local97;
		} else if (local72 == 2) {
			this.anInt2755 = local59;
			this.anInt2745 = local102;
			this.anInt2754 = local33;
		} else if (local72 == 3) {
			this.anInt2755 = local59;
			this.anInt2745 = local33;
			this.anInt2754 = local97;
		} else if (local72 == 4) {
			this.anInt2754 = local59;
			this.anInt2755 = local102;
			this.anInt2745 = local33;
		} else if (local72 == 5) {
			this.anInt2754 = local59;
			this.anInt2755 = local33;
			this.anInt2745 = local97;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(IIII)V")
	private void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg0 > arg2 ? arg2 : arg0;
		@Pc(27) int local27 = arg2 > arg0 ? arg2 : arg0;
		@Pc(34) int local34 = local16 <= arg1 ? local16 : arg1;
		@Pc(45) int local45 = arg1 <= local27 ? local27 : arg1;
		@Pc(49) int local49 = local45 - local34;
		this.anInt2749 = (local34 + local45) / 2;
		if (local49 <= 0) {
			return;
		}
		if (this.anInt2749 > 0 && this.anInt2749 < 4096) {
			this.anInt2750 = (local49 << 12) / (this.anInt2749 <= 2048 ? this.anInt2749 * 2 : 8192 - this.anInt2749 * 2);
		}
		@Pc(104) int local104 = (local45 - arg2 << 12) / local49;
		@Pc(113) int local113 = (local45 - arg0 << 12) / local49;
		@Pc(122) int local122 = (local45 - arg1 << 12) / local49;
		if (local45 == arg2) {
			this.anInt2747 = arg0 == local34 ? local122 + 20480 : -local113 + 4096;
		} else if (arg0 == local45) {
			this.anInt2747 = local34 == arg1 ? local104 + 4096 : -local122 + 12288;
		} else {
			this.anInt2747 = local34 == arg2 ? local113 + 12288 : -local104 + 20480;
		}
		this.anInt2747 /= 6;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[][] local26 = this.method3013(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local7[0];
			@Pc(42) int[] local42 = local7[1];
			@Pc(46) int[] local46 = local7[2];
			@Pc(50) int[] local50 = local26[2];
			for (@Pc(52) int local52 = 0; local52 < Static65.anInt1933; local52++) {
				this.method1977(local34[local52], local50[local52], local30[local52]);
				for (this.anInt2747 += this.anInt2757; this.anInt2747 < 0; this.anInt2747 += 4096) {
				}
				while (this.anInt2747 > 4096) {
					this.anInt2747 -= 4096;
				}
				this.anInt2750 += this.anInt2758;
				if (this.anInt2750 < 0) {
					this.anInt2750 = 0;
				}
				if (this.anInt2750 > 4096) {
					this.anInt2750 = 4096;
				}
				this.anInt2749 += this.anInt2752;
				if (this.anInt2749 < 0) {
					this.anInt2749 = 0;
				}
				if (this.anInt2749 > 4096) {
					this.anInt2749 = 4096;
				}
				this.method1975(this.anInt2749, this.anInt2747, this.anInt2750);
				local38[local52] = this.anInt2755;
				local42[local52] = this.anInt2754;
				local46[local52] = this.anInt2745;
			}
		}
		return local7;
	}
}
