import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[Lclient!ta;")
	public static Class41[] aClass41Array2;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public static int anInt3904;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	public static void method3081(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub2_Sub17 local11 = Static34.method1709(6, arg0);
		local11.method5523();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ya;Lclient!gg;III)V")
	public static void method3082(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class75 local12;
		if (arg3 < Static81.anInt1606) {
			local12 = Static432.aClass75ArrayArrayArray6[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass8_Sub4_1 != null && local12.aClass8_Sub4_1.method5873()) {
				arg1.method5875(local12.aClass8_Sub4_1, Static416.anInt7020, true, 0, 0, arg0);
			}
		}
		if (arg4 < Static81.anInt1606) {
			local12 = Static432.aClass75ArrayArrayArray6[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass8_Sub4_1 != null && local12.aClass8_Sub4_1.method5873()) {
				arg1.method5875(local12.aClass8_Sub4_1, 0, true, Static416.anInt7020, 0, arg0);
			}
		}
		if (arg3 < Static81.anInt1606 && arg4 < Static18.anInt297) {
			local12 = Static432.aClass75ArrayArrayArray6[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass8_Sub4_1 != null && local12.aClass8_Sub4_1.method5873()) {
				arg1.method5875(local12.aClass8_Sub4_1, Static416.anInt7020, true, Static416.anInt7020, 0, arg0);
			}
		}
		if (arg3 < Static81.anInt1606 && arg4 > 0) {
			local12 = Static432.aClass75ArrayArrayArray6[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass8_Sub4_1 != null && local12.aClass8_Sub4_1.method5873()) {
				arg1.method5875(local12.aClass8_Sub4_1, Static416.anInt7020, true, -Static416.anInt7020, 0, arg0);
			}
		}
	}
}
