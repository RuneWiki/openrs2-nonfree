import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!et;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	public static int anInt1177;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	public static int anInt1172 = -1;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
	public static int anInt1178 = 2;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
	public static void method843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static76.aClass2_Sub24_Sub2_7.method5734(arg0);
		Static76.aClass2_Sub24_Sub2_7.method5715(arg2);
		Static76.aClass2_Sub24_Sub2_7.method5735(arg1);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public static void method844(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub7_Sub2 local14 = Static328.method5290(16, arg0);
		local14.method1197();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
	public static boolean method845(@OriginalArg(0) int arg0) {
		if (arg0 == 2 || arg0 == 57 || arg0 == 10 || arg0 == 45 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1004;
		}
	}
}
