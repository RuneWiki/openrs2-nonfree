import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!sba", name = "K", descriptor = "I")
	public static int anInt8567;

	@OriginalMember(owner = "client!sba", name = "M", descriptor = "Lclient!qr;")
	public static final Class306 aClass306_38 = new Class306(16);

	@OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
	public static final int anInt8569 = 1339;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZI[Lclient!mj;III)V")
	public static void method7384(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class238[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class238 local13 = arg1[local7];
			if (local13 != null && arg2 == local13.anInt5963) {
				Static119.method1759(arg4, arg0, arg3, local13);
				Static390.method5746(arg3, arg4, local13);
				if (local13.anInt5941 - local13.anInt5985 < local13.anInt5951) {
					local13.anInt5951 = local13.anInt5941 - local13.anInt5985;
				}
				if (local13.anInt5953 > local13.anInt5995 - local13.anInt5973) {
					local13.anInt5953 = local13.anInt5995 - local13.anInt5973;
				}
				if (local13.anInt5951 < 0) {
					local13.anInt5951 = 0;
				}
				if (local13.anInt5953 < 0) {
					local13.anInt5953 = 0;
				}
				if (local13.anInt5976 == 0) {
					Static374.method5569(local13, arg0);
				}
			}
		}
	}
}
