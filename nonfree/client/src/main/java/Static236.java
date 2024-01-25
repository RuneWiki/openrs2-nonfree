import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!vp;")
	public static Class262 aClass262_6;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!gh;")
	public static Class89 aClass89_8 = null;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "[I")
	public static final int[] anIntArray428 = new int[32];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public static void method3461() {
		Static56.aClass50_1.method5814(Static61.aFloat15, Static322.aFloat102, Static119.aFloat43);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
	public static int method3462(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local14 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local14 == 19 || local14 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIBII)V")
	public static void method3469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg3) {
			Static104.method1825(arg2, arg3, arg1, arg0);
		} else if (Static115.anInt2362 <= arg2 - arg3 && Static146.anInt3034 >= arg2 + arg3 && arg0 - arg4 >= Static319.anInt5496 && Static160.anInt3220 >= arg0 + arg4) {
			Static50.method858(arg0, arg4, arg2, arg1, arg3);
		} else {
			Static417.method5482(arg0, arg2, arg4, arg3, arg1);
		}
	}
}
