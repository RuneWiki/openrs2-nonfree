import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "Lclient!ug;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
	public static int anInt1198;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "Lclient!al;")
	public static final Class11 aClass11_25 = new Class11(8);

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString48 = "Loading title screen - ";

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString49 = "Connecting to update server";

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString50 = " from your friend list first.";

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIILclient!aq;Lclient!aq;)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub2 arg3, @OriginalArg(4) Class10_Sub2 arg4) {
		if (Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static243.method4280(arg0, arg1, arg2);
		}
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub2_2 = arg3;
		Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2].aClass10_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLclient!mo;Lclient!mo;)V")
	public static void method1148(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static328.aClass143_110 = arg1;
		Static171.aClass143_71 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method1149(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static275.method4680(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static116.method2445(local7);
			local7 = Static221.method3972("%3a", local7, ":");
			local7 = Static221.method3972("%40", local7, "@");
			local7 = Static221.method3972("%26", local7, "&");
			local7 = Static221.method3972("%23", local7, "#");
			if (Static103.aClass15_1.anApplet1 != null) {
				@Pc(104) Class205 local104 = Static103.aClass15_1.method272(new URL(Static103.aClass15_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static151.anInt3239 + "&u=" + Static154.aLong101 + "&v1=" + Static12.aString9 + "&v2=" + Static12.aString8 + "&e=" + local7));
				while (local104.anInt6370 == 0) {
					Static15.method5425(1L);
				}
				if (local104.anInt6370 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local104.anObject7;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static222.method3991(arg0, Static112.anInt2485, Static32.anInt750);
		@Pc(22) int local22 = Static222.method3991(arg3, Static112.anInt2485, Static32.anInt750);
		@Pc(28) int local28 = Static222.method3991(arg6, Static275.anInt5244, Static6.anInt136);
		@Pc(34) int local34 = Static222.method3991(arg4, Static275.anInt5244, Static6.anInt136);
		@Pc(42) int local42 = Static222.method3991(arg0 + arg1, Static112.anInt2485, Static32.anInt750);
		@Pc(51) int local51 = Static222.method3991(arg3 - arg1, Static112.anInt2485, Static32.anInt750);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static27.method690(local34, Static104.anIntArrayArray31[local53], arg2, local28);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static27.method690(local34, Static104.anIntArrayArray31[local73], arg2, local28);
		}
		@Pc(96) int local96 = Static222.method3991(arg6 + arg1, Static275.anInt5244, Static6.anInt136);
		@Pc(105) int local105 = Static222.method3991(arg4 - arg1, Static275.anInt5244, Static6.anInt136);
		for (@Pc(107) int local107 = local42; local107 <= local51; local107++) {
			@Pc(113) int[] local113 = Static104.anIntArrayArray31[local107];
			Static27.method690(local96, local113, arg2, local28);
			Static27.method690(local105, local113, arg5, local96);
			Static27.method690(local34, local113, arg2, local105);
		}
	}
}
