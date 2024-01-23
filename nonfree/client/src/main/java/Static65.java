import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
	public static void method1214() {
		if (Static37.anInt773 == 10 && Static156.aBoolean211) {
			method1215(28);
		}
		if (Static37.anInt773 == 30) {
			method1215(25);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)V")
	public static void method1215(@OriginalArg(1) int arg0) {
		if (Static37.anInt773 == arg0) {
			return;
		}
		if (Static37.anInt773 == 0) {
			Static27.method449();
		}
		if (arg0 == 40) {
			Static145.method2482();
		}
		@Pc(48) boolean local48 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 != 40 && Static179.aClass97_3 != null) {
			Static179.aClass97_3.method2547();
			Static179.aClass97_3 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static63.anInt3251 = 0;
			Static258.anInt4706 = 0;
			Static193.anInt3675 = 0;
			Static242.anInt4408 = 1;
			Static57.anInt1091 = 1;
			Static36.method641(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static250.method3945();
		}
		if (arg0 == 5) {
			Static194.method3153(Static258.aClass121_114);
		} else {
			Static131.method2239();
		}
		@Pc(120) boolean local120 = Static37.anInt773 == 5 || Static37.anInt773 == 10 || Static37.anInt773 == 28;
		if (local48 != local120) {
			if (local48) {
				Static273.anInt4944 = Static37.anInt772;
				if (Static182.anInt3491 == 0) {
					Static252.method3971();
				} else {
					Static288.method4408(Static308.aClass121_135, Static37.anInt772, 255);
				}
				Static66.aClass22_5.method524(false);
			} else {
				Static252.method3971();
				Static66.aClass22_5.method524(true);
			}
		}
		if (Static156.aBoolean211 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static156.method2687();
		}
		Static37.anInt773 = arg0;
	}
}
