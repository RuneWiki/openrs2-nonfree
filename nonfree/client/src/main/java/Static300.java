import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "Lclient!ci;")
	public static Class38 aClass38_60;

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "[I")
	public static final int[] anIntArray452 = new int[500];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Z")
	public static boolean method4640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static244.method4059(arg1, arg0) || Static90.method5072(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static45.method928(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(II)I")
	public static int method4643(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static9.method160(arg0);
	}
}
