import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class296 {

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "[I")
	private static final int[] anIntArray585 = new int[32768];

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
	private static final int[] anIntArray588;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!gf;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!gf;")
	private Class108 aClass108_2;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "Lclient!gf;")
	private Class108 aClass108_3;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "Lclient!gf;")
	private Class108 aClass108_4;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "Lclient!gf;")
	private Class108 aClass108_5;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "Lclient!um;")
	private Class337 aClass337_1;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "Lclient!gf;")
	private Class108 aClass108_6;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "Lclient!gf;")
	private Class108 aClass108_7;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "Lclient!gf;")
	private Class108 aClass108_8;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Lclient!gf;")
	private Class108 aClass108_9;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[I")
	private final int[] anIntArray584 = new int[5];

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
	public int anInt8001 = 500;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
	private int anInt8002 = 100;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "[I")
	private final int[] anIntArray586 = new int[5];

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
	public int anInt8003 = 0;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "[I")
	private final int[] anIntArray587 = new int[5];

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	private int anInt8004 = 0;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray585[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray588 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray588[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I")
	private int method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray588[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray585[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!ji;)V")
	public void method6511(@OriginalArg(0) Class6_Sub21 arg0) {
		this.aClass108_9 = new Class108();
		this.aClass108_9.method2943(arg0);
		this.aClass108_5 = new Class108();
		this.aClass108_5.method2943(arg0);
		@Pc(21) int local21 = arg0.method6069();
		if (local21 != 0) {
			arg0.anInt7338--;
			this.aClass108_8 = new Class108();
			this.aClass108_8.method2943(arg0);
			this.aClass108_2 = new Class108();
			this.aClass108_2.method2943(arg0);
		}
		local21 = arg0.method6069();
		if (local21 != 0) {
			arg0.anInt7338--;
			this.aClass108_4 = new Class108();
			this.aClass108_4.method2943(arg0);
			this.aClass108_7 = new Class108();
			this.aClass108_7.method2943(arg0);
		}
		local21 = arg0.method6069();
		if (local21 != 0) {
			arg0.anInt7338--;
			this.aClass108_1 = new Class108();
			this.aClass108_1.method2943(arg0);
			this.aClass108_3 = new Class108();
			this.aClass108_3.method2943(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method6005();
			if (local114 == 0) {
				break;
			}
			this.anIntArray586[local109] = local114;
			this.anIntArray587[local109] = arg0.method6057();
			this.anIntArray584[local109] = arg0.method6005();
		}
		this.anInt8004 = arg0.method6005();
		this.anInt8002 = arg0.method6005();
		this.anInt8001 = arg0.method6003();
		this.anInt8003 = arg0.method6003();
		this.aClass337_1 = new Class337();
		this.aClass108_6 = new Class108();
		this.aClass337_1.method7330(arg0, this.aClass108_6);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
	public int[] method6513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static601.method2936(Static465.anIntArray583, 0, arg0);
		if (arg1 < 10) {
			return Static465.anIntArray583;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass108_9.method2941();
		this.aClass108_5.method2941();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass108_8 != null) {
			this.aClass108_8.method2941();
			this.aClass108_2.method2941();
			local24 = (int) ((double) (this.aClass108_8.anInt3347 - this.aClass108_8.anInt3346) * 32.768D / local16);
			local26 = (int) ((double) this.aClass108_8.anInt3346 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass108_4 != null) {
			this.aClass108_4.method2941();
			this.aClass108_7.method2941();
			local63 = (int) ((double) (this.aClass108_4.anInt3347 - this.aClass108_4.anInt3346) * 32.768D / local16);
			local65 = (int) ((double) this.aClass108_4.anInt3346 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray586[local102] != 0) {
				Static465.anIntArray593[local102] = 0;
				Static465.anIntArray592[local102] = (int) ((double) this.anIntArray584[local102] * local16);
				Static465.anIntArray591[local102] = (this.anIntArray586[local102] << 14) / 100;
				Static465.anIntArray589[local102] = (int) ((double) (this.aClass108_9.anInt3347 - this.aClass108_9.anInt3346) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray587[local102]) / local16);
				Static465.anIntArray590[local102] = (int) ((double) this.aClass108_9.anInt3346 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass108_9.method2940(arg0);
			local187 = this.aClass108_5.method2940(arg0);
			if (this.aClass108_8 != null) {
				local195 = this.aClass108_8.method2940(arg0);
				local200 = this.aClass108_2.method2940(arg0);
				local182 += this.method6510(local28, local200, this.aClass108_8.anInt3345) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass108_4 != null) {
				local195 = this.aClass108_4.method2940(arg0);
				local200 = this.aClass108_7.method2940(arg0);
				local187 = local187 * ((this.method6510(local67, local200, this.aClass108_4.anInt3345) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray586[local195] != 0) {
					local200 = local176 + Static465.anIntArray592[local195];
					if (local200 < arg0) {
						Static465.anIntArray583[local200] += this.method6510(Static465.anIntArray593[local195], local187 * Static465.anIntArray591[local195] >> 15, this.aClass108_9.anInt3345);
						Static465.anIntArray593[local195] += (local182 * Static465.anIntArray589[local195] >> 16) + Static465.anIntArray590[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass108_1 != null) {
			this.aClass108_1.method2941();
			this.aClass108_3.method2941();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass108_1.method2940(arg0);
				local352 = this.aClass108_3.method2940(arg0);
				if (local339) {
					local187 = this.aClass108_1.anInt3346 + ((this.aClass108_1.anInt3347 - this.aClass108_1.anInt3346) * local347 >> 8);
				} else {
					local187 = this.aClass108_1.anInt3346 + ((this.aClass108_1.anInt3347 - this.aClass108_1.anInt3346) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static465.anIntArray583[local200] = 0;
				}
			}
		}
		if (this.anInt8004 > 0 && this.anInt8002 > 0) {
			local182 = (int) ((double) this.anInt8004 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static465.anIntArray583[local187] += Static465.anIntArray583[local187 - local182] * this.anInt8002 / 100;
			}
		}
		if (this.aClass337_1.anIntArray690[0] > 0 || this.aClass337_1.anIntArray690[1] > 0) {
			this.aClass108_6.method2941();
			local182 = this.aClass108_6.method2940(arg0 + 1);
			local187 = this.aClass337_1.method7331(0, (float) local182 / 65536.0F);
			local195 = this.aClass337_1.method7331(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static465.anIntArray583[local200 + local187] * (long) Static539.anInt8928 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static465.anIntArray583[local200 + local187 - local519 - 1] * (long) Static539.anIntArrayArray84[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static465.anIntArray583[local200 - local549 - 1] * (long) Static539.anIntArrayArray84[1][local549] >> 16);
					}
					Static465.anIntArray583[local200] = local352;
					local182 = this.aClass108_6.method2940(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static465.anIntArray583[local200 + local187] * (long) Static539.anInt8928 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static465.anIntArray583[local200 + local187 - local519 - 1] * (long) Static539.anIntArrayArray84[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static465.anIntArray583[local200 - local549 - 1] * (long) Static539.anIntArrayArray84[1][local549] >> 16);
						}
						Static465.anIntArray583[local200] = local352;
						local182 = this.aClass108_6.method2940(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static465.anIntArray583[local200 + local187 - local519 - 1] * (long) Static539.anIntArrayArray84[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static465.anIntArray583[local200 - local549 - 1] * (long) Static539.anIntArrayArray84[1][local549] >> 16);
							}
							Static465.anIntArray583[local200] = local352;
							this.aClass108_6.method2940(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass337_1.method7331(0, (float) local182 / 65536.0F);
					local195 = this.aClass337_1.method7331(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static465.anIntArray583[local182] < -32768) {
				Static465.anIntArray583[local182] = -32768;
			}
			if (Static465.anIntArray583[local182] > 32767) {
				Static465.anIntArray583[local182] = 32767;
			}
		}
		return Static465.anIntArray583;
	}
}
