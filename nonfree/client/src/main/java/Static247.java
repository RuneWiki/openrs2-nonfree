import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_64;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "Lclient!rk;")
	public static Class180 aClass180_65;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!aj;")
	public static Class10 aClass10_40 = new Class10(8);

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_34 = new Class74();

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	public static int anInt4894 = -1;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_41 = new Class10(512);

	@OriginalMember(owner = "client!po", name = "r", descriptor = "[I")
	public static final int[] anIntArray644 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!bd;I)V")
	public static void method4264(@OriginalArg(0) Class21 arg0) {
		Static289.anInt2339 = 3;
		Static252.method5176(true);
		Static110.anInt2524 = 127;
		Static155.aBoolean244 = true;
		Static206.anInt4115 = 0;
		Static140.aBoolean228 = true;
		Static70.aBoolean128 = true;
		Static336.anInt4180 = 2;
		Static325.aBoolean452 = true;
		Static165.anInt3445 = 127;
		Static296.aBoolean432 = true;
		Class22_Sub2_Sub5.lb = true;
		Static2.anInt18 = 1;
		Static27.anInt622 = 0;
		Static254.anInt4943 = 255;
		Static231.aBoolean341 = true;
		Static227.anInt6305 = 0;
		Static308.aBoolean431 = true;
		Static108.aBoolean108 = true;
		Static342.aBoolean471 = true;
		Static345.anInt6528 = 0;
		if (Static194.anInt1874 >= 96) {
			Static218.method3851(2);
		} else {
			Static218.method3851(0);
		}
		Static275.anInt5447 = 0;
		Static6.anInt126 = 2;
		Static294.aBoolean459 = false;
		Static268.aBoolean393 = false;
		Static324.aBoolean451 = false;
		Static35.aBoolean76 = true;
		Static53.aBoolean112 = true;
		Static186.anInt3771 = 0;
		Static244.anInt4807 = 2;
		@Pc(79) Class207 local79 = null;
		try {
			@Pc(87) Class99 local87 = arg0.method386();
			while (local87.anInt2836 == 0) {
				Static129.method2634(1L);
			}
			if (local87.anInt2836 == 1) {
				local79 = (Class207) local87.anObject2;
				@Pc(111) byte[] local111 = new byte[(int) local79.method5332()];
				@Pc(125) int local125;
				for (@Pc(113) int local113 = 0; local113 < local111.length; local113 += local125) {
					local125 = local79.method5333(local111, local111.length - local113, local113);
					if (local125 == -1) {
						throw new IOException("EOF");
					}
				}
				Static223.method3943(new Class7_Sub3(local111));
			}
		} catch (@Pc(154) Exception local154) {
		}
		try {
			if (local79 != null) {
				local79.method5336();
			}
		} catch (@Pc(161) Exception local161) {
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public static void method4265(@OriginalArg(1) int arg0) {
		Static226.anInt4550 = arg0;
		Static131.aClass103_26.method2678();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!oa;IIIIIIIIII)Z")
	public static boolean method4267(@OriginalArg(0) int arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg9;
		@Pc(7) int local7 = arg0;
		@Pc(16) int local16 = arg9 - 64;
		Static218.anIntArrayArray34[64][64] = 99;
		@Pc(27) int local27 = arg0 - 64;
		Static342.anIntArrayArray56[64][64] = 0;
		@Pc(35) byte local35 = 0;
		@Pc(37) int local37 = 0;
		Static197.anIntArray538[0] = arg9;
		@Pc(44) int local44 = local35 + 1;
		Static354.anIntArray851[0] = arg0;
		@Pc(54) int[][] local54 = arg1.anIntArrayArray36;
		while (true) {
			label282: while (true) {
				@Pc(73) int local73;
				@Pc(68) int local68;
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(237) int local237;
				@Pc(279) int local279;
				do {
					do {
						do {
							label259: do {
								if (local44 == local37) {
									Static138.anInt3014 = local5;
									Static76.anInt1897 = local7;
									return false;
								}
								local5 = Static197.anIntArray538[local37];
								local7 = Static354.anIntArray851[local37];
								local68 = local7 - local27;
								local73 = local5 - local16;
								local37 = local37 + 1 & 0xFFF;
								local85 = local5 - arg1.anInt4488;
								local90 = local7 - arg1.anInt4484;
								if (arg2 == -4) {
									if (arg4 == local5 && arg5 == local7) {
										Static138.anInt3014 = local5;
										Static76.anInt1897 = local7;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static241.method4148(arg10, local5, arg4, arg8, local7, arg7, arg5, arg8)) {
										Static76.anInt1897 = local7;
										Static138.anInt3014 = local5;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg1.method3956(arg8, arg5, local7, local5, arg4, arg7, arg3, arg10, arg8)) {
										Static138.anInt3014 = local5;
										Static76.anInt1897 = local7;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg1.method3951(arg3, arg5, arg4, local5, arg8, local7, arg10, arg7)) {
										Static138.anInt3014 = local5;
										Static76.anInt1897 = local7;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg1.method3950(arg8, arg4, arg2, arg5, local5, local7, arg6)) {
										Static76.anInt1897 = local7;
										Static138.anInt3014 = local5;
										return true;
									}
								} else if (arg1.method3960(arg2, arg6, arg8, arg5, local5, local7, arg4)) {
									Static138.anInt3014 = local5;
									Static76.anInt1897 = local7;
									return true;
								}
								local237 = Static342.anIntArrayArray56[local73][local68] + 1;
								if (local73 > 0 && Static218.anIntArrayArray34[local73 - 1][local68] == 0 && (local54[local85 - 1][local90] & 0x43A40000) == 0 && (local54[local85 - 1][arg8 + local90 - 1] & 0x4E240000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg8 - 1) {
											Static197.anIntArray538[local44] = local5 - 1;
											Static354.anIntArray851[local44] = local7;
											local44 = local44 + 1 & 0xFFF;
											Static218.anIntArrayArray34[local73 - 1][local68] = 2;
											Static342.anIntArrayArray56[local73 - 1][local68] = local237;
											break;
										}
										if ((local54[local85 - 1][local279 + local90] & 0x4FA40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (128 - arg8 > local73 && Static218.anIntArrayArray34[local73 + 1][local68] == 0 && (local54[arg8 + local85][local90] & 0x60E40000) == 0 && (local54[local85 + arg8][local90 + arg8 - 1] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg8 - 1) {
											Static197.anIntArray538[local44] = local5 + 1;
											Static354.anIntArray851[local44] = local7;
											local44 = local44 + 1 & 0xFFF;
											Static218.anIntArrayArray34[local73 + 1][local68] = 8;
											Static342.anIntArrayArray56[local73 + 1][local68] = local237;
											break;
										}
										if ((local54[arg8 + local85][local279 + local90] & 0x78E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 > 0 && Static218.anIntArrayArray34[local73][local68 - 1] == 0 && (local54[local85][local90 - 1] & 0x43A40000) == 0 && (local54[arg8 + local85 - 1][local90 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (arg8 - 1 <= local279) {
											Static197.anIntArray538[local44] = local5;
											Static354.anIntArray851[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static218.anIntArrayArray34[local73][local68 - 1] = 1;
											Static342.anIntArrayArray56[local73][local68 - 1] = local237;
											break;
										}
										if ((local54[local85 + local279][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 < 128 - arg8 && Static218.anIntArrayArray34[local73][local68 + 1] == 0 && (local54[local85][arg8 + local90] & 0x4E240000) == 0 && (local54[local85 + arg8 - 1][arg8 + local90] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg8 - 1) {
											Static197.anIntArray538[local44] = local5;
											Static354.anIntArray851[local44] = local7 + 1;
											Static218.anIntArrayArray34[local73][local68 + 1] = 4;
											local44 = local44 + 1 & 0xFFF;
											Static342.anIntArrayArray56[local73][local68 + 1] = local237;
											break;
										}
										if ((local54[local85 + local279][local90 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local73 > 0 && local68 > 0 && Static218.anIntArrayArray34[local73 - 1][local68 - 1] == 0 && (local54[local85 - 1][local90 - 1] & 0x43A40000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg8) {
											Static197.anIntArray538[local44] = local5 - 1;
											Static354.anIntArray851[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static218.anIntArrayArray34[local73 - 1][local68 - 1] = 3;
											Static342.anIntArrayArray56[local73 - 1][local68 - 1] = local237;
											break;
										}
										if ((local54[local85 - 1][local279 + local90 - 1] & 0x4FA40000) != 0 || (local54[local279 + local85 - 1][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (128 - arg8 > local73 && local68 > 0 && Static218.anIntArrayArray34[local73 + 1][local68 - 1] == 0 && (local54[local85 + arg8][local90 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (arg8 <= local279) {
											Static197.anIntArray538[local44] = local5 + 1;
											Static354.anIntArray851[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static218.anIntArrayArray34[local73 + 1][local68 - 1] = 9;
											Static342.anIntArrayArray56[local73 + 1][local68 - 1] = local237;
											break;
										}
										if ((local54[local85 + arg8][local279 + local90 - 1] & 0x78E40000) != 0 || (local54[local85 + local279][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local73 > 0 && local68 < 128 - arg8 && Static218.anIntArrayArray34[local73 - 1][local68 + 1] == 0 && (local54[local85 - 1][local90 + arg8] & 0x4E240000) == 0) {
									for (local279 = 1; local279 < arg8; local279++) {
										if ((local54[local85 - 1][local90 + local279] & 0x4FA40000) != 0 || (local54[local85 + local279 - 1][arg8 + local90] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static197.anIntArray538[local44] = local5 - 1;
									Static354.anIntArray851[local44] = local7 + 1;
									local44 = local44 + 1 & 0xFFF;
									Static218.anIntArrayArray34[local73 - 1][local68 + 1] = 6;
									Static342.anIntArrayArray56[local73 - 1][local68 + 1] = local237;
								}
							} while (128 - arg8 <= local73);
						} while (128 - arg8 <= local68);
					} while (Static218.anIntArrayArray34[local73 + 1][local68 + 1] != 0);
				} while ((local54[arg8 + local85][local90 + arg8] & 0x78240000) != 0);
				for (local279 = 1; local279 < arg8; local279++) {
					if ((local54[local279 + local85][arg8 + local90] & 0x7E240000) != 0 || (local54[local85 + arg8][local90 + local279] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static197.anIntArray538[local44] = local5 + 1;
				Static354.anIntArray851[local44] = local7 + 1;
				Static218.anIntArrayArray34[local73 + 1][local68 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local73 + 1][local68 + 1] = local237;
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V")
	public static void method4268() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static15.anInt287; local11++) {
			for (@Pc(14) int local14 = 0; local14 < Static325.anInt6173; local14++) {
				if (Static348.method5582(local14, local5, local11, Static229.aClass49ArrayArrayArray6, true)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)I")
	public static int method4269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >>> 31;
		return (local15 + arg1) / arg0 - local15;
	}
}
