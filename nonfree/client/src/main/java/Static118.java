import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Lclient!ra;")
	public static Class170 aClass170_53;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString158 = "Loaded textures";

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static200.anIntArrayArrayArray16[arg0][local16][local20] == -Static22.anInt574) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static130.aClass3Array2[arg0].method5638(arg1, arg3) + arg5;
			if (!Static49.method1101(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static49.method1101(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static49.method1101(local20, local151, local177)) {
				return false;
			} else if (Static49.method1101(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static189.method3465(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static49.method1101(local16 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg3) + arg5, local20 + 1) && Static49.method1101(local16 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg3) + arg5, local20 + 1) && Static49.method1101(local16 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static49.method1101(local16 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!jf;IB)V")
	public static void method2319(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2) {
		Static200.anInt5713 = arg2;
		Static231.aClass96_14 = arg1;
		Static30.anInt820 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)Z")
	public static boolean method2320() {
		try {
			return Static348.method5751();
		} catch (@Pc(14) IOException local14) {
			Static79.method1765();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(59) String local59 = "T2 - " + Static1.anInt4 + "," + Static161.anInt3248 + "," + Static316.anInt6045 + " - " + Static179.anInt3568 + "," + (Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] + Static263.anInt5063) + "," + (Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] + Static28.anInt773) + " - ";
			for (@Pc(61) int local61 = 0; local61 < Static179.anInt3568 && local61 < 50; local61++) {
				local59 = local59 + Static6.aClass5_Sub1_Sub1_1.aByteArray18[local61] + ",";
			}
			Static113.method2252(local19, local59);
			Static310.method5284();
			return true;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!re;I)I")
	public static int method2321(@OriginalArg(0) Class25_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class216 local8 = arg0.aClass216_1;
		if (local8.anIntArray562 != null) {
			local8 = local8.method5777();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local8.anInt6533;
		@Pc(26) Class33 local26 = arg0.method4659();
		if (arg0.aBoolean405) {
			local22 = local8.anInt6528;
		} else if (local26.anInt950 == arg0.anInt5276 || local26.anInt965 == arg0.anInt5276 || arg0.anInt5276 == local26.anInt982 || local26.anInt971 == arg0.anInt5276) {
			local22 = local8.anInt6550;
		} else if (arg0.anInt5276 == local26.anInt973 || local26.anInt961 == arg0.anInt5276 || arg0.anInt5276 == local26.anInt954 || arg0.anInt5276 == local26.anInt952) {
			local22 = local8.anInt6548;
		}
		return local22;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
	public static void method2322() {
		@Pc(5) Class66 local5 = Static173.aClass66_79;
		synchronized (Static173.aClass66_79) {
			Static173.aClass66_79.method1944(5);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!oj;I)V")
	public static void method2323(@OriginalArg(0) Class63_Sub4 arg0) {
		arg0.aClass25_Sub1_Sub1_1 = null;
		if (Static175.anInt3557 < 20) {
			Static326.aClass24_5.method620(arg0);
			Static175.anInt3557++;
		}
	}
}
