import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	public static int anInt1328;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "Lclient!hf;")
	public static Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
	public static final int[] anIntArray151 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
	public static int anInt1330 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIBILclient!tm;Lclient!rg;I)V")
	public static void method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) Class177 arg6, @OriginalArg(8) int arg7) {
		@Pc(17) int local17 = arg3 * arg3 + arg7 * arg7;
		if (local17 > arg0) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg6.anInt5179 / 2, arg6.anInt5209 / 2);
		if (local17 <= local35 * local35) {
			Static120.method2166(arg6, arg3, arg7, Static211.aClass90Array10[arg4], arg2, arg1, arg5);
			return;
		}
		local35 -= 10;
		@Pc(58) int local58;
		if (Static81.anInt1609 == 4) {
			local58 = (int) Static304.aFloat110 & 0x3FFF;
		} else {
			local58 = (int) Static304.aFloat110 + Static277.anInt6206 & 0x3FFF;
		}
		@Pc(69) int local69 = Class1_Sub1_Sub16.anIntArray587[local58];
		@Pc(73) int local73 = Class1_Sub1_Sub16.anIntArray586[local58];
		if (Static81.anInt1609 != 4) {
			local73 = local73 * 256 / (Static311.anInt5996 + 256);
			local69 = local69 * 256 / (Static311.anInt5996 + 256);
		}
		@Pc(105) int local105 = arg7 * local69 + arg3 * local73 >> 15;
		@Pc(116) int local116 = local73 * arg7 - arg3 * local69 >> 15;
		@Pc(122) double local122 = Math.atan2((double) local105, (double) local116);
		@Pc(129) int local129 = (int) ((double) local35 * Math.sin(local122));
		@Pc(136) int local136 = (int) ((double) local35 * Math.cos(local122));
		Static265.aClass90Array13[arg4].method5461((float) arg2 + (float) arg6.anInt5179 / 2.0F + (float) local129, (float) -local136 + (float) arg1 + (float) arg6.anInt5209 / 2.0F, 4096, (int) (-local122 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
	public static int method1283() {
		@Pc(5) Class140 local5 = Static69.aClass140_39;
		synchronized (Static69.aClass140_39) {
			return Static69.aClass140_39.method3820();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([IILclient!ie;IIZI[IIIIIIII)I")
	public static int method1285(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static259.anIntArrayArray52[local3][local7] = 0;
				Static162.anIntArrayArray29[local3][local7] = 99999999;
			}
		}
		@Pc(59) boolean local59;
		if (arg6 == 1) {
			local59 = Static209.method3837(arg10, arg11, arg13, arg3, arg8, arg4, arg1, arg2, arg12, arg9);
		} else if (arg6 == 2) {
			local59 = Static43.method2801(arg8, arg3, arg2, arg10, arg11, arg4, arg9, arg13, arg12, arg1);
		} else {
			local59 = Static245.method4327(arg12, arg9, arg4, arg11, arg1, arg6, arg8, arg2, arg13, arg3, arg10);
		}
		@Pc(93) int local93 = arg12 - 64;
		@Pc(97) int local97 = arg13 - 64;
		@Pc(99) int local99 = Static4.anInt86;
		@Pc(101) int local101 = Static115.anInt2302;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local59) {
			if (!arg5) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg1 - 10; local118 <= arg1 + 10; local118++) {
				for (@Pc(125) int local125 = arg9 - 10; local125 <= arg9 + 10; local125++) {
					@Pc(132) int local132 = local118 - local93;
					@Pc(137) int local137 = local125 - local97;
					if (local132 >= 0 && local137 >= 0 && local132 < 128 && local137 < 128 && Static162.anIntArrayArray29[local132][local137] < 100) {
						@Pc(163) int local163 = 0;
						if (local118 < arg1) {
							local163 = arg1 - local118;
						} else if (arg8 + arg1 - 1 < local118) {
							local163 = local118 + 1 - arg8 - arg1;
						}
						@Pc(194) int local194 = 0;
						if (arg9 > local125) {
							local194 = arg9 - local125;
						} else if (arg9 + arg11 - 1 < local125) {
							local194 = local125 + 1 - arg9 - arg11;
						}
						@Pc(236) int local236 = local194 * local194 + local163 * local163;
						if (local236 < local109 || local236 == local109 && Static162.anIntArrayArray29[local132][local137] < local111) {
							local109 = local236;
							local111 = Static162.anIntArrayArray29[local132][local137];
							local99 = local118;
							local101 = local125;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg12 == local99 && arg13 == local101) {
			return 0;
		}
		@Pc(310) byte local310 = 0;
		Static10.anIntArray30[0] = local99;
		local109 = local310 + 1;
		Static54.anIntArray415[0] = local101;
		@Pc(332) int local332;
		local111 = local332 = Static259.anIntArrayArray52[local99 - local93][local101 - local97];
		while (arg12 != local99 || local101 != arg13) {
			if (local111 != local332) {
				local332 = local111;
				Static10.anIntArray30[local109] = local99;
				Static54.anIntArray415[local109++] = local101;
			}
			if ((local111 & 0x1) != 0) {
				local101++;
			} else if ((local111 & 0x4) != 0) {
				local101--;
			}
			if ((local111 & 0x2) != 0) {
				local99++;
			} else if ((local111 & 0x8) != 0) {
				local99--;
			}
			local111 = Static259.anIntArrayArray52[local99 - local93][local101 - local97];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg7[local118] = Static10.anIntArray30[local109];
			arg0[local118++] = Static54.anIntArray415[local109];
			if (local118 >= arg7.length) {
				break;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!rg;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1286(@OriginalArg(1) Class177 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(20) int local20 = arg1.indexOf("%1");
			if (local20 == -1) {
				while (true) {
					local20 = arg1.indexOf("%2");
					if (local20 == -1) {
						while (true) {
							local20 = arg1.indexOf("%3");
							if (local20 == -1) {
								while (true) {
									local20 = arg1.indexOf("%4");
									if (local20 == -1) {
										while (true) {
											local20 = arg1.indexOf("%5");
											if (local20 == -1) {
												while (true) {
													local20 = arg1.indexOf("%dns");
													if (local20 == -1) {
														return arg1;
													}
													@Pc(188) String local188 = "";
													if (Static99.aClass134_2 != null) {
														if (Static99.aClass134_2.anObject6 == null) {
															local188 = Static352.method5704(Static99.aClass134_2.anInt4034);
														} else {
															local188 = (String) Static99.aClass134_2.anObject6;
														}
													}
													arg1 = arg1.substring(0, local20) + local188 + arg1.substring(local20 + 4);
												}
											}
											arg1 = arg1.substring(0, local20) + Static305.method5154(Static211.method3872(4, arg0)) + arg1.substring(local20 + 2);
										}
									}
									arg1 = arg1.substring(0, local20) + Static305.method5154(Static211.method3872(3, arg0)) + arg1.substring(local20 + 2);
								}
							}
							arg1 = arg1.substring(0, local20) + Static305.method5154(Static211.method3872(2, arg0)) + arg1.substring(local20 + 2);
						}
					}
					arg1 = arg1.substring(0, local20) + Static305.method5154(Static211.method3872(1, arg0)) + arg1.substring(local20 + 2);
				}
			}
			arg1 = arg1.substring(0, local20) + Static305.method5154(Static211.method3872(0, arg0)) + arg1.substring(local20 + 2);
		}
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
	public static void method1287() {
		Static190.aClass140_99.method3819();
		Static175.aClass140_94.method3819();
	}
}
