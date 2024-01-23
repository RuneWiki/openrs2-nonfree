import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "Lclient!ph;")
	public static Class138 aClass138_23;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!th;")
	public static Class169 aClass169_54 = new Class169(50);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([BB)V")
	public static void method1216(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		local10.anInt3290 = arg0.length - 2;
		Static194.anInt3940 = local10.method2593();
		Static148.anIntArray242 = new int[Static194.anInt3940];
		Static134.anIntArray220 = new int[Static194.anInt3940];
		Static255.aByteArrayArray15 = new byte[Static194.anInt3940][];
		Static189.aBooleanArray41 = new boolean[Static194.anInt3940];
		Static255.anIntArray450 = new int[Static194.anInt3940];
		Static283.aByteArrayArray16 = new byte[Static194.anInt3940][];
		Static201.anIntArray327 = new int[Static194.anInt3940];
		local10.anInt3290 = arg0.length - Static194.anInt3940 * 8 - 7;
		Static268.anInt5936 = local10.method2593();
		Static110.anInt2184 = local10.method2593();
		@Pc(67) int local67 = (local10.method2595() & 0xFF) + 1;
		@Pc(69) int local69;
		for (local69 = 0; local69 < Static194.anInt3940; local69++) {
			Static201.anIntArray327[local69] = local10.method2593();
		}
		for (local69 = 0; local69 < Static194.anInt3940; local69++) {
			Static148.anIntArray242[local69] = local10.method2593();
		}
		for (local69 = 0; local69 < Static194.anInt3940; local69++) {
			Static134.anIntArray220[local69] = local10.method2593();
		}
		for (local69 = 0; local69 < Static194.anInt3940; local69++) {
			Static255.anIntArray450[local69] = local10.method2593();
		}
		local10.anInt3290 = arg0.length + 3 - local67 * 3 - Static194.anInt3940 * 8 - 7;
		Static40.anIntArray59 = new int[local67];
		for (local69 = 1; local69 < local67; local69++) {
			Static40.anIntArray59[local69] = local10.method2588();
			if (Static40.anIntArray59[local69] == 0) {
				Static40.anIntArray59[local69] = 1;
			}
		}
		local10.anInt3290 = 0;
		for (local69 = 0; local69 < Static194.anInt3940; local69++) {
			@Pc(192) int local192 = Static134.anIntArray220[local69];
			@Pc(196) int local196 = Static255.anIntArray450[local69];
			@Pc(200) int local200 = local192 * local196;
			@Pc(203) byte[] local203 = new byte[local200];
			@Pc(205) boolean local205 = false;
			@Pc(208) byte[] local208 = new byte[local200];
			Static255.aByteArrayArray15[local69] = local208;
			Static283.aByteArrayArray16[local69] = local203;
			@Pc(220) int local220 = local10.method2595();
			@Pc(226) int local226;
			if ((local220 & 0x1) == 0) {
				for (local226 = 0; local226 < local200; local226++) {
					local208[local226] = local10.method2598();
				}
				if ((local220 & 0x2) != 0) {
					for (local226 = 0; local226 < local200; local226++) {
						@Pc(348) byte local348 = local203[local226] = local10.method2598();
						local205 |= local348 != -1;
					}
				}
			} else {
				local226 = 0;
				label89: while (true) {
					@Pc(231) int local231;
					if (local192 <= local226) {
						if ((local220 & 0x2) == 0) {
							break;
						}
						local226 = 0;
						while (true) {
							if (local226 >= local192) {
								break label89;
							}
							for (local231 = 0; local231 < local196; local231++) {
								@Pc(290) byte local290 = local203[local231 * local192 + local226] = local10.method2598();
								local205 |= local290 != -1;
							}
							local226++;
						}
					}
					for (local231 = 0; local231 < local196; local231++) {
						local208[local192 * local231 + local226] = local10.method2598();
					}
					local226++;
				}
			}
			Static189.aBooleanArray41[local69] = local205;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!qm;BII)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(1) Class22_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static229.aClass22_Sub3_Sub2_2 == arg1 || Static316.anInt5941 >= 400) {
			return;
		}
		@Pc(142) String local142;
		if (arg1.anInt4662 == 0) {
			@Pc(30) boolean local30 = true;
			if (Static229.aClass22_Sub3_Sub2_2.anInt4679 != -1 && arg1.anInt4679 != -1) {
				@Pc(55) int local55 = Static229.aClass22_Sub3_Sub2_2.anInt4679 < arg1.anInt4679 ? Static229.aClass22_Sub3_Sub2_2.anInt4679 : arg1.anInt4679;
				@Pc(62) int local62 = Static229.aClass22_Sub3_Sub2_2.anInt4674 - arg1.anInt4674;
				if (local62 < 0) {
					local62 = -local62;
				}
				@Pc(78) int local78 = arg1.anInt4674 >= Static229.aClass22_Sub3_Sub2_2.anInt4674 ? arg1.anInt4674 : Static229.aClass22_Sub3_Sub2_2.anInt4674;
				@Pc(88) int local88 = local55 + local78 * 10 / 100 + 5;
				if (local62 > local88) {
					local30 = false;
				}
			}
			@Pc(103) String local103 = Static35.anInt641 == 1 ? Static15.aString10 : Static234.aString154;
			if (arg1.anInt4657 <= arg1.anInt4674) {
				local142 = arg1.method3663() + (local30 ? Static159.method2691(Static229.aClass22_Sub3_Sub2_2.anInt4674, arg1.anInt4674) : "<col=ffffff>") + " (" + local103 + arg1.anInt4674 + ")";
			} else {
				local142 = arg1.method3663() + (local30 ? Static159.method2691(Static229.aClass22_Sub3_Sub2_2.anInt4674, arg1.anInt4674) : "<col=ffffff>") + " (" + local103 + arg1.anInt4674 + "+" + (arg1.anInt4657 - arg1.anInt4674) + ")";
			}
		} else {
			local142 = arg1.method3663() + " (" + Static297.aString190 + arg1.anInt4662 + ")";
		}
		@Pc(238) int local238;
		if (Static197.anInt3990 == 1) {
			Static59.method1004((short) 36, Static249.aString163, Static108.anInt2142, arg2, Static90.aString151 + " -> <col=ffffff>" + local142, arg3, (long) arg0);
		} else if (!Static91.aBoolean136) {
			for (local238 = 7; local238 >= 0; local238--) {
				if (Static232.aStringArray33[local238] != null) {
					@Pc(256) short local256 = 0;
					if (Static35.anInt641 == 0 && Static232.aStringArray33[local238].equalsIgnoreCase(Static169.aString109)) {
						if (arg1.anInt4674 > Static229.aClass22_Sub3_Sub2_2.anInt4674) {
							local256 = 2000;
						}
						if (Static229.aClass22_Sub3_Sub2_2.anInt4652 != 0 && arg1.anInt4652 != 0) {
							if (arg1.anInt4652 == Static229.aClass22_Sub3_Sub2_2.anInt4652) {
								local256 = 2000;
							} else {
								local256 = 0;
							}
						}
					} else if (Static280.aBooleanArray58[local238]) {
						local256 = 2000;
					}
					@Pc(315) short local315 = Static311.aShortArray92[local238];
					@Pc(320) short local320 = (short) (local315 + local256);
					Static59.method1004(local320, Static232.aStringArray33[local238], Static46.anIntArray77[local238], arg2, "<col=ffffff>" + local142, arg3, (long) arg0);
				}
			}
		} else if ((Static234.anInt4733 & 0x8) != 0) {
			Static59.method1004((short) 48, Static232.aString115, Static49.anInt937, arg2, Static86.aString53 + " -> <col=ffffff>" + local142, arg3, (long) arg0);
		}
		for (local238 = 0; local238 < Static316.anInt5941; local238++) {
			if (Static241.aShortArray76[local238] == 14) {
				Static54.aStringArray7[local238] = "<col=ffffff>" + local142;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class36 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class36(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass36_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class36(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass36_1 = local12;
		} else {
			@Pc(134) Class105 local134 = new Class105(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static122.aClass1_Sub17ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub17(local14, arg1, arg2);
				}
			}
			Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass105_1 = local134;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = arg0;
		@Pc(20) int local20 = (arg1 + arg0) / 2;
		@Pc(24) long local24 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local24;
		@Pc(38) Object local38 = arg3[local20];
		arg3[local20] = arg3[arg1];
		arg3[arg1] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (local24 + (long) (local50 & 0x1) > arg2[local50]) {
				@Pc(68) long local68 = arg2[local50];
				arg2[local50] = arg2[local14];
				arg2[local14] = local68;
				@Pc(82) Object local82 = arg3[local50];
				arg3[local50] = arg3[local14];
				arg3[local14++] = local82;
			}
		}
		arg2[arg1] = arg2[local14];
		arg2[local14] = local24;
		arg3[arg1] = arg3[local14];
		arg3[local14] = local38;
		method1220(arg0, local14 - 1, arg2, arg3);
		method1220(local14 + 1, arg1, arg2, arg3);
	}
}
