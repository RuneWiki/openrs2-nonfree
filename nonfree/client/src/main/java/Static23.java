import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Lclient!at;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)I")
	public static int method486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(30) int local30 = Static454.method5851(local7, local17);
		@Pc(37) int local37 = Static454.method5851(local7 + 1, local17);
		@Pc(44) int local44 = Static454.method5851(local7, local17 + 1);
		@Pc(62) int local62 = Static454.method5851(local7 + 1, local17 + 1);
		@Pc(71) int local71 = Static101.method1602(arg2, local13, local30, local37);
		@Pc(80) int local80 = Static101.method1602(arg2, local13, local44, local62);
		return Static101.method1602(arg2, local23, local71, local80);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	public static void method487() {
		Static393.aClass69_68.method1593();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([I[JI)V")
	public static void method488(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static242.method4047(arg1.length - 1, arg1, arg0, 0);
	}
}
