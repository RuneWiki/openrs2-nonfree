import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	public static int anInt5131;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	public static int anInt5134;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
	public static int anInt5133 = 0;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_151 = new Class208(101, 8);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method4592(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg0[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(36) int local36 = arg1 + arg2;
			@Pc(38) int local38 = 0;
			for (@Pc(40) int local40 = arg2; local40 < local36; local40++) {
				@Pc(46) String local46 = arg0[local40];
				if (local46 == null) {
					local38 += 4;
				} else {
					local38 += local46.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local38);
			for (@Pc(67) int local67 = arg2; local67 < local36; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local65.append("null");
				} else {
					local65.append(local73);
				}
			}
			return local65.toString();
		}
	}
}
