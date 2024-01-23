import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt4821 = -1;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Lclient!jl;")
	public static Class89 aClass89_36 = new Class89(64);

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	public static void method3586() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static103.aBooleanArray18[local7] = false;
		}
		Static106.anInt2378 = 1;
		Static186.anInt4094 = 0;
		anInt4821 = -1;
		Static248.anInt5065 = -1;
		Static121.anInt2627 = 0;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3588(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static111.aString146 + " (" + local8 + ")</col>";
		} else if (local8.length() <= 6) {
			return " <col=ffff00>" + local8 + "</col>";
		} else {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static279.aString397 + " (" + local8 + ")</col>";
		}
	}
}
