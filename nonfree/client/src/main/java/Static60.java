import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray48;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Lclient!qa;")
	public static Class62 aClass62_37;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;")
	public static String method6855(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg0[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(62) int local62 = arg1; local62 < local27; local62++) {
				@Pc(68) String local68 = arg0[local62];
				if (local68 == null) {
					local60.append("null");
				} else {
					local60.append(local68);
				}
			}
			return local60.toString();
		}
	}
}
