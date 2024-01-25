import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class145 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
	private static final int[] anIntArray439 = new int[32768];

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "[I")
	private static final int[] anIntArray440;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!sr;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!sr;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Lclient!sr;")
	private Class217 aClass217_3;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Lclient!sr;")
	private Class217 aClass217_4;

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "Lclient!sr;")
	private Class217 aClass217_5;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Lclient!sr;")
	private Class217 aClass217_6;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "Lclient!sr;")
	private Class217 aClass217_7;

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "Lclient!ka;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Lclient!sr;")
	private Class217 aClass217_8;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "Lclient!sr;")
	private Class217 aClass217_9;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public int anInt3609 = 500;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
	private final int[] anIntArray438 = new int[5];

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
	private int anInt3611 = 0;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public int anInt3610 = 0;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "[I")
	private final int[] anIntArray444 = new int[5];

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
	private final int[] anIntArray441 = new int[5];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	private int anInt3608 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray439[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray440 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray440[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	public int[] method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static404.method4343(Static206.anIntArray437, 0, arg0);
		if (arg1 < 10) {
			return Static206.anIntArray437;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass217_9.method4767();
		this.aClass217_4.method4767();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass217_1 != null) {
			this.aClass217_1.method4767();
			this.aClass217_8.method4767();
			local24 = (int) ((double) (this.aClass217_1.anInt5521 - this.aClass217_1.anInt5522) * 32.768D / local16);
			local26 = (int) ((double) this.aClass217_1.anInt5522 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass217_2 != null) {
			this.aClass217_2.method4767();
			this.aClass217_5.method4767();
			local63 = (int) ((double) (this.aClass217_2.anInt5521 - this.aClass217_2.anInt5522) * 32.768D / local16);
			local65 = (int) ((double) this.aClass217_2.anInt5522 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray438[local102] != 0) {
				Static206.anIntArray446[local102] = 0;
				Static206.anIntArray445[local102] = (int) ((double) this.anIntArray444[local102] * local16);
				Static206.anIntArray443[local102] = (this.anIntArray438[local102] << 14) / 100;
				Static206.anIntArray447[local102] = (int) ((double) (this.aClass217_9.anInt5521 - this.aClass217_9.anInt5522) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray441[local102]) / local16);
				Static206.anIntArray442[local102] = (int) ((double) this.aClass217_9.anInt5522 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass217_9.method4764(arg0);
			local187 = this.aClass217_4.method4764(arg0);
			if (this.aClass217_1 != null) {
				local195 = this.aClass217_1.method4764(arg0);
				local200 = this.aClass217_8.method4764(arg0);
				local182 += this.method2942(local28, local200, this.aClass217_1.anInt5520) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass217_2 != null) {
				local195 = this.aClass217_2.method4764(arg0);
				local200 = this.aClass217_5.method4764(arg0);
				local187 = local187 * ((this.method2942(local67, local200, this.aClass217_2.anInt5520) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray438[local195] != 0) {
					local200 = local176 + Static206.anIntArray445[local195];
					if (local200 < arg0) {
						Static206.anIntArray437[local200] += this.method2942(Static206.anIntArray446[local195], local187 * Static206.anIntArray443[local195] >> 15, this.aClass217_9.anInt5520);
						Static206.anIntArray446[local195] += (local182 * Static206.anIntArray447[local195] >> 16) + Static206.anIntArray442[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass217_3 != null) {
			this.aClass217_3.method4767();
			this.aClass217_7.method4767();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass217_3.method4764(arg0);
				local352 = this.aClass217_7.method4764(arg0);
				if (local339) {
					local187 = this.aClass217_3.anInt5522 + ((this.aClass217_3.anInt5521 - this.aClass217_3.anInt5522) * local347 >> 8);
				} else {
					local187 = this.aClass217_3.anInt5522 + ((this.aClass217_3.anInt5521 - this.aClass217_3.anInt5522) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static206.anIntArray437[local200] = 0;
				}
			}
		}
		if (this.anInt3611 > 0 && this.anInt3608 > 0) {
			local182 = (int) ((double) this.anInt3611 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static206.anIntArray437[local187] += Static206.anIntArray437[local187 - local182] * this.anInt3608 / 100;
			}
		}
		if (this.aClass128_1.anIntArray386[0] > 0 || this.aClass128_1.anIntArray386[1] > 0) {
			this.aClass217_6.method4767();
			local182 = this.aClass217_6.method4764(arg0 + 1);
			local187 = this.aClass128_1.method2653(0, (float) local182 / 65536.0F);
			local195 = this.aClass128_1.method2653(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static206.anIntArray437[local200 + local187] * (long) Static184.anInt3255 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static206.anIntArray437[local200 + local187 - local519 - 1] * (long) Static184.anIntArrayArray36[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static206.anIntArray437[local200 - local549 - 1] * (long) Static184.anIntArrayArray36[1][local549] >> 16);
					}
					Static206.anIntArray437[local200] = local352;
					local182 = this.aClass217_6.method4764(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static206.anIntArray437[local200 + local187] * (long) Static184.anInt3255 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static206.anIntArray437[local200 + local187 - local519 - 1] * (long) Static184.anIntArrayArray36[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static206.anIntArray437[local200 - local549 - 1] * (long) Static184.anIntArrayArray36[1][local549] >> 16);
						}
						Static206.anIntArray437[local200] = local352;
						local182 = this.aClass217_6.method4764(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static206.anIntArray437[local200 + local187 - local519 - 1] * (long) Static184.anIntArrayArray36[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static206.anIntArray437[local200 - local549 - 1] * (long) Static184.anIntArrayArray36[1][local549] >> 16);
							}
							Static206.anIntArray437[local200] = local352;
							this.aClass217_6.method4764(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass128_1.method2653(0, (float) local182 / 65536.0F);
					local195 = this.aClass128_1.method2653(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static206.anIntArray437[local182] < -32768) {
				Static206.anIntArray437[local182] = -32768;
			}
			if (Static206.anIntArray437[local182] > 32767) {
				Static206.anIntArray437[local182] = 32767;
			}
		}
		return Static206.anIntArray437;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
	private int method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray440[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray439[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!re;)V")
	public void method2944(@OriginalArg(0) Class1_Sub33 arg0) {
		this.aClass217_9 = new Class217();
		this.aClass217_9.method4766(arg0);
		this.aClass217_4 = new Class217();
		this.aClass217_4.method4766(arg0);
		@Pc(21) int local21 = arg0.method5174();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass217_1 = new Class217();
			this.aClass217_1.method4766(arg0);
			this.aClass217_8 = new Class217();
			this.aClass217_8.method4766(arg0);
		}
		local21 = arg0.method5174();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass217_2 = new Class217();
			this.aClass217_2.method4766(arg0);
			this.aClass217_5 = new Class217();
			this.aClass217_5.method4766(arg0);
		}
		local21 = arg0.method5174();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass217_3 = new Class217();
			this.aClass217_3.method4766(arg0);
			this.aClass217_7 = new Class217();
			this.aClass217_7.method4766(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5181();
			if (local114 == 0) {
				break;
			}
			this.anIntArray438[local109] = local114;
			this.anIntArray441[local109] = arg0.method5136();
			this.anIntArray444[local109] = arg0.method5181();
		}
		this.anInt3611 = arg0.method5181();
		this.anInt3608 = arg0.method5181();
		this.anInt3609 = arg0.method5177();
		this.anInt3610 = arg0.method5177();
		this.aClass128_1 = new Class128();
		this.aClass217_6 = new Class217();
		this.aClass128_1.method2656(arg0, this.aClass217_6);
	}
}
