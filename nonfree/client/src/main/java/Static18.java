import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_7 = new Class130(39, 4);

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_8 = new Class130(27, -1);

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method893(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = null;
		@Pc(18) int local18 = arg0.indexOf("--> ");
		if (local18 >= 0) {
			local14 = arg0.substring(0, local18 + 4);
			arg0 = arg0.substring(local18 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(46) int local46 = arg0.indexOf(" ", "directlogin ".length());
			if (local46 >= 0) {
				@Pc(51) int local51 = arg0.length();
				arg0 = arg0.substring(0, local46) + " ";
				for (@Pc(67) int local67 = local46 + 1; local67 < local51; local67++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local14 == null ? arg0 : local14 + arg0;
	}
}
