import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "[Lclient!eu;")
	public static Class97[] aClass97Array1;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "F")
	public static float aFloat45 = 0.25F;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI[Lclient!or;IZ)V")
	public static void method1836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class260[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) Class260 local18 = arg2[local12];
			if (local18 != null && local18.anInt6993 == arg0) {
				Static287.method4536(local18, arg4, arg3, arg1);
				Static303.method4658(local18, arg3, arg1);
				if (local18.anInt6939 - local18.anInt6963 < local18.anInt7013) {
					local18.anInt7013 = local18.anInt6939 - local18.anInt6963;
				}
				if (local18.anInt6946 > local18.anInt6970 - local18.anInt6971) {
					local18.anInt6946 = local18.anInt6970 - local18.anInt6971;
				}
				if (local18.anInt7013 < 0) {
					local18.anInt7013 = 0;
				}
				if (local18.anInt6946 < 0) {
					local18.anInt6946 = 0;
				}
				if (local18.anInt7003 == 0) {
					Static249.method4132(arg4, local18);
				}
			}
		}
	}
}
