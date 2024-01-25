import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[I")
	public static final int[] anIntArray312 = new int[3];

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	public static int anInt2708 = 20;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method2531() {
		Static195.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static231.anIntArrayArrayArray9[arg0][local16][local20] == -Static284.anInt5039) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static315.anInt5584) + 1;
			@Pc(142) int local142 = (arg3 << Static315.anInt5584) + 2;
			@Pc(151) int local151 = Static17.aClass33Array1[arg0].method4057(arg1, arg3) + arg5;
			if (!Static286.method4398(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static315.anInt5584) - 1;
			if (!Static286.method4398(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static315.anInt5584) - 1;
			if (!Static286.method4398(local20, local151, local177)) {
				return false;
			} else if (Static286.method4398(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static30.method725(arg0, arg1, arg3)) {
			local16 = arg1 << Static315.anInt5584;
			local20 = arg3 << Static315.anInt5584;
			return Static286.method4398(local16 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg3) + arg5, local20 + 1) && Static286.method4398(local16 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg3) + arg5, local20 + 1) && Static286.method4398(local16 + Static292.anInt5158 - 1, Static17.aClass33Array1[arg0].method4057(arg1 + 1, arg3 + 1) + arg5, local20 + Static292.anInt5158 - 1) && Static286.method4398(local16 + 1, Static17.aClass33Array1[arg0].method4057(arg1, arg3 + 1) + arg5, local20 + Static292.anInt5158 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!lk;B)Ljava/lang/String;")
	public static String method2533(@OriginalArg(1) Class2_Sub13 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4211();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt4788 += Static63.aClass60_1.method1298(local15, 0, local7, arg0.anInt4788, arg0.aByteArray77);
			return Static158.method2649(local15, local7, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
