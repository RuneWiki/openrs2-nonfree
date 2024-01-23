import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[S")
	public static short[] aShortArray69;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array9;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!ih;")
	public static Class2_Sub16_Sub1 aClass2_Sub16_Sub1_3 = new Class2_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4046(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method4049() {
		Static211.aClass2_Sub16_Sub1_2.method2198(243);
		Static211.aClass2_Sub16_Sub1_2.method2168(Static141.method2503());
		Static211.aClass2_Sub16_Sub1_2.method2143(Static60.anInt1510);
		Static211.aClass2_Sub16_Sub1_2.method2143(Static120.anInt2649);
		Static211.aClass2_Sub16_Sub1_2.method2168(Static214.anInt4370);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ek;BLclient!ek;Lclient!ek;Lclient!ek;)V")
	public static void method4050(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) Class42 arg3) {
		Static293.aClass42_106 = arg0;
		Static178.aClass42_91 = arg2;
		Static90.aClass42_22 = arg3;
		Static152.aClass42_42 = arg1;
		Static262.aClass56ArrayArray1 = new Class56[Static152.aClass42_42.method1275()][];
		Static275.aBooleanArray20 = new boolean[Static152.aClass42_42.method1275()];
	}
}
