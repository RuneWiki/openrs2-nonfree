import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
	public static int anInt3591;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	public static int anInt3593;

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lclient!ek;")
	public static Class42 aClass42_47;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
	public static int anInt3604;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIILclient!kk;II)Lclient!bn;")
	public static Class2_Sub8_Sub1 method2970(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class97 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) int local27 = (arg4 << 19) + (arg1 ? 65536 : 0) + arg5 + (arg0 << 17);
		@Pc(37) long local37 = (long) arg2 * 3147483667L + (long) local27 * 3849834839L;
		@Pc(43) Class2_Sub8_Sub1 local43 = (Class2_Sub8_Sub1) Static301.aClass157_45.method4031(local37);
		if (local43 != null) {
			return local43;
		}
		Static1.aBoolean2 = false;
		local43 = Static184.method3259(arg1, arg0, arg2, arg3, arg4, arg5, false, false);
		if (local43 != null && !Static1.aBoolean2) {
			Static301.aClass157_45.method4026(local37, local43);
		}
		return local43;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method2971(@OriginalArg(0) Class42 arg0) {
		Static56.anInt1438 = arg0.method1254("runes");
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)Lclient!tk;")
	public static Class170 method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1544; local13++) {
			@Pc(22) Class170 local22 = local7.aClass170Array1[local13];
			if ((local22.aLong195 >> 29 & 0x3L) == 2L && local22.anInt5433 == arg1 && local22.anInt5437 == arg2) {
				Static156.method2855(local22);
				return local22;
			}
		}
		return null;
	}
}
