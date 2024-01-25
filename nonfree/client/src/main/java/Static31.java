import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public static int anInt1230;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!oh;")
	public static Class237 aClass237_10;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
	public static boolean method1116(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public static void method1117(@OriginalArg(1) int arg0) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(1, arg0);
		local12.method3512();
	}
}
