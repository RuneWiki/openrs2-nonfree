import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!te;")
	public static Class75 aClass75_20 = new Class75(64);

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_329 = Static109.method1737("welle:");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_330 = Static109.method1737("Loaded update list");

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_331 = aClass53_330;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_332 = Static109.method1737("::noclip");

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_333 = Static109.method1737("@whi@");

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[5][5000];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method495(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static23.aClass43_1);
		arg0.removeMouseMotionListener(Static23.aClass43_1);
		arg0.removeFocusListener(Static23.aClass43_1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			if (Static94.aClass53Array16[local14] != null) {
				@Pc(24) int local24 = Static82.anIntArray110[local14];
				@Pc(35) int local35 = Static3.anInt80 + 4 + 70 - local12 * 14;
				if (local35 < -20) {
					break;
				}
				@Pc(44) Class53 local44 = Static15.aClass53Array4[local14];
				if (local44 != null && local44.method1291(Static40.aClass53_516)) {
					local44 = local44.method1289(5);
				}
				if (local44 != null && local44.method1291(Static126.aClass53_1045)) {
					local44 = local44.method1289(5);
				}
				if (local24 == 0) {
					local12++;
				}
				if ((local24 == 1 || local24 == 2) && (local24 == 1 || Static68.anInt1720 == 0 || Static68.anInt1720 == 1 && Static125.method1973(local44))) {
					local12++;
					if (arg0 > local35 - 14 && arg0 <= local35 && !local44.method1282(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass53_668)) {
						if (Static105.anInt2436 >= 1) {
							Static59.method1075(14, Static102.aClass53_1164, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
						}
						Static59.method1075(9, Static103.aClass53_1200, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
						Static59.method1075(53, Static76.aClass53_855, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
					}
				}
				if ((local24 == 3 || local24 == 7) && Static91.anInt2195 == 0 && (local24 == 7 || Static9.anInt237 == 0 || Static9.anInt237 == 1 && Static125.method1973(local44))) {
					local12++;
					if (local35 - 14 < arg0 && local35 >= arg0) {
						if (Static105.anInt2436 >= 1) {
							Static59.method1075(14, Static102.aClass53_1164, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
						}
						Static59.method1075(9, Static103.aClass53_1200, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
						Static59.method1075(53, Static76.aClass53_855, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
					}
				}
				if (local24 == 4 && (Static88.anInt2106 == 0 || Static88.anInt2106 == 1 && Static125.method1973(local44))) {
					local12++;
					if (local35 - 14 < arg0 && arg0 <= local35) {
						Static59.method1075(58, Static33.aClass53_910, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
					}
				}
				if ((local24 == 5 || local24 == 6) && Static91.anInt2195 == 0 && Static9.anInt237 < 2) {
					local12++;
				}
				if (local24 == 8 && (Static88.anInt2106 == 0 || Static88.anInt2106 == 1 && Static125.method1973(local44))) {
					if (arg0 > local35 - 14 && arg0 <= local35) {
						Static59.method1075(55, Static103.aClass53_1188, Static103.method1689(new Class53[] { aClass53_333, local44 }), 0, 0, 0);
					}
					local12++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public static void method499() {
		aClass75_20 = null;
		aClass53_331 = null;
		aClass53_333 = null;
		aClass53_332 = null;
		aClass53_329 = null;
		anIntArrayArray5 = null;
		aClass53_330 = null;
	}
}
