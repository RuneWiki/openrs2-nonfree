import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
	public static int anInt4074;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "Lclient!nd;")
	public static Class238 aClass238_102;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_3 = new Class373("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public static void method3541(@OriginalArg(1) int arg0) {
		if (arg0 == Static454.anInt7416) {
			return;
		}
		if (arg0 == 13) {
			if (Static63.aString16 == null) {
				Static343.method5199(Static272.aString43, Static55.aString12, Static297.anInt5356);
			} else {
				Static514.method7106(Static297.anInt5356);
			}
		}
		if (arg0 != 13 && Static46.aClass22_3 != null) {
			Static46.aClass22_3.method7460();
			Static46.aClass22_3 = null;
		}
		if (arg0 == 3) {
			Static219.method3589(Static592.anInt9857 != Static220.anInt4141);
		}
		if (arg0 == 7) {
			Static506.method7047(Static649.anInt10494 != Static592.anInt9857);
		}
		if (arg0 == 5) {
			if (Static63.aString16 == null) {
				Static327.method4981(Static272.aString43, Static55.aString12);
			} else {
				Static151.method2659();
			}
		} else if (arg0 == 6) {
			if (Static63.aString16 == null) {
				Static343.method5199(Static272.aString43, Static55.aString12, Static297.anInt5356);
			} else {
				Static514.method7106(Static297.anInt5356);
			}
		} else if (arg0 == 9) {
			if (Static63.aString16 == null) {
				Static343.method5199(Static272.aString43, Static55.aString12, Static297.anInt5356);
			} else {
				Static514.method7106(Static297.anInt5356);
			}
		} else if (arg0 == 12) {
			if (Static63.aString16 == null) {
				Static327.method4981(Static272.aString43, Static55.aString12);
			} else {
				Static151.method2659();
			}
		}
		if (Static243.method6205(Static454.anInt7416)) {
			Static215.aClass238_103.anInt6471 = 2;
			Static120.aClass238_57.anInt6471 = 2;
			Static425.aClass238_197.anInt6471 = 2;
			Static26.aClass238_15.anInt6471 = 2;
			Static444.aClass238_206.anInt6471 = 2;
			Static556.aClass238_253.anInt6471 = 2;
			Static258.aClass238_119.anInt6471 = 2;
		}
		if (Static243.method6205(arg0)) {
			Static296.anInt5352 = 1;
			Static559.anInt9233 = 1;
			Static171.anInt3468 = 0;
			Static85.anInt2172 = 0;
			Static417.anInt6986 = 0;
			Static212.method3537(true);
			Static215.aClass238_103.anInt6471 = 1;
			Static120.aClass238_57.anInt6471 = 1;
			Static425.aClass238_197.anInt6471 = 1;
			Static26.aClass238_15.anInt6471 = 1;
			Static444.aClass238_206.anInt6471 = 1;
			Static556.aClass238_253.anInt6471 = 1;
			Static258.aClass238_119.anInt6471 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static206.method3478();
		}
		@Pc(222) boolean local222 = arg0 == 2 || Static509.method7066(arg0) || Static85.method1801(arg0);
		@Pc(237) boolean local237 = Static454.anInt7416 == 2 || Static509.method7066(Static454.anInt7416) || Static85.method1801(Static454.anInt7416);
		if (local237 != local222) {
			if (local222) {
				Static57.anInt1427 = Static115.anInt2472;
				if (Static305.aClass2_Sub49_15.aClass33_Sub9_2.method3103() == 0) {
					Static210.method8325();
				} else {
					Static97.method1923(Static609.aClass238_284, Static115.anInt2472, Static305.aClass2_Sub49_15.aClass33_Sub9_2.method3103());
					Static480.method6802();
				}
				Static194.aClass322_2.method7442(false);
			} else {
				Static210.method8325();
				Static194.aClass322_2.method7442(true);
			}
		}
		if (Static243.method6205(arg0) || arg0 == 13) {
			Static141.aClass13_27.method8118();
		}
		Static454.anInt7416 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Z")
	public static boolean method3542(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)Z")
	public static boolean method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static79.aBoolean178 || !Static294.aBoolean394) {
			return false;
		} else if (Static111.anInt2390 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static167.anIntArrayArrayArray8[arg0][arg1][arg2];
			if (-Static111.anInt2388 == local24) {
				return false;
			} else if (local24 == Static111.anInt2388) {
				return true;
			} else if (Static332.aClass91Array2 == Static511.aClass91Array3) {
				return false;
			} else {
				@Pc(44) int local44 = arg1 << Static326.anInt5713;
				@Pc(48) int local48 = arg2 << Static326.anInt5713;
				if (Static33.method735(Static519.anInt8387 + local44 - 1, Static519.anInt8387 + -1 + local48, Static511.aClass91Array3[arg0].method7447(arg2 + 1, arg1 + 1), local44 + 1, local44 + 1, local48 + Static519.anInt8387 - 1, Static511.aClass91Array3[arg0].method7447(arg2 + 1, arg1), local48 + 1, Static511.aClass91Array3[arg0].method7447(arg2, arg1)) && Static33.method735(local44 + Static519.anInt8387 - 1, local48 - -Static519.anInt8387 + -1, Static511.aClass91Array3[arg0].method7447(arg2, arg1 + 1), local44 + 1, local44 + -1 + Static519.anInt8387, local48 + 1, Static511.aClass91Array3[arg0].method7447(arg2 + 1, arg1 + 1), local48 + 1, Static511.aClass91Array3[arg0].method7447(arg2, arg1))) {
					Static247.anInt4758++;
					Static167.anIntArrayArrayArray8[arg0][arg1][arg2] = Static111.anInt2388;
					return true;
				} else {
					Static167.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static111.anInt2388;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public static void method3544() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static298.aBooleanArray10[local5] = false;
		}
		Static391.anInt6747 = Static400.anInt7896;
		Static92.anInt2248 = Static63.anInt1715;
		Static591.anInt9828 = 0;
		Static108.anInt2365 = Static479.anInt7769;
		Static407.anInt6909 = 5;
		Static399.anInt6860 = Static502.anInt9930;
		Static79.anInt2092 = 0;
		Static648.anInt10476 = -1;
		Static644.anInt10415 = -1;
		Static494.anInt7890 = -1;
		Static69.anInt1870 = Static576.anInt9403;
		Static236.anInt4333 = -1;
		Static121.anInt2587 = Static389.anInt6694;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		if (!Static79.aBoolean178 || !Static294.aBoolean394) {
			Static449.anInt7349 = 0;
			return;
		}
		if (Static325.aBoolean414) {
			Static163.aLong87 = Static220.aClass124_1.method7049();
		}
		Static89.anInt6960 = 0;
		Static247.anInt4758 = 0;
		Static25.anInt8653 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static622.anInt10160 = (int) ((float) local27[2] / 3.0F);
		Static260.anInt4887 = (int) ((float) local27[3] / 3.0F);
		arg1.method8100(Static84.anIntArray150);
		if ((int) ((float) Static84.anIntArray150[0] / 3.0F) != Static317.anInt5596 || Static179.anInt3584 != (int) ((float) Static84.anIntArray150[1] / 3.0F)) {
			Static179.anInt3584 = (int) ((float) Static84.anIntArray150[1] / 3.0F);
			Static317.anInt5596 = (int) ((float) Static84.anIntArray150[0] / 3.0F);
			Static649.anIntArray744 = new int[Static317.anInt5596 * Static179.anInt3584];
			Static449.anInt7346 = Static179.anInt3584 >> 1;
			Static108.anInt2357 = Static317.anInt5596 >> 1;
		}
		Static343.aClass51_6 = arg1.method8119();
		Static449.anInt7349 = 0;
		for (@Pc(108) int local108 = 0; local108 < Static608.anInt10054; local108++) {
			Static534.method7402(arg0, arg1, Static146.aClass62Array1[local108]);
		}
		for (@Pc(127) int local127 = 0; local127 < Static116.anInt2476; local127++) {
			Static534.method7402(arg0, arg1, Static566.aClass62Array4[local127]);
		}
		for (@Pc(146) int local146 = 0; local146 < Static397.anInt6835; local146++) {
			Static534.method7402(arg0, arg1, Static526.aClass62Array3[local146]);
		}
		Static111.anInt2390 = 0;
		if (Static449.anInt7349 > 0) {
			@Pc(170) int local170 = Static649.anIntArray744.length;
			@Pc(176) int local176 = local170 - local170 & 0x7;
			@Pc(178) int local178 = 0;
			while (local176 > local178) {
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
			}
			while (local178 < local170) {
				Static649.anIntArray744[local178++] = Integer.MAX_VALUE;
			}
			Static138.anInt2931 = 1;
			for (@Pc(245) int local245 = 0; local245 < Static449.anInt7349; local245++) {
				@Pc(251) Class62 local251 = Static342.aClass62Array2[local245];
				Static92.method1887(local251.aShortArray31[0], local251.aShortArray32[3], local251.aShortArray30[1], local251.aShortArray31[1], local251.aShortArray32[1], local251.aShortArray31[3], local251.aShortArray32[0], local251.aShortArray30[3], local251.aShortArray30[0]);
				Static92.method1887(local251.aShortArray31[1], local251.aShortArray32[3], local251.aShortArray30[2], local251.aShortArray31[2], local251.aShortArray32[2], local251.aShortArray31[3], local251.aShortArray32[1], local251.aShortArray30[3], local251.aShortArray30[1]);
			}
			Static138.anInt2931 = 2;
		}
		if (Static325.aBoolean414) {
			Static557.aLong240 = Static220.aClass124_1.method7049() - Static163.aLong87;
		}
	}
}
