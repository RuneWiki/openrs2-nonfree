import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
	public static int[] anIntArray622;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_12 = new Class352(12, 0, 1, 0);

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
	public static final int[] anIntArray623 = new int[14];

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public static int anInt8216 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method6838() {
		Static38.aClass187_7.method4076();
		Static7.aClass187_1.method4076();
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public static String method6841(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static514.aClass303_35.method7473(Static232.anInt4258) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static514.aClass303_37.method7473(Static232.anInt4258) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!wia;ZJII)V")
	public static void method6842(@OriginalArg(2) Class386 arg0, @OriginalArg(4) long arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static109.method1911(arg0, arg1, arg3, arg2);
	}
}
