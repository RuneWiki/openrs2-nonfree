import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class97 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	private static final int[] anIntArray363 = new int[32768];

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "[I")
	private static final int[] anIntArray367;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!ne;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!ne;")
	private Class66 aClass66_2;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!ne;")
	private Class66 aClass66_3;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!ne;")
	private Class66 aClass66_4;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!ne;")
	private Class66 aClass66_5;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!ne;")
	private Class66 aClass66_6;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!ne;")
	private Class66 aClass66_7;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!ne;")
	private Class66 aClass66_8;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!ne;")
	private Class66 aClass66_9;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!ca;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
	private final int[] anIntArray362 = new int[5];

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public int anInt4198 = 0;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
	private final int[] anIntArray364 = new int[5];

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	private int anInt4199 = 0;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
	private int anInt4200 = 100;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
	private final int[] anIntArray366 = new int[5];

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt4201 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray363[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray367 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray367[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	public int[] method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static218.method2014(Static206.anIntArray365, 0, arg0);
		if (arg1 < 10) {
			return Static206.anIntArray365;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass66_2.method1939();
		this.aClass66_5.method1939();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass66_3 != null) {
			this.aClass66_3.method1939();
			this.aClass66_4.method1939();
			local24 = (int) ((double) (this.aClass66_3.anInt2754 - this.aClass66_3.anInt2755) * 32.768D / local16);
			local26 = (int) ((double) this.aClass66_3.anInt2755 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass66_6 != null) {
			this.aClass66_6.method1939();
			this.aClass66_1.method1939();
			local63 = (int) ((double) (this.aClass66_6.anInt2754 - this.aClass66_6.anInt2755) * 32.768D / local16);
			local65 = (int) ((double) this.aClass66_6.anInt2755 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray366[local102] != 0) {
				Static206.anIntArray372[local102] = 0;
				Static206.anIntArray369[local102] = (int) ((double) this.anIntArray362[local102] * local16);
				Static206.anIntArray370[local102] = (this.anIntArray366[local102] << 14) / 100;
				Static206.anIntArray368[local102] = (int) ((double) (this.aClass66_2.anInt2754 - this.aClass66_2.anInt2755) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray364[local102]) / local16);
				Static206.anIntArray371[local102] = (int) ((double) this.aClass66_2.anInt2755 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass66_2.method1937(arg0);
			local187 = this.aClass66_5.method1937(arg0);
			if (this.aClass66_3 != null) {
				local195 = this.aClass66_3.method1937(arg0);
				local200 = this.aClass66_4.method1937(arg0);
				local182 += this.method3292(local28, local200, this.aClass66_3.anInt2756) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass66_6 != null) {
				local195 = this.aClass66_6.method1937(arg0);
				local200 = this.aClass66_1.method1937(arg0);
				local187 = local187 * ((this.method3292(local67, local200, this.aClass66_6.anInt2756) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray366[local195] != 0) {
					local200 = local176 + Static206.anIntArray369[local195];
					if (local200 < arg0) {
						Static206.anIntArray365[local200] += this.method3292(Static206.anIntArray372[local195], local187 * Static206.anIntArray370[local195] >> 15, this.aClass66_2.anInt2756);
						Static206.anIntArray372[local195] += (local182 * Static206.anIntArray368[local195] >> 16) + Static206.anIntArray371[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass66_8 != null) {
			this.aClass66_8.method1939();
			this.aClass66_9.method1939();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass66_8.method1937(arg0);
				local352 = this.aClass66_9.method1937(arg0);
				if (local339) {
					local187 = this.aClass66_8.anInt2755 + ((this.aClass66_8.anInt2754 - this.aClass66_8.anInt2755) * local347 >> 8);
				} else {
					local187 = this.aClass66_8.anInt2755 + ((this.aClass66_8.anInt2754 - this.aClass66_8.anInt2755) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static206.anIntArray365[local200] = 0;
				}
			}
		}
		if (this.anInt4199 > 0 && this.anInt4200 > 0) {
			local182 = (int) ((double) this.anInt4199 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static206.anIntArray365[local187] += Static206.anIntArray365[local187 - local182] * this.anInt4200 / 100;
			}
		}
		if (this.aClass16_1.anIntArray31[0] > 0 || this.aClass16_1.anIntArray31[1] > 0) {
			this.aClass66_7.method1939();
			local182 = this.aClass66_7.method1937(arg0 + 1);
			local187 = this.aClass16_1.method324(0, (float) local182 / 65536.0F);
			local195 = this.aClass16_1.method324(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static206.anIntArray365[local200 + local187] * (long) Static20.anInt381 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static206.anIntArray365[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray5[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static206.anIntArray365[local200 - local549 - 1] * (long) Static20.anIntArrayArray5[1][local549] >> 16);
					}
					Static206.anIntArray365[local200] = local352;
					local182 = this.aClass66_7.method1937(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static206.anIntArray365[local200 + local187] * (long) Static20.anInt381 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static206.anIntArray365[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray5[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static206.anIntArray365[local200 - local549 - 1] * (long) Static20.anIntArrayArray5[1][local549] >> 16);
						}
						Static206.anIntArray365[local200] = local352;
						local182 = this.aClass66_7.method1937(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static206.anIntArray365[local200 + local187 - local519 - 1] * (long) Static20.anIntArrayArray5[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static206.anIntArray365[local200 - local549 - 1] * (long) Static20.anIntArrayArray5[1][local549] >> 16);
							}
							Static206.anIntArray365[local200] = local352;
							this.aClass66_7.method1937(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass16_1.method324(0, (float) local182 / 65536.0F);
					local195 = this.aClass16_1.method324(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static206.anIntArray365[local182] < -32768) {
				Static206.anIntArray365[local182] = -32768;
			}
			if (Static206.anIntArray365[local182] > 32767) {
				Static206.anIntArray365[local182] = 32767;
			}
		}
		return Static206.anIntArray365;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	private int method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray367[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray363[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ce;)V")
	public void method3293(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass66_2 = new Class66();
		this.aClass66_2.method1938(arg0);
		this.aClass66_5 = new Class66();
		this.aClass66_5.method1938(arg0);
		@Pc(21) int local21 = arg0.method1278();
		if (local21 != 0) {
			arg0.anInt1758--;
			this.aClass66_3 = new Class66();
			this.aClass66_3.method1938(arg0);
			this.aClass66_4 = new Class66();
			this.aClass66_4.method1938(arg0);
		}
		local21 = arg0.method1278();
		if (local21 != 0) {
			arg0.anInt1758--;
			this.aClass66_6 = new Class66();
			this.aClass66_6.method1938(arg0);
			this.aClass66_1 = new Class66();
			this.aClass66_1.method1938(arg0);
		}
		local21 = arg0.method1278();
		if (local21 != 0) {
			arg0.anInt1758--;
			this.aClass66_8 = new Class66();
			this.aClass66_8.method1938(arg0);
			this.aClass66_9 = new Class66();
			this.aClass66_9.method1938(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method1266();
			if (local114 == 0) {
				break;
			}
			this.anIntArray366[local109] = local114;
			this.anIntArray364[local109] = arg0.method1291();
			this.anIntArray362[local109] = arg0.method1266();
		}
		this.anInt4199 = arg0.method1266();
		this.anInt4200 = arg0.method1266();
		this.anInt4201 = arg0.method1270();
		this.anInt4198 = arg0.method1270();
		this.aClass16_1 = new Class16();
		this.aClass66_7 = new Class66();
		this.aClass16_1.method321(arg0, this.aClass66_7);
	}
}
