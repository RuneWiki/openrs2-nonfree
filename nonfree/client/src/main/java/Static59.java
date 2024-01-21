import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
	public static boolean aBoolean73;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!ff;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!qe;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_956 = Static106.method1849("blaugr-Un:");

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!sc;")
	private static Class66 aClass66_960 = Static106.method1849("Members only world");

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_957 = aClass66_960;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_958 = Static106.method1849("Fps:");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_959 = Static106.method1849("Weiter");

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public static int anInt1826 = 0;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Lclient!sc;")
	private static Class66 aClass66_961 = Static106.method1849("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public static int anInt1827 = 0;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_962 = aClass66_961;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_963 = Static106.method1849("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1278() {
		Static82.aClass60_64.method1747();
		Static38.aClass60_88.method1747();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1279() {
		Static41.aClass60_43.method1747();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sf;Lclient!sc;BLclient!sf;Lclient!sc;)Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 method1280(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) Class66 arg3) {
		@Pc(12) int local12 = arg2.method122(arg3);
		@Pc(18) int local18 = arg2.method116(local12, arg1);
		return Static1.method43(local12, arg2, arg0, local18);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1281() {
		aClass66_962 = null;
		aClass66_957 = null;
		aClass3_1 = null;
		aClass66_960 = null;
		aClass58_1 = null;
		aClass66_956 = null;
		aClass66_958 = null;
		aClass66_961 = null;
		aClass66_959 = null;
		aClass66_963 = null;
	}
}
