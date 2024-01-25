import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	public static int anInt6669;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public static int anInt6670 = 0;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_151 = new Class211(58, -2);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!vr;)Z")
	public static boolean method5169(@OriginalArg(1) Class258 arg0) {
		return Static368.aClass258_8 == arg0 || Static271.aClass258_5 == arg0 || arg0 == Static107.aClass258_2 || arg0 == Static168.aClass258_3;
	}
}
