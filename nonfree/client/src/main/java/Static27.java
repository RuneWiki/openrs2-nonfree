import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	public static final int anInt354 = 1337;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "I")
	public static int anInt356 = -1;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method311(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(16) String local16 = arg0[arg2];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg2; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			for (@Pc(67) int local67 = arg2; local67 < local27; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local56.append("null");
				} else {
					local56.append(local73);
				}
			}
			return local56.toString();
		}
	}
}
