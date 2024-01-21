import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!tb;")
	public static Class44 aClass44_51;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static int anInt2263 = 0;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[B")
	public static byte[] aByteArray31 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public static int anInt2266 = 0;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1215 = Static33.method650("Loading )2 please wait)3");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1214 = aClass56_1215;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public static int anInt2268 = 0;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public static int anInt2271 = 0;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1216 = Static33.method650(")1j");

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public static int anInt2273 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!td;)Z")
	public static boolean method1514(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		if (arg0.anIntArray266 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anIntArray266.length; local19++) {
			@Pc(26) int local26 = Static88.method1611(arg0, local19);
			@Pc(31) int local31 = arg0.anIntArray270[local19];
			if (arg0.anIntArray266[local19] == 2) {
				if (local26 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray266[local19] == 3) {
				if (local31 >= local26) {
					return false;
				}
			} else if (arg0.anIntArray266[local19] == 4) {
				if (local26 == local31) {
					return false;
				}
			} else if (local31 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1515() {
		aClass56_1216 = null;
		aClass56_1214 = null;
		aClass44_51 = null;
		aClass56_1215 = null;
		aByteArray31 = null;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method1518() {
		if (Static117.aClass17_4 != null) {
			Static117.aClass17_4.method498();
			Static117.aClass17_4 = null;
		}
		Static51.method982();
		Static116.aClass14_1.method450();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static115.aClass81Array1[local18].method2012();
		}
		System.gc();
		Static22.method489();
		Static7.aBoolean18 = false;
		Static69.anInt1913 = -1;
		Static59.method1162();
		Static79.method1393(10);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method1519() {
		if (Static31.anInt920 != 0) {
			return;
		}
		Static66.anInt559 = 1;
		Static28.aClass56Array2[0] = Static21.aClass56_299;
		Static9.anIntArray9[0] = 1001;
		if (Static63.anInt1818 != -1) {
			Static53.anInt1527 = -1;
			Static31.anInt926 = -1;
			Static54.method1013(0, Static63.anInt1818, 503, 0, Static102.anInt3222, 0, Static36.anInt1021, 765);
			Static77.anInt3140 = Static53.anInt1527;
			Static51.anInt1495 = Static31.anInt926;
			return;
		}
		Static48.method881();
		Static31.anInt926 = -1;
		Static53.anInt1527 = -1;
		@Pc(52) boolean local52 = false;
		if (Static36.anInt1021 > 4 && Static102.anInt3222 > 4 && Static36.anInt1021 < 516 && Static102.anInt3222 < 338) {
			if (Static57.anInt1607 == -1) {
				Static93.method1646();
			} else {
				Static54.method1013(4, Static57.anInt1607, 338, 0, Static102.anInt3222, 4, Static36.anInt1021, 516);
			}
		}
		Static77.anInt3140 = Static53.anInt1527;
		Static53.anInt1527 = -1;
		Static51.anInt1495 = Static31.anInt926;
		Static31.anInt926 = -1;
		if (Static36.anInt1021 > 553 && Static102.anInt3222 > 205 && Static36.anInt1021 < 743 && Static102.anInt3222 < 466) {
			if (Static111.anInt2804 != -1) {
				Static54.method1013(205, Static111.anInt2804, 466, 1, Static102.anInt3222, 553, Static36.anInt1021, 743);
			} else if (Static44.anIntArray79[Static27.anInt798] != -1) {
				Static54.method1013(205, Static44.anIntArray79[Static27.anInt798], 466, 1, Static102.anInt3222, 553, Static36.anInt1021, 743);
			}
		}
		if (Static31.anInt926 != Static12.anInt300) {
			Static115.aBoolean157 = true;
			Static12.anInt300 = Static31.anInt926;
		}
		if (Static53.anInt1527 != Static102.anInt3219) {
			Static102.anInt3219 = Static53.anInt1527;
			Static115.aBoolean157 = true;
		}
		Static31.anInt926 = -1;
		Static53.anInt1527 = -1;
		if (Static36.anInt1021 > 17 && Static102.anInt3222 > 357 && Static36.anInt1021 < 496 && Static102.anInt3222 < 453) {
			if (Static57.anInt1609 != -1) {
				Static54.method1013(357, Static57.anInt1609, 453, 2, Static102.anInt3222, 17, Static36.anInt1021, 496);
			} else if (Static69.anInt1918 != -1) {
				Static54.method1013(357, Static69.anInt1918, 453, 3, Static102.anInt3222, 17, Static36.anInt1021, 496);
			} else if (Static102.anInt3222 < 434 && Static36.anInt1021 < 426) {
				Static115.method1898(Static102.anInt3222 - 357, Static36.anInt1021 + -17);
			}
		}
		if ((Static57.anInt1609 != -1 || Static69.anInt1918 != -1) && Static31.anInt926 != Static79.anInt2111) {
			Static79.anInt2111 = Static31.anInt926;
			Static12.aBoolean17 = true;
		}
		if ((Static57.anInt1609 != -1 || Static69.anInt1918 != -1) && Static53.anInt1525 != Static53.anInt1527) {
			Static53.anInt1525 = Static53.anInt1527;
			Static12.aBoolean17 = true;
		}
		while (!local52) {
			local52 = true;
			for (@Pc(272) int local272 = 0; local272 < Static66.anInt559 - 1; local272++) {
				if (Static9.anIntArray9[local272] < 1000 && Static9.anIntArray9[local272 + 1] > 1000) {
					local52 = false;
					@Pc(292) Class56 local292 = Static28.aClass56Array2[local272];
					Static28.aClass56Array2[local272] = Static28.aClass56Array2[local272 + 1];
					Static28.aClass56Array2[local272 + 1] = local292;
					@Pc(310) int local310 = Static9.anIntArray9[local272];
					Static9.anIntArray9[local272] = Static9.anIntArray9[local272 + 1];
					Static9.anIntArray9[local272 + 1] = local310;
					@Pc(328) int local328 = Static117.anIntArray303[local272];
					Static117.anIntArray303[local272] = Static117.anIntArray303[local272 + 1];
					Static117.anIntArray303[local272 + 1] = local328;
					@Pc(346) int local346 = Static93.anIntArray219[local272];
					Static93.anIntArray219[local272] = Static93.anIntArray219[local272 + 1];
					Static93.anIntArray219[local272 + 1] = local346;
					@Pc(364) int local364 = Static22.anIntArray47[local272];
					Static22.anIntArray47[local272] = Static22.anIntArray47[local272 + 1];
					Static22.anIntArray47[local272 + 1] = local364;
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V")
	public static void method1521(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static63.anInt1820 >= 100) {
			Static75.method1348(0, Static72.aClass56_699, Static122.aClass56_1633);
			return;
		}
		@Pc(29) Class56 local29 = Static16.method342(arg0).method1421();
		for (@Pc(31) int local31 = 0; local31 < Static63.anInt1820; local31++) {
			if (Static84.aLongArray24[local31] == arg0) {
				Static75.method1348(0, Static84.method1524(new Class56[] { local29, Static92.aClass56_1288 }), Static122.aClass56_1633);
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static42.anInt1124; local74++) {
			if (arg0 == Static3.aLongArray36[local74]) {
				Static75.method1348(0, Static84.method1524(new Class56[] { Static110.aClass56_1515, local29, Static72.aClass56_696 }), Static122.aClass56_1633);
				return;
			}
		}
		if (!local29.method1437(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764)) {
			Static84.aLongArray24[Static63.anInt1820++] = arg0;
			Static115.aBoolean157 = true;
			Static111.aClass3_Sub2_Sub1_4.method325(211);
			Static111.aClass3_Sub2_Sub1_4.method300(arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BB)[B")
	public static byte[] method1522(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class3_Sub2 local13 = new Class3_Sub2(arg0);
		@Pc(17) int local17 = local13.method270();
		@Pc(21) int local21 = local13.method278();
		if (local21 < 0 || Static105.anInt2609 != 0 && local21 > Static105.anInt2609) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(50) byte[] local50 = new byte[local21];
			local13.method305(local50, local21);
			return local50;
		} else {
			@Pc(62) int local62 = local13.method278();
			if (local62 < 0 || Static105.anInt2609 != 0 && local62 > Static105.anInt2609) {
				throw new RuntimeException();
			}
			@Pc(79) byte[] local79 = new byte[local62];
			if (local17 == 1) {
				Static37.method688(local79, local62, arg0, local21);
			} else {
				Static65.aClass34_1.method882(local13, local79);
			}
			return local79;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!tb;Lclient!tb;ILclient!lf;Lclient!tb;)Z")
	public static boolean method1523(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class3_Sub3_Sub2 arg2, @OriginalArg(4) Class44 arg3) {
		Static69.aClass44_42 = arg0;
		Static48.aClass3_Sub3_Sub2_2 = arg2;
		Static77.aClass44_71 = arg1;
		Static44.aClass44_24 = arg3;
		return true;
	}
}
