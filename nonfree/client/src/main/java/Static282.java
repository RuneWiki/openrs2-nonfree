import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static282 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_154 = new Class88("K", "T", "K", "K");

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_83 = new Class45(107, -2);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!an;Lclient!an;Lclient!kb;Lclient!an;)Z")
	public static boolean method4651(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) Class12_Sub13_Sub2 arg2, @OriginalArg(4) Class16 arg3) {
		Static476.aClass16_23 = arg1;
		Static65.aClass16_14 = arg3;
		Static493.aClass12_Sub13_Sub2_3 = arg2;
		Static216.aClass16_57 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
	public static int method4652() {
		return 2;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
	public static int method4653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
