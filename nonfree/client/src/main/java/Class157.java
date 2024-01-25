import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class157 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
	private static final int[] anIntArray429 = new int[32768];

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "[I")
	private static final int[] anIntArray434;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!cs;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!cs;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!cs;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!cs;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Lclient!kv;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!cs;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Lclient!cs;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!cs;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Lclient!cs;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "Lclient!cs;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	public int anInt4333 = 500;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	public int anInt4334 = 0;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "[I")
	private final int[] anIntArray432 = new int[5];

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
	private final int[] anIntArray431 = new int[5];

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "[I")
	private final int[] anIntArray433 = new int[5];

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	private int anInt4335 = 0;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	private int anInt4336 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray429[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray434 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray434[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)I")
	private int method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray434[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray429[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
	public int[] method3472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static468.method4354(Static237.anIntArray430, 0, arg0);
		if (arg1 < 10) {
			return Static237.anIntArray430;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass45_2.method1050();
		this.aClass45_1.method1050();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass45_5 != null) {
			this.aClass45_5.method1050();
			this.aClass45_3.method1050();
			local24 = (int) ((double) (this.aClass45_5.anInt1147 - this.aClass45_5.anInt1146) * 32.768D / local16);
			local26 = (int) ((double) this.aClass45_5.anInt1146 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass45_4 != null) {
			this.aClass45_4.method1050();
			this.aClass45_6.method1050();
			local63 = (int) ((double) (this.aClass45_4.anInt1147 - this.aClass45_4.anInt1146) * 32.768D / local16);
			local65 = (int) ((double) this.aClass45_4.anInt1146 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray431[local102] != 0) {
				Static237.anIntArray436[local102] = 0;
				Static237.anIntArray437[local102] = (int) ((double) this.anIntArray433[local102] * local16);
				Static237.anIntArray439[local102] = (this.anIntArray431[local102] << 14) / 100;
				Static237.anIntArray435[local102] = (int) ((double) (this.aClass45_2.anInt1147 - this.aClass45_2.anInt1146) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray432[local102]) / local16);
				Static237.anIntArray438[local102] = (int) ((double) this.aClass45_2.anInt1146 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass45_2.method1048(arg0);
			local187 = this.aClass45_1.method1048(arg0);
			if (this.aClass45_5 != null) {
				local195 = this.aClass45_5.method1048(arg0);
				local200 = this.aClass45_3.method1048(arg0);
				local182 += this.method3471(local28, local200, this.aClass45_5.anInt1148) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass45_4 != null) {
				local195 = this.aClass45_4.method1048(arg0);
				local200 = this.aClass45_6.method1048(arg0);
				local187 = local187 * ((this.method3471(local67, local200, this.aClass45_4.anInt1148) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray431[local195] != 0) {
					local200 = local176 + Static237.anIntArray437[local195];
					if (local200 < arg0) {
						Static237.anIntArray430[local200] += this.method3471(Static237.anIntArray436[local195], local187 * Static237.anIntArray439[local195] >> 15, this.aClass45_2.anInt1148);
						Static237.anIntArray436[local195] += (local182 * Static237.anIntArray435[local195] >> 16) + Static237.anIntArray438[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass45_7 != null) {
			this.aClass45_7.method1050();
			this.aClass45_9.method1050();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass45_7.method1048(arg0);
				local352 = this.aClass45_9.method1048(arg0);
				if (local339) {
					local187 = this.aClass45_7.anInt1146 + ((this.aClass45_7.anInt1147 - this.aClass45_7.anInt1146) * local347 >> 8);
				} else {
					local187 = this.aClass45_7.anInt1146 + ((this.aClass45_7.anInt1147 - this.aClass45_7.anInt1146) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static237.anIntArray430[local200] = 0;
				}
			}
		}
		if (this.anInt4335 > 0 && this.anInt4336 > 0) {
			local182 = (int) ((double) this.anInt4335 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static237.anIntArray430[local187] += Static237.anIntArray430[local187 - local182] * this.anInt4336 / 100;
			}
		}
		if (this.aClass150_1.anIntArray420[0] > 0 || this.aClass150_1.anIntArray420[1] > 0) {
			this.aClass45_8.method1050();
			local182 = this.aClass45_8.method1048(arg0 + 1);
			local187 = this.aClass150_1.method3372(0, (float) local182 / 65536.0F);
			local195 = this.aClass150_1.method3372(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static237.anIntArray430[local200 + local187] * (long) Static224.anInt4211 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static237.anIntArray430[local200 + local187 - local519 - 1] * (long) Static224.anIntArrayArray40[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static237.anIntArray430[local200 - local549 - 1] * (long) Static224.anIntArrayArray40[1][local549] >> 16);
					}
					Static237.anIntArray430[local200] = local352;
					local182 = this.aClass45_8.method1048(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static237.anIntArray430[local200 + local187] * (long) Static224.anInt4211 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static237.anIntArray430[local200 + local187 - local519 - 1] * (long) Static224.anIntArrayArray40[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static237.anIntArray430[local200 - local549 - 1] * (long) Static224.anIntArrayArray40[1][local549] >> 16);
						}
						Static237.anIntArray430[local200] = local352;
						local182 = this.aClass45_8.method1048(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static237.anIntArray430[local200 + local187 - local519 - 1] * (long) Static224.anIntArrayArray40[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static237.anIntArray430[local200 - local549 - 1] * (long) Static224.anIntArrayArray40[1][local549] >> 16);
							}
							Static237.anIntArray430[local200] = local352;
							this.aClass45_8.method1048(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass150_1.method3372(0, (float) local182 / 65536.0F);
					local195 = this.aClass150_1.method3372(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static237.anIntArray430[local182] < -32768) {
				Static237.anIntArray430[local182] = -32768;
			}
			if (Static237.anIntArray430[local182] > 32767) {
				Static237.anIntArray430[local182] = 32767;
			}
		}
		return Static237.anIntArray430;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!nn;)V")
	public void method3474(@OriginalArg(0) Class10_Sub8 arg0) {
		this.aClass45_2 = new Class45();
		this.aClass45_2.method1049(arg0);
		this.aClass45_1 = new Class45();
		this.aClass45_1.method1049(arg0);
		@Pc(21) int local21 = arg0.method2502();
		if (local21 != 0) {
			arg0.anInt2989--;
			this.aClass45_5 = new Class45();
			this.aClass45_5.method1049(arg0);
			this.aClass45_3 = new Class45();
			this.aClass45_3.method1049(arg0);
		}
		local21 = arg0.method2502();
		if (local21 != 0) {
			arg0.anInt2989--;
			this.aClass45_4 = new Class45();
			this.aClass45_4.method1049(arg0);
			this.aClass45_6 = new Class45();
			this.aClass45_6.method1049(arg0);
		}
		local21 = arg0.method2502();
		if (local21 != 0) {
			arg0.anInt2989--;
			this.aClass45_7 = new Class45();
			this.aClass45_7.method1049(arg0);
			this.aClass45_9 = new Class45();
			this.aClass45_9.method1049(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2469();
			if (local114 == 0) {
				break;
			}
			this.anIntArray431[local109] = local114;
			this.anIntArray432[local109] = arg0.method2462();
			this.anIntArray433[local109] = arg0.method2469();
		}
		this.anInt4335 = arg0.method2469();
		this.anInt4336 = arg0.method2469();
		this.anInt4333 = arg0.method2485();
		this.anInt4334 = arg0.method2485();
		this.aClass150_1 = new Class150();
		this.aClass45_8 = new Class45();
		this.aClass150_1.method3371(arg0, this.aClass45_8);
	}
}
