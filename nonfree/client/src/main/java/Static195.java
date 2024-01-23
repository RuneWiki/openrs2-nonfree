import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_29;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "[I")
	public static int[] anIntArray540 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1413 = Static200.method3116("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ai;Lclient!ai;Lclient!ai;Lclient!ai;)V")
	public static void method3026(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) Class7 arg3) {
		Static72.aClass7_15 = arg3;
		Static214.aClass7_40 = arg1;
		Static10.aClass7_2 = arg2;
		Static121.aClass7_21 = arg0;
		Static82.aClass6ArrayArray1 = new Class6[Static10.aClass7_2.method3237()][];
		Static87.aBooleanArray13 = new boolean[Static10.aClass7_2.method3237()];
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	public static void method3027(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static93.aClass7_17 = arg0;
		Static25.aClass7_6 = arg1;
		Static197.anInt4207 = Static93.aClass7_17.method3246(3);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)Z")
	public static boolean method3028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static139.method2382(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static125.method2122(local10 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg2] + arg3, local14 + 1) && Static125.method2122(local10 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static125.method2122(local10 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static125.method2122(local10 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
