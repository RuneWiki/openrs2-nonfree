import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
	public static int anInt6923;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_215 = new Class151("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "[I")
	public static int[] anIntArray461 = new int[2];

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
	public static int anInt6922 = 104;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)Z")
	public static boolean method5303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static126.anIntArrayArrayArray2[arg0][local16][local20] == -Static214.anInt7431) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static384.anInt6381) + 1;
			@Pc(142) int local142 = (arg3 << Static384.anInt6381) + 2;
			@Pc(151) int local151 = Static202.aClass163Array2[arg0].I(arg1, arg3) + arg5;
			if (!Static95.method1363(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static384.anInt6381) - 1;
			if (!Static95.method1363(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static384.anInt6381) - 1;
			if (!Static95.method1363(local20, local151, local177)) {
				return false;
			} else if (Static95.method1363(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static290.method3791(arg0, arg1, arg3)) {
			local16 = arg1 << Static384.anInt6381;
			local20 = arg3 << Static384.anInt6381;
			return Static95.method1363(local16 + 1, Static202.aClass163Array2[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static95.method1363(local16 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static95.method1363(local16 + Static329.anInt5395 - 1, Static202.aClass163Array2[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static329.anInt5395 - 1) && Static95.method1363(local16 + 1, Static202.aClass163Array2[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static329.anInt5395 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
	public static void method5304(@OriginalArg(1) int arg0) {
		if (!Static336.aClass106_Sub1_1.aBoolean472) {
			arg0 = -1;
		}
		if (arg0 == Static118.anInt2025) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class111 local24 = Static455.aClass52_2.method1178(arg0);
			@Pc(28) Class100 local28 = local24.method2244();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static41.aClass124_2.method2517(local28.method1927(), new Point(local24.anInt2698, local24.anInt2694), Static226.aCanvas9, local28.method1919(), local28.method1917());
				Static118.anInt2025 = arg0;
			}
		}
		if (arg0 == -1 && Static118.anInt2025 != -1) {
			Static41.aClass124_2.method2517(-1, new Point(), Static226.aCanvas9, null, -1);
			Static118.anInt2025 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!dh;Ljava/lang/String;)I")
	public static int method5306(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt5766;
		@Pc(10) byte[] local10 = Static419.method5234(arg1);
		arg0.method4476(local10.length);
		arg0.anInt5766 += Static225.aClass54_1.method1218(0, arg0.anInt5766, local10, arg0.aByteArray64, local10.length);
		return arg0.anInt5766 - local6;
	}
}
