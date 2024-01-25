import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class127 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "[I")
	private static final int[] anIntArray281 = new int[32768];

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "[I")
	private static final int[] anIntArray277;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!de;")
	private Class54 aClass54_1;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Lclient!de;")
	private Class54 aClass54_2;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!de;")
	private Class54 aClass54_3;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Lclient!tr;")
	private Class232 aClass232_1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!de;")
	private Class54 aClass54_4;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "Lclient!de;")
	private Class54 aClass54_5;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!de;")
	private Class54 aClass54_6;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "Lclient!de;")
	private Class54 aClass54_7;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "Lclient!de;")
	private Class54 aClass54_8;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!de;")
	private Class54 aClass54_9;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
	private final int[] anIntArray278 = new int[5];

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public int anInt3464 = 0;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt3463 = 0;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "[I")
	private final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	public int anInt3462 = 500;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	private int anInt3465 = 100;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "[I")
	private final int[] anIntArray286 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray281[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray277 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray277[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ti;)V")
	public void method2970(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass54_3 = new Class54();
		this.aClass54_3.method1003(arg0);
		this.aClass54_9 = new Class54();
		this.aClass54_9.method1003(arg0);
		@Pc(21) int local21 = arg0.method4548();
		if (local21 != 0) {
			arg0.anInt5695--;
			this.aClass54_5 = new Class54();
			this.aClass54_5.method1003(arg0);
			this.aClass54_1 = new Class54();
			this.aClass54_1.method1003(arg0);
		}
		local21 = arg0.method4548();
		if (local21 != 0) {
			arg0.anInt5695--;
			this.aClass54_7 = new Class54();
			this.aClass54_7.method1003(arg0);
			this.aClass54_4 = new Class54();
			this.aClass54_4.method1003(arg0);
		}
		local21 = arg0.method4548();
		if (local21 != 0) {
			arg0.anInt5695--;
			this.aClass54_8 = new Class54();
			this.aClass54_8.method1003(arg0);
			this.aClass54_6 = new Class54();
			this.aClass54_6.method1003(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4521();
			if (local114 == 0) {
				break;
			}
			this.anIntArray280[local109] = local114;
			this.anIntArray286[local109] = arg0.method4525();
			this.anIntArray278[local109] = arg0.method4521();
		}
		this.anInt3463 = arg0.method4521();
		this.anInt3465 = arg0.method4521();
		this.anInt3462 = arg0.method4498();
		this.anInt3464 = arg0.method4498();
		this.aClass232_1 = new Class232();
		this.aClass54_2 = new Class54();
		this.aClass232_1.method5405(arg0, this.aClass54_2);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
	public int[] method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static459.method1553(Static187.anIntArray279, 0, arg0);
		if (arg1 < 10) {
			return Static187.anIntArray279;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass54_3.method1005();
		this.aClass54_9.method1005();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass54_5 != null) {
			this.aClass54_5.method1005();
			this.aClass54_1.method1005();
			local24 = (int) ((double) (this.aClass54_5.anInt1228 - this.aClass54_5.anInt1227) * 32.768D / local16);
			local26 = (int) ((double) this.aClass54_5.anInt1227 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass54_7 != null) {
			this.aClass54_7.method1005();
			this.aClass54_4.method1005();
			local63 = (int) ((double) (this.aClass54_7.anInt1228 - this.aClass54_7.anInt1227) * 32.768D / local16);
			local65 = (int) ((double) this.aClass54_7.anInt1227 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray280[local102] != 0) {
				Static187.anIntArray287[local102] = 0;
				Static187.anIntArray284[local102] = (int) ((double) this.anIntArray278[local102] * local16);
				Static187.anIntArray282[local102] = (this.anIntArray280[local102] << 14) / 100;
				Static187.anIntArray285[local102] = (int) ((double) (this.aClass54_3.anInt1228 - this.aClass54_3.anInt1227) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray286[local102]) / local16);
				Static187.anIntArray283[local102] = (int) ((double) this.aClass54_3.anInt1227 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass54_3.method1004(arg0);
			local187 = this.aClass54_9.method1004(arg0);
			if (this.aClass54_5 != null) {
				local195 = this.aClass54_5.method1004(arg0);
				local200 = this.aClass54_1.method1004(arg0);
				local182 += this.method2972(local28, local200, this.aClass54_5.anInt1230) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass54_7 != null) {
				local195 = this.aClass54_7.method1004(arg0);
				local200 = this.aClass54_4.method1004(arg0);
				local187 = local187 * ((this.method2972(local67, local200, this.aClass54_7.anInt1230) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray280[local195] != 0) {
					local200 = local176 + Static187.anIntArray284[local195];
					if (local200 < arg0) {
						Static187.anIntArray279[local200] += this.method2972(Static187.anIntArray287[local195], local187 * Static187.anIntArray282[local195] >> 15, this.aClass54_3.anInt1230);
						Static187.anIntArray287[local195] += (local182 * Static187.anIntArray285[local195] >> 16) + Static187.anIntArray283[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass54_8 != null) {
			this.aClass54_8.method1005();
			this.aClass54_6.method1005();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass54_8.method1004(arg0);
				local352 = this.aClass54_6.method1004(arg0);
				if (local339) {
					local187 = this.aClass54_8.anInt1227 + ((this.aClass54_8.anInt1228 - this.aClass54_8.anInt1227) * local347 >> 8);
				} else {
					local187 = this.aClass54_8.anInt1227 + ((this.aClass54_8.anInt1228 - this.aClass54_8.anInt1227) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static187.anIntArray279[local200] = 0;
				}
			}
		}
		if (this.anInt3463 > 0 && this.anInt3465 > 0) {
			local182 = (int) ((double) this.anInt3463 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static187.anIntArray279[local187] += Static187.anIntArray279[local187 - local182] * this.anInt3465 / 100;
			}
		}
		if (this.aClass232_1.anIntArray520[0] > 0 || this.aClass232_1.anIntArray520[1] > 0) {
			this.aClass54_2.method1005();
			local182 = this.aClass54_2.method1004(arg0 + 1);
			local187 = this.aClass232_1.method5403(0, (float) local182 / 65536.0F);
			local195 = this.aClass232_1.method5403(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static187.anIntArray279[local200 + local187] * (long) Static391.anInt7015 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static187.anIntArray279[local200 + local187 - local519 - 1] * (long) Static391.anIntArrayArray52[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static187.anIntArray279[local200 - local549 - 1] * (long) Static391.anIntArrayArray52[1][local549] >> 16);
					}
					Static187.anIntArray279[local200] = local352;
					local182 = this.aClass54_2.method1004(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static187.anIntArray279[local200 + local187] * (long) Static391.anInt7015 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static187.anIntArray279[local200 + local187 - local519 - 1] * (long) Static391.anIntArrayArray52[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static187.anIntArray279[local200 - local549 - 1] * (long) Static391.anIntArrayArray52[1][local549] >> 16);
						}
						Static187.anIntArray279[local200] = local352;
						local182 = this.aClass54_2.method1004(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static187.anIntArray279[local200 + local187 - local519 - 1] * (long) Static391.anIntArrayArray52[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static187.anIntArray279[local200 - local549 - 1] * (long) Static391.anIntArrayArray52[1][local549] >> 16);
							}
							Static187.anIntArray279[local200] = local352;
							this.aClass54_2.method1004(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass232_1.method5403(0, (float) local182 / 65536.0F);
					local195 = this.aClass232_1.method5403(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static187.anIntArray279[local182] < -32768) {
				Static187.anIntArray279[local182] = -32768;
			}
			if (Static187.anIntArray279[local182] > 32767) {
				Static187.anIntArray279[local182] = 32767;
			}
		}
		return Static187.anIntArray279;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)I")
	private int method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray277[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray281[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
