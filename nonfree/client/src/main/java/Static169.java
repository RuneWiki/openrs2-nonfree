import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[[Lclient!cd;")
	public static Class24[][] aClass24ArrayArray1;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
	public static int anInt3408;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString117 = "K";

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
	public static int anInt3377 = 0;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	public static int anInt3385 = 0;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	public static int anInt3391 = 0;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString118 = "M";

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method2662(@OriginalArg(2) String arg0) {
		return Static41.method625(arg0, 16);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)Lclient!q;")
	public static Class134 method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass134_1;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Lclient!mg;")
	public static Class113 method2665(@OriginalArg(1) int arg0) {
		@Pc(6) Class113 local6 = (Class113) Static11.aClass61_23.method1384((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(23) byte[] local23 = Static94.aClass132_37.method3194(31, arg0);
		local6 = new Class113();
		if (local23 != null) {
			local6.method2558(new Class8_Sub2(local23), arg0);
		}
		Static11.aClass61_23.method1377((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
	public static void method2666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static66.aClass8_Sub2_Sub1_4.method2398(182);
		Static66.aClass8_Sub2_Sub1_4.method2363(arg1);
		Static66.aClass8_Sub2_Sub1_4.method2326(arg0);
	}
}
