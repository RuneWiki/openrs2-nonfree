import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class111 {

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "[I")
	private static final int[] anIntArray185 = new int[32768];

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "[I")
	private static final int[] anIntArray184;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Lclient!mt;")
	private Class240 aClass240_1;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "Lclient!mt;")
	private Class240 aClass240_2;

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Lclient!os;")
	private Class269 aClass269_1;

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "Lclient!mt;")
	private Class240 aClass240_3;

	@OriginalMember(owner = "client!faa", name = "m", descriptor = "Lclient!mt;")
	private Class240 aClass240_4;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "Lclient!mt;")
	private Class240 aClass240_5;

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "Lclient!mt;")
	private Class240 aClass240_6;

	@OriginalMember(owner = "client!faa", name = "p", descriptor = "Lclient!mt;")
	private Class240 aClass240_7;

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "Lclient!mt;")
	private Class240 aClass240_8;

	@OriginalMember(owner = "client!faa", name = "r", descriptor = "Lclient!mt;")
	private Class240 aClass240_9;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
	private int anInt2844 = 100;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "[I")
	private final int[] anIntArray182 = new int[5];

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "[I")
	private final int[] anIntArray180 = new int[5];

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "[I")
	private final int[] anIntArray183 = new int[5];

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
	public int anInt2846 = 500;

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
	private int anInt2847 = 0;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
	public int anInt2845 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray185[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray184 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray184[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)I")
	private int method2613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray184[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray185[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!fca;)V")
	public void method2614(@OriginalArg(0) Class3_Sub17 arg0) {
		this.aClass240_3 = new Class240();
		this.aClass240_3.method5573(arg0);
		this.aClass240_5 = new Class240();
		this.aClass240_5.method5573(arg0);
		@Pc(21) int local21 = arg0.method4888();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass240_6 = new Class240();
			this.aClass240_6.method5573(arg0);
			this.aClass240_9 = new Class240();
			this.aClass240_9.method5573(arg0);
		}
		local21 = arg0.method4888();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass240_4 = new Class240();
			this.aClass240_4.method5573(arg0);
			this.aClass240_2 = new Class240();
			this.aClass240_2.method5573(arg0);
		}
		local21 = arg0.method4888();
		if (local21 != 0) {
			arg0.lb--;
			this.aClass240_8 = new Class240();
			this.aClass240_8.method5573(arg0);
			this.aClass240_1 = new Class240();
			this.aClass240_1.method5573(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4841();
			if (local114 == 0) {
				break;
			}
			this.anIntArray180[local109] = local114;
			this.anIntArray183[local109] = arg0.method4837();
			this.anIntArray182[local109] = arg0.method4841();
		}
		this.anInt2847 = arg0.method4841();
		this.anInt2844 = arg0.method4841();
		this.anInt2846 = arg0.method4858();
		this.anInt2845 = arg0.method4858();
		this.aClass269_1 = new Class269();
		this.aClass240_7 = new Class240();
		this.aClass269_1.method6403(arg0, this.aClass240_7);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)[I")
	public int[] method2615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static689.method8058(Static152.anIntArray181, 0, arg0);
		if (arg1 < 10) {
			return Static152.anIntArray181;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass240_3.method5574();
		this.aClass240_5.method5574();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass240_6 != null) {
			this.aClass240_6.method5574();
			this.aClass240_9.method5574();
			local24 = (int) ((double) (this.aClass240_6.anInt6683 - this.aClass240_6.anInt6682) * 32.768D / local16);
			local26 = (int) ((double) this.aClass240_6.anInt6682 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass240_4 != null) {
			this.aClass240_4.method5574();
			this.aClass240_2.method5574();
			local63 = (int) ((double) (this.aClass240_4.anInt6683 - this.aClass240_4.anInt6682) * 32.768D / local16);
			local65 = (int) ((double) this.aClass240_4.anInt6682 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray180[local102] != 0) {
				Static152.anIntArray187[local102] = 0;
				Static152.anIntArray186[local102] = (int) ((double) this.anIntArray182[local102] * local16);
				Static152.anIntArray189[local102] = (this.anIntArray180[local102] << 14) / 100;
				Static152.anIntArray190[local102] = (int) ((double) (this.aClass240_3.anInt6683 - this.aClass240_3.anInt6682) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray183[local102]) / local16);
				Static152.anIntArray188[local102] = (int) ((double) this.aClass240_3.anInt6682 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass240_3.method5571(arg0);
			local187 = this.aClass240_5.method5571(arg0);
			if (this.aClass240_6 != null) {
				local195 = this.aClass240_6.method5571(arg0);
				local200 = this.aClass240_9.method5571(arg0);
				local182 += this.method2613(local28, local200, this.aClass240_6.anInt6684) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass240_4 != null) {
				local195 = this.aClass240_4.method5571(arg0);
				local200 = this.aClass240_2.method5571(arg0);
				local187 = local187 * ((this.method2613(local67, local200, this.aClass240_4.anInt6684) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray180[local195] != 0) {
					local200 = local176 + Static152.anIntArray186[local195];
					if (local200 < arg0) {
						Static152.anIntArray181[local200] += this.method2613(Static152.anIntArray187[local195], local187 * Static152.anIntArray189[local195] >> 15, this.aClass240_3.anInt6684);
						Static152.anIntArray187[local195] += (local182 * Static152.anIntArray190[local195] >> 16) + Static152.anIntArray188[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass240_8 != null) {
			this.aClass240_8.method5574();
			this.aClass240_1.method5574();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass240_8.method5571(arg0);
				local352 = this.aClass240_1.method5571(arg0);
				if (local339) {
					local187 = this.aClass240_8.anInt6682 + ((this.aClass240_8.anInt6683 - this.aClass240_8.anInt6682) * local347 >> 8);
				} else {
					local187 = this.aClass240_8.anInt6682 + ((this.aClass240_8.anInt6683 - this.aClass240_8.anInt6682) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static152.anIntArray181[local200] = 0;
				}
			}
		}
		if (this.anInt2847 > 0 && this.anInt2844 > 0) {
			local182 = (int) ((double) this.anInt2847 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static152.anIntArray181[local187] += Static152.anIntArray181[local187 - local182] * this.anInt2844 / 100;
			}
		}
		if (this.aClass269_1.anIntArray460[0] > 0 || this.aClass269_1.anIntArray460[1] > 0) {
			this.aClass240_7.method5574();
			local182 = this.aClass240_7.method5571(arg0 + 1);
			local187 = this.aClass269_1.method6408(0, (float) local182 / 65536.0F);
			local195 = this.aClass269_1.method6408(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static152.anIntArray181[local200 + local187] * (long) Static439.anInt7651 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static152.anIntArray181[local200 + local187 - local519 - 1] * (long) Static439.anIntArrayArray77[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static152.anIntArray181[local200 - local549 - 1] * (long) Static439.anIntArrayArray77[1][local549] >> 16);
					}
					Static152.anIntArray181[local200] = local352;
					local182 = this.aClass240_7.method5571(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static152.anIntArray181[local200 + local187] * (long) Static439.anInt7651 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static152.anIntArray181[local200 + local187 - local519 - 1] * (long) Static439.anIntArrayArray77[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static152.anIntArray181[local200 - local549 - 1] * (long) Static439.anIntArrayArray77[1][local549] >> 16);
						}
						Static152.anIntArray181[local200] = local352;
						local182 = this.aClass240_7.method5571(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static152.anIntArray181[local200 + local187 - local519 - 1] * (long) Static439.anIntArrayArray77[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static152.anIntArray181[local200 - local549 - 1] * (long) Static439.anIntArrayArray77[1][local549] >> 16);
							}
							Static152.anIntArray181[local200] = local352;
							this.aClass240_7.method5571(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass269_1.method6408(0, (float) local182 / 65536.0F);
					local195 = this.aClass269_1.method6408(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static152.anIntArray181[local182] < -32768) {
				Static152.anIntArray181[local182] = -32768;
			}
			if (Static152.anIntArray181[local182] > 32767) {
				Static152.anIntArray181[local182] = 32767;
			}
		}
		return Static152.anIntArray181;
	}
}
