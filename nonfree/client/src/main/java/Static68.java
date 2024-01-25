import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!uda;")
	public static Class335 aClass335_2;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "[Lclient!jw;")
	public static Class4_Sub1[] aClass4_Sub1Array1;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!la;")
	public static Class196 aClass196_18;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "[[[Lclient!dn;")
	public static Class77[][][] aClass77ArrayArrayArray1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt1696 = 0;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString7 = null;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1698(@OriginalArg(1) Class5 arg0) {
		Static557.aClass62_12 = Static274.method4470(Static336.anInt6308, arg0, true);
		Static607.aClass282_15 = Static89.method2005(arg0, Static336.anInt6308);
		Static187.aClass62_4 = Static274.method4470(Static641.anInt10199, arg0, true);
		Static256.aClass282_7 = Static89.method2005(arg0, Static641.anInt10199);
		Static460.aClass62_9 = Static274.method4470(Static574.anInt9449, arg0, true);
		Static489.aClass282_12 = Static89.method2005(arg0, Static574.anInt9449);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method1700(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static141.aString19 = Static141.aString19 + arg0[0];
			Static577.anInt9502 += arg0[0].length();
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.length; local17++) {
			if (arg0[local17].startsWith("pause")) {
				@Pc(27) int local27 = 5;
				try {
					local27 = Integer.parseInt(arg0[local17].substring(6));
				} catch (@Pc(36) Exception local36) {
				}
				Static410.method6501("Pausing for " + local27 + " seconds...");
				Static234.anInt4429 = local17 + 1;
				Static541.aStringArray34 = arg0;
				Static479.aLong119 = (long) (local27 * 1000) + Static374.method6036();
				return;
			}
			Static141.aString19 = arg0[local17];
			Static239.method3940(false);
		}
	}
}
