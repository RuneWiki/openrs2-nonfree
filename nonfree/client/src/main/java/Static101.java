import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!jh", name = "ib", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
	public static void method1450(@OriginalArg(0) int arg0) {
		if (!Static126.method1762(arg0)) {
			return;
		}
		@Pc(16) Class6[] local16 = Static49.aClass6ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class6 local24 = local16[local18];
			if (local24 != null) {
				local24.anInt210 = 0;
				local24.anInt265 = 0;
			}
		}
	}
}
