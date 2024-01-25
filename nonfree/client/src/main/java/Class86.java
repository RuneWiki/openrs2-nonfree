import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class86 {

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
	private static final int[] anIntArray117 = new int[32768];

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
	private static final int[] anIntArray116;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!lka;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!hk;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!hk;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!hk;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!hk;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!hk;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!hk;")
	private Class160 aClass160_6;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!hk;")
	private Class160 aClass160_7;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!hk;")
	private Class160 aClass160_8;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!hk;")
	private Class160 aClass160_9;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
	private final int[] anIntArray115 = new int[5];

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public int anInt2274 = 0;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private int anInt2276 = 100;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	private final int[] anIntArray112 = new int[5];

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
	private final int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	private int anInt2275 = 0;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public int anInt2277 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray117[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray116 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray116[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jc;)V")
	public void method2171(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aClass160_2 = new Class160();
		this.aClass160_2.method4070(arg0);
		this.aClass160_7 = new Class160();
		this.aClass160_7.method4070(arg0);
		@Pc(21) int local21 = arg0.method3030();
		if (local21 != 0) {
			arg0.anInt3174--;
			this.aClass160_6 = new Class160();
			this.aClass160_6.method4070(arg0);
			this.aClass160_4 = new Class160();
			this.aClass160_4.method4070(arg0);
		}
		local21 = arg0.method3030();
		if (local21 != 0) {
			arg0.anInt3174--;
			this.aClass160_3 = new Class160();
			this.aClass160_3.method4070(arg0);
			this.aClass160_8 = new Class160();
			this.aClass160_8.method4070(arg0);
		}
		local21 = arg0.method3030();
		if (local21 != 0) {
			arg0.anInt3174--;
			this.aClass160_9 = new Class160();
			this.aClass160_9.method4070(arg0);
			this.aClass160_1 = new Class160();
			this.aClass160_1.method4070(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2992();
			if (local114 == 0) {
				break;
			}
			this.anIntArray112[local109] = local114;
			this.anIntArray113[local109] = arg0.method3000();
			this.anIntArray115[local109] = arg0.method2992();
		}
		this.anInt2275 = arg0.method2992();
		this.anInt2276 = arg0.method2992();
		this.anInt2277 = arg0.method3018();
		this.anInt2274 = arg0.method3018();
		this.aClass226_1 = new Class226();
		this.aClass160_5 = new Class160();
		this.aClass226_1.method5372(arg0, this.aClass160_5);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	private int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray116[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray117[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
	public int[] method2174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static695.method5643(Static117.anIntArray114, 0, arg0);
		if (arg1 < 10) {
			return Static117.anIntArray114;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass160_2.method4073();
		this.aClass160_7.method4073();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass160_6 != null) {
			this.aClass160_6.method4073();
			this.aClass160_4.method4073();
			local24 = (int) ((double) (this.aClass160_6.anInt4427 - this.aClass160_6.anInt4428) * 32.768D / local16);
			local26 = (int) ((double) this.aClass160_6.anInt4428 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass160_3 != null) {
			this.aClass160_3.method4073();
			this.aClass160_8.method4073();
			local63 = (int) ((double) (this.aClass160_3.anInt4427 - this.aClass160_3.anInt4428) * 32.768D / local16);
			local65 = (int) ((double) this.aClass160_3.anInt4428 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray112[local102] != 0) {
				Static117.anIntArray120[local102] = 0;
				Static117.anIntArray121[local102] = (int) ((double) this.anIntArray115[local102] * local16);
				Static117.anIntArray119[local102] = (this.anIntArray112[local102] << 14) / 100;
				Static117.anIntArray122[local102] = (int) ((double) (this.aClass160_2.anInt4427 - this.aClass160_2.anInt4428) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray113[local102]) / local16);
				Static117.anIntArray118[local102] = (int) ((double) this.aClass160_2.anInt4428 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass160_2.method4071(arg0);
			local187 = this.aClass160_7.method4071(arg0);
			if (this.aClass160_6 != null) {
				local195 = this.aClass160_6.method4071(arg0);
				local200 = this.aClass160_4.method4071(arg0);
				local182 += this.method2173(local28, local200, this.aClass160_6.anInt4429) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass160_3 != null) {
				local195 = this.aClass160_3.method4071(arg0);
				local200 = this.aClass160_8.method4071(arg0);
				local187 = local187 * ((this.method2173(local67, local200, this.aClass160_3.anInt4429) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray112[local195] != 0) {
					local200 = local176 + Static117.anIntArray121[local195];
					if (local200 < arg0) {
						Static117.anIntArray114[local200] += this.method2173(Static117.anIntArray120[local195], local187 * Static117.anIntArray119[local195] >> 15, this.aClass160_2.anInt4429);
						Static117.anIntArray120[local195] += (local182 * Static117.anIntArray122[local195] >> 16) + Static117.anIntArray118[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass160_9 != null) {
			this.aClass160_9.method4073();
			this.aClass160_1.method4073();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass160_9.method4071(arg0);
				local352 = this.aClass160_1.method4071(arg0);
				if (local339) {
					local187 = this.aClass160_9.anInt4428 + ((this.aClass160_9.anInt4427 - this.aClass160_9.anInt4428) * local347 >> 8);
				} else {
					local187 = this.aClass160_9.anInt4428 + ((this.aClass160_9.anInt4427 - this.aClass160_9.anInt4428) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static117.anIntArray114[local200] = 0;
				}
			}
		}
		if (this.anInt2275 > 0 && this.anInt2276 > 0) {
			local182 = (int) ((double) this.anInt2275 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static117.anIntArray114[local187] += Static117.anIntArray114[local187 - local182] * this.anInt2276 / 100;
			}
		}
		if (this.aClass226_1.anIntArray346[0] > 0 || this.aClass226_1.anIntArray346[1] > 0) {
			this.aClass160_5.method4073();
			local182 = this.aClass160_5.method4071(arg0 + 1);
			local187 = this.aClass226_1.method5373(0, (float) local182 / 65536.0F);
			local195 = this.aClass226_1.method5373(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static117.anIntArray114[local200 + local187] * (long) Static351.anInt5966 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static117.anIntArray114[local200 + local187 - local519 - 1] * (long) Static351.anIntArrayArray36[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static117.anIntArray114[local200 - local549 - 1] * (long) Static351.anIntArrayArray36[1][local549] >> 16);
					}
					Static117.anIntArray114[local200] = local352;
					local182 = this.aClass160_5.method4071(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static117.anIntArray114[local200 + local187] * (long) Static351.anInt5966 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static117.anIntArray114[local200 + local187 - local519 - 1] * (long) Static351.anIntArrayArray36[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static117.anIntArray114[local200 - local549 - 1] * (long) Static351.anIntArrayArray36[1][local549] >> 16);
						}
						Static117.anIntArray114[local200] = local352;
						local182 = this.aClass160_5.method4071(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static117.anIntArray114[local200 + local187 - local519 - 1] * (long) Static351.anIntArrayArray36[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static117.anIntArray114[local200 - local549 - 1] * (long) Static351.anIntArrayArray36[1][local549] >> 16);
							}
							Static117.anIntArray114[local200] = local352;
							this.aClass160_5.method4071(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass226_1.method5373(0, (float) local182 / 65536.0F);
					local195 = this.aClass226_1.method5373(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static117.anIntArray114[local182] < -32768) {
				Static117.anIntArray114[local182] = -32768;
			}
			if (Static117.anIntArray114[local182] > 32767) {
				Static117.anIntArray114[local182] = 32767;
			}
		}
		return Static117.anIntArray114;
	}
}
