import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!gi;")
	public static Class61 aClass61_2;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public static int anInt240;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt237 = 0;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
	public static int[] anIntArray9 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public static int method217(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(40) int local40 = local28 | local28 >>> 16;
		return local40 + 1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJ)V")
	public static void method219(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
