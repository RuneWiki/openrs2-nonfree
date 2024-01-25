import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Lclient!c;")
	public static Class35 aClass35_5;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	public static int anInt7106 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method5697(@OriginalArg(1) Class4_Sub9_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static176.anInt3194; local3++) {
			@Pc(14) int local14 = Static86.anIntArray127[local3];
			@Pc(18) Class8_Sub3_Sub1_Sub1 local18 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local14];
			@Pc(22) int local22 = arg0.method5007();
			if ((local22 & 0x8) != 0) {
				local22 += arg0.method5007() << 8;
			}
			if ((local22 & 0x400) != 0) {
				local22 += arg0.method5007() << 16;
			}
			Static31.method433(local18, local22, local14, arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)I")
	public static int method5698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static315.anIntArray411[arg0 & 0x3] : Static12.anIntArray8[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIIII)V")
	public static void method5700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class4_Sub2_Sub17 local13 = Static34.method1709(10, arg1);
		local13.method5529();
		local13.anInt6871 = arg2;
		local13.anInt6869 = arg3;
		local13.anInt6873 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ci;")
	public static RuntimeException_Sub1 method5701(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString5 = local9.aString5 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static382.anIntArrayArrayArray8[arg0][local16][local20] == -Static125.anInt2196) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static145.anInt2581) + 1;
			@Pc(142) int local142 = (arg3 << Static145.anInt2581) + 2;
			@Pc(151) int local151 = Static278.aClass41Array3[arg0].l(arg1, arg3) + arg5;
			if (!Static183.method2543(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static145.anInt2581) - 1;
			if (!Static183.method2543(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static145.anInt2581) - 1;
			if (!Static183.method2543(local20, local151, local177)) {
				return false;
			} else if (Static183.method2543(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static337.method4459(arg0, arg1, arg3)) {
			local16 = arg1 << Static145.anInt2581;
			local20 = arg3 << Static145.anInt2581;
			return Static183.method2543(local16 + 1, Static278.aClass41Array3[arg0].l(arg1, arg3) + arg5, local20 + 1) && Static183.method2543(local16 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg3) + arg5, local20 + 1) && Static183.method2543(local16 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg3 + 1) + arg5, local20 + Static416.anInt7020 - 1) && Static183.method2543(local16 + 1, Static278.aClass41Array3[arg0].l(arg1, arg3 + 1) + arg5, local20 + Static416.anInt7020 - 1);
		} else {
			return false;
		}
	}
}
