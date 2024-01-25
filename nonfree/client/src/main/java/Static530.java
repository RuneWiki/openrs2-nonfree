import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg3 && arg2 == arg6 && arg1 == arg0 && arg8 == arg5) {
			Static280.method4104(arg5, arg2, arg3, arg0, arg4);
			return;
		}
		@Pc(34) int local34 = arg3;
		@Pc(36) int local36 = arg2;
		@Pc(40) int local40 = arg3 * 3;
		@Pc(44) int local44 = arg2 * 3;
		@Pc(48) int local48 = arg7 * 3;
		@Pc(52) int local52 = arg6 * 3;
		@Pc(56) int local56 = arg1 * 3;
		@Pc(60) int local60 = arg8 * 3;
		@Pc(69) int local69 = local48 + arg0 - arg3 - local56;
		@Pc(79) int local79 = arg5 + local52 - arg2 - local60;
		@Pc(89) int local89 = local56 + local40 - local48 - local48;
		@Pc(99) int local99 = local60 + local44 - local52 - local52;
		@Pc(104) int local104 = local48 - local40;
		@Pc(109) int local109 = local52 - local44;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local125 * local69;
			@Pc(133) int local133 = local125 * local79;
			@Pc(137) int local137 = local119 * local89;
			@Pc(141) int local141 = local119 * local99;
			@Pc(145) int local145 = local104 * local111;
			@Pc(149) int local149 = local109 * local111;
			@Pc(160) int local160 = (local137 + local129 + local145 >> 12) + arg3;
			@Pc(170) int local170 = (local149 + local133 + local141 >> 12) + arg2;
			Static280.method4104(local170, local36, local34, local160, arg4);
			local34 = local160;
			local36 = local170;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method7379(@OriginalArg(0) long arg0) {
		Static81.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static81.aCalendar3.get(7);
		@Pc(17) int local17 = Static81.aCalendar3.get(5);
		@Pc(21) int local21 = Static81.aCalendar3.get(2);
		@Pc(25) int local25 = Static81.aCalendar3.get(1);
		@Pc(29) int local29 = Static81.aCalendar3.get(11);
		@Pc(33) int local33 = Static81.aCalendar3.get(12);
		@Pc(37) int local37 = Static81.aCalendar3.get(13);
		return Static430.aStringArray64[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static368.aStringArray46[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Z")
	public static boolean method7381(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
