import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class79 {

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
	public static int[] anIntArray397 = new int[32768];

	@OriginalMember(owner = "client!w", name = "m", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!f;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!f;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!f;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!f;")
	private Class20 aClass20_4;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!f;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!f;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!f;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!f;")
	private Class20 aClass20_8;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "Lclient!f;")
	private Class20 aClass20_9;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!pf;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	private int anInt3254 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
	private final int[] anIntArray396 = new int[5];

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public int anInt3256 = 500;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
	private final int[] anIntArray400 = new int[5];

	@OriginalMember(owner = "client!w", name = "u", descriptor = "[I")
	private final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public int anInt3255 = 0;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	private int anInt3253 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray397[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray399 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray399[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
	private int method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray399[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray397[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!m;)V")
	public void method2252(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aClass20_6 = new Class20();
		this.aClass20_6.method609(arg0);
		this.aClass20_4 = new Class20();
		this.aClass20_4.method609(arg0);
		@Pc(21) int local21 = arg0.method981();
		if (local21 != 0) {
			arg0.anInt1562--;
			this.aClass20_8 = new Class20();
			this.aClass20_8.method609(arg0);
			this.aClass20_5 = new Class20();
			this.aClass20_5.method609(arg0);
		}
		local21 = arg0.method981();
		if (local21 != 0) {
			arg0.anInt1562--;
			this.aClass20_9 = new Class20();
			this.aClass20_9.method609(arg0);
			this.aClass20_2 = new Class20();
			this.aClass20_2.method609(arg0);
		}
		local21 = arg0.method981();
		if (local21 != 0) {
			arg0.anInt1562--;
			this.aClass20_7 = new Class20();
			this.aClass20_7.method609(arg0);
			this.aClass20_3 = new Class20();
			this.aClass20_3.method609(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method979();
			if (local114 == 0) {
				break;
			}
			this.anIntArray396[local109] = local114;
			this.anIntArray403[local109] = arg0.method1025();
			this.anIntArray400[local109] = arg0.method979();
		}
		this.anInt3254 = arg0.method979();
		this.anInt3253 = arg0.method979();
		this.anInt3256 = arg0.method974();
		this.anInt3255 = arg0.method974();
		this.aClass56_1 = new Class56();
		this.aClass20_1 = new Class20();
		this.aClass56_1.method1683(arg0, this.aClass20_1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
	public int[] method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.method732(Static128.anIntArray398, 0, arg0);
		if (arg1 < 10) {
			return Static128.anIntArray398;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass20_6.method611();
		this.aClass20_4.method611();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass20_8 != null) {
			this.aClass20_8.method611();
			this.aClass20_5.method611();
			local24 = (int) ((double) (this.aClass20_8.anInt1016 - this.aClass20_8.anInt1015) * 32.768D / local16);
			local26 = (int) ((double) this.aClass20_8.anInt1015 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass20_9 != null) {
			this.aClass20_9.method611();
			this.aClass20_2.method611();
			local63 = (int) ((double) (this.aClass20_9.anInt1016 - this.aClass20_9.anInt1015) * 32.768D / local16);
			local65 = (int) ((double) this.aClass20_9.anInt1015 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray396[local102] != 0) {
				Static128.anIntArray406[local102] = 0;
				Static128.anIntArray404[local102] = (int) ((double) this.anIntArray400[local102] * local16);
				Static128.anIntArray402[local102] = (this.anIntArray396[local102] << 14) / 100;
				Static128.anIntArray405[local102] = (int) ((double) (this.aClass20_6.anInt1016 - this.aClass20_6.anInt1015) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray403[local102]) / local16);
				Static128.anIntArray401[local102] = (int) ((double) this.aClass20_6.anInt1015 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass20_6.method610(arg0);
			local187 = this.aClass20_4.method610(arg0);
			if (this.aClass20_8 != null) {
				local195 = this.aClass20_8.method610(arg0);
				local200 = this.aClass20_5.method610(arg0);
				local182 += this.method2251(local28, local200, this.aClass20_8.anInt1014) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass20_9 != null) {
				local195 = this.aClass20_9.method610(arg0);
				local200 = this.aClass20_2.method610(arg0);
				local187 = local187 * ((this.method2251(local67, local200, this.aClass20_9.anInt1014) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray396[local195] != 0) {
					local200 = local176 + Static128.anIntArray404[local195];
					if (local200 < arg0) {
						Static128.anIntArray398[local200] += this.method2251(Static128.anIntArray406[local195], local187 * Static128.anIntArray402[local195] >> 15, this.aClass20_6.anInt1014);
						Static128.anIntArray406[local195] += (local182 * Static128.anIntArray405[local195] >> 16) + Static128.anIntArray401[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass20_7 != null) {
			this.aClass20_7.method611();
			this.aClass20_3.method611();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass20_7.method610(arg0);
				local352 = this.aClass20_3.method610(arg0);
				if (local339) {
					local187 = this.aClass20_7.anInt1015 + ((this.aClass20_7.anInt1016 - this.aClass20_7.anInt1015) * local347 >> 8);
				} else {
					local187 = this.aClass20_7.anInt1015 + ((this.aClass20_7.anInt1016 - this.aClass20_7.anInt1015) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static128.anIntArray398[local200] = 0;
				}
			}
		}
		if (this.anInt3254 > 0 && this.anInt3253 > 0) {
			local182 = (int) ((double) this.anInt3254 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static128.anIntArray398[local187] += Static128.anIntArray398[local187 - local182] * this.anInt3253 / 100;
			}
		}
		if (this.aClass56_1.anIntArray303[0] > 0 || this.aClass56_1.anIntArray303[1] > 0) {
			this.aClass20_1.method611();
			local182 = this.aClass20_1.method610(arg0 + 1);
			local187 = this.aClass56_1.method1679(0, (float) local182 / 65536.0F);
			local195 = this.aClass56_1.method1679(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static128.anIntArray398[local200 + local187] * (long) Static92.anInt2517 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static128.anIntArray398[local200 + local187 - local519 - 1] * (long) Static92.anIntArrayArray25[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static128.anIntArray398[local200 - local549 - 1] * (long) Static92.anIntArrayArray25[1][local549] >> 16);
					}
					Static128.anIntArray398[local200] = local352;
					local182 = this.aClass20_1.method610(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static128.anIntArray398[local200 + local187] * (long) Static92.anInt2517 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static128.anIntArray398[local200 + local187 - local519 - 1] * (long) Static92.anIntArrayArray25[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static128.anIntArray398[local200 - local549 - 1] * (long) Static92.anIntArrayArray25[1][local549] >> 16);
						}
						Static128.anIntArray398[local200] = local352;
						local182 = this.aClass20_1.method610(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static128.anIntArray398[local200 + local187 - local519 - 1] * (long) Static92.anIntArrayArray25[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static128.anIntArray398[local200 - local549 - 1] * (long) Static92.anIntArrayArray25[1][local549] >> 16);
							}
							Static128.anIntArray398[local200] = local352;
							this.aClass20_1.method610(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass56_1.method1679(0, (float) local182 / 65536.0F);
					local195 = this.aClass56_1.method1679(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static128.anIntArray398[local182] < -32768) {
				Static128.anIntArray398[local182] = -32768;
			}
			if (Static128.anIntArray398[local182] > 32767) {
				Static128.anIntArray398[local182] = 32767;
			}
		}
		return Static128.anIntArray398;
	}
}
