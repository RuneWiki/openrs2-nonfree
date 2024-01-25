import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class190 {

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
	private static final int[] anIntArray433 = new int[32768];

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "[I")
	private static final int[] anIntArray432;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!cp;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Lclient!cp;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!cp;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!cp;")
	private Class27 aClass27_4;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!mp;")
	private Class140 aClass140_1;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!cp;")
	private Class27 aClass27_5;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "Lclient!cp;")
	private Class27 aClass27_6;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "Lclient!cp;")
	private Class27 aClass27_7;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "Lclient!cp;")
	private Class27 aClass27_8;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!cp;")
	private Class27 aClass27_9;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	private int anInt5647 = 100;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "[I")
	private final int[] anIntArray431 = new int[5];

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
	private final int[] anIntArray430 = new int[5];

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "[I")
	private final int[] anIntArray428 = new int[5];

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public int anInt5648 = 500;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	private int anInt5649 = 0;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
	public int anInt5650 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray433[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray432 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray432[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)I")
	private int method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray432[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray433[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
	public int[] method5130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static374.method2831(Static292.anIntArray429, 0, arg0);
		if (arg1 < 10) {
			return Static292.anIntArray429;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass27_7.method1127();
		this.aClass27_1.method1127();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass27_6 != null) {
			this.aClass27_6.method1127();
			this.aClass27_8.method1127();
			local24 = (int) ((double) (this.aClass27_6.anInt1185 - this.aClass27_6.anInt1188) * 32.768D / local16);
			local26 = (int) ((double) this.aClass27_6.anInt1188 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass27_5 != null) {
			this.aClass27_5.method1127();
			this.aClass27_3.method1127();
			local63 = (int) ((double) (this.aClass27_5.anInt1185 - this.aClass27_5.anInt1188) * 32.768D / local16);
			local65 = (int) ((double) this.aClass27_5.anInt1188 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray431[local102] != 0) {
				Static292.anIntArray438[local102] = 0;
				Static292.anIntArray437[local102] = (int) ((double) this.anIntArray428[local102] * local16);
				Static292.anIntArray436[local102] = (this.anIntArray431[local102] << 14) / 100;
				Static292.anIntArray435[local102] = (int) ((double) (this.aClass27_7.anInt1185 - this.aClass27_7.anInt1188) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray430[local102]) / local16);
				Static292.anIntArray434[local102] = (int) ((double) this.aClass27_7.anInt1188 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass27_7.method1124(arg0);
			local187 = this.aClass27_1.method1124(arg0);
			if (this.aClass27_6 != null) {
				local195 = this.aClass27_6.method1124(arg0);
				local200 = this.aClass27_8.method1124(arg0);
				local182 += this.method5128(local28, local200, this.aClass27_6.anInt1187) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass27_5 != null) {
				local195 = this.aClass27_5.method1124(arg0);
				local200 = this.aClass27_3.method1124(arg0);
				local187 = local187 * ((this.method5128(local67, local200, this.aClass27_5.anInt1187) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray431[local195] != 0) {
					local200 = local176 + Static292.anIntArray437[local195];
					if (local200 < arg0) {
						Static292.anIntArray429[local200] += this.method5128(Static292.anIntArray438[local195], local187 * Static292.anIntArray436[local195] >> 15, this.aClass27_7.anInt1187);
						Static292.anIntArray438[local195] += (local182 * Static292.anIntArray435[local195] >> 16) + Static292.anIntArray434[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass27_9 != null) {
			this.aClass27_9.method1127();
			this.aClass27_2.method1127();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass27_9.method1124(arg0);
				local352 = this.aClass27_2.method1124(arg0);
				if (local339) {
					local187 = this.aClass27_9.anInt1188 + ((this.aClass27_9.anInt1185 - this.aClass27_9.anInt1188) * local347 >> 8);
				} else {
					local187 = this.aClass27_9.anInt1188 + ((this.aClass27_9.anInt1185 - this.aClass27_9.anInt1188) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static292.anIntArray429[local200] = 0;
				}
			}
		}
		if (this.anInt5649 > 0 && this.anInt5647 > 0) {
			local182 = (int) ((double) this.anInt5649 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static292.anIntArray429[local187] += Static292.anIntArray429[local187 - local182] * this.anInt5647 / 100;
			}
		}
		if (this.aClass140_1.anIntArray314[0] > 0 || this.aClass140_1.anIntArray314[1] > 0) {
			this.aClass27_4.method1127();
			local182 = this.aClass27_4.method1124(arg0 + 1);
			local187 = this.aClass140_1.method3752(0, (float) local182 / 65536.0F);
			local195 = this.aClass140_1.method3752(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static292.anIntArray429[local200 + local187] * (long) Static203.anInt4061 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static292.anIntArray429[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray36[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static292.anIntArray429[local200 - local549 - 1] * (long) Static203.anIntArrayArray36[1][local549] >> 16);
					}
					Static292.anIntArray429[local200] = local352;
					local182 = this.aClass27_4.method1124(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static292.anIntArray429[local200 + local187] * (long) Static203.anInt4061 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static292.anIntArray429[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray36[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static292.anIntArray429[local200 - local549 - 1] * (long) Static203.anIntArrayArray36[1][local549] >> 16);
						}
						Static292.anIntArray429[local200] = local352;
						local182 = this.aClass27_4.method1124(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static292.anIntArray429[local200 + local187 - local519 - 1] * (long) Static203.anIntArrayArray36[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static292.anIntArray429[local200 - local549 - 1] * (long) Static203.anIntArrayArray36[1][local549] >> 16);
							}
							Static292.anIntArray429[local200] = local352;
							this.aClass27_4.method1124(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass140_1.method3752(0, (float) local182 / 65536.0F);
					local195 = this.aClass140_1.method3752(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static292.anIntArray429[local182] < -32768) {
				Static292.anIntArray429[local182] = -32768;
			}
			if (Static292.anIntArray429[local182] > 32767) {
				Static292.anIntArray429[local182] = 32767;
			}
		}
		return Static292.anIntArray429;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!at;)V")
	public void method5131(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass27_7 = new Class27();
		this.aClass27_7.method1126(arg0);
		this.aClass27_1 = new Class27();
		this.aClass27_1.method1126(arg0);
		@Pc(21) int local21 = arg0.method2132();
		if (local21 != 0) {
			arg0.anInt2219--;
			this.aClass27_6 = new Class27();
			this.aClass27_6.method1126(arg0);
			this.aClass27_8 = new Class27();
			this.aClass27_8.method1126(arg0);
		}
		local21 = arg0.method2132();
		if (local21 != 0) {
			arg0.anInt2219--;
			this.aClass27_5 = new Class27();
			this.aClass27_5.method1126(arg0);
			this.aClass27_3 = new Class27();
			this.aClass27_3.method1126(arg0);
		}
		local21 = arg0.method2132();
		if (local21 != 0) {
			arg0.anInt2219--;
			this.aClass27_9 = new Class27();
			this.aClass27_9.method1126(arg0);
			this.aClass27_2 = new Class27();
			this.aClass27_2.method1126(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2134();
			if (local114 == 0) {
				break;
			}
			this.anIntArray431[local109] = local114;
			this.anIntArray430[local109] = arg0.method2110();
			this.anIntArray428[local109] = arg0.method2134();
		}
		this.anInt5649 = arg0.method2134();
		this.anInt5647 = arg0.method2134();
		this.anInt5648 = arg0.method2161();
		this.anInt5650 = arg0.method2161();
		this.aClass140_1 = new Class140();
		this.aClass27_4 = new Class27();
		this.aClass140_1.method3755(arg0, this.aClass27_4);
	}
}
