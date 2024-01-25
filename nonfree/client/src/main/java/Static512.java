import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_159 = new Class133(47, -2);

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_64 = new Class125(8);

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
	public static int anInt8932 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method7332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(16) String local16 = arg2[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg1 + arg0;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(37) String local37 = arg2[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local29);
			for (@Pc(67) int local67 = arg1; local67 < local27; local67++) {
				@Pc(73) String local73 = arg2[local67];
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
