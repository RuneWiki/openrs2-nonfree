import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!c", name = "l", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
	public static boolean aBoolean134;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt1174 = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "I")
	public static int anInt1181 = -50;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V")
	public static void method1030(@OriginalArg(0) int arg0) {
		if (!Static268.method3778(arg0)) {
			return;
		}
		@Pc(15) Class273[] local15 = Static581.aClass273ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local15.length; local24++) {
			@Pc(30) Class273 local30 = local15[local24];
			if (local30 != null && local30.aClass53_8 != null) {
				local30.aClass53_8.method4087();
			}
		}
	}
}
