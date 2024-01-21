import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1013 = Static65.method1172("Walk here");

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1009 = aClass46_1013;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1012 = Static65.method1172("Please try using a different world)3");

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1010 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1011 = Static65.method1172("Cabbage");

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
	public static int[] anIntArray332 = new int[50];

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1014 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1015 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1016 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1017 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1018 = aClass46_1012;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
	public static void method2109() {
		aClass46_1010 = null;
		aClass46_1014 = null;
		aClass46_1015 = null;
		aClass46_1009 = null;
		aClass46_1018 = null;
		aClass46_1011 = null;
		aClass46_1016 = null;
		aClass46_1012 = null;
		anIntArray332 = null;
		aClass46_1017 = null;
		aClass46_1013 = null;
		aBooleanArray16 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IZ)V")
	public static void method2110(@OriginalArg(1) boolean arg0) {
		Static177.method2831();
		Static14.anInt371++;
		if (Static14.anInt371 < 50 && !arg0) {
			return;
		}
		Static14.anInt371 = 0;
		if (Static18.aBoolean14 || Static129.aClass1_3 == null) {
			return;
		}
		Static133.aClass3_Sub4_Sub1_3.method233(168);
		try {
			Static129.aClass1_3.method6(Static133.aClass3_Sub4_Sub1_3.aByteArray5, Static133.aClass3_Sub4_Sub1_3.anInt232);
			Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
		} catch (@Pc(49) IOException local49) {
			Static18.aBoolean14 = true;
		}
	}
}
