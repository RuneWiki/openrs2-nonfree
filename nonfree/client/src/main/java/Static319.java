import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "Lclient!tj;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Use";

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "[I")
	public static final int[] anIntArray321 = new int[500];

	@OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
	public static int anInt3288 = 0;

	@OriginalMember(owner = "client!uo", name = "X", descriptor = "I")
	public static final int anInt3291 = 50;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ps;IIILclient!cq;Lclient!ud;II)V")
	public static void method2792(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(26) int local26;
		if (Static246.anInt5156 == 4) {
			local26 = (int) Static143.aFloat21 & 0x3FFF;
		} else {
			local26 = Static86.anInt1648 + (int) Static143.aFloat21 & 0x3FFF;
		}
		@Pc(45) int local45 = Math.max(arg0.anInt4991 / 2, arg0.anInt4935 / 2) + 10;
		@Pc(53) int local53 = arg6 * arg6 + arg3 * arg3;
		if (local45 * local45 < local53) {
			return;
		}
		@Pc(67) int local67 = Class1_Sub5_Sub15.anIntArray335[local26];
		@Pc(71) int local71 = Class1_Sub5_Sub15.anIntArray333[local26];
		if (Static246.anInt5156 != 4) {
			local71 = local71 * 256 / (Static260.anInt5347 + 256);
			local67 = local67 * 256 / (Static260.anInt5347 + 256);
		}
		@Pc(100) int local100 = local71 * arg3 + arg6 * local67 >> 15;
		@Pc(111) int local111 = arg6 * local71 - arg3 * local67 >> 15;
		arg4.method4384(local100 + arg1 + arg0.anInt4991 / 2 - arg4.method4381() / 2, -local111 + arg0.anInt4935 / 2 + arg2 + -(arg4.method4395() / 2), arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2794(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
