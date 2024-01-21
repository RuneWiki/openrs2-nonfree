import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_535 = Static119.method1462("event_opbase");

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!j;")
	public static Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "Lclient!pe;")
	public static Class65 aClass65_536 = Static119.method1462("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ja", name = "Q", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "Lclient!pe;")
	public static Class65 aClass65_537 = Static119.method1462("Spieler");

	@OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
	public static int anInt1201 = 0;

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lclient!jf;")
	public static Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1 = new Class2_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_538 = Static119.method1462("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lclient!pe;")
	public static Class65 aClass65_539 = Static119.method1462("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
	public static int anInt1206 = 0;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public static void method844() {
		aClass65_536 = null;
		aClass65_537 = null;
		aClass65_539 = null;
		aClass39_1 = null;
		aClass65_535 = null;
		aClass65_538 = null;
		aClass2_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)Lclient!wc;")
	public static Class2_Sub1_Sub17 method845(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub1_Sub17 local12 = (Class2_Sub1_Sub17) Static3.aClass8_6.method172((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static35.aClass56_Sub1_11.method1666(0, arg0);
		if (local27 == null) {
			return null;
		}
		local12 = new Class2_Sub1_Sub17();
		@Pc(40) Class2_Sub4 local40 = new Class2_Sub4(local27);
		local40.anInt1298 = local40.aByteArray20.length - 12;
		@Pc(51) int local51 = local40.method903();
		@Pc(53) int local53 = 0;
		local12.anInt2892 = local40.method896();
		local12.anInt2894 = local40.method896();
		local12.anInt2890 = local40.method896();
		local12.anInt2893 = local40.method896();
		local40.anInt1298 = 0;
		local12.aClass65_1252 = local40.method906();
		local12.anIntArray410 = new int[local51];
		local12.anIntArray411 = new int[local51];
		local12.aClass65Array82 = new Class65[local51];
		while (local40.aByteArray20.length - 12 > local40.anInt1298) {
			@Pc(99) int local99 = local40.method896();
			if (local99 == 3) {
				local12.aClass65Array82[local53] = local40.method931();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray410[local53] = local40.method933();
			} else {
				local12.anIntArray410[local53] = local40.method903();
			}
			local12.anIntArray411[local53++] = local99;
		}
		Static3.aClass8_6.method176((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method846() {
		Static39.aFontMetrics1 = null;
		Static101.anImage4 = null;
		Static99.aFont1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
	public static void method847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static106.anInt2390 == 0 || arg1 == 0 || Static50.anInt1215 >= 50) {
			return;
		}
		Static128.anIntArray360[Static50.anInt1215] = arg2;
		Static34.anIntArray99[Static50.anInt1215] = arg1;
		Static110.anIntArray327[Static50.anInt1215] = arg0;
		Static130.aClass44Array1[Static50.anInt1215] = null;
		Static115.anIntArray336[Static50.anInt1215] = 0;
		Static50.anInt1215++;
	}
}
