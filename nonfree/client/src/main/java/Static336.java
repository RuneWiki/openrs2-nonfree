import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static336 {

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "I")
	public static int anInt5533;

	@OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
	public static int anInt5540;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZ)I")
	public static int method5063(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
