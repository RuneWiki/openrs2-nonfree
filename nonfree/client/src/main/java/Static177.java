import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public static int anInt3970;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt3973;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1451 = method3050("glow2:");

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1452 = aClass46_1451;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1453 = method3050("Bad session id)3");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1454 = aClass46_1451;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1455 = method3050("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1456 = method3050("::rect_debug");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1457 = aClass46_1453;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1458 = method3050("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1459 = method3050(":tradereq:");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "[I")
	public static final int[] anIntArray429 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method3049() {
		Static80.aClass66_32.method2218();
		Static188.aClass66_52.method2218();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Lclient!jd;")
	public static Class46 method3050(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(14) int local14 = local2.length;
		@Pc(18) Class46 local18 = new Class46();
		@Pc(20) int local20 = 0;
		local18.aByteArray20 = new byte[local14];
		while (local20 < local14) {
			@Pc(32) int local32 = local2[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local20 >= local14) {
					break;
				}
				@Pc(48) int local48 = local2[local20++] & 0xFF;
				local18.aByteArray20[local18.anInt2141++] = (byte) (local48 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local18.aByteArray20[local18.anInt2141++] = (byte) local32;
			}
		}
		local18.method1641();
		return local18.method1681();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method3052(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
	public static int method3053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
