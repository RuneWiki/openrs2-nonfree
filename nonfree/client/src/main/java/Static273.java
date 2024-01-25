import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[S")
	public static short[] aShortArray89;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	public static int anInt5603;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!cl;")
	public static Class34 aClass34_8;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public static int anInt5607;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4894(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method4896(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static76.method1302(arg1, 0, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
	public static String method4897(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Static143.anInterface6_1 != null) {
			@Pc(17) String local17 = Static143.anInterface6_1.method4994(arg0, arg2, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}
}
