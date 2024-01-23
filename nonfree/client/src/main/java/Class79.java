import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class79 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
	private static int[] anIntArray170 = new int[32768];

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
	private static int[] anIntArray173;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!qe;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!qe;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!sb;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!qe;")
	private Class136 aClass136_3;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!qe;")
	private Class136 aClass136_4;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!qe;")
	private Class136 aClass136_5;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!qe;")
	private Class136 aClass136_6;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!qe;")
	private Class136 aClass136_7;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!qe;")
	private Class136 aClass136_8;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!qe;")
	private Class136 aClass136_9;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt2278 = 0;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
	private int[] anIntArray172 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
	private int[] anIntArray171 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	private int anInt2276 = 100;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private int anInt2277 = 0;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
	private int[] anIntArray175 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public int anInt2279 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray170[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray173 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray173[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I")
	private int method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray173[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray170[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!aj;)V")
	public void method1781(@OriginalArg(0) Class8_Sub2 arg0) {
		this.aClass136_7 = new Class136();
		this.aClass136_7.method3339(arg0);
		this.aClass136_5 = new Class136();
		this.aClass136_5.method3339(arg0);
		@Pc(21) int local21 = arg0.method2334();
		if (local21 != 0) {
			arg0.anInt2955--;
			this.aClass136_9 = new Class136();
			this.aClass136_9.method3339(arg0);
			this.aClass136_8 = new Class136();
			this.aClass136_8.method3339(arg0);
		}
		local21 = arg0.method2334();
		if (local21 != 0) {
			arg0.anInt2955--;
			this.aClass136_1 = new Class136();
			this.aClass136_1.method3339(arg0);
			this.aClass136_6 = new Class136();
			this.aClass136_6.method3339(arg0);
		}
		local21 = arg0.method2334();
		if (local21 != 0) {
			arg0.anInt2955--;
			this.aClass136_2 = new Class136();
			this.aClass136_2.method3339(arg0);
			this.aClass136_4 = new Class136();
			this.aClass136_4.method3339(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method2382();
			if (local116 == 0) {
				break;
			}
			this.anIntArray171[local109] = local116;
			this.anIntArray172[local109] = arg0.method2325();
			this.anIntArray175[local109] = arg0.method2382();
		}
		this.anInt2277 = arg0.method2382();
		this.anInt2276 = arg0.method2382();
		this.anInt2279 = arg0.method2375();
		this.anInt2278 = arg0.method2375();
		this.aClass149_1 = new Class149();
		this.aClass136_3 = new Class136();
		this.aClass149_1.method3597(arg0, this.aClass136_3);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I")
	public int[] method1782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static301.method496(Static110.anIntArray169, 0, arg0);
		if (arg1 < 10) {
			return Static110.anIntArray169;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass136_7.method3336();
		this.aClass136_5.method3336();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass136_9 != null) {
			this.aClass136_9.method3336();
			this.aClass136_8.method3336();
			local24 = (int) ((double) (this.aClass136_9.anInt4373 - this.aClass136_9.anInt4375) * 32.768D / local16);
			local26 = (int) ((double) this.aClass136_9.anInt4375 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass136_1 != null) {
			this.aClass136_1.method3336();
			this.aClass136_6.method3336();
			local63 = (int) ((double) (this.aClass136_1.anInt4373 - this.aClass136_1.anInt4375) * 32.768D / local16);
			local65 = (int) ((double) this.aClass136_1.anInt4375 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray171[local102] != 0) {
				Static110.anIntArray178[local102] = 0;
				Static110.anIntArray179[local102] = (int) ((double) this.anIntArray175[local102] * local16);
				Static110.anIntArray174[local102] = (this.anIntArray171[local102] << 14) / 100;
				Static110.anIntArray177[local102] = (int) ((double) (this.aClass136_7.anInt4373 - this.aClass136_7.anInt4375) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray172[local102]) / local16);
				Static110.anIntArray176[local102] = (int) ((double) this.aClass136_7.anInt4375 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass136_7.method3338(arg0);
			local190 = this.aClass136_5.method3338(arg0);
			if (this.aClass136_9 != null) {
				local198 = this.aClass136_9.method3338(arg0);
				local203 = this.aClass136_8.method3338(arg0);
				local185 += this.method1780(local28, local203, this.aClass136_9.anInt4374) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass136_1 != null) {
				local198 = this.aClass136_1.method3338(arg0);
				local203 = this.aClass136_6.method3338(arg0);
				local190 = local190 * ((this.method1780(local67, local203, this.aClass136_1.anInt4374) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray171[local198] != 0) {
					local203 = local102 + Static110.anIntArray179[local198];
					if (local203 < arg0) {
						Static110.anIntArray169[local203] += this.method1780(Static110.anIntArray178[local198], local190 * Static110.anIntArray174[local198] >> 15, this.aClass136_7.anInt4374);
						Static110.anIntArray178[local198] += (local185 * Static110.anIntArray177[local198] >> 16) + Static110.anIntArray176[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass136_2 != null) {
			this.aClass136_2.method3336();
			this.aClass136_4.method3336();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass136_2.method3338(arg0);
				local356 = this.aClass136_4.method3338(arg0);
				if (local341) {
					local185 = this.aClass136_2.anInt4375 + ((this.aClass136_2.anInt4373 - this.aClass136_2.anInt4375) * local203 >> 8);
				} else {
					local185 = this.aClass136_2.anInt4375 + ((this.aClass136_2.anInt4373 - this.aClass136_2.anInt4375) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static110.anIntArray169[local198] = 0;
				}
			}
		}
		if (this.anInt2277 > 0 && this.anInt2276 > 0) {
			local102 = (int) ((double) this.anInt2277 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static110.anIntArray169[local185] += Static110.anIntArray169[local185 - local102] * this.anInt2276 / 100;
			}
		}
		if (this.aClass149_1.anIntArray357[0] > 0 || this.aClass149_1.anIntArray357[1] > 0) {
			this.aClass136_3.method3336();
			local102 = this.aClass136_3.method3338(arg0 + 1);
			local185 = this.aClass149_1.method3598(0, (float) local102 / 65536.0F);
			local190 = this.aClass149_1.method3598(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static110.anIntArray169[local198 + local185] * (long) Static237.anInt4779 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static110.anIntArray169[local198 + local185 - local523 - 1] * (long) Static237.anIntArrayArray30[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static110.anIntArray169[local198 - local523 - 1] * (long) Static237.anIntArrayArray30[1][local523] >> 16);
					}
					Static110.anIntArray169[local198] = local356;
					local102 = this.aClass136_3.method3338(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static110.anIntArray169[local198 + local185] * (long) Static237.anInt4779 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static110.anIntArray169[local198 + local185 - local523 - 1] * (long) Static237.anIntArrayArray30[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static110.anIntArray169[local198 - local523 - 1] * (long) Static237.anIntArrayArray30[1][local523] >> 16);
						}
						Static110.anIntArray169[local198] = local356;
						local102 = this.aClass136_3.method3338(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static110.anIntArray169[local198 + local185 - local523 - 1] * (long) Static237.anIntArrayArray30[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static110.anIntArray169[local198 - local523 - 1] * (long) Static237.anIntArrayArray30[1][local523] >> 16);
							}
							Static110.anIntArray169[local198] = local356;
							this.aClass136_3.method3338(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass149_1.method3598(0, (float) local102 / 65536.0F);
					local190 = this.aClass149_1.method3598(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static110.anIntArray169[local102] < -32768) {
				Static110.anIntArray169[local102] = -32768;
			}
			if (Static110.anIntArray169[local102] > 32767) {
				Static110.anIntArray169[local102] = 32767;
			}
		}
		return Static110.anIntArray169;
	}
}
