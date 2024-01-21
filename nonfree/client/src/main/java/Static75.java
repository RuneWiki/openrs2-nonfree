import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!ra;")
	public static Class72 aClass72_6;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_609 = Static158.method3034("Login");

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!qb;")
	public static final Class2_Sub1_Sub16 aClass2_Sub1_Sub16_1 = new Class2_Sub1_Sub16();

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_610 = aClass60_609;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_611 = Static158.method3034("<img=1>");

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_612 = Static158.method3034("null");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIILclient!aa;IJ)Z")
	public static boolean method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static87.method2043(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method1834() {
		for (@Pc(15) Class2_Sub1_Sub1_Sub6 local15 = (Class2_Sub1_Sub1_Sub6) Static122.aClass67_7.method2848(); local15 != null; local15 = (Class2_Sub1_Sub1_Sub6) Static122.aClass67_7.method2851()) {
			if (Static62.anInt1923 != local15.anInt1964 || local15.aBoolean81) {
				local15.method3556();
			} else if (local15.anInt1972 <= Static20.anInt580) {
				local15.method1472(Static35.anInt3071);
				if (local15.aBoolean81) {
					local15.method3556();
				} else {
					Static98.method2268(local15.anInt1964, local15.anInt1966, local15.anInt1965, local15.anInt1961, 60, local15, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static127.anIntArrayArrayArray6[arg0][local16][local20] == -Static183.anInt4437) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static100.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5;
			if (!Static188.method3446(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static188.method3446(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static188.method3446(local20, local156, local182)) {
				return false;
			} else if (Static188.method3446(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static15.method397(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static188.method3446(local16 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg3] + arg5, local20 + 1) && Static188.method3446(local16 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static188.method3446(local16 + 128 - 1, Static100.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static188.method3446(local16 + 1, Static100.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
