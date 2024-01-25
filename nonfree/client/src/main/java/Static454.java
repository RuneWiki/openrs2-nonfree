import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
	public static boolean aBoolean523 = false;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static int anInt7316 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JZII)Ljava/lang/String;")
	public static String method6129(@OriginalArg(0) long arg0, @OriginalArg(3) int arg1) {
		Static534.method6879(arg0);
		@Pc(10) Calendar local10 = Static387.aCalendar3;
		@Pc(21) int local21 = local10.get(5);
		@Pc(32) int local32 = local10.get(2) + 1;
		@Pc(36) int local36 = local10.get(1);
		@Pc(40) int local40 = local10.get(11);
		@Pc(44) int local44 = local10.get(12);
		return Integer.toString(local21 / 10) + local21 % 10 + "/" + local32 / 10 + local32 % 10 + "/" + local36 % 100 / 10 + local36 % 10 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JJ)J")
	public static long method6133(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!iga;")
	public static Class34_Sub1_Sub5 method6134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass34_Sub1_Sub5_2;
	}
}
