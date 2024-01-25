import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public static int anInt5572;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
	public static final int[] anIntArray555 = new int[2];

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
	public static final int[] anIntArray556 = new int[5];

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	public static int anInt5575 = 1;

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_242 = new Class296(82, 7);

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	public static int anInt5579 = 0;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Lclient!im;")
	public static final Class140 aClass140_81 = new Class140(43, 4);

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method4776(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static356.aClass306_74.method7165(Static179.anInt3168) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static34.aClass306_10.method7165(Static179.anInt3168) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}
