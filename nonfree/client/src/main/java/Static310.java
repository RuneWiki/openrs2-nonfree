import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!rq", name = "R", descriptor = "Lclient!at;")
	public static final Class17 aClass17_63 = new Class17();

	@OriginalMember(owner = "client!rq", name = "T", descriptor = "I")
	public static int anInt5274 = 0;

	@OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_137 = new Class211(60, 3);

	@OriginalMember(owner = "client!rq", name = "cb", descriptor = "I")
	public static int anInt5280 = 2;

	@OriginalMember(owner = "client!rq", name = "db", descriptor = "Lclient!at;")
	public static final Class17 aClass17_64 = new Class17();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static345.method4878(arg2)) {
			return;
		}
		if (Static286.aClass117ArrayArray2[arg2] == null) {
			Static50.method807(Static137.aClass117ArrayArray1[arg2], -1, arg6, arg8, arg7, arg4, arg5, arg1, arg0, arg3);
		} else {
			Static50.method807(Static286.aClass117ArrayArray2[arg2], -1, arg6, arg8, arg7, arg4, arg5, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V")
	public static void method4626(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static213.anInt3655 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)V")
	public static void method4627(@OriginalArg(1) int arg0) {
		if (!Static188.aClass135_Sub1_1.aBoolean318) {
			arg0 = -1;
		}
		if (arg0 == Static3.anInt15) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class129 local24 = Static175.aClass52_1.method969(arg0);
			@Pc(28) Class80 local28 = local24.method2661();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static341.aClass162_5.method3271(local28.method1421(), local28.method1429(), local28.method1434(), new Point(local24.anInt3258, local24.anInt3262), Static177.aCanvas3);
				Static3.anInt15 = arg0;
			}
		}
		if (arg0 == -1 && Static3.anInt15 != -1) {
			Static341.aClass162_5.method3271(-1, -1, null, new Point(), Static177.aCanvas3);
			Static3.anInt15 = -1;
		}
	}
}
