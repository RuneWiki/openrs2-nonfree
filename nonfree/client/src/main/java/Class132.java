import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class132 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
	private static final int[] anIntArray352 = new int[32768];

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
	private static final int[] anIntArray355;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!qs;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!qs;")
	private Class175 aClass175_2;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!qs;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!qs;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!qs;")
	private Class175 aClass175_5;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!nb;")
	private Class140 aClass140_1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!qs;")
	private Class175 aClass175_6;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!qs;")
	private Class175 aClass175_7;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!qs;")
	private Class175 aClass175_8;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!qs;")
	private Class175 aClass175_9;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public int anInt3956 = 0;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private int anInt3955 = 100;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[I")
	private final int[] anIntArray354 = new int[5];

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
	private final int[] anIntArray356 = new int[5];

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	private int anInt3957 = 0;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
	private final int[] anIntArray353 = new int[5];

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
	public int anInt3958 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray352[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray355 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray355[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	private int method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray355[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray352[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!bg;)V")
	public void method3610(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass175_5 = new Class175();
		this.aClass175_5.method4661(arg0);
		this.aClass175_8 = new Class175();
		this.aClass175_8.method4661(arg0);
		@Pc(21) int local21 = arg0.method4532();
		if (local21 != 0) {
			arg0.anInt5182--;
			this.aClass175_1 = new Class175();
			this.aClass175_1.method4661(arg0);
			this.aClass175_3 = new Class175();
			this.aClass175_3.method4661(arg0);
		}
		local21 = arg0.method4532();
		if (local21 != 0) {
			arg0.anInt5182--;
			this.aClass175_2 = new Class175();
			this.aClass175_2.method4661(arg0);
			this.aClass175_7 = new Class175();
			this.aClass175_7.method4661(arg0);
		}
		local21 = arg0.method4532();
		if (local21 != 0) {
			arg0.anInt5182--;
			this.aClass175_4 = new Class175();
			this.aClass175_4.method4661(arg0);
			this.aClass175_9 = new Class175();
			this.aClass175_9.method4661(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4528();
			if (local114 == 0) {
				break;
			}
			this.anIntArray356[local109] = local114;
			this.anIntArray353[local109] = arg0.method4522();
			this.anIntArray354[local109] = arg0.method4528();
		}
		this.anInt3957 = arg0.method4528();
		this.anInt3955 = arg0.method4528();
		this.anInt3958 = arg0.method4556();
		this.anInt3956 = arg0.method4556();
		this.aClass140_1 = new Class140();
		this.aClass175_6 = new Class175();
		this.aClass140_1.method3825(arg0, this.aClass175_6);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
	public int[] method3611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static361.method1336(Static184.anIntArray357, 0, arg0);
		if (arg1 < 10) {
			return Static184.anIntArray357;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass175_5.method4660();
		this.aClass175_8.method4660();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass175_1 != null) {
			this.aClass175_1.method4660();
			this.aClass175_3.method4660();
			local24 = (int) ((double) (this.aClass175_1.anInt5366 - this.aClass175_1.anInt5367) * 32.768D / local16);
			local26 = (int) ((double) this.aClass175_1.anInt5367 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass175_2 != null) {
			this.aClass175_2.method4660();
			this.aClass175_7.method4660();
			local63 = (int) ((double) (this.aClass175_2.anInt5366 - this.aClass175_2.anInt5367) * 32.768D / local16);
			local65 = (int) ((double) this.aClass175_2.anInt5367 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray356[local102] != 0) {
				Static184.anIntArray359[local102] = 0;
				Static184.anIntArray358[local102] = (int) ((double) this.anIntArray354[local102] * local16);
				Static184.anIntArray361[local102] = (this.anIntArray356[local102] << 14) / 100;
				Static184.anIntArray360[local102] = (int) ((double) (this.aClass175_5.anInt5366 - this.aClass175_5.anInt5367) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray353[local102]) / local16);
				Static184.anIntArray362[local102] = (int) ((double) this.aClass175_5.anInt5367 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass175_5.method4662(arg0);
			local187 = this.aClass175_8.method4662(arg0);
			if (this.aClass175_1 != null) {
				local195 = this.aClass175_1.method4662(arg0);
				local200 = this.aClass175_3.method4662(arg0);
				local182 += this.method3608(local28, local200, this.aClass175_1.anInt5365) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass175_2 != null) {
				local195 = this.aClass175_2.method4662(arg0);
				local200 = this.aClass175_7.method4662(arg0);
				local187 = local187 * ((this.method3608(local67, local200, this.aClass175_2.anInt5365) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray356[local195] != 0) {
					local200 = local176 + Static184.anIntArray358[local195];
					if (local200 < arg0) {
						Static184.anIntArray357[local200] += this.method3608(Static184.anIntArray359[local195], local187 * Static184.anIntArray361[local195] >> 15, this.aClass175_5.anInt5365);
						Static184.anIntArray359[local195] += (local182 * Static184.anIntArray360[local195] >> 16) + Static184.anIntArray362[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass175_4 != null) {
			this.aClass175_4.method4660();
			this.aClass175_9.method4660();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass175_4.method4662(arg0);
				local352 = this.aClass175_9.method4662(arg0);
				if (local339) {
					local187 = this.aClass175_4.anInt5367 + ((this.aClass175_4.anInt5366 - this.aClass175_4.anInt5367) * local347 >> 8);
				} else {
					local187 = this.aClass175_4.anInt5367 + ((this.aClass175_4.anInt5366 - this.aClass175_4.anInt5367) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static184.anIntArray357[local200] = 0;
				}
			}
		}
		if (this.anInt3957 > 0 && this.anInt3955 > 0) {
			local182 = (int) ((double) this.anInt3957 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static184.anIntArray357[local187] += Static184.anIntArray357[local187 - local182] * this.anInt3955 / 100;
			}
		}
		if (this.aClass140_1.anIntArray384[0] > 0 || this.aClass140_1.anIntArray384[1] > 0) {
			this.aClass175_6.method4660();
			local182 = this.aClass175_6.method4662(arg0 + 1);
			local187 = this.aClass140_1.method3824(0, (float) local182 / 65536.0F);
			local195 = this.aClass140_1.method3824(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static184.anIntArray357[local200 + local187] * (long) Static201.anInt4248 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static184.anIntArray357[local200 + local187 - local519 - 1] * (long) Static201.anIntArrayArray47[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static184.anIntArray357[local200 - local549 - 1] * (long) Static201.anIntArrayArray47[1][local549] >> 16);
					}
					Static184.anIntArray357[local200] = local352;
					local182 = this.aClass175_6.method4662(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static184.anIntArray357[local200 + local187] * (long) Static201.anInt4248 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static184.anIntArray357[local200 + local187 - local519 - 1] * (long) Static201.anIntArrayArray47[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static184.anIntArray357[local200 - local549 - 1] * (long) Static201.anIntArrayArray47[1][local549] >> 16);
						}
						Static184.anIntArray357[local200] = local352;
						local182 = this.aClass175_6.method4662(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static184.anIntArray357[local200 + local187 - local519 - 1] * (long) Static201.anIntArrayArray47[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static184.anIntArray357[local200 - local549 - 1] * (long) Static201.anIntArrayArray47[1][local549] >> 16);
							}
							Static184.anIntArray357[local200] = local352;
							this.aClass175_6.method4662(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass140_1.method3824(0, (float) local182 / 65536.0F);
					local195 = this.aClass140_1.method3824(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static184.anIntArray357[local182] < -32768) {
				Static184.anIntArray357[local182] = -32768;
			}
			if (Static184.anIntArray357[local182] > 32767) {
				Static184.anIntArray357[local182] = 32767;
			}
		}
		return Static184.anIntArray357;
	}
}
