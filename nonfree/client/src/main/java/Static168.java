import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	public static int anInt3287;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array23;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt3290 = 0;

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString24 = null;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method2939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class240 local8 = Static231.method3929(arg2, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray31 != null) {
			@Pc(18) Class4_Sub10 local18 = new Class4_Sub10();
			local18.anObjectArray4 = local8.anObjectArray31;
			local18.aString11 = arg3;
			local18.anInt1685 = arg0;
			local18.aClass240_5 = local8;
			Static64.method1462(local18);
		}
		if (Static70.anInt1726 != 9 || !Static50.method1146(local8).method5904(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static448.method6134(Static126.aClass212_32);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 2) {
			Static448.method6134(Static139.aClass212_39);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 3) {
			Static448.method6134(Static28.aClass212_7);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 4) {
			Static448.method6134(Static189.aClass212_53);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 5) {
			Static448.method6134(Static8.aClass212_2);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 6) {
			Static448.method6134(Static227.aClass212_62);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 7) {
			Static448.method6134(Static88.aClass212_87);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 8) {
			Static448.method6134(Static78.aClass212_20);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 9) {
			Static448.method6134(Static138.aClass212_38);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
		if (arg0 == 10) {
			Static448.method6134(Static464.aClass212_101);
			Static127.method2398(arg1, arg2, local8.anInt6876);
		}
	}
}
