import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_23 = new Class25(80, 16);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!qq;ILclient!pb;)I")
	public static int method1687(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class196 arg1) {
		if (arg1.anInt4978 != -1) {
			return arg1.anInt4978;
		}
		if (arg1.anInt4971 != -1) {
			@Pc(30) Class229 local30 = arg0.anInterface11_6.method2466(arg0.method3481() ? arg1.anInt4971 : arg1.anInt4976);
			if (!local30.aBoolean403) {
				return local30.aShort93;
			}
		}
		return arg1.anInt4968;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	public static boolean method1688(@OriginalArg(0) int arg0) {
		Static443.anInt7221 = arg0 + 1 & 0xFFFF;
		Static179.aBoolean222 = true;
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 < 128 || arg3 < 128 || (Static84.anInt1632 - 2) * 128 < arg4 || arg3 > Static261.anInt4480 * 128 - 256) {
			Static363.anIntArray538[0] = Static363.anIntArray538[1] = -1;
			return;
		}
		@Pc(50) int local50 = Static165.method2689(arg4, arg6, arg3) - arg1;
		Static318.aClass132_3.method3991(arg2, 0, 0);
		Static44.aClass28_14.method3509(Static318.aClass132_3);
		Static44.aClass28_14.method3520(arg4, local50, arg3, Static363.anIntArray538);
		Static318.aClass132_3.method3991(-arg2, 0, 0);
		Static44.aClass28_14.method3509(Static318.aClass132_3);
	}
}
