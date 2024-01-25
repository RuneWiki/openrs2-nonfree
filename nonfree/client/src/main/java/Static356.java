import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!we", name = "mc", descriptor = "I")
	public static int anInt6801;

	@OriginalMember(owner = "client!we", name = "Gc", descriptor = "I")
	public static int anInt6820 = -1;

	@OriginalMember(owner = "client!we", name = "Ic", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_208 = new Class217(83, 3);

	@OriginalMember(owner = "client!we", name = "Jc", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_46 = new Class42();

	@OriginalMember(owner = "client!we", name = "Kc", descriptor = "I")
	public static int anInt6822 = 1;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIIII)V")
	public static void method5904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static11.method912(arg1, Static38.anInt945, Static131.anInt2843);
		@Pc(21) int local21 = Static11.method912(arg0, Static38.anInt945, Static131.anInt2843);
		@Pc(27) int local27 = Static11.method912(arg5, Static122.anInt1360, Static93.anInt5014);
		@Pc(33) int local33 = Static11.method912(arg2, Static122.anInt1360, Static93.anInt5014);
		@Pc(41) int local41 = Static11.method912(arg1 + arg4, Static38.anInt945, Static131.anInt2843);
		@Pc(50) int local50 = Static11.method912(arg0 - arg4, Static38.anInt945, Static131.anInt2843);
		for (@Pc(52) int local52 = local13; local52 < local41; local52++) {
			Static367.method6081(arg3, local27, Static43.anIntArrayArray57[local52], local33);
		}
		for (@Pc(79) int local79 = local21; local79 > local50; local79--) {
			Static367.method6081(arg3, local27, Static43.anIntArrayArray57[local79], local33);
		}
		@Pc(103) int local103 = Static11.method912(arg4 + arg5, Static122.anInt1360, Static93.anInt5014);
		@Pc(114) int local114 = Static11.method912(arg2 - arg4, Static122.anInt1360, Static93.anInt5014);
		for (@Pc(116) int local116 = local41; local116 <= local50; local116++) {
			@Pc(122) int[] local122 = Static43.anIntArrayArray57[local116];
			Static367.method6081(arg3, local27, local122, local103);
			Static367.method6081(arg3, local114, local122, local33);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBIIII)V")
	public static void method5905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12;
		for (@Pc(8) int local8 = arg3; local8 < arg3 + arg4; local8++) {
			for (local12 = arg0; local12 < arg0 + arg1; local12++) {
				if (local12 >= 0 && local12 < Static311.anInt5653 && local8 >= 0 && local8 < Static189.anInt3820) {
					Static102.anIntArrayArrayArray134[arg2][local12][local8] = arg2 <= 0 ? 0 : Static102.anIntArrayArrayArray134[arg2 - 1][local12][local8] - 240;
				}
			}
		}
		if (arg0 > 0 && arg0 < Static311.anInt5653) {
			for (local12 = arg3 + 1; local12 < arg3 + arg4; local12++) {
				if (local12 >= 0 && Static189.anInt3820 > local12) {
					Static102.anIntArrayArrayArray134[arg2][arg0][local12] = Static102.anIntArrayArrayArray134[arg2][arg0 - 1][local12];
				}
			}
		}
		if (arg3 > 0 && Static189.anInt3820 > arg3) {
			for (local12 = arg0 + 1; local12 < arg1 + arg0; local12++) {
				if (local12 >= 0 && local12 < Static311.anInt5653) {
					Static102.anIntArrayArrayArray134[arg2][local12][arg3] = Static102.anIntArrayArrayArray134[arg2][local12][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= Static311.anInt5653 || Static189.anInt3820 <= arg3) {
			return;
		}
		if (arg2 != 0) {
			if (arg0 > 0 && Static102.anIntArrayArrayArray134[arg2 - 1][arg0 - 1][arg3] != Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3]) {
				Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3];
				return;
			}
			if (arg3 > 0 && Static102.anIntArrayArrayArray134[arg2][arg0][arg3 - 1] != Static102.anIntArrayArrayArray134[arg2 - 1][arg0][arg3 - 1]) {
				Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0][arg3 - 1];
				return;
			}
			if (arg0 > 0 && arg3 > 0 && Static102.anIntArrayArrayArray134[arg2 - 1][arg0 - 1][arg3 - 1] != Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3 - 1]) {
				Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3] != 0) {
			Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3];
			return;
		}
		if (arg3 > 0 && Static102.anIntArrayArrayArray134[arg2][arg0][arg3 - 1] != 0) {
			Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0][arg3 - 1];
			return;
		}
		if (arg0 > 0 && arg3 > 0 && Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3 - 1] != 0) {
			Static102.anIntArrayArrayArray134[arg2][arg0][arg3] = Static102.anIntArrayArrayArray134[arg2][arg0 - 1][arg3 - 1];
			return;
		}
	}
}
