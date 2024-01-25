import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "[Lclient!ha;")
	public static Class104[] aClass104Array15;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
	public static long aLong39;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_65 = new Class305(15, 8);

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
	public static final int[] anIntArray100 = new int[5];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method1530(@OriginalArg(1) int arg0) {
		if (-1 != arg0 && Static286.aBooleanArray22[arg0]) {
			Static83.aClass69_94.method1910(arg0);
			Static511.aClass91ArrayArray2[arg0] = null;
			Static465.aClass91ArrayArray1[arg0] = null;
			Static286.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public static void method1531() {
		Static169.aClass277_28.method7019();
	}
}
