import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_843 = null;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt2657 = 0;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_844 = Static170.method3101("nav");

	@OriginalMember(owner = "client!n", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray70 = new byte[50][];

	@OriginalMember(owner = "client!n", name = "r", descriptor = "J")
	public static long aLong90 = 0L;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_845 = Static170.method3101("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!eh;")
	public static Class28 aClass28_846 = Static170.method3101("<col=ffffff>");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method2112() {
		aByteArrayArray70 = null;
		aClass28_844 = null;
		aClass28_843 = null;
		anIntArray465 = null;
		aClass28_846 = null;
		aClass28_845 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method2113() {
		Static72.aClass63_12.method2344();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method2114() {
		Static80.anInt3606 = 0;
		Static81.anInt2370 = 0;
		Static66.method1603();
		Static169.method649();
		Static86.method1992();
		Static135.method2646();
		@Pc(22) int local22;
		for (@Pc(17) int local17 = 0; local17 < Static80.anInt3606; local17++) {
			local22 = Static93.anIntArray446[local17];
			if (Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local22].anInt1830 != Static14.anInt481) {
				Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local22] = null;
			}
		}
		if (Static18.aClass3_Sub8_Sub1_1.anInt1948 != Static11.anInt410) {
			throw new RuntimeException("gpp1 pos:" + Static18.aClass3_Sub8_Sub1_1.anInt1948 + " psize:" + Static11.anInt410);
		}
		for (local22 = 0; local22 < Static112.anInt2872; local22++) {
			if (Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local22]] == null) {
				throw new RuntimeException("gpp2 pos:" + local22 + " size:" + Static112.anInt2872);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lclient!eh;")
	public static Class28 method2115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - arg1;
		if (local4 < -9) {
			return Static131.aClass28_1087;
		} else if (local4 < -6) {
			return Static55.aClass28_466;
		} else if (local4 < -3) {
			return Static8.aClass28_381;
		} else if (local4 < 0) {
			return Static94.aClass28_820;
		} else if (local4 > 9) {
			return Static168.aClass28_1427;
		} else if (local4 > 6) {
			return Static122.aClass28_1038;
		} else if (local4 > 3) {
			return Static116.aClass28_980;
		} else if (local4 > 0) {
			return Static157.aClass28_1308;
		} else {
			return Static21.aClass28_233;
		}
	}
}
