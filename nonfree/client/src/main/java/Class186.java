import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class186 {

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "[I")
	private static final int[] anIntArray382 = new int[32768];

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "[I")
	private static final int[] anIntArray381;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!ra;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "Lclient!ra;")
	private Class287 aClass287_2;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Lclient!ra;")
	private Class287 aClass287_3;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "Lclient!ra;")
	private Class287 aClass287_4;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Lclient!ra;")
	private Class287 aClass287_5;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "Lclient!ra;")
	private Class287 aClass287_6;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "Lclient!eha;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "Lclient!ra;")
	private Class287 aClass287_7;

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "Lclient!ra;")
	private Class287 aClass287_8;

	@OriginalMember(owner = "client!laa", name = "s", descriptor = "Lclient!ra;")
	private Class287 aClass287_9;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
	public int anInt6430 = 0;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "[I")
	private final int[] anIntArray379 = new int[5];

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "[I")
	private final int[] anIntArray380 = new int[5];

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
	private int anInt6432 = 100;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
	public int anInt6431 = 500;

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "[I")
	private final int[] anIntArray385 = new int[5];

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "I")
	private int anInt6433 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray382[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray381 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray381[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)I")
	private int method5475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray381[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray382[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!cea;)V")
	public void method5476(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass287_6 = new Class287();
		this.aClass287_6.method7461(arg0);
		this.aClass287_1 = new Class287();
		this.aClass287_1.method7461(arg0);
		@Pc(21) int local21 = arg0.method8383();
		if (local21 != 0) {
			arg0.anInt10066--;
			this.aClass287_4 = new Class287();
			this.aClass287_4.method7461(arg0);
			this.aClass287_9 = new Class287();
			this.aClass287_9.method7461(arg0);
		}
		local21 = arg0.method8383();
		if (local21 != 0) {
			arg0.anInt10066--;
			this.aClass287_2 = new Class287();
			this.aClass287_2.method7461(arg0);
			this.aClass287_8 = new Class287();
			this.aClass287_8.method7461(arg0);
		}
		local21 = arg0.method8383();
		if (local21 != 0) {
			arg0.anInt10066--;
			this.aClass287_3 = new Class287();
			this.aClass287_3.method7461(arg0);
			this.aClass287_7 = new Class287();
			this.aClass287_7.method7461(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8378();
			if (local114 == 0) {
				break;
			}
			this.anIntArray379[local109] = local114;
			this.anIntArray380[local109] = arg0.method8358();
			this.anIntArray385[local109] = arg0.method8378();
		}
		this.anInt6433 = arg0.method8378();
		this.anInt6432 = arg0.method8378();
		this.anInt6431 = arg0.method8326();
		this.anInt6430 = arg0.method8326();
		this.aClass92_1 = new Class92();
		this.aClass287_5 = new Class287();
		this.aClass92_1.method2958(arg0, this.aClass287_5);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)[I")
	public int[] method5478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static653.method7719(Static311.anIntArray378, 0, arg0);
		if (arg1 < 10) {
			return Static311.anIntArray378;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass287_6.method7462();
		this.aClass287_1.method7462();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass287_4 != null) {
			this.aClass287_4.method7462();
			this.aClass287_9.method7462();
			local24 = (int) ((double) (this.aClass287_4.anInt8895 - this.aClass287_4.anInt8896) * 32.768D / local16);
			local26 = (int) ((double) this.aClass287_4.anInt8896 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass287_2 != null) {
			this.aClass287_2.method7462();
			this.aClass287_8.method7462();
			local63 = (int) ((double) (this.aClass287_2.anInt8895 - this.aClass287_2.anInt8896) * 32.768D / local16);
			local65 = (int) ((double) this.aClass287_2.anInt8896 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray379[local102] != 0) {
				Static311.anIntArray388[local102] = 0;
				Static311.anIntArray383[local102] = (int) ((double) this.anIntArray385[local102] * local16);
				Static311.anIntArray387[local102] = (this.anIntArray379[local102] << 14) / 100;
				Static311.anIntArray386[local102] = (int) ((double) (this.aClass287_6.anInt8895 - this.aClass287_6.anInt8896) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray380[local102]) / local16);
				Static311.anIntArray384[local102] = (int) ((double) this.aClass287_6.anInt8896 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass287_6.method7460(arg0);
			local187 = this.aClass287_1.method7460(arg0);
			if (this.aClass287_4 != null) {
				local195 = this.aClass287_4.method7460(arg0);
				local200 = this.aClass287_9.method7460(arg0);
				local182 += this.method5475(local28, local200, this.aClass287_4.anInt8893) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass287_2 != null) {
				local195 = this.aClass287_2.method7460(arg0);
				local200 = this.aClass287_8.method7460(arg0);
				local187 = local187 * ((this.method5475(local67, local200, this.aClass287_2.anInt8893) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray379[local195] != 0) {
					local200 = local176 + Static311.anIntArray383[local195];
					if (local200 < arg0) {
						Static311.anIntArray378[local200] += this.method5475(Static311.anIntArray388[local195], local187 * Static311.anIntArray387[local195] >> 15, this.aClass287_6.anInt8893);
						Static311.anIntArray388[local195] += (local182 * Static311.anIntArray386[local195] >> 16) + Static311.anIntArray384[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass287_3 != null) {
			this.aClass287_3.method7462();
			this.aClass287_7.method7462();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass287_3.method7460(arg0);
				local352 = this.aClass287_7.method7460(arg0);
				if (local339) {
					local187 = this.aClass287_3.anInt8896 + ((this.aClass287_3.anInt8895 - this.aClass287_3.anInt8896) * local347 >> 8);
				} else {
					local187 = this.aClass287_3.anInt8896 + ((this.aClass287_3.anInt8895 - this.aClass287_3.anInt8896) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static311.anIntArray378[local200] = 0;
				}
			}
		}
		if (this.anInt6433 > 0 && this.anInt6432 > 0) {
			local182 = (int) ((double) this.anInt6433 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static311.anIntArray378[local187] += Static311.anIntArray378[local187 - local182] * this.anInt6432 / 100;
			}
		}
		if (this.aClass92_1.anIntArray157[0] > 0 || this.aClass92_1.anIntArray157[1] > 0) {
			this.aClass287_5.method7462();
			local182 = this.aClass287_5.method7460(arg0 + 1);
			local187 = this.aClass92_1.method2963(0, (float) local182 / 65536.0F);
			local195 = this.aClass92_1.method2963(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static311.anIntArray378[local200 + local187] * (long) Static125.anInt3209 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static311.anIntArray378[local200 + local187 - local519 - 1] * (long) Static125.anIntArrayArray15[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static311.anIntArray378[local200 - local549 - 1] * (long) Static125.anIntArrayArray15[1][local549] >> 16);
					}
					Static311.anIntArray378[local200] = local352;
					local182 = this.aClass287_5.method7460(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static311.anIntArray378[local200 + local187] * (long) Static125.anInt3209 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static311.anIntArray378[local200 + local187 - local519 - 1] * (long) Static125.anIntArrayArray15[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static311.anIntArray378[local200 - local549 - 1] * (long) Static125.anIntArrayArray15[1][local549] >> 16);
						}
						Static311.anIntArray378[local200] = local352;
						local182 = this.aClass287_5.method7460(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static311.anIntArray378[local200 + local187 - local519 - 1] * (long) Static125.anIntArrayArray15[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static311.anIntArray378[local200 - local549 - 1] * (long) Static125.anIntArrayArray15[1][local549] >> 16);
							}
							Static311.anIntArray378[local200] = local352;
							this.aClass287_5.method7460(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass92_1.method2963(0, (float) local182 / 65536.0F);
					local195 = this.aClass92_1.method2963(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static311.anIntArray378[local182] < -32768) {
				Static311.anIntArray378[local182] = -32768;
			}
			if (Static311.anIntArray378[local182] > 32767) {
				Static311.anIntArray378[local182] = 32767;
			}
		}
		return Static311.anIntArray378;
	}
}
