import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class193 {

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
	private static final int[] anIntArray492 = new int[32768];

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[I")
	private static final int[] anIntArray490;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!jh;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!mq;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!jh;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Lclient!jh;")
	private Class97 aClass97_3;

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!jh;")
	private Class97 aClass97_4;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "Lclient!jh;")
	private Class97 aClass97_5;

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "Lclient!jh;")
	private Class97 aClass97_6;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "Lclient!jh;")
	private Class97 aClass97_7;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "Lclient!jh;")
	private Class97 aClass97_8;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "Lclient!jh;")
	private Class97 aClass97_9;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
	private final int[] anIntArray489 = new int[5];

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public int anInt5910 = 0;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public int anInt5909 = 500;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
	private final int[] anIntArray488 = new int[5];

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
	private int anInt5911 = 0;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
	private int anInt5912 = 100;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "[I")
	private final int[] anIntArray493 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray492[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray490 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray490[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[I")
	public int[] method5247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static359.method757(Static308.anIntArray491, 0, arg0);
		if (arg1 < 10) {
			return Static308.anIntArray491;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass97_5.method2726();
		this.aClass97_6.method2726();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass97_9 != null) {
			this.aClass97_9.method2726();
			this.aClass97_2.method2726();
			local24 = (int) ((double) (this.aClass97_9.anInt2983 - this.aClass97_9.anInt2981) * 32.768D / local16);
			local26 = (int) ((double) this.aClass97_9.anInt2981 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass97_4 != null) {
			this.aClass97_4.method2726();
			this.aClass97_7.method2726();
			local63 = (int) ((double) (this.aClass97_4.anInt2983 - this.aClass97_4.anInt2981) * 32.768D / local16);
			local65 = (int) ((double) this.aClass97_4.anInt2981 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray493[local102] != 0) {
				Static308.anIntArray498[local102] = 0;
				Static308.anIntArray495[local102] = (int) ((double) this.anIntArray488[local102] * local16);
				Static308.anIntArray497[local102] = (this.anIntArray493[local102] << 14) / 100;
				Static308.anIntArray494[local102] = (int) ((double) (this.aClass97_5.anInt2983 - this.aClass97_5.anInt2981) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray489[local102]) / local16);
				Static308.anIntArray496[local102] = (int) ((double) this.aClass97_5.anInt2981 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass97_5.method2724(arg0);
			local187 = this.aClass97_6.method2724(arg0);
			if (this.aClass97_9 != null) {
				local195 = this.aClass97_9.method2724(arg0);
				local200 = this.aClass97_2.method2724(arg0);
				local182 += this.method5248(local28, local200, this.aClass97_9.anInt2982) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass97_4 != null) {
				local195 = this.aClass97_4.method2724(arg0);
				local200 = this.aClass97_7.method2724(arg0);
				local187 = local187 * ((this.method5248(local67, local200, this.aClass97_4.anInt2982) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray493[local195] != 0) {
					local200 = local176 + Static308.anIntArray495[local195];
					if (local200 < arg0) {
						Static308.anIntArray491[local200] += this.method5248(Static308.anIntArray498[local195], local187 * Static308.anIntArray497[local195] >> 15, this.aClass97_5.anInt2982);
						Static308.anIntArray498[local195] += (local182 * Static308.anIntArray494[local195] >> 16) + Static308.anIntArray496[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass97_3 != null) {
			this.aClass97_3.method2726();
			this.aClass97_8.method2726();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass97_3.method2724(arg0);
				local352 = this.aClass97_8.method2724(arg0);
				if (local339) {
					local187 = this.aClass97_3.anInt2981 + ((this.aClass97_3.anInt2983 - this.aClass97_3.anInt2981) * local347 >> 8);
				} else {
					local187 = this.aClass97_3.anInt2981 + ((this.aClass97_3.anInt2983 - this.aClass97_3.anInt2981) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static308.anIntArray491[local200] = 0;
				}
			}
		}
		if (this.anInt5911 > 0 && this.anInt5912 > 0) {
			local182 = (int) ((double) this.anInt5911 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static308.anIntArray491[local187] += Static308.anIntArray491[local187 - local182] * this.anInt5912 / 100;
			}
		}
		if (this.aClass133_1.anIntArray280[0] > 0 || this.aClass133_1.anIntArray280[1] > 0) {
			this.aClass97_1.method2726();
			local182 = this.aClass97_1.method2724(arg0 + 1);
			local187 = this.aClass133_1.method3523(0, (float) local182 / 65536.0F);
			local195 = this.aClass133_1.method3523(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static308.anIntArray491[local200 + local187] * (long) Static198.anInt3854 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static308.anIntArray491[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray32[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static308.anIntArray491[local200 - local549 - 1] * (long) Static198.anIntArrayArray32[1][local549] >> 16);
					}
					Static308.anIntArray491[local200] = local352;
					local182 = this.aClass97_1.method2724(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static308.anIntArray491[local200 + local187] * (long) Static198.anInt3854 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static308.anIntArray491[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray32[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static308.anIntArray491[local200 - local549 - 1] * (long) Static198.anIntArrayArray32[1][local549] >> 16);
						}
						Static308.anIntArray491[local200] = local352;
						local182 = this.aClass97_1.method2724(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static308.anIntArray491[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray32[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static308.anIntArray491[local200 - local549 - 1] * (long) Static198.anIntArrayArray32[1][local549] >> 16);
							}
							Static308.anIntArray491[local200] = local352;
							this.aClass97_1.method2724(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass133_1.method3523(0, (float) local182 / 65536.0F);
					local195 = this.aClass133_1.method3523(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static308.anIntArray491[local182] < -32768) {
				Static308.anIntArray491[local182] = -32768;
			}
			if (Static308.anIntArray491[local182] > 32767) {
				Static308.anIntArray491[local182] = 32767;
			}
		}
		return Static308.anIntArray491;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	private int method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray490[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray492[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!bk;)V")
	public void method5249(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass97_5 = new Class97();
		this.aClass97_5.method2725(arg0);
		this.aClass97_6 = new Class97();
		this.aClass97_6.method2725(arg0);
		@Pc(21) int local21 = arg0.method1832();
		if (local21 != 0) {
			arg0.anInt2029--;
			this.aClass97_9 = new Class97();
			this.aClass97_9.method2725(arg0);
			this.aClass97_2 = new Class97();
			this.aClass97_2.method2725(arg0);
		}
		local21 = arg0.method1832();
		if (local21 != 0) {
			arg0.anInt2029--;
			this.aClass97_4 = new Class97();
			this.aClass97_4.method2725(arg0);
			this.aClass97_7 = new Class97();
			this.aClass97_7.method2725(arg0);
		}
		local21 = arg0.method1832();
		if (local21 != 0) {
			arg0.anInt2029--;
			this.aClass97_3 = new Class97();
			this.aClass97_3.method2725(arg0);
			this.aClass97_8 = new Class97();
			this.aClass97_8.method2725(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1866();
			if (local114 == 0) {
				break;
			}
			this.anIntArray493[local109] = local114;
			this.anIntArray489[local109] = arg0.method1854();
			this.anIntArray488[local109] = arg0.method1866();
		}
		this.anInt5911 = arg0.method1866();
		this.anInt5912 = arg0.method1866();
		this.anInt5909 = arg0.method1845();
		this.anInt5910 = arg0.method1845();
		this.aClass133_1 = new Class133();
		this.aClass97_1 = new Class97();
		this.aClass133_1.method3521(arg0, this.aClass97_1);
	}
}
