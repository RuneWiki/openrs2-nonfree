import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2275(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(18) String local18 = arg1[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg2 + arg0;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg1[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(64) int local64 = arg2; local64 < local29; local64++) {
				@Pc(70) String local70 = arg1[local64];
				if (local70 == null) {
					local62.append("null");
				} else {
					local62.append(local70);
				}
			}
			return local62.toString();
		}
	}
}
