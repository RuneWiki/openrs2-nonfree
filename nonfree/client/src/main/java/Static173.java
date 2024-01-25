import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "Lclient!lm;")
	public static Class134 aClass134_85;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "Lclient!ln;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_3;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array7;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "[I")
	public static final int[] anIntArray347 = new int[32];

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	public static void method3108(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static129.anInt2569 != -1) {
				Static24.method401(Static129.anInt2569);
			}
			for (@Pc(15) Class1_Sub26 local15 = (Class1_Sub26) Static298.aClass207_35.method5560(); local15 != null; local15 = (Class1_Sub26) Static298.aClass207_35.method5559()) {
				if (!local15.method5797()) {
					local15 = (Class1_Sub26) Static298.aClass207_35.method5560();
					if (local15 == null) {
						break;
					}
				}
				Static140.method2316(false, true, local15);
			}
			Static129.anInt2569 = -1;
			Static298.aClass207_35 = new Class207(8);
			Static291.method5098();
			Static129.anInt2569 = Static132.anInt6772;
			Static57.method1110(false);
			Static74.method1295();
			Static122.method1973(Static129.anInt2569);
		}
		Static326.method4948();
		Static10.anInt163 = -1;
		Static187.method3327(Static304.anInt6088);
		Static127.aClass10_Sub1_Sub2_Sub2_1 = new Class10_Sub1_Sub2_Sub2();
		Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 = 6656;
		Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] = 52;
		Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 = 6656;
		Static177.anInt3734 = 0;
		Static4.anInt41 = 0;
		Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] = 52;
		if (Static246.anInt5156 == 2) {
			Static177.anInt3734 = Static231.anInt4824 << 7;
			Static4.anInt41 = Static42.anInt1138 << 7;
		} else {
			Static355.method5867();
		}
		Static353.method5855();
		if (Static4.anInt41 == 0 || Static177.anInt3734 == 0) {
			Static16.method298(10);
		} else {
			Static152.method2657();
			Static16.method298(28);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ps;)Z")
	public static boolean method3109(@OriginalArg(1) Class163 arg0) {
		if (arg0.anInt4926 == 205) {
			Static251.anInt5188 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIII)V")
	public static void method3110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(14) int local14 = arg4 + arg2;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static244.method5351(arg1, arg5, Static319.anIntArrayArray31[local16], arg3);
		}
		@Pc(39) int local39 = arg5 - arg4;
		@Pc(43) int local43 = arg4 + arg1;
		for (@Pc(45) int local45 = arg0; local45 > local10; local45--) {
			Static244.method5351(arg1, arg5, Static319.anIntArrayArray31[local45], arg3);
		}
		for (@Pc(61) int local61 = local14; local61 <= local10; local61++) {
			@Pc(67) int[] local67 = Static319.anIntArrayArray31[local61];
			Static244.method5351(arg1, local43, local67, arg3);
			Static244.method5351(local39, arg5, local67, arg3);
		}
	}

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)V")
	public static void method3112() {
		Static223.aClass37_30.method919();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)I")
	public static int method3113(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)S")
	public static short method3114(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(42) int local42 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(46) int local46 = local19 + local42;
		@Pc(54) int local54;
		if (local46 == 0) {
			local54 = local42 << 1;
		} else {
			local54 = (local42 << 8) / local46;
		}
		return (short) (local46 | local54 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3115(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static331.method3176(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
	public static void method3116() {
		if (Static22.anInt428 < 0) {
			Static22.anInt428 = 0;
			Static288.anInt5766 = -1;
			Static282.anInt3502 = -1;
		}
		if (Static150.anInt2639 < Static22.anInt428) {
			Static282.anInt3502 = -1;
			Static288.anInt5766 = -1;
			Static22.anInt428 = Static150.anInt2639;
		}
		if (Static24.anInt439 < 0) {
			Static24.anInt439 = 0;
			Static282.anInt3502 = -1;
			Static288.anInt5766 = -1;
		}
		if (Static24.anInt439 > Static150.anInt2636) {
			Static288.anInt5766 = -1;
			Static282.anInt3502 = -1;
			Static24.anInt439 = Static150.anInt2636;
		}
	}
}
