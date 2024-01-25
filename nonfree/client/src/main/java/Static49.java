import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bw", name = "F", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "F")
	public static float aFloat29 = 1024.0F;

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_22 = new Class252(28, 3);

	@OriginalMember(owner = "client!bw", name = "D", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_26 = new Class45("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
	public static void method1358() {
		Static449.method6956((long) Static445.anInt7791, Static455.aClass4_11);
		if (Static328.anInt6167 != -1) {
			Static159.method2884(Static328.anInt6167);
		}
		for (@Pc(18) int local18 = 0; local18 < Static260.anInt5066; local18++) {
			if (Static258.aBooleanArray17[local18]) {
				Static266.aBooleanArray18[local18] = true;
			}
			Static272.aBooleanArray19[local18] = Static258.aBooleanArray17[local18];
			Static258.aBooleanArray17[local18] = false;
		}
		Static304.anInt5906 = Static445.anInt7791;
		if (Static455.aClass4_11.method7166()) {
			Static27.aBoolean62 = true;
		}
		if (Static328.anInt6167 != -1) {
			Static260.anInt5066 = 0;
			Static362.method7037();
		}
		Static455.aClass4_11.n();
		Static113.method2230(Static455.aClass4_11);
		@Pc(74) int local74 = Static139.method2615();
		if (local74 == -1) {
			local74 = Static245.anInt4711;
		}
		if (local74 == -1) {
			local74 = Static449.anInt7879;
		}
		Static54.method1452(local74);
		Static242.anInt4651 = 0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Z")
	public static boolean method1361(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}
}
