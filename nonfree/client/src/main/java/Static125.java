import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_19;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!vb;")
	public static Class75 aClass75_6;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt3203 = 0;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
	public static int[] anIntArray386 = new int[100];

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt3205 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt3206 = 0;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	public static int anInt3207 = 0;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray29 = new int[104][104];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method2193() {
		if (Static98.aBoolean151 && Static132.anInt3270 != Static80.anInt2211) {
			Static75.method1350(Static88.anInt2447, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0], Static132.anInt3270, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], Static95.anInt2596);
		} else if (Static29.anInt1010 != Static132.anInt3270) {
			Static29.anInt1010 = Static132.anInt3270;
			Static58.method1185(Static132.anInt3270);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLclient!ef;IIII)V")
	public static void method2194(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static40.anInt1261 = arg0;
		Static110.aClass16_136 = arg1;
		Static70.anInt1540 = 1;
		Static42.aBoolean71 = false;
		Static63.anInt1933 = arg2;
		Static33.anInt1080 = 2;
		Static108.anInt2897 = arg3;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method2195() {
		anIntArrayArray29 = null;
		aClass16_Sub1_19 = null;
		anIntArray386 = null;
		aClass75_6 = null;
	}
}
