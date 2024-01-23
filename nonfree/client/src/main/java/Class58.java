import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class58 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
	private static int[] anIntArray255 = new int[32768];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private static int[] anIntArray258;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!vf;")
	private Class101 aClass101_1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!vf;")
	private Class101 aClass101_2;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!r;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!vf;")
	private Class101 aClass101_3;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!vf;")
	private Class101 aClass101_4;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "Lclient!vf;")
	private Class101 aClass101_5;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!vf;")
	private Class101 aClass101_6;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!vf;")
	private Class101 aClass101_7;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!vf;")
	private Class101 aClass101_8;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!vf;")
	private Class101 aClass101_9;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	private int[] anIntArray256 = new int[5];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private int anInt2622 = 100;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt2620 = 0;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private int anInt2621 = 0;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt2623 = 500;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
	private int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
	private int[] anIntArray260 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray255[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray258 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray258[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	private int method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray258[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray255[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	public int[] method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static225.method1838(Static109.anIntArray257, 0, arg0);
		if (arg1 < 10) {
			return Static109.anIntArray257;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass101_1.method3222();
		this.aClass101_7.method3222();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass101_4 != null) {
			this.aClass101_4.method3222();
			this.aClass101_2.method3222();
			local24 = (int) ((double) (this.aClass101_4.anInt4652 - this.aClass101_4.anInt4653) * 32.768D / local16);
			local26 = (int) ((double) this.aClass101_4.anInt4653 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass101_9 != null) {
			this.aClass101_9.method3222();
			this.aClass101_6.method3222();
			local63 = (int) ((double) (this.aClass101_9.anInt4652 - this.aClass101_9.anInt4653) * 32.768D / local16);
			local65 = (int) ((double) this.aClass101_9.anInt4653 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray260[local102] != 0) {
				Static109.anIntArray262[local102] = 0;
				Static109.anIntArray265[local102] = (int) ((double) this.anIntArray259[local102] * local16);
				Static109.anIntArray264[local102] = (this.anIntArray260[local102] << 14) / 100;
				Static109.anIntArray261[local102] = (int) ((double) (this.aClass101_1.anInt4652 - this.aClass101_1.anInt4653) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray256[local102]) / local16);
				Static109.anIntArray263[local102] = (int) ((double) this.aClass101_1.anInt4653 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass101_1.method3221(arg0);
			local187 = this.aClass101_7.method3221(arg0);
			if (this.aClass101_4 != null) {
				local195 = this.aClass101_4.method3221(arg0);
				local200 = this.aClass101_2.method3221(arg0);
				local182 += this.method1834(local28, local200, this.aClass101_4.anInt4654) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass101_9 != null) {
				local195 = this.aClass101_9.method3221(arg0);
				local200 = this.aClass101_6.method3221(arg0);
				local187 = local187 * ((this.method1834(local67, local200, this.aClass101_9.anInt4654) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray260[local195] != 0) {
					local200 = local176 + Static109.anIntArray265[local195];
					if (local200 < arg0) {
						Static109.anIntArray257[local200] += this.method1834(Static109.anIntArray262[local195], local187 * Static109.anIntArray264[local195] >> 15, this.aClass101_1.anInt4654);
						Static109.anIntArray262[local195] += (local182 * Static109.anIntArray261[local195] >> 16) + Static109.anIntArray263[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass101_5 != null) {
			this.aClass101_5.method3222();
			this.aClass101_8.method3222();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass101_5.method3221(arg0);
				local352 = this.aClass101_8.method3221(arg0);
				if (local339) {
					local187 = this.aClass101_5.anInt4653 + ((this.aClass101_5.anInt4652 - this.aClass101_5.anInt4653) * local347 >> 8);
				} else {
					local187 = this.aClass101_5.anInt4653 + ((this.aClass101_5.anInt4652 - this.aClass101_5.anInt4653) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static109.anIntArray257[local200] = 0;
				}
			}
		}
		if (this.anInt2621 > 0 && this.anInt2622 > 0) {
			local182 = (int) ((double) this.anInt2621 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static109.anIntArray257[local187] += Static109.anIntArray257[local187 - local182] * this.anInt2622 / 100;
			}
		}
		if (this.aClass84_1.anIntArray404[0] > 0 || this.aClass84_1.anIntArray404[1] > 0) {
			this.aClass101_3.method3222();
			local182 = this.aClass101_3.method3221(arg0 + 1);
			local187 = this.aClass84_1.method2664(0, (float) local182 / 65536.0F);
			local195 = this.aClass84_1.method2664(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static109.anIntArray257[local200 + local187] * (long) Static164.anInt3828 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static109.anIntArray257[local200 + local187 - local519 - 1] * (long) Static164.anIntArrayArray34[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static109.anIntArray257[local200 - local549 - 1] * (long) Static164.anIntArrayArray34[1][local549] >> 16);
					}
					Static109.anIntArray257[local200] = local352;
					local182 = this.aClass101_3.method3221(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static109.anIntArray257[local200 + local187] * (long) Static164.anInt3828 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static109.anIntArray257[local200 + local187 - local519 - 1] * (long) Static164.anIntArrayArray34[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static109.anIntArray257[local200 - local549 - 1] * (long) Static164.anIntArrayArray34[1][local549] >> 16);
						}
						Static109.anIntArray257[local200] = local352;
						local182 = this.aClass101_3.method3221(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static109.anIntArray257[local200 + local187 - local519 - 1] * (long) Static164.anIntArrayArray34[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static109.anIntArray257[local200 - local549 - 1] * (long) Static164.anIntArrayArray34[1][local549] >> 16);
							}
							Static109.anIntArray257[local200] = local352;
							this.aClass101_3.method3221(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass84_1.method2664(0, (float) local182 / 65536.0F);
					local195 = this.aClass84_1.method2664(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static109.anIntArray257[local182] < -32768) {
				Static109.anIntArray257[local182] = -32768;
			}
			if (Static109.anIntArray257[local182] > 32767) {
				Static109.anIntArray257[local182] = 32767;
			}
		}
		return Static109.anIntArray257;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ea;)V")
	public void method1837(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass101_1 = new Class101();
		this.aClass101_1.method3224(arg0);
		this.aClass101_7 = new Class101();
		this.aClass101_7.method3224(arg0);
		@Pc(21) int local21 = arg0.method209();
		if (local21 != 0) {
			arg0.anInt239--;
			this.aClass101_4 = new Class101();
			this.aClass101_4.method3224(arg0);
			this.aClass101_2 = new Class101();
			this.aClass101_2.method3224(arg0);
		}
		local21 = arg0.method209();
		if (local21 != 0) {
			arg0.anInt239--;
			this.aClass101_9 = new Class101();
			this.aClass101_9.method3224(arg0);
			this.aClass101_6 = new Class101();
			this.aClass101_6.method3224(arg0);
		}
		local21 = arg0.method209();
		if (local21 != 0) {
			arg0.anInt239--;
			this.aClass101_5 = new Class101();
			this.aClass101_5.method3224(arg0);
			this.aClass101_8 = new Class101();
			this.aClass101_8.method3224(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method212();
			if (local114 == 0) {
				break;
			}
			this.anIntArray260[local109] = local114;
			this.anIntArray256[local109] = arg0.method204();
			this.anIntArray259[local109] = arg0.method212();
		}
		this.anInt2621 = arg0.method212();
		this.anInt2622 = arg0.method212();
		this.anInt2623 = arg0.method163();
		this.anInt2620 = arg0.method163();
		this.aClass84_1 = new Class84();
		this.aClass101_3 = new Class101();
		this.aClass84_1.method2666(arg0, this.aClass101_3);
	}
}
