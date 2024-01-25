import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public static int anInt4947;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static int anInt4956;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
	public static String method4289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(16) String local16 = arg2[arg0];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg0 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg0; local31 < local27; local31++) {
				@Pc(37) String local37 = arg2[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(62) int local62 = arg0; local62 < local27; local62++) {
				@Pc(76) String local76 = arg2[local62];
				if (local76 == null) {
					local60.append("null");
				} else {
					local60.append(local76);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)I")
	public static int method4290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static473.anIntArray745[arg1 & 0x3] : Static95.anIntArray195[arg1 & 0x3];
	}
}
