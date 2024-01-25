import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
	public static int anInt9076;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_95 = new Class230(28, 8);

	@OriginalMember(owner = "client!sq", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray74 = new int[6][];

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_131 = new Class276(92, -2);

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_36 = new Class25(16);

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
	public static int anInt9077 = 0;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	public static int anInt9078 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIBIIIIILclient!wca;III)Z")
	public static boolean method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class350 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg0;
		@Pc(23) int local23 = arg2 - 64;
		Static114.anIntArrayArray22[64][64] = 99;
		@Pc(33) int local33 = arg0 - 64;
		Static187.anIntArrayArray30[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static299.anIntArray374[0] = arg2;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static279.anIntArray360[0] = arg0;
		@Pc(55) int[][] local55 = arg7.anIntArrayArray82;
		while (true) {
			label282: while (true) {
				@Pc(69) int local69;
				@Pc(74) int local74;
				@Pc(86) int local86;
				@Pc(91) int local91;
				@Pc(239) int local239;
				@Pc(281) int local281;
				do {
					do {
						do {
							label259: do {
								if (local47 == local50) {
									Static524.anInt9583 = local7;
									Static364.anInt7216 = local5;
									return false;
								}
								local5 = Static299.anIntArray374[local47];
								local7 = Static279.anIntArray360[local47];
								local69 = local5 - local23;
								local74 = local7 - local33;
								local47 = local47 + 1 & 0xFFF;
								local86 = local5 - arg7.anInt10126;
								local91 = local7 - arg7.anInt10122;
								if (arg3 == -4) {
									if (arg4 == local5 && local7 == arg9) {
										Static524.anInt9583 = local7;
										Static364.anInt7216 = local5;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static2.method179(local7, arg8, arg8, local5, arg10, arg4, arg5, arg9)) {
										Static524.anInt9583 = local7;
										Static364.anInt7216 = local5;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg7.method8221(arg4, arg5, arg8, local5, local7, arg9, arg1, arg10, arg8)) {
										Static524.anInt9583 = local7;
										Static364.anInt7216 = local5;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg7.method8214(arg4, arg10, local7, arg5, arg9, local5, arg1, arg8)) {
										Static364.anInt7216 = local5;
										Static524.anInt9583 = local7;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg7.method8218(arg4, arg8, arg3, arg6, arg9, local5, local7)) {
										Static524.anInt9583 = local7;
										Static364.anInt7216 = local5;
										return true;
									}
								} else if (arg7.method8216(local7, arg8, arg9, arg4, arg6, arg3, local5)) {
									Static364.anInt7216 = local5;
									Static524.anInt9583 = local7;
									return true;
								}
								local239 = Static187.anIntArrayArray30[local69][local74] + 1;
								if (local69 > 0 && Static114.anIntArrayArray22[local69 - 1][local74] == 0 && (local55[local86 - 1][local91] & 0x43A40000) == 0 && (local55[local86 - 1][local91 + arg8 - 1] & 0x4E240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg8 - 1) {
											Static299.anIntArray374[local50] = local5 - 1;
											Static279.anIntArray360[local50] = local7;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray22[local69 - 1][local74] = 2;
											Static187.anIntArrayArray30[local69 - 1][local74] = local239;
											break;
										}
										if ((local55[local86 - 1][local281 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (128 - arg8 > local69 && Static114.anIntArrayArray22[local69 + 1][local74] == 0 && (local55[local86 + arg8][local91] & 0x60E40000) == 0 && (local55[local86 + arg8][arg8 + local91 - 1] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg8 - 1) {
											Static299.anIntArray374[local50] = local5 + 1;
											Static279.anIntArray360[local50] = local7;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray22[local69 + 1][local74] = 8;
											Static187.anIntArrayArray30[local69 + 1][local74] = local239;
											break;
										}
										if ((local55[local86 + arg8][local281 + local91] & 0x78E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local74 > 0 && Static114.anIntArrayArray22[local69][local74 - 1] == 0 && (local55[local86][local91 - 1] & 0x43A40000) == 0 && (local55[local86 + arg8 - 1][local91 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg8 - 1) {
											Static299.anIntArray374[local50] = local5;
											Static279.anIntArray360[local50] = local7 - 1;
											Static114.anIntArrayArray22[local69][local74 - 1] = 1;
											local50 = local50 + 1 & 0xFFF;
											Static187.anIntArrayArray30[local69][local74 - 1] = local239;
											break;
										}
										if ((local55[local86 + local281][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local74 < 128 - arg8 && Static114.anIntArrayArray22[local69][local74 + 1] == 0 && (local55[local86][arg8 + local91] & 0x4E240000) == 0 && (local55[arg8 + local86 - 1][arg8 + local91] & 0x78240000) == 0) {
									local281 = 1;
									while (true) {
										if (arg8 - 1 <= local281) {
											Static299.anIntArray374[local50] = local5;
											Static279.anIntArray360[local50] = local7 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray22[local69][local74 + 1] = 4;
											Static187.anIntArrayArray30[local69][local74 + 1] = local239;
											break;
										}
										if ((local55[local281 + local86][local91 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local69 > 0 && local74 > 0 && Static114.anIntArrayArray22[local69 - 1][local74 - 1] == 0 && (local55[local86 - 1][local91 - 1] & 0x43A40000) == 0) {
									local281 = 1;
									while (true) {
										if (local281 >= arg8) {
											Static299.anIntArray374[local50] = local5 - 1;
											Static279.anIntArray360[local50] = local7 - 1;
											Static114.anIntArrayArray22[local69 - 1][local74 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static187.anIntArrayArray30[local69 - 1][local74 - 1] = local239;
											break;
										}
										if ((local55[local86 - 1][local91 + local281 - 1] & 0x4FA40000) != 0 || (local55[local86 + local281 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (128 - arg8 > local69 && local74 > 0 && Static114.anIntArrayArray22[local69 + 1][local74 - 1] == 0 && (local55[arg8 + local86][local91 - 1] & 0x60E40000) == 0) {
									local281 = 1;
									while (true) {
										if (arg8 <= local281) {
											Static299.anIntArray374[local50] = local5 + 1;
											Static279.anIntArray360[local50] = local7 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static114.anIntArrayArray22[local69 + 1][local74 - 1] = 9;
											Static187.anIntArrayArray30[local69 + 1][local74 - 1] = local239;
											break;
										}
										if ((local55[local86 + arg8][local91 + local281 - 1] & 0x78E40000) != 0 || (local55[local86 + local281][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local281++;
									}
								}
								if (local69 > 0 && 128 - arg8 > local74 && Static114.anIntArrayArray22[local69 - 1][local74 + 1] == 0 && (local55[local86 - 1][arg8 + local91] & 0x4E240000) == 0) {
									for (local281 = 1; local281 < arg8; local281++) {
										if ((local55[local86 - 1][local91 + local281] & 0x4FA40000) != 0 || (local55[local281 + local86 - 1][local91 + arg8] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static299.anIntArray374[local50] = local5 - 1;
									Static279.anIntArray360[local50] = local7 + 1;
									Static114.anIntArrayArray22[local69 - 1][local74 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static187.anIntArrayArray30[local69 - 1][local74 + 1] = local239;
								}
							} while (local69 >= 128 - arg8);
						} while (local74 >= 128 - arg8);
					} while (Static114.anIntArrayArray22[local69 + 1][local74 + 1] != 0);
				} while ((local55[local86 + arg8][local91 + arg8] & 0x78240000) != 0);
				for (local281 = 1; local281 < arg8; local281++) {
					if ((local55[local86 + local281][local91 + arg8] & 0x7E240000) != 0 || (local55[arg8 + local86][local281 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static299.anIntArray374[local50] = local5 + 1;
				Static279.anIntArray360[local50] = local7 + 1;
				Static114.anIntArrayArray22[local69 + 1][local74 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local69 + 1][local74 + 1] = local239;
			}
		}
	}
}
