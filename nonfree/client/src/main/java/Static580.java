import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
	public static int anInt9818;

	@OriginalMember(owner = "client!wt", name = "M", descriptor = "Lclient!rd;")
	public static Class275 aClass275_6;

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "Lclient!tq;")
	public static final Class305 aClass305_42 = new Class305(16);

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_116 = new Class181(39, 2);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "([BIII)[B")
	public static byte[] method8171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static589.method5382(arg0, arg1, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;")
	public static String method8172(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg1[arg0];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg0 + arg2;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg0; local31 < local27; local31++) {
				@Pc(37) String local37 = arg1[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			for (@Pc(58) int local58 = arg0; local58 < local27; local58++) {
				@Pc(64) String local64 = arg1[local58];
				if (local64 == null) {
					local56.append("null");
				} else {
					local56.append(local64);
				}
			}
			return local56.toString();
		}
	}
}
