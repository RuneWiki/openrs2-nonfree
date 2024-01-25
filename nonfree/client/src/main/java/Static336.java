import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "Lclient!l;")
	public static Class11 aClass11_17;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	public static int anInt5455 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!sm;)Ljava/lang/String;")
	public static String method4381(@OriginalArg(1) Class7_Sub39 arg0) {
		return arg0.aString60 == null || arg0.aString60.length() <= 0 ? arg0.aString59 : arg0.aString59 + Static322.aClass55_114.method1205(Static5.anInt20) + arg0.aString60;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method4383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static169.method2464(arg2, arg0, arg1, arg3, -1, null, arg4);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIZZ)Lclient!ok;")
	public static Class178 method4384(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class250 local5 = null;
		if (Static215.aClass6_2 != null) {
			local5 = new Class250(arg0, Static215.aClass6_2, Static287.aClass6Array2[arg0], 1000000);
		}
		Static250.aClass4_Sub1Array2[arg0] = Static396.aClass104_1.method2311(local5, arg0, Static249.aClass250_1);
		if (arg2) {
			Static250.aClass4_Sub1Array2[arg0].method5789();
		}
		return new Class178(Static250.aClass4_Sub1Array2[arg0], arg1, 1);
	}
}
