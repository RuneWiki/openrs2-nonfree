import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public static int anInt1877;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
	public static boolean aBoolean117;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!v;")
	private static Class76 aClass76_808 = Static134.method2017("This computers address has been blocked");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_809 = Static134.method2017("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!vf;")
	public static Class78 aClass78_8 = new Class78();

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!hc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_813 = Static134.method2017("Unable to find ");

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_810 = aClass76_813;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_811 = aClass76_808;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_812 = Static134.method2017(")2");

	@OriginalMember(owner = "client!md", name = "u", descriptor = "I")
	public static int anInt1883 = 0;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!md", name = "w", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "I")
	public static volatile int anInt1885 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZ)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static126.anInt2731 = 0;
		@Pc(164) int local164;
		for (@Pc(5) int local5 = -1; local5 < Static76.anInt1935 + Static106.anInt2357; local5++) {
			@Pc(26) Class4_Sub4_Sub3_Sub1 local26;
			if (local5 == -1) {
				local26 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1;
			} else if (Static106.anInt2357 <= local5) {
				local26 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local5 - Static106.anInt2357]];
			} else {
				local26 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static113.anIntArray348[local5]];
			}
			if (local26 != null && local26.method969()) {
				@Pc(53) Class4_Sub4_Sub10 local53;
				if (local26 instanceof Class4_Sub4_Sub3_Sub1_Sub1) {
					local53 = ((Class4_Sub4_Sub3_Sub1_Sub1) local26).aClass4_Sub4_Sub10_1;
					if (local53.anIntArray231 != null) {
						local53 = local53.method1124();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local5 >= Static106.anInt2357) {
					local53 = ((Class4_Sub4_Sub3_Sub1_Sub1) local26).aClass4_Sub4_Sub10_1;
					if (local53.anIntArray231 != null) {
						local53 = local53.method1124();
					}
					if (local53.anInt1700 >= 0 && Static114.aClass4_Sub4_Sub5_Sub2Array43.length > local53.anInt1700) {
						Static15.method182(local26.anInt1400 + 15, local26);
						if (Static122.anInt2674 > -1) {
							Static114.aClass4_Sub4_Sub5_Sub2Array43[local53.anInt1700].method903(arg2 + Static122.anInt2674 - 12, arg3 + Static91.anInt2121 - 30);
						}
					}
					if (Static34.anInt965 == 1 && Static47.anIntArray153[local5 - Static106.anInt2357] == Static132.anInt2825 && Static78.anInt1981 % 20 < 10) {
						Static15.method182(local26.anInt1400 + 15, local26);
						if (Static122.anInt2674 > -1) {
							Static99.aClass4_Sub4_Sub5_Sub2Array50[0].method903(Static122.anInt2674 + arg2 - 12, arg3 + Static91.anInt2121 + -28);
						}
					}
				} else {
					local164 = 30;
					@Pc(167) Class4_Sub4_Sub3_Sub1_Sub2 local167 = (Class4_Sub4_Sub3_Sub1_Sub2) local26;
					if (local167.anInt1453 != -1 || local167.anInt1459 != -1) {
						Static15.method182(local26.anInt1400 + 15, local26);
						if (Static122.anInt2674 > -1) {
							if (local167.anInt1453 != -1) {
								Static47.aClass4_Sub4_Sub5_Sub2Array22[local167.anInt1453].method903(arg2 + Static122.anInt2674 - 12, arg3 - -Static91.anInt2121 + -30);
								local164 += 25;
							}
							if (local167.anInt1459 != -1) {
								Static114.aClass4_Sub4_Sub5_Sub2Array43[local167.anInt1459].method903(arg2 + Static122.anInt2674 - 12, -local164 + (arg3 - -Static91.anInt2121));
								local164 += 25;
							}
						}
					}
					if (local5 >= 0 && Static34.anInt965 == 10 && Static113.anIntArray348[local5] == Static66.anInt1679) {
						Static15.method182(local26.anInt1400 + 15, local26);
						if (Static122.anInt2674 > -1) {
							Static99.aClass4_Sub4_Sub5_Sub2Array50[1].method903(Static122.anInt2674 + arg2 - 12, -local164 + arg3 - -Static91.anInt2121);
						}
					}
				}
				if (local26.aClass76_607 != null && (local5 >= Static106.anInt2357 || Static21.anInt501 == 0 || Static21.anInt501 == 3 || Static21.anInt501 == 1 && Static94.method1506(((Class4_Sub4_Sub3_Sub1_Sub2) local26).aClass76_612))) {
					Static15.method182(local26.anInt1400, local26);
					if (Static122.anInt2674 > -1 && Static126.anInt2731 < Static2.anInt28) {
						Static2.anIntArray9[Static126.anInt2731] = Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1317(local26.aClass76_607) / 2;
						Static2.anIntArray7[Static126.anInt2731] = Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.anInt1871;
						Static2.anIntArray6[Static126.anInt2731] = Static122.anInt2674;
						Static2.anIntArray8[Static126.anInt2731] = Static91.anInt2121;
						Static2.anIntArray3[Static126.anInt2731] = local26.anInt1402;
						Static2.anIntArray5[Static126.anInt2731] = local26.anInt1420;
						Static2.anIntArray4[Static126.anInt2731] = local26.anInt1381;
						Static2.aClass76Array1[Static126.anInt2731] = local26.aClass76_607;
						Static126.anInt2731++;
					}
				}
				if (local26.anInt1380 > Static78.anInt1981) {
					Static15.method182(local26.anInt1400 + 15, local26);
					if (Static122.anInt2674 > -1) {
						local164 = local26.anInt1383 * 30 / local26.anInt1411;
						if (local164 > 30) {
							local164 = 30;
						}
						Static46.method1823(arg2 + Static122.anInt2674 - 15, Static91.anInt2121 + arg3 - 3, local164, 5, 65280);
						Static46.method1823(Static122.anInt2674 + arg2 + local164 - 15, Static91.anInt2121 + -3 + arg3, 30 - local164, 5, 16711680);
					}
				}
				for (local164 = 0; local164 < 4; local164++) {
					if (Static78.anInt1981 < local26.anIntArray183[local164]) {
						Static15.method182(local26.anInt1400 / 2, local26);
						if (Static122.anInt2674 > -1) {
							if (local164 == 1) {
								Static91.anInt2121 -= 20;
							}
							if (local164 == 2) {
								Static122.anInt2674 -= 15;
								Static91.anInt2121 -= 10;
							}
							if (local164 == 3) {
								Static122.anInt2674 += 15;
								Static91.anInt2121 -= 10;
							}
							Static49.aClass4_Sub4_Sub5_Sub2Array24[local26.anIntArray182[local164]].method903(arg2 + Static122.anInt2674 - 12, arg3 + (Static91.anInt2121 - 12));
							Static87.aClass4_Sub4_Sub5_Sub3_Sub1_4.method1311(Static63.method1092(local26.anIntArray181[local164]), arg2 + Static122.anInt2674 - 1, Static91.anInt2121 + 3 + arg3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(531) int local531 = 0; local531 < Static126.anInt2731; local531++) {
			local164 = Static2.anIntArray6[local531];
			@Pc(541) int local541 = Static2.anIntArray9[local531];
			@Pc(545) int local545 = Static2.anIntArray7[local531];
			@Pc(547) boolean local547 = true;
			@Pc(551) int local551 = Static2.anIntArray8[local531];
			while (local547) {
				local547 = false;
				for (@Pc(557) int local557 = 0; local557 < local531; local557++) {
					if (Static2.anIntArray8[local557] - Static2.anIntArray7[local557] < local551 + 2 && local551 - local545 < Static2.anIntArray8[local557] - -2 && Static2.anIntArray6[local557] + Static2.anIntArray9[local557] > -local541 + local164 && Static2.anIntArray6[local557] - Static2.anIntArray9[local557] < local164 + local541 && local551 > Static2.anIntArray8[local557] - Static2.anIntArray7[local557]) {
						local547 = true;
						local551 = Static2.anIntArray8[local557] - Static2.anIntArray7[local557];
					}
				}
			}
			Static122.anInt2674 = Static2.anIntArray6[local531];
			Static91.anInt2121 = Static2.anIntArray8[local531] = local551;
			@Pc(654) Class76 local654 = Static2.aClass76Array1[local531];
			if (Static81.anInt2010 == 0) {
				@Pc(658) int local658 = 16776960;
				if (Static2.anIntArray3[local531] < 6) {
					local658 = Static47.anIntArray154[Static2.anIntArray3[local531]];
				}
				if (Static2.anIntArray3[local531] == 6) {
					local658 = Static20.anInt445 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static2.anIntArray3[local531] == 7) {
					local658 = Static20.anInt445 % 20 < 10 ? 255 : 65535;
				}
				if (Static2.anIntArray3[local531] == 8) {
					local658 = Static20.anInt445 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(735) int local735;
				if (Static2.anIntArray3[local531] == 9) {
					local735 = 150 - Static2.anIntArray4[local531];
					if (local735 < 50) {
						local658 = local735 * 1280 + 16711680;
					} else if (local735 < 100) {
						local658 = 16776960 + 16384000 - local735 * 327680;
					} else if (local735 < 150) {
						local658 = local735 * 5 + 65280 - 500;
					}
				}
				if (Static2.anIntArray3[local531] == 10) {
					local735 = 150 - Static2.anIntArray4[local531];
					if (local735 < 50) {
						local658 = local735 * 5 + 16711680;
					} else if (local735 < 100) {
						local658 = 16384000 + 16711935 - local735 * 327680;
					} else if (local735 < 150) {
						local658 = (local735 - 100) * 327680 + 255 - (local735 - 100) * 5;
					}
				}
				if (Static2.anIntArray3[local531] == 11) {
					local735 = 150 - Static2.anIntArray4[local531];
					if (local735 < 50) {
						local658 = 16777215 - local735 * 327685;
					} else if (local735 < 100) {
						local658 = (local735 - 50) * 327685 + 65280;
					} else if (local735 < 150) {
						local658 = 16777215 - (local735 - 100) * 327680;
					}
				}
				if (Static2.anIntArray5[local531] == 0) {
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1311(local654, arg2 + Static122.anInt2674, arg3 - -Static91.anInt2121, local658, 0);
				}
				if (Static2.anIntArray5[local531] == 1) {
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1315(local654, arg2 + Static122.anInt2674, arg3 + Static91.anInt2121, local658, Static20.anInt445);
				}
				if (Static2.anIntArray5[local531] == 2) {
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1333(local654, arg2 + Static122.anInt2674, arg3 + Static91.anInt2121, local658, Static20.anInt445);
				}
				if (Static2.anIntArray5[local531] == 3) {
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1321(local654, arg2 + Static122.anInt2674, arg3 - -Static91.anInt2121, local658, Static20.anInt445, 150 - Static2.anIntArray4[local531]);
				}
				if (Static2.anIntArray5[local531] == 4) {
					local735 = (150 - Static2.anIntArray4[local531]) * (Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1317(local654) + 100) / 150;
					Static46.method1819(Static122.anInt2674 + arg2 - 50, arg3, arg2 + Static122.anInt2674 + 50, arg3 + arg0);
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1334(local654, Static122.anInt2674 + arg2 + 50 - local735, Static91.anInt2121 + arg3, local658, 0);
					Static46.method1828(arg2, arg3, arg1 + arg2, arg3 - -arg0);
				}
				if (Static2.anIntArray5[local531] == 5) {
					local735 = 150 - Static2.anIntArray4[local531];
					Static46.method1819(arg2, Static91.anInt2121 + arg3 - Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.anInt1871 - 1, arg1 + arg2, Static91.anInt2121 + arg3 + 5);
					@Pc(1056) int local1056 = 0;
					if (local735 < 25) {
						local1056 = local735 - 25;
					} else if (local735 > 125) {
						local1056 = local735 - 125;
					}
					Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1311(local654, arg2 + Static122.anInt2674, Static91.anInt2121 + arg3 - -local1056, local658, 0);
					Static46.method1828(arg2, arg3, arg1 + arg2, arg0 + arg3);
				}
			} else {
				Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1311(local654, arg2 + Static122.anInt2674, Static91.anInt2121 + arg3, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1353() {
		aClass76_811 = null;
		aClass76_812 = null;
		aClass76_809 = null;
		aCRC32_2 = null;
		aClass76_808 = null;
		aClass76_813 = null;
		aClass76_810 = null;
		aClass78_8 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
	public static boolean method1355() {
		return Static48.anInt1229 == 0 ? Static30.aClass4_Sub12_Sub2_4.method1068() : true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!kc;IBI)V")
	public static void method1359(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static64.anInt1644 >= 50 || Static36.anInt1021 == 0 || (arg1.anIntArray198 == null || arg0 >= arg1.anIntArray198.length)) {
			return;
		}
		@Pc(26) int local26 = arg1.anIntArray198[arg0];
		if (local26 == 0) {
			return;
		}
		@Pc(37) int local37 = local26 >> 8;
		@Pc(43) int local43 = local26 >> 4 & 0x7;
		@Pc(47) int local47 = local26 & 0xF;
		Static68.anIntArray236[Static64.anInt1644] = local37;
		Static82.anIntArray280[Static64.anInt1644] = local43;
		Static65.anIntArray62[Static64.anInt1644] = 0;
		Static68.aClass65Array1[Static64.anInt1644] = null;
		@Pc(69) int local69 = (arg3 - 64) / 128;
		@Pc(75) int local75 = (arg2 - 64) / 128;
		Static50.anIntArray162[Static64.anInt1644] = local47 + (local69 << 8) + (local75 << 16);
		Static64.anInt1644++;
	}
}
