import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
	public static int anInt6691;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "[[Lclient!gi;")
	public static Class93[][] aClass93ArrayArray4;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_92 = new Class208(12, 6);

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public static int anInt6693 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)V")
	public static void method5356(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static219.aBooleanArray19[arg0]) {
			Static166.aClass171_41.method3653(arg0);
			aClass93ArrayArray4[arg0] = null;
			Static118.aClass93ArrayArray1[arg0] = null;
			Static219.aBooleanArray19[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)Z")
	public static boolean method5359(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 19 || arg0 == 17 || arg0 == 11 || arg0 == 6) {
			return true;
		} else {
			return arg0 == 48 || arg0 == 1004;
		}
	}
}
