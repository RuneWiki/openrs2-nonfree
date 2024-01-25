import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "I")
	public static int anInt384;

	@OriginalMember(owner = "client!aka", name = "l", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
	public static int anInt392;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_8 = new Class341(3, 3);

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
	public static int anInt389 = -1;

	@OriginalMember(owner = "client!aka", name = "j", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZI)Z")
	public static boolean method407(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
