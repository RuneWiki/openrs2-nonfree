import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "Lclient!fj;")
	public static Class2_Sub2_Sub5_Sub1_Sub1 aClass2_Sub2_Sub5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_422 = Static181.method2795("mapfunction");

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_423 = Static181.method2795("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static133.method2211(arg3)) {
			Static79.method1446(arg1, arg4, Static175.aClass5ArrayArray1[arg3], -1, arg6, arg0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
	public static int method1059(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ID)V")
	public static void method1062(@OriginalArg(1) double arg0) {
		if (Static2.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static189.anIntArray370[local7] = local19 > 255 ? 255 : local19;
		}
		Static2.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(JB)V")
	public static void method1065(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static85.anInt1875 >= 100) {
			Static165.method2554(0, Static168.aClass83_1003, Static182.aClass83_1067);
			return;
		}
		@Pc(27) Class83 local27 = Static12.method296(arg0).method2400();
		for (@Pc(29) int local29 = 0; local29 < Static85.anInt1875; local29++) {
			if (Static211.aLongArray8[local29] == arg0) {
				Static165.method2554(0, Static67.method1268(new Class83[] { local27, Static167.aClass83_994 }), Static182.aClass83_1067);
				return;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static177.anInt3618; local60++) {
			if (Static139.aLongArray3[local60] == arg0) {
				Static165.method2554(0, Static67.method1268(new Class83[] { Static151.aClass83_915, local27, Static108.aClass83_720 }), Static182.aClass83_1067);
				return;
			}
		}
		if (local27.method2402(Static54.aClass24_Sub4_Sub1_1.aClass83_664)) {
			Static165.method2554(0, Static211.aClass83_1199, Static182.aClass83_1067);
			return;
		}
		Static211.aLongArray8[Static85.anInt1875] = arg0;
		Static57.aClass83Array28[Static85.anInt1875++] = Static12.method296(arg0);
		Static38.anInt976 = Static29.anInt739;
		Static69.aClass2_Sub3_Sub1_2.method284(223);
		Static69.aClass2_Sub3_Sub1_2.method249(arg0);
	}
}
