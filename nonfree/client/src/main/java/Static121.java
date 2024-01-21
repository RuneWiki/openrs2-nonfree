import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!w", name = "L", descriptor = "Lclient!gd;")
	public static Class27 aClass27_46;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_1398 = Static109.method1737("Location");

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Lclient!na;")
	public static Class53 aClass53_1399 = Static109.method1737("Offline");

	@OriginalMember(owner = "client!w", name = "ab", descriptor = "Lclient!na;")
	private static Class53 aClass53_1402 = Static109.method1737("Malformed login packet)3");

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_1400 = aClass53_1402;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	public static int anInt2824 = 0;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_1401 = Static109.method1737("Privater Chat");

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1403 = Static109.method1737("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!w", name = "hb", descriptor = "[I")
	public static int[] anIntArray408 = new int[2000];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(JI)V")
	public static void method1934(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	public static void method1935() {
		aClass27_46 = null;
		aLongArray6 = null;
		aClass53_1398 = null;
		aClass53_1399 = null;
		aClass53_1400 = null;
		aClass53_1403 = null;
		aClass53_1402 = null;
		aClass53_1401 = null;
		anIntArray408 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	public static void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = 2048 - arg1 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg3 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg5;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (local21 != 0) {
			local36 = Class3_Sub1_Sub5_Sub1.anIntArray86[local21];
			local40 = Class3_Sub1_Sub5_Sub1.anIntArray84[local21];
			local51 = local40 * 0 - local36 * arg5 >> 16;
			local27 = local36 * 0 + local40 * arg5 >> 16;
			local25 = local51;
		}
		if (local14 != 0) {
			local36 = Class3_Sub1_Sub5_Sub1.anIntArray86[local14];
			local40 = Class3_Sub1_Sub5_Sub1.anIntArray84[local14];
			local51 = local27 * local36 + local40 * 0 >> 16;
			local27 = local40 * local27 - local36 * 0 >> 16;
			local23 = local51;
		}
		Static39.anInt1177 = arg2 - local23;
		Static115.anInt2618 = arg0 - local27;
		Static95.anInt2273 = arg4 - local25;
		Static48.anInt1302 = arg3;
		Static72.anInt1807 = arg1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)V")
	public static void method1939(@OriginalArg(0) int arg0) {
		if (Static40.anInt1183 == 0) {
			Static120.aClass3_Sub10_Sub4_2.method1893(arg0);
		} else {
			Static117.anInt2678 = arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Lclient!w;")
	public static Class3_Sub1_Sub16 method1941(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub16 local10 = (Class3_Sub1_Sub16) Static32.aClass75_29.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static123.aClass62_28.method1512(3, arg0);
		local10 = new Class3_Sub1_Sub16();
		if (local25 != null) {
			local10.method1943(new Class3_Sub7(local25));
		}
		Static32.aClass75_29.method1730(local10, (long) arg0);
		return local10;
	}
}
