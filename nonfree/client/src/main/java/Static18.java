import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!kc;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!ua;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/awt/Graphics;")
	public static Graphics aGraphics1;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	public static int anInt805;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_264 = Static56.method1206("Enter name of friend to add to list");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!lc;")
	public static Class31 aClass31_265 = Static56.method1206("Use @lre@");

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static int anInt800 = 2;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_266 = Static56.method1206("You have ");

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!lc;")
	public static Class31 aClass31_267 = Static56.method1206("Trade)4compete");

	@OriginalMember(owner = "client!de", name = "m", descriptor = "I")
	public static int anInt802 = 10;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_268 = Static56.method1206("(U3");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZIILclient!bb;III)V")
	public static void method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static106.aBoolean155) {
			Static10.anInt370 = 32;
		} else {
			Static10.anInt370 = 0;
		}
		Static106.aBoolean155 = false;
		if (arg0 >= arg6 && arg0 < arg6 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg4.anInt256 -= Static40.anInt2032 * 4;
			if (arg2 == 1) {
				Static92.aBoolean81 = true;
			}
			if (arg2 == 2 || arg2 == 3) {
				Static27.aBoolean65 = true;
			}
		} else if (arg6 <= arg0 && arg0 < arg6 + 16 && arg3 >= arg1 + arg7 - 16 && arg7 + arg1 > arg3) {
			if (arg2 == 1) {
				Static92.aBoolean81 = true;
			}
			if (arg2 == 2 || arg2 == 3) {
				Static27.aBoolean65 = true;
			}
			arg4.anInt256 += Static40.anInt2032 * 4;
		} else if (arg6 - Static10.anInt370 <= arg0 && arg0 < arg6 + Static10.anInt370 + 16 && arg1 + 16 <= arg3 && arg3 < arg7 + arg1 - 16 && Static40.anInt2032 > 0) {
			if (arg2 == 2 || arg2 == 3) {
				Static27.aBoolean65 = true;
			}
			Static106.aBoolean155 = true;
			if (arg2 == 1) {
				Static92.aBoolean81 = true;
			}
			@Pc(195) int local195 = (arg7 - 32) * arg7 / arg5;
			if (local195 < 8) {
				local195 = 8;
			}
			@Pc(207) int local207 = arg7 - local195 - 32;
			@Pc(219) int local219 = arg3 - local195 / 2 - arg1 - 16;
			arg4.anInt256 = local219 * (arg5 - arg7) / local207;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
	public static boolean method533(@OriginalArg(1) int arg0) {
		if (!Static40.method1277(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class2_Sub1_Sub2[] local22 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class2_Sub1_Sub2 local30 = local22[local24];
			if (local30 != null && local30.anInt270 == 6) {
				@Pc(59) int local59;
				if (local30.anInt243 != -1 || local30.anInt269 != -1) {
					@Pc(54) boolean local54 = Static40.method1276(local30);
					if (local54) {
						local59 = local30.anInt269;
					} else {
						local59 = local30.anInt243;
					}
					if (local59 != -1) {
						@Pc(72) Class2_Sub1_Sub10 local72 = Static54.method1158(local59);
						local30.anInt264 += Static56.anInt1911;
						label50: while (true) {
							do {
								do {
									if (local72.anIntArray293[local30.anInt253] >= local30.anInt264) {
										break label50;
									}
									local18 = true;
									local30.anInt264 -= local72.anIntArray293[local30.anInt253];
									local30.anInt253++;
								} while (local30.anInt253 < local72.anIntArray292.length);
								local30.anInt253 -= local72.anInt2094;
							} while (local30.anInt253 >= 0 && local30.anInt253 < local72.anIntArray292.length);
							local30.anInt253 = 0;
						}
					}
				}
				if (local30.anInt235 != 0) {
					local18 = true;
					@Pc(156) int local156 = local30.anInt235 >> 16;
					@Pc(160) int local160 = local156 * Static56.anInt1911;
					local30.anInt236 = local30.anInt236 + local160 & 0x7FF;
					local59 = local30.anInt235 << 16 >> 16;
					local59 *= Static56.anInt1911;
					local30.anInt273 = local30.anInt273 + local59 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method534() {
		aClass59_1 = null;
		aClass31_266 = null;
		aClass31_264 = null;
		aClass31_268 = null;
		aClass31_265 = null;
		anIntArray97 = null;
		aClass31_267 = null;
		aClass11_6 = null;
		aGraphics1 = null;
		anIntArray98 = null;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method535() {
		try {
			if (Static92.anInt1562 == 0) {
				Static61.aClass59_3 = null;
				Static45.aBoolean85 = false;
				Static89.aClass35_4 = null;
				Static92.anInt1562 = 1;
				Static54.anInt1806 = 0;
			}
			if (Static92.anInt1562 == 1) {
				if (Static61.aClass59_3 == null) {
					Static61.aClass59_3 = Static51.aClass51_2.method1471(Static62.anInt2113);
				}
				if (Static61.aClass59_3.anInt2608 == 2) {
					throw new IOException();
				}
				if (Static61.aClass59_3.anInt2608 == 1) {
					Static89.aClass35_4 = new Class35((Socket) Static61.aClass59_3.anObject5, Static51.aClass51_2);
					Static92.anInt1562 = 2;
					Static61.aClass59_3 = null;
				}
			}
			if (Static92.anInt1562 == 2) {
				@Pc(64) long local64 = Static59.aLong54 = Static58.aClass31_687.method1201();
				@Pc(71) int local71 = (int) (local64 >> 16 & 0x1FL);
				Static20.aClass2_Sub6_Sub1_11.anInt952 = 0;
				Static20.aClass2_Sub6_Sub1_11.method637(14);
				Static20.aClass2_Sub6_Sub1_11.method637(local71);
				Static89.aClass35_4.method1347(2, Static20.aClass2_Sub6_Sub1_11.aByteArray11);
				Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
				Static92.anInt1562 = 3;
			}
			@Pc(103) int local103;
			if (Static92.anInt1562 == 3) {
				local103 = Static89.aClass35_4.method1351();
				if (local103 != 0) {
					Static27.method776(local103);
					return;
				}
				Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
				Static92.anInt1562 = 4;
			}
			if (Static92.anInt1562 == 4) {
				if (Static3.aClass2_Sub6_Sub1_1.anInt952 < 8) {
					local103 = Static89.aClass35_4.method1350();
					if (8 - Static3.aClass2_Sub6_Sub1_1.anInt952 < local103) {
						local103 = 8 - Static3.aClass2_Sub6_Sub1_1.anInt952;
					}
					if (local103 > 0) {
						Static89.aClass35_4.method1352(local103, Static3.aClass2_Sub6_Sub1_1.anInt952, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
						Static3.aClass2_Sub6_Sub1_1.anInt952 += local103;
					}
				}
				if (Static3.aClass2_Sub6_Sub1_1.anInt952 == 8) {
					Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
					Static63.aLong56 = Static3.aClass2_Sub6_Sub1_1.method674();
					Static92.anInt1562 = 5;
				}
			}
			if (Static92.anInt1562 == 5) {
				@Pc(176) int[] local176 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static63.aLong56 >> 32), (int) Static63.aLong56 };
				Static20.aClass2_Sub6_Sub1_11.anInt952 = 0;
				Static20.aClass2_Sub6_Sub1_11.method637(10);
				Static20.aClass2_Sub6_Sub1_11.method666(local176[0]);
				Static20.aClass2_Sub6_Sub1_11.method666(local176[1]);
				Static20.aClass2_Sub6_Sub1_11.method666(local176[2]);
				Static20.aClass2_Sub6_Sub1_11.method666(local176[3]);
				Static20.aClass2_Sub6_Sub1_11.method666(Static51.aClass51_2.anInt2323);
				Static20.aClass2_Sub6_Sub1_11.method626(Static58.aClass31_687.method1201());
				Static20.aClass2_Sub6_Sub1_11.method654(Static58.aClass31_690);
				Static20.aClass2_Sub6_Sub1_11.method669(Static74.aBigInteger2, Static65.aBigInteger1);
				Static55.aClass2_Sub6_Sub1_10.anInt952 = 0;
				if (Static103.anInt2775 == 40) {
					Static55.aClass2_Sub6_Sub1_10.method637(18);
				} else {
					Static55.aClass2_Sub6_Sub1_10.method637(16);
				}
				Static55.aClass2_Sub6_Sub1_10.method637(Static20.aClass2_Sub6_Sub1_11.anInt952 + 53);
				Static55.aClass2_Sub6_Sub1_10.method666(403);
				Static55.aClass2_Sub6_Sub1_10.method637(Static10.aBoolean28 ? 1 : 0);
				Static55.aClass2_Sub6_Sub1_10.method666(Static89.aClass11_Sub1_15.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static64.aClass11_Sub1_3.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static80.aClass11_Sub1_6.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static33.aClass11_Sub1_9.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static55.aClass11_Sub1_12.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static89.aClass11_Sub1_14.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static21.aClass11_Sub1_7.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static68.aClass11_Sub1_13.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static11.aClass11_Sub1_1.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static54.aClass11_Sub1_11.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static37.aClass11_Sub1_10.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method666(Static27.aClass11_Sub1_8.anInt493);
				Static55.aClass2_Sub6_Sub1_10.method672(Static20.aClass2_Sub6_Sub1_11.anInt952, Static20.aClass2_Sub6_Sub1_11.aByteArray11);
				Static89.aClass35_4.method1347(Static55.aClass2_Sub6_Sub1_10.anInt952, Static55.aClass2_Sub6_Sub1_10.aByteArray11);
				Static20.aClass2_Sub6_Sub1_11.method685(local176);
				for (@Pc(370) int local370 = 0; local370 < 4; local370++) {
					local176[local370] += 50;
				}
				Static3.aClass2_Sub6_Sub1_1.method685(local176);
				Static92.anInt1562 = 6;
			}
			if (Static92.anInt1562 == 6 && Static89.aClass35_4.method1350() > 0) {
				local103 = Static89.aClass35_4.method1351();
				if (local103 == 21 && Static103.anInt2775 == 20) {
					Static92.anInt1562 = 7;
				} else if (local103 == 2) {
					Static92.anInt1562 = 9;
				} else if (local103 == 15 && Static103.anInt2775 == 40) {
					Static14.method424();
					return;
				} else if (local103 == 23 && Static15.anInt654 < 1) {
					Static92.anInt1562 = 0;
					Static15.anInt654++;
				} else {
					Static27.method776(local103);
					return;
				}
			}
			if (Static92.anInt1562 == 7 && Static89.aClass35_4.method1350() > 0) {
				Static46.anInt1616 = Static89.aClass35_4.method1351() * 60 + 180;
				Static92.anInt1562 = 8;
			}
			if (Static92.anInt1562 == 8) {
				Static54.anInt1806 = 0;
				Static44.method1063(Static2.aClass31_47, Static37.method974(new Class31[] { Static91.aClass31_859, Static89.method1499(Static46.anInt1616 / 60) }));
				if (--Static46.anInt1616 <= 0) {
					Static92.anInt1562 = 0;
				}
			} else {
				if (Static92.anInt1562 == 9 && Static89.aClass35_4.method1350() >= 8) {
					Static67.anInt2204 = Static89.aClass35_4.method1351();
					Static17.aBoolean51 = Static89.aClass35_4.method1351() == 1;
					Static2.anInt99 = Static89.aClass35_4.method1351();
					Static2.anInt99 <<= 0x8;
					Static2.anInt99 += Static89.aClass35_4.method1351();
					Static12.anInt540 = Static89.aClass35_4.method1351();
					Static89.aClass35_4.method1352(1, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
					Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
					Static76.anInt2256 = Static3.aClass2_Sub6_Sub1_1.method686();
					Static89.aClass35_4.method1352(2, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
					Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
					Static87.anInt2339 = Static3.aClass2_Sub6_Sub1_1.method627();
					Static92.anInt1562 = 10;
				}
				if (Static92.anInt1562 != 10) {
					Static54.anInt1806++;
					if (Static54.anInt1806 > 2000) {
						if (Static15.anInt654 < 1) {
							Static92.anInt1562 = 0;
							if (Static8.anInt292 == Static62.anInt2113) {
								Static62.anInt2113 = Static5.anInt159;
							} else {
								Static62.anInt2113 = Static8.anInt292;
							}
							Static15.anInt654++;
						} else {
							Static27.method776(-3);
						}
					}
				} else if (Static89.aClass35_4.method1350() >= Static87.anInt2339) {
					Static3.aClass2_Sub6_Sub1_1.anInt952 = 0;
					Static89.aClass35_4.method1352(Static87.anInt2339, 0, Static3.aClass2_Sub6_Sub1_1.aByteArray11);
					Static3.method89();
					Static103.anInt2767 = -1;
					Static56.method1207(false);
					Static76.anInt2256 = -1;
				}
			}
		} catch (@Pc(653) IOException local653) {
			if (Static15.anInt654 < 1) {
				if (Static62.anInt2113 == Static8.anInt292) {
					Static62.anInt2113 = Static5.anInt159;
				} else {
					Static62.anInt2113 = Static8.anInt292;
				}
				Static15.anInt654++;
				Static92.anInt1562 = 0;
			} else {
				Static27.method776(-2);
			}
		}
	}
}
