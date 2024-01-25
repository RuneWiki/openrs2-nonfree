import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	public static int anInt1546;

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Please remove ";

	@OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!ds", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString93 = "Loading title screen - ";

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V")
	public static void method1357(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub9_Sub16 local16 = Static239.method4052(8, arg0);
		local16.method4138();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)I")
	public static int method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg3;
			arg3 = local14;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return 1 + 7 - arg3 - arg5;
		}
	}
}
