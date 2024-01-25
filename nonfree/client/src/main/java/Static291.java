import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
	public static int anInt5333;

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "Lclient!di;")
	public static final Class74 aClass74_1 = Static496.method7219();

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIIILclient!iaa;I)Z")
	public static boolean method4404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class138 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg2 - 64;
		Static318.anIntArrayArray48[64][64] = 99;
		@Pc(28) int local28 = arg7 - 64;
		Static567.anIntArrayArray82[64][64] = 0;
		@Pc(36) byte local36 = 0;
		@Pc(38) int local38 = 0;
		Static191.anIntArray315[0] = arg2;
		@Pc(50) int local50 = local36 + 1;
		Static313.anIntArray436[0] = arg7;
		@Pc(55) int[][] local55 = arg9.anIntArrayArray35;
		while (true) {
			label282: while (true) {
				@Pc(74) int local74;
				@Pc(69) int local69;
				@Pc(85) int local85;
				@Pc(91) int local91;
				@Pc(245) int local245;
				@Pc(285) int local285;
				do {
					do {
						do {
							label259: do {
								if (local50 == local38) {
									Static447.anInt7902 = local7;
									Static410.anInt7383 = local9;
									return false;
								}
								local7 = Static191.anIntArray315[local38];
								local9 = Static313.anIntArray436[local38];
								local69 = local9 - local28;
								local74 = local7 - local18;
								local38 = local38 + 1 & 0xFFF;
								local85 = local7 - arg9.anInt4008;
								local91 = local9 - arg9.anInt3999;
								if (arg1 == -4) {
									if (arg0 == local7 && arg8 == local9) {
										Static447.anInt7902 = local7;
										Static410.anInt7383 = local9;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static114.method1796(arg10, arg4, arg8, arg6, arg6, local7, arg0, local9)) {
										Static447.anInt7902 = local7;
										Static410.anInt7383 = local9;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg9.method3442(local7, arg10, arg0, arg6, local9, arg4, arg6, arg5, arg8)) {
										Static447.anInt7902 = local7;
										Static410.anInt7383 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg9.method3440(arg4, local9, arg10, arg5, arg8, local7, arg0, arg6)) {
										Static410.anInt7383 = local9;
										Static447.anInt7902 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg9.method3444(arg3, arg1, local9, local7, arg8, arg6, arg0)) {
										Static447.anInt7902 = local7;
										Static410.anInt7383 = local9;
										return true;
									}
								} else if (arg9.method3454(arg0, arg1, local9, arg6, arg8, local7, arg3)) {
									Static447.anInt7902 = local7;
									Static410.anInt7383 = local9;
									return true;
								}
								local245 = Static567.anIntArrayArray82[local74][local69] + 1;
								if (local74 > 0 && Static318.anIntArrayArray48[local74 - 1][local69] == 0 && (local55[local85 - 1][local91] & 0x43A40000) == 0 && (local55[local85 - 1][local91 + arg6 - 1] & 0x4E240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg6 - 1) {
											Static191.anIntArray315[local50] = local7 - 1;
											Static313.anIntArray436[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static318.anIntArrayArray48[local74 - 1][local69] = 2;
											Static567.anIntArrayArray82[local74 - 1][local69] = local245;
											break;
										}
										if ((local55[local85 - 1][local285 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg6 > local74 && Static318.anIntArrayArray48[local74 + 1][local69] == 0 && (local55[local85 + arg6][local91] & 0x60E40000) == 0 && (local55[local85 + arg6][local91 + arg6 - 1] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg6 - 1) {
											Static191.anIntArray315[local50] = local7 + 1;
											Static313.anIntArray436[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static318.anIntArrayArray48[local74 + 1][local69] = 8;
											Static567.anIntArrayArray82[local74 + 1][local69] = local245;
											break;
										}
										if ((local55[arg6 + local85][local91 + local285] & 0x78E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local69 > 0 && Static318.anIntArrayArray48[local74][local69 - 1] == 0 && (local55[local85][local91 - 1] & 0x43A40000) == 0 && (local55[arg6 + local85 - 1][local91 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg6 - 1 <= local285) {
											Static191.anIntArray315[local50] = local7;
											Static313.anIntArray436[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static318.anIntArrayArray48[local74][local69 - 1] = 1;
											Static567.anIntArrayArray82[local74][local69 - 1] = local245;
											break;
										}
										if ((local55[local285 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg6 > local69 && Static318.anIntArrayArray48[local74][local69 + 1] == 0 && (local55[local85][arg6 + local91] & 0x4E240000) == 0 && (local55[local85 + arg6 - 1][local91 + arg6] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg6 - 1) {
											Static191.anIntArray315[local50] = local7;
											Static313.anIntArray436[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static318.anIntArrayArray48[local74][local69 + 1] = 4;
											Static567.anIntArrayArray82[local74][local69 + 1] = local245;
											break;
										}
										if ((local55[local285 + local85][local91 + arg6] & 0x7E240000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 > 0 && local69 > 0 && Static318.anIntArrayArray48[local74 - 1][local69 - 1] == 0 && (local55[local85 - 1][local91 - 1] & 0x43A40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg6 <= local285) {
											Static191.anIntArray315[local50] = local7 - 1;
											Static313.anIntArray436[local50] = local9 - 1;
											Static318.anIntArrayArray48[local74 - 1][local69 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static567.anIntArrayArray82[local74 - 1][local69 - 1] = local245;
											break;
										}
										if ((local55[local85 - 1][local91 + local285 - 1] & 0x4FA40000) != 0 || (local55[local285 + local85 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 < 128 - arg6 && local69 > 0 && Static318.anIntArrayArray48[local74 + 1][local69 - 1] == 0 && (local55[arg6 + local85][local91 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg6 <= local285) {
											Static191.anIntArray315[local50] = local7 + 1;
											Static313.anIntArray436[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static318.anIntArrayArray48[local74 + 1][local69 - 1] = 9;
											Static567.anIntArrayArray82[local74 + 1][local69 - 1] = local245;
											break;
										}
										if ((local55[arg6 + local85][local285 + local91 - 1] & 0x78E40000) != 0 || (local55[local285 + local85][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 > 0 && 128 - arg6 > local69 && Static318.anIntArrayArray48[local74 - 1][local69 + 1] == 0 && (local55[local85 - 1][local91 + arg6] & 0x4E240000) == 0) {
									for (local285 = 1; local285 < arg6; local285++) {
										if ((local55[local85 - 1][local91 + local285] & 0x4FA40000) != 0 || (local55[local85 + local285 - 1][arg6 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static191.anIntArray315[local50] = local7 - 1;
									Static313.anIntArray436[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static318.anIntArrayArray48[local74 - 1][local69 + 1] = 6;
									Static567.anIntArrayArray82[local74 - 1][local69 + 1] = local245;
								}
							} while (128 - arg6 <= local74);
						} while (local69 >= 128 - arg6);
					} while (Static318.anIntArrayArray48[local74 + 1][local69 + 1] != 0);
				} while ((local55[arg6 + local85][arg6 + local91] & 0x78240000) != 0);
				for (local285 = 1; local285 < arg6; local285++) {
					if ((local55[local85 + local285][arg6 + local91] & 0x7E240000) != 0 || (local55[arg6 + local85][local285 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static191.anIntArray315[local50] = local7 + 1;
				Static313.anIntArray436[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local74 + 1][local69 + 1] = 12;
				Static567.anIntArrayArray82[local74 + 1][local69 + 1] = local245;
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
	public static void method4405() {
		Static360.aClass97ArrayArray2 = new Class97[Static24.aClass248_4.method5774()][];
		Static140.aClass97ArrayArray1 = new Class97[Static24.aClass248_4.method5774()][];
		Static431.aBooleanArray26 = new boolean[Static24.aClass248_4.method5774()];
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!oa;IIILclient!lt;)V")
	public static void method4406(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class192 arg4) {
		@Pc(9) Class158 local9 = Static242.aClass274_3.method6292(arg4.anInt5573);
		if (local9.anInt4581 == -1) {
			return;
		}
		if (arg4.aBoolean397) {
			@Pc(22) int local22 = arg3 + arg4.anInt5612;
			arg3 = local22 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(38) Class71 local38 = local9.method3894(arg0, arg4.aBoolean389, arg3);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg4.anInt5577;
		@Pc(51) int local51 = arg4.anInt5570;
		if ((arg3 & 0x1) == 1) {
			local51 = arg4.anInt5577;
			local48 = arg4.anInt5570;
		}
		@Pc(65) int local65 = local38.AA();
		@Pc(68) int local68 = local38.a();
		if (local9.aBoolean337) {
			local68 = local51 * 4;
			local65 = local48 * 4;
		}
		if (local9.anInt4582 == 0) {
			local38.method7774(arg1, arg2 + 4 - local51 * 4, local65, local68);
		} else {
			local38.KA(arg1, arg2 + 4 - local51 * 4, local65, local68, 0, local9.anInt4582 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Lclient!rv;")
	public static Class285 method4407() {
		return Static67.method953();
	}
}
