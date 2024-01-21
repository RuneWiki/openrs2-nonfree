import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!sd;")
	public static Class2 aClass2_7;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!sd;")
	public static Class2 aClass2_8;

	@OriginalMember(owner = "client!h", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!h", name = "G", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_37;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray124 = new int[128];

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!ae;")
	private static Class5 aClass5_478 = Static56.method972(" seconds)3");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Lclient!ae;")
	public static Class5 aClass5_479 = Static56.method972("Hidden)2use");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_480 = Static56.method972(" )2> @cya@");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_481 = Static56.method972("Ignorieren");

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public static int anInt1056 = 0;

	@OriginalMember(owner = "client!h", name = "B", descriptor = "I")
	public static int anInt1058 = 99;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Lclient!ae;")
	public static Class5 aClass5_482 = aClass5_478;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZI)V")
	public static void method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static56.anInt1483 == 0 || arg1 == 0 || Static34.anInt966 >= 50) {
			return;
		}
		Static115.anIntArray380[Static34.anInt966] = arg2;
		Static108.anIntArray370[Static34.anInt966] = arg1;
		Static56.anIntArray173[Static34.anInt966] = arg0;
		Static17.aClass54Array1[Static34.anInt966] = null;
		Static95.anIntArray274[Static34.anInt966] = 0;
		Static34.anInt966++;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method701() {
		if (!Static103.aBoolean143) {
			return;
		}
		Static23.anIntArray92 = null;
		Static32.anIntArray117 = null;
		Static15.aClass2_2 = null;
		Static91.anIntArray267 = null;
		Static115.anIntArray381 = null;
		Static22.anIntArray90 = null;
		Static100.aClass3_Sub1_Sub2_Sub3_5 = null;
		Static42.anIntArray141 = null;
		Static48.aClass2_10 = null;
		Static9.anIntArray51 = null;
		Static47.aClass2_9 = null;
		Static106.aClass3_Sub1_Sub2_Sub4_16 = null;
		Static102.aClass2_22 = null;
		Static42.anIntArray140 = null;
		Static113.aClass2_26 = null;
		Static16.aClass2_3 = null;
		Static57.aClass2_13 = null;
		Static110.aClass2_24 = null;
		Static93.aClass3_Sub1_Sub2_Sub4_12 = null;
		Static96.aClass3_Sub1_Sub2_Sub4Array4 = null;
		Static82.aClass3_Sub1_Sub2_Sub3_4 = null;
		Static37.aClass2_6 = null;
		Static62.method1082();
		Static105.method1750(true);
		Static103.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method706() {
		aClass5_482 = null;
		aByteArrayArray6 = null;
		aClass2_7 = null;
		aClass5_481 = null;
		aClass5_480 = null;
		aClass5_478 = null;
		aClass11_Sub1_37 = null;
		aClass2_8 = null;
		anIntArray124 = null;
		aClass5_479 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!bf;II)Z")
	public static boolean method713(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1868(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static69.method1183(local8);
			return true;
		}
	}
}
