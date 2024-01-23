import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_97;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public static int anInt5631;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37 = null;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray44 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public static int anInt5636 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBII)I")
	public static int method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		} else {
			@Pc(23) int local23 = 128 - arg1;
			@Pc(42) int local42 = local23 * (arg0 >>> 7 & 0x1FE01FE) + arg1 * (arg2 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(57) int local57 = (arg0 & 0xFF00FF) * local23 + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00;
			return (local57 >> 7) + local42;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLclient!nm;)V")
	public static void method4678(@OriginalArg(1) Class119 arg0) {
		Static291.aClass119_88 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!si;)Ljava/lang/String;")
	public static String method4680(@OriginalArg(1) Class157 arg0) {
		if (Static42.method777(arg0).method1126() == 0) {
			return null;
		} else if (arg0.aString168 == null || arg0.aString168.trim().length() == 0) {
			return Static26.aBoolean54 ? "Hidden-use" : null;
		} else {
			return arg0.aString168;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public static void method4681() {
		Static116.aClass1_Sub13_Sub1_48.method1887(134);
		Static116.aClass1_Sub13_Sub1_48.method1857(0L);
	}
}
