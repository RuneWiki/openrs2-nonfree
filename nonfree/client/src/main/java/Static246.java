import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[112];

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "[I")
	public static int[] anIntArray395 = new int[1000];

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString116 = "scroll:";

	@OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
	public static int anInt3363 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = local7 * (Static285.aShort39 - Static209.aShort35) / 100 + Static209.aShort35;
		@Pc(40) int local40 = local34 * arg1 >> 8;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = 2048 - arg3 & 0x7FF;
		@Pc(62) int local62 = 2048 - arg2 & 0x7FF;
		@Pc(64) int local64 = 0;
		@Pc(66) int local66 = local40;
		@Pc(77) int local77;
		@Pc(73) int local73;
		if (local62 != 0) {
			local73 = Class135.anIntArray474[local62];
			local77 = Class135.anIntArray472[local62];
			local64 = -local40 * local77 >> 16;
			local66 = local40 * local73 >> 16;
		}
		if (local49 != 0) {
			local77 = Class135.anIntArray472[local49];
			local42 = local77 * local66 >> 16;
			local73 = Class135.anIntArray474[local49];
			local66 = local73 * local66 >> 16;
		}
		Static77.anInt1548 = arg2;
		Static56.anInt1177 = arg3;
		Static185.anInt3457 = arg4 - local64;
		Static68.anInt4743 = arg0 - local66;
		Static182.anInt3398 = arg6 - local42;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)Lclient!ql;")
	public static Class140 method2732(@OriginalArg(0) int arg0) {
		@Pc(10) Class140 local10 = (Class140) Static102.aClass31_17.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static177.aClass7_144.method253(Static25.method2385(arg0), Static101.method1644(arg0));
		local10 = new Class140();
		if (local25 != null) {
			local10.method3485(new Class1_Sub18(local25));
		}
		Static102.aClass31_17.method851(local10, (long) arg0);
		return local10;
	}
}
