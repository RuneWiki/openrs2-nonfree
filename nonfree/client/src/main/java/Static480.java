import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
	public static int anInt8125;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public static int anInt8123 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	public static void method6835() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static115.aBooleanArray9[local3] = false;
		}
		Static452.anInt7747 = 0;
		Static659.anInt10095 = -1;
		Static18.anInt682 = -1;
		Static65.anInt1581 = -1;
		Static378.anInt6662 = 1;
		Static81.anInt1786 = -1;
		Static290.anInt5356 = 0;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Z")
	public static boolean method6836(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
