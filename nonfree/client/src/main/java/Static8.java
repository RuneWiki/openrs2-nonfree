import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public static int anInt126 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!oi;Lclient!za;Lclient!oi;)V")
	public static void method133(@OriginalArg(1) Class185 arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) Class185 arg2) {
		Static106.aClass252_140 = Static152.method1914(arg2, Static31.anInt478);
		Static300.aClass137_7 = arg1.method5680(Static106.aClass252_140, Static467.method894(arg0, Static31.anInt478));
		Static392.aClass252_121 = Static152.method1914(arg2, Static4.anInt60);
		Static464.aClass137_8 = arg1.method5680(Static392.aClass252_121, Static467.method894(arg0, Static4.anInt60));
		Static15.aClass252_5 = Static152.method1914(arg2, Static2.anInt34);
		Static17.aClass137_5 = arg1.method5680(Static15.aClass252_5, Static467.method894(arg0, Static2.anInt34));
	}
}
