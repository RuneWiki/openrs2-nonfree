import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!td;")
	public static Class54 aClass54_16;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt807;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	public static int anInt808;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!fc;")
	public static Class21 aClass21_15 = new Class21(64);

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!hb;")
	private static Class27 aClass27_395 = Static87.method1648(" is already on your friend list");

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_392 = aClass27_395;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
	public static int[] anIntArray151 = new int[500];

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!hb;")
	private static Class27 aClass27_394 = Static87.method1648("Service unavailable)3");

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_393 = aClass27_394;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt809 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt810 = 0;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public static int anInt811 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!m;)Z")
	public static boolean method665(@OriginalArg(1) Class3_Sub3_Sub6 arg0) {
		@Pc(6) int local6 = arg0.anInt1601;
		if (Static90.anInt2496 == 2) {
			if (local6 == 201) {
				Static45.aClass27_173 = Static73.aClass27_935;
				Static45.aClass27_175 = Static45.aClass27_182;
				Static7.anInt175 = 1;
				Static13.aBoolean40 = true;
				Static68.anInt1744 = 0;
				Static97.aBoolean112 = true;
			}
			if (local6 == 202) {
				Static13.aBoolean40 = true;
				Static68.anInt1744 = 0;
				Static45.aClass27_175 = Static45.aClass27_182;
				Static97.aBoolean112 = true;
				Static45.aClass27_173 = Static12.aClass27_147;
				Static7.anInt175 = 2;
			}
		}
		if (local6 == 205) {
			Static104.anInt2721 = 250;
			return true;
		}
		if (local6 == 501) {
			Static45.aClass27_175 = Static45.aClass27_182;
			Static45.aClass27_173 = Static52.aClass27_675;
			Static7.anInt175 = 4;
			Static68.anInt1744 = 0;
			Static13.aBoolean40 = true;
			Static97.aBoolean112 = true;
		}
		if (local6 == 502) {
			Static45.aClass27_173 = Static53.aClass27_694;
			Static45.aClass27_175 = Static45.aClass27_182;
			Static68.anInt1744 = 0;
			Static97.aBoolean112 = true;
			Static13.aBoolean40 = true;
			Static7.anInt175 = 5;
		}
		@Pc(102) int local102;
		@Pc(96) int local96;
		if (local6 >= 300 && local6 <= 313) {
			local96 = local6 & 0x1;
			local102 = (local6 - 300) / 2;
			Static81.aClass15_1.method341(local102, local96 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local102 = (local6 - 314) / 2;
			local96 = local6 & 0x1;
			Static81.aClass15_1.method340(local96 == 1, local102);
		}
		if (local6 == 324) {
			Static81.aClass15_1.method337(false);
		}
		if (local6 == 325) {
			Static81.aClass15_1.method337(true);
		}
		if (local6 == 326) {
			Static78.aClass3_Sub11_Sub1_3.method1478(157);
			Static81.aClass15_1.method339(Static78.aClass3_Sub11_Sub1_3);
			return true;
		}
		if (local6 == 620) {
			Static13.aBoolean41 = !Static13.aBoolean41;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static73.method1340();
			if (Static45.aClass27_178.method765() > 0) {
				Static78.aClass3_Sub11_Sub1_3.method1478(78);
				Static78.aClass3_Sub11_Sub1_3.method1468(Static45.aClass27_178.method758());
				Static78.aClass3_Sub11_Sub1_3.method1443(local6 - 601);
				Static78.aClass3_Sub11_Sub1_3.method1443(Static13.aBoolean41 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method666() {
		aClass27_395 = null;
		aClass54_16 = null;
		anIntArray151 = null;
		aClass27_392 = null;
		aClass27_393 = null;
		aClass21_15 = null;
		aClass27_394 = null;
	}
}
