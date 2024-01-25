import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!aq;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt19 = -1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
	public static final int[] anIntArray4 = new int[1024];

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public static int anInt23 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public static void method18(@OriginalArg(0) int arg0) {
		Static201.anInt6766 = arg0;
		Static296.aClass26_53.method333();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!be;Z)Z")
	public static boolean method19(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean16) {
			return false;
		} else if (!arg0.method250()) {
			return false;
		} else if (Static253.aClass58_30.method1009((long) arg0.anInt289) == null) {
			return Static303.aClass58_29.method1009((long) arg0.anInt297) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class64 local13 = local7.aClass64_4; local13 != null; local13 = local13.aClass64_2) {
			@Pc(17) Class67_Sub3 local17 = local13.aClass67_Sub3_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort91 == arg1 && local17.aShort90 == arg2) {
				Static213.method3839(local17);
				return;
			}
		}
	}
}
