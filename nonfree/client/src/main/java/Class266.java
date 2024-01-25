import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class266 {

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "[I")
	private static final int[] anIntArray398 = new int[32768];

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "[I")
	private static final int[] anIntArray395;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!kc;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!kc;")
	private Class184 aClass184_2;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!kc;")
	private Class184 aClass184_3;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!kc;")
	private Class184 aClass184_4;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Lclient!faa;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!kc;")
	private Class184 aClass184_5;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "Lclient!kc;")
	private Class184 aClass184_6;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "Lclient!kc;")
	private Class184 aClass184_7;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Lclient!kc;")
	private Class184 aClass184_8;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "Lclient!kc;")
	private Class184 aClass184_9;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt7763 = 500;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
	private final int[] anIntArray397 = new int[5];

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	private int anInt7764 = 0;

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "[I")
	private final int[] anIntArray404 = new int[5];

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
	public int anInt7765 = 0;

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "I")
	private int anInt7766 = 100;

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "[I")
	private final int[] anIntArray405 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray398[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray395 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray395[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!un;)V")
	public void method6475(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aClass184_5 = new Class184();
		this.aClass184_5.method4416(arg0);
		this.aClass184_2 = new Class184();
		this.aClass184_2.method4416(arg0);
		@Pc(21) int local21 = arg0.method4905();
		if (local21 != 0) {
			arg0.anInt5831--;
			this.aClass184_9 = new Class184();
			this.aClass184_9.method4416(arg0);
			this.aClass184_4 = new Class184();
			this.aClass184_4.method4416(arg0);
		}
		local21 = arg0.method4905();
		if (local21 != 0) {
			arg0.anInt5831--;
			this.aClass184_7 = new Class184();
			this.aClass184_7.method4416(arg0);
			this.aClass184_6 = new Class184();
			this.aClass184_6.method4416(arg0);
		}
		local21 = arg0.method4905();
		if (local21 != 0) {
			arg0.anInt5831--;
			this.aClass184_1 = new Class184();
			this.aClass184_1.method4416(arg0);
			this.aClass184_8 = new Class184();
			this.aClass184_8.method4416(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4942();
			if (local114 == 0) {
				break;
			}
			this.anIntArray405[local109] = local114;
			this.anIntArray397[local109] = arg0.method4904();
			this.anIntArray404[local109] = arg0.method4942();
		}
		this.anInt7764 = arg0.method4942();
		this.anInt7766 = arg0.method4942();
		this.anInt7763 = arg0.method4936();
		this.anInt7765 = arg0.method4936();
		this.aClass94_1 = new Class94();
		this.aClass184_3 = new Class184();
		this.aClass94_1.method2618(arg0, this.aClass184_3);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)[I")
	public int[] method6476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static597.method3727(Static409.anIntArray396, 0, arg0);
		if (arg1 < 10) {
			return Static409.anIntArray396;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass184_5.method4414();
		this.aClass184_2.method4414();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass184_9 != null) {
			this.aClass184_9.method4414();
			this.aClass184_4.method4414();
			local24 = (int) ((double) (this.aClass184_9.anInt5013 - this.aClass184_9.anInt5012) * 32.768D / local16);
			local26 = (int) ((double) this.aClass184_9.anInt5012 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass184_7 != null) {
			this.aClass184_7.method4414();
			this.aClass184_6.method4414();
			local63 = (int) ((double) (this.aClass184_7.anInt5013 - this.aClass184_7.anInt5012) * 32.768D / local16);
			local65 = (int) ((double) this.aClass184_7.anInt5012 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray405[local102] != 0) {
				Static409.anIntArray401[local102] = 0;
				Static409.anIntArray400[local102] = (int) ((double) this.anIntArray404[local102] * local16);
				Static409.anIntArray403[local102] = (this.anIntArray405[local102] << 14) / 100;
				Static409.anIntArray399[local102] = (int) ((double) (this.aClass184_5.anInt5013 - this.aClass184_5.anInt5012) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray397[local102]) / local16);
				Static409.anIntArray402[local102] = (int) ((double) this.aClass184_5.anInt5012 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass184_5.method4415(arg0);
			local187 = this.aClass184_2.method4415(arg0);
			if (this.aClass184_9 != null) {
				local195 = this.aClass184_9.method4415(arg0);
				local200 = this.aClass184_4.method4415(arg0);
				local182 += this.method6477(local28, local200, this.aClass184_9.anInt5014) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass184_7 != null) {
				local195 = this.aClass184_7.method4415(arg0);
				local200 = this.aClass184_6.method4415(arg0);
				local187 = local187 * ((this.method6477(local67, local200, this.aClass184_7.anInt5014) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray405[local195] != 0) {
					local200 = local176 + Static409.anIntArray400[local195];
					if (local200 < arg0) {
						Static409.anIntArray396[local200] += this.method6477(Static409.anIntArray401[local195], local187 * Static409.anIntArray403[local195] >> 15, this.aClass184_5.anInt5014);
						Static409.anIntArray401[local195] += (local182 * Static409.anIntArray399[local195] >> 16) + Static409.anIntArray402[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass184_1 != null) {
			this.aClass184_1.method4414();
			this.aClass184_8.method4414();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass184_1.method4415(arg0);
				local352 = this.aClass184_8.method4415(arg0);
				if (local339) {
					local187 = this.aClass184_1.anInt5012 + ((this.aClass184_1.anInt5013 - this.aClass184_1.anInt5012) * local347 >> 8);
				} else {
					local187 = this.aClass184_1.anInt5012 + ((this.aClass184_1.anInt5013 - this.aClass184_1.anInt5012) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static409.anIntArray396[local200] = 0;
				}
			}
		}
		if (this.anInt7764 > 0 && this.anInt7766 > 0) {
			local182 = (int) ((double) this.anInt7764 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static409.anIntArray396[local187] += Static409.anIntArray396[local187 - local182] * this.anInt7766 / 100;
			}
		}
		if (this.aClass94_1.anIntArray131[0] > 0 || this.aClass94_1.anIntArray131[1] > 0) {
			this.aClass184_3.method4414();
			local182 = this.aClass184_3.method4415(arg0 + 1);
			local187 = this.aClass94_1.method2614(0, (float) local182 / 65536.0F);
			local195 = this.aClass94_1.method2614(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static409.anIntArray396[local200 + local187] * (long) Static127.anInt2812 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static409.anIntArray396[local200 + local187 - local519 - 1] * (long) Static127.anIntArrayArray18[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static409.anIntArray396[local200 - local549 - 1] * (long) Static127.anIntArrayArray18[1][local549] >> 16);
					}
					Static409.anIntArray396[local200] = local352;
					local182 = this.aClass184_3.method4415(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static409.anIntArray396[local200 + local187] * (long) Static127.anInt2812 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static409.anIntArray396[local200 + local187 - local519 - 1] * (long) Static127.anIntArrayArray18[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static409.anIntArray396[local200 - local549 - 1] * (long) Static127.anIntArrayArray18[1][local549] >> 16);
						}
						Static409.anIntArray396[local200] = local352;
						local182 = this.aClass184_3.method4415(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static409.anIntArray396[local200 + local187 - local519 - 1] * (long) Static127.anIntArrayArray18[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static409.anIntArray396[local200 - local549 - 1] * (long) Static127.anIntArrayArray18[1][local549] >> 16);
							}
							Static409.anIntArray396[local200] = local352;
							this.aClass184_3.method4415(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass94_1.method2614(0, (float) local182 / 65536.0F);
					local195 = this.aClass94_1.method2614(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static409.anIntArray396[local182] < -32768) {
				Static409.anIntArray396[local182] = -32768;
			}
			if (Static409.anIntArray396[local182] > 32767) {
				Static409.anIntArray396[local182] = 32767;
			}
		}
		return Static409.anIntArray396;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)I")
	private int method6477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray395[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray398[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
