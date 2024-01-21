import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fb", name = "Vc", descriptor = "Lclient!la;")
	public static Class17 aClass17_12;

	@OriginalMember(owner = "client!fb", name = "Ac", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array13 = new Class4_Sub4_Sub5_Sub2[1000];

	@OriginalMember(owner = "client!fb", name = "Bc", descriptor = "Lclient!v;")
	public static Class76 aClass76_327 = Static134.method2017("Fertigkeit)2");

	@OriginalMember(owner = "client!fb", name = "Cc", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!fb", name = "Ec", descriptor = "Lclient!ua;")
	public static Class72 aClass72_13 = new Class72(64);

	@OriginalMember(owner = "client!fb", name = "Fc", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];

	@OriginalMember(owner = "client!fb", name = "Oc", descriptor = "Lclient!v;")
	private static Class76 aClass76_329 = Static134.method2017("Close");

	@OriginalMember(owner = "client!fb", name = "Hc", descriptor = "Lclient!v;")
	public static Class76 aClass76_328 = aClass76_329;

	@OriginalMember(owner = "client!fb", name = "Mc", descriptor = "I")
	public static int anInt808 = 255;

	@OriginalMember(owner = "client!fb", name = "Qc", descriptor = "Lclient!v;")
	private static Class76 aClass76_330 = Static134.method2017("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!fb", name = "Rc", descriptor = "[Lclient!dc;")
	public static Class17_Sub1[] aClass17_Sub1Array1 = new Class17_Sub1[256];

	@OriginalMember(owner = "client!fb", name = "Sc", descriptor = "Lclient!v;")
	public static Class76 aClass76_331 = Static134.method2017("Registrierter Benutzer");

	@OriginalMember(owner = "client!fb", name = "Tc", descriptor = "Lclient!v;")
	public static Class76 aClass76_332 = aClass76_330;

	@OriginalMember(owner = "client!fb", name = "Uc", descriptor = "I")
	public static int anInt811 = 0;

	@OriginalMember(owner = "client!fb", name = "Wc", descriptor = "Lclient!ua;")
	public static Class72 aClass72_14 = new Class72(64);

	@OriginalMember(owner = "client!fb", name = "Xc", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!fb", name = "Yc", descriptor = "I")
	public static int anInt813 = -1;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
	public static void method477() {
		aClass76_332 = null;
		aClass76_328 = null;
		aClass4_Sub4_Sub5_Sub2Array13 = null;
		aClass76_330 = null;
		anIntArrayArray7 = null;
		aClass17_Sub1Array1 = null;
		aClass76_329 = null;
		aClass72_14 = null;
		aClass76_331 = null;
		aClass72_13 = null;
		aClass17_12 = null;
		aClass76_327 = null;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)Z")
	public static boolean method478() {
		if (Static48.aClass75_4 == null) {
			return false;
		}
		@Pc(135) int local135;
		try {
			@Pc(15) int local15 = Static48.aClass75_4.method1844();
			if (local15 == 0) {
				return false;
			}
			if (Static48.anInt1230 == -1) {
				Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, 1);
				Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
				Static48.anInt1230 = Static24.aClass4_Sub10_Sub1_1.method614();
				Static30.anInt1437 = Static3.anIntArray310[Static48.anInt1230];
				local15--;
			}
			if (Static30.anInt1437 == -1) {
				if (local15 <= 0) {
					return false;
				}
				Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, 1);
				Static30.anInt1437 = Static24.aClass4_Sub10_Sub1_1.aByteArray17[0] & 0xFF;
				local15--;
			}
			if (Static30.anInt1437 == -2) {
				if (local15 <= 1) {
					return false;
				}
				Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, 2);
				Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
				Static30.anInt1437 = Static24.aClass4_Sub10_Sub1_1.method604();
				local15 -= 2;
			}
			if (Static30.anInt1437 > local15) {
				return false;
			}
			Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
			Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, Static30.anInt1437);
			Static67.anInt1720 = 0;
			Static72.anInt1884 = Static5.anInt127;
			Static5.anInt127 = Static125.anInt2725;
			Static125.anInt2725 = Static48.anInt1230;
			@Pc(143) Class4_Sub8 local143;
			@Pc(151) int local151;
			@Pc(191) int local191;
			@Pc(131) int local131;
			@Pc(185) int local185;
			@Pc(195) int local195;
			if (Static48.anInt1230 == 80) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method549();
				local135 = Static24.aClass4_Sub10_Sub1_1.method604();
				if (local131 >= 0) {
					local143 = Static52.method946(local131);
				} else {
					local143 = null;
				}
				if (local143 != null) {
					for (local151 = 0; local151 < local143.anIntArray71.length; local151++) {
						local143.anIntArray71[local151] = 0;
						local143.anIntArray66[local151] = 0;
					}
				}
				if (local131 < -70000) {
					local135 += 32768;
				}
				Static74.method1367(local135);
				local151 = Static24.aClass4_Sub10_Sub1_1.method604();
				for (local185 = 0; local185 < local151; local185++) {
					local191 = Static24.aClass4_Sub10_Sub1_1.method593();
					local195 = Static24.aClass4_Sub10_Sub1_1.method594();
					if (local195 == 255) {
						local195 = Static24.aClass4_Sub10_Sub1_1.method549();
					}
					if (local143 != null && local185 < local143.anIntArray71.length) {
						local143.anIntArray71[local185] = local191;
						local143.anIntArray66[local185] = local195;
					}
					Static60.method1036(local195, local185, local191 - 1, local135);
				}
				if (local143 != null) {
					Static63.method1095(local143);
				}
				Static127.method1918();
				Static66.anIntArray227[Static58.anInt1530++ & 0x1F] = local135 & 0x7FFF;
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(273) int local273;
			if (Static48.anInt1230 == 37) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method599();
				local135 = Static24.aClass4_Sub10_Sub1_1.method599();
				local273 = Static24.aClass4_Sub10_Sub1_1.method599();
				local151 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static9.aBooleanArray1[local131] = true;
				Static85.anIntArray283[local131] = local135;
				Static88.anIntArray289[local131] = local273;
				Static133.anIntArray408[local131] = local151;
				Static12.anIntArray37[local131] = 0;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 203) {
				for (local131 = 0; local131 < Static124.anIntArray393.length; local131++) {
					if (Static7.anIntArray19[local131] != Static124.anIntArray393[local131]) {
						Static124.anIntArray393[local131] = Static7.anIntArray19[local131];
						Static98.method1575(local131);
						Static90.anIntArray298[Static57.anInt1490++ & 0x1F] = local131;
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 165) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method557();
				local135 = Static24.aClass4_Sub10_Sub1_1.method552();
				local143 = Static52.method946(local131);
				if (local135 != local143.anInt507 || local135 == -1) {
					local143.anInt527 = 0;
					local143.anInt519 = 0;
					local143.anInt507 = local135;
					Static63.method1095(local143);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 9) {
				Static125.aBoolean155 = false;
				for (local131 = 0; local131 < 5; local131++) {
					Static9.aBooleanArray1[local131] = false;
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 198) {
				Static51.anInt2078 = 0;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 161) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method589();
				Static6.anInt132 = local131;
				Static79.method559(local131);
				Static96.method1543(Static6.anInt132);
				for (local135 = 0; local135 < 100; local135++) {
					Static70.aBooleanArray9[local135] = true;
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 17) {
				Static23.method349(false);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 86) {
				anInt812 = Static24.aClass4_Sub10_Sub1_1.method589() * 30;
				Static119.anInt2566 = Static36.anInt1031;
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(660) int local660;
			@Pc(714) int local714;
			@Pc(491) long local491;
			@Pc(614) int local614;
			@Pc(623) int local623;
			if (Static48.anInt1230 == 76) {
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				local273 = Static24.aClass4_Sub10_Sub1_1.method604();
				local151 = Static24.aClass4_Sub10_Sub1_1.method599();
				@Pc(507) Class76 local507 = Static56.method983(local491).method1858();
				for (local191 = 0; local191 < Static104.anInt2337; local191++) {
					if (local491 == Static100.aLongArray55[local191]) {
						if (local273 != Static84.anIntArray281[local191]) {
							Static84.anIntArray281[local191] = local273;
							if (local273 > 0) {
								Static21.method328(5, Static133.aClass76_1322, Static59.method1017(new Class76[] { local507, Static95.aClass76_991 }));
							}
							if (local273 == 0) {
								Static21.method328(5, Static133.aClass76_1322, Static59.method1017(new Class76[] { local507, Static14.aClass76_122 }));
							}
						}
						Static93.anIntArray305[local191] = local151;
						local507 = null;
						break;
					}
				}
				if (local507 != null && Static104.anInt2337 < 200) {
					Static100.aLongArray55[Static104.anInt2337] = local491;
					Static51.aClass76Array23[Static104.anInt2337] = local507;
					Static84.anIntArray281[Static104.anInt2337] = local273;
					Static93.anIntArray305[Static104.anInt2337] = local151;
					Static104.anInt2337++;
				}
				Static72.anInt1883 = Static36.anInt1031;
				local614 = Static104.anInt2337;
				while (local614 > 0) {
					@Pc(620) boolean local620 = true;
					local614--;
					for (local623 = 0; local623 < local614; local623++) {
						if (Static28.anInt591 != Static84.anIntArray281[local623] && Static28.anInt591 == Static84.anIntArray281[local623 + 1] || Static84.anIntArray281[local623] == 0 && Static84.anIntArray281[local623 + 1] != 0) {
							local620 = false;
							local660 = Static84.anIntArray281[local623];
							Static84.anIntArray281[local623] = Static84.anIntArray281[local623 + 1];
							Static84.anIntArray281[local623 + 1] = local660;
							@Pc(678) Class76 local678 = Static51.aClass76Array23[local623];
							Static51.aClass76Array23[local623] = Static51.aClass76Array23[local623 + 1];
							Static51.aClass76Array23[local623 + 1] = local678;
							@Pc(696) long local696 = Static100.aLongArray55[local623];
							Static100.aLongArray55[local623] = Static100.aLongArray55[local623 + 1];
							Static100.aLongArray55[local623 + 1] = local696;
							local714 = Static93.anIntArray305[local623];
							Static93.anIntArray305[local623] = Static93.anIntArray305[local623 + 1];
							Static93.anIntArray305[local623 + 1] = local714;
						}
					}
					if (local620) {
						break;
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(757) Class76 local757;
			if (Static48.anInt1230 == 121) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method549();
				local757 = Static24.aClass4_Sub10_Sub1_1.method581();
				local143 = Static52.method946(local131);
				if (!local757.method1878(local143.aClass76_189)) {
					local143.aClass76_189 = local757;
					Static63.method1095(local143);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 34) {
				Static127.method1918();
				local131 = Static24.aClass4_Sub10_Sub1_1.method557();
				local135 = Static24.aClass4_Sub10_Sub1_1.method594();
				local273 = Static24.aClass4_Sub10_Sub1_1.method598();
				Static52.anIntArray167[local273] = local131;
				Static78.anIntArray266[local273] = local135;
				Static8.anIntArray21[local273] = 1;
				for (local151 = 0; local151 < 98; local151++) {
					if (local131 >= Class17.anIntArray61[local151]) {
						Static8.anIntArray21[local273] = local151 + 2;
					}
				}
				Static48.anIntArray155[Static121.anInt2619++ & 0x1F] = local273;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 97) {
				Static127.method1918();
				Static87.anInt1968 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static119.anInt2566 = Static36.anInt1031;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 162) {
				Static35.method626(Static24.aClass4_Sub10_Sub1_1);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 214) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method596();
				local135 = Static24.aClass4_Sub10_Sub1_1.method598();
				local273 = Static24.aClass4_Sub10_Sub1_1.method596();
				Static124.anInt2712 = local273 >> 1;
				Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method967((local273 & 0x1) == 1, local135, local131);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 4) {
				Static34.anInt965 = Static24.aClass4_Sub10_Sub1_1.method599();
				if (Static34.anInt965 == 1) {
					Static132.anInt2825 = Static24.aClass4_Sub10_Sub1_1.method604();
				}
				if (Static34.anInt965 >= 2 && Static34.anInt965 <= 6) {
					if (Static34.anInt965 == 2) {
						Static124.anInt2713 = 64;
						Static52.anInt1352 = 64;
					}
					if (Static34.anInt965 == 3) {
						Static52.anInt1352 = 64;
						Static124.anInt2713 = 0;
					}
					if (Static34.anInt965 == 4) {
						Static52.anInt1352 = 64;
						Static124.anInt2713 = 128;
					}
					if (Static34.anInt965 == 5) {
						Static124.anInt2713 = 64;
						Static52.anInt1352 = 0;
					}
					if (Static34.anInt965 == 6) {
						Static124.anInt2713 = 64;
						Static52.anInt1352 = 128;
					}
					Static34.anInt965 = 2;
					Static69.anInt1766 = Static24.aClass4_Sub10_Sub1_1.method604();
					Static69.anInt1764 = Static24.aClass4_Sub10_Sub1_1.method604();
					Static134.anInt2842 = Static24.aClass4_Sub10_Sub1_1.method599();
				}
				if (Static34.anInt965 == 10) {
					Static66.anInt1679 = Static24.aClass4_Sub10_Sub1_1.method604();
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 74) {
				Static23.method349(true);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 166) {
				if (Static6.anInt132 != -1) {
					Static6.method85(0, Static6.anInt132);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 178) {
				Static62.anInt1613 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 40) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method556();
				local135 = Static24.aClass4_Sub10_Sub1_1.method589();
				local143 = Static52.method946(local131);
				if (local143 != null && local143.anInt473 == 0) {
					if (local135 > local143.anInt482 - local143.anInt498) {
						local135 = local143.anInt482 - local143.anInt498;
					}
					if (local135 < 0) {
						local135 = 0;
					}
					if (local135 != local143.anInt494) {
						local143.anInt494 = local135;
						Static63.method1095(local143);
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 241) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				if (local131 == 65535) {
					local131 = -1;
				}
				Static127.method1922(local131);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 149) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method595();
				local135 = Static24.aClass4_Sub10_Sub1_1.method593();
				if (local135 == 65535) {
					local135 = -1;
				}
				Static3.method1519(local135, local131);
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(1180) int local1180;
			@Pc(1161) long local1161;
			@Pc(1166) long local1166;
			if (Static48.anInt1230 == 58) {
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				local1161 = Static24.aClass4_Sub10_Sub1_1.method604();
				local1166 = Static24.aClass4_Sub10_Sub1_1.method572();
				local195 = Static24.aClass4_Sub10_Sub1_1.method599();
				@Pc(1176) long local1176 = (local1161 << 32) + local1166;
				@Pc(1178) boolean local1178 = false;
				for (local1180 = 0; local1180 < 100; local1180++) {
					if (local1176 == Static27.aLongArray67[local1180]) {
						local1178 = true;
						break;
					}
				}
				if (local195 <= 1) {
					for (@Pc(1201) int local1201 = 0; local1201 < Static45.anInt1192; local1201++) {
						if (Static31.aLongArray17[local1201] == local491) {
							local1178 = true;
							break;
						}
					}
				}
				if (!local1178 && anInt811 == 0) {
					Static27.aLongArray67[Static64.anInt1655] = local1176;
					Static64.anInt1655 = (Static64.anInt1655 + 1) % 100;
					@Pc(1245) Class76 local1245 = Static83.method1328(Static104.method1601(Static24.aClass4_Sub10_Sub1_1).method1871());
					if (local195 == 2 || local195 == 3) {
						Static21.method328(7, Static59.method1017(new Class76[] { Static111.aClass76_1148, Static56.method983(local491).method1858() }), local1245);
					} else if (local195 == 1) {
						Static21.method328(7, Static59.method1017(new Class76[] { Static65.aClass76_173, Static56.method983(local491).method1858() }), local1245);
					} else {
						Static21.method328(3, Static56.method983(local491).method1858(), local1245);
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(1322) Class76 local1322;
			if (Static48.anInt1230 == 152) {
				local1322 = Static24.aClass4_Sub10_Sub1_1.method581();
				@Pc(1329) Object[] local1329 = new Object[local1322.method1851() + 1];
				for (local273 = local1322.method1851() - 1; local273 >= 0; local273--) {
					if (local1322.method1860(local273) == 115) {
						local1329[local273 + 1] = Static24.aClass4_Sub10_Sub1_1.method581();
					} else {
						local1329[local273 + 1] = Integer.valueOf(Static24.aClass4_Sub10_Sub1_1.method549());
					}
				}
				local1329[0] = Integer.valueOf(Static24.aClass4_Sub10_Sub1_1.method549());
				@Pc(1384) Class4_Sub20 local1384 = new Class4_Sub20();
				local1384.anObjectArray28 = local1329;
				Static20.method307(local1384);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 95) {
				Static127.method1918();
				Static39.anInt1126 = Static24.aClass4_Sub10_Sub1_1.method574();
				Static48.anInt1230 = -1;
				Static119.anInt2566 = Static36.anInt1031;
				return true;
			}
			if (Static48.anInt1230 == 48) {
				Static114.method1723();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 148) {
				Static50.method872(Static30.anInt1437, Static121.aClass14_3, Static24.aClass4_Sub10_Sub1_1);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 211) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method549();
				@Pc(1450) Class4_Sub14 local1450 = (Class4_Sub14) Static42.aClass28_3.method770((long) local131);
				if (local1450 != null) {
					Static126.method1909(true, local1450);
				}
				if (Static65.aClass4_Sub8_5 != null) {
					Static63.method1095(Static65.aClass4_Sub8_5);
					Static65.aClass4_Sub8_5 = null;
				}
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(1491) Class4_Sub14 local1491;
			if (Static48.anInt1230 == 31) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method589();
				local135 = Static24.aClass4_Sub10_Sub1_1.method594();
				local273 = Static24.aClass4_Sub10_Sub1_1.method554();
				local1491 = (Class4_Sub14) Static42.aClass28_3.method770((long) local273);
				if (local1491 != null) {
					Static126.method1909(local131 != local1491.anInt1980, local1491);
				}
				Static119.method1803(local135, local273, local131);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 227) {
				local1322 = Static24.aClass4_Sub10_Sub1_1.method581();
				local135 = Static24.aClass4_Sub10_Sub1_1.method596();
				local273 = Static24.aClass4_Sub10_Sub1_1.method596();
				if (local273 >= 1 && local273 <= 8) {
					if (local1322.method1882(Static107.aClass76_1111)) {
						local1322 = null;
					}
					Static79.aClass76Array6[local273 - 1] = local1322;
					Static113.aBooleanArray15[local273 - 1] = local135 == 0;
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 218) {
				Static128.anInt2753 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static48.anInt1230 = -1;
				Static72.anInt1883 = Static36.anInt1031;
				return true;
			}
			@Pc(1605) Class4_Sub8 local1605;
			if (Static48.anInt1230 == 2) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				local135 = Static24.aClass4_Sub10_Sub1_1.method554();
				local273 = Static24.aClass4_Sub10_Sub1_1.method593();
				local1605 = Static52.method946(local135);
				local1605.anInt460 = (local131 << 16) + local273;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 156) {
				@Pc(1628) boolean local1628 = Static24.aClass4_Sub10_Sub1_1.method599() == 1;
				local135 = Static24.aClass4_Sub10_Sub1_1.method556();
				local143 = Static52.method946(local135);
				if (local143.aBoolean39 != local1628) {
					local143.aBoolean39 = local1628;
					Static63.method1095(local143);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 124) {
				Static125.aBoolean155 = true;
				Static124.anInt2723 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static117.anInt2539 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static100.anInt2292 = Static24.aClass4_Sub10_Sub1_1.method604();
				Static103.anInt2318 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static124.anInt2720 = Static24.aClass4_Sub10_Sub1_1.method599();
				if (Static124.anInt2720 >= 100) {
					local135 = Static117.anInt2539 * 128 + 64;
					local131 = Static124.anInt2723 * 128 + 64;
					local273 = Static67.method1133(Static124.anInt2712, local131, local135) - Static100.anInt2292;
					local185 = local273 - Static96.anInt2222;
					local151 = local131 - Static106.anInt2354;
					local191 = local135 - Static120.anInt2582;
					local195 = (int) Math.sqrt((double) (local151 * local151 + local191 * local191));
					Static74.anInt1911 = (int) (Math.atan2((double) local185, (double) local195) * 325.949D) & 0x7FF;
					Static103.anInt2317 = (int) (Math.atan2((double) local151, (double) local191) * -325.949D) & 0x7FF;
					if (Static74.anInt1911 < 128) {
						Static74.anInt1911 = 128;
					}
					if (Static74.anInt1911 > 383) {
						Static74.anInt1911 = 383;
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 222) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				if (local131 == 65535) {
					local131 = -1;
				}
				local135 = Static24.aClass4_Sub10_Sub1_1.method556();
				local273 = Static24.aClass4_Sub10_Sub1_1.method549();
				local151 = Static24.aClass4_Sub10_Sub1_1.method563();
				if (local151 == 65535) {
					local151 = -1;
				}
				for (local185 = local151; local185 <= local131; local185++) {
					@Pc(1814) long local1814 = ((long) local135 << 32) + ((long) local185);
					@Pc(1819) Class4 local1819 = Static114.aClass28_11.method770(local1814);
					if (local1819 != null) {
						local1819.method2004();
					}
					Static114.aClass28_11.method774(local1814, new Class4_Sub3(local273));
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 93) {
				for (local131 = 0; local131 < Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1.length; local131++) {
					if (Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local131] != null) {
						Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local131].anInt1390 = -1;
					}
				}
				for (local135 = 0; local135 < Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1.length; local135++) {
					if (Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local135] != null) {
						Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local135].anInt1390 = -1;
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(1926) boolean local1926;
			if (Static48.anInt1230 == 105) {
				local1322 = Static24.aClass4_Sub10_Sub1_1.method581();
				if (local1322.method1868(Static3.aClass76_984)) {
					local757 = local1322.method1876(local1322.method1861(Static65.aClass76_175), 0);
					local1161 = local757.method1872();
					local1926 = false;
					for (local191 = 0; local191 < Static45.anInt1192; local191++) {
						if (local1161 == Static31.aLongArray17[local191]) {
							local1926 = true;
							break;
						}
					}
					if (!local1926 && anInt811 == 0) {
						Static21.method328(4, local757, Static79.aClass76_357);
					}
				} else if (local1322.method1868(Static31.aClass76_302)) {
					local757 = local1322.method1876(local1322.method1861(Static65.aClass76_175), 0);
					local1161 = local757.method1872();
					local1926 = false;
					for (local191 = 0; local191 < Static45.anInt1192; local191++) {
						if (local1161 == Static31.aLongArray17[local191]) {
							local1926 = true;
							break;
						}
					}
					if (!local1926 && anInt811 == 0) {
						Static21.method328(8, local757, Static101.aClass76_1066);
					}
				} else if (local1322.method1868(Static84.aClass76_896)) {
					local757 = local1322.method1876(local1322.method1861(Static65.aClass76_175), 0);
					local1161 = local757.method1872();
					local1926 = false;
					for (local191 = 0; local191 < Static45.anInt1192; local191++) {
						if (local1161 == Static31.aLongArray17[local191]) {
							local1926 = true;
							break;
						}
					}
					if (!local1926 && anInt811 == 0) {
						@Pc(2225) Class76 local2225 = local1322.method1876(local1322.method1851() - 9, local1322.method1861(Static65.aClass76_175) + 1);
						Static21.method328(8, local757, local2225);
					}
				} else if (local1322.method1868(Static94.aClass76_976)) {
					local757 = local1322.method1876(local1322.method1861(Static65.aClass76_175), 0);
					local1926 = false;
					local1161 = local757.method1872();
					for (local191 = 0; local191 < Static45.anInt1192; local191++) {
						if (Static31.aLongArray17[local191] == local1161) {
							local1926 = true;
							break;
						}
					}
					if (!local1926 && anInt811 == 0) {
						Static21.method328(10, local757, Static133.aClass76_1322);
					}
				} else if (local1322.method1868(Static5.aClass76_45)) {
					local757 = local1322.method1876(local1322.method1861(Static5.aClass76_45), 0);
					Static21.method328(11, Static133.aClass76_1322, local757);
				} else if (local1322.method1868(Static77.aClass76_832)) {
					local757 = local1322.method1876(local1322.method1861(Static77.aClass76_832), 0);
					if (anInt811 == 0) {
						Static21.method328(12, Static133.aClass76_1322, local757);
					}
				} else if (local1322.method1868(Static49.aClass76_555)) {
					local757 = local1322.method1876(local1322.method1861(Static49.aClass76_555), 0);
					if (anInt811 == 0) {
						Static21.method328(13, Static133.aClass76_1322, local757);
					}
				} else {
					Static21.method328(0, Static133.aClass76_1322, local1322);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(2247) Class4_Sub8 local2247;
			if (Static48.anInt1230 == 78) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method556();
				local2247 = Static52.method946(local131);
				local2247.anInt530 = 3;
				local2247.anInt516 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3.method634();
				Static63.method1095(local2247);
				Static48.anInt1230 = -1;
				return true;
			}
			@Pc(2429) long local2429;
			if (Static48.anInt1230 == 210) {
				local131 = Static30.anInt1437 + Static24.aClass4_Sub10_Sub1_1.anInt931;
				local135 = Static24.aClass4_Sub10_Sub1_1.method604();
				local273 = Static24.aClass4_Sub10_Sub1_1.method604();
				if (Static6.anInt132 != local135) {
					Static6.anInt132 = local135;
					Static79.method559(Static6.anInt132);
					Static96.method1543(Static6.anInt132);
					for (local151 = 0; local151 < 100; local151++) {
						Static70.aBooleanArray9[local151] = true;
					}
				}
				while (local273-- > 0) {
					local151 = Static24.aClass4_Sub10_Sub1_1.method549();
					local185 = Static24.aClass4_Sub10_Sub1_1.method604();
					local191 = Static24.aClass4_Sub10_Sub1_1.method599();
					@Pc(2333) Class4_Sub14 local2333 = (Class4_Sub14) Static42.aClass28_3.method770((long) local151);
					if (local2333 != null && local185 != local2333.anInt1980) {
						Static126.method1909(true, local2333);
						local2333 = null;
					}
					if (local2333 == null) {
						local2333 = Static119.method1803(local191, local151, local185);
					}
					local2333.aBoolean121 = true;
				}
				for (local1491 = (Class4_Sub14) Static42.aClass28_3.method775(); local1491 != null; local1491 = (Class4_Sub14) Static42.aClass28_3.method771()) {
					if (local1491.aBoolean121) {
						local1491.aBoolean121 = false;
					} else {
						Static126.method1909(true, local1491);
					}
				}
				Static114.aClass28_11 = new Class28(512);
				while (local131 > Static24.aClass4_Sub10_Sub1_1.anInt931) {
					local185 = Static24.aClass4_Sub10_Sub1_1.method549();
					local191 = Static24.aClass4_Sub10_Sub1_1.method604();
					local195 = Static24.aClass4_Sub10_Sub1_1.method604();
					local614 = Static24.aClass4_Sub10_Sub1_1.method549();
					for (local623 = local191; local623 <= local195; local623++) {
						local2429 = (long) local623 + ((long) local185 << 32);
						Static114.aClass28_11.method774(local2429, new Class4_Sub3(local614));
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 23) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method549();
				local135 = Static24.aClass4_Sub10_Sub1_1.method604();
				if (local131 < -70000) {
					local135 += 32768;
				}
				if (local131 < 0) {
					local143 = null;
				} else {
					local143 = Static52.method946(local131);
				}
				while (Static24.aClass4_Sub10_Sub1_1.anInt931 < Static30.anInt1437) {
					local191 = 0;
					local151 = Static24.aClass4_Sub10_Sub1_1.method568();
					local185 = Static24.aClass4_Sub10_Sub1_1.method604();
					if (local185 != 0) {
						local191 = Static24.aClass4_Sub10_Sub1_1.method599();
						if (local191 == 255) {
							local191 = Static24.aClass4_Sub10_Sub1_1.method549();
						}
					}
					if (local143 != null && local151 >= 0 && local143.anIntArray71.length > local151) {
						local143.anIntArray71[local151] = local185;
						local143.anIntArray66[local151] = local191;
					}
					Static60.method1036(local191, local151, local185 - 1, local135);
				}
				if (local143 != null) {
					Static63.method1095(local143);
				}
				Static127.method1918();
				Static66.anIntArray227[Static58.anInt1530++ & 0x1F] = local135 & 0x7FFF;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 0) {
				Static41.anInt1147 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static82.anInt2015 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 226) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method604();
				local135 = Static24.aClass4_Sub10_Sub1_1.method556();
				if (local131 == 65535) {
					local131 = -1;
				}
				local273 = Static24.aClass4_Sub10_Sub1_1.method557();
				local1605 = Static52.method946(local135);
				@Pc(2626) Class4_Sub4_Sub7 local2626;
				if (local1605.aBoolean37) {
					local1605.anInt477 = local131;
					local1605.anInt462 = local273;
					local2626 = Static61.method1040(local131);
					local1605.anInt509 = local2626.anInt1253;
					local1605.anInt503 = local2626.anInt1266;
					local1605.anInt526 = local2626.anInt1257;
					local1605.anInt470 = local2626.anInt1248;
					if (local1605.anInt513 > 0) {
						local1605.anInt503 = local1605.anInt503 * 32 / local1605.anInt513;
					}
					local1605.anInt510 = local2626.anInt1249;
					local1605.anInt478 = local2626.anInt1247;
					Static63.method1095(local1605);
				} else if (local131 == -1) {
					local1605.anInt530 = 0;
					Static48.anInt1230 = -1;
					return true;
				} else {
					local2626 = Static61.method1040(local131);
					local1605.anInt509 = local2626.anInt1253;
					local1605.anInt503 = local2626.anInt1266 * 100 / local273;
					local1605.anInt470 = local2626.anInt1248;
					local1605.anInt530 = 4;
					local1605.anInt516 = local131;
					Static63.method1095(local1605);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 153) {
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				local273 = Static24.aClass4_Sub10_Sub1_1.method604();
				@Pc(2728) byte local2728 = Static24.aClass4_Sub10_Sub1_1.method579();
				local1926 = false;
				if ((Long.MIN_VALUE & local491) != 0L) {
					local1926 = true;
				}
				if (local1926) {
					if (Static17.anInt340 == 0) {
						Static48.anInt1230 = -1;
						return true;
					}
					local491 &= Long.MAX_VALUE;
					for (local191 = 0; local191 < Static17.anInt340 && (Static27.aClass4_Sub22Array62[local191].aLong99 != local491 || Static27.aClass4_Sub22Array62[local191].anInt2436 != local273); local191++) {
					}
					if (local191 < Static17.anInt340) {
						while (Static17.anInt340 - 1 > local191) {
							Static27.aClass4_Sub22Array62[local191] = Static27.aClass4_Sub22Array62[local191 + 1];
							local191++;
						}
						Static17.anInt340--;
						Static27.aClass4_Sub22Array62[Static17.anInt340] = null;
					}
				} else {
					@Pc(2811) Class4_Sub22 local2811 = new Class4_Sub22();
					local2811.aLong99 = local491;
					local2811.aClass76_1144 = Static56.method983(local2811.aLong99);
					local2811.anInt2436 = local273;
					local2811.aByte6 = local2728;
					for (local195 = Static17.anInt340 - 1; local195 >= 0; local195--) {
						local614 = Static27.aClass4_Sub22Array62[local195].aClass76_1144.method1877(local2811.aClass76_1144);
						if (local614 == 0) {
							Static27.aClass4_Sub22Array62[local195].anInt2436 = local273;
							Static27.aClass4_Sub22Array62[local195].aByte6 = local2728;
							if (local491 == Static6.aLong11) {
								Static49.aByte1 = local2728;
							}
							Static48.anInt1230 = -1;
							Static73.anInt1893 = Static36.anInt1031;
							return true;
						}
						if (local614 < 0) {
							break;
						}
					}
					if (Static17.anInt340 >= Static27.aClass4_Sub22Array62.length) {
						Static48.anInt1230 = -1;
						return true;
					}
					for (local614 = Static17.anInt340 - 1; local614 > local195; local614--) {
						Static27.aClass4_Sub22Array62[local614 + 1] = Static27.aClass4_Sub22Array62[local614];
					}
					if (Static17.anInt340 == 0) {
						Static27.aClass4_Sub22Array62 = new Class4_Sub22[100];
					}
					Static27.aClass4_Sub22Array62[local195 + 1] = local2811;
					if (Static6.aLong11 == local491) {
						Static49.aByte1 = local2728;
					}
					Static17.anInt340++;
				}
				Static48.anInt1230 = -1;
				Static73.anInt1893 = Static36.anInt1031;
				return true;
			}
			if (Static48.anInt1230 == 103) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method604();
				local135 = Static24.aClass4_Sub10_Sub1_1.method599();
				local273 = Static24.aClass4_Sub10_Sub1_1.method604();
				Static92.method1498(local131, local273, local135);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 143) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method556();
				Static134.aClass24_8 = Static121.aClass14_3.method185(local131);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 245) {
				Static45.anInt1192 = Static30.anInt1437 / 8;
				for (local131 = 0; local131 < Static45.anInt1192; local131++) {
					Static31.aLongArray17[local131] = Static24.aClass4_Sub10_Sub1_1.method605();
					Static75.aClass76Array20[local131] = Static56.method983(Static31.aLongArray17[local131]);
				}
				Static48.anInt1230 = -1;
				Static72.anInt1883 = Static36.anInt1031;
				return true;
			}
			if (Static48.anInt1230 == 186) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				local135 = Static24.aClass4_Sub10_Sub1_1.method549();
				Static7.anIntArray19[local131] = local135;
				if (local135 != Static124.anIntArray393[local131]) {
					Static124.anIntArray393[local131] = local135;
					Static98.method1575(local131);
				}
				Static90.anIntArray298[Static57.anInt1490++ & 0x1F] = local131;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 189) {
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				Static24.aClass4_Sub10_Sub1_1.method579();
				local1161 = Static24.aClass4_Sub10_Sub1_1.method605();
				local1166 = Static24.aClass4_Sub10_Sub1_1.method604();
				@Pc(3077) long local3077 = (long) Static24.aClass4_Sub10_Sub1_1.method572();
				local2429 = local3077 + (local1166 << 32);
				local623 = Static24.aClass4_Sub10_Sub1_1.method599();
				@Pc(3089) boolean local3089 = false;
				for (@Pc(3091) int local3091 = 0; local3091 < 100; local3091++) {
					if (local2429 == Static27.aLongArray67[local3091]) {
						local3089 = true;
						break;
					}
				}
				if (local623 <= 1) {
					for (local714 = 0; local714 < Static45.anInt1192; local714++) {
						if (Static31.aLongArray17[local714] == local491) {
							local3089 = true;
							break;
						}
					}
				}
				if (!local3089 && anInt811 == 0) {
					Static27.aLongArray67[Static64.anInt1655] = local2429;
					Static64.anInt1655 = (Static64.anInt1655 + 1) % 100;
					@Pc(3159) Class76 local3159 = Static83.method1328(Static104.method1601(Static24.aClass4_Sub10_Sub1_1).method1871());
					if (local623 == 2 || local623 == 3) {
						Static34.method618(local3159, 9, Static56.method983(local1161).method1858(), Static59.method1017(new Class76[] { Static111.aClass76_1148, Static56.method983(local491).method1858() }));
					} else if (local623 == 1) {
						Static34.method618(local3159, 9, Static56.method983(local1161).method1858(), Static59.method1017(new Class76[] { Static65.aClass76_173, Static56.method983(local491).method1858() }));
					} else {
						Static34.method618(local3159, 9, Static56.method983(local1161).method1858(), Static56.method983(local491).method1858());
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 43) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method604();
				Static105.method1613(local131);
				Static66.anIntArray227[Static58.anInt1530++ & 0x1F] = local131 & 0x7FFF;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 221) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method591();
				local135 = Static24.aClass4_Sub10_Sub1_1.method574();
				local273 = Static24.aClass4_Sub10_Sub1_1.method554();
				local1605 = Static52.method946(local273);
				local185 = local135 + local1605.anInt474;
				local191 = local1605.anInt496 + local131;
				if (local185 != local1605.anInt457 || local191 != local1605.anInt491) {
					local1605.anInt457 = local185;
					local1605.anInt491 = local191;
					Static63.method1095(local1605);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 113) {
				Static73.anInt1893 = Static36.anInt1031;
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				if (local491 == 0L) {
					Static48.anInt1230 = -1;
					Static59.aClass76_644 = null;
					Static27.aClass4_Sub22Array62 = null;
					Static105.aClass76_1100 = null;
					Static17.anInt340 = 0;
					return true;
				}
				local1161 = Static24.aClass4_Sub10_Sub1_1.method605();
				Static59.aClass76_644 = Static56.method983(local1161);
				Static105.aClass76_1100 = Static56.method983(local491);
				Static60.aByte2 = Static24.aClass4_Sub10_Sub1_1.method579();
				local185 = Static24.aClass4_Sub10_Sub1_1.method599();
				if (local185 == 255) {
					Static48.anInt1230 = -1;
					return true;
				}
				Static17.anInt340 = local185;
				@Pc(3394) Class4_Sub22[] local3394 = new Class4_Sub22[100];
				for (local195 = 0; local195 < Static17.anInt340; local195++) {
					local3394[local195] = new Class4_Sub22();
					local3394[local195].aLong99 = Static24.aClass4_Sub10_Sub1_1.method605();
					local3394[local195].aClass76_1144 = Static56.method983(local3394[local195].aLong99);
					local3394[local195].anInt2436 = Static24.aClass4_Sub10_Sub1_1.method604();
					local3394[local195].aByte6 = Static24.aClass4_Sub10_Sub1_1.method579();
					if (local3394[local195].aLong99 == Static6.aLong11) {
						Static49.aByte1 = local3394[local195].aByte6;
					}
				}
				local660 = Static17.anInt340;
				while (local660 > 0) {
					@Pc(3467) boolean local3467 = true;
					local660--;
					for (local1180 = 0; local1180 < local660; local1180++) {
						if (local3394[local1180].aClass76_1144.method1877(local3394[local1180 + 1].aClass76_1144) > 0) {
							@Pc(3492) Class4_Sub22 local3492 = local3394[local1180];
							local3467 = false;
							local3394[local1180] = local3394[local1180 + 1];
							local3394[local1180 + 1] = local3492;
						}
					}
					if (local3467) {
						break;
					}
				}
				Static27.aClass4_Sub22Array62 = local3394;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 158) {
				for (local131 = 0; local131 < Static59.anInt1539; local131++) {
					@Pc(3542) Class4_Sub4_Sub4 local3542 = Static38.method735(local131);
					if (local3542 != null && local3542.anInt716 == 0) {
						Static7.anIntArray19[local131] = 0;
						Static124.anIntArray393[local131] = 0;
					}
				}
				Static127.method1918();
				Static48.anInt1230 = -1;
				Static57.anInt1490 += 32;
				return true;
			}
			if (Static48.anInt1230 == 173) {
				Static66.method1112();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 194) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method563();
				local135 = Static24.aClass4_Sub10_Sub1_1.method554();
				local143 = Static52.method946(local135);
				if (local143.anInt530 != 2 || local143.anInt516 != local131) {
					local143.anInt530 = 2;
					local143.anInt516 = local131;
					Static63.method1095(local143);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 108 || Static48.anInt1230 == 234 || Static48.anInt1230 == 92 || Static48.anInt1230 == 187 || Static48.anInt1230 == 109 || Static48.anInt1230 == 70 || Static48.anInt1230 == 107 || Static48.anInt1230 == 138 || Static48.anInt1230 == 21 || Static48.anInt1230 == 46 || Static48.anInt1230 == 114) {
				Static106.method1617();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 230) {
				Static82.anInt2015 = Static24.aClass4_Sub10_Sub1_1.method596();
				Static41.anInt1147 = Static24.aClass4_Sub10_Sub1_1.method598();
				for (local131 = Static82.anInt2015; local131 < Static82.anInt2015 + 8; local131++) {
					for (local135 = Static41.anInt1147; local135 < Static41.anInt1147 + 8; local135++) {
						if (Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local131][local135] != null) {
							Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local131][local135] = null;
							Static98.method1570(local131, local135);
						}
					}
				}
				for (@Pc(3721) Class4_Sub15 local3721 = (Class4_Sub15) Static9.aClass78_2.method1916(); local3721 != null; local3721 = (Class4_Sub15) Static9.aClass78_2.method1920()) {
					if (local3721.anInt2044 >= Static82.anInt2015 && local3721.anInt2044 < Static82.anInt2015 + 8 && Static41.anInt1147 <= local3721.anInt2048 && local3721.anInt2048 < Static41.anInt1147 + 8 && local3721.anInt2043 == Static124.anInt2712) {
						local3721.anInt2042 = 0;
					}
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 219) {
				Static41.anInt1147 = Static24.aClass4_Sub10_Sub1_1.method594();
				Static82.anInt2015 = Static24.aClass4_Sub10_Sub1_1.method596();
				while (Static30.anInt1437 > Static24.aClass4_Sub10_Sub1_1.anInt931) {
					Static48.anInt1230 = Static24.aClass4_Sub10_Sub1_1.method599();
					Static106.method1617();
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 199) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method556();
				local2247 = Static52.method946(local131);
				for (local273 = 0; local273 < local2247.anIntArray71.length; local273++) {
					local2247.anIntArray71[local273] = -1;
					local2247.anIntArray71[local273] = 0;
				}
				Static63.method1095(local2247);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 236) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method557();
				local135 = Static24.aClass4_Sub10_Sub1_1.method563();
				local273 = local135 >> 10 & 0x1F;
				local151 = local135 >> 5 & 0x1F;
				local185 = local135 & 0x1F;
				local191 = (local185 << 3) + (local273 << 19) + (local151 << 11);
				@Pc(3884) Class4_Sub8 local3884 = Static52.method946(local131);
				if (local3884.anInt532 != local191) {
					local3884.anInt532 = local191;
					Static63.method1095(local3884);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 131) {
				Static21.anInt501 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static45.anInt1195 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static26.anInt573 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 154) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method549();
				local135 = Static24.aClass4_Sub10_Sub1_1.method589();
				local273 = Static24.aClass4_Sub10_Sub1_1.method563();
				local151 = Static24.aClass4_Sub10_Sub1_1.method589();
				@Pc(3940) Class4_Sub8 local3940 = Static52.method946(local131);
				if (local135 != local3940.anInt509 || local3940.anInt470 != local273 || local151 != local3940.anInt503) {
					local3940.anInt503 = local151;
					local3940.anInt470 = local273;
					local3940.anInt509 = local135;
					Static63.method1095(local3940);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 117) {
				local491 = Static24.aClass4_Sub10_Sub1_1.method605();
				@Pc(3992) Class76 local3992 = Static83.method1328(Static104.method1601(Static24.aClass4_Sub10_Sub1_1).method1871());
				Static21.method328(6, Static56.method983(local491).method1858(), local3992);
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 125) {
				Static20.method303();
				Static48.anInt1230 = -1;
				return false;
			}
			if (Static48.anInt1230 == 126) {
				Static125.aBoolean155 = true;
				Static77.anInt1961 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static95.anInt2208 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static107.anInt2360 = Static24.aClass4_Sub10_Sub1_1.method604();
				Static102.anInt2315 = Static24.aClass4_Sub10_Sub1_1.method599();
				Static3.anInt2205 = Static24.aClass4_Sub10_Sub1_1.method599();
				if (Static3.anInt2205 >= 100) {
					Static120.anInt2582 = Static95.anInt2208 * 128 + 64;
					Static106.anInt2354 = Static77.anInt1961 * 128 + 64;
					Static96.anInt2222 = Static67.method1133(Static124.anInt2712, Static106.anInt2354, Static120.anInt2582) - Static107.anInt2360;
				}
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 150) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				@Pc(4083) byte local4083 = Static24.aClass4_Sub10_Sub1_1.method576();
				Static7.anIntArray19[local131] = local4083;
				if (Static124.anIntArray393[local131] != local4083) {
					Static124.anIntArray393[local131] = local4083;
					Static98.method1575(local131);
				}
				Static90.anIntArray298[Static57.anInt1490++ & 0x1F] = local131;
				Static48.anInt1230 = -1;
				return true;
			}
			if (Static48.anInt1230 == 12) {
				local131 = Static24.aClass4_Sub10_Sub1_1.method593();
				local135 = Static24.aClass4_Sub10_Sub1_1.method554();
				local143 = Static52.method946(local135);
				if (local143.anInt530 != 1 || local131 != local143.anInt516) {
					local143.anInt530 = 1;
					local143.anInt516 = local131;
					Static63.method1095(local143);
				}
				Static48.anInt1230 = -1;
				return true;
			}
			Static102.method1593("T1 - " + Static48.anInt1230 + "," + Static5.anInt127 + "," + Static72.anInt1884 + " - " + Static30.anInt1437, null);
			Static20.method303();
		} catch (@Pc(4179) IOException local4179) {
			Static93.method1501();
		} catch (@Pc(4183) Exception local4183) {
			@Pc(4223) String local4223 = "T2 - " + Static48.anInt1230 + "," + Static5.anInt127 + "," + Static72.anInt1884 + " - " + Static30.anInt1437 + "," + (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0] + Static51.anInt2080) + "," + (Static64.anInt1649 + Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]) + " - ";
			for (local135 = 0; local135 < Static30.anInt1437 && local135 < 50; local135++) {
				local4223 = local4223 + Static24.aClass4_Sub10_Sub1_1.aByteArray17[local135] + ",";
			}
			Static102.method1593(local4223, local4183);
			Static20.method303();
		}
		return true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!k;IIII)V")
	public static void method479(@OriginalArg(1) Class4_Sub4_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub1 local7 = new Class4_Sub1();
		local7.anInt123 = arg0.anInt1509;
		local7.anInt105 = arg0.anInt1519;
		local7.anIntArray17 = arg0.anIntArray189;
		local7.anInt126 = arg4 * 128;
		local7.anInt118 = arg1 * 128;
		local7.anInt107 = arg3;
		@Pc(40) int local40 = arg0.anInt1498;
		local7.anInt128 = arg0.anInt1484;
		@Pc(47) int local47 = arg0.anInt1505;
		if (arg2 == 1 || arg2 == 3) {
			local40 = arg0.anInt1505;
			local47 = arg0.anInt1498;
		}
		local7.anInt116 = arg0.anInt1499 * 128;
		local7.anInt109 = (local47 + arg4) * 128;
		local7.anInt108 = (local40 + arg1) * 128;
		if (arg0.anIntArray192 != null) {
			local7.aClass4_Sub4_Sub8_1 = arg0;
			local7.method74();
		}
		Static56.aClass78_6.method1914(local7);
		if (local7.anIntArray17 != null) {
			local7.anInt110 = local7.anInt105 + (int) (Math.random() * (double) (local7.anInt128 - local7.anInt105));
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLclient!dd;I)I")
	public static int method480(@OriginalArg(1) Class4_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray6 == null || arg0.anIntArrayArray6.length <= arg1) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg0.anIntArrayArray6[arg1];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local31;
				}
				if (local40 == 1) {
					local42 = Static78.anIntArray266[local29[local33++]];
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 2) {
					local42 = Static8.anIntArray21[local29[local33++]];
				}
				if (local40 == 3) {
					local42 = Static52.anIntArray167[local29[local33++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class4_Sub8 local123;
				@Pc(128) int local128;
				@Pc(140) int local140;
				if (local40 == 4) {
					local112 = local29[local33++] << 16;
					@Pc(119) int local119 = local112 + local29[local33++];
					local123 = Static52.method946(local119);
					local128 = local29[local33++];
					if (local128 != -1 && (!Static61.method1040(local128).aBoolean75 || Static68.aBoolean108)) {
						for (local140 = 0; local140 < local123.anIntArray71.length; local140++) {
							if (local128 + 1 == local123.anIntArray71[local140]) {
								local42 += local123.anIntArray66[local140];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static124.anIntArray393[local29[local33++]];
				}
				if (local40 == 6) {
					local42 = Class17.anIntArray61[Static8.anIntArray21[local29[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static124.anIntArray393[local29[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1461;
				}
				if (local40 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (Static103.aBooleanArray14[local112]) {
							local42 += Static8.anIntArray21[local112];
						}
					}
				}
				if (local40 == 10) {
					local112 = local29[local33++] << 16;
					local112 += local29[local33++];
					local123 = Static52.method946(local112);
					local128 = local29[local33++];
					if (local128 != -1 && (!Static61.method1040(local128).aBoolean75 || Static68.aBoolean108)) {
						for (local140 = 0; local140 < local123.anIntArray71.length; local140++) {
							if (local128 + 1 == local123.anIntArray71[local140]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static87.anInt1968;
				}
				if (local40 == 12) {
					local42 = Static39.anInt1126;
				}
				if (local40 == 13) {
					local112 = Static124.anIntArray393[local29[local33++]];
					@Pc(342) int local342 = local29[local33++];
					local42 = (local112 & 0x1 << local342) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local112 = local29[local33++];
					local42 = Static67.method1125(local112);
				}
				if (local40 == 18) {
					local42 = (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7) + Static51.anInt2080;
				}
				if (local40 == 19) {
					local42 = (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7) + Static64.anInt1649;
				}
				if (local40 == 20) {
					local42 = local29[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local31 += local42;
					}
					if (local35 == 1) {
						local31 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local31 /= local42;
					}
					if (local35 == 3) {
						local31 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(444) Exception local444) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)V")
	public static void method481() {
		if (Static92.aClass55_1 != null) {
			@Pc(3) Class55 local3 = Static92.aClass55_1;
			synchronized (Static92.aClass55_1) {
				Static92.aClass55_1 = null;
			}
		}
	}
}
