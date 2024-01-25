import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class15 {

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "[I")
	private static final int[] anIntArray33 = new int[32768];

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
	private static final int[] anIntArray29;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Lclient!og;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Lclient!raa;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Lclient!raa;")
	private Class244 aClass244_2;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Lclient!raa;")
	private Class244 aClass244_3;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!raa;")
	private Class244 aClass244_4;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Lclient!raa;")
	private Class244 aClass244_5;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "Lclient!raa;")
	private Class244 aClass244_6;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "Lclient!raa;")
	private Class244 aClass244_7;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Lclient!raa;")
	private Class244 aClass244_8;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!raa;")
	private Class244 aClass244_9;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
	private final int[] anIntArray30 = new int[5];

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public int anInt467 = 0;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "[I")
	private final int[] anIntArray32 = new int[5];

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public int anInt466 = 500;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "[I")
	private final int[] anIntArray28 = new int[5];

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	private int anInt468 = 0;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	private int anInt469 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray33[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray29 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray29[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)I")
	private int method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray29[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray33[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)[I")
	public int[] method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static553.method3368(Static22.anIntArray31, 0, arg0);
		if (arg1 < 10) {
			return Static22.anIntArray31;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass244_1.method6409();
		this.aClass244_7.method6409();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass244_5 != null) {
			this.aClass244_5.method6409();
			this.aClass244_4.method6409();
			local24 = (int) ((double) (this.aClass244_5.anInt7632 - this.aClass244_5.anInt7633) * 32.768D / local16);
			local26 = (int) ((double) this.aClass244_5.anInt7633 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass244_2 != null) {
			this.aClass244_2.method6409();
			this.aClass244_8.method6409();
			local63 = (int) ((double) (this.aClass244_2.anInt7632 - this.aClass244_2.anInt7633) * 32.768D / local16);
			local65 = (int) ((double) this.aClass244_2.anInt7633 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray28[local102] != 0) {
				Static22.anIntArray35[local102] = 0;
				Static22.anIntArray37[local102] = (int) ((double) this.anIntArray30[local102] * local16);
				Static22.anIntArray38[local102] = (this.anIntArray28[local102] << 14) / 100;
				Static22.anIntArray34[local102] = (int) ((double) (this.aClass244_1.anInt7632 - this.aClass244_1.anInt7633) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray32[local102]) / local16);
				Static22.anIntArray36[local102] = (int) ((double) this.aClass244_1.anInt7633 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass244_1.method6411(arg0);
			local187 = this.aClass244_7.method6411(arg0);
			if (this.aClass244_5 != null) {
				local195 = this.aClass244_5.method6411(arg0);
				local200 = this.aClass244_4.method6411(arg0);
				local182 += this.method566(local28, local200, this.aClass244_5.anInt7631) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass244_2 != null) {
				local195 = this.aClass244_2.method6411(arg0);
				local200 = this.aClass244_8.method6411(arg0);
				local187 = local187 * ((this.method566(local67, local200, this.aClass244_2.anInt7631) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray28[local195] != 0) {
					local200 = local176 + Static22.anIntArray37[local195];
					if (local200 < arg0) {
						Static22.anIntArray31[local200] += this.method566(Static22.anIntArray35[local195], local187 * Static22.anIntArray38[local195] >> 15, this.aClass244_1.anInt7631);
						Static22.anIntArray35[local195] += (local182 * Static22.anIntArray34[local195] >> 16) + Static22.anIntArray36[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass244_6 != null) {
			this.aClass244_6.method6409();
			this.aClass244_3.method6409();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass244_6.method6411(arg0);
				local352 = this.aClass244_3.method6411(arg0);
				if (local339) {
					local187 = this.aClass244_6.anInt7633 + ((this.aClass244_6.anInt7632 - this.aClass244_6.anInt7633) * local347 >> 8);
				} else {
					local187 = this.aClass244_6.anInt7633 + ((this.aClass244_6.anInt7632 - this.aClass244_6.anInt7633) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static22.anIntArray31[local200] = 0;
				}
			}
		}
		if (this.anInt468 > 0 && this.anInt469 > 0) {
			local182 = (int) ((double) this.anInt468 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static22.anIntArray31[local187] += Static22.anIntArray31[local187 - local182] * this.anInt469 / 100;
			}
		}
		if (this.aClass213_1.anIntArray509[0] > 0 || this.aClass213_1.anIntArray509[1] > 0) {
			this.aClass244_9.method6409();
			local182 = this.aClass244_9.method6411(arg0 + 1);
			local187 = this.aClass213_1.method5419(0, (float) local182 / 65536.0F);
			local195 = this.aClass213_1.method5419(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static22.anIntArray31[local200 + local187] * (long) Static345.anInt6363 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static22.anIntArray31[local200 + local187 - local519 - 1] * (long) Static345.anIntArrayArray57[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static22.anIntArray31[local200 - local549 - 1] * (long) Static345.anIntArrayArray57[1][local549] >> 16);
					}
					Static22.anIntArray31[local200] = local352;
					local182 = this.aClass244_9.method6411(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static22.anIntArray31[local200 + local187] * (long) Static345.anInt6363 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static22.anIntArray31[local200 + local187 - local519 - 1] * (long) Static345.anIntArrayArray57[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static22.anIntArray31[local200 - local549 - 1] * (long) Static345.anIntArrayArray57[1][local549] >> 16);
						}
						Static22.anIntArray31[local200] = local352;
						local182 = this.aClass244_9.method6411(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static22.anIntArray31[local200 + local187 - local519 - 1] * (long) Static345.anIntArrayArray57[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static22.anIntArray31[local200 - local549 - 1] * (long) Static345.anIntArrayArray57[1][local549] >> 16);
							}
							Static22.anIntArray31[local200] = local352;
							this.aClass244_9.method6411(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass213_1.method5419(0, (float) local182 / 65536.0F);
					local195 = this.aClass213_1.method5419(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static22.anIntArray31[local182] < -32768) {
				Static22.anIntArray31[local182] = -32768;
			}
			if (Static22.anIntArray31[local182] > 32767) {
				Static22.anIntArray31[local182] = 32767;
			}
		}
		return Static22.anIntArray31;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ps;)V")
	public void method568(@OriginalArg(0) Class2_Sub29 arg0) {
		this.aClass244_1 = new Class244();
		this.aClass244_1.method6410(arg0);
		this.aClass244_7 = new Class244();
		this.aClass244_7.method6410(arg0);
		@Pc(21) int local21 = arg0.method5170();
		if (local21 != 0) {
			arg0.anInt6132--;
			this.aClass244_5 = new Class244();
			this.aClass244_5.method6410(arg0);
			this.aClass244_4 = new Class244();
			this.aClass244_4.method6410(arg0);
		}
		local21 = arg0.method5170();
		if (local21 != 0) {
			arg0.anInt6132--;
			this.aClass244_2 = new Class244();
			this.aClass244_2.method6410(arg0);
			this.aClass244_8 = new Class244();
			this.aClass244_8.method6410(arg0);
		}
		local21 = arg0.method5170();
		if (local21 != 0) {
			arg0.anInt6132--;
			this.aClass244_6 = new Class244();
			this.aClass244_6.method6410(arg0);
			this.aClass244_3 = new Class244();
			this.aClass244_3.method6410(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5182();
			if (local114 == 0) {
				break;
			}
			this.anIntArray28[local109] = local114;
			this.anIntArray32[local109] = arg0.method5203();
			this.anIntArray30[local109] = arg0.method5182();
		}
		this.anInt468 = arg0.method5182();
		this.anInt469 = arg0.method5182();
		this.anInt466 = arg0.method5229();
		this.anInt467 = arg0.method5229();
		this.aClass213_1 = new Class213();
		this.aClass244_9 = new Class244();
		this.aClass213_1.method5421(arg0, this.aClass244_9);
	}
}
