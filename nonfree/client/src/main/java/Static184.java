import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public static int anInt2740;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_35 = new Class154(29, 3);

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
	public static boolean method2358(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
	public static void method2359(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 16);
		local8.method6229();
	}
}
