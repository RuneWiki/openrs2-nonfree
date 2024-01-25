import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)I")
	public static int method8574() {
		if ((double) Static491.aFloat159 == 3.0D) {
			return 37;
		} else if ((double) Static491.aFloat159 == 4.0D) {
			return 50;
		} else if ((double) Static491.aFloat159 == 6.0D) {
			return 75;
		} else if ((double) Static491.aFloat159 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)Z")
	public static boolean method8576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
