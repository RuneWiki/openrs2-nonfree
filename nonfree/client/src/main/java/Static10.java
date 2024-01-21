import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	public static int anInt260;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!be", name = "Cb", descriptor = "[Lclient!mc;")
	public static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "Lclient!na;")
	public static Class53 aClass53_106 = Static109.method1737("http:)4)4");

	@OriginalMember(owner = "client!be", name = "bb", descriptor = "Lclient!na;")
	public static Class53 aClass53_107 = Static109.method1737("scape main");

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Lclient!na;")
	private static Class53 aClass53_108 = Static109.method1737("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!be", name = "db", descriptor = "Lclient!na;")
	public static Class53 aClass53_109 = aClass53_108;

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "Lclient!na;")
	public static Class53 aClass53_110 = Static109.method1737("Abbrechen");

	@OriginalMember(owner = "client!be", name = "Lb", descriptor = "[Lclient!jf;")
	public static Class3_Sub1_Sub4_Sub1_Sub2[] aClass3_Sub1_Sub4_Sub1_Sub2Array1 = new Class3_Sub1_Sub4_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method164() {
		aClass53_109 = null;
		aClass53_106 = null;
		aClass53_110 = null;
		aClass49Array1 = null;
		anIntArray26 = null;
		aClass3_Sub1_Sub4_Sub1_Sub2Array1 = null;
		aClass53_108 = null;
		aClass53_107 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
	public static void method165(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static88.method1454(Static98.aClass53_1121, Static86.aClass53_965, Static69.aClass53_792);
		} else if (arg0 == -2) {
			Static88.method1454(Static5.aClass53_75, Static86.aClass53_964, Static86.aClass53_985);
		} else if (arg0 == -1) {
			Static88.method1454(Static98.aClass53_1125, Static86.aClass53_969, Static98.aClass53_1122);
		} else if (arg0 == 3) {
			Static88.method1454(Static80.aClass53_924, Static86.aClass53_977, Static86.aClass53_966);
		} else if (arg0 == 4) {
			Static88.method1454(Static126.aClass53_1044, Static86.aClass53_974, Static15.aClass53_131);
		} else if (arg0 == 5) {
			Static88.method1454(Static48.aClass53_598, Static86.aClass53_949, Static27.aClass53_356);
		} else if (arg0 == 6) {
			Static88.method1454(Static88.aClass53_1014, Static86.aClass53_981, Static79.aClass53_897);
		} else if (arg0 == 7) {
			Static88.method1454(Static100.aClass53_1143, Static86.aClass53_975, Static89.aClass53_1020);
		} else if (arg0 == 8) {
			Static88.method1454(Static71.aClass53_799, Static86.aClass53_967, Static22.aClass53_277);
		} else if (arg0 == 9) {
			Static88.method1454(Static53.aClass53_997, Static86.aClass53_973, Static126.aClass53_1049);
		} else if (arg0 == 10) {
			Static88.method1454(Static80.aClass53_925, Static86.aClass53_963, Static22.aClass53_274);
		} else if (arg0 == 11) {
			Static88.method1454(Static32.aClass53_433, Static86.aClass53_957, Static19.aClass53_1209);
		} else if (arg0 == 12) {
			Static88.method1454(Static105.aClass53_1215, Static86.aClass53_978, Static124.aClass53_1446);
		} else if (arg0 == 13) {
			Static88.method1454(Static98.aClass53_1130, Static86.aClass53_980, Static86.aClass53_955);
		} else if (arg0 == 14) {
			Static88.method1454(Static103.aClass53_1196, Static86.aClass53_952, Static103.aClass53_1197);
		} else if (arg0 == 16) {
			Static88.method1454(Static35.aClass53_477, Static86.aClass53_983, Static87.aClass53_1001);
		} else if (arg0 == 17) {
			Static88.method1454(Static90.aClass53_1027, Static86.aClass53_989, Static49.aClass53_613);
		} else if (arg0 == 18) {
			Static88.method1454(Static18.aClass53_176, Static86.aClass53_988, aClass53_109);
		} else if (arg0 == 19) {
			Static88.method1454(Static78.aClass53_882, Static100.aClass53_1146, Static97.aClass53_1112);
		} else if (arg0 == 20) {
			Static88.method1454(Static98.aClass53_1133, Static86.aClass53_979, Static88.aClass53_1008);
		} else if (arg0 == 22) {
			Static88.method1454(Static63.aClass53_722, Static86.aClass53_961, Static121.aClass53_1400);
		} else if (arg0 == 23) {
			Static88.method1454(Static103.aClass53_1194, Static86.aClass53_984, Static44.aClass53_560);
		} else if (arg0 == 24) {
			Static88.method1454(Static75.aClass53_843, Static86.aClass53_976, Static91.aClass53_1056);
		} else if (arg0 == 25) {
			Static88.method1454(Static98.aClass53_1124, Static86.aClass53_958, Static79.aClass53_905);
		} else if (arg0 == 26) {
			Static88.method1454(Static98.aClass53_1129, Static86.aClass53_950, Static100.aClass53_1144);
		} else if (arg0 == 27) {
			Static88.method1454(Static2.aClass53_16, Static86.aClass53_959, Static86.aClass53_968);
		} else {
			Static88.method1454(Static98.aClass53_1114, Static86.aClass53_972, Static20.aClass53_256);
		}
		Static103.method1692(10);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
	public static void method172(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static44.method872(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static106.aClass6_3.anApplet1 != null) {
				@Pc(101) Class22 local101 = Static106.aClass6_3.method127(new URL(Static106.aClass6_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static51.anInt1328 + "&u=" + Static22.aLong29 + "&v1=" + Static6.aString3 + "&v2=" + Static6.aString1 + "&e=" + local7));
				while (local101.anInt864 == 0) {
					Static40.method822(1L);
				}
				if (local101.anInt864 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local101.anObject2;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)V")
	public static void method174() {
		for (@Pc(15) Class3_Sub1_Sub4_Sub6 local15 = (Class3_Sub1_Sub4_Sub6) Static105.aClass11_12.method189(); local15 != null; local15 = (Class3_Sub1_Sub4_Sub6) Static105.aClass11_12.method187()) {
			if (Static72.anInt1813 != local15.anInt1770 || local15.aBoolean63) {
				local15.method1962();
			} else if (local15.anInt1768 <= Static27.anInt843) {
				local15.method1197(Static37.anInt2215);
				if (local15.aBoolean63) {
					local15.method1962();
				} else {
					Static120.aClass39_1.method987(local15.anInt1770, local15.anInt1767, local15.anInt1761, local15.anInt1759, 60, local15, 0, -1, false);
				}
			}
		}
	}
}
