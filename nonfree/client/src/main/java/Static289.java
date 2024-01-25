import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!oca;")
	public static Class235 aClass235_4;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII[II)Z")
	public static boolean method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (Static225.anInt10572 < arg4) {
			arg4 = Static225.anInt10572;
		}
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg4 <= arg2) {
			return true;
		}
		arg3 += arg1 * arg2;
		arg0 += arg2 - 1;
		@Pc(46) int local46 = arg4 - arg2 >> 2;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(78) int local78;
		if (Static146.anInt3696 == 1) {
			Static359.anInt6889 += local46;
			while (true) {
				local46--;
				if (local46 < 0) {
					local46 = arg4 - arg2 & 0x3;
					while (true) {
						local46--;
						if (local46 < 0) {
							return true;
						}
						local65 = ~arg3;
						arg0++;
						if (local65 > ~arg5[arg0]) {
							arg5[arg0] = arg3;
						}
						arg3 += arg1;
					}
				}
				local67 = arg0 + 1;
				if (arg5[local67] > arg3) {
					arg5[local67] = arg3;
				}
				local78 = arg3 + arg1;
				local67++;
				if (arg5[local67] > local78) {
					arg5[local67] = local78;
				}
				local78 += arg1;
				local67++;
				if (local78 < arg5[local67]) {
					arg5[local67] = local78;
				}
				local78 += arg1;
				local65 = ~local78;
				arg0 = local67 + 1;
				if (local65 > ~arg5[arg0]) {
					arg5[arg0] = local78;
				}
				arg3 = local78 + arg1;
			}
		} else {
			arg3 -= 38400;
			while (true) {
				local46--;
				if (local46 < 0) {
					local46 = arg4 - arg2 & 0x3;
					while (true) {
						local46--;
						if (local46 < 0) {
							return true;
						}
						arg0++;
						if (arg5[arg0] > arg3) {
							return false;
						}
						arg3 += arg1;
					}
				}
				local65 = ~arg3;
				local67 = arg0 + 1;
				if (local65 > ~arg5[local67]) {
					return false;
				}
				local78 = arg3 + arg1;
				local67++;
				if (local78 < arg5[local67]) {
					return false;
				}
				local78 += arg1;
				local67++;
				if (arg5[local67] > local78) {
					return false;
				}
				local78 += arg1;
				local65 = ~local78;
				arg0 = local67 + 1;
				if (local65 > ~arg5[arg0]) {
					return false;
				}
				arg3 = local78 + arg1;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[B)V")
	public static void method4829(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class8_Sub8 local10 = new Class8_Sub8(arg0);
		while (true) {
			@Pc(22) int local22;
			@Pc(46) int local46;
			@Pc(41) int local41;
			label45: do {
				while (true) {
					while (true) {
						local22 = local10.method8525();
						if (local22 == 0) {
							return;
						}
						if (local22 == 1) {
							@Pc(118) int[] local118 = Static291.anIntArray345 = new int[6];
							local118[0] = local10.method8578();
							local118[1] = local10.method8578();
							local118[2] = local10.method8578();
							local118[3] = local10.method8578();
							local118[4] = local10.method8578();
							local118[5] = local10.method8578();
						} else {
							if (local22 != 4) {
								continue label45;
							}
							local41 = local10.method8525();
							Static262.anIntArray326 = new int[local41];
							for (local46 = 0; local46 < local41; local46++) {
								Static262.anIntArray326[local46] = local10.method8578();
								if (Static262.anIntArray326[local46] == 65535) {
									Static262.anIntArray326[local46] = -1;
								}
							}
						}
					}
				}
			} while (local22 != 5);
			local41 = local10.method8525();
			Static633.anIntArray593 = new int[local41];
			for (local46 = 0; local46 < local41; local46++) {
				Static633.anIntArray593[local46] = local10.method8578();
				if (Static633.anIntArray593[local46] == 65535) {
					Static633.anIntArray593[local46] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4830(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static197.aStringArray11.length; local7++) {
			if (Static197.aStringArray11[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIIIIIBI)V")
	public static void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (!Static498.method7246(arg0)) {
			return;
		}
		if (Static21.aClass331ArrayArray1[arg0] == null) {
			Static73.method1925(Static368.aClass331ArrayArray2[arg0], -1, arg4, arg3, arg7, arg1, arg5, arg2, arg9, arg8, arg6, arg10);
		} else {
			Static73.method1925(Static21.aClass331ArrayArray1[arg0], -1, arg4, arg3, arg7, arg1, arg5, arg2, arg9, arg8, arg6, arg10);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static359.method5652(arg0, arg1) & Static136.method2946(arg0, arg1);
	}
}
