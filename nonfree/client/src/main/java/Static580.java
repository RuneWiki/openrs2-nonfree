import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!um", name = "i", descriptor = "J")
	public static long aLong259;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "Lclient!kda;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_45 = new Class25(4);

	@OriginalMember(owner = "client!um", name = "p", descriptor = "Z")
	public static boolean aBoolean712 = false;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Lclient!st;")
	public static final Class314 aClass314_142 = new Class314(15, -1);

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	public static int anInt9474 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Z")
	public static boolean method8102(@OriginalArg(1) int arg0) {
		if (arg0 == 3 || arg0 == 17 || arg0 == 10 || arg0 == 45 || arg0 == 9) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1007;
		}
	}
}
