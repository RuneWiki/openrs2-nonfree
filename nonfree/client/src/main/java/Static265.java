import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!v;")
	public static Class244 aClass244_12;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "F")
	public static float aFloat64 = 1024.0F;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "F")
	public static float aFloat65 = 0.25F;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray111 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public static void method3994() {
		if (Static428.aBoolean505) {
			return;
		}
		Static1.method57(Static9.aClass217ArrayArrayArray1);
		if (Static93.aClass217ArrayArrayArray2 != null) {
			Static1.method57(Static93.aClass217ArrayArrayArray2);
		}
		Static428.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILclient!rr;Lclient!rr;)V")
	public static void method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3, @OriginalArg(4) Class1_Sub1 arg4) {
		@Pc(4) Class217 local4 = Static344.method4926(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub1_2 = arg3;
			local4.aClass1_Sub1_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)I")
	public static int method3997(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public static void method3998() {
		if (Static142.anInt3209 == 10 || Static142.anInt3209 == 28) {
			Static98.method1725(Static398.anInt6901 >> 10, 5000, Static80.anInt1722 >> 10);
		} else {
			@Pc(28) int local28 = Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0] >> 3;
			@Pc(35) int local35 = Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0] >> 3;
			if (local28 >= 0 && Static399.anInt6923 >> 3 > local28 && local35 >= 0 && local35 < Static127.anInt2696 >> 3) {
				Static98.method1725(local28, 5000, local35);
			} else {
				Static98.method1725(Static399.anInt6923 >> 4, 0, Static127.anInt2696 >> 4);
			}
		}
		Static127.method2219();
		Static85.method5965();
		Static261.method3962();
		Static84.method1461();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static92.anIntArrayArrayArray9[arg0][local16][local20] == -Static207.anInt4137) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static287.anInt5248) + 1;
			@Pc(142) int local142 = (arg3 << Static287.anInt5248) + 2;
			@Pc(151) int local151 = Static120.aClass64Array1[arg0].I(arg1, arg3) + arg5;
			if (!Static386.method5263(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static287.anInt5248) - 1;
			if (!Static386.method5263(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static287.anInt5248) - 1;
			if (!Static386.method5263(local20, local151, local177)) {
				return false;
			} else if (Static386.method5263(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static220.method3499(arg0, arg1, arg3)) {
			local16 = arg1 << Static287.anInt5248;
			local20 = arg3 << Static287.anInt5248;
			return Static386.method5263(local16 + 1, Static120.aClass64Array1[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static386.method5263(local16 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static386.method5263(local16 + Static122.anInt2633 - 1, Static120.aClass64Array1[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static122.anInt2633 - 1) && Static386.method5263(local16 + 1, Static120.aClass64Array1[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static122.anInt2633 - 1);
		} else {
			return false;
		}
	}
}
