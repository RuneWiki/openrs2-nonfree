import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!qg;")
	public static Class240 aClass240_2;

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
	public static int anInt9103 = 0;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
	public static int anInt9106 = -1;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
	public static boolean method7861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static216.method3996(arg1, arg0) & Static167.method3164(arg1, arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z")
	public static boolean method7863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)I")
	public static int method7865(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIBII)V")
	public static void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static174.anInt3466 = arg5;
		Static339.anInt6277 = arg2;
		Static74.anInt1791 = arg3;
		Static176.anInt3514 = arg4;
		Static202.anInt4054 = arg0;
		Static238.anInt4639 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	public static void method7869() {
		Static512.anIntArray784 = null;
		Static40.anIntArray74 = null;
		Static422.anIntArray705 = null;
		Static10.anIntArray25 = null;
		Static13.anIntArray27 = null;
		Static361.aBoolean482 = false;
	}
}
