import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt1008;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[Lclient!pha;")
	public static Class287[] aClass287Array1;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_32 = new Class381(56, 16);

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_6 = new Class226(11, 7);

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	public static int anInt1009 = -1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	public static void method1021(@OriginalArg(1) int arg0) {
		if (Static20.method345(arg0)) {
			Static581.method8011(Static397.aClass238ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static503.anIntArrayArray57 != null) {
			Static503.anIntArrayArray57[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static206.aShortArrayArray11 != null) {
			Static206.aShortArrayArray11[arg0][arg1] = (short) arg3;
		}
		if (Static220.aByteArrayArray10 != null) {
			Static220.aByteArrayArray10[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[FI[II[III[FII)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) int arg11) {
		@Pc(12) int local12 = arg2 * arg6 + arg4;
		@Pc(26) int local26 = arg1 * arg11 + arg0;
		@Pc(30) int local30 = arg2 - arg9;
		@Pc(35) int local35 = arg1 - arg9;
		@Pc(39) int local39;
		@Pc(46) int local46;
		if (arg5 == null) {
			for (local39 = 0; local39 < arg8; local39++) {
				local46 = local12 + arg9;
				while (local12 < local46) {
					arg3[local26++] = arg10[local12++];
				}
				local26 += local35;
				local12 += local30;
			}
		} else if (arg10 == null) {
			for (local39 = 0; local39 < arg8; local39++) {
				local46 = local12 + arg9;
				while (local46 > local12) {
					arg7[local26++] = arg5[local12++];
				}
				local12 += local30;
				local26 += local35;
			}
		} else {
			for (local39 = 0; local39 < arg8; local39++) {
				local46 = local12 + arg9;
				while (local46 > local12) {
					arg7[local26] = arg5[local12];
					arg3[local26++] = arg10[local12++];
				}
				local12 += local30;
				local26 += local35;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I")
	public static int method1025(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
