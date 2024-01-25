import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
	public static boolean method7152(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)Lclient!in;")
	public static Class160 method7155(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static115.aClass160ArrayArray1[local14] == null || Static115.aClass160ArrayArray1[local14][local18] == null) {
			@Pc(32) boolean local32 = Static67.method1102(local14);
			if (!local32) {
				return null;
			}
		}
		return Static115.aClass160ArrayArray1[local14][local18];
	}
}
