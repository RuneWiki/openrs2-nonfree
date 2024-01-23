import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class141 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
	private static int[] anIntArray547 = new int[32768];

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "[I")
	private static int[] anIntArray548;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!hd;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!hd;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!hd;")
	private Class68 aClass68_3;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!hd;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!hd;")
	private Class68 aClass68_5;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!hd;")
	private Class68 aClass68_6;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!hd;")
	private Class68 aClass68_7;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!hd;")
	private Class68 aClass68_8;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!af;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "Lclient!hd;")
	private Class68 aClass68_9;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	private int[] anIntArray544 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
	private int[] anIntArray545 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	private int anInt4719 = 100;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public int anInt4720 = 500;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public int anInt4721 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	private int anInt4718 = 0;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
	private int[] anIntArray549 = new int[] { 0, 0, 0, 0, 0 };

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray547[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray548 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray548[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	public int[] method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static300.method490(Static226.anIntArray546, 0, arg0);
		if (arg1 < 10) {
			return Static226.anIntArray546;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass68_8.method1600();
		this.aClass68_4.method1600();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass68_1 != null) {
			this.aClass68_1.method1600();
			this.aClass68_6.method1600();
			local24 = (int) ((double) (this.aClass68_1.anInt1861 - this.aClass68_1.anInt1863) * 32.768D / local16);
			local26 = (int) ((double) this.aClass68_1.anInt1863 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass68_3 != null) {
			this.aClass68_3.method1600();
			this.aClass68_9.method1600();
			local63 = (int) ((double) (this.aClass68_3.anInt1861 - this.aClass68_3.anInt1863) * 32.768D / local16);
			local65 = (int) ((double) this.aClass68_3.anInt1863 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray549[local102] != 0) {
				Static226.anIntArray552[local102] = 0;
				Static226.anIntArray553[local102] = (int) ((double) this.anIntArray545[local102] * local16);
				Static226.anIntArray551[local102] = (this.anIntArray549[local102] << 14) / 100;
				Static226.anIntArray550[local102] = (int) ((double) (this.aClass68_8.anInt1861 - this.aClass68_8.anInt1863) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray544[local102]) / local16);
				Static226.anIntArray554[local102] = (int) ((double) this.aClass68_8.anInt1863 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass68_8.method1599(arg0);
			local190 = this.aClass68_4.method1599(arg0);
			if (this.aClass68_1 != null) {
				local198 = this.aClass68_1.method1599(arg0);
				local203 = this.aClass68_6.method1599(arg0);
				local185 += this.method3608(local28, local203, this.aClass68_1.anInt1862) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass68_3 != null) {
				local198 = this.aClass68_3.method1599(arg0);
				local203 = this.aClass68_9.method1599(arg0);
				local190 = local190 * ((this.method3608(local67, local203, this.aClass68_3.anInt1862) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray549[local198] != 0) {
					local203 = local102 + Static226.anIntArray553[local198];
					if (local203 < arg0) {
						Static226.anIntArray546[local203] += this.method3608(Static226.anIntArray552[local198], local190 * Static226.anIntArray551[local198] >> 15, this.aClass68_8.anInt1862);
						Static226.anIntArray552[local198] += (local185 * Static226.anIntArray550[local198] >> 16) + Static226.anIntArray554[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass68_7 != null) {
			this.aClass68_7.method1600();
			this.aClass68_2.method1600();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass68_7.method1599(arg0);
				local356 = this.aClass68_2.method1599(arg0);
				if (local341) {
					local185 = this.aClass68_7.anInt1863 + ((this.aClass68_7.anInt1861 - this.aClass68_7.anInt1863) * local203 >> 8);
				} else {
					local185 = this.aClass68_7.anInt1863 + ((this.aClass68_7.anInt1861 - this.aClass68_7.anInt1863) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static226.anIntArray546[local198] = 0;
				}
			}
		}
		if (this.anInt4718 > 0 && this.anInt4719 > 0) {
			local102 = (int) ((double) this.anInt4718 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static226.anIntArray546[local185] += Static226.anIntArray546[local185 - local102] * this.anInt4719 / 100;
			}
		}
		if (this.aClass4_1.anIntArray23[0] > 0 || this.aClass4_1.anIntArray23[1] > 0) {
			this.aClass68_5.method1600();
			local102 = this.aClass68_5.method1599(arg0 + 1);
			local185 = this.aClass4_1.method153(0, (float) local102 / 65536.0F);
			local190 = this.aClass4_1.method153(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static226.anIntArray546[local198 + local185] * (long) Static7.anInt205 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static226.anIntArray546[local198 + local185 - local523 - 1] * (long) Static7.anIntArrayArray2[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static226.anIntArray546[local198 - local523 - 1] * (long) Static7.anIntArrayArray2[1][local523] >> 16);
					}
					Static226.anIntArray546[local198] = local356;
					local102 = this.aClass68_5.method1599(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static226.anIntArray546[local198 + local185] * (long) Static7.anInt205 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static226.anIntArray546[local198 + local185 - local523 - 1] * (long) Static7.anIntArrayArray2[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static226.anIntArray546[local198 - local523 - 1] * (long) Static7.anIntArrayArray2[1][local523] >> 16);
						}
						Static226.anIntArray546[local198] = local356;
						local102 = this.aClass68_5.method1599(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static226.anIntArray546[local198 + local185 - local523 - 1] * (long) Static7.anIntArrayArray2[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static226.anIntArray546[local198 - local523 - 1] * (long) Static7.anIntArrayArray2[1][local523] >> 16);
							}
							Static226.anIntArray546[local198] = local356;
							this.aClass68_5.method1599(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass4_1.method153(0, (float) local102 / 65536.0F);
					local190 = this.aClass4_1.method153(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static226.anIntArray546[local102] < -32768) {
				Static226.anIntArray546[local102] = -32768;
			}
			if (Static226.anIntArray546[local102] > 32767) {
				Static226.anIntArray546[local102] = 32767;
			}
		}
		return Static226.anIntArray546;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jj;)V")
	public void method3607(@OriginalArg(0) Class1_Sub18 arg0) {
		this.aClass68_8 = new Class68();
		this.aClass68_8.method1601(arg0);
		this.aClass68_4 = new Class68();
		this.aClass68_4.method1601(arg0);
		@Pc(21) int local21 = arg0.method3122();
		if (local21 != 0) {
			arg0.anInt3911--;
			this.aClass68_1 = new Class68();
			this.aClass68_1.method1601(arg0);
			this.aClass68_6 = new Class68();
			this.aClass68_6.method1601(arg0);
		}
		local21 = arg0.method3122();
		if (local21 != 0) {
			arg0.anInt3911--;
			this.aClass68_3 = new Class68();
			this.aClass68_3.method1601(arg0);
			this.aClass68_9 = new Class68();
			this.aClass68_9.method1601(arg0);
		}
		local21 = arg0.method3122();
		if (local21 != 0) {
			arg0.anInt3911--;
			this.aClass68_7 = new Class68();
			this.aClass68_7.method1601(arg0);
			this.aClass68_2 = new Class68();
			this.aClass68_2.method1601(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method3117();
			if (local116 == 0) {
				break;
			}
			this.anIntArray549[local109] = local116;
			this.anIntArray544[local109] = arg0.method3081();
			this.anIntArray545[local109] = arg0.method3117();
		}
		this.anInt4718 = arg0.method3117();
		this.anInt4719 = arg0.method3117();
		this.anInt4720 = arg0.method3107();
		this.anInt4721 = arg0.method3107();
		this.aClass4_1 = new Class4();
		this.aClass68_5 = new Class68();
		this.aClass4_1.method154(arg0, this.aClass68_5);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	private int method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray548[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray547[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
