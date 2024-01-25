import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Lclient!tf;")
	public static Class17 aClass17_56;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIB)V")
	public static void method6533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static385.method4989(Static73.anInt1542, arg4, Static527.anInt8177);
		@Pc(17) int local17 = Static385.method4989(Static73.anInt1542, arg2, Static527.anInt8177);
		@Pc(23) int local23 = Static385.method4989(Static472.anInt7503, arg0, Static257.anInt4172);
		@Pc(37) int local37 = Static385.method4989(Static472.anInt7503, arg3, Static257.anInt4172);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static559.method7424(arg1, Static172.anIntArrayArray17[local39], local37, local23);
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(III)Z")
	public static boolean method6536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!es;)Ljava/lang/String;")
	public static String method6540(@OriginalArg(1) Class4_Sub11 arg0) {
		return Static82.method7283(arg0);
	}
}
