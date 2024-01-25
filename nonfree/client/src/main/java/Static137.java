import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_57 = new Class133(38, 12);

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "[I")
	public static final int[] anIntArray274 = new int[32];

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2341(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static178.anInt4133; local16++) {
			if (arg0.equalsIgnoreCase(Static520.aStringArray49[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
