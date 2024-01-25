import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Z")
	public static boolean aBoolean110 = true;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt2212 = -1;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method1782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg8 && arg3 == arg2 && arg0 == arg1 && arg5 == arg6) {
			Static46.method774(arg8, arg0, arg4, arg2, arg6);
			return;
		}
		@Pc(27) int local27 = arg8;
		@Pc(29) int local29 = arg2;
		@Pc(33) int local33 = arg8 * 3;
		@Pc(37) int local37 = arg2 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(63) int local63 = arg0 + local41 - arg8 - local49;
		@Pc(74) int local74 = arg6 + local45 - local53 - arg2;
		@Pc(84) int local84 = local33 + local49 - local41 - local41;
		@Pc(94) int local94 = local37 + local53 - local45 - local45;
		@Pc(99) int local99 = local41 - local33;
		@Pc(104) int local104 = local45 - local37;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local114 * local106 >> 12;
			@Pc(124) int local124 = local63 * local120;
			@Pc(128) int local128 = local120 * local74;
			@Pc(132) int local132 = local84 * local114;
			@Pc(136) int local136 = local114 * local94;
			@Pc(140) int local140 = local106 * local99;
			@Pc(144) int local144 = local104 * local106;
			@Pc(156) int local156 = arg8 + (local140 + local124 + local132 >> 12);
			@Pc(166) int local166 = (local136 + local128 + local144 >> 12) + arg2;
			Static46.method774(local27, local156, arg4, local29, local166);
			local29 = local166;
			local27 = local156;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Lclient!bd;")
	public static Class3_Sub5 method1783() {
		if (Static193.aClass127_11 == null || Static41.aClass137_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub5 local21 = (Class3_Sub5) Static41.aClass137_1.method3465(); local21 != null; local21 = (Class3_Sub5) Static41.aClass137_1.method3465()) {
			@Pc(28) Class211 local28 = Static136.method2268(local21.anInt544);
			if (local28 != null && local28.aBoolean442 && local28.method5562()) {
				return local21;
			}
		}
		return null;
	}
}
