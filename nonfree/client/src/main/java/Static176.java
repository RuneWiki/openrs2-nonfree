import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
	public static final int[] anIntArray284 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_67 = new Class44(90, -2);

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!mea;")
	public static Class230 aClass230_2 = null;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZI)V")
	public static void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static8.anInt58 = arg3;
		Static286.anInt4894 = arg1;
		Static40.anInt1719 = arg2;
		Static305.anInt5329 = arg0;
		Static243.anInt4386 = arg4;
		if (Static40.anInt1719 >= 100) {
			@Pc(28) int local28 = Static243.anInt4386 * 512 + 256;
			@Pc(34) int local34 = Static8.anInt58 * 512 + 256;
			@Pc(43) int local43 = Static152.method2434(local28, Static586.anInt10060, local34) - Static286.anInt4894;
			@Pc(48) int local48 = local28 - Static233.anInt4273;
			@Pc(53) int local53 = local43 - Static396.anInt7302;
			@Pc(58) int local58 = local34 - Static74.anInt1618;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static668.anInt11106 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static219.anInt4123 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			Static4.anInt27 = 0;
			if (Static668.anInt11106 < 1024) {
				Static668.anInt11106 = 1024;
			}
			if (Static668.anInt11106 > 3072) {
				Static668.anInt11106 = 3072;
			}
		}
		Static115.anInt2304 = -1;
		Static667.anInt11097 = -1;
		Static378.anInt6935 = 2;
	}
}
