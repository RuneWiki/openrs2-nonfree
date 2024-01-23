import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([SI)[S")
	public static short[] method1812(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) short[] local12 = new short[arg0.length];
			Static319.method510(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}
}
