import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Lclient!kda;")
	public static Class160 aClass160_70;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!dr;")
	public static final Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	public static int anInt5941 = 0;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "Lclient!lb;")
	public static final Class174 aClass174_22 = new Class174(16);

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "[I")
	public static final int[] anIntArray420 = new int[1];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)Z")
	public static boolean method5135(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
	public static void method5136(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static49.method1492(arg1, null, arg4, arg0, arg3, arg2, -1);
	}
}
