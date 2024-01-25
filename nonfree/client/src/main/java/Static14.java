import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method836(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg0[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg1 + arg2;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg1; local34 < local30; local34++) {
				@Pc(40) String local40 = arg0[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local32);
			for (@Pc(61) int local61 = arg1; local61 < local30; local61++) {
				@Pc(67) String local67 = arg0[local61];
				if (local67 == null) {
					local59.append("null");
				} else {
					local59.append(local67);
				}
			}
			return local59.toString();
		}
	}
}
