import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class222 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
	private static final int[] anIntArray1138 = new int[32768];

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
	private static final int[] anIntArray1139;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!jh;")
	private Class121 aClass121_1;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!ui;")
	private Class231 aClass231_1;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!jh;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!jh;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!jh;")
	private Class121 aClass121_4;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!jh;")
	private Class121 aClass121_5;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!jh;")
	private Class121 aClass121_6;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!jh;")
	private Class121 aClass121_7;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!jh;")
	private Class121 aClass121_8;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!jh;")
	private Class121 aClass121_9;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[I")
	private final int[] anIntArray1137 = new int[5];

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	private int anInt5623 = 100;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public int anInt5625 = 0;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	public int anInt5624 = 500;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	private int anInt5622 = 0;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
	private final int[] anIntArray1140 = new int[5];

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "[I")
	private final int[] anIntArray1147 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray1138[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray1139 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray1139[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!kk;)V")
	public void method4845(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aClass121_7 = new Class121();
		this.aClass121_7.method2873(arg0);
		this.aClass121_8 = new Class121();
		this.aClass121_8.method2873(arg0);
		@Pc(21) int local21 = arg0.method5350();
		if (local21 != 0) {
			arg0.anInt6145--;
			this.aClass121_9 = new Class121();
			this.aClass121_9.method2873(arg0);
			this.aClass121_2 = new Class121();
			this.aClass121_2.method2873(arg0);
		}
		local21 = arg0.method5350();
		if (local21 != 0) {
			arg0.anInt6145--;
			this.aClass121_1 = new Class121();
			this.aClass121_1.method2873(arg0);
			this.aClass121_5 = new Class121();
			this.aClass121_5.method2873(arg0);
		}
		local21 = arg0.method5350();
		if (local21 != 0) {
			arg0.anInt6145--;
			this.aClass121_4 = new Class121();
			this.aClass121_4.method2873(arg0);
			this.aClass121_3 = new Class121();
			this.aClass121_3.method2873(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5311();
			if (local114 == 0) {
				break;
			}
			this.anIntArray1137[local109] = local114;
			this.anIntArray1140[local109] = arg0.method5342();
			this.anIntArray1147[local109] = arg0.method5311();
		}
		this.anInt5622 = arg0.method5311();
		this.anInt5623 = arg0.method5311();
		this.anInt5624 = arg0.method5312();
		this.anInt5625 = arg0.method5312();
		this.aClass231_1 = new Class231();
		this.aClass121_6 = new Class121();
		this.aClass231_1.method5023(arg0, this.aClass121_6);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	private int method4846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray1139[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray1138[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	public int[] method4847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static399.method2488(Static327.anIntArray1141, 0, arg0);
		if (arg1 < 10) {
			return Static327.anIntArray1141;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass121_7.method2872();
		this.aClass121_8.method2872();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass121_9 != null) {
			this.aClass121_9.method2872();
			this.aClass121_2.method2872();
			local24 = (int) ((double) (this.aClass121_9.anInt3111 - this.aClass121_9.anInt3108) * 32.768D / local16);
			local26 = (int) ((double) this.aClass121_9.anInt3108 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass121_1 != null) {
			this.aClass121_1.method2872();
			this.aClass121_5.method2872();
			local63 = (int) ((double) (this.aClass121_1.anInt3111 - this.aClass121_1.anInt3108) * 32.768D / local16);
			local65 = (int) ((double) this.aClass121_1.anInt3108 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray1137[local102] != 0) {
				Static327.anIntArray1142[local102] = 0;
				Static327.anIntArray1146[local102] = (int) ((double) this.anIntArray1147[local102] * local16);
				Static327.anIntArray1143[local102] = (this.anIntArray1137[local102] << 14) / 100;
				Static327.anIntArray1145[local102] = (int) ((double) (this.aClass121_7.anInt3111 - this.aClass121_7.anInt3108) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray1140[local102]) / local16);
				Static327.anIntArray1144[local102] = (int) ((double) this.aClass121_7.anInt3108 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass121_7.method2871(arg0);
			local187 = this.aClass121_8.method2871(arg0);
			if (this.aClass121_9 != null) {
				local195 = this.aClass121_9.method2871(arg0);
				local200 = this.aClass121_2.method2871(arg0);
				local182 += this.method4846(local28, local200, this.aClass121_9.anInt3110) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass121_1 != null) {
				local195 = this.aClass121_1.method2871(arg0);
				local200 = this.aClass121_5.method2871(arg0);
				local187 = local187 * ((this.method4846(local67, local200, this.aClass121_1.anInt3110) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray1137[local195] != 0) {
					local200 = local176 + Static327.anIntArray1146[local195];
					if (local200 < arg0) {
						Static327.anIntArray1141[local200] += this.method4846(Static327.anIntArray1142[local195], local187 * Static327.anIntArray1143[local195] >> 15, this.aClass121_7.anInt3110);
						Static327.anIntArray1142[local195] += (local182 * Static327.anIntArray1145[local195] >> 16) + Static327.anIntArray1144[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass121_4 != null) {
			this.aClass121_4.method2872();
			this.aClass121_3.method2872();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass121_4.method2871(arg0);
				local352 = this.aClass121_3.method2871(arg0);
				if (local339) {
					local187 = this.aClass121_4.anInt3108 + ((this.aClass121_4.anInt3111 - this.aClass121_4.anInt3108) * local347 >> 8);
				} else {
					local187 = this.aClass121_4.anInt3108 + ((this.aClass121_4.anInt3111 - this.aClass121_4.anInt3108) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static327.anIntArray1141[local200] = 0;
				}
			}
		}
		if (this.anInt5622 > 0 && this.anInt5623 > 0) {
			local182 = (int) ((double) this.anInt5622 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static327.anIntArray1141[local187] += Static327.anIntArray1141[local187 - local182] * this.anInt5623 / 100;
			}
		}
		if (this.aClass231_1.anIntArray1181[0] > 0 || this.aClass231_1.anIntArray1181[1] > 0) {
			this.aClass121_6.method2872();
			local182 = this.aClass121_6.method2871(arg0 + 1);
			local187 = this.aClass231_1.method5026(0, (float) local182 / 65536.0F);
			local195 = this.aClass231_1.method5026(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static327.anIntArray1141[local200 + local187] * (long) Static346.anInt5846 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static327.anIntArray1141[local200 + local187 - local519 - 1] * (long) Static346.anIntArrayArray50[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static327.anIntArray1141[local200 - local549 - 1] * (long) Static346.anIntArrayArray50[1][local549] >> 16);
					}
					Static327.anIntArray1141[local200] = local352;
					local182 = this.aClass121_6.method2871(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static327.anIntArray1141[local200 + local187] * (long) Static346.anInt5846 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static327.anIntArray1141[local200 + local187 - local519 - 1] * (long) Static346.anIntArrayArray50[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static327.anIntArray1141[local200 - local549 - 1] * (long) Static346.anIntArrayArray50[1][local549] >> 16);
						}
						Static327.anIntArray1141[local200] = local352;
						local182 = this.aClass121_6.method2871(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static327.anIntArray1141[local200 + local187 - local519 - 1] * (long) Static346.anIntArrayArray50[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static327.anIntArray1141[local200 - local549 - 1] * (long) Static346.anIntArrayArray50[1][local549] >> 16);
							}
							Static327.anIntArray1141[local200] = local352;
							this.aClass121_6.method2871(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass231_1.method5026(0, (float) local182 / 65536.0F);
					local195 = this.aClass231_1.method5026(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static327.anIntArray1141[local182] < -32768) {
				Static327.anIntArray1141[local182] = -32768;
			}
			if (Static327.anIntArray1141[local182] > 32767) {
				Static327.anIntArray1141[local182] = 32767;
			}
		}
		return Static327.anIntArray1141;
	}
}
