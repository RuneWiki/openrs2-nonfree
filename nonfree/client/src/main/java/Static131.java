import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Lclient!qp;")
	public static Class171 aClass171_3;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "[B")
	public static byte[] aByteArray43;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString96 = "";

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public static int anInt2971 = 0;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
	public static boolean aBoolean249 = true;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V")
	public static void method2635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static338.anInt5369 && arg3 <= Static295.anInt5964) {
			@Pc(19) int local19 = Static181.method3367(Static229.anInt4777, arg1, Static165.anInt3366);
			@Pc(25) int local25 = Static181.method3367(Static229.anInt4777, arg2, Static165.anInt3366);
			Static68.method1269(local25, arg0, local19, arg3);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lclient!in;")
	public static Class4_Sub1_Sub11 method2636() {
		return Static42.aClass4_Sub1_Sub11_2;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
	public static void method2637() {
		Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
		Static206.anInt4340 = -1;
		Static40.anInt911 = 0;
		Static253.anInt5245 = -1;
		Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
		Static302.anInt6099 = 0;
		Static94.anInt2092 = -1;
		Static326.anInt6408 = -1;
		Static296.anInt5970 = 0;
		Static71.method1354();
		Static209.method3651();
		for (@Pc(31) int local31 = 0; local31 < Static253.aClass2_Sub2_Sub1_Sub1Array1.length; local31++) {
			if (Static253.aClass2_Sub2_Sub1_Sub1Array1[local31] != null) {
				Static253.aClass2_Sub2_Sub1_Sub1Array1[local31].anInt6479 = -1;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static101.aClass2_Sub2_Sub1_Sub2Array6.length; local54++) {
			if (Static101.aClass2_Sub2_Sub1_Sub2Array6[local54] != null) {
				Static101.aClass2_Sub2_Sub1_Sub2Array6[local54].anInt6479 = -1;
			}
		}
		Static248.method4309();
		Static303.anInt3065 = 1;
		Static233.method3965(30);
		for (@Pc(83) int local83 = 0; local83 < 100; local83++) {
			Static60.aBooleanArray8[local83] = true;
		}
		Static65.method1096();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)I")
	public static int method2639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}
}
