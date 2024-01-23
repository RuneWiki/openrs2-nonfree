import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class95 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
	private static int[] anIntArray716 = new int[32768];

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
	private static int[] anIntArray714;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Lclient!ff;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!ff;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!ff;")
	private Class38 aClass38_3;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!ff;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!ff;")
	private Class38 aClass38_5;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!ff;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!ff;")
	private Class38 aClass38_7;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!ra;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!ff;")
	private Class38 aClass38_8;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!ff;")
	private Class38 aClass38_9;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public int anInt4472 = 500;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
	private int[] anIntArray715 = new int[5];

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	public int anInt4473 = 0;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
	private int[] anIntArray717 = new int[5];

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private int anInt4474 = 100;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
	private int[] anIntArray713 = new int[5];

	@OriginalMember(owner = "client!th", name = "t", descriptor = "I")
	private int anInt4475 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray716[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray714 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray714[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I")
	private int method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray714[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray716[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!nh;)V")
	public void method3549(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass38_1 = new Class38();
		this.aClass38_1.method977(arg0);
		this.aClass38_2 = new Class38();
		this.aClass38_2.method977(arg0);
		@Pc(21) int local21 = arg0.method2122();
		if (local21 != 0) {
			arg0.anInt2703--;
			this.aClass38_7 = new Class38();
			this.aClass38_7.method977(arg0);
			this.aClass38_4 = new Class38();
			this.aClass38_4.method977(arg0);
		}
		local21 = arg0.method2122();
		if (local21 != 0) {
			arg0.anInt2703--;
			this.aClass38_3 = new Class38();
			this.aClass38_3.method977(arg0);
			this.aClass38_9 = new Class38();
			this.aClass38_9.method977(arg0);
		}
		local21 = arg0.method2122();
		if (local21 != 0) {
			arg0.anInt2703--;
			this.aClass38_6 = new Class38();
			this.aClass38_6.method977(arg0);
			this.aClass38_5 = new Class38();
			this.aClass38_5.method977(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2111();
			if (local114 == 0) {
				break;
			}
			this.anIntArray715[local109] = local114;
			this.anIntArray717[local109] = arg0.method2135();
			this.anIntArray713[local109] = arg0.method2111();
		}
		this.anInt4475 = arg0.method2111();
		this.anInt4474 = arg0.method2111();
		this.anInt4472 = arg0.method2095();
		this.anInt4473 = arg0.method2095();
		this.aClass81_1 = new Class81();
		this.aClass38_8 = new Class38();
		this.aClass81_1.method3144(arg0, this.aClass38_8);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	public int[] method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static231.method2213(Static197.anIntArray718, 0, arg0);
		if (arg1 < 10) {
			return Static197.anIntArray718;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass38_1.method978();
		this.aClass38_2.method978();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass38_7 != null) {
			this.aClass38_7.method978();
			this.aClass38_4.method978();
			local24 = (int) ((double) (this.aClass38_7.anInt1188 - this.aClass38_7.anInt1189) * 32.768D / local16);
			local26 = (int) ((double) this.aClass38_7.anInt1189 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass38_3 != null) {
			this.aClass38_3.method978();
			this.aClass38_9.method978();
			local63 = (int) ((double) (this.aClass38_3.anInt1188 - this.aClass38_3.anInt1189) * 32.768D / local16);
			local65 = (int) ((double) this.aClass38_3.anInt1189 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray715[local102] != 0) {
				Static197.anIntArray722[local102] = 0;
				Static197.anIntArray721[local102] = (int) ((double) this.anIntArray713[local102] * local16);
				Static197.anIntArray723[local102] = (this.anIntArray715[local102] << 14) / 100;
				Static197.anIntArray720[local102] = (int) ((double) (this.aClass38_1.anInt1188 - this.aClass38_1.anInt1189) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray717[local102]) / local16);
				Static197.anIntArray719[local102] = (int) ((double) this.aClass38_1.anInt1189 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass38_1.method975(arg0);
			local187 = this.aClass38_2.method975(arg0);
			if (this.aClass38_7 != null) {
				local195 = this.aClass38_7.method975(arg0);
				local200 = this.aClass38_4.method975(arg0);
				local182 += this.method3548(local28, local200, this.aClass38_7.anInt1191) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass38_3 != null) {
				local195 = this.aClass38_3.method975(arg0);
				local200 = this.aClass38_9.method975(arg0);
				local187 = local187 * ((this.method3548(local67, local200, this.aClass38_3.anInt1191) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray715[local195] != 0) {
					local200 = local176 + Static197.anIntArray721[local195];
					if (local200 < arg0) {
						Static197.anIntArray718[local200] += this.method3548(Static197.anIntArray722[local195], local187 * Static197.anIntArray723[local195] >> 15, this.aClass38_1.anInt1191);
						Static197.anIntArray722[local195] += (local182 * Static197.anIntArray720[local195] >> 16) + Static197.anIntArray719[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass38_6 != null) {
			this.aClass38_6.method978();
			this.aClass38_5.method978();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass38_6.method975(arg0);
				local352 = this.aClass38_5.method975(arg0);
				if (local339) {
					local187 = this.aClass38_6.anInt1189 + ((this.aClass38_6.anInt1188 - this.aClass38_6.anInt1189) * local347 >> 8);
				} else {
					local187 = this.aClass38_6.anInt1189 + ((this.aClass38_6.anInt1188 - this.aClass38_6.anInt1189) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static197.anIntArray718[local200] = 0;
				}
			}
		}
		if (this.anInt4475 > 0 && this.anInt4474 > 0) {
			local182 = (int) ((double) this.anInt4475 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static197.anIntArray718[local187] += Static197.anIntArray718[local187 - local182] * this.anInt4474 / 100;
			}
		}
		if (this.aClass81_1.anIntArray654[0] > 0 || this.aClass81_1.anIntArray654[1] > 0) {
			this.aClass38_8.method978();
			local182 = this.aClass38_8.method975(arg0 + 1);
			local187 = this.aClass81_1.method3147(0, (float) local182 / 65536.0F);
			local195 = this.aClass81_1.method3147(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static197.anIntArray718[local200 + local187] * (long) Static172.anInt3978 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static197.anIntArray718[local200 + local187 - local519 - 1] * (long) Static172.anIntArrayArray37[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static197.anIntArray718[local200 - local549 - 1] * (long) Static172.anIntArrayArray37[1][local549] >> 16);
					}
					Static197.anIntArray718[local200] = local352;
					local182 = this.aClass38_8.method975(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static197.anIntArray718[local200 + local187] * (long) Static172.anInt3978 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static197.anIntArray718[local200 + local187 - local519 - 1] * (long) Static172.anIntArrayArray37[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static197.anIntArray718[local200 - local549 - 1] * (long) Static172.anIntArrayArray37[1][local549] >> 16);
						}
						Static197.anIntArray718[local200] = local352;
						local182 = this.aClass38_8.method975(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static197.anIntArray718[local200 + local187 - local519 - 1] * (long) Static172.anIntArrayArray37[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static197.anIntArray718[local200 - local549 - 1] * (long) Static172.anIntArrayArray37[1][local549] >> 16);
							}
							Static197.anIntArray718[local200] = local352;
							this.aClass38_8.method975(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass81_1.method3147(0, (float) local182 / 65536.0F);
					local195 = this.aClass81_1.method3147(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static197.anIntArray718[local182] < -32768) {
				Static197.anIntArray718[local182] = -32768;
			}
			if (Static197.anIntArray718[local182] > 32767) {
				Static197.anIntArray718[local182] = 32767;
			}
		}
		return Static197.anIntArray718;
	}
}
