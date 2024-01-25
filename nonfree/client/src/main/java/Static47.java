import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	public static int anInt646;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	public static int anInt649;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public static int anInt643 = -2;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	public static int anInt645 = -1;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "[I")
	public static final int[] anIntArray24 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lclient!ht;")
	public static Class4_Sub5_Sub7 method609(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub5_Sub7 local10 = (Class4_Sub5_Sub7) Static223.aClass245_2.method5976((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static536.aClass176_128.method3994(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static520.method7608(local20);
		} catch (@Pc(43) Exception local43) {
			throw new RuntimeException(local43.getMessage() + " S: " + arg0);
		}
		Static223.aClass245_2.method5975(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static486.anInt8866 && arg8 <= Static214.anInt3975 && Static486.anInt8866 <= arg0 && Static214.anInt3975 >= arg0 && arg4 >= Static486.anInt8866 && arg4 <= Static214.anInt3975 && arg5 >= Static486.anInt8866 && Static214.anInt3975 >= arg5 && arg7 >= Static290.anInt5903 && arg7 <= Static530.anInt9437 && Static290.anInt5903 <= arg1 && arg1 <= Static530.anInt9437 && Static290.anInt5903 <= arg6 && arg6 <= Static530.anInt9437 && Static290.anInt5903 <= arg3 && arg3 <= Static530.anInt9437) {
			Static80.method7930(arg3, arg4, arg7, arg0, arg8, arg6, arg2, arg1, arg5);
		} else {
			Static124.method7982(arg6, arg0, arg3, arg7, arg8, arg2, arg4, arg1, arg5);
		}
	}
}
