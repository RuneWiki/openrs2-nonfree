import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!fc;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lclient!fc;")
	public static Class21 aClass21_2;

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!jc;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Lclient!pb;")
	public static Class40 aClass40_7;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][105][105];

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
	public static final int anInt259 = 50;

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "[I")
	public static int[] anIntArray12 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_119 = Static34.method846("wishes to duel with you)3");

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array3 = new Class55[anInt259];

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
	public static int[] anIntArray13 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "[I")
	public static int[] anIntArray14 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "[I")
	public static int[] anIntArray15 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
	public static int anInt267 = 0;

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
	public static int anInt268 = -1;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
	public static int anInt270 = 0;

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "[I")
	public static int[] anIntArray16 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "[I")
	public static int[] anIntArray17 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
	public static int anInt275 = 0;

	@OriginalMember(owner = "client!bb", name = "Gb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_120 = aClass55_119;

	@OriginalMember(owner = "client!bb", name = "Ib", descriptor = "[I")
	public static int[] anIntArray18 = new int[anInt259];

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] method235() {
		@Pc(13) Class6_Sub2_Sub2_Sub2[] local13 = new Class6_Sub2_Sub2_Sub2[Static68.anInt2016];
		for (@Pc(15) int local15 = 0; local15 < Static68.anInt2016; local15++) {
			@Pc(25) Class6_Sub2_Sub2_Sub2 local25 = local13[local15] = new Class6_Sub2_Sub2_Sub2();
			local25.anInt992 = Static88.anInt3274;
			local25.anInt993 = Static94.anInt2642;
			local25.anInt990 = Static34.anIntArray80[local15];
			local25.anInt995 = Static94.anIntArray248[local15];
			local25.anInt994 = Static72.anIntArray195[local15];
			local25.anInt991 = Static38.anIntArray95[local15];
			@Pc(57) int local57 = local25.anInt991 * local25.anInt994;
			@Pc(61) byte[] local61 = Static67.aByteArrayArray6[local15];
			local25.anIntArray62 = new int[local57];
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				local25.anIntArray62[local67] = Static44.anIntArray257[local61[local67] & 0xFF];
			}
		}
		method238();
		return local13;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method238() {
		Static38.anIntArray95 = null;
		Static34.anIntArray80 = null;
		Static67.aByteArrayArray6 = null;
		Static72.anIntArray195 = null;
		Static94.anIntArray248 = null;
		Static44.anIntArray257 = null;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
	public static void method239() {
		aClass21_2 = null;
		aClass55Array3 = null;
		anIntArray16 = null;
		anIntArray13 = null;
		aClass40_7 = null;
		aClass32_1 = null;
		anIntArray15 = null;
		anIntArrayArrayArray1 = null;
		anIntArray17 = null;
		aClass21_1 = null;
		anIntArray14 = null;
		aClass55_119 = null;
		anIntArray12 = null;
		aClass55_120 = null;
		anIntArray18 = null;
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z")
	public static boolean method241() {
		if (Static19.aClass65_1 == null) {
			return false;
		}
		@Pc(175) int local175;
		try {
			@Pc(13) int local13 = Static19.aClass65_1.method2007();
			if (local13 == 0) {
				return false;
			}
			if (Static47.anInt1514 == -1) {
				Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, 1, 0);
				local13--;
				Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
				Static47.anInt1514 = Static13.aClass6_Sub1_Sub1_2.method1513();
				Static63.anInt1889 = Static51.anIntArray159[Static47.anInt1514];
			}
			if (Static63.anInt1889 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, 1, 0);
				Static63.anInt1889 = Static13.aClass6_Sub1_Sub1_2.aByteArray11[0] & 0xFF;
			}
			if (Static63.anInt1889 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, 2, 0);
				Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
				local13 -= 2;
				Static63.anInt1889 = Static13.aClass6_Sub1_Sub1_2.method1500();
			}
			if (local13 < Static63.anInt1889) {
				return false;
			}
			Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
			Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, Static63.anInt1889, 0);
			Static112.anInt3242 = Static51.anInt1597;
			Static55.anInt1706 = 0;
			Static51.anInt1597 = Static21.anInt1001;
			Static21.anInt1001 = Static47.anInt1514;
			if (Static47.anInt1514 == 50) {
				if (Static112.anInt3228 == 12) {
					Static63.aBoolean89 = true;
				}
				Static34.anInt1316 = Static13.aClass6_Sub1_Sub1_2.method1498();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 48) {
				Static47.method1019(true);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 84) {
				Static88.method2089();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 148) {
				@Pc(169) byte local169 = Static13.aClass6_Sub1_Sub1_2.method1471();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1466();
				Static68.anIntArray190[local175] = local169;
				if (Static11.anIntArray44[local175] != local169) {
					Static11.anIntArray44[local175] = local169;
					Static47.method1018(local175);
					if (Static39.anInt1691 != -1) {
						Static72.aBoolean99 = true;
					}
					Static63.aBoolean89 = true;
				}
				Static109.anInt3142 = Static85.anInt2389;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 2) {
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
				}
				Static67.aBoolean90 = false;
				Static34.aClass55_510 = Static34.aClass55_502;
				Static79.anInt2289 = 1;
				Static72.aBoolean99 = true;
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(242) int local242;
			if (Static47.anInt1514 == 77) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1500();
				Static112.method2069(local242);
				if (Static14.anInt804 != -1) {
					Static98.method1872(Static14.anInt804);
					Static63.aBoolean89 = true;
					Static79.aBoolean106 = true;
					Static14.anInt804 = -1;
				}
				if (Static76.anInt2217 != -1) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = -1;
					Static114.method2097(30);
				}
				if (Static24.anInt1098 != -1) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = -1;
				}
				if (Static13.anInt800 != -1) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = -1;
				}
				if (Static1.anInt3 != local242) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = local242;
				}
				Static67.anInt1986 = -1;
				Static54.method1156(Static1.anInt3);
				Static47.anInt1514 = -1;
				Static72.aBoolean99 = true;
				return true;
			}
			@Pc(317) long local317;
			if (Static47.anInt1514 == 150) {
				local317 = Static13.aClass6_Sub1_Sub1_2.method1470();
				@Pc(323) Class55 local323 = Static35.method865(Static13.aClass6_Sub1_Sub1_2).method1646();
				Static14.method510(Static50.method2085(local317).method1655(), 6, local323);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 186) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1486();
				Static79.aClass25_7 = Static102.aClass20_4.method723(local242);
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(375) Class6_Sub2_Sub14 local375;
			if (Static47.anInt1514 == 93) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1466();
				local375 = Static99.method1897(local242);
				Static47.anInt1514 = -1;
				local375.anInt2910 = 1;
				local375.anInt2930 = local175;
				return true;
			}
			if (Static47.anInt1514 == 240) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1468();
				if (Static39.anInt1691 != local242) {
					Static98.method1872(Static39.anInt1691);
					Static39.anInt1691 = local242;
				}
				Static72.aBoolean99 = true;
				Static54.method1156(Static39.anInt1691);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 96) {
				Static34.anInt1310 = Static13.aClass6_Sub1_Sub1_2.method1464();
				Static87.anInt2447 = Static13.aClass6_Sub1_Sub1_2.method1489();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 243) {
				Static87.anInt2447 = Static13.aClass6_Sub1_Sub1_2.method1464();
				Static34.anInt1310 = Static13.aClass6_Sub1_Sub1_2.method1464();
				while (Static63.anInt1889 > Static13.aClass6_Sub1_Sub1_2.anInt2209) {
					Static47.anInt1514 = Static13.aClass6_Sub1_Sub1_2.method1495();
					Static105.method1989();
				}
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(484) int local484;
			@Pc(594) int local594;
			@Pc(472) int local472;
			if (Static47.anInt1514 == 60) {
				local317 = Static13.aClass6_Sub1_Sub1_2.method1470();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1500();
				@Pc(482) Class55 local482 = Static50.method2085(local317).method1655();
				for (local484 = 0; local484 < Static64.anInt1912; local484++) {
					if (local317 == Static8.aLongArray1[local484]) {
						if (Static102.anIntArray286[local484] != local472) {
							Static102.anIntArray286[local484] = local472;
							Static63.aBoolean89 = true;
							if (local472 > 0) {
								Static14.method510(Static34.aClass55_502, 5, Static89.method1698(new Class55[] { local482, Static98.aClass55_1202 }));
							}
							if (local472 == 0) {
								Static14.method510(Static34.aClass55_502, 5, Static89.method1698(new Class55[] { local482, Static89.aClass55_1026 }));
							}
						}
						local482 = null;
						break;
					}
				}
				if (local482 != null && Static64.anInt1912 < 200) {
					Static8.aLongArray1[Static64.anInt1912] = local317;
					Static68.aClass55Array18[Static64.anInt1912] = local482;
					Static102.anIntArray286[Static64.anInt1912] = local472;
					Static64.anInt1912++;
					Static63.aBoolean89 = true;
				}
				@Pc(588) boolean local588 = false;
				while (!local588) {
					local588 = true;
					for (local594 = 0; local594 < Static64.anInt1912 - 1; local594++) {
						if (Static59.anInt1828 != Static102.anIntArray286[local594] && Static102.anIntArray286[local594 + 1] == Static59.anInt1828 || Static102.anIntArray286[local594] == 0 && Static102.anIntArray286[local594 + 1] != 0) {
							local588 = false;
							@Pc(638) int local638 = Static102.anIntArray286[local594];
							Static102.anIntArray286[local594] = Static102.anIntArray286[local594 + 1];
							Static102.anIntArray286[local594 + 1] = local638;
							@Pc(656) Class55 local656 = Static68.aClass55Array18[local594];
							Static68.aClass55Array18[local594] = Static68.aClass55Array18[local594 + 1];
							Static68.aClass55Array18[local594 + 1] = local656;
							@Pc(674) long local674 = Static8.aLongArray1[local594];
							Static8.aLongArray1[local594] = Static8.aLongArray1[local594 + 1];
							Static8.aLongArray1[local594 + 1] = local674;
							Static63.aBoolean89 = true;
						}
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 128) {
				Static97.aBoolean129 = true;
				Static51.anInt1598 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static32.anInt1216 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static17.anInt932 = Static13.aClass6_Sub1_Sub1_2.method1500();
				Static71.anInt2108 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static31.anInt1206 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (Static31.anInt1206 >= 100) {
					Static61.anInt1876 = Static32.anInt1216 * 128 + 64;
					Static94.anInt2650 = Static51.anInt1598 * 128 + 64;
					Static7.anInt291 = Static112.method2073(Static56.anInt1718, Static94.anInt2650, Static61.anInt1876) - Static17.anInt932;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 176) {
				if (Static14.anInt804 != -1) {
					Static98.method1872(Static14.anInt804);
					Static14.anInt804 = -1;
					Static63.aBoolean89 = true;
					Static79.aBoolean106 = true;
				}
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
					Static72.aBoolean99 = true;
				}
				if (Static76.anInt2217 != -1) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = -1;
					Static114.method2097(30);
				}
				if (Static24.anInt1098 != -1) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = -1;
				}
				if (Static13.anInt800 != -1) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = -1;
				}
				Static67.anInt1986 = -1;
				Static47.anInt1514 = -1;
				if (Static79.anInt2289 != 0) {
					Static72.aBoolean99 = true;
					Static79.anInt2289 = 0;
				}
				return true;
			}
			if (Static47.anInt1514 == 170) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1502();
				if (local242 == 65535) {
					local242 = -1;
				}
				Static72.method1430(local242);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 208) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1483();
				if (local242 == 65535) {
					local242 = -1;
				}
				Static106.method1599(local175, local242);
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(897) Class55 local897;
			if (Static47.anInt1514 == 152) {
				local897 = Static13.aClass6_Sub1_Sub1_2.method1461();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (local175 >= 1 && local175 <= 5) {
					if (local897.method1642(Static67.aClass55_789)) {
						local897 = null;
					}
					Static74.aClass55Array15[local175 - 1] = local897;
					Static71.aBooleanArray9[local175 - 1] = local472 == 0;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 78) {
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
				}
				Static79.anInt2289 = 2;
				Static47.anInt1514 = -1;
				Static34.aClass55_510 = Static34.aClass55_502;
				Static67.aBoolean90 = false;
				Static72.aBoolean99 = true;
				return true;
			}
			@Pc(1001) int local1001;
			if (Static47.anInt1514 == 226) {
				Static63.aBoolean89 = true;
				local242 = Static13.aClass6_Sub1_Sub1_2.method1464();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1462();
				Static77.anIntArray215[local175] = local472;
				Static90.anIntArray243[local175] = local242;
				Static96.anIntArray265[local175] = 1;
				for (local1001 = 0; local1001 < 98; local1001++) {
					if (Class6_Sub5.anIntArray57[local1001] <= local472) {
						Static96.anIntArray265[local175] = local1001 + 2;
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(1050) Class6_Sub2_Sub14 local1050;
			if (Static47.anInt1514 == 247) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1502();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1479();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1486();
				if (local242 == 65535) {
					local242 = -1;
				}
				local1050 = Static99.method1897(local472);
				if (local1050.aBoolean138) {
					local1050.anInt2871 = local242;
					local1050.anInt2929 = local175;
				} else if (local242 == -1) {
					Static47.anInt1514 = -1;
					local1050.anInt2910 = 0;
					return true;
				} else {
					@Pc(1068) Class6_Sub2_Sub5 local1068 = Static58.method1195(local242);
					local1050.anInt2888 = local1068.anInt1106;
					local1050.anInt2910 = 4;
					local1050.anInt2921 = local1068.anInt1105 * 100 / local175;
					local1050.anInt2930 = local242;
					local1050.anInt2896 = local1068.anInt1108;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 232) {
				Static12.anInt712 = Static63.anInt1889 / 8;
				for (local242 = 0; local242 < Static12.anInt712; local242++) {
					Static29.aLongArray3[local242] = Static13.aClass6_Sub1_Sub1_2.method1470();
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 74) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1464();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1502();
				if (local175 == 65535) {
					local175 = -1;
				}
				if (local175 != Static100.anIntArray277[local242]) {
					Static98.method1872(Static100.anIntArray277[local242]);
					Static100.anIntArray277[local242] = local175;
				}
				Static79.aBoolean106 = true;
				Static63.aBoolean89 = true;
				Static54.method1156(Static100.anIntArray277[local242]);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 86) {
				Static75.method1437();
				Static47.anInt1514 = -1;
				return false;
			}
			if (Static47.anInt1514 == 155) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1466();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1507();
				Static112.method2069(local175);
				if (local242 != -1) {
					Static112.method2069(local242);
				}
				if (Static13.anInt800 != -1) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = -1;
				}
				if (Static14.anInt804 != -1) {
					Static98.method1872(Static14.anInt804);
					Static14.anInt804 = -1;
				}
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
				}
				if (local175 != Static76.anInt2217) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = local175;
					Static114.method2097(35);
				}
				if (Static24.anInt1098 != local175) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = local242;
				}
				Static79.anInt2289 = 0;
				Static67.anInt1986 = -1;
				Static54.method1156(Static76.anInt2217);
				Static54.method1156(Static24.anInt1098);
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(1288) long local1288;
			if (Static47.anInt1514 == 139) {
				local317 = Static13.aClass6_Sub1_Sub1_2.method1470();
				local1288 = Static13.aClass6_Sub1_Sub1_2.method1500();
				@Pc(1290) boolean local1290 = false;
				@Pc(1295) long local1295 = (long) Static13.aClass6_Sub1_Sub1_2.method1483();
				local594 = Static13.aClass6_Sub1_Sub1_2.method1495();
				@Pc(1305) long local1305 = (local1288 << 32) + local1295;
				for (@Pc(1307) int local1307 = 0; local1307 < 100; local1307++) {
					if (Static105.aLongArray6[local1307] == local1305) {
						local1290 = true;
						break;
					}
				}
				if (local594 <= 1) {
					for (@Pc(1330) int local1330 = 0; local1330 < Static12.anInt712; local1330++) {
						if (Static29.aLongArray3[local1330] == local317) {
							local1290 = true;
							break;
						}
					}
				}
				if (!local1290 && Static91.anInt2553 == 0) {
					Static105.aLongArray6[Static49.anInt1572] = local1305;
					Static49.anInt1572 = (Static49.anInt1572 + 1) % 100;
					@Pc(1373) Class55 local1373 = Static35.method865(Static13.aClass6_Sub1_Sub1_2).method1646();
					if (local594 == 2 || local594 == 3) {
						Static14.method510(Static89.method1698(new Class55[] { Static34.aClass55_505, Static50.method2085(local317).method1655() }), 7, local1373);
					} else if (local594 == 1) {
						Static14.method510(Static89.method1698(new Class55[] { Static63.aClass55_750, Static50.method2085(local317).method1655() }), 7, local1373);
					} else {
						Static14.method510(Static50.method2085(local317).method1655(), 3, local1373);
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 22) {
				for (local242 = 0; local242 < Static92.anInt2558; local242++) {
					@Pc(1458) Class6_Sub2_Sub6 local1458 = Static43.method985(local242);
					if (local1458 != null && local1458.anInt1315 == 0) {
						Static68.anIntArray190[local242] = 0;
						Static11.anIntArray44[local242] = 0;
					}
				}
				Static47.anInt1514 = -1;
				Static63.aBoolean89 = true;
				if (Static39.anInt1691 != -1) {
					Static72.aBoolean99 = true;
				}
				return true;
			}
			if (Static47.anInt1514 == 252) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1479();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1494();
				local375 = Static99.method1897(local242);
				Static47.anInt1514 = -1;
				if (local175 != local375.anInt2908 || local175 == -1) {
					local375.anInt2927 = 0;
					local375.anInt2928 = 0;
					local375.anInt2908 = local175;
				}
				return true;
			}
			if (Static47.anInt1514 == 145) {
				Static112.anInt3228 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static63.aBoolean89 = true;
				Static47.anInt1514 = -1;
				Static79.aBoolean106 = true;
				return true;
			}
			if (Static47.anInt1514 == 16) {
				Static12.anInt717 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static112.anInt3231 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static41.anInt1399 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static29.aBoolean49 = true;
				Static47.anInt1514 = -1;
				Static72.aBoolean99 = true;
				return true;
			}
			if (Static47.anInt1514 == 18) {
				Static22.anInt1017 = Static13.aClass6_Sub1_Sub1_2.method1502();
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(1614) int local1614;
			if (Static47.anInt1514 == 95) {
				local897 = Static13.aClass6_Sub1_Sub1_2.method1461();
				@Pc(1612) boolean local1612;
				@Pc(1606) Class55 local1606;
				if (local897.method1666(Static4.aClass55_982)) {
					local1606 = local897.method1671(0, local897.method1645(Static13.aClass55_265));
					local1288 = local1606.method1639();
					local1612 = false;
					for (local1614 = 0; local1614 < Static12.anInt712; local1614++) {
						if (local1288 == Static29.aLongArray3[local1614]) {
							local1612 = true;
							break;
						}
					}
					if (!local1612 && Static91.anInt2553 == 0) {
						Static14.method510(local1606, 4, Static90.aClass55_1046);
					}
				} else if (local897.method1666(Static43.aClass55_560)) {
					local1606 = local897.method1671(0, local897.method1645(Static13.aClass55_265));
					local1288 = local1606.method1639();
					local1612 = false;
					for (local1614 = 0; local1614 < Static12.anInt712; local1614++) {
						if (local1288 == Static29.aLongArray3[local1614]) {
							local1612 = true;
							break;
						}
					}
					if (!local1612 && Static91.anInt2553 == 0) {
						Static14.method510(local1606, 8, aClass55_120);
					}
				} else if (local897.method1666(Static97.aClass55_1187)) {
					local1606 = local897.method1671(0, local897.method1645(Static13.aClass55_265));
					local1288 = local1606.method1639();
					local1612 = false;
					for (local1614 = 0; local1614 < Static12.anInt712; local1614++) {
						if (Static29.aLongArray3[local1614] == local1288) {
							local1612 = true;
							break;
						}
					}
					if (!local1612 && Static91.anInt2553 == 0) {
						@Pc(1720) Class55 local1720 = local897.method1671(local897.method1645(Static13.aClass55_265) + 1, local897.method1674() - 9);
						Static14.method510(local1606, 8, local1720);
					}
				} else {
					Static14.method510(Static34.aClass55_502, 0, local897);
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 217 || Static47.anInt1514 == 218 || Static47.anInt1514 == 221 || Static47.anInt1514 == 103 || Static47.anInt1514 == 172 || Static47.anInt1514 == 23 || Static47.anInt1514 == 214 || Static47.anInt1514 == 134 || Static47.anInt1514 == 75 || Static47.anInt1514 == 36 || Static47.anInt1514 == 59) {
				Static105.method1989();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 69) {
				Static89.anInt2485 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 180) {
				Static92.anInt2560 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 238) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1502();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local375 = Static99.method1897(local175);
				if (local375 != null && local375.anInt2890 == 0) {
					if (local242 < 0) {
						local242 = 0;
					}
					if (local375.anInt2919 - local375.anInt2875 < local242) {
						local242 = local375.anInt2919 - local375.anInt2875;
					}
					local375.anInt2905 = local242;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 250) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1503();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local1050 = Static99.method1897(local175);
				local1050.anInt2883 = (local242 << 16) + local472;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 177) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1502();
				Static112.method2069(local242);
				if (Static14.anInt804 != -1) {
					Static98.method1872(Static14.anInt804);
					Static14.anInt804 = -1;
					Static63.aBoolean89 = true;
					Static79.aBoolean106 = true;
				}
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
					Static72.aBoolean99 = true;
				}
				if (Static76.anInt2217 != -1) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = -1;
					Static114.method2097(30);
				}
				if (Static24.anInt1098 != -1) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = -1;
				}
				if (local242 != Static13.anInt800) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = local242;
				}
				Static67.anInt1986 = -1;
				if (Static79.anInt2289 != 0) {
					Static79.anInt2289 = 0;
					Static72.aBoolean99 = true;
				}
				Static54.method1156(Static13.anInt800);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 39) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1486();
				Static68.anIntArray190[local242] = local175;
				if (local175 != Static11.anIntArray44[local242]) {
					Static11.anIntArray44[local242] = local175;
					Static47.method1018(local242);
					Static63.aBoolean89 = true;
					if (Static39.anInt1691 != -1) {
						Static72.aBoolean99 = true;
					}
				}
				Static47.anInt1514 = -1;
				Static109.anInt3142 = Static85.anInt2389;
				return true;
			}
			if (Static47.anInt1514 == 57) {
				Static71.anInt2107 = Static13.aClass6_Sub1_Sub1_2.method1489();
				Static47.anInt1514 = -1;
				if (Static112.anInt3228 == Static71.anInt2107) {
					Static63.aBoolean89 = true;
					if (Static71.anInt2107 == 3) {
						Static112.anInt3228 = 1;
					} else {
						Static112.anInt3228 = 3;
					}
				}
				return true;
			}
			if (Static47.anInt1514 == 205) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1500();
				Static101.method1935(local242, local472, local175);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 229) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local1001 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static91.aBooleanArray10[local242] = true;
				Static63.anIntArray184[local242] = local175;
				Static94.anIntArray249[local242] = local472;
				Static98.anIntArray266[local242] = local1001;
				Static85.anIntArray236[local242] = 0;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 200) {
				Static70.anInt2072 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static47.anInt1514 = -1;
				Static63.aBoolean89 = true;
				return true;
			}
			if (Static47.anInt1514 == 123) {
				Static19.anInt945 = Static13.aClass6_Sub1_Sub1_2.method1466() * 30;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 188) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1500();
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
					Static72.aBoolean99 = true;
				}
				if (Static76.anInt2217 != -1) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = -1;
					Static114.method2097(30);
				}
				if (Static24.anInt1098 != -1) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = -1;
				}
				if (Static13.anInt800 != local242) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = local242;
				}
				if (local175 != Static14.anInt804) {
					Static98.method1872(Static14.anInt804);
					Static14.anInt804 = local175;
				}
				Static79.aBoolean106 = true;
				Static63.aBoolean89 = true;
				Static67.anInt1986 = -1;
				if (Static79.anInt2289 != 0) {
					Static72.aBoolean99 = true;
					Static79.anInt2289 = 0;
				}
				Static54.method1156(Static13.anInt800);
				Static54.method1156(Static14.anInt804);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 52) {
				Static63.aBoolean89 = true;
				local242 = Static13.aClass6_Sub1_Sub1_2.method1503();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1500();
				if (local242 >= 0) {
					local375 = Static99.method1897(local242);
				} else {
					local375 = null;
				}
				while (Static13.aClass6_Sub1_Sub1_2.anInt2209 < Static63.anInt1889) {
					local1001 = Static13.aClass6_Sub1_Sub1_2.method1465();
					local1614 = 0;
					local484 = Static13.aClass6_Sub1_Sub1_2.method1500();
					if (local484 != 0) {
						local1614 = Static13.aClass6_Sub1_Sub1_2.method1495();
						if (local1614 == 255) {
							local1614 = Static13.aClass6_Sub1_Sub1_2.method1503();
						}
					}
					if (local375 != null && local1001 >= 0 && local1001 < local375.anIntArray267.length) {
						local375.anIntArray267[local1001] = local484;
						local375.anIntArray268[local1001] = local1614;
					}
					Static95.method1836(local1614, local1001, local175, local484 - 1);
				}
				Static57.anInt1730 = Static85.anInt2389;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 113) {
				Static63.aBoolean89 = true;
				local242 = Static13.aClass6_Sub1_Sub1_2.method1503();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1500();
				if (local242 >= 0) {
					local375 = Static99.method1897(local242);
				} else {
					local375 = null;
				}
				if (local375 != null) {
					for (local1001 = 0; local1001 < local375.anIntArray267.length; local1001++) {
						local375.anIntArray267[local1001] = 0;
						local375.anIntArray268[local1001] = 0;
					}
				}
				Static114.method2095(local175);
				local1001 = Static13.aClass6_Sub1_Sub1_2.method1500();
				for (local484 = 0; local484 < local1001; local484++) {
					local1614 = Static13.aClass6_Sub1_Sub1_2.method1489();
					if (local1614 == 255) {
						local1614 = Static13.aClass6_Sub1_Sub1_2.method1462();
					}
					local594 = Static13.aClass6_Sub1_Sub1_2.method1466();
					if (local375 != null && local375.anIntArray267.length > local484) {
						local375.anIntArray267[local484] = local594;
						local375.anIntArray268[local484] = local1614;
					}
					Static95.method1836(local1614, local484, local175, local594 - 1);
				}
				Static57.anInt1730 = Static85.anInt2389;
				Static47.anInt1514 = -1;
				return true;
			}
			@Pc(2543) Class6_Sub2_Sub14 local2543;
			if (Static47.anInt1514 == 143) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local2543 = Static99.method1897(local242);
				for (local472 = 0; local472 < local2543.anIntArray267.length; local472++) {
					local2543.anIntArray267[local472] = -1;
					local2543.anIntArray267[local472] = 0;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 97) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1479();
				local2543 = Static99.method1897(local242);
				local2543.anInt2910 = 3;
				local2543.anInt2930 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass8_1.method329();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 207) {
				Static34.anInt1310 = Static13.aClass6_Sub1_Sub1_2.method1464();
				Static87.anInt2447 = Static13.aClass6_Sub1_Sub1_2.method1495();
				for (local242 = Static34.anInt1310; local242 < Static34.anInt1310 + 8; local242++) {
					for (local175 = Static87.anInt2447; local175 < Static87.anInt2447 + 8; local175++) {
						if (Static105.aClass3ArrayArrayArray1[Static56.anInt1718][local242][local175] != null) {
							Static105.aClass3ArrayArrayArray1[Static56.anInt1718][local242][local175] = null;
							Static68.method1377(local175, local242);
						}
					}
				}
				for (@Pc(2657) Class6_Sub12 local2657 = (Class6_Sub12) Static109.aClass3_12.method31(); local2657 != null; local2657 = (Class6_Sub12) Static109.aClass3_12.method26()) {
					if (Static34.anInt1310 <= local2657.anInt2388 && local2657.anInt2388 < Static34.anInt1310 + 8 && Static87.anInt2447 <= local2657.anInt2385 && local2657.anInt2385 < Static87.anInt2447 + 8 && Static56.anInt1718 == local2657.anInt2393) {
						local2657.anInt2382 = 0;
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 212) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1502();
				local472 = local175 >> 10 & 0x1F;
				local1001 = local175 >> 5 & 0x1F;
				local484 = local175 & 0x1F;
				@Pc(2748) Class6_Sub2_Sub14 local2748 = Static99.method1897(local242);
				Static47.anInt1514 = -1;
				local2748.anInt2894 = (local472 << 19) + (local1001 << 11) + (local484 << 3);
				return true;
			}
			if (Static47.anInt1514 == 56) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1466();
				Static112.method2069(local242);
				if (Static1.anInt3 != -1) {
					Static98.method1872(Static1.anInt3);
					Static1.anInt3 = -1;
					Static72.aBoolean99 = true;
				}
				if (Static76.anInt2217 != -1) {
					Static98.method1872(Static76.anInt2217);
					Static76.anInt2217 = -1;
					Static114.method2097(30);
				}
				if (Static24.anInt1098 != -1) {
					Static98.method1872(Static24.anInt1098);
					Static24.anInt1098 = -1;
				}
				if (Static13.anInt800 != -1) {
					Static98.method1872(Static13.anInt800);
					Static13.anInt800 = -1;
				}
				if (Static14.anInt804 != local242) {
					Static98.method1872(Static14.anInt804);
					Static14.anInt804 = local242;
				}
				Static63.aBoolean89 = true;
				Static67.anInt1986 = -1;
				if (Static79.anInt2289 != 0) {
					Static79.anInt2289 = 0;
					Static72.aBoolean99 = true;
				}
				Static79.aBoolean106 = true;
				Static54.method1156(Static14.anInt804);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 68) {
				Static70.method1406(Static13.aClass6_Sub1_Sub1_2, Static102.aClass20_4, Static63.anInt1889);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 29) {
				for (local242 = 0; local242 < Static11.anIntArray44.length; local242++) {
					if (Static68.anIntArray190[local242] != Static11.anIntArray44[local242]) {
						Static11.anIntArray44[local242] = Static68.anIntArray190[local242];
						Static47.method1018(local242);
						Static63.aBoolean89 = true;
					}
				}
				Static109.anInt3142 = Static85.anInt2389;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 47) {
				Static97.aBoolean129 = false;
				for (local242 = 0; local242 < 5; local242++) {
					Static91.aBooleanArray10[local242] = false;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 5) {
				for (local242 = 0; local242 < Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3.length; local242++) {
					if (Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local242] != null) {
						Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local242].anInt2717 = -1;
					}
				}
				for (local175 = 0; local175 < Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1.length; local175++) {
					if (Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local175] != null) {
						Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[local175].anInt2717 = -1;
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 244) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1466();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local375 = Static99.method1897(local175);
				local375.anInt2910 = 2;
				Static47.anInt1514 = -1;
				local375.anInt2930 = local242;
				return true;
			}
			if (Static47.anInt1514 == 28) {
				Static47.anInt1514 = -1;
				Static8.anInt378 = 0;
				return true;
			}
			if (Static47.anInt1514 == 171) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1497();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1498();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1462();
				local1050 = Static99.method1897(local472);
				Static47.anInt1514 = -1;
				local1050.anInt2889 = local242 + local1050.anInt2876;
				local1050.anInt2918 = local175 + local1050.anInt2911;
				return true;
			}
			if (Static47.anInt1514 == 31) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1466();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local1001 = Static13.aClass6_Sub1_Sub1_2.method1462();
				@Pc(3078) Class6_Sub2_Sub14 local3078 = Static99.method1897(local1001);
				local3078.anInt2888 = local242;
				local3078.anInt2896 = local175;
				local3078.anInt2921 = local472;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 248) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1502();
				Static15.method540(local242);
				Static57.anInt1730 = Static85.anInt2389;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 43) {
				Static47.method1019(false);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 201) {
				if (Static112.anInt3228 == 12) {
					Static63.aBoolean89 = true;
				}
				Static29.anInt1153 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 9) {
				Static65.method1343();
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 35) {
				Static110.anInt3147 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (Static110.anInt3147 == 1) {
					Static65.anInt1945 = Static13.aClass6_Sub1_Sub1_2.method1500();
				}
				if (Static110.anInt3147 >= 2 && Static110.anInt3147 <= 6) {
					if (Static110.anInt3147 == 2) {
						Static34.anInt1313 = 64;
						Static51.anInt1591 = 64;
					}
					if (Static110.anInt3147 == 3) {
						Static34.anInt1313 = 0;
						Static51.anInt1591 = 64;
					}
					if (Static110.anInt3147 == 4) {
						Static51.anInt1591 = 64;
						Static34.anInt1313 = 128;
					}
					if (Static110.anInt3147 == 5) {
						Static51.anInt1591 = 0;
						Static34.anInt1313 = 64;
					}
					if (Static110.anInt3147 == 6) {
						Static34.anInt1313 = 64;
						Static51.anInt1591 = 128;
					}
					Static110.anInt3147 = 2;
					Static51.anInt1586 = Static13.aClass6_Sub1_Sub1_2.method1500();
					Static35.anInt1333 = Static13.aClass6_Sub1_Sub1_2.method1500();
					Static18.anInt936 = Static13.aClass6_Sub1_Sub1_2.method1495();
				}
				if (Static110.anInt3147 == 10) {
					Static110.anInt3152 = Static13.aClass6_Sub1_Sub1_2.method1500();
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 157) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1497();
				if (local242 >= 0) {
					Static112.method2069(local242);
				}
				if (Static4.anInt2356 != local242) {
					Static98.method1872(Static4.anInt2356);
					Static4.anInt2356 = local242;
				}
				Static54.method1156(Static4.anInt2356);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 151) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1464();
				local472 = Static13.aClass6_Sub1_Sub1_2.method1505();
				Static56.anInt1718 = local175 >> 1;
				Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method1832(local472, (local175 & 0x1) == 1, local242);
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 92) {
				Static97.aBoolean129 = true;
				Static47.anInt1520 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static29.anInt1151 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static4.anInt2357 = Static13.aClass6_Sub1_Sub1_2.method1500();
				Static109.anInt3140 = Static13.aClass6_Sub1_Sub1_2.method1495();
				Static43.anInt1467 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (Static43.anInt1467 >= 100) {
					local175 = Static29.anInt1151 * 128 + 64;
					local242 = Static47.anInt1520 * 128 + 64;
					local472 = Static112.method2073(Static56.anInt1718, local242, local175) - Static4.anInt2357;
					local1001 = local242 - Static94.anInt2650;
					local484 = local472 - Static7.anInt291;
					local1614 = local175 - Static61.anInt1876;
					local594 = (int) Math.sqrt((double) (local1001 * local1001 + local1614 * local1614));
					Static81.anInt2299 = (int) (Math.atan2((double) local484, (double) local594) * 325.949D) & 0x7FF;
					Static3.anInt27 = (int) (-325.949D * Math.atan2((double) local1001, (double) local1614)) & 0x7FF;
					if (Static81.anInt2299 < 128) {
						Static81.anInt2299 = 128;
					}
					if (Static81.anInt2299 > 383) {
						Static81.anInt2299 = 383;
					}
				}
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 253) {
				local242 = Static13.aClass6_Sub1_Sub1_2.method1503();
				@Pc(3441) boolean local3441 = Static13.aClass6_Sub1_Sub1_2.method1464() == 1;
				local375 = Static99.method1897(local242);
				local375.aBoolean139 = local3441;
				Static47.anInt1514 = -1;
				return true;
			}
			if (Static47.anInt1514 == 37) {
				local897 = Static13.aClass6_Sub1_Sub1_2.method1461();
				local175 = Static13.aClass6_Sub1_Sub1_2.method1486();
				local375 = Static99.method1897(local175);
				local375.aClass55_1223 = local897;
				if (local175 >> 16 == Static100.anIntArray277[Static112.anInt3228]) {
					Static63.aBoolean89 = true;
				}
				Static47.anInt1514 = -1;
				return true;
			}
			Static15.method544("T1 - " + Static47.anInt1514 + "," + Static51.anInt1597 + "," + Static112.anInt3242 + " - " + Static63.anInt1889, null);
			Static75.method1437();
		} catch (@Pc(3517) IOException local3517) {
			Static91.method1745();
		} catch (@Pc(3523) Exception local3523) {
			@Pc(3564) String local3564 = "T2 - " + Static47.anInt1514 + "," + Static51.anInt1597 + "," + Static112.anInt3242 + " - " + Static63.anInt1889 + "," + (Static18.anInt938 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0]) + "," + (Static88.anInt3276 + Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0]) + " - ";
			for (local175 = 0; local175 < Static63.anInt1889 && local175 < 50; local175++) {
				local3564 = local3564 + Static13.aClass6_Sub1_Sub1_2.aByteArray11[local175] + ",";
			}
			Static15.method544(local3564, local3523);
			Static75.method1437();
		}
		return true;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	public static void method242() {
		Static12.aClass38_8 = new Class38(32);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!pb;I)I")
	public static int method244(@OriginalArg(0) Class40 arg0) {
		@Pc(11) int local11 = 0;
		if (arg0.method1232(Static86.aClass55_1001, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static92.aClass55_1098, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static59.aClass55_702, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static69.aClass55_810, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static97.aClass55_1194, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static44.aClass55_1166, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static66.aClass55_783, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static50.aClass55_1365, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static20.aClass55_347, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static79.aClass55_922, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static114.aClass55_1381, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static71.aClass55_857, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static90.aClass55_1044, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static45.aClass55_565, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static107.aClass55_1301, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static11.aClass55_254, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static11.aClass55_257, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static74.aClass55_693, Static45.aClass55_564)) {
			local11++;
		}
		if (arg0.method1232(Static4.aClass55_983, Static45.aClass55_564)) {
			local11++;
		}
		return local11;
	}
}
