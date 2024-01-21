import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4 aClass4_Sub4_Sub5_Sub4_6;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
	public static int anInt2590;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!la;")
	public static Class17 aClass17_39;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!vf;")
	public static Class78 aClass78_13 = new Class78();

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1220 = Static134.method2017("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_1221 = Static134.method2017("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "[I")
	public static int[] anIntArray385 = new int[] { 11, 41, 36, 29, 14, 32, 3, 17 };

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_1222 = Static134.method2017("l");

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	public static int anInt2589 = 0;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_1223 = Static134.method2017("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1804() {
		Static69.aClass4_Sub10_Sub1_2.method611(208);
		Static69.aClass4_Sub10_Sub1_2.method555(0L);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!sb;")
	public static RuntimeException_Sub1 method1805(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString5 = local8.aString5 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method1806() {
		aClass76_1221 = null;
		aClass78_13 = null;
		aClass17_39 = null;
		aClass76_1222 = null;
		aClass4_Sub4_Sub5_Sub4_6 = null;
		aClass76_1220 = null;
		aClass76_1223 = null;
		anIntArray385 = null;
	}
}
