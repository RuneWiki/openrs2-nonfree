import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class205 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
	private static final int[] anIntArray369 = new int[32768];

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
	private static final int[] anIntArray371;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "Lclient!go;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Lclient!go;")
	private Class93 aClass93_2;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!go;")
	private Class93 aClass93_3;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!go;")
	private Class93 aClass93_4;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "Lclient!go;")
	private Class93 aClass93_5;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "Lclient!go;")
	private Class93 aClass93_6;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!go;")
	private Class93 aClass93_7;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!go;")
	private Class93 aClass93_8;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "Lclient!ql;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Lclient!go;")
	private Class93 aClass93_9;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public int anInt5530 = 500;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	private int anInt5529 = 0;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
	private final int[] anIntArray372 = new int[5];

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "[I")
	private final int[] anIntArray373 = new int[5];

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	private int anInt5531 = 100;

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
	public int anInt5532 = 0;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "[I")
	private final int[] anIntArray379 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray369[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray371 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray371[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
	private int method4616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray371[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray369[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ae;)V")
	public void method4617(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aClass93_6 = new Class93();
		this.aClass93_6.method2379(arg0);
		this.aClass93_8 = new Class93();
		this.aClass93_8.method2379(arg0);
		@Pc(21) int local21 = arg0.method6433();
		if (local21 != 0) {
			arg0.anInt7898--;
			this.aClass93_5 = new Class93();
			this.aClass93_5.method2379(arg0);
			this.aClass93_7 = new Class93();
			this.aClass93_7.method2379(arg0);
		}
		local21 = arg0.method6433();
		if (local21 != 0) {
			arg0.anInt7898--;
			this.aClass93_3 = new Class93();
			this.aClass93_3.method2379(arg0);
			this.aClass93_9 = new Class93();
			this.aClass93_9.method2379(arg0);
		}
		local21 = arg0.method6433();
		if (local21 != 0) {
			arg0.anInt7898--;
			this.aClass93_4 = new Class93();
			this.aClass93_4.method2379(arg0);
			this.aClass93_2 = new Class93();
			this.aClass93_2.method2379(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6445();
			if (local114 == 0) {
				break;
			}
			this.anIntArray379[local109] = local114;
			this.anIntArray373[local109] = arg0.method6471();
			this.anIntArray372[local109] = arg0.method6445();
		}
		this.anInt5529 = arg0.method6445();
		this.anInt5531 = arg0.method6445();
		this.anInt5530 = arg0.method6485();
		this.anInt5532 = arg0.method6485();
		this.aClass208_1 = new Class208();
		this.aClass93_1 = new Class93();
		this.aClass208_1.method4645(arg0, this.aClass93_1);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	public int[] method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method6340(Static319.anIntArray370, 0, arg0);
		if (arg1 < 10) {
			return Static319.anIntArray370;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass93_6.method2377();
		this.aClass93_8.method2377();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass93_5 != null) {
			this.aClass93_5.method2377();
			this.aClass93_7.method2377();
			local24 = (int) ((double) (this.aClass93_5.anInt2836 - this.aClass93_5.anInt2838) * 32.768D / local16);
			local26 = (int) ((double) this.aClass93_5.anInt2838 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass93_3 != null) {
			this.aClass93_3.method2377();
			this.aClass93_9.method2377();
			local63 = (int) ((double) (this.aClass93_3.anInt2836 - this.aClass93_3.anInt2838) * 32.768D / local16);
			local65 = (int) ((double) this.aClass93_3.anInt2838 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray379[local102] != 0) {
				Static319.anIntArray374[local102] = 0;
				Static319.anIntArray378[local102] = (int) ((double) this.anIntArray372[local102] * local16);
				Static319.anIntArray376[local102] = (this.anIntArray379[local102] << 14) / 100;
				Static319.anIntArray375[local102] = (int) ((double) (this.aClass93_6.anInt2836 - this.aClass93_6.anInt2838) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray373[local102]) / local16);
				Static319.anIntArray377[local102] = (int) ((double) this.aClass93_6.anInt2838 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass93_6.method2378(arg0);
			local187 = this.aClass93_8.method2378(arg0);
			if (this.aClass93_5 != null) {
				local195 = this.aClass93_5.method2378(arg0);
				local200 = this.aClass93_7.method2378(arg0);
				local182 += this.method4616(local28, local200, this.aClass93_5.anInt2839) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass93_3 != null) {
				local195 = this.aClass93_3.method2378(arg0);
				local200 = this.aClass93_9.method2378(arg0);
				local187 = local187 * ((this.method4616(local67, local200, this.aClass93_3.anInt2839) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray379[local195] != 0) {
					local200 = local176 + Static319.anIntArray378[local195];
					if (local200 < arg0) {
						Static319.anIntArray370[local200] += this.method4616(Static319.anIntArray374[local195], local187 * Static319.anIntArray376[local195] >> 15, this.aClass93_6.anInt2839);
						Static319.anIntArray374[local195] += (local182 * Static319.anIntArray375[local195] >> 16) + Static319.anIntArray377[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass93_4 != null) {
			this.aClass93_4.method2377();
			this.aClass93_2.method2377();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass93_4.method2378(arg0);
				local352 = this.aClass93_2.method2378(arg0);
				if (local339) {
					local187 = this.aClass93_4.anInt2838 + ((this.aClass93_4.anInt2836 - this.aClass93_4.anInt2838) * local347 >> 8);
				} else {
					local187 = this.aClass93_4.anInt2838 + ((this.aClass93_4.anInt2836 - this.aClass93_4.anInt2838) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static319.anIntArray370[local200] = 0;
				}
			}
		}
		if (this.anInt5529 > 0 && this.anInt5531 > 0) {
			local182 = (int) ((double) this.anInt5529 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static319.anIntArray370[local187] += Static319.anIntArray370[local187 - local182] * this.anInt5531 / 100;
			}
		}
		if (this.aClass208_1.anIntArray383[0] > 0 || this.aClass208_1.anIntArray383[1] > 0) {
			this.aClass93_1.method2377();
			local182 = this.aClass93_1.method2378(arg0 + 1);
			local187 = this.aClass208_1.method4648(0, (float) local182 / 65536.0F);
			local195 = this.aClass208_1.method4648(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static319.anIntArray370[local200 + local187] * (long) Static323.anInt5559 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static319.anIntArray370[local200 + local187 - local519 - 1] * (long) Static323.anIntArrayArray33[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static319.anIntArray370[local200 - local549 - 1] * (long) Static323.anIntArrayArray33[1][local549] >> 16);
					}
					Static319.anIntArray370[local200] = local352;
					local182 = this.aClass93_1.method2378(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static319.anIntArray370[local200 + local187] * (long) Static323.anInt5559 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static319.anIntArray370[local200 + local187 - local519 - 1] * (long) Static323.anIntArrayArray33[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static319.anIntArray370[local200 - local549 - 1] * (long) Static323.anIntArrayArray33[1][local549] >> 16);
						}
						Static319.anIntArray370[local200] = local352;
						local182 = this.aClass93_1.method2378(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static319.anIntArray370[local200 + local187 - local519 - 1] * (long) Static323.anIntArrayArray33[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static319.anIntArray370[local200 - local549 - 1] * (long) Static323.anIntArrayArray33[1][local549] >> 16);
							}
							Static319.anIntArray370[local200] = local352;
							this.aClass93_1.method2378(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass208_1.method4648(0, (float) local182 / 65536.0F);
					local195 = this.aClass208_1.method4648(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static319.anIntArray370[local182] < -32768) {
				Static319.anIntArray370[local182] = -32768;
			}
			if (Static319.anIntArray370[local182] > 32767) {
				Static319.anIntArray370[local182] = 32767;
			}
		}
		return Static319.anIntArray370;
	}
}
