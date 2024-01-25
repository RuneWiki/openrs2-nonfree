import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
	public static final int[] anIntArray142 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt2861 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZC)Z")
	public static boolean method2670(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!oea;ILclient!aa;IILjava/lang/String;ILclient!da;ILclient!at;II)V")
	public static void method2673(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class68 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class24 arg9, @OriginalArg(10) int arg10) {
		@Pc(13) int local13;
		if (Static496.anInt9165 == 4) {
			local13 = (int) Static72.aFloat68 & 0x3FFF;
		} else {
			local13 = Static563.anInt10146 + (int) Static72.aFloat68 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg9.anInt441 / 2, arg9.anInt488 / 2) + 10;
		@Pc(43) int local43 = arg10 * arg10 + arg3 * arg3;
		if (local34 * local34 < local43) {
			return;
		}
		@Pc(57) int local57 = Class177.anIntArray361[local13];
		@Pc(61) int local61 = Class177.anIntArray360[local13];
		if (Static496.anInt9165 != 4) {
			local61 = local61 * 256 / (Static183.anInt4411 + 256);
			local57 = local57 * 256 / (Static183.anInt4411 + 256);
		}
		@Pc(90) int local90 = local57 * arg3 + arg10 * local61 >> 14;
		@Pc(101) int local101 = local61 * arg3 - arg10 * local57 >> 14;
		@Pc(108) int local108 = arg0.method6486(arg5, 100, null);
		@Pc(116) int local116 = arg0.method6484(null, 0, 100, arg5);
		@Pc(122) int local122 = local90 - local108 / 2;
		if (-arg9.anInt441 <= local122 && arg9.anInt441 >= local122 && -arg9.anInt488 <= local101 && local101 <= arg9.anInt488) {
			arg7.method8115(null, 0, 0, null, arg1, 0, 50, arg2, arg6 + arg9.anInt488 / 2 - arg8 - local101 - local116, arg4, arg6, local108, arg9.anInt441 / 2 + arg4 + local122, 1, arg5);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2674(@OriginalArg(0) String arg0) {
		if (Class2_Sub34.aString72.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class2_Sub34.aString72.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class2_Sub34.aString72.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I")
	public static int method2675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg2;
		@Pc(32) int local32 = (arg1 & 0x7F) * arg2 + local13 * (arg0 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg1 & 0x380) * arg2 + (arg0 & 0x380) * local13 >> 7;
		@Pc(60) int local60 = (arg1 & 0xFC00) * arg2 + local13 * (arg0 & 0xFC00) >> 7;
		return local60 & 0xFC00 | local46 & 0x380 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)Z")
	public static boolean method2676(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
