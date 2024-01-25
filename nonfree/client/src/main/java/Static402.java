import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lclient!ps;")
	public static Interface8 anInterface8_7;

	@OriginalMember(owner = "client!uk", name = "eb", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_96 = new Class267("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5952(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg0); local14 != -1; local14 = arg2.indexOf(arg0, local14 + arg1.length())) {
			arg2 = arg2.substring(0, local14) + arg1 + arg2.substring(local14 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
	public static void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(0, 15);
		local8.method3088();
		local8.anInt3749 = arg1;
		local8.anInt3744 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!he;Lclient!he;Lclient!he;Lclient!he;)V")
	public static void method5959(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class100 arg3) {
		Static333.aClass100_65 = arg1;
		Static378.aClass100_82 = arg0;
		Static314.aClass100_58 = arg2;
		Static352.aClass100_71 = arg3;
		Static35.aClass239ArrayArray1 = new Class239[Static378.aClass100_82.method2516()][];
		Static234.aBooleanArray17 = new boolean[Static378.aClass100_82.method2516()];
	}
}
