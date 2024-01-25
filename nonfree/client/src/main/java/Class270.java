import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class270 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	private static final int[] anIntArray526 = new int[32768];

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "[I")
	private static final int[] anIntArray528;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!jk;")
	private Class130 aClass130_1;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!jk;")
	private Class130 aClass130_2;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!jk;")
	private Class130 aClass130_3;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!jk;")
	private Class130 aClass130_4;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!ur;")
	private Class256 aClass256_1;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!jk;")
	private Class130 aClass130_5;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!jk;")
	private Class130 aClass130_6;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Lclient!jk;")
	private Class130 aClass130_7;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!jk;")
	private Class130 aClass130_8;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!jk;")
	private Class130 aClass130_9;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
	private final int[] anIntArray525 = new int[5];

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	private int anInt7148 = 0;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public int anInt7149 = 0;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "[I")
	private final int[] anIntArray527 = new int[5];

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "[I")
	private final int[] anIntArray529 = new int[5];

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public int anInt7151 = 500;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	private int anInt7150 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray526[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray528 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray528[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wm;)V")
	public void method5794(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aClass130_9 = new Class130();
		this.aClass130_9.method2821(arg0);
		this.aClass130_7 = new Class130();
		this.aClass130_7.method2821(arg0);
		@Pc(21) int local21 = arg0.method2915();
		if (local21 != 0) {
			arg0.anInt3698--;
			this.aClass130_3 = new Class130();
			this.aClass130_3.method2821(arg0);
			this.aClass130_1 = new Class130();
			this.aClass130_1.method2821(arg0);
		}
		local21 = arg0.method2915();
		if (local21 != 0) {
			arg0.anInt3698--;
			this.aClass130_2 = new Class130();
			this.aClass130_2.method2821(arg0);
			this.aClass130_5 = new Class130();
			this.aClass130_5.method2821(arg0);
		}
		local21 = arg0.method2915();
		if (local21 != 0) {
			arg0.anInt3698--;
			this.aClass130_4 = new Class130();
			this.aClass130_4.method2821(arg0);
			this.aClass130_8 = new Class130();
			this.aClass130_8.method2821(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2883();
			if (local114 == 0) {
				break;
			}
			this.anIntArray525[local109] = local114;
			this.anIntArray527[local109] = arg0.method2918();
			this.anIntArray529[local109] = arg0.method2883();
		}
		this.anInt7148 = arg0.method2883();
		this.anInt7150 = arg0.method2883();
		this.anInt7151 = arg0.method2896();
		this.anInt7149 = arg0.method2896();
		this.aClass256_1 = new Class256();
		this.aClass130_6 = new Class130();
		this.aClass256_1.method5359(arg0, this.aClass130_6);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I")
	private int method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray528[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray526[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	public int[] method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static471.method3063(Static450.anIntArray524, 0, arg0);
		if (arg1 < 10) {
			return Static450.anIntArray524;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass130_9.method2819();
		this.aClass130_7.method2819();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass130_3 != null) {
			this.aClass130_3.method2819();
			this.aClass130_1.method2819();
			local24 = (int) ((double) (this.aClass130_3.anInt3592 - this.aClass130_3.anInt3594) * 32.768D / local16);
			local26 = (int) ((double) this.aClass130_3.anInt3594 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass130_2 != null) {
			this.aClass130_2.method2819();
			this.aClass130_5.method2819();
			local63 = (int) ((double) (this.aClass130_2.anInt3592 - this.aClass130_2.anInt3594) * 32.768D / local16);
			local65 = (int) ((double) this.aClass130_2.anInt3594 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray525[local102] != 0) {
				Static450.anIntArray533[local102] = 0;
				Static450.anIntArray534[local102] = (int) ((double) this.anIntArray529[local102] * local16);
				Static450.anIntArray530[local102] = (this.anIntArray525[local102] << 14) / 100;
				Static450.anIntArray532[local102] = (int) ((double) (this.aClass130_9.anInt3592 - this.aClass130_9.anInt3594) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray527[local102]) / local16);
				Static450.anIntArray531[local102] = (int) ((double) this.aClass130_9.anInt3594 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass130_9.method2818(arg0);
			local187 = this.aClass130_7.method2818(arg0);
			if (this.aClass130_3 != null) {
				local195 = this.aClass130_3.method2818(arg0);
				local200 = this.aClass130_1.method2818(arg0);
				local182 += this.method5795(local28, local200, this.aClass130_3.anInt3593) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass130_2 != null) {
				local195 = this.aClass130_2.method2818(arg0);
				local200 = this.aClass130_5.method2818(arg0);
				local187 = local187 * ((this.method5795(local67, local200, this.aClass130_2.anInt3593) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray525[local195] != 0) {
					local200 = local176 + Static450.anIntArray534[local195];
					if (local200 < arg0) {
						Static450.anIntArray524[local200] += this.method5795(Static450.anIntArray533[local195], local187 * Static450.anIntArray530[local195] >> 15, this.aClass130_9.anInt3593);
						Static450.anIntArray533[local195] += (local182 * Static450.anIntArray532[local195] >> 16) + Static450.anIntArray531[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass130_4 != null) {
			this.aClass130_4.method2819();
			this.aClass130_8.method2819();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass130_4.method2818(arg0);
				local352 = this.aClass130_8.method2818(arg0);
				if (local339) {
					local187 = this.aClass130_4.anInt3594 + ((this.aClass130_4.anInt3592 - this.aClass130_4.anInt3594) * local347 >> 8);
				} else {
					local187 = this.aClass130_4.anInt3594 + ((this.aClass130_4.anInt3592 - this.aClass130_4.anInt3594) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static450.anIntArray524[local200] = 0;
				}
			}
		}
		if (this.anInt7148 > 0 && this.anInt7150 > 0) {
			local182 = (int) ((double) this.anInt7148 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static450.anIntArray524[local187] += Static450.anIntArray524[local187 - local182] * this.anInt7150 / 100;
			}
		}
		if (this.aClass256_1.anIntArray484[0] > 0 || this.aClass256_1.anIntArray484[1] > 0) {
			this.aClass130_6.method2819();
			local182 = this.aClass130_6.method2818(arg0 + 1);
			local187 = this.aClass256_1.method5356(0, (float) local182 / 65536.0F);
			local195 = this.aClass256_1.method5356(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static450.anIntArray524[local200 + local187] * (long) Static419.anInt6754 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static450.anIntArray524[local200 + local187 - local519 - 1] * (long) Static419.anIntArrayArray50[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static450.anIntArray524[local200 - local549 - 1] * (long) Static419.anIntArrayArray50[1][local549] >> 16);
					}
					Static450.anIntArray524[local200] = local352;
					local182 = this.aClass130_6.method2818(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static450.anIntArray524[local200 + local187] * (long) Static419.anInt6754 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static450.anIntArray524[local200 + local187 - local519 - 1] * (long) Static419.anIntArrayArray50[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static450.anIntArray524[local200 - local549 - 1] * (long) Static419.anIntArrayArray50[1][local549] >> 16);
						}
						Static450.anIntArray524[local200] = local352;
						local182 = this.aClass130_6.method2818(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static450.anIntArray524[local200 + local187 - local519 - 1] * (long) Static419.anIntArrayArray50[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static450.anIntArray524[local200 - local549 - 1] * (long) Static419.anIntArrayArray50[1][local549] >> 16);
							}
							Static450.anIntArray524[local200] = local352;
							this.aClass130_6.method2818(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass256_1.method5356(0, (float) local182 / 65536.0F);
					local195 = this.aClass256_1.method5356(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static450.anIntArray524[local182] < -32768) {
				Static450.anIntArray524[local182] = -32768;
			}
			if (Static450.anIntArray524[local182] > 32767) {
				Static450.anIntArray524[local182] = 32767;
			}
		}
		return Static450.anIntArray524;
	}
}
