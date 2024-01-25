import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class259 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
	private static final int[] anIntArray649 = new int[32768];

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[I")
	private static final int[] anIntArray648;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!bv;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!bv;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!km;")
	private Class140 aClass140_1;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!bv;")
	private Class35 aClass35_3;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!bv;")
	private Class35 aClass35_4;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!bv;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!bv;")
	private Class35 aClass35_6;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "Lclient!bv;")
	private Class35 aClass35_7;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!bv;")
	private Class35 aClass35_8;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "Lclient!bv;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[I")
	private final int[] anIntArray650 = new int[5];

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "[I")
	private final int[] anIntArray652 = new int[5];

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	private int anInt7523 = 100;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	public int anInt7524 = 500;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	public int anInt7522 = 0;

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "[I")
	private final int[] anIntArray655 = new int[5];

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	private int anInt7525 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray649[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray648 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray648[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
	public int[] method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static460.method4219(Static436.anIntArray651, 0, arg0);
		if (arg1 < 10) {
			return Static436.anIntArray651;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass35_2.method692();
		this.aClass35_4.method692();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass35_8 != null) {
			this.aClass35_8.method692();
			this.aClass35_1.method692();
			local24 = (int) ((double) (this.aClass35_8.anInt762 - this.aClass35_8.anInt760) * 32.768D / local16);
			local26 = (int) ((double) this.aClass35_8.anInt760 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass35_7 != null) {
			this.aClass35_7.method692();
			this.aClass35_3.method692();
			local63 = (int) ((double) (this.aClass35_7.anInt762 - this.aClass35_7.anInt760) * 32.768D / local16);
			local65 = (int) ((double) this.aClass35_7.anInt760 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray650[local102] != 0) {
				Static436.anIntArray654[local102] = 0;
				Static436.anIntArray653[local102] = (int) ((double) this.anIntArray652[local102] * local16);
				Static436.anIntArray657[local102] = (this.anIntArray650[local102] << 14) / 100;
				Static436.anIntArray656[local102] = (int) ((double) (this.aClass35_2.anInt762 - this.aClass35_2.anInt760) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray655[local102]) / local16);
				Static436.anIntArray658[local102] = (int) ((double) this.aClass35_2.anInt760 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass35_2.method690(arg0);
			local187 = this.aClass35_4.method690(arg0);
			if (this.aClass35_8 != null) {
				local195 = this.aClass35_8.method690(arg0);
				local200 = this.aClass35_1.method690(arg0);
				local182 += this.method5838(local28, local200, this.aClass35_8.anInt763) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass35_7 != null) {
				local195 = this.aClass35_7.method690(arg0);
				local200 = this.aClass35_3.method690(arg0);
				local187 = local187 * ((this.method5838(local67, local200, this.aClass35_7.anInt763) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray650[local195] != 0) {
					local200 = local176 + Static436.anIntArray653[local195];
					if (local200 < arg0) {
						Static436.anIntArray651[local200] += this.method5838(Static436.anIntArray654[local195], local187 * Static436.anIntArray657[local195] >> 15, this.aClass35_2.anInt763);
						Static436.anIntArray654[local195] += (local182 * Static436.anIntArray656[local195] >> 16) + Static436.anIntArray658[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass35_5 != null) {
			this.aClass35_5.method692();
			this.aClass35_6.method692();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass35_5.method690(arg0);
				local352 = this.aClass35_6.method690(arg0);
				if (local339) {
					local187 = this.aClass35_5.anInt760 + ((this.aClass35_5.anInt762 - this.aClass35_5.anInt760) * local347 >> 8);
				} else {
					local187 = this.aClass35_5.anInt760 + ((this.aClass35_5.anInt762 - this.aClass35_5.anInt760) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static436.anIntArray651[local200] = 0;
				}
			}
		}
		if (this.anInt7525 > 0 && this.anInt7523 > 0) {
			local182 = (int) ((double) this.anInt7525 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static436.anIntArray651[local187] += Static436.anIntArray651[local187 - local182] * this.anInt7523 / 100;
			}
		}
		if (this.aClass140_1.anIntArray321[0] > 0 || this.aClass140_1.anIntArray321[1] > 0) {
			this.aClass35_9.method692();
			local182 = this.aClass35_9.method690(arg0 + 1);
			local187 = this.aClass140_1.method3237(0, (float) local182 / 65536.0F);
			local195 = this.aClass140_1.method3237(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static436.anIntArray651[local200 + local187] * (long) Static213.anInt3877 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static436.anIntArray651[local200 + local187 - local519 - 1] * (long) Static213.anIntArrayArray106[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static436.anIntArray651[local200 - local549 - 1] * (long) Static213.anIntArrayArray106[1][local549] >> 16);
					}
					Static436.anIntArray651[local200] = local352;
					local182 = this.aClass35_9.method690(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static436.anIntArray651[local200 + local187] * (long) Static213.anInt3877 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static436.anIntArray651[local200 + local187 - local519 - 1] * (long) Static213.anIntArrayArray106[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static436.anIntArray651[local200 - local549 - 1] * (long) Static213.anIntArrayArray106[1][local549] >> 16);
						}
						Static436.anIntArray651[local200] = local352;
						local182 = this.aClass35_9.method690(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static436.anIntArray651[local200 + local187 - local519 - 1] * (long) Static213.anIntArrayArray106[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static436.anIntArray651[local200 - local549 - 1] * (long) Static213.anIntArrayArray106[1][local549] >> 16);
							}
							Static436.anIntArray651[local200] = local352;
							this.aClass35_9.method690(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass140_1.method3237(0, (float) local182 / 65536.0F);
					local195 = this.aClass140_1.method3237(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static436.anIntArray651[local182] < -32768) {
				Static436.anIntArray651[local182] = -32768;
			}
			if (Static436.anIntArray651[local182] > 32767) {
				Static436.anIntArray651[local182] = 32767;
			}
		}
		return Static436.anIntArray651;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!lh;)V")
	public void method5837(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass35_2 = new Class35();
		this.aClass35_2.method693(arg0);
		this.aClass35_4 = new Class35();
		this.aClass35_4.method693(arg0);
		@Pc(21) int local21 = arg0.method4130();
		if (local21 != 0) {
			arg0.anInt5056--;
			this.aClass35_8 = new Class35();
			this.aClass35_8.method693(arg0);
			this.aClass35_1 = new Class35();
			this.aClass35_1.method693(arg0);
		}
		local21 = arg0.method4130();
		if (local21 != 0) {
			arg0.anInt5056--;
			this.aClass35_7 = new Class35();
			this.aClass35_7.method693(arg0);
			this.aClass35_3 = new Class35();
			this.aClass35_3.method693(arg0);
		}
		local21 = arg0.method4130();
		if (local21 != 0) {
			arg0.anInt5056--;
			this.aClass35_5 = new Class35();
			this.aClass35_5.method693(arg0);
			this.aClass35_6 = new Class35();
			this.aClass35_6.method693(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4096();
			if (local114 == 0) {
				break;
			}
			this.anIntArray650[local109] = local114;
			this.anIntArray655[local109] = arg0.method4131();
			this.anIntArray652[local109] = arg0.method4096();
		}
		this.anInt7525 = arg0.method4096();
		this.anInt7523 = arg0.method4096();
		this.anInt7524 = arg0.method4093();
		this.anInt7522 = arg0.method4093();
		this.aClass140_1 = new Class140();
		this.aClass35_9 = new Class35();
		this.aClass140_1.method3236(arg0, this.aClass35_9);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	private int method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray648[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray649[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
