import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public static int anInt5149;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static int anInt5152;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	public static boolean aBoolean370 = true;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "F")
	public static float aFloat58 = 1.0F;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public static void method4125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) Class206 local26 = Static67.aClass206ArrayArray1[arg1][arg0];
		if (local26 != null) {
			Static151.anInt2740 = local26.anInt5200;
			Static33.anInt535 = local26.anInt5195;
			Static280.anInt4635 = local26.anInt5194;
		}
		Static35.method465();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIZIII[[[BIIILclient!ya;I)V")
	public static void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class135 arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg2 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg0 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg0 = 8;
		}
		arg10.DA(arg3, arg4, arg9, arg1, arg11, arg7, arg6[arg0 - 1][arg5], arg2, arg8);
	}
}
