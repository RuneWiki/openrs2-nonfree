import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class105 {

	@OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
	private static final int[] anIntArray174 = new int[32768];

	@OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
	private static final int[] anIntArray177;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Lclient!pd;")
	private Class154 aClass154_1;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!pd;")
	private Class154 aClass154_2;

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!pd;")
	private Class154 aClass154_3;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!pd;")
	private Class154 aClass154_4;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!pd;")
	private Class154 aClass154_5;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!gp;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!pd;")
	private Class154 aClass154_6;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!pd;")
	private Class154 aClass154_7;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!pd;")
	private Class154 aClass154_8;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Lclient!pd;")
	private Class154 aClass154_9;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public int anInt2562 = 500;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	private int anInt2559 = 100;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	private int anInt2561 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public int anInt2560 = 0;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
	private final int[] anIntArray173 = new int[5];

	@OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
	private final int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
	private final int[] anIntArray183 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray174[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray177 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray177[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
	public int[] method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static363.method1673(Static138.anIntArray176, 0, arg0);
		if (arg1 < 10) {
			return Static138.anIntArray176;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass154_5.method4181();
		this.aClass154_8.method4181();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass154_9 != null) {
			this.aClass154_9.method4181();
			this.aClass154_1.method4181();
			local24 = (int) ((double) (this.aClass154_9.anInt4743 - this.aClass154_9.anInt4741) * 32.768D / local16);
			local26 = (int) ((double) this.aClass154_9.anInt4741 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass154_6 != null) {
			this.aClass154_6.method4181();
			this.aClass154_4.method4181();
			local63 = (int) ((double) (this.aClass154_6.anInt4743 - this.aClass154_6.anInt4741) * 32.768D / local16);
			local65 = (int) ((double) this.aClass154_6.anInt4741 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray175[local102] != 0) {
				Static138.anIntArray182[local102] = 0;
				Static138.anIntArray180[local102] = (int) ((double) this.anIntArray183[local102] * local16);
				Static138.anIntArray181[local102] = (this.anIntArray175[local102] << 14) / 100;
				Static138.anIntArray179[local102] = (int) ((double) (this.aClass154_5.anInt4743 - this.aClass154_5.anInt4741) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray173[local102]) / local16);
				Static138.anIntArray178[local102] = (int) ((double) this.aClass154_5.anInt4741 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass154_5.method4180(arg0);
			local187 = this.aClass154_8.method4180(arg0);
			if (this.aClass154_9 != null) {
				local195 = this.aClass154_9.method4180(arg0);
				local200 = this.aClass154_1.method4180(arg0);
				local182 += this.method2140(local28, local200, this.aClass154_9.anInt4744) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass154_6 != null) {
				local195 = this.aClass154_6.method4180(arg0);
				local200 = this.aClass154_4.method4180(arg0);
				local187 = local187 * ((this.method2140(local67, local200, this.aClass154_6.anInt4744) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray175[local195] != 0) {
					local200 = local176 + Static138.anIntArray180[local195];
					if (local200 < arg0) {
						Static138.anIntArray176[local200] += this.method2140(Static138.anIntArray182[local195], local187 * Static138.anIntArray181[local195] >> 15, this.aClass154_5.anInt4744);
						Static138.anIntArray182[local195] += (local182 * Static138.anIntArray179[local195] >> 16) + Static138.anIntArray178[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass154_7 != null) {
			this.aClass154_7.method4181();
			this.aClass154_2.method4181();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass154_7.method4180(arg0);
				local352 = this.aClass154_2.method4180(arg0);
				if (local339) {
					local187 = this.aClass154_7.anInt4741 + ((this.aClass154_7.anInt4743 - this.aClass154_7.anInt4741) * local347 >> 8);
				} else {
					local187 = this.aClass154_7.anInt4741 + ((this.aClass154_7.anInt4743 - this.aClass154_7.anInt4741) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static138.anIntArray176[local200] = 0;
				}
			}
		}
		if (this.anInt2561 > 0 && this.anInt2559 > 0) {
			local182 = (int) ((double) this.anInt2561 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static138.anIntArray176[local187] += Static138.anIntArray176[local187 - local182] * this.anInt2559 / 100;
			}
		}
		if (this.aClass87_1.anIntArray149[0] > 0 || this.aClass87_1.anIntArray149[1] > 0) {
			this.aClass154_3.method4181();
			local182 = this.aClass154_3.method4180(arg0 + 1);
			local187 = this.aClass87_1.method1655(0, (float) local182 / 65536.0F);
			local195 = this.aClass87_1.method1655(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static138.anIntArray176[local200 + local187] * (long) Static109.anInt2046 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static138.anIntArray176[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray17[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static138.anIntArray176[local200 - local549 - 1] * (long) Static109.anIntArrayArray17[1][local549] >> 16);
					}
					Static138.anIntArray176[local200] = local352;
					local182 = this.aClass154_3.method4180(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static138.anIntArray176[local200 + local187] * (long) Static109.anInt2046 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static138.anIntArray176[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray17[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static138.anIntArray176[local200 - local549 - 1] * (long) Static109.anIntArrayArray17[1][local549] >> 16);
						}
						Static138.anIntArray176[local200] = local352;
						local182 = this.aClass154_3.method4180(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static138.anIntArray176[local200 + local187 - local519 - 1] * (long) Static109.anIntArrayArray17[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static138.anIntArray176[local200 - local549 - 1] * (long) Static109.anIntArrayArray17[1][local549] >> 16);
							}
							Static138.anIntArray176[local200] = local352;
							this.aClass154_3.method4180(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass87_1.method1655(0, (float) local182 / 65536.0F);
					local195 = this.aClass87_1.method1655(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static138.anIntArray176[local182] < -32768) {
				Static138.anIntArray176[local182] = -32768;
			}
			if (Static138.anIntArray176[local182] > 32767) {
				Static138.anIntArray176[local182] = 32767;
			}
		}
		return Static138.anIntArray176;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	private int method2140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray177[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray174[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kh;)V")
	public void method2141(@OriginalArg(0) Class11_Sub25 arg0) {
		this.aClass154_5 = new Class154();
		this.aClass154_5.method4178(arg0);
		this.aClass154_8 = new Class154();
		this.aClass154_8.method4178(arg0);
		@Pc(21) int local21 = arg0.method5185();
		if (local21 != 0) {
			arg0.anInt6076--;
			this.aClass154_9 = new Class154();
			this.aClass154_9.method4178(arg0);
			this.aClass154_1 = new Class154();
			this.aClass154_1.method4178(arg0);
		}
		local21 = arg0.method5185();
		if (local21 != 0) {
			arg0.anInt6076--;
			this.aClass154_6 = new Class154();
			this.aClass154_6.method4178(arg0);
			this.aClass154_4 = new Class154();
			this.aClass154_4.method4178(arg0);
		}
		local21 = arg0.method5185();
		if (local21 != 0) {
			arg0.anInt6076--;
			this.aClass154_7 = new Class154();
			this.aClass154_7.method4178(arg0);
			this.aClass154_2 = new Class154();
			this.aClass154_2.method4178(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5188();
			if (local114 == 0) {
				break;
			}
			this.anIntArray175[local109] = local114;
			this.anIntArray173[local109] = arg0.method5212();
			this.anIntArray183[local109] = arg0.method5188();
		}
		this.anInt2561 = arg0.method5188();
		this.anInt2559 = arg0.method5188();
		this.anInt2562 = arg0.method5187();
		this.anInt2560 = arg0.method5187();
		this.aClass87_1 = new Class87();
		this.aClass154_3 = new Class154();
		this.aClass87_1.method1657(arg0, this.aClass154_3);
	}
}
