import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class9 {

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "[I")
	private static final int[] anIntArray19 = new int[32768];

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "[I")
	private static final int[] anIntArray18;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "Lclient!iea;")
	private Class156 aClass156_1;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!iea;")
	private Class156 aClass156_2;

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "Lclient!iea;")
	private Class156 aClass156_3;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "Lclient!iea;")
	private Class156 aClass156_4;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "Lclient!iea;")
	private Class156 aClass156_5;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Lclient!hca;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "Lclient!iea;")
	private Class156 aClass156_6;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "Lclient!iea;")
	private Class156 aClass156_7;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "Lclient!iea;")
	private Class156 aClass156_8;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "Lclient!iea;")
	private Class156 aClass156_9;

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
	private int anInt232 = 100;

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "[I")
	private final int[] anIntArray17 = new int[5];

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "[I")
	private final int[] anIntArray16 = new int[5];

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
	private int anInt234 = 0;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
	public int anInt233 = 500;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
	public int anInt231 = 0;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "[I")
	private final int[] anIntArray15 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray19[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray18 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray18[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I")
	private int method179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray18[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray19[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!gk;)V")
	public void method180(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aClass156_7 = new Class156();
		this.aClass156_7.method2749(arg0);
		this.aClass156_4 = new Class156();
		this.aClass156_4.method2749(arg0);
		@Pc(21) int local21 = arg0.method4464();
		if (local21 != 0) {
			arg0.anInt5186--;
			this.aClass156_8 = new Class156();
			this.aClass156_8.method2749(arg0);
			this.aClass156_3 = new Class156();
			this.aClass156_3.method2749(arg0);
		}
		local21 = arg0.method4464();
		if (local21 != 0) {
			arg0.anInt5186--;
			this.aClass156_6 = new Class156();
			this.aClass156_6.method2749(arg0);
			this.aClass156_5 = new Class156();
			this.aClass156_5.method2749(arg0);
		}
		local21 = arg0.method4464();
		if (local21 != 0) {
			arg0.anInt5186--;
			this.aClass156_1 = new Class156();
			this.aClass156_1.method2749(arg0);
			this.aClass156_2 = new Class156();
			this.aClass156_2.method2749(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4458();
			if (local114 == 0) {
				break;
			}
			this.anIntArray16[local109] = local114;
			this.anIntArray17[local109] = arg0.method4507();
			this.anIntArray15[local109] = arg0.method4458();
		}
		this.anInt234 = arg0.method4458();
		this.anInt232 = arg0.method4458();
		this.anInt233 = arg0.method4518();
		this.anInt231 = arg0.method4518();
		this.aClass138_1 = new Class138();
		this.aClass156_9 = new Class156();
		this.aClass138_1.method2419(arg0, this.aClass156_9);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I")
	public int[] method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static598.method4265(Static10.anIntArray14, 0, arg0);
		if (arg1 < 10) {
			return Static10.anIntArray14;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass156_7.method2752();
		this.aClass156_4.method2752();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass156_8 != null) {
			this.aClass156_8.method2752();
			this.aClass156_3.method2752();
			local24 = (int) ((double) (this.aClass156_8.anInt3297 - this.aClass156_8.anInt3294) * 32.768D / local16);
			local26 = (int) ((double) this.aClass156_8.anInt3294 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass156_6 != null) {
			this.aClass156_6.method2752();
			this.aClass156_5.method2752();
			local63 = (int) ((double) (this.aClass156_6.anInt3297 - this.aClass156_6.anInt3294) * 32.768D / local16);
			local65 = (int) ((double) this.aClass156_6.anInt3294 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray16[local102] != 0) {
				Static10.anIntArray24[local102] = 0;
				Static10.anIntArray20[local102] = (int) ((double) this.anIntArray15[local102] * local16);
				Static10.anIntArray22[local102] = (this.anIntArray16[local102] << 14) / 100;
				Static10.anIntArray23[local102] = (int) ((double) (this.aClass156_7.anInt3297 - this.aClass156_7.anInt3294) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray17[local102]) / local16);
				Static10.anIntArray21[local102] = (int) ((double) this.aClass156_7.anInt3294 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass156_7.method2750(arg0);
			local187 = this.aClass156_4.method2750(arg0);
			if (this.aClass156_8 != null) {
				local195 = this.aClass156_8.method2750(arg0);
				local200 = this.aClass156_3.method2750(arg0);
				local182 += this.method179(local28, local200, this.aClass156_8.anInt3295) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass156_6 != null) {
				local195 = this.aClass156_6.method2750(arg0);
				local200 = this.aClass156_5.method2750(arg0);
				local187 = local187 * ((this.method179(local67, local200, this.aClass156_6.anInt3295) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray16[local195] != 0) {
					local200 = local176 + Static10.anIntArray20[local195];
					if (local200 < arg0) {
						Static10.anIntArray14[local200] += this.method179(Static10.anIntArray24[local195], local187 * Static10.anIntArray22[local195] >> 15, this.aClass156_7.anInt3295);
						Static10.anIntArray24[local195] += (local182 * Static10.anIntArray23[local195] >> 16) + Static10.anIntArray21[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass156_1 != null) {
			this.aClass156_1.method2752();
			this.aClass156_2.method2752();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass156_1.method2750(arg0);
				local352 = this.aClass156_2.method2750(arg0);
				if (local339) {
					local187 = this.aClass156_1.anInt3294 + ((this.aClass156_1.anInt3297 - this.aClass156_1.anInt3294) * local347 >> 8);
				} else {
					local187 = this.aClass156_1.anInt3294 + ((this.aClass156_1.anInt3297 - this.aClass156_1.anInt3294) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static10.anIntArray14[local200] = 0;
				}
			}
		}
		if (this.anInt234 > 0 && this.anInt232 > 0) {
			local182 = (int) ((double) this.anInt234 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static10.anIntArray14[local187] += Static10.anIntArray14[local187 - local182] * this.anInt232 / 100;
			}
		}
		if (this.aClass138_1.anIntArray236[0] > 0 || this.aClass138_1.anIntArray236[1] > 0) {
			this.aClass156_9.method2752();
			local182 = this.aClass156_9.method2750(arg0 + 1);
			local187 = this.aClass138_1.method2421(0, (float) local182 / 65536.0F);
			local195 = this.aClass138_1.method2421(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static10.anIntArray14[local200 + local187] * (long) Static192.anInt2810 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static10.anIntArray14[local200 + local187 - local519 - 1] * (long) Static192.anIntArrayArray33[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static10.anIntArray14[local200 - local549 - 1] * (long) Static192.anIntArrayArray33[1][local549] >> 16);
					}
					Static10.anIntArray14[local200] = local352;
					local182 = this.aClass156_9.method2750(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static10.anIntArray14[local200 + local187] * (long) Static192.anInt2810 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static10.anIntArray14[local200 + local187 - local519 - 1] * (long) Static192.anIntArrayArray33[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static10.anIntArray14[local200 - local549 - 1] * (long) Static192.anIntArrayArray33[1][local549] >> 16);
						}
						Static10.anIntArray14[local200] = local352;
						local182 = this.aClass156_9.method2750(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static10.anIntArray14[local200 + local187 - local519 - 1] * (long) Static192.anIntArrayArray33[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static10.anIntArray14[local200 - local549 - 1] * (long) Static192.anIntArrayArray33[1][local549] >> 16);
							}
							Static10.anIntArray14[local200] = local352;
							this.aClass156_9.method2750(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass138_1.method2421(0, (float) local182 / 65536.0F);
					local195 = this.aClass138_1.method2421(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static10.anIntArray14[local182] < -32768) {
				Static10.anIntArray14[local182] = -32768;
			}
			if (Static10.anIntArray14[local182] > 32767) {
				Static10.anIntArray14[local182] = 32767;
			}
		}
		return Static10.anIntArray14;
	}
}
