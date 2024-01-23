import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "Lclient!tm;")
	public static Class163 aClass163_25 = new Class163(8);

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)V")
	public static void method2663(@OriginalArg(0) int arg0) {
		Static286.anInt5602--;
		if (Static286.anInt5602 == arg0) {
			return;
		}
		Static317.method3202(Static52.aStringArray6, arg0 + 1, Static52.aStringArray6, arg0, Static286.anInt5602 - arg0);
		Static317.method3202(Static156.aStringArray21, arg0 + 1, Static156.aStringArray21, arg0, Static286.anInt5602 - arg0);
		Static317.method3197(Static102.anIntArray167, arg0 + 1, Static102.anIntArray167, arg0, Static286.anInt5602 - arg0);
		Static317.method3196(Static256.aShortArray81, arg0 + 1, Static256.aShortArray81, arg0, Static286.anInt5602 - arg0);
		Static317.method3201(Static30.aLongArray2, arg0 + 1, Static30.aLongArray2, arg0, Static286.anInt5602 - arg0);
		Static317.method3197(Static282.anIntArray439, arg0 + 1, Static282.anIntArray439, arg0, Static286.anInt5602 - arg0);
		Static317.method3197(Static49.anIntArray117, arg0 + 1, Static49.anIntArray117, arg0, Static286.anInt5602 - arg0);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIII)I")
	public static int method2664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 & 0x3;
		if (local11 == 0) {
			return arg1;
		} else if (local11 == 1) {
			return arg2;
		} else if (local11 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2666(@OriginalArg(0) String[] arg0) {
		@Pc(14) String[] local14 = new String[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local14[local16] = local16 + ": ";
			if (arg0 != null && arg0[local16] != null) {
				local14[local16] = local14[local16] + arg0[local16];
			}
		}
		return local14;
	}
}
