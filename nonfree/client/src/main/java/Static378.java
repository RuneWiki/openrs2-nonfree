import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public static int anInt6295 = 1;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static221.anInt3917 <= arg6 && Static365.anInt6140 >= arg5 && Static26.anInt345 <= arg3 && arg1 <= Static272.anInt4750) {
			Static343.method5203(arg6, arg5, arg0, arg2, arg3, arg1, arg4);
		} else {
			Static11.method5233(arg1, arg3, arg6, arg4, arg5, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!b;)V")
	public static void method5605(@OriginalArg(1) Class20 arg0) {
		Static317.anInt4553 = arg0.method230("titlebg");
		Static363.anInt6167 = arg0.method230("logo");
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)S")
	public static short method5608(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 > 64 ? (127 - local24) * local20 >> 7 : local24 * local20 >> 7;
		@Pc(45) int local45 = local41 + local24;
		@Pc(56) int local56;
		if (local45 == 0) {
			local56 = local41 << 1;
		} else {
			local56 = (local41 << 8) / local45;
		}
		return (short) (local45 | local14 << 10 | local56 >> 4 << 7);
	}
}
