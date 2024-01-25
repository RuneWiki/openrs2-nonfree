import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!lm;")
	public static Class134 aClass134_56;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!uj;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	public static int anInt2451 = 0;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public static int anInt2452 = 1;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt2453 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ii;IZLclient!wl;ZII)V")
	public static void method2006(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class29 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static350.aClass8_18.method4393((Static26.anInt476 - Static350.aClass8_18.method4381()) / 2, (Static321.anInt6388 - Static350.aClass8_18.method4395()) / 2);
			Static73.aClass8_12.method4393((Static26.anInt476 - Static73.aClass8_12.method4381()) / 2, 18);
		}
		arg3.method3746(Static26.anInt476 / 2, Class10_Sub1_Sub1.lb == 1 ? Static15.aString10 : Static250.aString198, Static321.anInt6388 / 2 - 26, -1, arg1);
		@Pc(56) int local56 = Static321.anInt6388 / 2 - 18;
		arg0.method4275(Static26.anInt476 / 2 - 152, local56, 304, 34, arg4, 0);
		arg0.method4275(Static26.anInt476 / 2 - 151, local56 + 1, 302, 32, 0, 0);
		arg0.method4249(Static26.anInt476 / 2 - 150, local56 + 2, Static185.anInt3839 * 3, 30, arg5, 0);
		arg0.method4249(Static26.anInt476 / 2 + Static185.anInt3839 * 3 - 150, local56 + 2, 300 - Static185.anInt3839 * 3, 30, 0, 0);
		arg3.method3746(Static26.anInt476 / 2, Static159.aString248, Static321.anInt6388 / 2 + 4, -1, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!n;I)V")
	public static void method2007(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) Static102.aClass207_13.method5555((long) arg0.anInt4036);
		if (local15 == null) {
			Static147.method2608(Static127.anInt2487, arg0.anIntArray388[0], 0, arg0.anIntArray387[0], arg0, null, null);
		} else {
			local15.method5364();
		}
	}
}
