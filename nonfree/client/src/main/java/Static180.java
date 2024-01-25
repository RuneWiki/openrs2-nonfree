import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
	public static int anInt3649;

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "Lclient!da;")
	public static Class67 aClass67_5;

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
	public static int anInt3648 = -1;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIII)V")
	public static void method3413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class60_Sub1_Sub5 local14 = local7.aClass60_Sub1_Sub5_1;
		@Pc(17) Class60_Sub1_Sub5 local17 = local7.aClass60_Sub1_Sub5_2;
		if (local14 != null) {
			local14.aShort113 = (short) (local14.aShort113 * arg3 / (0x10 << Static594.anInt9440 - 7));
			local14.aShort112 = (short) (local14.aShort112 * arg3 / (0x10 << Static594.anInt9440 - 7));
		}
		if (local17 != null) {
			local17.aShort113 = (short) (local17.aShort113 * arg3 / (0x10 << Static594.anInt9440 - 7));
			local17.aShort112 = (short) (local17.aShort112 * arg3 / (0x10 << Static594.anInt9440 - 7));
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg0;
		@Pc(14) int local14 = arg0 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static367.method5559(-7, arg1, arg2, Static36.anIntArrayArray4[local16], arg6);
		}
		for (@Pc(34) int local34 = arg5; local34 > local10; local34--) {
			Static367.method5559(-7, arg1, arg2, Static36.anIntArrayArray4[local34], arg6);
		}
		@Pc(58) int local58 = arg0 + arg1;
		@Pc(69) int local69 = arg6 - arg0;
		for (@Pc(71) int local71 = local14; local71 <= local10; local71++) {
			@Pc(77) int[] local77 = Static36.anIntArrayArray4[local71];
			Static367.method5559(-7, arg1, arg2, local77, local58);
			Static367.method5559(-7, local58, arg4, local77, local69);
			Static367.method5559(-7, local69, arg2, local77, arg6);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public static void method3415() {
		Static473.aClass75_14.xa(((float) Static687.aClass6_Sub44_33.aClass7_Sub5_1.method808() * 0.1F + 0.7F) * Static358.aFloat110);
		Static473.aClass75_14.ZA(Static223.anInt4381, Static366.aFloat111, Static194.aFloat71, (float) (Static282.anInt5124 << 2), (float) (Static364.anInt6149 << 2), (float) (Static253.anInt4791 << 2));
		Static473.aClass75_14.method6713(Static547.aClass81_3);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z")
	public static boolean method3417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= 0 && arg2 >= 0 && Static272.aByteArrayArrayArray2[1].length > arg1 && Static272.aByteArrayArrayArray2[1][arg1].length > arg2) {
			return (Static272.aByteArrayArrayArray2[1][arg1][arg2] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
