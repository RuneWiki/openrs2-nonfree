import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "Lclient!tc;")
	public static Class113 aClass113_3;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "[I")
	public static final int[] anIntArray179 = new int[1000];

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
	public static int anInt3238 = 1;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIIILclient!jn;IILclient!nha;III)V")
	public static void method2791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class183 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class245 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static290.aClass183_9 = arg4;
		Static137.aClass131_1 = null;
		Static378.anInt6260 = arg10;
		Static473.aClass131_2 = null;
		Static254.anInt4607 = arg2;
		Static368.anInt6140 = arg8;
		Static140.anInt2438 = arg6;
		Static61.anInt9888 = arg0;
		Static547.aClass131_3 = null;
		Static514.anInt8855 = arg5;
		Static574.anInt9694 = arg3;
		Static433.aClass245_12 = arg7;
		Static576.anInt9713 = arg9;
		Static443.anInt7570 = arg1;
		Static80.method1365();
		Static274.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	public static void method2792() {
		@Pc(7) Class79 local7 = null;
		try {
			local7 = Static144.method2094("2");
			@Pc(20) Class5_Sub22 local20 = new Class5_Sub22(Static351.anInt5903 * 6 + 3);
			local20.method5905(1);
			local20.method5918(Static351.anInt5903);
			for (@Pc(32) int local32 = 0; local32 < Static320.anIntArray291.length; local32++) {
				if (Static578.aBooleanArray15[local32]) {
					local20.method5918(local32);
					local20.method5949(Static320.anIntArray291[local32]);
				}
			}
			local7.method1660(0, local20.aByteArray71, local20.anInt6629);
		} catch (@Pc(67) Exception local67) {
		}
		try {
			if (local7 != null) {
				local7.method1662();
			}
		} catch (@Pc(74) Exception local74) {
		}
		Static520.aLong224 = Static95.method1587();
		Static78.aBoolean117 = false;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIII)I")
	public static int method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg2;
		}
	}
}
