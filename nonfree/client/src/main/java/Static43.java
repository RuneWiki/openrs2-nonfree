import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)I")
	public static int method4693() {
		return 16;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method4694(@OriginalArg(0) int arg0) {
		Static136.anInt2406 = arg0;
		Static425.aClass268_21.method6160();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4697(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt180; local11++) {
			if (arg0.equalsIgnoreCase(Static296.aStringArray32[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
