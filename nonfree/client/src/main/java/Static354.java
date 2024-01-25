import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
	public static int anInt6877;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Lclient!mk;")
	public static final Class206 aClass206_2 = new Class206();

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!mk;")
	public static final Class206 aClass206_5 = new Class206();

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!mk;")
	public static final Class206 aClass206_3 = new Class206();

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!mk;")
	public static final Class206 aClass206_4 = new Class206();

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Lclient!kba;")
	public static Class163 aClass163_40 = new Class163();

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt6878 = 0;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int anInt6879 = 0;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public static void method5747() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static55.aClass147Array1[local12] = null;
		}
		Static257.anInt5538 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)Z")
	public static boolean method5748(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
