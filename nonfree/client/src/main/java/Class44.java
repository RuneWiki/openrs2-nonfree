import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class44 {

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	private static final int[] anIntArray233 = new int[32768];

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	private static final int[] anIntArray234;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!hd;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!hd;")
	private Class36 aClass36_2;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!hd;")
	private Class36 aClass36_3;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!hd;")
	private Class36 aClass36_4;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Lclient!hd;")
	private Class36 aClass36_5;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!hd;")
	private Class36 aClass36_6;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Lclient!hd;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!qd;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!hd;")
	private Class36 aClass36_8;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!hd;")
	private Class36 aClass36_9;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	private final int[] anIntArray231 = new int[5];

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private int anInt2052 = 100;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
	private final int[] anIntArray230 = new int[5];

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public int anInt2053 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
	private final int[] anIntArray229 = new int[5];

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt2054 = 500;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	private int anInt2055 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray233[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray234 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray234[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!wa;)V")
	public void method1460(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass36_7 = new Class36();
		this.aClass36_7.method1215(arg0);
		this.aClass36_2 = new Class36();
		this.aClass36_2.method1215(arg0);
		@Pc(21) int local21 = arg0.method1738();
		if (local21 != 0) {
			arg0.anInt2306--;
			this.aClass36_1 = new Class36();
			this.aClass36_1.method1215(arg0);
			this.aClass36_5 = new Class36();
			this.aClass36_5.method1215(arg0);
		}
		local21 = arg0.method1738();
		if (local21 != 0) {
			arg0.anInt2306--;
			this.aClass36_3 = new Class36();
			this.aClass36_3.method1215(arg0);
			this.aClass36_4 = new Class36();
			this.aClass36_4.method1215(arg0);
		}
		local21 = arg0.method1738();
		if (local21 != 0) {
			arg0.anInt2306--;
			this.aClass36_6 = new Class36();
			this.aClass36_6.method1215(arg0);
			this.aClass36_8 = new Class36();
			this.aClass36_8.method1215(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1703();
			if (local114 == 0) {
				break;
			}
			this.anIntArray231[local109] = local114;
			this.anIntArray230[local109] = arg0.method1733();
			this.anIntArray229[local109] = arg0.method1703();
		}
		this.anInt2055 = arg0.method1703();
		this.anInt2052 = arg0.method1703();
		this.anInt2054 = arg0.method1753();
		this.anInt2053 = arg0.method1753();
		this.aClass75_1 = new Class75();
		this.aClass36_9 = new Class36();
		this.aClass75_1.method2670(arg0, this.aClass36_9);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	public int[] method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static217.method2359(Static85.anIntArray232, 0, arg0);
		if (arg1 < 10) {
			return Static85.anIntArray232;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass36_7.method1214();
		this.aClass36_2.method1214();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass36_1 != null) {
			this.aClass36_1.method1214();
			this.aClass36_5.method1214();
			local24 = (int) ((double) (this.aClass36_1.anInt1750 - this.aClass36_1.anInt1751) * 32.768D / local16);
			local26 = (int) ((double) this.aClass36_1.anInt1751 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass36_3 != null) {
			this.aClass36_3.method1214();
			this.aClass36_4.method1214();
			local63 = (int) ((double) (this.aClass36_3.anInt1750 - this.aClass36_3.anInt1751) * 32.768D / local16);
			local65 = (int) ((double) this.aClass36_3.anInt1751 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray231[local102] != 0) {
				Static85.anIntArray237[local102] = 0;
				Static85.anIntArray238[local102] = (int) ((double) this.anIntArray229[local102] * local16);
				Static85.anIntArray235[local102] = (this.anIntArray231[local102] << 14) / 100;
				Static85.anIntArray236[local102] = (int) ((double) (this.aClass36_7.anInt1750 - this.aClass36_7.anInt1751) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray230[local102]) / local16);
				Static85.anIntArray239[local102] = (int) ((double) this.aClass36_7.anInt1751 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass36_7.method1217(arg0);
			local187 = this.aClass36_2.method1217(arg0);
			if (this.aClass36_1 != null) {
				local195 = this.aClass36_1.method1217(arg0);
				local200 = this.aClass36_5.method1217(arg0);
				local182 += this.method1463(local28, local200, this.aClass36_1.anInt1749) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass36_3 != null) {
				local195 = this.aClass36_3.method1217(arg0);
				local200 = this.aClass36_4.method1217(arg0);
				local187 = local187 * ((this.method1463(local67, local200, this.aClass36_3.anInt1749) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray231[local195] != 0) {
					local200 = local176 + Static85.anIntArray238[local195];
					if (local200 < arg0) {
						Static85.anIntArray232[local200] += this.method1463(Static85.anIntArray237[local195], local187 * Static85.anIntArray235[local195] >> 15, this.aClass36_7.anInt1749);
						Static85.anIntArray237[local195] += (local182 * Static85.anIntArray236[local195] >> 16) + Static85.anIntArray239[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass36_6 != null) {
			this.aClass36_6.method1214();
			this.aClass36_8.method1214();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass36_6.method1217(arg0);
				local352 = this.aClass36_8.method1217(arg0);
				if (local339) {
					local187 = this.aClass36_6.anInt1751 + ((this.aClass36_6.anInt1750 - this.aClass36_6.anInt1751) * local347 >> 8);
				} else {
					local187 = this.aClass36_6.anInt1751 + ((this.aClass36_6.anInt1750 - this.aClass36_6.anInt1751) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static85.anIntArray232[local200] = 0;
				}
			}
		}
		if (this.anInt2055 > 0 && this.anInt2052 > 0) {
			local182 = (int) ((double) this.anInt2055 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static85.anIntArray232[local187] += Static85.anIntArray232[local187 - local182] * this.anInt2052 / 100;
			}
		}
		if (this.aClass75_1.anIntArray404[0] > 0 || this.aClass75_1.anIntArray404[1] > 0) {
			this.aClass36_9.method1214();
			local182 = this.aClass36_9.method1217(arg0 + 1);
			local187 = this.aClass75_1.method2669(0, (float) local182 / 65536.0F);
			local195 = this.aClass75_1.method2669(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static85.anIntArray232[local200 + local187] * (long) Static151.anInt3518 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static85.anIntArray232[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static85.anIntArray232[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
					}
					Static85.anIntArray232[local200] = local352;
					local182 = this.aClass36_9.method1217(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static85.anIntArray232[local200 + local187] * (long) Static151.anInt3518 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static85.anIntArray232[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static85.anIntArray232[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
						}
						Static85.anIntArray232[local200] = local352;
						local182 = this.aClass36_9.method1217(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static85.anIntArray232[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray35[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static85.anIntArray232[local200 - local549 - 1] * (long) Static151.anIntArrayArray35[1][local549] >> 16);
							}
							Static85.anIntArray232[local200] = local352;
							this.aClass36_9.method1217(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass75_1.method2669(0, (float) local182 / 65536.0F);
					local195 = this.aClass75_1.method2669(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static85.anIntArray232[local182] < -32768) {
				Static85.anIntArray232[local182] = -32768;
			}
			if (Static85.anIntArray232[local182] > 32767) {
				Static85.anIntArray232[local182] = 32767;
			}
		}
		return Static85.anIntArray232;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	private int method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray234[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray233[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
