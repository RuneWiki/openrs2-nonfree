import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class58 {

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "[I")
	private static final int[] anIntArray379 = new int[32768];

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
	private static final int[] anIntArray378;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!j;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!we;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!j;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!j;")
	private Class39 aClass39_3;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!j;")
	private Class39 aClass39_4;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!j;")
	private Class39 aClass39_5;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!j;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!j;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!j;")
	private Class39 aClass39_8;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!j;")
	private Class39 aClass39_9;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	private int anInt3328 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	private final int[] anIntArray376 = new int[5];

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	private int anInt3330 = 100;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public int anInt3331 = 500;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[I")
	private final int[] anIntArray377 = new int[5];

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[I")
	private final int[] anIntArray380 = new int[5];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt3329 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray379[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray378 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray378[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!og;)V")
	public void method2573(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass39_6 = new Class39();
		this.aClass39_6.method1913(arg0);
		this.aClass39_9 = new Class39();
		this.aClass39_9.method1913(arg0);
		@Pc(21) int local21 = arg0.method218();
		if (local21 != 0) {
			arg0.anInt273--;
			this.aClass39_3 = new Class39();
			this.aClass39_3.method1913(arg0);
			this.aClass39_4 = new Class39();
			this.aClass39_4.method1913(arg0);
		}
		local21 = arg0.method218();
		if (local21 != 0) {
			arg0.anInt273--;
			this.aClass39_5 = new Class39();
			this.aClass39_5.method1913(arg0);
			this.aClass39_2 = new Class39();
			this.aClass39_2.method1913(arg0);
		}
		local21 = arg0.method218();
		if (local21 != 0) {
			arg0.anInt273--;
			this.aClass39_1 = new Class39();
			this.aClass39_1.method1913(arg0);
			this.aClass39_8 = new Class39();
			this.aClass39_8.method1913(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method237();
			if (local114 == 0) {
				break;
			}
			this.anIntArray376[local109] = local114;
			this.anIntArray377[local109] = arg0.method217();
			this.anIntArray380[local109] = arg0.method237();
		}
		this.anInt3328 = arg0.method237();
		this.anInt3330 = arg0.method237();
		this.anInt3331 = arg0.method234();
		this.anInt3329 = arg0.method234();
		this.aClass93_1 = new Class93();
		this.aClass39_7 = new Class39();
		this.aClass93_1.method3546(arg0, this.aClass39_7);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
	public int[] method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static203.method2769(Static121.anIntArray381, 0, arg0);
		if (arg1 < 10) {
			return Static121.anIntArray381;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass39_6.method1912();
		this.aClass39_9.method1912();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass39_3 != null) {
			this.aClass39_3.method1912();
			this.aClass39_4.method1912();
			local24 = (int) ((double) (this.aClass39_3.anInt2414 - this.aClass39_3.anInt2411) * 32.768D / local16);
			local26 = (int) ((double) this.aClass39_3.anInt2411 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass39_5 != null) {
			this.aClass39_5.method1912();
			this.aClass39_2.method1912();
			local63 = (int) ((double) (this.aClass39_5.anInt2414 - this.aClass39_5.anInt2411) * 32.768D / local16);
			local65 = (int) ((double) this.aClass39_5.anInt2411 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray376[local102] != 0) {
				Static121.anIntArray383[local102] = 0;
				Static121.anIntArray384[local102] = (int) ((double) this.anIntArray380[local102] * local16);
				Static121.anIntArray385[local102] = (this.anIntArray376[local102] << 14) / 100;
				Static121.anIntArray386[local102] = (int) ((double) (this.aClass39_6.anInt2414 - this.aClass39_6.anInt2411) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray377[local102]) / local16);
				Static121.anIntArray382[local102] = (int) ((double) this.aClass39_6.anInt2411 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass39_6.method1914(arg0);
			local187 = this.aClass39_9.method1914(arg0);
			if (this.aClass39_3 != null) {
				local195 = this.aClass39_3.method1914(arg0);
				local200 = this.aClass39_4.method1914(arg0);
				local182 += this.method2576(local28, local200, this.aClass39_3.anInt2413) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass39_5 != null) {
				local195 = this.aClass39_5.method1914(arg0);
				local200 = this.aClass39_2.method1914(arg0);
				local187 = local187 * ((this.method2576(local67, local200, this.aClass39_5.anInt2413) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray376[local195] != 0) {
					local200 = local176 + Static121.anIntArray384[local195];
					if (local200 < arg0) {
						Static121.anIntArray381[local200] += this.method2576(Static121.anIntArray383[local195], local187 * Static121.anIntArray385[local195] >> 15, this.aClass39_6.anInt2413);
						Static121.anIntArray383[local195] += (local182 * Static121.anIntArray386[local195] >> 16) + Static121.anIntArray382[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass39_1 != null) {
			this.aClass39_1.method1912();
			this.aClass39_8.method1912();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass39_1.method1914(arg0);
				local352 = this.aClass39_8.method1914(arg0);
				if (local339) {
					local187 = this.aClass39_1.anInt2411 + ((this.aClass39_1.anInt2414 - this.aClass39_1.anInt2411) * local347 >> 8);
				} else {
					local187 = this.aClass39_1.anInt2411 + ((this.aClass39_1.anInt2414 - this.aClass39_1.anInt2411) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static121.anIntArray381[local200] = 0;
				}
			}
		}
		if (this.anInt3328 > 0 && this.anInt3330 > 0) {
			local182 = (int) ((double) this.anInt3328 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static121.anIntArray381[local187] += Static121.anIntArray381[local187 - local182] * this.anInt3330 / 100;
			}
		}
		if (this.aClass93_1.anIntArray502[0] > 0 || this.aClass93_1.anIntArray502[1] > 0) {
			this.aClass39_7.method1912();
			local182 = this.aClass39_7.method1914(arg0 + 1);
			local187 = this.aClass93_1.method3544(0, (float) local182 / 65536.0F);
			local195 = this.aClass93_1.method3544(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static121.anIntArray381[local200 + local187] * (long) Static195.anInt4623 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static121.anIntArray381[local200 + local187 - local519 - 1] * (long) Static195.anIntArrayArray34[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static121.anIntArray381[local200 - local549 - 1] * (long) Static195.anIntArrayArray34[1][local549] >> 16);
					}
					Static121.anIntArray381[local200] = local352;
					local182 = this.aClass39_7.method1914(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static121.anIntArray381[local200 + local187] * (long) Static195.anInt4623 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static121.anIntArray381[local200 + local187 - local519 - 1] * (long) Static195.anIntArrayArray34[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static121.anIntArray381[local200 - local549 - 1] * (long) Static195.anIntArrayArray34[1][local549] >> 16);
						}
						Static121.anIntArray381[local200] = local352;
						local182 = this.aClass39_7.method1914(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static121.anIntArray381[local200 + local187 - local519 - 1] * (long) Static195.anIntArrayArray34[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static121.anIntArray381[local200 - local549 - 1] * (long) Static195.anIntArrayArray34[1][local549] >> 16);
							}
							Static121.anIntArray381[local200] = local352;
							this.aClass39_7.method1914(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass93_1.method3544(0, (float) local182 / 65536.0F);
					local195 = this.aClass93_1.method3544(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static121.anIntArray381[local182] < -32768) {
				Static121.anIntArray381[local182] = -32768;
			}
			if (Static121.anIntArray381[local182] > 32767) {
				Static121.anIntArray381[local182] = 32767;
			}
		}
		return Static121.anIntArray381;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	private int method2576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray378[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray379[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
