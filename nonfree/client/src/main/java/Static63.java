import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public static int anInt1184 = -1;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "[I")
	public static final int[] anIntArray103 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public static int anInt1185 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method953(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static283.method3764(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public static void method954() {
		Static260.aBoolean306 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public static void method955() {
		if (Static458.method5729(Static290.anInt4777) || Static4.method76(Static290.anInt4777)) {
			Static69.method1055(Static143.anInt2544 >> 10, 5000, Static174.anInt3028 >> 10);
		} else {
			@Pc(20) int local20 = Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray425[0] >> 3;
			@Pc(27) int local27 = Static60.aClass3_Sub4_Sub1_Sub2_1.anIntArray424[0] >> 3;
			if (local20 >= 0 && local20 < Static166.anInt2852 >> 3 && local27 >= 0 && local27 < Static426.anInt6923 >> 3) {
				Static69.method1055(local27, 5000, local20);
			} else {
				Static69.method1055(Static426.anInt6923 >> 4, 0, Static166.anInt2852 >> 4);
			}
		}
		Static363.method4780();
		Static62.method924();
		Static75.method1101();
		Static186.method5110();
	}
}
