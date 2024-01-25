import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class215 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "[I")
	private static final int[] anIntArray446 = new int[32768];

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
	private static final int[] anIntArray449;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!wn;")
	private Class349 aClass349_1;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!wn;")
	private Class349 aClass349_2;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!wn;")
	private Class349 aClass349_3;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!wn;")
	private Class349 aClass349_4;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "Lclient!wn;")
	private Class349 aClass349_5;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!mda;")
	private Class210 aClass210_1;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!wn;")
	private Class349 aClass349_6;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "Lclient!wn;")
	private Class349 aClass349_7;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!wn;")
	private Class349 aClass349_8;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Lclient!wn;")
	private Class349 aClass349_9;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "[I")
	private final int[] anIntArray447 = new int[5];

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
	public int anInt6170 = 0;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	private int anInt6171 = 100;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public int anInt6169 = 500;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
	private final int[] anIntArray448 = new int[5];

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "[I")
	private final int[] anIntArray451 = new int[5];

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	private int anInt6172 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray446[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray449 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray449[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I")
	private int method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray449[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray446[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
	public int[] method5262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static589.method5384(Static328.anIntArray450, 0, arg0);
		if (arg1 < 10) {
			return Static328.anIntArray450;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass349_9.method8096();
		this.aClass349_1.method8096();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass349_6 != null) {
			this.aClass349_6.method8096();
			this.aClass349_7.method8096();
			local24 = (int) ((double) (this.aClass349_6.anInt9721 - this.aClass349_6.anInt9720) * 32.768D / local16);
			local26 = (int) ((double) this.aClass349_6.anInt9720 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass349_2 != null) {
			this.aClass349_2.method8096();
			this.aClass349_5.method8096();
			local63 = (int) ((double) (this.aClass349_2.anInt9721 - this.aClass349_2.anInt9720) * 32.768D / local16);
			local65 = (int) ((double) this.aClass349_2.anInt9720 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray447[local102] != 0) {
				Static328.anIntArray453[local102] = 0;
				Static328.anIntArray456[local102] = (int) ((double) this.anIntArray448[local102] * local16);
				Static328.anIntArray455[local102] = (this.anIntArray447[local102] << 14) / 100;
				Static328.anIntArray454[local102] = (int) ((double) (this.aClass349_9.anInt9721 - this.aClass349_9.anInt9720) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray451[local102]) / local16);
				Static328.anIntArray452[local102] = (int) ((double) this.aClass349_9.anInt9720 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass349_9.method8095(arg0);
			local187 = this.aClass349_1.method8095(arg0);
			if (this.aClass349_6 != null) {
				local195 = this.aClass349_6.method8095(arg0);
				local200 = this.aClass349_7.method8095(arg0);
				local182 += this.method5260(local28, local200, this.aClass349_6.anInt9723) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass349_2 != null) {
				local195 = this.aClass349_2.method8095(arg0);
				local200 = this.aClass349_5.method8095(arg0);
				local187 = local187 * ((this.method5260(local67, local200, this.aClass349_2.anInt9723) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray447[local195] != 0) {
					local200 = local176 + Static328.anIntArray456[local195];
					if (local200 < arg0) {
						Static328.anIntArray450[local200] += this.method5260(Static328.anIntArray453[local195], local187 * Static328.anIntArray455[local195] >> 15, this.aClass349_9.anInt9723);
						Static328.anIntArray453[local195] += (local182 * Static328.anIntArray454[local195] >> 16) + Static328.anIntArray452[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass349_3 != null) {
			this.aClass349_3.method8096();
			this.aClass349_8.method8096();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass349_3.method8095(arg0);
				local352 = this.aClass349_8.method8095(arg0);
				if (local339) {
					local187 = this.aClass349_3.anInt9720 + ((this.aClass349_3.anInt9721 - this.aClass349_3.anInt9720) * local347 >> 8);
				} else {
					local187 = this.aClass349_3.anInt9720 + ((this.aClass349_3.anInt9721 - this.aClass349_3.anInt9720) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static328.anIntArray450[local200] = 0;
				}
			}
		}
		if (this.anInt6172 > 0 && this.anInt6171 > 0) {
			local182 = (int) ((double) this.anInt6172 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static328.anIntArray450[local187] += Static328.anIntArray450[local187 - local182] * this.anInt6171 / 100;
			}
		}
		if (this.aClass210_1.anIntArray436[0] > 0 || this.aClass210_1.anIntArray436[1] > 0) {
			this.aClass349_4.method8096();
			local182 = this.aClass349_4.method8095(arg0 + 1);
			local187 = this.aClass210_1.method5108(0, (float) local182 / 65536.0F);
			local195 = this.aClass210_1.method5108(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static328.anIntArray450[local200 + local187] * (long) Static317.anInt5959 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static328.anIntArray450[local200 + local187 - local519 - 1] * (long) Static317.anIntArrayArray41[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static328.anIntArray450[local200 - local549 - 1] * (long) Static317.anIntArrayArray41[1][local549] >> 16);
					}
					Static328.anIntArray450[local200] = local352;
					local182 = this.aClass349_4.method8095(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static328.anIntArray450[local200 + local187] * (long) Static317.anInt5959 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static328.anIntArray450[local200 + local187 - local519 - 1] * (long) Static317.anIntArrayArray41[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static328.anIntArray450[local200 - local549 - 1] * (long) Static317.anIntArrayArray41[1][local549] >> 16);
						}
						Static328.anIntArray450[local200] = local352;
						local182 = this.aClass349_4.method8095(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static328.anIntArray450[local200 + local187 - local519 - 1] * (long) Static317.anIntArrayArray41[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static328.anIntArray450[local200 - local549 - 1] * (long) Static317.anIntArrayArray41[1][local549] >> 16);
							}
							Static328.anIntArray450[local200] = local352;
							this.aClass349_4.method8095(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass210_1.method5108(0, (float) local182 / 65536.0F);
					local195 = this.aClass210_1.method5108(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static328.anIntArray450[local182] < -32768) {
				Static328.anIntArray450[local182] = -32768;
			}
			if (Static328.anIntArray450[local182] > 32767) {
				Static328.anIntArray450[local182] = 32767;
			}
		}
		return Static328.anIntArray450;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!iaa;)V")
	public void method5263(@OriginalArg(0) Class6_Sub26 arg0) {
		this.aClass349_9 = new Class349();
		this.aClass349_9.method8093(arg0);
		this.aClass349_1 = new Class349();
		this.aClass349_1.method8093(arg0);
		@Pc(21) int local21 = arg0.method4966();
		if (local21 != 0) {
			arg0.anInt5769--;
			this.aClass349_6 = new Class349();
			this.aClass349_6.method8093(arg0);
			this.aClass349_7 = new Class349();
			this.aClass349_7.method8093(arg0);
		}
		local21 = arg0.method4966();
		if (local21 != 0) {
			arg0.anInt5769--;
			this.aClass349_2 = new Class349();
			this.aClass349_2.method8093(arg0);
			this.aClass349_5 = new Class349();
			this.aClass349_5.method8093(arg0);
		}
		local21 = arg0.method4966();
		if (local21 != 0) {
			arg0.anInt5769--;
			this.aClass349_3 = new Class349();
			this.aClass349_3.method8093(arg0);
			this.aClass349_8 = new Class349();
			this.aClass349_8.method8093(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4973();
			if (local114 == 0) {
				break;
			}
			this.anIntArray447[local109] = local114;
			this.anIntArray451[local109] = arg0.method4997();
			this.anIntArray448[local109] = arg0.method4973();
		}
		this.anInt6172 = arg0.method4973();
		this.anInt6171 = arg0.method4973();
		this.anInt6169 = arg0.method4999();
		this.anInt6170 = arg0.method4999();
		this.aClass210_1 = new Class210();
		this.aClass349_4 = new Class349();
		this.aClass210_1.method5110(arg0, this.aClass349_4);
	}
}
