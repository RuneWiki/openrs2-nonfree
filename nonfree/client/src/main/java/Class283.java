import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class283 {

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
	private static final int[] anIntArray718 = new int[32768];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[I")
	private static final int[] anIntArray716;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!ke;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!ke;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "Lclient!ke;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!ke;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Lclient!ke;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Lclient!ke;")
	private Class160 aClass160_6;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Lclient!ke;")
	private Class160 aClass160_7;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Lclient!ke;")
	private Class160 aClass160_8;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "Lclient!an;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "Lclient!ke;")
	private Class160 aClass160_9;

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	private int anInt8470 = 0;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt8469 = 500;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "[I")
	private final int[] anIntArray720 = new int[5];

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
	private final int[] anIntArray717 = new int[5];

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public int anInt8471 = 0;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
	private final int[] anIntArray721 = new int[5];

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	private int anInt8468 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray718[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray716 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray716[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)I")
	private int method7010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray716[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray718[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!rt;)V")
	public void method7011(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aClass160_9 = new Class160();
		this.aClass160_9.method4235(arg0);
		this.aClass160_3 = new Class160();
		this.aClass160_3.method4235(arg0);
		@Pc(21) int local21 = arg0.method7548();
		if (local21 != 0) {
			arg0.anInt9191--;
			this.aClass160_5 = new Class160();
			this.aClass160_5.method4235(arg0);
			this.aClass160_6 = new Class160();
			this.aClass160_6.method4235(arg0);
		}
		local21 = arg0.method7548();
		if (local21 != 0) {
			arg0.anInt9191--;
			this.aClass160_8 = new Class160();
			this.aClass160_8.method4235(arg0);
			this.aClass160_2 = new Class160();
			this.aClass160_2.method4235(arg0);
		}
		local21 = arg0.method7548();
		if (local21 != 0) {
			arg0.anInt9191--;
			this.aClass160_1 = new Class160();
			this.aClass160_1.method4235(arg0);
			this.aClass160_7 = new Class160();
			this.aClass160_7.method4235(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7547();
			if (local114 == 0) {
				break;
			}
			this.anIntArray720[local109] = local114;
			this.anIntArray721[local109] = arg0.method7564();
			this.anIntArray717[local109] = arg0.method7547();
		}
		this.anInt8470 = arg0.method7547();
		this.anInt8468 = arg0.method7547();
		this.anInt8469 = arg0.method7591();
		this.anInt8471 = arg0.method7591();
		this.aClass16_1 = new Class16();
		this.aClass160_4 = new Class160();
		this.aClass16_1.method658(arg0, this.aClass160_4);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	public int[] method7013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static559.method5953(Static470.anIntArray719, 0, arg0);
		if (arg1 < 10) {
			return Static470.anIntArray719;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass160_9.method4234();
		this.aClass160_3.method4234();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass160_5 != null) {
			this.aClass160_5.method4234();
			this.aClass160_6.method4234();
			local24 = (int) ((double) (this.aClass160_5.anInt5045 - this.aClass160_5.anInt5044) * 32.768D / local16);
			local26 = (int) ((double) this.aClass160_5.anInt5044 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass160_8 != null) {
			this.aClass160_8.method4234();
			this.aClass160_2.method4234();
			local63 = (int) ((double) (this.aClass160_8.anInt5045 - this.aClass160_8.anInt5044) * 32.768D / local16);
			local65 = (int) ((double) this.aClass160_8.anInt5044 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray720[local102] != 0) {
				Static470.anIntArray726[local102] = 0;
				Static470.anIntArray722[local102] = (int) ((double) this.anIntArray717[local102] * local16);
				Static470.anIntArray723[local102] = (this.anIntArray720[local102] << 14) / 100;
				Static470.anIntArray724[local102] = (int) ((double) (this.aClass160_9.anInt5045 - this.aClass160_9.anInt5044) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray721[local102]) / local16);
				Static470.anIntArray725[local102] = (int) ((double) this.aClass160_9.anInt5044 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass160_9.method4232(arg0);
			local187 = this.aClass160_3.method4232(arg0);
			if (this.aClass160_5 != null) {
				local195 = this.aClass160_5.method4232(arg0);
				local200 = this.aClass160_6.method4232(arg0);
				local182 += this.method7010(local28, local200, this.aClass160_5.anInt5047) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass160_8 != null) {
				local195 = this.aClass160_8.method4232(arg0);
				local200 = this.aClass160_2.method4232(arg0);
				local187 = local187 * ((this.method7010(local67, local200, this.aClass160_8.anInt5047) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray720[local195] != 0) {
					local200 = local176 + Static470.anIntArray722[local195];
					if (local200 < arg0) {
						Static470.anIntArray719[local200] += this.method7010(Static470.anIntArray726[local195], local187 * Static470.anIntArray723[local195] >> 15, this.aClass160_9.anInt5047);
						Static470.anIntArray726[local195] += (local182 * Static470.anIntArray724[local195] >> 16) + Static470.anIntArray725[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass160_1 != null) {
			this.aClass160_1.method4234();
			this.aClass160_7.method4234();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass160_1.method4232(arg0);
				local352 = this.aClass160_7.method4232(arg0);
				if (local339) {
					local187 = this.aClass160_1.anInt5044 + ((this.aClass160_1.anInt5045 - this.aClass160_1.anInt5044) * local347 >> 8);
				} else {
					local187 = this.aClass160_1.anInt5044 + ((this.aClass160_1.anInt5045 - this.aClass160_1.anInt5044) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static470.anIntArray719[local200] = 0;
				}
			}
		}
		if (this.anInt8470 > 0 && this.anInt8468 > 0) {
			local182 = (int) ((double) this.anInt8470 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static470.anIntArray719[local187] += Static470.anIntArray719[local187 - local182] * this.anInt8468 / 100;
			}
		}
		if (this.aClass16_1.anIntArray113[0] > 0 || this.aClass16_1.anIntArray113[1] > 0) {
			this.aClass160_4.method4234();
			local182 = this.aClass160_4.method4232(arg0 + 1);
			local187 = this.aClass16_1.method653(0, (float) local182 / 65536.0F);
			local195 = this.aClass16_1.method653(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static470.anIntArray719[local200 + local187] * (long) Static14.anInt634 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static470.anIntArray719[local200 + local187 - local519 - 1] * (long) Static14.anIntArrayArray14[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static470.anIntArray719[local200 - local549 - 1] * (long) Static14.anIntArrayArray14[1][local549] >> 16);
					}
					Static470.anIntArray719[local200] = local352;
					local182 = this.aClass160_4.method4232(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static470.anIntArray719[local200 + local187] * (long) Static14.anInt634 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static470.anIntArray719[local200 + local187 - local519 - 1] * (long) Static14.anIntArrayArray14[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static470.anIntArray719[local200 - local549 - 1] * (long) Static14.anIntArrayArray14[1][local549] >> 16);
						}
						Static470.anIntArray719[local200] = local352;
						local182 = this.aClass160_4.method4232(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static470.anIntArray719[local200 + local187 - local519 - 1] * (long) Static14.anIntArrayArray14[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static470.anIntArray719[local200 - local549 - 1] * (long) Static14.anIntArrayArray14[1][local549] >> 16);
							}
							Static470.anIntArray719[local200] = local352;
							this.aClass160_4.method4232(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass16_1.method653(0, (float) local182 / 65536.0F);
					local195 = this.aClass16_1.method653(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static470.anIntArray719[local182] < -32768) {
				Static470.anIntArray719[local182] = -32768;
			}
			if (Static470.anIntArray719[local182] > 32767) {
				Static470.anIntArray719[local182] = 32767;
			}
		}
		return Static470.anIntArray719;
	}
}
