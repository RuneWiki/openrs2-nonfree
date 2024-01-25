import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
	public static int anInt4351;

	@OriginalMember(owner = "client!iba", name = "u", descriptor = "I")
	public static int anInt4339 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z")
	public static boolean method3685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public static void method3686() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static518.aBooleanArray37[local1] = true;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)V")
	public static void method3687(@OriginalArg(0) int arg0) {
		Static423.anInt8217 = -1;
		if (arg0 == 37) {
			Static87.aFloat149 = 3.0F;
		} else if (arg0 == 50) {
			Static87.aFloat149 = 4.0F;
		} else if (arg0 == 75) {
			Static87.aFloat149 = 6.0F;
		} else if (arg0 == 100) {
			Static87.aFloat149 = 8.0F;
		} else if (arg0 == 200) {
			Static87.aFloat149 = 16.0F;
		}
		Static423.anInt8217 = -1;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(BII)B")
	public static byte method3689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
