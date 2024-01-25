import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
	public static int anInt5686 = 20;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5110(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(17) String local17 = arg1[arg2];
			return local17 == null ? "null" : local17.toString();
		} else {
			@Pc(28) int local28 = arg2 + arg0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = arg2; local32 < local28; local32++) {
				@Pc(38) String local38 = arg1[local32];
				if (local38 == null) {
					local30 += 4;
				} else {
					local30 += local38.length();
				}
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local30);
			for (@Pc(59) int local59 = arg2; local59 < local28; local59++) {
				@Pc(65) String local65 = arg1[local59];
				if (local65 == null) {
					local57.append("null");
				} else {
					local57.append(local65);
				}
			}
			return local57.toString();
		}
	}
}
