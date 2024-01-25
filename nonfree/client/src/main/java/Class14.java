import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class14 {

	@OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
	private static final int[] anIntArray88 = new int[32768];

	@OriginalMember(owner = "client!al", name = "p", descriptor = "[I")
	private static final int[] anIntArray90;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!bc;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!fd;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!fd;")
	private Class102 aClass102_2;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!fd;")
	private Class102 aClass102_3;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!fd;")
	private Class102 aClass102_4;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!fd;")
	private Class102 aClass102_5;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Lclient!fd;")
	private Class102 aClass102_6;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!fd;")
	private Class102 aClass102_7;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!fd;")
	private Class102 aClass102_8;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Lclient!fd;")
	private Class102 aClass102_9;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	private int anInt264 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public int anInt263 = 500;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
	private final int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	private int anInt266 = 100;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "[I")
	private final int[] anIntArray92 = new int[5];

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
	private final int[] anIntArray91 = new int[5];

	@OriginalMember(owner = "client!al", name = "i", descriptor = "I")
	public int anInt265 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray88[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray90 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray90[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	private int method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray90[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray88[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!eh;)V")
	public void method300(@OriginalArg(0) Class4_Sub9 arg0) {
		this.aClass102_5 = new Class102();
		this.aClass102_5.method2825(arg0);
		this.aClass102_1 = new Class102();
		this.aClass102_1.method2825(arg0);
		@Pc(21) int local21 = arg0.method6015();
		if (local21 != 0) {
			arg0.anInt7219--;
			this.aClass102_8 = new Class102();
			this.aClass102_8.method2825(arg0);
			this.aClass102_7 = new Class102();
			this.aClass102_7.method2825(arg0);
		}
		local21 = arg0.method6015();
		if (local21 != 0) {
			arg0.anInt7219--;
			this.aClass102_4 = new Class102();
			this.aClass102_4.method2825(arg0);
			this.aClass102_6 = new Class102();
			this.aClass102_6.method2825(arg0);
		}
		local21 = arg0.method6015();
		if (local21 != 0) {
			arg0.anInt7219--;
			this.aClass102_3 = new Class102();
			this.aClass102_3.method2825(arg0);
			this.aClass102_9 = new Class102();
			this.aClass102_9.method2825(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5978();
			if (local114 == 0) {
				break;
			}
			this.anIntArray92[local109] = local114;
			this.anIntArray91[local109] = arg0.method6007();
			this.anIntArray89[local109] = arg0.method5978();
		}
		this.anInt264 = arg0.method5978();
		this.anInt266 = arg0.method5978();
		this.anInt263 = arg0.method5982();
		this.anInt265 = arg0.method5982();
		this.aClass24_1 = new Class24();
		this.aClass102_2 = new Class102();
		this.aClass24_1.method535(arg0, this.aClass102_2);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[I")
	public int[] method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static602.method1583(Static14.anIntArray93, 0, arg0);
		if (arg1 < 10) {
			return Static14.anIntArray93;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass102_5.method2826();
		this.aClass102_1.method2826();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass102_8 != null) {
			this.aClass102_8.method2826();
			this.aClass102_7.method2826();
			local24 = (int) ((double) (this.aClass102_8.anInt3124 - this.aClass102_8.anInt3125) * 32.768D / local16);
			local26 = (int) ((double) this.aClass102_8.anInt3125 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass102_4 != null) {
			this.aClass102_4.method2826();
			this.aClass102_6.method2826();
			local63 = (int) ((double) (this.aClass102_4.anInt3124 - this.aClass102_4.anInt3125) * 32.768D / local16);
			local65 = (int) ((double) this.aClass102_4.anInt3125 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray92[local102] != 0) {
				Static14.anIntArray98[local102] = 0;
				Static14.anIntArray95[local102] = (int) ((double) this.anIntArray89[local102] * local16);
				Static14.anIntArray96[local102] = (this.anIntArray92[local102] << 14) / 100;
				Static14.anIntArray94[local102] = (int) ((double) (this.aClass102_5.anInt3124 - this.aClass102_5.anInt3125) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray91[local102]) / local16);
				Static14.anIntArray97[local102] = (int) ((double) this.aClass102_5.anInt3125 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass102_5.method2828(arg0);
			local187 = this.aClass102_1.method2828(arg0);
			if (this.aClass102_8 != null) {
				local195 = this.aClass102_8.method2828(arg0);
				local200 = this.aClass102_7.method2828(arg0);
				local182 += this.method299(local28, local200, this.aClass102_8.anInt3127) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass102_4 != null) {
				local195 = this.aClass102_4.method2828(arg0);
				local200 = this.aClass102_6.method2828(arg0);
				local187 = local187 * ((this.method299(local67, local200, this.aClass102_4.anInt3127) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray92[local195] != 0) {
					local200 = local176 + Static14.anIntArray95[local195];
					if (local200 < arg0) {
						Static14.anIntArray93[local200] += this.method299(Static14.anIntArray98[local195], local187 * Static14.anIntArray96[local195] >> 15, this.aClass102_5.anInt3127);
						Static14.anIntArray98[local195] += (local182 * Static14.anIntArray94[local195] >> 16) + Static14.anIntArray97[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass102_3 != null) {
			this.aClass102_3.method2826();
			this.aClass102_9.method2826();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass102_3.method2828(arg0);
				local352 = this.aClass102_9.method2828(arg0);
				if (local339) {
					local187 = this.aClass102_3.anInt3125 + ((this.aClass102_3.anInt3124 - this.aClass102_3.anInt3125) * local347 >> 8);
				} else {
					local187 = this.aClass102_3.anInt3125 + ((this.aClass102_3.anInt3124 - this.aClass102_3.anInt3125) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static14.anIntArray93[local200] = 0;
				}
			}
		}
		if (this.anInt264 > 0 && this.anInt266 > 0) {
			local182 = (int) ((double) this.anInt264 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static14.anIntArray93[local187] += Static14.anIntArray93[local187 - local182] * this.anInt266 / 100;
			}
		}
		if (this.aClass24_1.anIntArray111[0] > 0 || this.aClass24_1.anIntArray111[1] > 0) {
			this.aClass102_2.method2826();
			local182 = this.aClass102_2.method2828(arg0 + 1);
			local187 = this.aClass24_1.method534(0, (float) local182 / 65536.0F);
			local195 = this.aClass24_1.method534(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static14.anIntArray93[local200 + local187] * (long) Static30.anInt567 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static14.anIntArray93[local200 + local187 - local519 - 1] * (long) Static30.anIntArrayArray18[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static14.anIntArray93[local200 - local549 - 1] * (long) Static30.anIntArrayArray18[1][local549] >> 16);
					}
					Static14.anIntArray93[local200] = local352;
					local182 = this.aClass102_2.method2828(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static14.anIntArray93[local200 + local187] * (long) Static30.anInt567 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static14.anIntArray93[local200 + local187 - local519 - 1] * (long) Static30.anIntArrayArray18[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static14.anIntArray93[local200 - local549 - 1] * (long) Static30.anIntArrayArray18[1][local549] >> 16);
						}
						Static14.anIntArray93[local200] = local352;
						local182 = this.aClass102_2.method2828(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static14.anIntArray93[local200 + local187 - local519 - 1] * (long) Static30.anIntArrayArray18[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static14.anIntArray93[local200 - local549 - 1] * (long) Static30.anIntArrayArray18[1][local549] >> 16);
							}
							Static14.anIntArray93[local200] = local352;
							this.aClass102_2.method2828(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass24_1.method534(0, (float) local182 / 65536.0F);
					local195 = this.aClass24_1.method534(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static14.anIntArray93[local182] < -32768) {
				Static14.anIntArray93[local182] = -32768;
			}
			if (Static14.anIntArray93[local182] > 32767) {
				Static14.anIntArray93[local182] = 32767;
			}
		}
		return Static14.anIntArray93;
	}
}
