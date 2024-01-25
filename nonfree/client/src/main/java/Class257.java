import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class257 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
	private static final int[] anIntArray542 = new int[32768];

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
	private static final int[] anIntArray547;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "Lclient!ec;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!ec;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Lclient!ec;")
	private Class81 aClass81_3;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!ec;")
	private Class81 aClass81_4;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!ec;")
	private Class81 aClass81_5;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Lclient!ec;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Lclient!op;")
	private Class232 aClass232_1;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Lclient!ec;")
	private Class81 aClass81_7;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!ec;")
	private Class81 aClass81_8;

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Lclient!ec;")
	private Class81 aClass81_9;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private int anInt7712 = 100;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
	private int anInt7711 = 0;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "[I")
	private final int[] anIntArray543 = new int[5];

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	public int anInt7713 = 0;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "[I")
	private final int[] anIntArray546 = new int[5];

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
	private final int[] anIntArray545 = new int[5];

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public int anInt7714 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray542[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray547 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray547[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I")
	private int method6419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray547[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray542[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!daa;)V")
	public void method6420(@OriginalArg(0) Class12_Sub8 arg0) {
		this.aClass81_3 = new Class81();
		this.aClass81_3.method2245(arg0);
		this.aClass81_1 = new Class81();
		this.aClass81_1.method2245(arg0);
		@Pc(21) int local21 = arg0.method5216();
		if (local21 != 0) {
			arg0.anInt6217--;
			this.aClass81_9 = new Class81();
			this.aClass81_9.method2245(arg0);
			this.aClass81_7 = new Class81();
			this.aClass81_7.method2245(arg0);
		}
		local21 = arg0.method5216();
		if (local21 != 0) {
			arg0.anInt6217--;
			this.aClass81_8 = new Class81();
			this.aClass81_8.method2245(arg0);
			this.aClass81_5 = new Class81();
			this.aClass81_5.method2245(arg0);
		}
		local21 = arg0.method5216();
		if (local21 != 0) {
			arg0.anInt6217--;
			this.aClass81_4 = new Class81();
			this.aClass81_4.method2245(arg0);
			this.aClass81_2 = new Class81();
			this.aClass81_2.method2245(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5218();
			if (local114 == 0) {
				break;
			}
			this.anIntArray543[local109] = local114;
			this.anIntArray545[local109] = arg0.method5203();
			this.anIntArray546[local109] = arg0.method5218();
		}
		this.anInt7711 = arg0.method5218();
		this.anInt7712 = arg0.method5218();
		this.anInt7714 = arg0.method5199();
		this.anInt7713 = arg0.method5199();
		this.aClass232_1 = new Class232();
		this.aClass81_6 = new Class81();
		this.aClass232_1.method5606(arg0, this.aClass81_6);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)[I")
	public int[] method6422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static554.method3499(Static411.anIntArray544, 0, arg0);
		if (arg1 < 10) {
			return Static411.anIntArray544;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass81_3.method2246();
		this.aClass81_1.method2246();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass81_9 != null) {
			this.aClass81_9.method2246();
			this.aClass81_7.method2246();
			local24 = (int) ((double) (this.aClass81_9.anInt2485 - this.aClass81_9.anInt2484) * 32.768D / local16);
			local26 = (int) ((double) this.aClass81_9.anInt2484 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass81_8 != null) {
			this.aClass81_8.method2246();
			this.aClass81_5.method2246();
			local63 = (int) ((double) (this.aClass81_8.anInt2485 - this.aClass81_8.anInt2484) * 32.768D / local16);
			local65 = (int) ((double) this.aClass81_8.anInt2484 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray543[local102] != 0) {
				Static411.anIntArray551[local102] = 0;
				Static411.anIntArray552[local102] = (int) ((double) this.anIntArray546[local102] * local16);
				Static411.anIntArray548[local102] = (this.anIntArray543[local102] << 14) / 100;
				Static411.anIntArray550[local102] = (int) ((double) (this.aClass81_3.anInt2485 - this.aClass81_3.anInt2484) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray545[local102]) / local16);
				Static411.anIntArray549[local102] = (int) ((double) this.aClass81_3.anInt2484 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass81_3.method2244(arg0);
			local187 = this.aClass81_1.method2244(arg0);
			if (this.aClass81_9 != null) {
				local195 = this.aClass81_9.method2244(arg0);
				local200 = this.aClass81_7.method2244(arg0);
				local182 += this.method6419(local28, local200, this.aClass81_9.anInt2486) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass81_8 != null) {
				local195 = this.aClass81_8.method2244(arg0);
				local200 = this.aClass81_5.method2244(arg0);
				local187 = local187 * ((this.method6419(local67, local200, this.aClass81_8.anInt2486) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray543[local195] != 0) {
					local200 = local176 + Static411.anIntArray552[local195];
					if (local200 < arg0) {
						Static411.anIntArray544[local200] += this.method6419(Static411.anIntArray551[local195], local187 * Static411.anIntArray548[local195] >> 15, this.aClass81_3.anInt2486);
						Static411.anIntArray551[local195] += (local182 * Static411.anIntArray550[local195] >> 16) + Static411.anIntArray549[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass81_4 != null) {
			this.aClass81_4.method2246();
			this.aClass81_2.method2246();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass81_4.method2244(arg0);
				local352 = this.aClass81_2.method2244(arg0);
				if (local339) {
					local187 = this.aClass81_4.anInt2484 + ((this.aClass81_4.anInt2485 - this.aClass81_4.anInt2484) * local347 >> 8);
				} else {
					local187 = this.aClass81_4.anInt2484 + ((this.aClass81_4.anInt2485 - this.aClass81_4.anInt2484) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static411.anIntArray544[local200] = 0;
				}
			}
		}
		if (this.anInt7711 > 0 && this.anInt7712 > 0) {
			local182 = (int) ((double) this.anInt7711 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static411.anIntArray544[local187] += Static411.anIntArray544[local187 - local182] * this.anInt7712 / 100;
			}
		}
		if (this.aClass232_1.anIntArray463[0] > 0 || this.aClass232_1.anIntArray463[1] > 0) {
			this.aClass81_6.method2246();
			local182 = this.aClass81_6.method2244(arg0 + 1);
			local187 = this.aClass232_1.method5607(0, (float) local182 / 65536.0F);
			local195 = this.aClass232_1.method5607(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static411.anIntArray544[local200 + local187] * (long) Static359.anInt6707 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static411.anIntArray544[local200 + local187 - local519 - 1] * (long) Static359.anIntArrayArray60[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static411.anIntArray544[local200 - local549 - 1] * (long) Static359.anIntArrayArray60[1][local549] >> 16);
					}
					Static411.anIntArray544[local200] = local352;
					local182 = this.aClass81_6.method2244(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static411.anIntArray544[local200 + local187] * (long) Static359.anInt6707 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static411.anIntArray544[local200 + local187 - local519 - 1] * (long) Static359.anIntArrayArray60[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static411.anIntArray544[local200 - local549 - 1] * (long) Static359.anIntArrayArray60[1][local549] >> 16);
						}
						Static411.anIntArray544[local200] = local352;
						local182 = this.aClass81_6.method2244(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static411.anIntArray544[local200 + local187 - local519 - 1] * (long) Static359.anIntArrayArray60[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static411.anIntArray544[local200 - local549 - 1] * (long) Static359.anIntArrayArray60[1][local549] >> 16);
							}
							Static411.anIntArray544[local200] = local352;
							this.aClass81_6.method2244(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass232_1.method5607(0, (float) local182 / 65536.0F);
					local195 = this.aClass232_1.method5607(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static411.anIntArray544[local182] < -32768) {
				Static411.anIntArray544[local182] = -32768;
			}
			if (Static411.anIntArray544[local182] > 32767) {
				Static411.anIntArray544[local182] = 32767;
			}
		}
		return Static411.anIntArray544;
	}
}
