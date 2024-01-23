import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!ek;")
	public static Class42 aClass42_20;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "I")
	public static int anInt1777;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public static void method1354() {
		Static11.aClass157_5.method4034(5);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J")
	public static long method1356() {
		return Static101.aClass16_1.method4237();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V")
	public static void method1359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 + 1;
		Static25.method486(Static275.anIntArrayArray37[arg3], arg0, arg1, arg2);
		@Pc(13) int local13 = arg4 - 1;
		Static25.method486(Static275.anIntArrayArray37[arg4], arg0, arg1, arg2);
		for (@Pc(25) int local25 = local4; local25 <= local13; local25++) {
			@Pc(41) int[] local41 = Static275.anIntArrayArray37[local25];
			local41[arg0] = local41[arg1] = arg2;
		}
	}
}
