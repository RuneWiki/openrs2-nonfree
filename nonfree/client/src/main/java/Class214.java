import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class214 {

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
	private static final int[] anIntArray388 = new int[32768];

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "[I")
	private static final int[] anIntArray389;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!ao;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!ao;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "Lclient!ao;")
	private Class13 aClass13_3;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Lclient!ao;")
	private Class13 aClass13_4;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!ao;")
	private Class13 aClass13_5;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!ao;")
	private Class13 aClass13_6;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Lclient!ao;")
	private Class13 aClass13_7;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!ao;")
	private Class13 aClass13_8;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Lclient!ju;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!ao;")
	private Class13 aClass13_9;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	private int anInt5995 = 0;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "[I")
	private final int[] anIntArray391 = new int[5];

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	public int anInt5994 = 500;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
	private final int[] anIntArray392 = new int[5];

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
	private final int[] anIntArray390 = new int[5];

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public int anInt5997 = 0;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private int anInt5996 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray388[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray389 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray389[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
	public int[] method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method3350(Static341.anIntArray393, 0, arg0);
		if (arg1 < 10) {
			return Static341.anIntArray393;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass13_3.method230();
		this.aClass13_4.method230();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass13_5 != null) {
			this.aClass13_5.method230();
			this.aClass13_2.method230();
			local24 = (int) ((double) (this.aClass13_5.anInt367 - this.aClass13_5.anInt368) * 32.768D / local16);
			local26 = (int) ((double) this.aClass13_5.anInt368 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass13_7 != null) {
			this.aClass13_7.method230();
			this.aClass13_6.method230();
			local63 = (int) ((double) (this.aClass13_7.anInt367 - this.aClass13_7.anInt368) * 32.768D / local16);
			local65 = (int) ((double) this.aClass13_7.anInt368 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray390[local102] != 0) {
				Static341.anIntArray395[local102] = 0;
				Static341.anIntArray397[local102] = (int) ((double) this.anIntArray392[local102] * local16);
				Static341.anIntArray398[local102] = (this.anIntArray390[local102] << 14) / 100;
				Static341.anIntArray394[local102] = (int) ((double) (this.aClass13_3.anInt367 - this.aClass13_3.anInt368) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray391[local102]) / local16);
				Static341.anIntArray396[local102] = (int) ((double) this.aClass13_3.anInt368 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass13_3.method228(arg0);
			local187 = this.aClass13_4.method228(arg0);
			if (this.aClass13_5 != null) {
				local195 = this.aClass13_5.method228(arg0);
				local200 = this.aClass13_2.method228(arg0);
				local182 += this.method4791(local28, local200, this.aClass13_5.anInt366) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass13_7 != null) {
				local195 = this.aClass13_7.method228(arg0);
				local200 = this.aClass13_6.method228(arg0);
				local187 = local187 * ((this.method4791(local67, local200, this.aClass13_7.anInt366) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray390[local195] != 0) {
					local200 = local176 + Static341.anIntArray397[local195];
					if (local200 < arg0) {
						Static341.anIntArray393[local200] += this.method4791(Static341.anIntArray395[local195], local187 * Static341.anIntArray398[local195] >> 15, this.aClass13_3.anInt366);
						Static341.anIntArray395[local195] += (local182 * Static341.anIntArray394[local195] >> 16) + Static341.anIntArray396[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass13_1 != null) {
			this.aClass13_1.method230();
			this.aClass13_8.method230();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass13_1.method228(arg0);
				local352 = this.aClass13_8.method228(arg0);
				if (local339) {
					local187 = this.aClass13_1.anInt368 + ((this.aClass13_1.anInt367 - this.aClass13_1.anInt368) * local347 >> 8);
				} else {
					local187 = this.aClass13_1.anInt368 + ((this.aClass13_1.anInt367 - this.aClass13_1.anInt368) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static341.anIntArray393[local200] = 0;
				}
			}
		}
		if (this.anInt5995 > 0 && this.anInt5996 > 0) {
			local182 = (int) ((double) this.anInt5995 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static341.anIntArray393[local187] += Static341.anIntArray393[local187 - local182] * this.anInt5996 / 100;
			}
		}
		if (this.aClass132_1.anIntArray256[0] > 0 || this.aClass132_1.anIntArray256[1] > 0) {
			this.aClass13_9.method230();
			local182 = this.aClass13_9.method228(arg0 + 1);
			local187 = this.aClass132_1.method3097(0, (float) local182 / 65536.0F);
			local195 = this.aClass132_1.method3097(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static341.anIntArray393[local200 + local187] * (long) Static199.anInt3848 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static341.anIntArray393[local200 + local187 - local519 - 1] * (long) Static199.anIntArrayArray30[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static341.anIntArray393[local200 - local549 - 1] * (long) Static199.anIntArrayArray30[1][local549] >> 16);
					}
					Static341.anIntArray393[local200] = local352;
					local182 = this.aClass13_9.method228(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static341.anIntArray393[local200 + local187] * (long) Static199.anInt3848 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static341.anIntArray393[local200 + local187 - local519 - 1] * (long) Static199.anIntArrayArray30[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static341.anIntArray393[local200 - local549 - 1] * (long) Static199.anIntArrayArray30[1][local549] >> 16);
						}
						Static341.anIntArray393[local200] = local352;
						local182 = this.aClass13_9.method228(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static341.anIntArray393[local200 + local187 - local519 - 1] * (long) Static199.anIntArrayArray30[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static341.anIntArray393[local200 - local549 - 1] * (long) Static199.anIntArrayArray30[1][local549] >> 16);
							}
							Static341.anIntArray393[local200] = local352;
							this.aClass13_9.method228(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass132_1.method3097(0, (float) local182 / 65536.0F);
					local195 = this.aClass132_1.method3097(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static341.anIntArray393[local182] < -32768) {
				Static341.anIntArray393[local182] = -32768;
			}
			if (Static341.anIntArray393[local182] > 32767) {
				Static341.anIntArray393[local182] = 32767;
			}
		}
		return Static341.anIntArray393;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
	private int method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray389[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray388[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!md;)V")
	public void method4792(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass13_3 = new Class13();
		this.aClass13_3.method229(arg0);
		this.aClass13_4 = new Class13();
		this.aClass13_4.method229(arg0);
		@Pc(21) int local21 = arg0.method3737();
		if (local21 != 0) {
			arg0.anInt4608--;
			this.aClass13_5 = new Class13();
			this.aClass13_5.method229(arg0);
			this.aClass13_2 = new Class13();
			this.aClass13_2.method229(arg0);
		}
		local21 = arg0.method3737();
		if (local21 != 0) {
			arg0.anInt4608--;
			this.aClass13_7 = new Class13();
			this.aClass13_7.method229(arg0);
			this.aClass13_6 = new Class13();
			this.aClass13_6.method229(arg0);
		}
		local21 = arg0.method3737();
		if (local21 != 0) {
			arg0.anInt4608--;
			this.aClass13_1 = new Class13();
			this.aClass13_1.method229(arg0);
			this.aClass13_8 = new Class13();
			this.aClass13_8.method229(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3698();
			if (local114 == 0) {
				break;
			}
			this.anIntArray390[local109] = local114;
			this.anIntArray391[local109] = arg0.method3683();
			this.anIntArray392[local109] = arg0.method3698();
		}
		this.anInt5995 = arg0.method3698();
		this.anInt5996 = arg0.method3698();
		this.anInt5994 = arg0.method3711();
		this.anInt5997 = arg0.method3711();
		this.aClass132_1 = new Class132();
		this.aClass13_9 = new Class13();
		this.aClass132_1.method3099(arg0, this.aClass13_9);
	}
}
