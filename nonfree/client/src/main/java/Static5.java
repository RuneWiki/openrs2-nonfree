import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 aClass4_Sub3_Sub6_Sub2_2;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	public static int anInt70;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!hc;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_31 = Static41.method597("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_32 = Static41.method597("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public static int anInt65 = 0;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_33 = Static41.method597(": ");

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!od;")
	private static Class60 aClass60_35 = Static41.method597("Connection timed out)3");

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_34 = aClass60_35;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
	public static int[] anIntArray6 = new int[128];

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_36 = Static41.method597("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_37 = Static41.method597("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
	public static int[] anIntArray7 = new int[1000];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method53() {
		Static76.aClass12_14.method284();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
	public static void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = (arg2 - 32) * arg2 / arg4;
		Static40.aClass4_Sub3_Sub6_Sub2Array4[0].method1558(arg3, arg1);
		if (local7 < 8) {
			local7 = 8;
		}
		Static40.aClass4_Sub3_Sub6_Sub2Array4[1].method1558(arg3, arg1 + arg2 - 16);
		@Pc(41) int local41 = (arg2 - local7 - 32) * arg0 / (arg4 - arg2);
		Static34.method1649(arg3, arg1 + 16, 16, arg2 - 32, Static20.anInt704);
		Static34.method1649(arg3, local41 + arg1 + 16, 16, local7, Static72.anInt1823);
		Static34.method1647(arg3, arg1 + local41 + 16, local7, Static3.anInt38);
		Static34.method1647(arg3 + 1, arg1 - -local41 + 16, local7, Static3.anInt38);
		Static34.method1654(arg3, local41 + arg1 + 16, 16, Static3.anInt38);
		Static34.method1654(arg3, local41 + arg1 + 17, 16, Static3.anInt38);
		Static34.method1647(arg3 + 15, arg1 + 16 - -local41, local7, Static14.anInt514);
		Static34.method1647(arg3 + 14, arg1 + 17 + local41, local7 - 1, Static14.anInt514);
		Static34.method1654(arg3, local7 + arg1 + local41 + 15, 16, Static14.anInt514);
		Static34.method1654(arg3 + 1, local7 + local41 + arg1 + 14, 15, Static14.anInt514);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method55() {
		aClass60_32 = null;
		aClass60_34 = null;
		anIntArray6 = null;
		aClass60_36 = null;
		aClass60_35 = null;
		aClass60_31 = null;
		aClass31_1 = null;
		aClass60_37 = null;
		aClass60_33 = null;
		anIntArray7 = null;
		aClass4_Sub3_Sub6_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static118.method1894(arg0)) {
			Static29.method476(arg5, Static82.aClass4_Sub14ArrayArray1[arg0], arg1, arg2, arg4, -1, arg6, arg3);
		}
	}
}
