import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString119 = "Please wait...";

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
	public static final int[] anIntArray316 = new int[50];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[Lclient!fd;IBIZ)V")
	public static void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) Class72[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class72 local13 = arg1[local7];
			if (local13 != null && arg2 == local13.anInt1813) {
				Static27.method475(local13, arg4, arg3, arg0);
				Static194.method3525(arg0, arg3, local13);
				if (local13.anInt1841 > local13.anInt1844 - local13.anInt1829) {
					local13.anInt1841 = local13.anInt1844 - local13.anInt1829;
				}
				if (local13.anInt1841 < 0) {
					local13.anInt1841 = 0;
				}
				if (local13.anInt1795 - local13.anInt1806 < local13.anInt1864) {
					local13.anInt1864 = local13.anInt1795 - local13.anInt1806;
				}
				if (local13.anInt1864 < 0) {
					local13.anInt1864 = 0;
				}
				if (local13.anInt1825 == 0) {
					Static124.method3067(arg4, local13);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I")
	public static int method3130() {
		return ((Static147.anInt3292 == 0 ? 0 : 1) << 21) + ((Static144.anInt3226 == 0 ? 0 : 1) << 20) + ((Static192.anInt4154 & 0x3) << 11) + ((Static318.aBoolean552 ? 1 : 0) << 9) + ((Static200.aBoolean353 ? 1 : 0) << 8) + ((Static221.aBoolean389 ? 1 : 0) << 6) + ((Static135.aBoolean261 ? 1 : 0) << 5) + ((Static336.aBoolean579 ? 1 : 0) << 4) + (Static293.anInt5927 & 0x7) + ((Static6.aBoolean170 ? 1 : 0) << 3) - (-((Static128.aBoolean242 ? 1 : 0) << 10) - ((Static58.aBoolean95 ? 1 : 0) << 13)) + ((Static86.aBoolean166 ? 1 : 0) << 15) + ((Static131.aBoolean249 ? 1 : 0) << 16) + (Static152.anInt3390 << 17) + ((Static240.aBoolean423 ? 1 : 0) << 19) + ((Static235.anInt6709 == 0 ? 0 : 1) << 22) + (Static143.method2802() << 23) + (Static235.anInt6712 << 25) + ((Static68.aBoolean122 ? 1 : 0) << 27) + (Static273.anInt5611 << 28);
	}
}
