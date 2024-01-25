import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt7756;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	public static int anInt7748 = 0;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!bt;I)Lclient!hf;")
	public static Class62_Sub2_Sub1 method6177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class30_Sub1 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean50 || Static39.method809(arg2) && Static39.method809(arg0)) {
			return new Class62_Sub2_Sub1(arg3, 3553, arg4, arg1, arg2, arg0, true);
		} else if (arg3.aBoolean39) {
			return new Class62_Sub2_Sub1(arg3, 34037, arg4, arg1, arg2, arg0, true);
		} else {
			return new Class62_Sub2_Sub1(arg3, arg4, arg1, arg2, arg0, Static84.method6309(arg2), Static84.method6309(arg0), true);
		}
	}
}
