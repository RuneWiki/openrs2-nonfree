import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "J")
	public static long aLong160;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	public static final int[] anIntArray398 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4962(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static76.aClass58_34.method1237(Static321.anInt5554) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static76.aClass58_36.method1237(Static321.anInt5554) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
