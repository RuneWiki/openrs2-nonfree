import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "Lclient!km;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!s;")
	public static Class217 aClass217_52 = null;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "Lclient!og;")
	public static final Class178 aClass178_6 = new Class178("RC", 1);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!za;Lclient!vs;III)V")
	public static void method2044(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class11 local12;
		if (arg3 < Static54.anInt998) {
			local12 = Static309.aClass11ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass24_Sub4_1 != null && local12.aClass24_Sub4_1.method5692()) {
				arg1.method5687(0, Static335.anInt5671, local12.aClass24_Sub4_1, arg0, true, 0);
			}
		}
		if (arg4 < Static54.anInt998) {
			local12 = Static309.aClass11ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass24_Sub4_1 != null && local12.aClass24_Sub4_1.method5692()) {
				arg1.method5687(0, 0, local12.aClass24_Sub4_1, arg0, true, Static335.anInt5671);
			}
		}
		if (arg3 < Static54.anInt998 && arg4 < Static24.anInt401) {
			local12 = Static309.aClass11ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass24_Sub4_1 != null && local12.aClass24_Sub4_1.method5692()) {
				arg1.method5687(0, Static335.anInt5671, local12.aClass24_Sub4_1, arg0, true, Static335.anInt5671);
			}
		}
		if (arg3 < Static54.anInt998 && arg4 > 0) {
			local12 = Static309.aClass11ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass24_Sub4_1 != null && local12.aClass24_Sub4_1.method5692()) {
				arg1.method5687(0, Static335.anInt5671, local12.aClass24_Sub4_1, arg0, true, -Static335.anInt5671);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public static void method2046() {
		if (Static333.aClass130_2 != null) {
			Static333.aClass130_2.method3636();
		}
		if (Static321.aClass130_1 != null) {
			Static321.aClass130_1.method3636();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!i;III[Z)V")
	public static void method2047(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static332.aClass154Array3 == Static173.aClass154Array1) {
			return;
		}
		@Pc(9) int local9 = Static256.aClass154Array2[arg1].ca(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class154 local22 = Static256.aClass154Array2[local11];
				if (local22 != null) {
					local22.ba(arg0, arg2, local9 - local22.ca(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
