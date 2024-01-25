import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt5290;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!ae;")
	public static Class4 aClass4_26 = null;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt5289 = -1;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!am;ZLjava/lang/String;)V")
	public static void method4606(@OriginalArg(1) Class9 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(25) int local25 = Static302.aClass136_4.method3121(null, arg2, 250);
		@Pc(34) int local34 = Static302.aClass136_4.method3128(null, arg2, 250) * 13;
		Static111.aClass63_3.method1982(6, 6, local25 + 4 + 4, local34 + 8, -16777216, 0);
		Static111.aClass63_3.method1955(6, 6, local25 + 4 + 4, local34 + 4 + 4, -1, 0);
		arg0.method5047(local34, null, -1, 0, 10, 0, arg2, null, 1, local25, null, 1, -1, 10, 0);
		Static29.method507(local34 + 4 + 4, 4 + 4 + local25, 6, 6);
		if (arg1) {
			Static111.aClass63_3.method2049();
		}
	}
}
