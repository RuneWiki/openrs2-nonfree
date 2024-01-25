import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt4308;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_79 = new Class256(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!an;")
	public static final Class12 aClass12_2 = new Class12();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3477(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static304.anInt5397; local11++) {
			if (arg0.equalsIgnoreCase(Static371.aStringArray36[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
