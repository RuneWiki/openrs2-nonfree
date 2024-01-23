import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!uj", name = "Z", descriptor = "Lclient!ak;")
	public static Class7 aClass7_217;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "[I")
	public static int[] anIntArray630 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString182 = "white:";

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "[I")
	public static int[] anIntArray631 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method4174(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(20) String local20 = arg0[arg2];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(32) int local32 = arg1 + arg2;
			@Pc(34) int local34 = 0;
			for (@Pc(42) int local42 = arg2; local42 < local32; local42++) {
				@Pc(53) String local53 = arg0[local42];
				if (local53 == null) {
					local34 += 4;
				} else {
					local34 += local53.length();
				}
			}
			@Pc(71) StringBuffer local71 = new StringBuffer(local34);
			for (@Pc(73) int local73 = arg2; local73 < local32; local73++) {
				@Pc(84) String local84 = arg0[local73];
				if (local84 == null) {
					local71.append("null");
				} else {
					local71.append(local84);
				}
			}
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)V")
	public static void method4175(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(6, arg0);
		local4.method1853();
	}
}
