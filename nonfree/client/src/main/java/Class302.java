import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class302 {

	@OriginalMember(owner = "client!rha", name = "o", descriptor = "[I")
	private static final int[] anIntArray468 = new int[32768];

	@OriginalMember(owner = "client!rha", name = "g", descriptor = "[I")
	private static final int[] anIntArray466;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "Lclient!sc;")
	private Class312 aClass312_1;

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "Lclient!sc;")
	private Class312 aClass312_2;

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "Lclient!po;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "Lclient!sc;")
	private Class312 aClass312_3;

	@OriginalMember(owner = "client!rha", name = "k", descriptor = "Lclient!sc;")
	private Class312 aClass312_4;

	@OriginalMember(owner = "client!rha", name = "n", descriptor = "Lclient!sc;")
	private Class312 aClass312_5;

	@OriginalMember(owner = "client!rha", name = "p", descriptor = "Lclient!sc;")
	private Class312 aClass312_6;

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "Lclient!sc;")
	private Class312 aClass312_7;

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "Lclient!sc;")
	private Class312 aClass312_8;

	@OriginalMember(owner = "client!rha", name = "y", descriptor = "Lclient!sc;")
	private Class312 aClass312_9;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
	private int anInt8271 = 100;

	@OriginalMember(owner = "client!rha", name = "m", descriptor = "[I")
	private final int[] anIntArray467 = new int[5];

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "I")
	public int anInt8273 = 0;

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "[I")
	private final int[] anIntArray464 = new int[5];

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "I")
	public int anInt8272 = 500;

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
	private int anInt8274 = 0;

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "[I")
	private final int[] anIntArray469 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray468[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray466 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray466[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(II)[I")
	public int[] method7195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static652.method4546(Static486.anIntArray465, 0, arg0);
		if (arg1 < 10) {
			return Static486.anIntArray465;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass312_2.method7536();
		this.aClass312_7.method7536();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass312_8 != null) {
			this.aClass312_8.method7536();
			this.aClass312_5.method7536();
			local24 = (int) ((double) (this.aClass312_8.anInt8752 - this.aClass312_8.anInt8751) * 32.768D / local16);
			local26 = (int) ((double) this.aClass312_8.anInt8751 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass312_4 != null) {
			this.aClass312_4.method7536();
			this.aClass312_1.method7536();
			local63 = (int) ((double) (this.aClass312_4.anInt8752 - this.aClass312_4.anInt8751) * 32.768D / local16);
			local65 = (int) ((double) this.aClass312_4.anInt8751 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray469[local102] != 0) {
				Static486.anIntArray470[local102] = 0;
				Static486.anIntArray471[local102] = (int) ((double) this.anIntArray467[local102] * local16);
				Static486.anIntArray472[local102] = (this.anIntArray469[local102] << 14) / 100;
				Static486.anIntArray474[local102] = (int) ((double) (this.aClass312_2.anInt8752 - this.aClass312_2.anInt8751) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray464[local102]) / local16);
				Static486.anIntArray473[local102] = (int) ((double) this.aClass312_2.anInt8751 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass312_2.method7538(arg0);
			local187 = this.aClass312_7.method7538(arg0);
			if (this.aClass312_8 != null) {
				local195 = this.aClass312_8.method7538(arg0);
				local200 = this.aClass312_5.method7538(arg0);
				local182 += this.method7198(local28, local200, this.aClass312_8.anInt8750) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass312_4 != null) {
				local195 = this.aClass312_4.method7538(arg0);
				local200 = this.aClass312_1.method7538(arg0);
				local187 = local187 * ((this.method7198(local67, local200, this.aClass312_4.anInt8750) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray469[local195] != 0) {
					local200 = local176 + Static486.anIntArray471[local195];
					if (local200 < arg0) {
						Static486.anIntArray465[local200] += this.method7198(Static486.anIntArray470[local195], local187 * Static486.anIntArray472[local195] >> 15, this.aClass312_2.anInt8750);
						Static486.anIntArray470[local195] += (local182 * Static486.anIntArray474[local195] >> 16) + Static486.anIntArray473[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass312_6 != null) {
			this.aClass312_6.method7536();
			this.aClass312_3.method7536();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass312_6.method7538(arg0);
				local352 = this.aClass312_3.method7538(arg0);
				if (local339) {
					local187 = this.aClass312_6.anInt8751 + ((this.aClass312_6.anInt8752 - this.aClass312_6.anInt8751) * local347 >> 8);
				} else {
					local187 = this.aClass312_6.anInt8751 + ((this.aClass312_6.anInt8752 - this.aClass312_6.anInt8751) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static486.anIntArray465[local200] = 0;
				}
			}
		}
		if (this.anInt8274 > 0 && this.anInt8271 > 0) {
			local182 = (int) ((double) this.anInt8274 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static486.anIntArray465[local187] += Static486.anIntArray465[local187 - local182] * this.anInt8271 / 100;
			}
		}
		if (this.aClass274_1.anIntArray403[0] > 0 || this.aClass274_1.anIntArray403[1] > 0) {
			this.aClass312_9.method7536();
			local182 = this.aClass312_9.method7538(arg0 + 1);
			local187 = this.aClass274_1.method6636(0, (float) local182 / 65536.0F);
			local195 = this.aClass274_1.method6636(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static486.anIntArray465[local200 + local187] * (long) Static434.anInt7483 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static486.anIntArray465[local200 + local187 - local519 - 1] * (long) Static434.anIntArrayArray53[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static486.anIntArray465[local200 - local549 - 1] * (long) Static434.anIntArrayArray53[1][local549] >> 16);
					}
					Static486.anIntArray465[local200] = local352;
					local182 = this.aClass312_9.method7538(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static486.anIntArray465[local200 + local187] * (long) Static434.anInt7483 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static486.anIntArray465[local200 + local187 - local519 - 1] * (long) Static434.anIntArrayArray53[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static486.anIntArray465[local200 - local549 - 1] * (long) Static434.anIntArrayArray53[1][local549] >> 16);
						}
						Static486.anIntArray465[local200] = local352;
						local182 = this.aClass312_9.method7538(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static486.anIntArray465[local200 + local187 - local519 - 1] * (long) Static434.anIntArrayArray53[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static486.anIntArray465[local200 - local549 - 1] * (long) Static434.anIntArrayArray53[1][local549] >> 16);
							}
							Static486.anIntArray465[local200] = local352;
							this.aClass312_9.method7538(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass274_1.method6636(0, (float) local182 / 65536.0F);
					local195 = this.aClass274_1.method6636(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static486.anIntArray465[local182] < -32768) {
				Static486.anIntArray465[local182] = -32768;
			}
			if (Static486.anIntArray465[local182] > 32767) {
				Static486.anIntArray465[local182] = 32767;
			}
		}
		return Static486.anIntArray465;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ofa;)V")
	public void method7196(@OriginalArg(0) Class5_Sub22 arg0) {
		this.aClass312_2 = new Class312();
		this.aClass312_2.method7535(arg0);
		this.aClass312_7 = new Class312();
		this.aClass312_7.method7535(arg0);
		@Pc(21) int local21 = arg0.method5966();
		if (local21 != 0) {
			arg0.anInt6629--;
			this.aClass312_8 = new Class312();
			this.aClass312_8.method7535(arg0);
			this.aClass312_5 = new Class312();
			this.aClass312_5.method7535(arg0);
		}
		local21 = arg0.method5966();
		if (local21 != 0) {
			arg0.anInt6629--;
			this.aClass312_4 = new Class312();
			this.aClass312_4.method7535(arg0);
			this.aClass312_1 = new Class312();
			this.aClass312_1.method7535(arg0);
		}
		local21 = arg0.method5966();
		if (local21 != 0) {
			arg0.anInt6629--;
			this.aClass312_6 = new Class312();
			this.aClass312_6.method7535(arg0);
			this.aClass312_3 = new Class312();
			this.aClass312_3.method7535(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5947();
			if (local114 == 0) {
				break;
			}
			this.anIntArray469[local109] = local114;
			this.anIntArray464[local109] = arg0.method5964();
			this.anIntArray467[local109] = arg0.method5947();
		}
		this.anInt8274 = arg0.method5947();
		this.anInt8271 = arg0.method5947();
		this.anInt8272 = arg0.method5968();
		this.anInt8273 = arg0.method5968();
		this.aClass274_1 = new Class274();
		this.aClass312_9 = new Class312();
		this.aClass274_1.method6634(arg0, this.aClass312_9);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)I")
	private int method7198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray466[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray468[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
