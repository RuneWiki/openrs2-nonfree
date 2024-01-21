import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_6;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_133 = Static8.method128("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_134 = Static8.method128("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_135 = Static8.method128("Welt");

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	public static void method243() {
		Static23.aClass66_3.method2604();
	}

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
	public static void method244() {
		aClass18_135 = null;
		aClass16_Sub1_6 = null;
		aClass18_134 = null;
		aClass18_133 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)Z")
	public static boolean method245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(22) Class1_Sub1_Sub11 local22 = Static62.method1274(arg1);
		return local22.method1966(arg0);
	}
}
