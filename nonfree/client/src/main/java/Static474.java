import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "Lclient!oj;")
	public static final Class234 aClass234_40 = new Class234(512);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!kf;)I")
	public static int method6581(@OriginalArg(1) Class171 arg0) {
		if (Static246.aClass171_17 == arg0) {
			return 6407;
		} else if (Static493.aClass171_15 == arg0) {
			return 6408;
		} else if (Static357.aClass171_12 == arg0) {
			return 6406;
		} else if (arg0 == Static436.aClass171_14) {
			return 6409;
		} else if (Static102.aClass171_6 == arg0) {
			return 6410;
		} else if (arg0 == Static16.aClass171_1) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
