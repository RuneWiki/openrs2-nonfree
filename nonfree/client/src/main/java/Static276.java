import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_94 = new Class268(102, 3);

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public static int anInt5428 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4854(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static60.anInt1289; local16++) {
			if (arg0.equalsIgnoreCase(Static123.aStringArray27[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
