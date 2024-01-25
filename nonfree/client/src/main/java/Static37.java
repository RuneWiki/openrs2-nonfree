import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public static int anInt842 = 20;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
	public static final int[] anIntArray72 = new int[1];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method668(@OriginalArg(1) long arg0) {
		Static165.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static165.aCalendar1.get(7);
		@Pc(22) int local22 = Static165.aCalendar1.get(5);
		@Pc(26) int local26 = Static165.aCalendar1.get(2);
		@Pc(30) int local30 = Static165.aCalendar1.get(1);
		@Pc(34) int local34 = Static165.aCalendar1.get(11);
		@Pc(38) int local38 = Static165.aCalendar1.get(12);
		@Pc(42) int local42 = Static165.aCalendar1.get(13);
		return Static437.aStringArray43[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static36.aStringArray4[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZZIII)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 <= arg4) {
			return;
		}
		@Pc(10) int local10 = (arg5 + arg4) / 2;
		@Pc(12) int local12 = arg4;
		@Pc(16) Class84_Sub1 local16 = Static190.aClass84_Sub1Array1[local10];
		Static190.aClass84_Sub1Array1[local10] = Static190.aClass84_Sub1Array1[arg5];
		Static190.aClass84_Sub1Array1[arg5] = local16;
		for (@Pc(28) int local28 = arg4; local28 < arg5; local28++) {
			if (Static326.method2436(arg3, Static190.aClass84_Sub1Array1[local28], arg2, arg1, local16, arg0) <= 0) {
				@Pc(48) Class84_Sub1 local48 = Static190.aClass84_Sub1Array1[local28];
				Static190.aClass84_Sub1Array1[local28] = Static190.aClass84_Sub1Array1[local12];
				Static190.aClass84_Sub1Array1[local12++] = local48;
			}
		}
		Static190.aClass84_Sub1Array1[arg5] = Static190.aClass84_Sub1Array1[local12];
		Static190.aClass84_Sub1Array1[local12] = local16;
		method669(arg0, arg1, arg2, arg3, arg4, local12 - 1);
		method669(arg0, arg1, arg2, arg3, local12 + 1, arg5);
	}
}
