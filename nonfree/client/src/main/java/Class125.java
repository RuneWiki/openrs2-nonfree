import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class125 {

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "[I")
	private static final int[] anIntArray337 = new int[32768];

	@OriginalMember(owner = "client!gs", name = "q", descriptor = "[I")
	private static final int[] anIntArray338;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!tu;")
	private Class311 aClass311_1;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!tu;")
	private Class311 aClass311_2;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Lclient!tu;")
	private Class311 aClass311_3;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!tu;")
	private Class311 aClass311_4;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "Lclient!tu;")
	private Class311 aClass311_5;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!tu;")
	private Class311 aClass311_6;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Lclient!tu;")
	private Class311 aClass311_7;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!tu;")
	private Class311 aClass311_8;

	@OriginalMember(owner = "client!gs", name = "r", descriptor = "Lclient!dq;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Lclient!tu;")
	private Class311 aClass311_9;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	private int anInt3080 = 100;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "[I")
	private final int[] anIntArray334 = new int[5];

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
	public int anInt3082 = 0;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	private int anInt3081 = 0;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public int anInt3083 = 500;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "[I")
	private final int[] anIntArray336 = new int[5];

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "[I")
	private final int[] anIntArray342 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray337[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray338 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray338[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)I")
	private int method2647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray338[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray337[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	public int[] method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static585.method3079(Static170.anIntArray335, 0, arg0);
		if (arg1 < 10) {
			return Static170.anIntArray335;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass311_9.method6888();
		this.aClass311_1.method6888();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass311_6 != null) {
			this.aClass311_6.method6888();
			this.aClass311_2.method6888();
			local24 = (int) ((double) (this.aClass311_6.anInt8305 - this.aClass311_6.anInt8306) * 32.768D / local16);
			local26 = (int) ((double) this.aClass311_6.anInt8306 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass311_8 != null) {
			this.aClass311_8.method6888();
			this.aClass311_7.method6888();
			local63 = (int) ((double) (this.aClass311_8.anInt8305 - this.aClass311_8.anInt8306) * 32.768D / local16);
			local65 = (int) ((double) this.aClass311_8.anInt8306 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray336[local102] != 0) {
				Static170.anIntArray340[local102] = 0;
				Static170.anIntArray344[local102] = (int) ((double) this.anIntArray342[local102] * local16);
				Static170.anIntArray341[local102] = (this.anIntArray336[local102] << 14) / 100;
				Static170.anIntArray339[local102] = (int) ((double) (this.aClass311_9.anInt8305 - this.aClass311_9.anInt8306) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray334[local102]) / local16);
				Static170.anIntArray343[local102] = (int) ((double) this.aClass311_9.anInt8306 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass311_9.method6889(arg0);
			local187 = this.aClass311_1.method6889(arg0);
			if (this.aClass311_6 != null) {
				local195 = this.aClass311_6.method6889(arg0);
				local200 = this.aClass311_2.method6889(arg0);
				local182 += this.method2647(local28, local200, this.aClass311_6.anInt8304) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass311_8 != null) {
				local195 = this.aClass311_8.method6889(arg0);
				local200 = this.aClass311_7.method6889(arg0);
				local187 = local187 * ((this.method2647(local67, local200, this.aClass311_8.anInt8304) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray336[local195] != 0) {
					local200 = local176 + Static170.anIntArray344[local195];
					if (local200 < arg0) {
						Static170.anIntArray335[local200] += this.method2647(Static170.anIntArray340[local195], local187 * Static170.anIntArray341[local195] >> 15, this.aClass311_9.anInt8304);
						Static170.anIntArray340[local195] += (local182 * Static170.anIntArray339[local195] >> 16) + Static170.anIntArray343[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass311_5 != null) {
			this.aClass311_5.method6888();
			this.aClass311_3.method6888();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass311_5.method6889(arg0);
				local352 = this.aClass311_3.method6889(arg0);
				if (local339) {
					local187 = this.aClass311_5.anInt8306 + ((this.aClass311_5.anInt8305 - this.aClass311_5.anInt8306) * local347 >> 8);
				} else {
					local187 = this.aClass311_5.anInt8306 + ((this.aClass311_5.anInt8305 - this.aClass311_5.anInt8306) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static170.anIntArray335[local200] = 0;
				}
			}
		}
		if (this.anInt3081 > 0 && this.anInt3080 > 0) {
			local182 = (int) ((double) this.anInt3081 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static170.anIntArray335[local187] += Static170.anIntArray335[local187 - local182] * this.anInt3080 / 100;
			}
		}
		if (this.aClass72_1.anIntArray179[0] > 0 || this.aClass72_1.anIntArray179[1] > 0) {
			this.aClass311_4.method6888();
			local182 = this.aClass311_4.method6889(arg0 + 1);
			local187 = this.aClass72_1.method1478(0, (float) local182 / 65536.0F);
			local195 = this.aClass72_1.method1478(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static170.anIntArray335[local200 + local187] * (long) Static94.anInt1572 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static170.anIntArray335[local200 + local187 - local519 - 1] * (long) Static94.anIntArrayArray27[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static170.anIntArray335[local200 - local549 - 1] * (long) Static94.anIntArrayArray27[1][local549] >> 16);
					}
					Static170.anIntArray335[local200] = local352;
					local182 = this.aClass311_4.method6889(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static170.anIntArray335[local200 + local187] * (long) Static94.anInt1572 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static170.anIntArray335[local200 + local187 - local519 - 1] * (long) Static94.anIntArrayArray27[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static170.anIntArray335[local200 - local549 - 1] * (long) Static94.anIntArrayArray27[1][local549] >> 16);
						}
						Static170.anIntArray335[local200] = local352;
						local182 = this.aClass311_4.method6889(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static170.anIntArray335[local200 + local187 - local519 - 1] * (long) Static94.anIntArrayArray27[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static170.anIntArray335[local200 - local549 - 1] * (long) Static94.anIntArrayArray27[1][local549] >> 16);
							}
							Static170.anIntArray335[local200] = local352;
							this.aClass311_4.method6889(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass72_1.method1478(0, (float) local182 / 65536.0F);
					local195 = this.aClass72_1.method1478(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static170.anIntArray335[local182] < -32768) {
				Static170.anIntArray335[local182] = -32768;
			}
			if (Static170.anIntArray335[local182] > 32767) {
				Static170.anIntArray335[local182] = 32767;
			}
		}
		return Static170.anIntArray335;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!dga;)V")
	public void method2649(@OriginalArg(0) Class6_Sub14 arg0) {
		this.aClass311_9 = new Class311();
		this.aClass311_9.method6887(arg0);
		this.aClass311_1 = new Class311();
		this.aClass311_1.method6887(arg0);
		@Pc(21) int local21 = arg0.method6041();
		if (local21 != 0) {
			arg0.anInt7244--;
			this.aClass311_6 = new Class311();
			this.aClass311_6.method6887(arg0);
			this.aClass311_2 = new Class311();
			this.aClass311_2.method6887(arg0);
		}
		local21 = arg0.method6041();
		if (local21 != 0) {
			arg0.anInt7244--;
			this.aClass311_8 = new Class311();
			this.aClass311_8.method6887(arg0);
			this.aClass311_7 = new Class311();
			this.aClass311_7.method6887(arg0);
		}
		local21 = arg0.method6041();
		if (local21 != 0) {
			arg0.anInt7244--;
			this.aClass311_5 = new Class311();
			this.aClass311_5.method6887(arg0);
			this.aClass311_3 = new Class311();
			this.aClass311_3.method6887(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5998();
			if (local114 == 0) {
				break;
			}
			this.anIntArray336[local109] = local114;
			this.anIntArray334[local109] = arg0.method6015();
			this.anIntArray342[local109] = arg0.method5998();
		}
		this.anInt3081 = arg0.method5998();
		this.anInt3080 = arg0.method5998();
		this.anInt3083 = arg0.method6006();
		this.anInt3082 = arg0.method6006();
		this.aClass72_1 = new Class72();
		this.aClass311_4 = new Class311();
		this.aClass72_1.method1481(arg0, this.aClass311_4);
	}
}
