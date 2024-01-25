import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static612 {

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "J")
	public static long aLong291 = -1L;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "[I")
	public static final int[] anIntArray659 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8434(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!da;)V")
	public static void method8435(@OriginalArg(0) Class19 arg0) {
		Static32.aClass19_3 = arg0;
	}
}
