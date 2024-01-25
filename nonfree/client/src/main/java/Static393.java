import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tf", name = "id", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!tf", name = "Oc", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_108 = new Class21("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 >= Static176.anInt3462 && Static418.anInt3023 >= arg2 && arg1 >= Static162.anInt1715 && arg4 <= Static55.anInt1319) {
			Static456.method6198(arg0, arg1, arg3, arg2, arg5, arg6, arg4);
		} else {
			Static118.method2248(arg4, arg6, arg0, arg3, arg2, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	public static int method5531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return ((local12 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	public static void method5536(@OriginalArg(0) boolean arg0) {
		Static156.method5967(Static248.anInt4793, Static374.anInt6595, arg0, Static30.anInt518);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
	public static void method5543(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub5 local13 = Static431.method5935(1, arg0);
		local13.method517();
	}
}
