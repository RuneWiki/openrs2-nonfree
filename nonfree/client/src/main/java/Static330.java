import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt4434 = -1;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)Z")
	public static boolean method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)B")
	public static byte method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)[Lclient!ba;")
	public static Class20[] method3988() {
		return new Class20[] { Static289.aClass20_1, Static289.aClass20_2, Static289.aClass20_3, Static289.aClass20_4, Static289.aClass20_5, Static289.aClass20_6, Static289.aClass20_7, Static289.aClass20_8, Static289.aClass20_9, Static289.aClass20_10 };
	}
}
