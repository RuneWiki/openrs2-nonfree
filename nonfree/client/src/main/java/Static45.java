import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bja", name = "P", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!bja", name = "R", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!bja", name = "M", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_10 = new Class165(8);

	@OriginalMember(owner = "client!bja", name = "O", descriptor = "I")
	public static int anInt1064 = 0;

	@OriginalMember(owner = "client!bja", name = "Q", descriptor = "Lclient!ml;")
	public static final Class223 aClass223_1 = new Class223("", 18);

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(Lclient!jp;I)Lclient!jfa;")
	public static Class166 method1121(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(12) int local12 = arg0.method8593();
		return new Class166(local12);
	}
}
