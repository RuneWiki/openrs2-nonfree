import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "[Lclient!jf;")
	public static Class96[] aClass96Array2;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString328 = "Loading interfaces - ";

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "Lclient!jf;")
	public static Class96 aClass96_18 = null;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
	public static int anInt5639 = 0;

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	public static void method4987() {
		Static335.aClass5_Sub1_Sub1_3.method174(252);
		Static335.aClass5_Sub1_Sub1_3.method1886(0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public static void method4988(@OriginalArg(0) int arg0) {
		Static303.anInt5838 = arg0;
		Static31.anInt823 = 100;
		Static274.anInt5377 = -1;
		Static210.anInt5623 = 3;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V")
	public static void method4990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static133.method5819(Static334.anInt6315, arg2, Static314.anInt6018);
		@Pc(22) int local22 = Static133.method5819(Static334.anInt6315, arg4, Static314.anInt6018);
		@Pc(28) int local28 = Static133.method5819(Static80.anInt4809, arg0, Static184.anInt6250);
		@Pc(34) int local34 = Static133.method5819(Static80.anInt4809, arg3, Static184.anInt6250);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static247.method3552(arg1, local28, Static332.anIntArrayArray56[local36], local34);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
	public static void method4991(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static184.anInt6250 = 0;
		Static80.anInt4809 = arg1;
		Static334.anInt6315 = arg0;
		Static314.anInt6018 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Z")
	public static boolean method4992(@OriginalArg(1) int arg0) {
		Static339.anInt6356 = arg0 + 1 & 0xFFFF;
		Static168.aBoolean244 = true;
		return true;
	}
}
