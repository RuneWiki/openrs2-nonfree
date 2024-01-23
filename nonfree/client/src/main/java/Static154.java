import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Lclient!lc;")
	public static Class98 aClass98_91;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
	public static int anInt3126 = 100;

	@OriginalMember(owner = "client!lj", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString103 = "Starting 3d Library";

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!lc;Lclient!lc;I)V")
	public static void method2466(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1) {
		Static242.aClass98_150 = arg1;
		Static227.aClass98_124 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)J")
	public static long method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1054; local13++) {
			@Pc(22) Class173 local22 = local7.aClass173Array1[local13];
			if ((local22.aLong183 >> 29 & 0x3L) == 2L && local22.anInt5149 == arg1 && local22.anInt5157 == arg2) {
				return local22.aLong183;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2468(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, arg2.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(local14 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method2469() {
		aString103 = null;
		aClass98_91 = null;
	}
}
