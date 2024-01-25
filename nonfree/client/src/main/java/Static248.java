import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z")
	public static boolean method3706(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static307.anInt5772; local1 < Static220.anInt4418; local1++) {
			@Pc(6) Class252[][] local6 = Static67.aClass252ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static235.anInt4661; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static166.anInt3464 + local9;
				@Pc(18) int local18 = Static166.anInt3464 - local9;
				if (local14 >= Static329.anInt6070 || local18 < Static182.anInt3942) {
					for (@Pc(27) int local27 = -Static235.anInt4661; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static31.anInt2066 + local27;
						@Pc(36) int local36 = Static31.anInt2066 - local27;
						@Pc(48) Class252 local48;
						if (local14 >= Static329.anInt6070) {
							if (local32 >= Static272.anInt5271) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean480) {
									Static376.aBoolean433 = arg0;
									Static47.aClass9_3.method6064(local48);
									Static47.aClass9_3.method6063();
								}
							}
							if (local36 < Static418.anInt7456) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean480) {
									Static376.aBoolean433 = arg0;
									Static47.aClass9_3.method6064(local48);
									Static47.aClass9_3.method6063();
								}
							}
						}
						if (local18 < Static182.anInt3942) {
							if (local32 >= Static272.anInt5271) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean480) {
									Static376.aBoolean433 = arg0;
									Static47.aClass9_3.method6064(local48);
									Static47.aClass9_3.method6063();
								}
							}
							if (local36 < Static418.anInt7456) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean480) {
									Static376.aBoolean433 = arg0;
									Static47.aClass9_3.method6064(local48);
									Static47.aClass9_3.method6063();
								}
							}
						}
						if (Static62.anInt1642 == 0) {
							if (Static421.aBoolean482) {
								Static47.aClass9_3.method6069(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZII)Lclient!ij;")
	public static Class1_Sub1_Sub11 method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(32) Class1_Sub1_Sub11 local32 = (Class1_Sub1_Sub11) Static354.aClass38_33.method765((long) arg0 | (long) arg1 << 32);
		if (local32 == null) {
			local32 = new Class1_Sub1_Sub11(arg1, arg0);
			Static354.aClass38_33.method766(local32, local32.aLong228);
		}
		return local32;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIILclient!ir;BI)Z")
	public static boolean method3708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class120 arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg7;
		@Pc(15) int local15 = arg2 - 64;
		Static75.anIntArrayArray19[64][64] = 99;
		@Pc(26) int local26 = arg7 - 64;
		Static343.anIntArrayArray50[64][64] = 0;
		@Pc(34) byte local34 = 0;
		Static367.anIntArray618[0] = arg2;
		@Pc(40) int local40 = 0;
		@Pc(60) int local60 = local34 + 1;
		Static386.anIntArray669[0] = arg7;
		@Pc(65) int[][] local65 = arg9.anIntArrayArray35;
		while (true) {
			label282: while (true) {
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(96) int local96;
				@Pc(102) int local102;
				@Pc(252) int local252;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local60 == local40) {
									Static56.anInt1510 = local7;
									Static94.anInt2261 = local5;
									return false;
								}
								local7 = Static386.anIntArray669[local40];
								local5 = Static367.anIntArray618[local40];
								local40 = local40 + 1 & 0xFFF;
								local85 = local5 - local15;
								local90 = local7 - local26;
								local96 = local5 - arg9.anInt3918;
								local102 = local7 - arg9.anInt3915;
								if (arg6 == -4) {
									if (local5 == arg1 && local7 == arg10) {
										Static56.anInt1510 = local7;
										Static94.anInt2261 = local5;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static149.method2370(arg3, arg10, local5, local7, arg0, arg1, arg5, arg3)) {
										Static94.anInt2261 = local5;
										Static56.anInt1510 = local7;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg9.method3053(arg3, arg5, arg10, local5, local7, arg3, arg1, arg0, arg8)) {
										Static94.anInt2261 = local5;
										Static56.anInt1510 = local7;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg9.method3039(local7, arg5, arg10, local5, arg3, arg8, arg1, arg0)) {
										Static56.anInt1510 = local7;
										Static94.anInt2261 = local5;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg9.method3041(arg1, arg4, arg6, arg10, local5, local7, arg3)) {
										Static56.anInt1510 = local7;
										Static94.anInt2261 = local5;
										return true;
									}
								} else if (arg9.method3036(local7, arg10, arg4, arg3, local5, arg1, arg6)) {
									Static56.anInt1510 = local7;
									Static94.anInt2261 = local5;
									return true;
								}
								local252 = Static343.anIntArrayArray50[local85][local90] + 1;
								if (local85 > 0 && Static75.anIntArrayArray19[local85 - 1][local90] == 0 && (local65[local96 - 1][local102] & 0x43A40000) == 0 && (local65[local96 - 1][arg3 + local102 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg3 - 1 <= local291) {
											Static367.anIntArray618[local60] = local5 - 1;
											Static386.anIntArray669[local60] = local7;
											local60 = local60 + 1 & 0xFFF;
											Static75.anIntArrayArray19[local85 - 1][local90] = 2;
											Static343.anIntArrayArray50[local85 - 1][local90] = local252;
											break;
										}
										if ((local65[local96 - 1][local291 + local102] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg3 > local85 && Static75.anIntArrayArray19[local85 + 1][local90] == 0 && (local65[local96 + arg3][local102] & 0x60E40000) == 0 && (local65[local96 + arg3][arg3 + local102 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg3 - 1 <= local291) {
											Static367.anIntArray618[local60] = local5 + 1;
											Static386.anIntArray669[local60] = local7;
											local60 = local60 + 1 & 0xFFF;
											Static75.anIntArrayArray19[local85 + 1][local90] = 8;
											Static343.anIntArrayArray50[local85 + 1][local90] = local252;
											break;
										}
										if ((local65[local96 + arg3][local291 + local102] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local90 > 0 && Static75.anIntArrayArray19[local85][local90 - 1] == 0 && (local65[local96][local102 - 1] & 0x43A40000) == 0 && (local65[local96 + arg3 - 1][local102 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg3 - 1) {
											Static367.anIntArray618[local60] = local5;
											Static386.anIntArray669[local60] = local7 - 1;
											local60 = local60 + 1 & 0xFFF;
											Static75.anIntArrayArray19[local85][local90 - 1] = 1;
											Static343.anIntArrayArray50[local85][local90 - 1] = local252;
											break;
										}
										if ((local65[local291 + local96][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg3 > local90 && Static75.anIntArrayArray19[local85][local90 + 1] == 0 && (local65[local96][local102 + arg3] & 0x4E240000) == 0 && (local65[local96 + arg3 - 1][local102 + arg3] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg3 - 1) {
											Static367.anIntArray618[local60] = local5;
											Static386.anIntArray669[local60] = local7 + 1;
											Static75.anIntArrayArray19[local85][local90 + 1] = 4;
											local60 = local60 + 1 & 0xFFF;
											Static343.anIntArrayArray50[local85][local90 + 1] = local252;
											break;
										}
										if ((local65[local291 + local96][arg3 + local102] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local85 > 0 && local90 > 0 && Static75.anIntArrayArray19[local85 - 1][local90 - 1] == 0 && (local65[local96 - 1][local102 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg3 <= local291) {
											Static367.anIntArray618[local60] = local5 - 1;
											Static386.anIntArray669[local60] = local7 - 1;
											local60 = local60 + 1 & 0xFFF;
											Static75.anIntArrayArray19[local85 - 1][local90 - 1] = 3;
											Static343.anIntArrayArray50[local85 - 1][local90 - 1] = local252;
											break;
										}
										if ((local65[local96 - 1][local102 + local291 - 1] & 0x4FA40000) != 0 || (local65[local291 + local96 - 1][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg3 > local85 && local90 > 0 && Static75.anIntArrayArray19[local85 + 1][local90 - 1] == 0 && (local65[arg3 + local96][local102 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg3 <= local291) {
											Static367.anIntArray618[local60] = local5 + 1;
											Static386.anIntArray669[local60] = local7 - 1;
											local60 = local60 + 1 & 0xFFF;
											Static75.anIntArrayArray19[local85 + 1][local90 - 1] = 9;
											Static343.anIntArrayArray50[local85 + 1][local90 - 1] = local252;
											break;
										}
										if ((local65[local96 + arg3][local102 + local291 - 1] & 0x78E40000) != 0 || (local65[local291 + local96][local102 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local85 > 0 && local90 < 128 - arg3 && Static75.anIntArrayArray19[local85 - 1][local90 + 1] == 0 && (local65[local96 - 1][local102 + arg3] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg3; local291++) {
										if ((local65[local96 - 1][local102 + local291] & 0x4FA40000) != 0 || (local65[local291 + local96 - 1][local102 + arg3] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static367.anIntArray618[local60] = local5 - 1;
									Static386.anIntArray669[local60] = local7 + 1;
									local60 = local60 + 1 & 0xFFF;
									Static75.anIntArrayArray19[local85 - 1][local90 + 1] = 6;
									Static343.anIntArrayArray50[local85 - 1][local90 + 1] = local252;
								}
							} while (128 - arg3 <= local85);
						} while (local90 >= 128 - arg3);
					} while (Static75.anIntArrayArray19[local85 + 1][local90 + 1] != 0);
				} while ((local65[local96 + arg3][local102 + arg3] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg3; local291++) {
					if ((local65[local291 + local96][arg3 + local102] & 0x7E240000) != 0 || (local65[local96 + arg3][local102 + local291] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static367.anIntArray618[local60] = local5 + 1;
				Static386.anIntArray669[local60] = local7 + 1;
				local60 = local60 + 1 & 0xFFF;
				Static75.anIntArrayArray19[local85 + 1][local90 + 1] = 12;
				Static343.anIntArrayArray50[local85 + 1][local90 + 1] = local252;
			}
		}
	}
}
