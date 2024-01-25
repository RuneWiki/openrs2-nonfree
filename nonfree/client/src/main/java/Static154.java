import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Lclient!di;")
	public static Class6_Sub15 aClass6_Sub15_2;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!saa;")
	public static final Class287 aClass287_2 = new Class287("WTWIP", 3);

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
	public static final int[] anIntArray320 = new int[14];

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
	public static int anInt2738 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIZII)V")
	public static void method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static354.method5292(arg1)) {
			if (Static538.aClass97ArrayArray2[arg1] == null) {
				Static436.method6279(arg7, arg2, arg6, Static375.aClass97ArrayArray1[arg1], -1, arg5, arg4, arg3, arg0);
			} else {
				Static436.method6279(arg7, arg2, arg6, Static538.aClass97ArrayArray2[arg1], -1, arg5, arg4, arg3, arg0);
			}
		} else if (arg7 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static258.aBooleanArray27[local19] = true;
			}
		} else {
			Static258.aBooleanArray27[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public static int method2268(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = Static112.method1759(arg4, Static134.anInt2364, Static60.anInt971);
		@Pc(24) int local24 = Static112.method1759(arg1, Static134.anInt2364, Static60.anInt971);
		@Pc(32) int local32 = Static112.method1759(arg3, Static235.anInt3970, Static151.anInt2683);
		@Pc(40) int local40 = Static112.method1759(arg2, Static235.anInt3970, Static151.anInt2683);
		@Pc(48) int local48 = Static112.method1759(arg6 + arg4, Static134.anInt2364, Static60.anInt971);
		@Pc(59) int local59 = Static112.method1759(arg1 - arg6, Static134.anInt2364, Static60.anInt971);
		for (@Pc(61) int local61 = local18; local61 < local48; local61++) {
			Static455.method6536(local40, local32, arg5, Static503.anIntArrayArray12[local61]);
		}
		for (@Pc(77) int local77 = local24; local77 > local59; local77--) {
			Static455.method6536(local40, local32, arg5, Static503.anIntArrayArray12[local77]);
		}
		@Pc(100) int local100 = Static112.method1759(arg3 + arg6, Static235.anInt3970, Static151.anInt2683);
		@Pc(109) int local109 = Static112.method1759(arg2 - arg6, Static235.anInt3970, Static151.anInt2683);
		for (@Pc(111) int local111 = local48; local111 <= local59; local111++) {
			@Pc(117) int[] local117 = Static503.anIntArrayArray12[local111];
			Static455.method6536(local100, local32, arg5, local117);
			Static455.method6536(local109, local100, arg0, local117);
			Static455.method6536(local40, local109, arg5, local117);
		}
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
	public static void method2272() {
		for (@Pc(7) int local7 = 0; local7 < Static516.anInt8936; local7++) {
			@Pc(13) int local13 = Static274.anIntArray385[local7];
			@Pc(20) Class6_Sub28 local20 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local13);
			if (local20 != null) {
				@Pc(25) Class29_Sub2_Sub1_Sub1 local25 = local20.aClass29_Sub2_Sub1_Sub1_2;
				Static510.method6879(local25.aClass257_1.anInt7167, local25);
			}
		}
	}
}
