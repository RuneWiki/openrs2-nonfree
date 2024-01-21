import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub2_Sub29 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	private int anInt2803;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
	private int anInt2804;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
	private int anInt2808;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
	private int anInt2813;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	private int anInt2812;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
	private int anInt2814;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
	private int anInt2810;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(26) int[][] local26 = this.method2582(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local11[1];
			@Pc(42) int[] local42 = local26[0];
			@Pc(46) int[] local46 = local26[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static149.anInt3233; local52++) {
				this.method1999(local46[local52], local42[local52], local30[local52]);
				this.anInt2806 += this.anInt2814;
				this.anInt2803 += this.anInt2812;
				while (this.anInt2806 < 0) {
					this.anInt2806 += 4096;
				}
				if (this.anInt2803 < 0) {
					this.anInt2803 = 0;
				}
				if (this.anInt2803 > 4096) {
					this.anInt2803 = 4096;
				}
				this.anInt2813 += this.anInt2810;
				if (this.anInt2813 < 0) {
					this.anInt2813 = 0;
				}
				while (this.anInt2806 > 4096) {
					this.anInt2806 -= 4096;
				}
				if (this.anInt2813 > 4096) {
					this.anInt2813 = 4096;
				}
				this.method2001(this.anInt2813, this.anInt2803, this.anInt2806);
				local34[local52] = this.anInt2804;
				local38[local52] = this.anInt2807;
				local50[local52] = this.anInt2808;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	private void method1999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(15) int local15 = arg0 > arg1 ? arg1 : arg0;
		@Pc(34) int local34 = local8 >= arg2 ? local8 : arg2;
		@Pc(45) int local45 = local15 <= arg2 ? local15 : arg2;
		this.anInt2803 = (local34 + local45) / 2;
		@Pc(57) int local57 = local34 - local45;
		if (local57 <= 0) {
			return;
		}
		if (this.anInt2803 > 0 && this.anInt2803 < 4096) {
			this.anInt2813 = (local57 << 12) / (this.anInt2803 > 2048 ? 8192 - (this.anInt2803 * 2) : this.anInt2803 * 2);
		}
		@Pc(104) int local104 = (local34 - arg0 << 12) / local57;
		@Pc(112) int local112 = (local34 - arg1 << 12) / local57;
		@Pc(121) int local121 = (local34 - arg2 << 12) / local57;
		if (arg1 == local34) {
			this.anInt2806 = local45 == arg0 ? local121 + 20480 : -local104 + 4096;
		} else if (arg0 == local34) {
			this.anInt2806 = local45 == arg2 ? local112 + 4096 : -local121 + 12288;
		} else {
			this.anInt2806 = arg1 == local45 ? local104 + 12288 : -local112 + 20480;
		}
		this.anInt2806 /= 6;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2814 = arg1.method1455();
		} else if (arg0 == 1) {
			this.anInt2810 = (arg1.method1463() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2812 = (arg1.method1463() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
	private void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg1 * arg0 >> 12);
		if (local27 <= 0) {
			this.anInt2804 = this.anInt2807 = this.anInt2808 = arg1;
			return;
		}
		@Pc(50) int local50 = arg1 + arg1 - local27;
		@Pc(54) int local54 = arg2 * 6;
		@Pc(63) int local63 = (local27 - local50 << 12) / local27;
		@Pc(69) int local69 = local54 >> 12;
		@Pc(75) int local75 = local27 * local63 >> 12;
		@Pc(82) int local82 = local54 - (local69 << 12);
		@Pc(88) int local88 = local82 * local75 >> 12;
		@Pc(92) int local92 = local27 - local88;
		@Pc(97) int local97 = local50 + local88;
		if (local69 == 0) {
			this.anInt2807 = local97;
			this.anInt2804 = local27;
			this.anInt2808 = local50;
		} else if (local69 == 1) {
			this.anInt2808 = local50;
			this.anInt2804 = local92;
			this.anInt2807 = local27;
		} else if (local69 == 2) {
			this.anInt2804 = local50;
			this.anInt2807 = local27;
			this.anInt2808 = local97;
		} else if (local69 == 3) {
			this.anInt2804 = local50;
			this.anInt2808 = local27;
			this.anInt2807 = local92;
		} else if (local69 == 4) {
			this.anInt2804 = local97;
			this.anInt2807 = local50;
			this.anInt2808 = local27;
		} else if (local69 == 5) {
			this.anInt2804 = local27;
			this.anInt2808 = local92;
			this.anInt2807 = local50;
		}
	}
}
