import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uda", name = "G", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_59 = new Class167(5);

	@OriginalMember(owner = "client!uda", name = "M", descriptor = "[I")
	public static final int[] anIntArray548 = new int[13];

	@OriginalMember(owner = "client!uda", name = "P", descriptor = "[Lclient!nea;")
	public static final Class232[] aClass232Array1 = new Class232[4];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg1 < 512 || (Static338.anInt6508 - 2) * 512 < arg2 || arg1 > (Static390.anInt7654 - 2) * 512) {
			Static509.anIntArray540[0] = Static509.anIntArray540[1] = -1;
			return;
		}
		@Pc(46) int local46 = Static461.method6782(arg1, arg0, arg2) - arg3;
		Static566.aClass81_6.U(arg6, 0, 0);
		Static39.aClass7_2.method7794(Static566.aClass81_6);
		Static39.aClass7_2.AA(arg2, local46, arg1, Static509.anIntArray540);
		Static566.aClass81_6.U(-arg6, 0, 0);
		Static39.aClass7_2.method7794(Static566.aClass81_6);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static527.method7455(arg1, arg8, arg5)) {
			return false;
		}
		@Pc(15) int local15 = Static299.anIntArray330[1];
		@Pc(19) int local19 = Static299.anIntArray330[2];
		@Pc(23) int local23 = Static299.anIntArray330[0];
		if (!Static527.method7455(arg0, arg3, arg2)) {
			return false;
		}
		@Pc(35) int local35 = Static299.anIntArray330[0];
		@Pc(39) int local39 = Static299.anIntArray330[1];
		@Pc(43) int local43 = Static299.anIntArray330[2];
		if (Static527.method7455(arg7, arg6, arg4)) {
			@Pc(55) int local55 = Static299.anIntArray330[1];
			@Pc(59) int local59 = Static299.anIntArray330[0];
			@Pc(63) int local63 = Static299.anIntArray330[2];
			return Static485.method7070(local59, local39, local55, local19, local15, local35, local23, local43, local63);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)I")
	public static int method7453(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
