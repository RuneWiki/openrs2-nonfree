import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "[Lclient!ae;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "Lclient!om;")
	public static Class246 aClass246_83;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
	public static int anInt3319 = 0;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
	public static void method2944() {
		if (Static186.anInt3610 != -1) {
			Static172.method2977(-1, Static186.anInt3610, -1, false);
			Static186.anInt3610 = -1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZBII)I")
	public static int method2945(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub48 local13 = Static144.method2729(arg0, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local13.anIntArray675.length) {
			return local13.anIntArray675[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBII)V")
	public static void method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2597 <= arg3 - arg0 && arg3 + arg0 <= Static459.anInt7524 && arg1 - arg0 >= Static385.anInt6630 && arg0 + arg1 <= Static69.anInt1918) {
			Static340.method5178(arg1, arg2, arg0, arg3);
		} else {
			Static417.method6000(arg0, arg2, arg3, arg1);
		}
	}
}
