import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JJ)J")
	public static long method744(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	public static void method745(@OriginalArg(0) int arg0) {
		if (Static264.anInt4388 == 1) {
			Static432.anInt7299 = arg0;
		} else if (Static264.anInt4388 == 2) {
			Static430.anInt7288 = arg0;
		}
	}
}
