import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class95 {

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
	private static final int[] anIntArray387 = new int[32768];

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "[I")
	private static final int[] anIntArray389;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!ja;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!ja;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!ja;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!ja;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!ja;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Lclient!cd;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!ja;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!ja;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!ja;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!ja;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
	private final int[] anIntArray384 = new int[5];

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "[I")
	private final int[] anIntArray388 = new int[5];

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public int anInt3747 = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "[I")
	private final int[] anIntArray386 = new int[5];

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
	private int anInt3749 = 100;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	private int anInt3748 = 0;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public int anInt3750 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray387[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray389 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray389[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ce;)V")
	public void method2817(@OriginalArg(0) Class5_Sub6 arg0) {
		this.aClass45_8 = new Class45();
		this.aClass45_8.method1462(arg0);
		this.aClass45_5 = new Class45();
		this.aClass45_5.method1462(arg0);
		@Pc(21) int local21 = arg0.method3062();
		if (local21 != 0) {
			arg0.anInt4050--;
			this.aClass45_7 = new Class45();
			this.aClass45_7.method1462(arg0);
			this.aClass45_3 = new Class45();
			this.aClass45_3.method1462(arg0);
		}
		local21 = arg0.method3062();
		if (local21 != 0) {
			arg0.anInt4050--;
			this.aClass45_9 = new Class45();
			this.aClass45_9.method1462(arg0);
			this.aClass45_2 = new Class45();
			this.aClass45_2.method1462(arg0);
		}
		local21 = arg0.method3062();
		if (local21 != 0) {
			arg0.anInt4050--;
			this.aClass45_1 = new Class45();
			this.aClass45_1.method1462(arg0);
			this.aClass45_4 = new Class45();
			this.aClass45_4.method1462(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3033();
			if (local114 == 0) {
				break;
			}
			this.anIntArray384[local109] = local114;
			this.anIntArray386[local109] = arg0.method3060();
			this.anIntArray388[local109] = arg0.method3033();
		}
		this.anInt3748 = arg0.method3033();
		this.anInt3749 = arg0.method3033();
		this.anInt3750 = arg0.method3077();
		this.anInt3747 = arg0.method3077();
		this.aClass16_1 = new Class16();
		this.aClass45_6 = new Class45();
		this.aClass16_1.method334(arg0, this.aClass45_6);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	private int method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray389[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray387[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	public int[] method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static220.method49(Static187.anIntArray385, 0, arg0);
		if (arg1 < 10) {
			return Static187.anIntArray385;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass45_8.method1461();
		this.aClass45_5.method1461();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass45_7 != null) {
			this.aClass45_7.method1461();
			this.aClass45_3.method1461();
			local24 = (int) ((double) (this.aClass45_7.anInt1882 - this.aClass45_7.anInt1884) * 32.768D / local16);
			local26 = (int) ((double) this.aClass45_7.anInt1884 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass45_9 != null) {
			this.aClass45_9.method1461();
			this.aClass45_2.method1461();
			local63 = (int) ((double) (this.aClass45_9.anInt1882 - this.aClass45_9.anInt1884) * 32.768D / local16);
			local65 = (int) ((double) this.aClass45_9.anInt1884 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray384[local102] != 0) {
				Static187.anIntArray391[local102] = 0;
				Static187.anIntArray390[local102] = (int) ((double) this.anIntArray388[local102] * local16);
				Static187.anIntArray393[local102] = (this.anIntArray384[local102] << 14) / 100;
				Static187.anIntArray394[local102] = (int) ((double) (this.aClass45_8.anInt1882 - this.aClass45_8.anInt1884) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray386[local102]) / local16);
				Static187.anIntArray392[local102] = (int) ((double) this.aClass45_8.anInt1884 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass45_8.method1463(arg0);
			local187 = this.aClass45_5.method1463(arg0);
			if (this.aClass45_7 != null) {
				local195 = this.aClass45_7.method1463(arg0);
				local200 = this.aClass45_3.method1463(arg0);
				local182 += this.method2818(local28, local200, this.aClass45_7.anInt1885) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass45_9 != null) {
				local195 = this.aClass45_9.method1463(arg0);
				local200 = this.aClass45_2.method1463(arg0);
				local187 = local187 * ((this.method2818(local67, local200, this.aClass45_9.anInt1885) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray384[local195] != 0) {
					local200 = local176 + Static187.anIntArray390[local195];
					if (local200 < arg0) {
						Static187.anIntArray385[local200] += this.method2818(Static187.anIntArray391[local195], local187 * Static187.anIntArray393[local195] >> 15, this.aClass45_8.anInt1885);
						Static187.anIntArray391[local195] += (local182 * Static187.anIntArray394[local195] >> 16) + Static187.anIntArray392[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass45_1 != null) {
			this.aClass45_1.method1461();
			this.aClass45_4.method1461();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass45_1.method1463(arg0);
				local352 = this.aClass45_4.method1463(arg0);
				if (local339) {
					local187 = this.aClass45_1.anInt1884 + ((this.aClass45_1.anInt1882 - this.aClass45_1.anInt1884) * local347 >> 8);
				} else {
					local187 = this.aClass45_1.anInt1884 + ((this.aClass45_1.anInt1882 - this.aClass45_1.anInt1884) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static187.anIntArray385[local200] = 0;
				}
			}
		}
		if (this.anInt3748 > 0 && this.anInt3749 > 0) {
			local182 = (int) ((double) this.anInt3748 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static187.anIntArray385[local187] += Static187.anIntArray385[local187 - local182] * this.anInt3749 / 100;
			}
		}
		if (this.aClass16_1.anIntArray32[0] > 0 || this.aClass16_1.anIntArray32[1] > 0) {
			this.aClass45_6.method1461();
			local182 = this.aClass45_6.method1463(arg0 + 1);
			local187 = this.aClass16_1.method331(0, (float) local182 / 65536.0F);
			local195 = this.aClass16_1.method331(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static187.anIntArray385[local200 + local187] * (long) Static25.anInt414 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static187.anIntArray385[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static187.anIntArray385[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
					}
					Static187.anIntArray385[local200] = local352;
					local182 = this.aClass45_6.method1463(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static187.anIntArray385[local200 + local187] * (long) Static25.anInt414 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static187.anIntArray385[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static187.anIntArray385[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
						}
						Static187.anIntArray385[local200] = local352;
						local182 = this.aClass45_6.method1463(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static187.anIntArray385[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static187.anIntArray385[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
							}
							Static187.anIntArray385[local200] = local352;
							this.aClass45_6.method1463(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass16_1.method331(0, (float) local182 / 65536.0F);
					local195 = this.aClass16_1.method331(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static187.anIntArray385[local182] < -32768) {
				Static187.anIntArray385[local182] = -32768;
			}
			if (Static187.anIntArray385[local182] > 32767) {
				Static187.anIntArray385[local182] = 32767;
			}
		}
		return Static187.anIntArray385;
	}
}
