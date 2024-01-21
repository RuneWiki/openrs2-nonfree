import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dd", name = "eb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!dd", name = "sb", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!dd", name = "xb", descriptor = "Lclient!ge;")
	public static Class7 aClass7_15;

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "[Lclient!he;")
	public static Class31[] aClass31Array1 = new Class31[50];

	@OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!dd", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_489 = Static80.method1463("compass");

	@OriginalMember(owner = "client!dd", name = "lb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_490 = Static80.method1463("null");

	@OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
	public static int anInt821 = 500;

	@OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_491 = Static80.method1463("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!dd", name = "wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_492 = Static80.method1463("p11_full");

	@OriginalMember(owner = "client!dd", name = "yb", descriptor = "I")
	public static volatile int anInt829 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZJ)Lclient!rd;")
	public static Class63 method578(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(46) byte[] local46 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local30--;
				local46[local30] = Static97.aByteArray32[(int) (local50 - arg0 * 37L)];
			}
			@Pc(77) Class63 local77 = new Class63();
			local77.aByteArray33 = local46;
			local77.anInt2746 = local46.length;
			return local77;
		}
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public static void method579() {
		if (Static18.aClass6_Sub3_Sub17_2 == null) {
			return;
		}
		@Pc(9) Class6_Sub3_Sub17 local9 = Static18.aClass6_Sub3_Sub17_2;
		@Pc(13) Class6_Sub3_Sub17 local13 = Static49.method1038(local9);
		if (local13 == null) {
			Static18.aClass6_Sub3_Sub17_2 = null;
			return;
		}
		Static100.anInt2794++;
		@Pc(26) int[] local26 = Static20.method508(local13);
		@Pc(30) int[] local30 = Static20.method508(local9);
		@Pc(35) int local35 = Static59.anInt1768 - Static40.anInt2117;
		@Pc(40) int local40 = Static102.anInt2823 - Static79.anInt2159;
		if (local40 <= local9.anInt3278 && local40 >= -local9.anInt3278 && local35 <= local9.anInt3278 && local35 >= -local9.anInt3278 && !Static93.aBoolean139) {
			local35 = 0;
			local40 = 0;
		} else if (local9.anInt3266 < Static100.anInt2794 || Static93.aBoolean139) {
			Static93.aBoolean139 = true;
		} else {
			local35 = 0;
			local40 = 0;
		}
		@Pc(104) int local104 = local30[0] + local40 - local26[0];
		if (local104 < 0) {
			local104 = 0;
		}
		@Pc(119) int local119 = local35 + local30[1] - local26[1];
		if (local119 < 0) {
			local119 = 0;
		}
		if (local13.anInt3230 < local9.anInt3230 + local104) {
			local104 = local13.anInt3230 - local9.anInt3230;
		}
		if (local9.anInt3264 + local119 > local13.anInt3264) {
			local119 = local13.anInt3264 - local9.anInt3264;
		}
		if (Static18.aClass6_Sub3_Sub17_2.anObjectArray20 != null && Static93.aBoolean139) {
			Static99.method1836(local9.anObjectArray20, local9, 0, local119, null, local104);
		}
		if (Static47.anInt1499 != 0) {
			return;
		}
		if (Static93.aBoolean139) {
			@Pc(179) int local179 = Static102.anInt2823 - local26[0];
			if (local179 < 0) {
				local179 = 0;
			}
			if (local179 > local13.anInt3230 - 1) {
				local179 = local13.anInt3230 - 1;
			}
			@Pc(207) int local207 = Static59.anInt1768 - local26[1];
			if (local207 < 0) {
				local207 = 0;
			}
			if (local207 > local13.anInt3264 - 1) {
				local207 = local13.anInt3264 - 1;
			}
			@Pc(236) Class6_Sub3_Sub17 local236 = Static110.method2041(local207, local9, local13, local179);
			if (Static18.aClass6_Sub3_Sub17_2.anObjectArray12 != null) {
				Static99.method1836(local9.anObjectArray12, local9, 0, local119, local236, local104);
			}
			if (local236 != null && Static44.method970(local9) != null) {
				Static23.aClass6_Sub4_Sub1_4.method1347(22);
				Static23.aClass6_Sub4_Sub1_4.method1322(local236.anInt3233);
				Static23.aClass6_Sub4_Sub1_4.method1332(local9.anInt3283);
				Static23.aClass6_Sub4_Sub1_4.method1298(local236.anInt3283);
				Static23.aClass6_Sub4_Sub1_4.method1292(local9.anInt3233);
			}
		} else {
			if (Static18.aClass6_Sub3_Sub17_2.anObjectArray21 != null) {
				Static99.method1836(local9.anObjectArray21, local9, 0, local119, null, local104);
			}
			if ((Static39.anInt1244 == 1 || Static53.method2061(Static18.anInt569 - 1)) && Static18.anInt569 > 2) {
				Static10.method267();
			} else if (Static18.anInt569 > 0) {
				Static37.method874(Static18.anInt569 - 1);
			}
		}
		Static18.aClass6_Sub3_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method581(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static14.aBooleanArray3[arg0]) {
			return;
		}
		Static47.aClass7_26.method97(arg0);
		if (Static68.aClass6_Sub3_Sub17ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < Static68.aClass6_Sub3_Sub17ArrayArray1[arg0].length; local30++) {
			if (Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local30] != null) {
				if (Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local30].anInt3284 == 2) {
					local28 = false;
				} else {
					Static68.aClass6_Sub3_Sub17ArrayArray1[arg0][local30] = null;
				}
			}
		}
		if (local28) {
			Static68.aClass6_Sub3_Sub17ArrayArray1[arg0] = null;
		}
		Static14.aBooleanArray3[arg0] = false;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
	public static void method584() {
		for (@Pc(17) Class6_Sub18 local17 = (Class6_Sub18) Static39.aClass1_3.method3(); local17 != null; local17 = (Class6_Sub18) Static39.aClass1_3.method14()) {
			if (local17.anInt3016 > 0) {
				local17.anInt3016--;
			}
			if (local17.anInt3016 != 0) {
				if (local17.anInt3024 > 0) {
					local17.anInt3024--;
				}
				if (local17.anInt3024 == 0 && local17.anInt3020 >= 1 && local17.anInt3018 >= 1 && local17.anInt3020 <= 102 && local17.anInt3018 <= 102 && (local17.anInt3017 < 0 || Static111.method2044(local17.anInt3017, local17.anInt3026))) {
					Static89.method1605(local17.anInt3030, local17.anInt3031, local17.anInt3020, local17.anInt3026, local17.anInt3017, local17.anInt3029, local17.anInt3018);
					local17.anInt3024 = -1;
					if (local17.anInt3023 == local17.anInt3017 && local17.anInt3023 == -1) {
						local17.method2123();
					} else if (local17.anInt3017 == local17.anInt3023 && local17.anInt3028 == local17.anInt3029 && local17.anInt3026 == local17.anInt3025) {
						local17.method2123();
					}
				}
			} else if (local17.anInt3023 < 0 || Static111.method2044(local17.anInt3023, local17.anInt3025)) {
				Static89.method1605(local17.anInt3030, local17.anInt3031, local17.anInt3020, local17.anInt3025, local17.anInt3023, local17.anInt3028, local17.anInt3018);
				local17.method2123();
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
	public static void method585() {
		aClass63_492 = null;
		aFrame1 = null;
		anImage1 = null;
		aClass63_489 = null;
		aClass63_491 = null;
		aClass7_Sub1_5 = null;
		aClass31Array1 = null;
		aClass7_15 = null;
		aClass63_490 = null;
	}

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V")
	public static void method586() {
		if (Static92.aBoolean135) {
			Static44.method959();
			Static92.aBoolean135 = false;
			Static119.method2120();
			Static96.aBoolean146 = true;
			Static10.aBoolean20 = true;
			Static12.aBoolean22 = true;
			Static15.aBoolean29 = true;
		}
		Static10.method266();
		if (Static12.aBoolean23 && Static19.anInt634 == 1) {
			Static10.aBoolean20 = true;
		}
		@Pc(37) boolean local37;
		if (Static25.anInt847 != -1) {
			local37 = Static84.method1571(Static25.anInt847);
			if (local37) {
				Static10.aBoolean20 = true;
			}
		}
		if (Static112.anInt3090 == 2) {
			Static10.aBoolean20 = true;
		}
		if (Static38.anInt1235 == 2) {
			Static10.aBoolean20 = true;
		}
		if (Static10.aBoolean20) {
			Static10.aBoolean20 = false;
			Static15.method377();
		}
		@Pc(102) int local102;
		if (Static49.anInt1513 == -1) {
			Static54.aClass6_Sub3_Sub17_4.anInt3291 = Static20.anInt652 - Static111.anInt3048 - 77;
			if (Static102.anInt2823 > 17 && Static102.anInt2823 < 560 && Static59.anInt1768 > 332) {
				Static80.method1466(Static54.aClass6_Sub3_Sub17_4, Static20.anInt652, -1, Static59.anInt1768 - 357, 0, 463, 77, Static102.anInt2823 - 17);
			}
			local102 = Static20.anInt652 - Static54.aClass6_Sub3_Sub17_4.anInt3291 - 77;
			if (local102 < 0) {
				local102 = 0;
			}
			if (local102 > Static20.anInt652 - 77) {
				local102 = Static20.anInt652 - 77;
			}
			if (local102 != Static111.anInt3048) {
				Static111.anInt3048 = local102;
				Static15.aBoolean29 = true;
			}
		}
		if (Static49.anInt1513 == -1 && Static70.anInt2011 == 3) {
			local102 = Static94.anInt2625 * 14 + 7;
			Static54.aClass6_Sub3_Sub17_4.anInt3291 = Static112.anInt3092;
			if (Static102.anInt2823 > 17 && Static102.anInt2823 < 560 && Static59.anInt1768 > 332) {
				Static80.method1466(Static54.aClass6_Sub3_Sub17_4, local102, -1, Static59.anInt1768 - 357, 0, 463, 77, Static102.anInt2823 - 17);
			}
			@Pc(172) int local172 = Static54.aClass6_Sub3_Sub17_4.anInt3291;
			if (local172 < 0) {
				local172 = 0;
			}
			if (local102 - 77 < local172) {
				local172 = local102 - 77;
			}
			if (local172 != Static112.anInt3092) {
				Static112.anInt3092 = local172;
				Static15.aBoolean29 = true;
			}
		}
		if (Static49.anInt1513 != -1) {
			local37 = Static84.method1571(Static49.anInt1513);
			if (local37) {
				Static15.aBoolean29 = true;
			}
		}
		if (Static112.anInt3090 == 3) {
			Static15.aBoolean29 = true;
		}
		if (Static38.anInt1235 == 3) {
			Static15.aBoolean29 = true;
		}
		if (Static2.aClass63_14 != null) {
			Static15.aBoolean29 = true;
		}
		if (Static12.aBoolean23 && Static19.anInt634 == 2) {
			Static15.aBoolean29 = true;
		}
		if (Static15.aBoolean29) {
			Static15.aBoolean29 = false;
			Static37.method872();
		}
		Static102.method1856();
		if (Static21.anInt685 != -1) {
			Static12.aBoolean22 = true;
		}
		if (Static12.aBoolean22) {
			if (Static21.anInt685 != -1 && Static21.anInt685 == Static86.anInt2366) {
				Static21.anInt685 = -1;
				Static23.aClass6_Sub4_Sub1_4.method1347(202);
				Static23.aClass6_Sub4_Sub1_4.method1330(Static86.anInt2366);
			}
			Static51.aBoolean77 = true;
			Static12.aBoolean22 = false;
			Static64.method1204(Static111.anIntArray352, Static73.anInt2064 % 20 >= 10 ? Static21.anInt685 : -1, Static25.anInt847 == -1, Static86.anInt2366);
		}
		if (Static96.aBoolean146) {
			Static51.aBoolean77 = true;
			Static96.aBoolean146 = false;
			Static123.method2164(Static68.anInt1974, Static38.anInt1233, Static15.anInt494, Static48.aClass6_Sub3_Sub3_Sub1_2);
		}
		Static101.method1852(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319, Static101.anInt2810, Static68.anInt1973, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347);
		Static68.anInt1973 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "(I)V")
	public static void method587() {
		try {
			if (Static120.anInt3290 == 0) {
				if (Static100.aClass47_4 != null) {
					Static100.aClass47_4.method1378();
					Static100.aClass47_4 = null;
				}
				Static120.anInt3290 = 1;
				Static48.anInt1509 = 0;
				Static71.aClass20_7 = null;
				Static73.aBoolean110 = false;
			}
			if (Static120.anInt3290 == 1) {
				if (Static71.aClass20_7 == null) {
					Static71.aClass20_7 = Static4.aClass8_1.method141(Static2.anInt22);
				}
				if (Static71.aClass20_7.anInt931 == 2) {
					throw new IOException();
				}
				if (Static71.aClass20_7.anInt931 == 1) {
					Static100.aClass47_4 = new Class47((Socket) Static71.aClass20_7.anObject2, Static4.aClass8_1);
					Static71.aClass20_7 = null;
					Static120.anInt3290 = 2;
				}
			}
			if (Static120.anInt3290 == 2) {
				@Pc(67) long local67 = Static78.aLong53 = Static49.aClass63_805.method1823();
				Static23.aClass6_Sub4_Sub1_4.anInt1949 = 0;
				Static23.aClass6_Sub4_Sub1_4.method1330(14);
				@Pc(81) int local81 = (int) (local67 >> 16 & 0x1FL);
				Static23.aClass6_Sub4_Sub1_4.method1330(local81);
				Static100.aClass47_4.method1377(2, Static23.aClass6_Sub4_Sub1_4.aByteArray27);
				Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
				Static120.anInt3290 = 3;
			}
			@Pc(114) int local114;
			if (Static120.anInt3290 == 3) {
				if (Static54.aClass10_1 != null) {
					Static54.aClass10_1.method1715();
				}
				if (Static97.aClass10_2 != null) {
					Static97.aClass10_2.method1715();
				}
				local114 = Static100.aClass47_4.method1375();
				if (Static54.aClass10_1 != null) {
					Static54.aClass10_1.method1715();
				}
				if (Static97.aClass10_2 != null) {
					Static97.aClass10_2.method1715();
				}
				if (local114 != 0) {
					Static1.method16(local114);
					return;
				}
				Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
				Static120.anInt3290 = 4;
			}
			if (Static120.anInt3290 == 4) {
				if (Static88.aClass6_Sub4_Sub1_5.anInt1949 < 8) {
					local114 = Static100.aClass47_4.method1380();
					if (local114 > 8 - Static88.aClass6_Sub4_Sub1_5.anInt1949) {
						local114 = 8 - Static88.aClass6_Sub4_Sub1_5.anInt1949;
					}
					if (local114 > 0) {
						Static100.aClass47_4.method1379(local114, Static88.aClass6_Sub4_Sub1_5.aByteArray27, Static88.aClass6_Sub4_Sub1_5.anInt1949);
						Static88.aClass6_Sub4_Sub1_5.anInt1949 += local114;
					}
				}
				if (Static88.aClass6_Sub4_Sub1_5.anInt1949 == 8) {
					Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
					Static115.aLong89 = Static88.aClass6_Sub4_Sub1_5.method1301();
					Static120.anInt3290 = 5;
				}
			}
			if (Static120.anInt3290 == 5) {
				Static23.aClass6_Sub4_Sub1_4.anInt1949 = 0;
				@Pc(206) int[] local206 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static115.aLong89 >> 32), (int) Static115.aLong89 };
				Static23.aClass6_Sub4_Sub1_4.method1330(10);
				Static23.aClass6_Sub4_Sub1_4.method1292(local206[0]);
				Static23.aClass6_Sub4_Sub1_4.method1292(local206[1]);
				Static23.aClass6_Sub4_Sub1_4.method1292(local206[2]);
				Static23.aClass6_Sub4_Sub1_4.method1292(local206[3]);
				Static23.aClass6_Sub4_Sub1_4.method1292(Static4.aClass8_1.anInt181);
				Static23.aClass6_Sub4_Sub1_4.method1331(Static49.aClass63_805.method1823());
				Static23.aClass6_Sub4_Sub1_4.method1315(Static49.aClass63_796);
				Static23.aClass6_Sub4_Sub1_4.method1310(Static93.aBigInteger2, Static86.aBigInteger1);
				Static13.aClass6_Sub4_Sub1_1.anInt1949 = 0;
				if (Static46.anInt1432 == 40) {
					Static13.aClass6_Sub4_Sub1_1.method1330(18);
				} else {
					Static13.aClass6_Sub4_Sub1_1.method1330(16);
				}
				Static13.aClass6_Sub4_Sub1_1.method1330(Static23.aClass6_Sub4_Sub1_4.anInt1949 + 69);
				Static13.aClass6_Sub4_Sub1_1.method1292(452);
				Static13.aClass6_Sub4_Sub1_1.method1330(Static61.aBoolean98 ? 1 : 0);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static82.aClass7_Sub1_14.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static5.aClass7_Sub1_2.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static5.aClass7_Sub1_1.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static98.aClass7_Sub1_18.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static86.aClass7_Sub1_16.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static67.aClass7_Sub1_11.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static64.aClass7_Sub1_10.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(aClass7_Sub1_5.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static52.aClass7_Sub1_8.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static85.aClass7_Sub1_19.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static71.aClass7_Sub1_12.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static113.aClass7_Sub1_4.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static81.aClass7_Sub1_13.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static60.aClass7_Sub1_9.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static51.aClass7_Sub1_7.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1292(Static91.aClass7_Sub1_17.anInt146);
				Static13.aClass6_Sub4_Sub1_1.method1288(Static23.aClass6_Sub4_Sub1_4.aByteArray27, Static23.aClass6_Sub4_Sub1_4.anInt1949);
				Static100.aClass47_4.method1377(Static13.aClass6_Sub4_Sub1_1.anInt1949, Static13.aClass6_Sub4_Sub1_1.aByteArray27);
				Static23.aClass6_Sub4_Sub1_4.method1343(local206);
				for (@Pc(439) int local439 = 0; local439 < 4; local439++) {
					local206[local439] += 50;
				}
				Static88.aClass6_Sub4_Sub1_5.method1343(local206);
				Static120.anInt3290 = 6;
			}
			if (Static120.anInt3290 == 6 && Static100.aClass47_4.method1380() > 0) {
				local114 = Static100.aClass47_4.method1375();
				if (local114 == 21 && Static46.anInt1432 == 20) {
					Static120.anInt3290 = 7;
				} else if (local114 == 2) {
					Static120.anInt3290 = 9;
				} else if (local114 == 15 && Static46.anInt1432 == 40) {
					Static30.method719();
					return;
				} else if (local114 == 23 && Static93.anInt2619 < 1) {
					Static93.anInt2619++;
					Static120.anInt3290 = 0;
				} else {
					Static1.method16(local114);
					return;
				}
			}
			if (Static120.anInt3290 == 7 && Static100.aClass47_4.method1380() > 0) {
				Static23.anInt2352 = (Static100.aClass47_4.method1375() + 3) * 60;
				Static120.anInt3290 = 8;
			}
			if (Static120.anInt3290 == 8) {
				Static48.anInt1509 = 0;
				Static11.method1282(Static123.aClass63_1777, Static101.aClass63_1531, Static15.method374(new Class63[] { Static118.method2114(Static23.anInt2352 / 60), Static59.aClass63_932 }));
				if (--Static23.anInt2352 <= 0) {
					Static120.anInt3290 = 0;
				}
			} else {
				if (Static120.anInt3290 == 9 && Static100.aClass47_4.method1380() >= 8) {
					Static22.anInt687 = Static100.aClass47_4.method1375();
					Static94.aBoolean141 = Static100.aClass47_4.method1375() == 1;
					Static88.anInt2466 = Static100.aClass47_4.method1375();
					Static88.anInt2466 <<= 0x8;
					Static88.anInt2466 += Static100.aClass47_4.method1375();
					Static14.anInt463 = Static100.aClass47_4.method1375();
					Static100.aClass47_4.method1379(1, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
					Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
					Static77.anInt2144 = Static88.aClass6_Sub4_Sub1_5.method1340();
					Static100.aClass47_4.method1379(2, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
					Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
					Static14.anInt464 = Static88.aClass6_Sub4_Sub1_5.method1306();
					Static120.anInt3290 = 10;
				}
				if (Static120.anInt3290 != 10) {
					Static48.anInt1509++;
					if (Static48.anInt1509 > 2000) {
						if (Static93.anInt2619 < 1) {
							Static120.anInt3290 = 0;
							if (Static2.anInt22 == Static51.anInt1568) {
								Static2.anInt22 = Static98.anInt2773;
							} else {
								Static2.anInt22 = Static51.anInt1568;
							}
							Static93.anInt2619++;
						} else {
							Static1.method16(-3);
						}
					}
				} else if (Static100.aClass47_4.method1380() >= Static14.anInt464) {
					Static88.aClass6_Sub4_Sub1_5.anInt1949 = 0;
					Static100.aClass47_4.method1379(Static14.anInt464, Static88.aClass6_Sub4_Sub1_5.aByteArray27, 0);
					Static65.method1207();
					Static2.anInt35 = -1;
					Static11.method1338(false);
					Static77.anInt2144 = -1;
				}
			}
		} catch (@Pc(733) IOException local733) {
			if (Static93.anInt2619 < 1) {
				Static120.anInt3290 = 0;
				if (Static51.anInt1568 == Static2.anInt22) {
					Static2.anInt22 = Static98.anInt2773;
				} else {
					Static2.anInt22 = Static51.anInt1568;
				}
				Static93.anInt2619++;
			} else {
				Static1.method16(-2);
			}
		}
	}
}
