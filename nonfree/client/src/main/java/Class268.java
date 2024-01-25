import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class268 {

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "[I")
	private static final int[] anIntArray549 = new int[32768];

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "[I")
	private static final int[] anIntArray545;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "Lclient!tca;")
	private Class302 aClass302_1;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "Lclient!tca;")
	private Class302 aClass302_2;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!tca;")
	private Class302 aClass302_3;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Lclient!tca;")
	private Class302 aClass302_4;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "Lclient!tca;")
	private Class302 aClass302_5;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "Lclient!tca;")
	private Class302 aClass302_6;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "Lclient!tca;")
	private Class302 aClass302_7;

	@OriginalMember(owner = "client!qv", name = "q", descriptor = "Lclient!mw;")
	private Class211 aClass211_1;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "Lclient!tca;")
	private Class302 aClass302_8;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "Lclient!tca;")
	private Class302 aClass302_9;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	private int anInt7735 = 0;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	private int anInt7734 = 100;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "[I")
	private final int[] anIntArray544 = new int[5];

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public int anInt7736 = 500;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
	public int anInt7737 = 0;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "[I")
	private final int[] anIntArray548 = new int[5];

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "[I")
	private final int[] anIntArray546 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray549[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray545 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray545[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)I")
	private int method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray545[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray549[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!jr;)V")
	public void method6155(@OriginalArg(0) Class6_Sub12 arg0) {
		this.aClass302_2 = new Class302();
		this.aClass302_2.method6858(arg0);
		this.aClass302_6 = new Class302();
		this.aClass302_6.method6858(arg0);
		@Pc(21) int local21 = arg0.method6019();
		if (local21 != 0) {
			arg0.anInt7556--;
			this.aClass302_3 = new Class302();
			this.aClass302_3.method6858(arg0);
			this.aClass302_9 = new Class302();
			this.aClass302_9.method6858(arg0);
		}
		local21 = arg0.method6019();
		if (local21 != 0) {
			arg0.anInt7556--;
			this.aClass302_1 = new Class302();
			this.aClass302_1.method6858(arg0);
			this.aClass302_5 = new Class302();
			this.aClass302_5.method6858(arg0);
		}
		local21 = arg0.method6019();
		if (local21 != 0) {
			arg0.anInt7556--;
			this.aClass302_4 = new Class302();
			this.aClass302_4.method6858(arg0);
			this.aClass302_8 = new Class302();
			this.aClass302_8.method6858(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6034();
			if (local114 == 0) {
				break;
			}
			this.anIntArray544[local109] = local114;
			this.anIntArray548[local109] = arg0.method6010();
			this.anIntArray546[local109] = arg0.method6034();
		}
		this.anInt7735 = arg0.method6034();
		this.anInt7734 = arg0.method6034();
		this.anInt7736 = arg0.method6044();
		this.anInt7737 = arg0.method6044();
		this.aClass211_1 = new Class211();
		this.aClass302_7 = new Class302();
		this.aClass211_1.method5068(arg0, this.aClass302_7);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)[I")
	public int[] method6156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static596.method7717(Static433.anIntArray547, 0, arg0);
		if (arg1 < 10) {
			return Static433.anIntArray547;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass302_2.method6859();
		this.aClass302_6.method6859();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass302_3 != null) {
			this.aClass302_3.method6859();
			this.aClass302_9.method6859();
			local24 = (int) ((double) (this.aClass302_3.anInt8628 - this.aClass302_3.anInt8627) * 32.768D / local16);
			local26 = (int) ((double) this.aClass302_3.anInt8627 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass302_1 != null) {
			this.aClass302_1.method6859();
			this.aClass302_5.method6859();
			local63 = (int) ((double) (this.aClass302_1.anInt8628 - this.aClass302_1.anInt8627) * 32.768D / local16);
			local65 = (int) ((double) this.aClass302_1.anInt8627 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray544[local102] != 0) {
				Static433.anIntArray554[local102] = 0;
				Static433.anIntArray551[local102] = (int) ((double) this.anIntArray546[local102] * local16);
				Static433.anIntArray550[local102] = (this.anIntArray544[local102] << 14) / 100;
				Static433.anIntArray552[local102] = (int) ((double) (this.aClass302_2.anInt8628 - this.aClass302_2.anInt8627) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray548[local102]) / local16);
				Static433.anIntArray553[local102] = (int) ((double) this.aClass302_2.anInt8627 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass302_2.method6857(arg0);
			local187 = this.aClass302_6.method6857(arg0);
			if (this.aClass302_3 != null) {
				local195 = this.aClass302_3.method6857(arg0);
				local200 = this.aClass302_9.method6857(arg0);
				local182 += this.method6153(local28, local200, this.aClass302_3.anInt8626) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass302_1 != null) {
				local195 = this.aClass302_1.method6857(arg0);
				local200 = this.aClass302_5.method6857(arg0);
				local187 = local187 * ((this.method6153(local67, local200, this.aClass302_1.anInt8626) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray544[local195] != 0) {
					local200 = local176 + Static433.anIntArray551[local195];
					if (local200 < arg0) {
						Static433.anIntArray547[local200] += this.method6153(Static433.anIntArray554[local195], local187 * Static433.anIntArray550[local195] >> 15, this.aClass302_2.anInt8626);
						Static433.anIntArray554[local195] += (local182 * Static433.anIntArray552[local195] >> 16) + Static433.anIntArray553[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass302_4 != null) {
			this.aClass302_4.method6859();
			this.aClass302_8.method6859();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass302_4.method6857(arg0);
				local352 = this.aClass302_8.method6857(arg0);
				if (local339) {
					local187 = this.aClass302_4.anInt8627 + ((this.aClass302_4.anInt8628 - this.aClass302_4.anInt8627) * local347 >> 8);
				} else {
					local187 = this.aClass302_4.anInt8627 + ((this.aClass302_4.anInt8628 - this.aClass302_4.anInt8627) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static433.anIntArray547[local200] = 0;
				}
			}
		}
		if (this.anInt7735 > 0 && this.anInt7734 > 0) {
			local182 = (int) ((double) this.anInt7735 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static433.anIntArray547[local187] += Static433.anIntArray547[local187 - local182] * this.anInt7734 / 100;
			}
		}
		if (this.aClass211_1.anIntArray441[0] > 0 || this.aClass211_1.anIntArray441[1] > 0) {
			this.aClass302_7.method6859();
			local182 = this.aClass302_7.method6857(arg0 + 1);
			local187 = this.aClass211_1.method5072(0, (float) local182 / 65536.0F);
			local195 = this.aClass211_1.method5072(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static433.anIntArray547[local200 + local187] * (long) Static330.anInt6255 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static433.anIntArray547[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray49[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static433.anIntArray547[local200 - local549 - 1] * (long) Static330.anIntArrayArray49[1][local549] >> 16);
					}
					Static433.anIntArray547[local200] = local352;
					local182 = this.aClass302_7.method6857(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static433.anIntArray547[local200 + local187] * (long) Static330.anInt6255 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static433.anIntArray547[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray49[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static433.anIntArray547[local200 - local549 - 1] * (long) Static330.anIntArrayArray49[1][local549] >> 16);
						}
						Static433.anIntArray547[local200] = local352;
						local182 = this.aClass302_7.method6857(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static433.anIntArray547[local200 + local187 - local519 - 1] * (long) Static330.anIntArrayArray49[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static433.anIntArray547[local200 - local549 - 1] * (long) Static330.anIntArrayArray49[1][local549] >> 16);
							}
							Static433.anIntArray547[local200] = local352;
							this.aClass302_7.method6857(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass211_1.method5072(0, (float) local182 / 65536.0F);
					local195 = this.aClass211_1.method5072(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static433.anIntArray547[local182] < -32768) {
				Static433.anIntArray547[local182] = -32768;
			}
			if (Static433.anIntArray547[local182] > 32767) {
				Static433.anIntArray547[local182] = 32767;
			}
		}
		return Static433.anIntArray547;
	}
}
