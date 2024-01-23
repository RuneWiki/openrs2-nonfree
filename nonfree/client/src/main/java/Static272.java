import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!un", name = "C", descriptor = "[Lclient!tj;")
	public static Class12_Sub2[] aClass12_Sub2Array1;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "Lclient!ik;")
	public static Class70 aClass70_20 = new Class70(16);

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString306 = "white:";

	@OriginalMember(owner = "client!un", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString307 = "Loading textures - ";

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	public static int anInt5315 = 0;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray50 = new boolean[100];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V")
	public static void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static54.method1030(arg1, arg4, arg0, arg2);
			}
		} else if (local15 == 0) {
			Static170.method2923(arg1, arg3, arg4, arg0);
		} else {
			@Pc(51) int local51 = (local15 << 12) / local10;
			@Pc(59) int local59 = arg0 - (arg1 * local51 >> 12);
			@Pc(75) int local75;
			@Pc(73) int local73;
			if (arg3 < Static224.anInt4436) {
				local73 = (local51 * Static224.anInt4436 >> 12) + local59;
				local75 = Static224.anInt4436;
			} else if (arg3 > Static68.anInt1451) {
				local73 = (local51 * Static68.anInt1451 >> 12) + local59;
				local75 = Static68.anInt1451;
			} else {
				local73 = arg2;
				local75 = arg3;
			}
			@Pc(101) int local101;
			@Pc(103) int local103;
			if (Static224.anInt4436 > arg1) {
				local101 = Static224.anInt4436;
				local103 = local59 + (local51 * Static224.anInt4436 >> 12);
			} else if (arg1 <= Static68.anInt1451) {
				local101 = arg1;
				local103 = arg0;
			} else {
				local101 = Static68.anInt1451;
				local103 = (local51 * Static68.anInt1451 >> 12) + local59;
			}
			if (Static297.anInt5619 > local103) {
				local103 = Static297.anInt5619;
				local101 = (Static297.anInt5619 - local59 << 12) / local51;
			} else if (local103 > Static49.anInt1129) {
				local103 = Static49.anInt1129;
				local101 = (Static49.anInt1129 - local59 << 12) / local51;
			}
			if (local73 < Static297.anInt5619) {
				local73 = Static297.anInt5619;
				local75 = (Static297.anInt5619 - local59 << 12) / local51;
			} else if (Static49.anInt1129 < local73) {
				local75 = (Static49.anInt1129 - local59 << 12) / local51;
				local73 = Static49.anInt1129;
			}
			Static237.method3662(local73, arg4, local103, local101, local75);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I")
	public static int method4159(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
