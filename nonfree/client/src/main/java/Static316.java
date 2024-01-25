import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!am;")
	public static Class11 aClass11_114;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public static int anInt5500;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "Lclient!qb;")
	public static Class163 aClass163_3;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public static int anInt5504;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString197 = null;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString198 = "white:";

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public static void method4685(@OriginalArg(0) int arg0) {
		Static100.aClass154_35 = new Class154(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4686(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local73 <= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(160) int local160;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local160 = 0; local160 < arg0; local160++) {
				if (local113 <= local160) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(205) int local205;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local160 >> 1 >= local205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(254) int local254;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local254 >= local205 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(311) int local311;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local311 = arg0 - 1; local311 >= 0; local311--) {
				if (local254 >> 1 >= local311) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(361) int local361;
		for (local311 = arg0 - 1; local311 >= 0; local311--) {
			for (local361 = arg0 - 1; local361 >= 0; local361--) {
				if (local311 << 1 <= local361) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(409) int local409;
		for (local361 = arg0 - 1; local361 >= 0; local361--) {
			for (local409 = arg0 - 1; local409 >= 0; local409--) {
				if (local361 >> 1 >= local409) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(448) int local448;
		for (local409 = arg0 - 1; local409 >= 0; local409--) {
			for (local448 = 0; local448 < arg0; local448++) {
				if (local448 >= local409 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(497) int local497;
		for (local448 = 0; local448 < arg0; local448++) {
			for (local497 = 0; local497 < arg0; local497++) {
				if (local448 >> 1 >= local497) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(546) int local546;
		for (local497 = 0; local497 < arg0; local497++) {
			for (local546 = arg0 - 1; local546 >= 0; local546--) {
				if (local546 >= local497 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(593) int local593;
		for (local546 = arg0 - 1; local546 >= 0; local546--) {
			for (local593 = 0; local593 < arg0; local593++) {
				if (local546 >> 1 <= local593) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(631) int local631;
		for (local593 = 0; local593 < arg0; local593++) {
			for (local631 = 0; local631 < arg0; local631++) {
				if (local593 << 1 >= local631) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(680) int local680;
		for (local631 = 0; local631 < arg0; local631++) {
			for (local680 = arg0 - 1; local680 >= 0; local680--) {
				if (local631 >> 1 <= local680) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(730) int local730;
		for (local680 = arg0 - 1; local680 >= 0; local680--) {
			for (local730 = arg0 - 1; local730 >= 0; local730--) {
				if (local680 << 1 >= local730) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(774) int local774;
		for (local730 = arg0 - 1; local730 >= 0; local730--) {
			for (local774 = arg0 - 1; local774 >= 0; local774--) {
				if (local774 >= local730 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(816) int local816;
		for (local774 = arg0 - 1; local774 >= 0; local774--) {
			for (local816 = 0; local816 < arg0; local816++) {
				if (local774 << 1 >= local816) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(862) int local862;
		for (local816 = 0; local816 < arg0; local816++) {
			for (local862 = 0; local862 < arg0; local862++) {
				if (local862 >= local816 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(907) int local907;
		for (local862 = 0; local862 < arg0; local862++) {
			for (local907 = arg0 - 1; local907 >= 0; local907--) {
				if (local907 <= local862 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(949) int local949;
		for (local907 = 0; local907 < arg0; local907++) {
			for (local949 = 0; local949 < arg0; local949++) {
				if (arg0 / 2 >= local949) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(992) int local992;
		for (local949 = 0; local949 < arg0; local949++) {
			for (local992 = 0; local992 < arg0; local992++) {
				if (arg0 / 2 >= local949) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1035) int local1035;
		for (local992 = 0; local992 < arg0; local992++) {
			for (local1035 = 0; local1035 < arg0; local1035++) {
				if (arg0 / 2 <= local1035) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1086) int local1086;
		for (local1035 = 0; local1035 < arg0; local1035++) {
			for (local1086 = 0; local1086 < arg0; local1086++) {
				if (local1035 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1125) int local1125;
		for (local1086 = 0; local1086 < arg0; local1086++) {
			for (local1125 = 0; local1125 < arg0; local1125++) {
				if (local1086 - arg0 / 2 >= local1125) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1177) int local1177;
		for (local1125 = arg0 - 1; local1125 >= 0; local1125--) {
			for (local1177 = 0; local1177 < arg0; local1177++) {
				if (local1125 - arg0 / 2 >= local1177) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1229) int local1229;
		for (local1177 = arg0 - 1; local1177 >= 0; local1177--) {
			for (local1229 = arg0 - 1; local1229 >= 0; local1229--) {
				if (local1229 <= local1177 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1270) int local1270;
		for (local1229 = 0; local1229 < arg0; local1229++) {
			for (local1270 = arg0 - 1; local1270 >= 0; local1270--) {
				if (local1229 - arg0 / 2 >= local1270) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1318) int local1318;
		for (local1270 = 0; local1270 < arg0; local1270++) {
			for (local1318 = 0; local1318 < arg0; local1318++) {
				if (local1318 >= local1270 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1365) int local1365;
		for (local1318 = arg0 - 1; local1318 >= 0; local1318--) {
			for (local1365 = 0; local1365 < arg0; local1365++) {
				if (local1365 >= local1318 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1414) int local1414;
		for (local1365 = arg0 - 1; local1365 >= 0; local1365--) {
			for (local1414 = arg0 - 1; local1414 >= 0; local1414--) {
				if (local1414 >= local1365 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1414 = 0; local1414 < arg0; local1414++) {
			for (@Pc(1463) int local1463 = arg0 - 1; local1463 >= 0; local1463--) {
				if (local1463 >= local1414 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)V")
	public static void method4687(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static192.aBoolean344) {
			Static192.aBoolean344 = arg0;
			Static124.method3068();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method4688() {
		if (Static315.aFrame2 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static350.aFrame3 == null) {
			local13 = Static212.aClass120_3.anApplet1;
		} else {
			local13 = Static350.aFrame3;
		}
		Static193.anInt4171 = local13.getSize().width;
		Static135.anInt3077 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static350.aFrame3 == local13) {
			local31 = Static350.aFrame3.getInsets();
			Static135.anInt3077 -= local31.top + local31.bottom;
			Static193.anInt4171 -= local31.right + local31.left;
		}
		if (Static11.method265() == 1) {
			Static23.anInt411 = (Static193.anInt4171 - 765) / 2;
			Static38.anInt832 = 503;
			Static74.anInt1655 = 0;
			Static202.anInt4258 = 765;
		} else if (Static161.anInt3644 < 96 && Static6.anInt1971 == 0) {
			@Pc(71) int local71 = Static193.anInt4171 <= 1024 ? Static193.anInt4171 : 1024;
			Static23.anInt411 = (Static193.anInt4171 - local71) / 2;
			@Pc(87) int local87 = Static135.anInt3077 <= 768 ? Static135.anInt3077 : 768;
			Static202.anInt4258 = local71;
			Static74.anInt1655 = 0;
			Static38.anInt832 = local87;
		} else {
			Static38.anInt832 = Static135.anInt3077;
			Static74.anInt1655 = 0;
			Static23.anInt411 = 0;
			Static202.anInt4258 = Static193.anInt4171;
		}
		if (Static306.anInt6192 != 0) {
			@Pc(129) boolean local129;
			if (Static202.anInt4258 < 1024 && Static38.anInt832 < 768) {
				local129 = true;
			} else {
				local129 = false;
			}
		}
		Static101.aCanvas8.setSize(Static202.anInt4258, Static38.anInt832);
		if (Static164.aClass92_7 != null) {
			Static164.aClass92_7.method4482();
		}
		if (local13 == Static350.aFrame3) {
			local31 = Static350.aFrame3.getInsets();
			Static101.aCanvas8.setLocation(Static23.anInt411 + local31.left, local31.top - -Static74.anInt1655);
		} else {
			Static101.aCanvas8.setLocation(Static23.anInt411, Static74.anInt1655);
		}
		if (Static310.anInt6220 != -1) {
			Static219.method3774(true);
		}
		Static72.method1360();
	}
}
