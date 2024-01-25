import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class237 {

	@OriginalMember(owner = "client!ofa", name = "l", descriptor = "[I")
	private static final int[] anIntArray452 = new int[32768];

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "[I")
	private static final int[] anIntArray454;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "Lclient!oea;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "Lclient!po;")
	private Class259 aClass259_1;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "Lclient!oea;")
	private Class235 aClass235_2;

	@OriginalMember(owner = "client!ofa", name = "f", descriptor = "Lclient!oea;")
	private Class235 aClass235_3;

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "Lclient!oea;")
	private Class235 aClass235_4;

	@OriginalMember(owner = "client!ofa", name = "j", descriptor = "Lclient!oea;")
	private Class235 aClass235_5;

	@OriginalMember(owner = "client!ofa", name = "k", descriptor = "Lclient!oea;")
	private Class235 aClass235_6;

	@OriginalMember(owner = "client!ofa", name = "n", descriptor = "Lclient!oea;")
	private Class235 aClass235_7;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "Lclient!oea;")
	private Class235 aClass235_8;

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "Lclient!oea;")
	private Class235 aClass235_9;

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
	private int anInt7477 = 0;

	@OriginalMember(owner = "client!ofa", name = "i", descriptor = "[I")
	private final int[] anIntArray451 = new int[5];

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
	private int anInt7479 = 100;

	@OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
	public int anInt7478 = 500;

	@OriginalMember(owner = "client!ofa", name = "o", descriptor = "[I")
	private final int[] anIntArray453 = new int[5];

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "[I")
	private final int[] anIntArray455 = new int[5];

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
	public int anInt7480 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray452[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray454 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray454[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!rg;)V")
	public void method6452(@OriginalArg(0) Class6_Sub40 arg0) {
		this.aClass235_2 = new Class235();
		this.aClass235_2.method6447(arg0);
		this.aClass235_3 = new Class235();
		this.aClass235_3.method6447(arg0);
		@Pc(21) int local21 = arg0.method8604();
		if (local21 != 0) {
			arg0.anInt10169--;
			this.aClass235_8 = new Class235();
			this.aClass235_8.method6447(arg0);
			this.aClass235_6 = new Class235();
			this.aClass235_6.method6447(arg0);
		}
		local21 = arg0.method8604();
		if (local21 != 0) {
			arg0.anInt10169--;
			this.aClass235_5 = new Class235();
			this.aClass235_5.method6447(arg0);
			this.aClass235_7 = new Class235();
			this.aClass235_7.method6447(arg0);
		}
		local21 = arg0.method8604();
		if (local21 != 0) {
			arg0.anInt10169--;
			this.aClass235_1 = new Class235();
			this.aClass235_1.method6447(arg0);
			this.aClass235_4 = new Class235();
			this.aClass235_4.method6447(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method8587();
			if (local114 == 0) {
				break;
			}
			this.anIntArray451[local109] = local114;
			this.anIntArray455[local109] = arg0.method8600();
			this.anIntArray453[local109] = arg0.method8587();
		}
		this.anInt7477 = arg0.method8587();
		this.anInt7479 = arg0.method8587();
		this.anInt7478 = arg0.method8571();
		this.anInt7480 = arg0.method8571();
		this.aClass259_1 = new Class259();
		this.aClass235_9 = new Class235();
		this.aClass259_1.method6816(arg0, this.aClass235_9);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I")
	public int[] method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static655.method5833(Static401.anIntArray450, 0, arg0);
		if (arg1 < 10) {
			return Static401.anIntArray450;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass235_2.method6450();
		this.aClass235_3.method6450();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass235_8 != null) {
			this.aClass235_8.method6450();
			this.aClass235_6.method6450();
			local24 = (int) ((double) (this.aClass235_8.anInt7469 - this.aClass235_8.anInt7470) * 32.768D / local16);
			local26 = (int) ((double) this.aClass235_8.anInt7470 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass235_5 != null) {
			this.aClass235_5.method6450();
			this.aClass235_7.method6450();
			local63 = (int) ((double) (this.aClass235_5.anInt7469 - this.aClass235_5.anInt7470) * 32.768D / local16);
			local65 = (int) ((double) this.aClass235_5.anInt7470 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray451[local102] != 0) {
				Static401.anIntArray456[local102] = 0;
				Static401.anIntArray459[local102] = (int) ((double) this.anIntArray453[local102] * local16);
				Static401.anIntArray457[local102] = (this.anIntArray451[local102] << 14) / 100;
				Static401.anIntArray458[local102] = (int) ((double) (this.aClass235_2.anInt7469 - this.aClass235_2.anInt7470) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray455[local102]) / local16);
				Static401.anIntArray460[local102] = (int) ((double) this.aClass235_2.anInt7470 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass235_2.method6448(arg0);
			local187 = this.aClass235_3.method6448(arg0);
			if (this.aClass235_8 != null) {
				local195 = this.aClass235_8.method6448(arg0);
				local200 = this.aClass235_6.method6448(arg0);
				local182 += this.method6455(local28, local200, this.aClass235_8.anInt7467) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass235_5 != null) {
				local195 = this.aClass235_5.method6448(arg0);
				local200 = this.aClass235_7.method6448(arg0);
				local187 = local187 * ((this.method6455(local67, local200, this.aClass235_5.anInt7467) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray451[local195] != 0) {
					local200 = local176 + Static401.anIntArray459[local195];
					if (local200 < arg0) {
						Static401.anIntArray450[local200] += this.method6455(Static401.anIntArray456[local195], local187 * Static401.anIntArray457[local195] >> 15, this.aClass235_2.anInt7467);
						Static401.anIntArray456[local195] += (local182 * Static401.anIntArray458[local195] >> 16) + Static401.anIntArray460[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass235_1 != null) {
			this.aClass235_1.method6450();
			this.aClass235_4.method6450();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass235_1.method6448(arg0);
				local352 = this.aClass235_4.method6448(arg0);
				if (local339) {
					local187 = this.aClass235_1.anInt7470 + ((this.aClass235_1.anInt7469 - this.aClass235_1.anInt7470) * local347 >> 8);
				} else {
					local187 = this.aClass235_1.anInt7470 + ((this.aClass235_1.anInt7469 - this.aClass235_1.anInt7470) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static401.anIntArray450[local200] = 0;
				}
			}
		}
		if (this.anInt7477 > 0 && this.anInt7479 > 0) {
			local182 = (int) ((double) this.anInt7477 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static401.anIntArray450[local187] += Static401.anIntArray450[local187 - local182] * this.anInt7479 / 100;
			}
		}
		if (this.aClass259_1.anIntArray485[0] > 0 || this.aClass259_1.anIntArray485[1] > 0) {
			this.aClass235_9.method6450();
			local182 = this.aClass235_9.method6448(arg0 + 1);
			local187 = this.aClass259_1.method6817(0, (float) local182 / 65536.0F);
			local195 = this.aClass259_1.method6817(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static401.anIntArray450[local200 + local187] * (long) Static440.anInt7951 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static401.anIntArray450[local200 + local187 - local519 - 1] * (long) Static440.anIntArrayArray36[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static401.anIntArray450[local200 - local549 - 1] * (long) Static440.anIntArrayArray36[1][local549] >> 16);
					}
					Static401.anIntArray450[local200] = local352;
					local182 = this.aClass235_9.method6448(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static401.anIntArray450[local200 + local187] * (long) Static440.anInt7951 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static401.anIntArray450[local200 + local187 - local519 - 1] * (long) Static440.anIntArrayArray36[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static401.anIntArray450[local200 - local549 - 1] * (long) Static440.anIntArrayArray36[1][local549] >> 16);
						}
						Static401.anIntArray450[local200] = local352;
						local182 = this.aClass235_9.method6448(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static401.anIntArray450[local200 + local187 - local519 - 1] * (long) Static440.anIntArrayArray36[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static401.anIntArray450[local200 - local549 - 1] * (long) Static440.anIntArrayArray36[1][local549] >> 16);
							}
							Static401.anIntArray450[local200] = local352;
							this.aClass235_9.method6448(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass259_1.method6817(0, (float) local182 / 65536.0F);
					local195 = this.aClass259_1.method6817(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static401.anIntArray450[local182] < -32768) {
				Static401.anIntArray450[local182] = -32768;
			}
			if (Static401.anIntArray450[local182] > 32767) {
				Static401.anIntArray450[local182] = 32767;
			}
		}
		return Static401.anIntArray450;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)I")
	private int method6455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray454[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray452[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
