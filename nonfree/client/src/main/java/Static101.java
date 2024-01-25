import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dka", name = "z", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_18 = new Class168(5);

	@OriginalMember(owner = "client!dka", name = "y", descriptor = "[I")
	public static int[] anIntArray93 = new int[1];

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(BII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method1548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg2[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(33) int local33 = arg1 + arg0;
			@Pc(35) int local35 = 0;
			for (@Pc(37) int local37 = arg1; local37 < local33; local37++) {
				@Pc(43) String local43 = arg2[local37];
				if (local43 == null) {
					local35 += 4;
				} else {
					local35 += local43.length();
				}
			}
			@Pc(77) StringBuffer local77 = new StringBuffer(local35);
			for (@Pc(79) int local79 = arg1; local79 < local33; local79++) {
				@Pc(87) String local87 = arg2[local79];
				if (local87 == null) {
					local77.append("null");
				} else {
					local77.append(local87);
				}
			}
			return local77.toString();
		}
	}
}
