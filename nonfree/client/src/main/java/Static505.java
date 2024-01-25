import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "Z")
	public static boolean aBoolean639;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_132 = new Class90(25, 0);

	@OriginalMember(owner = "client!th", name = "S", descriptor = "I")
	public static int anInt9451 = -1;

	@OriginalMember(owner = "client!th", name = "cb", descriptor = "[I")
	public static final int[] anIntArray539 = new int[8];

	@OriginalMember(owner = "client!th", name = "db", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_56 = new Class167(64);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static292.anInt5983 <= arg2 && arg3 <= Static61.anInt1627 && arg6 >= Static289.anInt5872 && Static160.anInt3347 >= arg1) {
			Static412.method6232(arg5, arg0, arg3, arg1, arg6, arg2, arg4);
		} else {
			Static402.method6129(arg0, arg4, arg2, arg1, arg5, arg3, arg6);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static420.method6283(arg4)) {
			if (Static264.aClass155ArrayArray1[arg4] == null) {
				Static87.method1818(arg2, arg7, arg5, arg3, arg0, Static535.aClass155ArrayArray2[arg4], arg1, arg6, -1);
			} else {
				Static87.method1818(arg2, arg7, arg5, arg3, arg0, Static264.aClass155ArrayArray1[arg4], arg1, arg6, -1);
			}
		} else if (arg2 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static155.aBooleanArray6[local23] = true;
			}
		} else {
			Static155.aBooleanArray6[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)I")
	public static int method7288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
