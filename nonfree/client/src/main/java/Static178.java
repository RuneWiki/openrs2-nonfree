import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!n", name = "O", descriptor = "I")
	public static int anInt3937 = 0;

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!n", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString253 = "shake:";

	@OriginalMember(owner = "client!n", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString254 = "Loading...";

	@OriginalMember(owner = "client!n", name = "W", descriptor = "S")
	public static short aShort61 = 320;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Lclient!vd;")
	public static Class1_Sub3_Sub22 method2873() {
		@Pc(19) Class1_Sub3_Sub22 local19 = (Class1_Sub3_Sub22) Static275.aClass108_14.method2754();
		if (local19 != null) {
			local19.method4767();
			local19.method4652();
			return local19;
		}
		do {
			local19 = (Class1_Sub3_Sub22) Static107.aClass108_7.method2754();
			if (local19 == null) {
				return null;
			}
			if (local19.method4470() > Static258.method3967()) {
				return null;
			}
			local19.method4767();
			local19.method4652();
		} while ((Long.MIN_VALUE & local19.aLong237) == 0L);
		return local19;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static241.anIntArrayArrayArray13[arg0][local16][local20] == -Static108.anInt2392) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static46.anIntArrayArrayArray1[arg0][arg1][arg3] + arg5;
			if (!Static240.method3778(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static240.method3778(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static240.method3778(local16, local156, local182)) {
				return false;
			} else if (Static240.method3778(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static90.method1546(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static240.method3778(local16 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg3] + arg5, local20 + 1) && Static240.method3778(local16 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static240.method3778(local16 + 128 - 1, Static46.anIntArrayArrayArray1[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static240.method3778(local16 + 1, Static46.anIntArrayArrayArray1[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass136_1 != null && local7.aClass136_1.aLong182 == arg3) {
			return true;
		} else if (local7.aClass106_1 != null && local7.aClass106_1.aLong131 == arg3) {
			return true;
		} else if (local7.aClass119_1 != null && local7.aClass119_1.aLong154 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt45; local46++) {
				if (local7.aClass7Array1[local46].aLong7 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
