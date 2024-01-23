import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	private int anInt1896;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	private int anInt1897;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	private int anInt1899;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	private int anInt1901;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
	private int anInt1903;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
	private int anInt1908 = 0;

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
	private int anInt1907 = 0;

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
	private int anInt1909 = 0;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIB)V")
	private void method1529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(22) int local22 = arg2 < arg1 ? arg1 : arg2;
		@Pc(33) int local33 = arg0 <= local22 ? local22 : arg0;
		@Pc(44) int local44 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(55) int local55 = local44 > arg0 ? arg0 : local44;
		this.anInt1901 = (local55 + local33) / 2;
		@Pc(67) int local67 = local33 - local55;
		if (this.anInt1901 > 0 && this.anInt1901 < 4096) {
			this.anInt1902 = (local67 << 12) / (this.anInt1901 <= 2048 ? this.anInt1901 * 2 : 8192 - (this.anInt1901 * 2));
		} else {
			this.anInt1902 = 0;
		}
		if (local67 <= 0) {
			this.anInt1896 = 0;
			return;
		}
		@Pc(118) int local118 = (local33 - arg1 << 12) / local67;
		@Pc(127) int local127 = (local33 - arg0 << 12) / local67;
		@Pc(136) int local136 = (local33 - arg2 << 12) / local67;
		if (local33 == arg1) {
			this.anInt1896 = local55 == arg2 ? local127 + 20480 : -local136 + 4096;
		} else if (arg2 == local33) {
			this.anInt1896 = arg0 == local55 ? local118 + 4096 : 12288 - local127;
		} else {
			this.anInt1896 = arg1 == local55 ? local136 + 12288 : -local118 + 20480;
		}
		this.anInt1896 /= 6;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(30) int[][] local30 = this.method4575(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static299.anInt5670; local56++) {
				this.method1529(local42[local56], local34[local56], local38[local56]);
				this.anInt1902 += this.anInt1909;
				for (this.anInt1896 += this.anInt1907; this.anInt1896 < 0; this.anInt1896 += 4096) {
				}
				this.anInt1901 += this.anInt1908;
				if (this.anInt1902 < 0) {
					this.anInt1902 = 0;
				}
				if (this.anInt1902 > 4096) {
					this.anInt1902 = 4096;
				}
				if (this.anInt1901 < 0) {
					this.anInt1901 = 0;
				}
				while (this.anInt1896 > 4096) {
					this.anInt1896 -= 4096;
				}
				if (this.anInt1901 > 4096) {
					this.anInt1901 = 4096;
				}
				this.method1531(this.anInt1902, this.anInt1896, this.anInt1901);
				local46[local56] = this.anInt1899;
				local50[local56] = this.anInt1897;
				local54[local56] = this.anInt1903;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1907 = arg0.method2623();
		} else if (arg1 == 1) {
			this.anInt1909 = (arg0.method2598() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1908 = (arg0.method2598() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BIII)V")
	private void method1531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(38) int local38 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (arg0 + 4096) * arg2 >> 12;
		if (local38 <= 0) {
			this.anInt1899 = this.anInt1897 = this.anInt1903 = arg2;
			return;
		}
		@Pc(47) int local47 = arg1 * 6;
		@Pc(53) int local53 = arg2 + arg2 - local38;
		@Pc(62) int local62 = (local38 - local53 << 12) / local38;
		@Pc(66) int local66 = local47 >> 12;
		@Pc(73) int local73 = local47 - (local66 << 12);
		@Pc(81) int local81 = local62 * local38 >> 12;
		@Pc(87) int local87 = local81 * local73 >> 12;
		@Pc(92) int local92 = local38 - local87;
		@Pc(96) int local96 = local87 + local53;
		if (local66 == 0) {
			this.anInt1897 = local96;
			this.anInt1903 = local53;
			this.anInt1899 = local38;
		} else if (local66 == 1) {
			this.anInt1899 = local92;
			this.anInt1897 = local38;
			this.anInt1903 = local53;
		} else if (local66 == 2) {
			this.anInt1899 = local53;
			this.anInt1903 = local96;
			this.anInt1897 = local38;
		} else if (local66 == 3) {
			this.anInt1897 = local92;
			this.anInt1899 = local53;
			this.anInt1903 = local38;
		} else if (local66 == 4) {
			this.anInt1903 = local38;
			this.anInt1897 = local53;
			this.anInt1899 = local96;
		} else if (local66 == 5) {
			this.anInt1899 = local38;
			this.anInt1903 = local92;
			this.anInt1897 = local53;
		}
	}
}
