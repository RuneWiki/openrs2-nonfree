import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt4136;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!c;")
	public static Class10 aClass10_141;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!ca;")
	public static Class11 aClass11_8;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1244 = Static38.method685("Art");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1245 = Static38.method685("scape main");

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1246 = Static38.method685("scroll:");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1247 = aClass6_1246;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1248 = aClass6_1246;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1249 = Static38.method685("b12_full");

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1250 = Static38.method685("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method2769() {
		aClass6_1249 = null;
		aClass10_141 = null;
		aClass11_8 = null;
		aClass6_1246 = null;
		aClass6_1244 = null;
		aClass6_1248 = null;
		anIntArray400 = null;
		anIntArray401 = null;
		aClass6_1250 = null;
		anIntArray402 = null;
		aClass6_1247 = null;
		aClass6_1245 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static36.method641(arg6)) {
			Static51.method914(arg1, arg5, Static180.aClass87ArrayArray1[arg6], arg0, arg2, -1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ai;Lclient!ai;Lclient!ai;ZI)V")
	public static void method2771(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static21.anIntArray28[local7] = Static21.anIntArray28[local7 - 1];
			Static56.aClass6Array14[local7] = Static56.aClass6Array14[local7 - 1];
			Static24.aClass6Array3[local7] = Static24.aClass6Array3[local7 - 1];
			Static156.aClass6Array18[local7] = Static156.aClass6Array18[local7 - 1];
		}
		Static152.anInt3507++;
		Static21.anIntArray28[0] = arg3;
		Static112.anInt2718 = Static7.anInt124;
		Static56.aClass6Array14[0] = arg1;
		Static24.aClass6Array3[0] = arg2;
		Static156.aClass6Array18[0] = arg0;
	}
}
