import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!rq", name = "U", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "I")
	public static int anInt7587 = -1;

	@OriginalMember(owner = "client!rq", name = "S", descriptor = "I")
	public static int anInt7590 = 0;

	@OriginalMember(owner = "client!rq", name = "V", descriptor = "[I")
	public static final int[] anIntArray509 = new int[14];

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
	public static void method6121() {
		Static411.method5545();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static87.aClass362Array3[local8].method7592();
		}
		Static429.method5683();
		Static507.method6604();
		System.gc();
		Static417.aClass162_17.ya();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!fa;)Lclient!r;")
	public static Class162 method6122(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface9 arg1) {
		return new l(arg0, arg1);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIILjava/lang/String;B)V")
	public static void method6123(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		Static110.method1608(arg0, false, arg3, arg1, null, arg2);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)I")
	public static int method6125(@OriginalArg(0) int arg0) {
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
}
