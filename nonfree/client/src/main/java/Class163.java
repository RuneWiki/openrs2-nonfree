import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class163 {

	@OriginalMember(owner = "client!iha", name = "n", descriptor = "[I")
	private static final int[] anIntArray240 = new int[32768];

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "[I")
	private static final int[] anIntArray237;

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "Lclient!pr;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!pr;")
	private Class287 aClass287_2;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Lclient!pr;")
	private Class287 aClass287_3;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "Lclient!pr;")
	private Class287 aClass287_4;

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "Lclient!pr;")
	private Class287 aClass287_5;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "Lclient!pr;")
	private Class287 aClass287_6;

	@OriginalMember(owner = "client!iha", name = "o", descriptor = "Lclient!jb;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "Lclient!pr;")
	private Class287 aClass287_7;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "Lclient!pr;")
	private Class287 aClass287_8;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "Lclient!pr;")
	private Class287 aClass287_9;

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
	public int anInt4890 = 500;

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
	private int anInt4888 = 100;

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
	private int anInt4889 = 0;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "[I")
	private final int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
	public int anInt4891 = 0;

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "[I")
	private final int[] anIntArray247 = new int[5];

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "[I")
	private final int[] anIntArray243 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray240[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray237 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray237[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)I")
	private int method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray237[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray240[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!ol;)V")
	public void method4431(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass287_9 = new Class287();
		this.aClass287_9.method7497(arg0);
		this.aClass287_6 = new Class287();
		this.aClass287_6.method7497(arg0);
		@Pc(21) int local21 = arg0.method5203();
		if (local21 != 0) {
			arg0.anInt5725--;
			this.aClass287_2 = new Class287();
			this.aClass287_2.method7497(arg0);
			this.aClass287_4 = new Class287();
			this.aClass287_4.method7497(arg0);
		}
		local21 = arg0.method5203();
		if (local21 != 0) {
			arg0.anInt5725--;
			this.aClass287_5 = new Class287();
			this.aClass287_5.method7497(arg0);
			this.aClass287_8 = new Class287();
			this.aClass287_8.method7497(arg0);
		}
		local21 = arg0.method5203();
		if (local21 != 0) {
			arg0.anInt5725--;
			this.aClass287_3 = new Class287();
			this.aClass287_3.method7497(arg0);
			this.aClass287_1 = new Class287();
			this.aClass287_1.method7497(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5173();
			if (local114 == 0) {
				break;
			}
			this.anIntArray247[local109] = local114;
			this.anIntArray243[local109] = arg0.method5219();
			this.anIntArray239[local109] = arg0.method5173();
		}
		this.anInt4889 = arg0.method5173();
		this.anInt4888 = arg0.method5173();
		this.anInt4890 = arg0.method5211();
		this.anInt4891 = arg0.method5211();
		this.aClass175_1 = new Class175();
		this.aClass287_7 = new Class287();
		this.aClass175_1.method4645(arg0, this.aClass287_7);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)[I")
	public int[] method4432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static679.method4126(Static252.anIntArray238, 0, arg0);
		if (arg1 < 10) {
			return Static252.anIntArray238;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass287_9.method7494();
		this.aClass287_6.method7494();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass287_2 != null) {
			this.aClass287_2.method7494();
			this.aClass287_4.method7494();
			local24 = (int) ((double) (this.aClass287_2.anInt8401 - this.aClass287_2.anInt8404) * 32.768D / local16);
			local26 = (int) ((double) this.aClass287_2.anInt8404 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass287_5 != null) {
			this.aClass287_5.method7494();
			this.aClass287_8.method7494();
			local63 = (int) ((double) (this.aClass287_5.anInt8401 - this.aClass287_5.anInt8404) * 32.768D / local16);
			local65 = (int) ((double) this.aClass287_5.anInt8404 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray247[local102] != 0) {
				Static252.anIntArray242[local102] = 0;
				Static252.anIntArray244[local102] = (int) ((double) this.anIntArray239[local102] * local16);
				Static252.anIntArray241[local102] = (this.anIntArray247[local102] << 14) / 100;
				Static252.anIntArray245[local102] = (int) ((double) (this.aClass287_9.anInt8401 - this.aClass287_9.anInt8404) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray243[local102]) / local16);
				Static252.anIntArray246[local102] = (int) ((double) this.aClass287_9.anInt8404 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass287_9.method7496(arg0);
			local187 = this.aClass287_6.method7496(arg0);
			if (this.aClass287_2 != null) {
				local195 = this.aClass287_2.method7496(arg0);
				local200 = this.aClass287_4.method7496(arg0);
				local182 += this.method4429(local28, local200, this.aClass287_2.anInt8403) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass287_5 != null) {
				local195 = this.aClass287_5.method7496(arg0);
				local200 = this.aClass287_8.method7496(arg0);
				local187 = local187 * ((this.method4429(local67, local200, this.aClass287_5.anInt8403) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray247[local195] != 0) {
					local200 = local176 + Static252.anIntArray244[local195];
					if (local200 < arg0) {
						Static252.anIntArray238[local200] += this.method4429(Static252.anIntArray242[local195], local187 * Static252.anIntArray241[local195] >> 15, this.aClass287_9.anInt8403);
						Static252.anIntArray242[local195] += (local182 * Static252.anIntArray245[local195] >> 16) + Static252.anIntArray246[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass287_3 != null) {
			this.aClass287_3.method7494();
			this.aClass287_1.method7494();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass287_3.method7496(arg0);
				local352 = this.aClass287_1.method7496(arg0);
				if (local339) {
					local187 = this.aClass287_3.anInt8404 + ((this.aClass287_3.anInt8401 - this.aClass287_3.anInt8404) * local347 >> 8);
				} else {
					local187 = this.aClass287_3.anInt8404 + ((this.aClass287_3.anInt8401 - this.aClass287_3.anInt8404) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static252.anIntArray238[local200] = 0;
				}
			}
		}
		if (this.anInt4889 > 0 && this.anInt4888 > 0) {
			local182 = (int) ((double) this.anInt4889 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static252.anIntArray238[local187] += Static252.anIntArray238[local187 - local182] * this.anInt4888 / 100;
			}
		}
		if (this.aClass175_1.anIntArray256[0] > 0 || this.aClass175_1.anIntArray256[1] > 0) {
			this.aClass287_7.method7494();
			local182 = this.aClass287_7.method7496(arg0 + 1);
			local187 = this.aClass175_1.method4642(0, (float) local182 / 65536.0F);
			local195 = this.aClass175_1.method4642(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static252.anIntArray238[local200 + local187] * (long) Static272.anInt5095 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static252.anIntArray238[local200 + local187 - local519 - 1] * (long) Static272.anIntArrayArray17[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static252.anIntArray238[local200 - local549 - 1] * (long) Static272.anIntArrayArray17[1][local549] >> 16);
					}
					Static252.anIntArray238[local200] = local352;
					local182 = this.aClass287_7.method7496(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static252.anIntArray238[local200 + local187] * (long) Static272.anInt5095 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static252.anIntArray238[local200 + local187 - local519 - 1] * (long) Static272.anIntArrayArray17[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static252.anIntArray238[local200 - local549 - 1] * (long) Static272.anIntArrayArray17[1][local549] >> 16);
						}
						Static252.anIntArray238[local200] = local352;
						local182 = this.aClass287_7.method7496(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static252.anIntArray238[local200 + local187 - local519 - 1] * (long) Static272.anIntArrayArray17[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static252.anIntArray238[local200 - local549 - 1] * (long) Static272.anIntArrayArray17[1][local549] >> 16);
							}
							Static252.anIntArray238[local200] = local352;
							this.aClass287_7.method7496(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass175_1.method4642(0, (float) local182 / 65536.0F);
					local195 = this.aClass175_1.method4642(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static252.anIntArray238[local182] < -32768) {
				Static252.anIntArray238[local182] = -32768;
			}
			if (Static252.anIntArray238[local182] > 32767) {
				Static252.anIntArray238[local182] = 32767;
			}
		}
		return Static252.anIntArray238;
	}
}
