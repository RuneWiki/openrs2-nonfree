import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!ofa", name = "d", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
	public static int anInt6768;

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
	public static int anInt6769 = 0;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Lclient!jca;")
	public static Class4_Sub5_Sub11 method5932() {
		@Pc(20) Class4_Sub5_Sub11 local20 = (Class4_Sub5_Sub11) Static205.aClass367_2.method8308();
		if (local20 != null) {
			local20.method9000();
			local20.method8990();
			return local20;
		}
		do {
			local20 = (Class4_Sub5_Sub11) Static587.aClass367_13.method8308();
			if (local20 == null) {
				return null;
			}
			if (local20.method3953() > method5935()) {
				return null;
			}
			local20.method9000();
			local20.method8990();
		} while ((Long.MIN_VALUE & local20.aLong306) == 0L);
		return local20;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(CI)Z")
	public static boolean method5933(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg3) {
			Static24.method564(arg2, arg4, arg0, arg6, arg1, arg5);
		} else if (arg0 - arg5 >= Static472.anInt7503 && arg5 + arg0 <= Static257.anInt4172 && arg6 - arg3 >= Static73.anInt1542 && Static527.anInt8177 >= arg6 + arg3) {
			Static589.method7764(arg2, arg5, arg1, arg6, arg0, arg3, arg4);
		} else {
			Static247.method3635(arg6, arg2, arg1, arg5, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)J")
	public static synchronized long method5935() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static626.aLong282) {
			Static619.aLong280 += Static626.aLong282 - local10;
		}
		Static626.aLong282 = local10;
		return Static619.aLong280 + local10;
	}
}
