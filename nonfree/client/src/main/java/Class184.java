import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class184 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	private static final int[] anIntArray362 = new int[32768];

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "[I")
	private static final int[] anIntArray365;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!bd;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Lclient!ej;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!ej;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!ej;")
	private Class61 aClass61_3;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!ej;")
	private Class61 aClass61_4;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!ej;")
	private Class61 aClass61_5;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "Lclient!ej;")
	private Class61 aClass61_6;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Lclient!ej;")
	private Class61 aClass61_7;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Lclient!ej;")
	private Class61 aClass61_8;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!ej;")
	private Class61 aClass61_9;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
	private final int[] anIntArray361 = new int[5];

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt5407 = 0;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	private int anInt5409 = 100;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
	private final int[] anIntArray364 = new int[5];

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
	private final int[] anIntArray363 = new int[5];

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public int anInt5406 = 500;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt5408 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray362[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray365 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray365[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!iv;)V")
	public void method4150(@OriginalArg(0) Class4_Sub12 arg0) {
		this.aClass61_8 = new Class61();
		this.aClass61_8.method1603(arg0);
		this.aClass61_2 = new Class61();
		this.aClass61_2.method1603(arg0);
		@Pc(21) int local21 = arg0.method2490();
		if (local21 != 0) {
			arg0.anInt2997--;
			this.aClass61_7 = new Class61();
			this.aClass61_7.method1603(arg0);
			this.aClass61_6 = new Class61();
			this.aClass61_6.method1603(arg0);
		}
		local21 = arg0.method2490();
		if (local21 != 0) {
			arg0.anInt2997--;
			this.aClass61_1 = new Class61();
			this.aClass61_1.method1603(arg0);
			this.aClass61_4 = new Class61();
			this.aClass61_4.method1603(arg0);
		}
		local21 = arg0.method2490();
		if (local21 != 0) {
			arg0.anInt2997--;
			this.aClass61_9 = new Class61();
			this.aClass61_9.method1603(arg0);
			this.aClass61_3 = new Class61();
			this.aClass61_3.method1603(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2506();
			if (local114 == 0) {
				break;
			}
			this.anIntArray363[local109] = local114;
			this.anIntArray361[local109] = arg0.method2502();
			this.anIntArray364[local109] = arg0.method2506();
		}
		this.anInt5407 = arg0.method2506();
		this.anInt5409 = arg0.method2506();
		this.anInt5406 = arg0.method2536();
		this.anInt5408 = arg0.method2536();
		this.aClass20_1 = new Class20();
		this.aClass61_5 = new Class61();
		this.aClass20_1.method497(arg0, this.aClass61_5);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[I")
	public int[] method4152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method3326(Static307.anIntArray366, 0, arg0);
		if (arg1 < 10) {
			return Static307.anIntArray366;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass61_8.method1602();
		this.aClass61_2.method1602();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass61_7 != null) {
			this.aClass61_7.method1602();
			this.aClass61_6.method1602();
			local24 = (int) ((double) (this.aClass61_7.anInt1832 - this.aClass61_7.anInt1831) * 32.768D / local16);
			local26 = (int) ((double) this.aClass61_7.anInt1831 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass61_1 != null) {
			this.aClass61_1.method1602();
			this.aClass61_4.method1602();
			local63 = (int) ((double) (this.aClass61_1.anInt1832 - this.aClass61_1.anInt1831) * 32.768D / local16);
			local65 = (int) ((double) this.aClass61_1.anInt1831 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray363[local102] != 0) {
				Static307.anIntArray369[local102] = 0;
				Static307.anIntArray370[local102] = (int) ((double) this.anIntArray364[local102] * local16);
				Static307.anIntArray368[local102] = (this.anIntArray363[local102] << 14) / 100;
				Static307.anIntArray371[local102] = (int) ((double) (this.aClass61_8.anInt1832 - this.aClass61_8.anInt1831) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray361[local102]) / local16);
				Static307.anIntArray367[local102] = (int) ((double) this.aClass61_8.anInt1831 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass61_8.method1604(arg0);
			local187 = this.aClass61_2.method1604(arg0);
			if (this.aClass61_7 != null) {
				local195 = this.aClass61_7.method1604(arg0);
				local200 = this.aClass61_6.method1604(arg0);
				local182 += this.method4153(local28, local200, this.aClass61_7.anInt1830) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass61_1 != null) {
				local195 = this.aClass61_1.method1604(arg0);
				local200 = this.aClass61_4.method1604(arg0);
				local187 = local187 * ((this.method4153(local67, local200, this.aClass61_1.anInt1830) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray363[local195] != 0) {
					local200 = local176 + Static307.anIntArray370[local195];
					if (local200 < arg0) {
						Static307.anIntArray366[local200] += this.method4153(Static307.anIntArray369[local195], local187 * Static307.anIntArray368[local195] >> 15, this.aClass61_8.anInt1830);
						Static307.anIntArray369[local195] += (local182 * Static307.anIntArray371[local195] >> 16) + Static307.anIntArray367[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass61_9 != null) {
			this.aClass61_9.method1602();
			this.aClass61_3.method1602();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass61_9.method1604(arg0);
				local352 = this.aClass61_3.method1604(arg0);
				if (local339) {
					local187 = this.aClass61_9.anInt1831 + ((this.aClass61_9.anInt1832 - this.aClass61_9.anInt1831) * local347 >> 8);
				} else {
					local187 = this.aClass61_9.anInt1831 + ((this.aClass61_9.anInt1832 - this.aClass61_9.anInt1831) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static307.anIntArray366[local200] = 0;
				}
			}
		}
		if (this.anInt5407 > 0 && this.anInt5409 > 0) {
			local182 = (int) ((double) this.anInt5407 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static307.anIntArray366[local187] += Static307.anIntArray366[local187 - local182] * this.anInt5409 / 100;
			}
		}
		if (this.aClass20_1.anIntArray28[0] > 0 || this.aClass20_1.anIntArray28[1] > 0) {
			this.aClass61_5.method1602();
			local182 = this.aClass61_5.method1604(arg0 + 1);
			local187 = this.aClass20_1.method498(0, (float) local182 / 65536.0F);
			local195 = this.aClass20_1.method498(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static307.anIntArray366[local200 + local187] * (long) Static25.anInt432 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static307.anIntArray366[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static307.anIntArray366[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
					}
					Static307.anIntArray366[local200] = local352;
					local182 = this.aClass61_5.method1604(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static307.anIntArray366[local200 + local187] * (long) Static25.anInt432 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static307.anIntArray366[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static307.anIntArray366[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
						}
						Static307.anIntArray366[local200] = local352;
						local182 = this.aClass61_5.method1604(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static307.anIntArray366[local200 + local187 - local519 - 1] * (long) Static25.anIntArrayArray3[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static307.anIntArray366[local200 - local549 - 1] * (long) Static25.anIntArrayArray3[1][local549] >> 16);
							}
							Static307.anIntArray366[local200] = local352;
							this.aClass61_5.method1604(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass20_1.method498(0, (float) local182 / 65536.0F);
					local195 = this.aClass20_1.method498(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static307.anIntArray366[local182] < -32768) {
				Static307.anIntArray366[local182] = -32768;
			}
			if (Static307.anIntArray366[local182] > 32767) {
				Static307.anIntArray366[local182] = 32767;
			}
		}
		return Static307.anIntArray366;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I")
	private int method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray365[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray362[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
