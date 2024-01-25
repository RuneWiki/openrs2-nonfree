import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	public static int anInt6517;

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "Lclient!paa;")
	public static Class261 aClass261_1;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
	public static int anInt6526;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString91 = "";

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_83 = new Class154(47, 15);

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString92 = null;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)V")
	public static void method5430() {
		Static220.aClass21_37.method313();
		Static504.aClass21_79.method313();
		Static467.aClass21_73.method313();
		Static539.aClass21_87.method313();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZB)V")
	public static void method5431() {
		@Pc(19) Class2_Sub34 local19 = Static555.method7264(Static503.aClass154_112, Static551.aClass64_2);
		Static100.method1508(local19);
		for (@Pc(29) Class2_Sub33 local29 = (Class2_Sub33) Static346.aClass90_17.method1676(); local29 != null; local29 = (Class2_Sub33) Static346.aClass90_17.method1680()) {
			if (!local29.method7656()) {
				local29 = (Class2_Sub33) Static346.aClass90_17.method1676();
				if (local29 == null) {
					break;
				}
			}
			if (local29.anInt5985 == 0) {
				Static393.method5411(true, local29, true);
			}
		}
		if (Static396.aClass273_10 != null) {
			Static155.method2111(Static396.aClass273_10);
			Static396.aClass273_10 = null;
		}
	}
}
