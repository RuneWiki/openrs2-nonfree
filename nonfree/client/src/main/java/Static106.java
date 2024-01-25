import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt2100 = -1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public static int anInt2101 = 503;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBZI[Lclient!sca;)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class302[] arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg4.length; local5++) {
			@Pc(13) Class302 local13 = arg4[local5];
			if (local13 != null && arg3 == local13.anInt8806) {
				Static546.method7958(arg0, arg1, local13, arg2);
				Static155.method2436(arg1, arg0, local13);
				if (local13.anInt8787 > local13.anInt8812 - local13.anInt8801) {
					local13.anInt8787 = local13.anInt8812 - local13.anInt8801;
				}
				if (local13.anInt8804 > local13.anInt8813 - local13.anInt8814) {
					local13.anInt8804 = local13.anInt8813 - local13.anInt8814;
				}
				if (local13.anInt8787 < 0) {
					local13.anInt8787 = 0;
				}
				if (local13.anInt8804 < 0) {
					local13.anInt8804 = 0;
				}
				if (local13.anInt8816 == 0) {
					Static409.method6504(local13, arg2);
				}
			}
		}
	}
}
