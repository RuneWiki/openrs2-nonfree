import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
	public static boolean aBoolean420 = true;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
	public static int anInt6076 = -2;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZII)Ljava/lang/String;")
	public static String method5146(@OriginalArg(0) long arg0, @OriginalArg(3) int arg1) {
		Static534.method6879(arg0);
		@Pc(24) Calendar local24 = Static387.aCalendar3;
		@Pc(28) int local28 = local24.get(5);
		@Pc(32) int local32 = local24.get(2);
		@Pc(36) int local36 = local24.get(1);
		@Pc(40) int local40 = local24.get(11);
		@Pc(44) int local44 = local24.get(12);
		return arg1 == 3 ? Static454.method6129(arg0, arg1) : Integer.toString(local28 / 10) + local28 % 10 + "-" + Static262.aStringArrayArray1[arg1][local32] + "-" + local36 + " " + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10;
	}
}
