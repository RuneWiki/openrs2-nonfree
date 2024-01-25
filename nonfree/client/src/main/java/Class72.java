import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class72 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	private static final int[] anIntArray238 = new int[32768];

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
	private static final int[] anIntArray239;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!re;")
	private Class214 aClass214_1;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!hf;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!re;")
	private Class214 aClass214_2;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!re;")
	private Class214 aClass214_3;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!re;")
	private Class214 aClass214_4;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Lclient!re;")
	private Class214 aClass214_5;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!re;")
	private Class214 aClass214_6;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!re;")
	private Class214 aClass214_7;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!re;")
	private Class214 aClass214_8;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "Lclient!re;")
	private Class214 aClass214_9;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	private final int[] anIntArray237 = new int[5];

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public int anInt2270 = 500;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
	private final int[] anIntArray240 = new int[5];

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	private int anInt2268 = 0;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "[I")
	private final int[] anIntArray241 = new int[5];

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public int anInt2269 = 0;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	private int anInt2271 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray238[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray239 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray239[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)I")
	private int method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray239[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray238[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	public int[] method1634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static469.method6016(Static95.anIntArray242, 0, arg0);
		if (arg1 < 10) {
			return Static95.anIntArray242;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass214_6.method4903();
		this.aClass214_5.method4903();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass214_1 != null) {
			this.aClass214_1.method4903();
			this.aClass214_4.method4903();
			local24 = (int) ((double) (this.aClass214_1.anInt6396 - this.aClass214_1.anInt6393) * 32.768D / local16);
			local26 = (int) ((double) this.aClass214_1.anInt6393 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass214_8 != null) {
			this.aClass214_8.method4903();
			this.aClass214_9.method4903();
			local63 = (int) ((double) (this.aClass214_8.anInt6396 - this.aClass214_8.anInt6393) * 32.768D / local16);
			local65 = (int) ((double) this.aClass214_8.anInt6393 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray240[local102] != 0) {
				Static95.anIntArray247[local102] = 0;
				Static95.anIntArray244[local102] = (int) ((double) this.anIntArray241[local102] * local16);
				Static95.anIntArray246[local102] = (this.anIntArray240[local102] << 14) / 100;
				Static95.anIntArray243[local102] = (int) ((double) (this.aClass214_6.anInt6396 - this.aClass214_6.anInt6393) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray237[local102]) / local16);
				Static95.anIntArray245[local102] = (int) ((double) this.aClass214_6.anInt6393 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass214_6.method4904(arg0);
			local187 = this.aClass214_5.method4904(arg0);
			if (this.aClass214_1 != null) {
				local195 = this.aClass214_1.method4904(arg0);
				local200 = this.aClass214_4.method4904(arg0);
				local182 += this.method1633(local28, local200, this.aClass214_1.anInt6395) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass214_8 != null) {
				local195 = this.aClass214_8.method4904(arg0);
				local200 = this.aClass214_9.method4904(arg0);
				local187 = local187 * ((this.method1633(local67, local200, this.aClass214_8.anInt6395) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray240[local195] != 0) {
					local200 = local176 + Static95.anIntArray244[local195];
					if (local200 < arg0) {
						Static95.anIntArray242[local200] += this.method1633(Static95.anIntArray247[local195], local187 * Static95.anIntArray246[local195] >> 15, this.aClass214_6.anInt6395);
						Static95.anIntArray247[local195] += (local182 * Static95.anIntArray243[local195] >> 16) + Static95.anIntArray245[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass214_7 != null) {
			this.aClass214_7.method4903();
			this.aClass214_2.method4903();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass214_7.method4904(arg0);
				local352 = this.aClass214_2.method4904(arg0);
				if (local339) {
					local187 = this.aClass214_7.anInt6393 + ((this.aClass214_7.anInt6396 - this.aClass214_7.anInt6393) * local347 >> 8);
				} else {
					local187 = this.aClass214_7.anInt6393 + ((this.aClass214_7.anInt6396 - this.aClass214_7.anInt6393) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static95.anIntArray242[local200] = 0;
				}
			}
		}
		if (this.anInt2268 > 0 && this.anInt2271 > 0) {
			local182 = (int) ((double) this.anInt2268 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static95.anIntArray242[local187] += Static95.anIntArray242[local187 - local182] * this.anInt2271 / 100;
			}
		}
		if (this.aClass105_1.anIntArray329[0] > 0 || this.aClass105_1.anIntArray329[1] > 0) {
			this.aClass214_3.method4903();
			local182 = this.aClass214_3.method4904(arg0 + 1);
			local187 = this.aClass105_1.method2381(0, (float) local182 / 65536.0F);
			local195 = this.aClass105_1.method2381(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static95.anIntArray242[local200 + local187] * (long) Static151.anInt3210 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static95.anIntArray242[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray31[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static95.anIntArray242[local200 - local549 - 1] * (long) Static151.anIntArrayArray31[1][local549] >> 16);
					}
					Static95.anIntArray242[local200] = local352;
					local182 = this.aClass214_3.method4904(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static95.anIntArray242[local200 + local187] * (long) Static151.anInt3210 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static95.anIntArray242[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray31[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static95.anIntArray242[local200 - local549 - 1] * (long) Static151.anIntArrayArray31[1][local549] >> 16);
						}
						Static95.anIntArray242[local200] = local352;
						local182 = this.aClass214_3.method4904(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static95.anIntArray242[local200 + local187 - local519 - 1] * (long) Static151.anIntArrayArray31[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static95.anIntArray242[local200 - local549 - 1] * (long) Static151.anIntArrayArray31[1][local549] >> 16);
							}
							Static95.anIntArray242[local200] = local352;
							this.aClass214_3.method4904(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass105_1.method2381(0, (float) local182 / 65536.0F);
					local195 = this.aClass105_1.method2381(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static95.anIntArray242[local182] < -32768) {
				Static95.anIntArray242[local182] = -32768;
			}
			if (Static95.anIntArray242[local182] > 32767) {
				Static95.anIntArray242[local182] = 32767;
			}
		}
		return Static95.anIntArray242;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!ia;)V")
	public void method1635(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass214_6 = new Class214();
		this.aClass214_6.method4906(arg0);
		this.aClass214_5 = new Class214();
		this.aClass214_5.method4906(arg0);
		@Pc(21) int local21 = arg0.method1171();
		if (local21 != 0) {
			arg0.anInt1710--;
			this.aClass214_1 = new Class214();
			this.aClass214_1.method4906(arg0);
			this.aClass214_4 = new Class214();
			this.aClass214_4.method4906(arg0);
		}
		local21 = arg0.method1171();
		if (local21 != 0) {
			arg0.anInt1710--;
			this.aClass214_8 = new Class214();
			this.aClass214_8.method4906(arg0);
			this.aClass214_9 = new Class214();
			this.aClass214_9.method4906(arg0);
		}
		local21 = arg0.method1171();
		if (local21 != 0) {
			arg0.anInt1710--;
			this.aClass214_7 = new Class214();
			this.aClass214_7.method4906(arg0);
			this.aClass214_2 = new Class214();
			this.aClass214_2.method4906(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1168();
			if (local114 == 0) {
				break;
			}
			this.anIntArray240[local109] = local114;
			this.anIntArray237[local109] = arg0.method1182();
			this.anIntArray241[local109] = arg0.method1168();
		}
		this.anInt2268 = arg0.method1168();
		this.anInt2271 = arg0.method1168();
		this.anInt2270 = arg0.method1177();
		this.anInt2269 = arg0.method1177();
		this.aClass105_1 = new Class105();
		this.aClass214_3 = new Class214();
		this.aClass105_1.method2382(arg0, this.aClass214_3);
	}
}
