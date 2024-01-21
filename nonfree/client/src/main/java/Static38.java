import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1050;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 aClass1_Sub2_Sub5_Sub4_Sub1_2;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_18 = new Class87(128);

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public static volatile int anInt1049 = -1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_662 = Static118.method2249("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_663 = Static118.method2249(")4l");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Lclient!ni;")
	public static Class1_Sub20 method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub20 local7 = new Class1_Sub20();
		local7.anInt3110 = arg2;
		local7.anInt3111 = arg0;
		Static200.aClass99_14.method3290(local7, (long) arg1);
		Static90.method3299(arg0);
		@Pc(26) Class97 local26 = Static154.method2691(arg1);
		if (local26 != null) {
			Static25.method448(local26);
		}
		if (Static7.aClass97_1 != null) {
			Static25.method448(Static7.aClass97_1);
			Static7.aClass97_1 = null;
		}
		Static198.aBoolean168 = false;
		Static101.anInt2533 = 0;
		Static5.method64(Static197.anInt4258, Static195.anInt4218, Static51.anInt1360, Static71.anInt1742);
		if (local26 != null) {
			Static94.method1781(local26);
		}
		Static47.method811(arg0);
		if (Static28.anInt856 != -1) {
			Static123.method2354(Static28.anInt856, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!sd;Lclient!sd;Lclient!sd;I)V")
	public static void method680(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		Static77.aClass60_18 = arg0;
		Static190.aClass60_38 = arg1;
		Static132.aClass60_27 = arg2;
	}
}
