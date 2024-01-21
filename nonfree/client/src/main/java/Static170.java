import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array21 = new Class81[8];

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1376 = Static120.method2057("green:");

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1377 = aClass81_1376;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1378 = Static120.method2057("Login");

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1379 = aClass81_1378;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1380 = aClass81_1376;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1381 = Static120.method2057("mapscene");

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1382 = Static120.method2057("(U0a )2 in: ");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method3005() {
		aClass81_1380 = null;
		aClass81_1381 = null;
		aClass81_1382 = null;
		aClass81Array21 = null;
		aClass81_1377 = null;
		Class84.aLongArray9 = null;
		aClass81_1379 = null;
		aClass81_1378 = null;
		aClass81_1376 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILclient!fb;IJ)Z")
	public static boolean method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static122.method2151(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)J")
	public static long method3007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass62_1 == null ? 0L : local7.aClass62_1.aLong94;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!vb;IILclient!vb;Z)Lclient!fd;")
	public static Class1_Sub2_Sub6 method3008(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method2945(arg1);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method2963(arg1, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg0.method2963(local44, 0);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub6(arg2, arg0, arg1, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}
}
