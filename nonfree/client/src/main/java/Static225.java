import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_146 = new Class179(24, 8);

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Z")
	public static final boolean aBoolean226 = false;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public static int anInt3839 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method3276(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static477.anInt8198; local16++) {
			if (arg0.equalsIgnoreCase(Static658.aStringArray65[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static123.aStringArray18[local16])) {
				return true;
			}
		}
		return false;
	}
}
