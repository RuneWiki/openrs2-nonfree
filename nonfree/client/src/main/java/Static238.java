import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static int anInt4596 = 0;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public static int anInt4597 = -1;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Z")
	public static boolean aBoolean299 = true;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!cc;I)V")
	public static void method3674(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt568 == 1) {
			Static66.method1015(arg1.anInt596, (short) 20, 0L, "", 0, -1, arg1.aString15);
		}
		@Pc(42) String local42;
		if (arg1.anInt568 == 2 && !Static26.aBoolean30) {
			local42 = Static118.method2030(arg1);
			if (local42 != null) {
				Static66.method1015(arg1.anInt596, (short) 18, 0L, "<col=00ff00>" + arg1.aString14, -1, -1, local42);
			}
		}
		if (arg1.anInt568 == 3) {
			Static66.method1015(arg1.anInt596, (short) 28, 0L, "", 0, -1, Static247.aString161);
		}
		if (arg1.anInt568 == 4) {
			Static66.method1015(arg1.anInt596, (short) 13, 0L, "", 0, -1, arg1.aString15);
		}
		if (arg1.anInt568 == 5) {
			Static66.method1015(arg1.anInt596, (short) 41, 0L, "", 0, -1, arg1.aString15);
		}
		if (arg1.anInt568 == 6 && Static32.aClass22_4 == null) {
			Static66.method1015(arg1.anInt596, (short) 6, 0L, "", -1, -1, arg1.aString15);
		}
		@Pc(161) int local161;
		@Pc(159) int local159;
		if (arg1.anInt542 == 2) {
			local159 = 0;
			for (local161 = 0; local161 < arg1.anInt634; local161++) {
				for (@Pc(171) int local171 = 0; local171 < arg1.anInt600; local171++) {
					@Pc(183) int local183 = (arg1.anInt611 + 32) * local171;
					@Pc(191) int local191 = local161 * (arg1.anInt604 + 32);
					if (local159 < 20) {
						local191 += arg1.anIntArray65[local159];
						local183 += arg1.anIntArray51[local159];
					}
					if (arg0 >= local183 && local191 <= arg2 && local183 + 32 > arg0 && local191 + 32 > arg2) {
						Static280.anInt5321 = local159;
						Static276.aClass22_20 = arg1;
						if (arg1.anIntArray63[local159] > 0) {
							@Pc(254) Class4_Sub25 local254 = Static40.method681(arg1);
							@Pc(263) Class163 local263 = Static277.method4117(arg1.anIntArray63[local159] - 1);
							if (Static216.anInt4288 == 1 && local254.method2830()) {
								if (Static3.anInt65 != arg1.anInt596 || local159 != Static294.anInt4283) {
									Static66.method1015(arg1.anInt596, (short) 43, (long) local263.anInt4898, Static222.aString143 + " -> <col=ff9040>" + local263.aString169, local159, -1, Static212.aString133);
								}
							} else if (Static26.aBoolean30 && local254.method2830()) {
								@Pc(606) Class4_Sub2_Sub22 local606 = Static117.anInt2591 == -1 ? null : Static51.method855(Static117.anInt2591);
								if ((Static112.anInt2457 & 0x10) != 0 && (local606 == null || local263.method3896(Static117.anInt2591, local606.anInt5557) != local606.anInt5557)) {
									Static66.method1015(arg1.anInt596, (short) 35, (long) local263.anInt4898, Static254.aString165 + " -> <col=ff9040>" + local263.aString169, local159, Static105.anInt2258, Static235.aString155);
								}
							} else {
								@Pc(329) String[] local329 = local263.aStringArray32;
								if (Static82.aBoolean124) {
									local329 = Static155.method2471(local329);
								}
								@Pc(341) int local341;
								@Pc(361) byte local361;
								if (local254.method2830()) {
									for (local341 = 4; local341 >= 3; local341--) {
										if (local329 != null && local329[local341] != null) {
											if (local341 == 3) {
												local361 = 14;
											} else {
												local361 = 57;
											}
											Static66.method1015(arg1.anInt596, local361, (long) local263.anInt4898, "<col=ff9040>" + local263.aString169, local159, -1, local329[local341]);
										}
									}
								}
								if (local254.method2836()) {
									Static66.method1015(arg1.anInt596, (short) 3, (long) local263.anInt4898, "<col=ff9040>" + local263.aString169, local159, Static70.anInt4107, Static212.aString133);
								}
								if (local254.method2830() && local329 != null) {
									for (local341 = 2; local341 >= 0; local341--) {
										if (local329[local341] != null) {
											local361 = 0;
											if (local341 == 0) {
												local361 = 51;
											}
											if (local341 == 1) {
												local361 = 19;
											}
											if (local341 == 2) {
												local361 = 37;
											}
											Static66.method1015(arg1.anInt596, local361, (long) local263.anInt4898, "<col=ff9040>" + local263.aString169, local159, -1, local329[local341]);
										}
									}
								}
								local329 = arg1.aStringArray6;
								if (Static82.aBoolean124) {
									local329 = Static155.method2471(local329);
								}
								if (local329 != null) {
									for (local341 = 4; local341 >= 0; local341--) {
										if (local329[local341] != null) {
											local361 = 0;
											if (local341 == 0) {
												local361 = 32;
											}
											if (local341 == 1) {
												local361 = 11;
											}
											if (local341 == 2) {
												local361 = 2;
											}
											if (local341 == 3) {
												local361 = 60;
											}
											if (local341 == 4) {
												local361 = 47;
											}
											Static66.method1015(arg1.anInt596, local361, (long) local263.anInt4898, "<col=ff9040>" + local263.aString169, local159, -1, local329[local341]);
										}
									}
								}
								Static66.method1015(arg1.anInt596, (short) 1004, (long) local263.anInt4898, "<col=ff9040>" + local263.aString169, local159, Static277.anInt5176, Static51.aString29);
							}
						}
					}
					local159++;
				}
			}
		}
		if (!arg1.aBoolean33) {
			return;
		}
		if (!Static26.aBoolean30) {
			for (local159 = 9; local159 >= 5; local159--) {
				@Pc(715) String local715 = Static95.method1525(arg1, local159);
				if (local715 != null) {
					Static66.method1015(arg1.anInt596, (short) 1002, (long) (local159 + 1), arg1.aString9, arg1.anInt561, Static162.method2522(arg1, local159), local715);
				}
			}
			local42 = Static118.method2030(arg1);
			if (local42 != null) {
				Static66.method1015(arg1.anInt596, (short) 18, 0L, arg1.aString9, arg1.anInt561, -1, local42);
			}
			for (local161 = 4; local161 >= 0; local161--) {
				@Pc(781) String local781 = Static95.method1525(arg1, local161);
				if (local781 != null) {
					Static66.method1015(arg1.anInt596, (short) 49, (long) (local161 + 1), arg1.aString9, arg1.anInt561, Static162.method2522(arg1, local161), local781);
				}
			}
			if (Static40.method681(arg1).method2829()) {
				if (arg1.aString11 == null) {
					Static66.method1015(arg1.anInt596, (short) 6, 0L, "", arg1.anInt561, -1, Static35.aString16);
				} else {
					Static66.method1015(arg1.anInt596, (short) 6, 0L, "", arg1.anInt561, -1, arg1.aString11);
				}
			}
		} else if (Static40.method681(arg1).method2839() && (Static112.anInt2457 & 0x20) != 0) {
			Static66.method1015(arg1.anInt596, (short) 50, 0L, Static254.aString165 + " -> " + arg1.aString9, arg1.anInt561, Static105.anInt2258, Static235.aString155);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method3675() {
		@Pc(3) int local3;
		@Pc(18) int local18;
		for (local3 = -1; local3 < Static41.anInt856; local3++) {
			if (local3 == -1) {
				local18 = 2047;
			} else {
				local18 = Static85.anIntArray179[local3];
			}
			@Pc(26) Class12_Sub3_Sub2 local26 = Static257.aClass12_Sub3_Sub2Array1[local18];
			if (local26 != null && local26.anInt4180 > 0) {
				local26.anInt4180--;
				if (local26.anInt4180 == 0) {
					local26.aString130 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static68.anInt1262; local3++) {
			local18 = Static10.anIntArray20[local3];
			@Pc(92) Class12_Sub3_Sub1 local92 = Static100.aClass12_Sub3_Sub1Array1[local18];
			if (local92 != null && local92.anInt4180 > 0) {
				local92.anInt4180--;
				if (local92.anInt4180 == 0) {
					local92.aString130 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII[[F[[IILclient!gj;BI[[FBI[[FIZ)V")
	public static void method3676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub14 arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) boolean arg14) {
		@Pc(11) int local11 = (arg0 << 8) + 255;
		@Pc(17) int local17 = (arg1 << 8) + 255;
		@Pc(23) int local23 = (arg8 << 8) + 255;
		@Pc(29) int local29 = (arg11 << 8) + 255;
		@Pc(33) int[] local33 = Static270.anIntArrayArray42[arg10];
		@Pc(35) int[] local35 = null;
		@Pc(41) int[] local41 = new int[local33.length >> 1];
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41.length; local43++) {
			local41[local43] = Static255.method3848(local23, arg3, local17, arg2, arg6, local33[local43 + local43], arg5, arg4, local29, arg12, false, 0.0F, arg9, local11, null, local33[local43 + local43 + 1], arg7);
		}
		if (arg14) {
			@Pc(182) int local182;
			if (arg10 == 1) {
				local35 = new int[6];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 64, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 64, arg7);
				local35[3] = local43;
				local35[0] = local182;
				local35[4] = local41[0];
				local35[2] = local41[2];
				local35[5] = local41[2];
				local35[1] = local43;
			} else if (arg10 == 2) {
				local35 = new int[6];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 64, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local35[3] = local43;
				local35[1] = local182;
				local35[0] = local41[0];
				local35[4] = local41[1];
				local35[2] = local43;
				local35[5] = local41[0];
			} else if (arg10 == 3) {
				local35 = new int[6];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 64, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local35[1] = local41[1];
				local35[0] = local41[2];
				local35[2] = local43;
				local35[3] = local43;
				local35[4] = local182;
				local35[5] = local41[2];
			} else if (arg10 == 4) {
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local35 = new int[] { local41[3], local43, local41[0] };
			} else if (arg10 == 5) {
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local35 = new int[] { local41[2], local43, local41[3] };
			} else if (arg10 == 6) {
				local35 = new int[6];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local35[0] = local41[3];
				local35[4] = local41[0];
				local35[3] = local182;
				local35[2] = local182;
				local35[1] = local43;
				local35[5] = local41[3];
			} else if (arg10 == 7) {
				local35 = new int[6];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local35[0] = local41[1];
				local35[1] = local182;
				local35[2] = local43;
				local35[3] = local43;
				local35[5] = local41[1];
				local35[4] = local41[2];
			} else if (arg10 == 8) {
				local35 = new int[3];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local35[2] = local41[4];
				local35[0] = local41[3];
				local35[1] = local43;
			} else if (arg10 == 9) {
				local35 = new int[15];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 64, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 96, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 32, arg7);
				@Pc(706) int local706 = Static255.method3848(local23, arg3, local17, arg2, arg6, 64, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 0, arg7);
				local35[2] = local41[4];
				local35[10] = local41[2];
				local35[8] = local41[2];
				local35[9] = local182;
				local35[6] = local182;
				local35[12] = local182;
				local35[3] = local182;
				local35[1] = local43;
				local35[13] = local41[1];
				local35[11] = local41[1];
				local35[5] = local41[3];
				local35[14] = local706;
				local35[0] = local182;
				local35[7] = local41[3];
				local35[4] = local41[4];
			} else if (arg10 == 10) {
				local35 = new int[9];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 128, arg7);
				local35[0] = local41[2];
				local35[7] = local43;
				local35[2] = local41[3];
				local35[3] = local41[3];
				local35[8] = local41[0];
				local35[1] = local43;
				local35[4] = local43;
				local35[6] = local41[4];
				local35[5] = local41[4];
			} else if (arg10 == 11) {
				local35 = new int[12];
				local43 = Static255.method3848(local23, arg3, local17, arg2, arg6, 0, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 64, arg7);
				local182 = Static255.method3848(local23, arg3, local17, arg2, arg6, 128, arg5, arg4, local29, arg12, true, 0.0F, arg9, local11, null, 64, arg7);
				local35[1] = local43;
				local35[0] = local41[3];
				local35[2] = local41[0];
				local35[11] = local182;
				local35[4] = local41[2];
				local35[8] = local43;
				local35[10] = local41[1];
				local35[3] = local41[3];
				local35[5] = local43;
				local35[6] = local41[2];
				local35[7] = local182;
				local35[9] = local41[2];
			}
		}
		arg6.method1451(arg13, arg2, arg5, local41, local35, false);
	}
}
