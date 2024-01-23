import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public static int anInt948 = 1;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString42 = "Loaded wordpack";

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lclient!wl;)V")
	public static void method705(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub32[] arg1) {
		Static247.aClass2_Sub32ArrayArray2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIBI)V")
	public static void method707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - arg5;
		@Pc(14) int local14 = arg5 + arg2;
		@Pc(26) int local26 = arg0 + arg5;
		@Pc(28) int local28;
		for (local28 = arg2; local28 < local14; local28++) {
			Static25.method486(Static275.anIntArrayArray37[local28], arg0, arg4, arg1);
		}
		@Pc(51) int local51 = arg4 - arg5;
		for (local28 = arg3; local28 > local10; local28--) {
			Static25.method486(Static275.anIntArrayArray37[local28], arg0, arg4, arg1);
		}
		for (local28 = local14; local28 <= local10; local28++) {
			@Pc(84) int[] local84 = Static275.anIntArrayArray37[local28];
			Static25.method486(local84, arg0, local26, arg1);
			Static25.method486(local84, local51, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public static void method709() {
		Static92.aClass157_21.method4033();
		Static108.aClass157_23.method4033();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
	public static void method712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(4, arg3);
		local12.method2052();
		local12.anInt2698 = arg2;
		local12.anInt2700 = arg0;
		local12.anInt2702 = arg1;
	}
}
