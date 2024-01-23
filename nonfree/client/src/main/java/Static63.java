import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
	public static int anInt1379;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	public static int[] anIntArray95 = new int[200];

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Loaded defaults";

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "[I")
	public static int[] anIntArray96 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Lclient!eg;Lclient!pk;)V")
	public static void method974(@OriginalArg(1) Class8_Sub1_Sub7_Sub1[] arg0, @OriginalArg(2) Class132 arg1) {
		Static105.aClass8_Sub1_Sub7_Sub1Array2 = arg0;
		Static161.aClass132_56 = arg1;
		Static136.aBooleanArray9 = new boolean[Static105.aClass8_Sub1_Sub7_Sub1Array2.length];
		Static89.aClass129_7.method3047();
		@Pc(23) int local23 = Static161.aClass132_56.method3185("details");
		@Pc(28) int[] local28 = Static161.aClass132_56.method3167(local23);
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			Static89.aClass129_7.method3039(Static25.method433(new Class8_Sub2(Static161.aClass132_56.method3194(local23, local28[local30])), local28[local30]), (long) local28[local30]);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!pk;)V")
	public static void method979(@OriginalArg(1) Class132 arg0) {
		Static13.aClass8_Sub1_Sub7_Sub1Array1 = Static181.method2774(arg0, Static60.anInt1298);
		Static15.aClass8_Sub1_Sub7Array10 = Static269.method3757(Static22.anInt617, arg0);
		Static293.aClass8_Sub1_Sub7Array122 = Static269.method3757(Static114.anInt2338, arg0);
		Static160.aClass8_Sub1_Sub7Array69 = Static269.method3757(Static77.anInt1675, arg0);
		Static184.aClass8_Sub1_Sub7Array80 = Static269.method3757(Static206.anInt4276, arg0);
		Static198.aClass8_Sub1_Sub7Array85 = Static269.method3757(Static167.anInt3365, arg0);
		Static213.aClass8_Sub1_Sub7Array91 = Static269.method3757(Static234.anInt4712, arg0);
		Static241.aClass8_Sub1_Sub7_11 = Static41.method627(arg0, Static121.anInt2429);
		Static10.aClass8_Sub1_Sub7Array3 = Static275.method4086(arg0, Static201.anInt4151);
		Static64.aClass8_Sub1_Sub7Array30 = Static275.method4086(arg0, Static270.anInt5335);
		Static267.aClass43Array5 = Static137.method1334(arg0, Static130.anInt2597);
		Static199.aClass43Array4 = Static137.method1334(arg0, Static97.anInt2004);
		Static276.aClass8_Sub1_Sub5_4.method2017(Static199.aClass43Array4, null);
		Static247.aClass8_Sub1_Sub5_5.method2017(Static199.aClass43Array4, null);
		Static229.aClass8_Sub1_Sub5_3.method2017(Static199.aClass43Array4, null);
		if (Static116.aBoolean188) {
			Static6.aClass43_Sub2Array1 = Static46.method743(Static145.anInt2862, arg0);
			for (@Pc(112) int local112 = 0; local112 < Static6.aClass43_Sub2Array1.length; local112++) {
				Static6.aClass43_Sub2Array1[local112].method4310();
			}
		}
		@Pc(133) Class8_Sub1_Sub7_Sub1 local133 = Static137.method1326(0, Static76.anInt1639, arg0);
		local133.method1643();
		if (Static116.aBoolean188) {
			Static207.aClass8_Sub1_Sub7_7 = new Class8_Sub1_Sub7_Sub2(local133);
		} else {
			Static207.aClass8_Sub1_Sub7_7 = local133;
		}
		@Pc(154) Class8_Sub1_Sub7_Sub1[] local154 = Static181.method2774(arg0, Static189.anInt3787);
		@Pc(156) int local156;
		for (local156 = 0; local156 < local154.length; local156++) {
			local154[local156].method1643();
		}
		if (Static116.aBoolean188) {
			Static73.aClass8_Sub1_Sub7Array36 = new Class8_Sub1_Sub7[local154.length];
			for (local156 = 0; local156 < local154.length; local156++) {
				Static73.aClass8_Sub1_Sub7Array36[local156] = new Class8_Sub1_Sub7_Sub2(local154[local156]);
			}
		} else {
			Static73.aClass8_Sub1_Sub7Array36 = local154;
		}
		local156 = (int) (Math.random() * 21.0D) - 10;
		@Pc(217) int local217 = (int) (Math.random() * 21.0D) - 10;
		@Pc(224) int local224 = (int) (Math.random() * 21.0D) - 10;
		@Pc(231) int local231 = (int) (Math.random() * 41.0D) - 20;
		@Pc(233) int local233;
		for (local233 = 0; local233 < Static13.aClass8_Sub1_Sub7_Sub1Array1.length; local233++) {
			Static13.aClass8_Sub1_Sub7_Sub1Array1[local233].method1637(local156 + local231, local224 + local231, local217 + local231);
		}
		if (Static116.aBoolean188) {
			Static277.aClass8_Sub1_Sub7Array121 = new Class8_Sub1_Sub7[Static13.aClass8_Sub1_Sub7_Sub1Array1.length];
			for (local233 = 0; local233 < Static13.aClass8_Sub1_Sub7_Sub1Array1.length; local233++) {
				Static277.aClass8_Sub1_Sub7Array121[local233] = new Class8_Sub1_Sub7_Sub2(Static13.aClass8_Sub1_Sub7_Sub1Array1[local233]);
			}
		} else {
			Static277.aClass8_Sub1_Sub7Array121 = Static13.aClass8_Sub1_Sub7_Sub1Array1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(CI)C")
	public static char method981(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static82.aFloat20 = arg0;
		if (Static172.anInt3428 == 2) {
			Static293.anInt5684 = arg0;
			Static56.anInt1246 = arg1;
		}
		Static201.aFloat36 = arg1;
		Static75.method1184();
		Static93.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)V")
	public static void method985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static2.method4(Static244.anInt4872, arg6, Static228.anInt4643);
		@Pc(23) int local23 = Static2.method4(Static244.anInt4872, arg0, Static228.anInt4643);
		@Pc(29) int local29 = Static2.method4(Static52.anInt1146, arg4, Static253.anInt4996);
		@Pc(35) int local35 = Static2.method4(Static52.anInt1146, arg2, Static253.anInt4996);
		@Pc(43) int local43 = Static2.method4(Static244.anInt4872, arg5 + arg6, Static228.anInt4643);
		@Pc(52) int local52 = Static2.method4(Static244.anInt4872, arg0 - arg5, Static228.anInt4643);
		@Pc(54) int local54;
		for (local54 = local11; local54 < local43; local54++) {
			Static19.method343(local29, arg1, Static181.anIntArrayArray19[local54], local35);
		}
		for (local54 = local23; local54 > local52; local54--) {
			Static19.method343(local29, arg1, Static181.anIntArrayArray19[local54], local35);
		}
		@Pc(96) int local96 = Static2.method4(Static52.anInt1146, arg5 + arg4, Static253.anInt4996);
		@Pc(104) int local104 = Static2.method4(Static52.anInt1146, arg2 - arg5, Static253.anInt4996);
		for (local54 = local43; local54 <= local52; local54++) {
			@Pc(113) int[] local113 = Static181.anIntArrayArray19[local54];
			Static19.method343(local29, arg1, local113, local96);
			Static19.method343(local96, arg3, local113, local104);
			Static19.method343(local104, arg1, local113, local35);
		}
	}
}
