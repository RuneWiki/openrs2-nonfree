import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!hk;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	public static int[] anIntArray356 = new int[64];

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
	public static long aLong144 = 0L;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt4023 = 1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!wf;B)Ljava/lang/String;")
	public static String method2958(@OriginalArg(0) Class191 arg0) {
		if (Static35.method737(arg0).method4556() == 0) {
			return null;
		} else if (arg0.aString434 == null || arg0.aString434.trim().length() == 0) {
			return Static303.aBoolean389 ? "Hidden-use" : null;
		} else {
			return arg0.aString434;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZJLjava/lang/String;ILjava/lang/String;S)V")
	public static void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) short arg6) {
		if (Static128.aBoolean171 || Static181.anInt3973 >= 500) {
			return;
		}
		Static112.aStringArray24[Static181.anInt3973] = arg5;
		Static190.aStringArray34[Static181.anInt3973] = arg3;
		Static144.anIntArray304[Static181.anInt3973] = arg1 == -1 ? Static263.anInt5294 : arg1;
		Static86.aShortArray64[Static181.anInt3973] = arg6;
		Static171.aLongArray6[Static181.anInt3973] = arg2;
		Static270.anIntArray485[Static181.anInt3973] = arg4;
		Static256.anIntArray475[Static181.anInt3973] = arg0;
		Static181.anInt3973++;
	}
}
