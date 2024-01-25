import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "Lclient!je;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_44 = new Class12(25, -2);

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_45 = new Class12(104, -1);

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_15 = new Class96("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "[I")
	public static final int[] anIntArray39 = new int[1];

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)Z")
	public static boolean method518(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!vb;")
	public static Class251 method519(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static350.aFloat113 == 3.0D) {
				return Static78.aClass251_4;
			}
			if ((double) Static350.aFloat113 == 4.0D) {
				return Static42.aClass251_9;
			}
			if ((double) Static350.aFloat113 == 6.0D) {
				return Static251.aClass251_7;
			}
			if ((double) Static350.aFloat113 >= 8.0D) {
				return Static212.aClass251_6;
			}
		} else if (arg0 == 1) {
			if ((double) Static350.aFloat113 == 3.0D) {
				return Static251.aClass251_7;
			}
			if ((double) Static350.aFloat113 == 4.0D) {
				return Static212.aClass251_6;
			}
			if ((double) Static350.aFloat113 == 6.0D) {
				return Static2.aClass251_1;
			}
			if ((double) Static350.aFloat113 >= 8.0D) {
				return Static311.aClass251_12;
			}
		} else if (arg0 == 2) {
			if ((double) Static350.aFloat113 == 3.0D) {
				return Static2.aClass251_1;
			}
			if ((double) Static350.aFloat113 == 4.0D) {
				return Static311.aClass251_12;
			}
			if ((double) Static350.aFloat113 == 6.0D) {
				return Static352.aClass251_11;
			}
			if ((double) Static350.aFloat113 >= 8.0D) {
				return Static43.aClass251_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	public static void method520() {
		Static11.method190();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static20.aClass181Array2[local13].method3877();
		}
		Static33.method459();
		Static278.method5798();
		System.gc();
	}
}
