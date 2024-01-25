import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public static int anInt795;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
	public static boolean method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!pe;)I")
	public static int method738(@OriginalArg(1) Class276 arg0) {
		if (arg0 == Static133.aClass276_7) {
			return 6407;
		} else if (arg0 == Static220.aClass276_11) {
			return 6408;
		} else if (Static360.aClass276_15 == arg0) {
			return 6406;
		} else if (Static46.aClass276_4 == arg0) {
			return 6409;
		} else if (Static592.aClass276_18 == arg0) {
			return 6410;
		} else if (Static537.aClass276_17 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
