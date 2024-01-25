import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class204 {

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "[I")
	private static final int[] anIntArray433 = new int[32768];

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
	private static final int[] anIntArray432;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "Lclient!su;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "Lclient!su;")
	private Class271 aClass271_2;

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "Lclient!su;")
	private Class271 aClass271_3;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "Lclient!ae;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Lclient!su;")
	private Class271 aClass271_4;

	@OriginalMember(owner = "client!nda", name = "m", descriptor = "Lclient!su;")
	private Class271 aClass271_5;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "Lclient!su;")
	private Class271 aClass271_6;

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "Lclient!su;")
	private Class271 aClass271_7;

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "Lclient!su;")
	private Class271 aClass271_8;

	@OriginalMember(owner = "client!nda", name = "t", descriptor = "Lclient!su;")
	private Class271 aClass271_9;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
	public int anInt6042 = 0;

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
	public int anInt6043 = 500;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
	private int anInt6044 = 0;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	private int anInt6045 = 100;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "[I")
	private final int[] anIntArray431 = new int[5];

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "[I")
	private final int[] anIntArray436 = new int[5];

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "[I")
	private final int[] anIntArray435 = new int[5];

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

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I")
	private int method5210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!gw;)V")
	public void method5211(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aClass271_9 = new Class271();
		this.aClass271_9.method6444(arg0);
		this.aClass271_5 = new Class271();
		this.aClass271_5.method6444(arg0);
		@Pc(21) int local21 = arg0.method3043();
		if (local21 != 0) {
			arg0.anInt3400--;
			this.aClass271_2 = new Class271();
			this.aClass271_2.method6444(arg0);
			this.aClass271_1 = new Class271();
			this.aClass271_1.method6444(arg0);
		}
		local21 = arg0.method3043();
		if (local21 != 0) {
			arg0.anInt3400--;
			this.aClass271_6 = new Class271();
			this.aClass271_6.method6444(arg0);
			this.aClass271_3 = new Class271();
			this.aClass271_3.method6444(arg0);
		}
		local21 = arg0.method3043();
		if (local21 != 0) {
			arg0.anInt3400--;
			this.aClass271_4 = new Class271();
			this.aClass271_4.method6444(arg0);
			this.aClass271_7 = new Class271();
			this.aClass271_7.method6444(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3066();
			if (local114 == 0) {
				break;
			}
			this.anIntArray436[local109] = local114;
			this.anIntArray431[local109] = arg0.method3078();
			this.anIntArray435[local109] = arg0.method3066();
		}
		this.anInt6044 = arg0.method3066();
		this.anInt6045 = arg0.method3066();
		this.anInt6043 = arg0.method3056();
		this.anInt6042 = arg0.method3056();
		this.aClass7_1 = new Class7();
		this.aClass271_8 = new Class271();
		this.aClass7_1.method238(arg0, this.aClass271_8);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)[I")
	public int[] method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static555.method5093(Static319.anIntArray434, 0, arg0);
		if (arg1 < 10) {
			return Static319.anIntArray434;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass271_9.method6442();
		this.aClass271_5.method6442();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass271_2 != null) {
			this.aClass271_2.method6442();
			this.aClass271_1.method6442();
			local24 = (int) ((double) (this.aClass271_2.anInt7539 - this.aClass271_2.anInt7538) * 32.768D / local16);
			local26 = (int) ((double) this.aClass271_2.anInt7538 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass271_6 != null) {
			this.aClass271_6.method6442();
			this.aClass271_3.method6442();
			local63 = (int) ((double) (this.aClass271_6.anInt7539 - this.aClass271_6.anInt7538) * 32.768D / local16);
			local65 = (int) ((double) this.aClass271_6.anInt7538 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray436[local102] != 0) {
				Static319.anIntArray441[local102] = 0;
				Static319.anIntArray438[local102] = (int) ((double) this.anIntArray435[local102] * local16);
				Static319.anIntArray437[local102] = (this.anIntArray436[local102] << 14) / 100;
				Static319.anIntArray440[local102] = (int) ((double) (this.aClass271_9.anInt7539 - this.aClass271_9.anInt7538) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray431[local102]) / local16);
				Static319.anIntArray439[local102] = (int) ((double) this.aClass271_9.anInt7538 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass271_9.method6441(arg0);
			local187 = this.aClass271_5.method6441(arg0);
			if (this.aClass271_2 != null) {
				local195 = this.aClass271_2.method6441(arg0);
				local200 = this.aClass271_1.method6441(arg0);
				local182 += this.method5210(local28, local200, this.aClass271_2.anInt7536) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass271_6 != null) {
				local195 = this.aClass271_6.method6441(arg0);
				local200 = this.aClass271_3.method6441(arg0);
				local187 = local187 * ((this.method5210(local67, local200, this.aClass271_6.anInt7536) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray436[local195] != 0) {
					local200 = local176 + Static319.anIntArray438[local195];
					if (local200 < arg0) {
						Static319.anIntArray434[local200] += this.method5210(Static319.anIntArray441[local195], local187 * Static319.anIntArray437[local195] >> 15, this.aClass271_9.anInt7536);
						Static319.anIntArray441[local195] += (local182 * Static319.anIntArray440[local195] >> 16) + Static319.anIntArray439[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass271_4 != null) {
			this.aClass271_4.method6442();
			this.aClass271_7.method6442();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass271_4.method6441(arg0);
				local352 = this.aClass271_7.method6441(arg0);
				if (local339) {
					local187 = this.aClass271_4.anInt7538 + ((this.aClass271_4.anInt7539 - this.aClass271_4.anInt7538) * local347 >> 8);
				} else {
					local187 = this.aClass271_4.anInt7538 + ((this.aClass271_4.anInt7539 - this.aClass271_4.anInt7538) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static319.anIntArray434[local200] = 0;
				}
			}
		}
		if (this.anInt6044 > 0 && this.anInt6045 > 0) {
			local182 = (int) ((double) this.anInt6044 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static319.anIntArray434[local187] += Static319.anIntArray434[local187 - local182] * this.anInt6045 / 100;
			}
		}
		if (this.aClass7_1.anIntArray17[0] > 0 || this.aClass7_1.anIntArray17[1] > 0) {
			this.aClass271_8.method6442();
			local182 = this.aClass271_8.method6441(arg0 + 1);
			local187 = this.aClass7_1.method236(0, (float) local182 / 65536.0F);
			local195 = this.aClass7_1.method236(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static319.anIntArray434[local200 + local187] * (long) Static10.anInt120 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static319.anIntArray434[local200 + local187 - local519 - 1] * (long) Static10.anIntArrayArray1[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static319.anIntArray434[local200 - local549 - 1] * (long) Static10.anIntArrayArray1[1][local549] >> 16);
					}
					Static319.anIntArray434[local200] = local352;
					local182 = this.aClass271_8.method6441(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static319.anIntArray434[local200 + local187] * (long) Static10.anInt120 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static319.anIntArray434[local200 + local187 - local519 - 1] * (long) Static10.anIntArrayArray1[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static319.anIntArray434[local200 - local549 - 1] * (long) Static10.anIntArrayArray1[1][local549] >> 16);
						}
						Static319.anIntArray434[local200] = local352;
						local182 = this.aClass271_8.method6441(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static319.anIntArray434[local200 + local187 - local519 - 1] * (long) Static10.anIntArrayArray1[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static319.anIntArray434[local200 - local549 - 1] * (long) Static10.anIntArrayArray1[1][local549] >> 16);
							}
							Static319.anIntArray434[local200] = local352;
							this.aClass271_8.method6441(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass7_1.method236(0, (float) local182 / 65536.0F);
					local195 = this.aClass7_1.method236(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static319.anIntArray434[local182] < -32768) {
				Static319.anIntArray434[local182] = -32768;
			}
			if (Static319.anIntArray434[local182] > 32767) {
				Static319.anIntArray434[local182] = 32767;
			}
		}
		return Static319.anIntArray434;
	}
}
