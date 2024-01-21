import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "O", descriptor = "Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!id;")
	private static Class34 aClass34_289 = Static9.method266("Nov");

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!id;")
	public static Class34 aClass34_290 = Static9.method266("(U(Y");

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!id;")
	private static Class34 aClass34_291 = Static9.method266("Feb");

	@OriginalMember(owner = "client!c", name = "B", descriptor = "Lclient!id;")
	private static Class34 aClass34_292 = Static9.method266("Apr");

	@OriginalMember(owner = "client!c", name = "C", descriptor = "Lclient!id;")
	private static Class34 aClass34_293 = Static9.method266("Jul");

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!id;")
	private static Class34 aClass34_294 = Static9.method266("Sep");

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[104][104];

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!id;")
	private static Class34 aClass34_295 = Static9.method266("Oct");

	@OriginalMember(owner = "client!c", name = "L", descriptor = "Lclient!id;")
	private static Class34 aClass34_296 = Static9.method266("Jan");

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Lclient!id;")
	private static Class34 aClass34_297 = Static9.method266("May");

	@OriginalMember(owner = "client!c", name = "P", descriptor = "I")
	public static int anInt573 = -1;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "Lclient!id;")
	private static Class34 aClass34_298 = Static9.method266("Mar");

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Lclient!id;")
	private static Class34 aClass34_301 = Static9.method266("Jun");

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "Lclient!id;")
	private static Class34 aClass34_302 = Static9.method266("Aug");

	@OriginalMember(owner = "client!c", name = "S", descriptor = "Lclient!id;")
	private static Class34 aClass34_299 = Static9.method266("Dec");

	@OriginalMember(owner = "client!c", name = "R", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array4 = new Class34[] { aClass34_296, aClass34_291, aClass34_298, aClass34_292, aClass34_297, aClass34_301, aClass34_293, aClass34_302, aClass34_294, aClass34_295, aClass34_289, aClass34_299 };

	@OriginalMember(owner = "client!c", name = "T", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "I")
	public static int anInt576 = 0;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_303 = Static9.method266("sch-Utteln:");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static26.method496(arg4)) {
			Static35.aClass1_Sub9Array1 = null;
			Static30.method562(Static41.aClass1_Sub9ArrayArray1[arg4], arg3, -1, arg6, arg0, arg7, arg1, arg5, arg2);
			if (Static35.aClass1_Sub9Array1 != null) {
				Static30.method562(Static35.aClass1_Sub9Array1, arg3, -1412584499, arg6, Static34.anInt995, arg7, arg1, Static10.anInt485, arg2);
				Static35.aClass1_Sub9Array1 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static12.aBooleanArray3[local23] = true;
			}
		} else {
			Static12.aBooleanArray3[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Z")
	public static boolean method343(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method344() {
		aClass34_295 = null;
		aClass34_293 = null;
		aClass34_298 = null;
		aClass34Array4 = null;
		anIntArrayArray1 = null;
		aClass34_291 = null;
		aClass34_290 = null;
		aClass34_294 = null;
		aClass34_292 = null;
		aClass34_303 = null;
		aClass34_289 = null;
		aClass34_299 = null;
		aClass34_302 = null;
		aClass34_296 = null;
		aClass1_Sub1_Sub2_Sub2_4 = null;
		aClass34_297 = null;
		aClass34_301 = null;
	}
}
