import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1345 = Static108.method1915("wave:");

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1342 = aClass39_1345;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1343 = Static108.method1915("@cr1@");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
	public static int[] anIntArray433 = new int[128];

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1344 = aClass39_1345;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!he;")
	public static Class28 aClass28_2 = new Class28();

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1346 = Static108.method1915("<col=ff9040>");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class1_Sub1_Sub3 method1957(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static46.aClass33_39.method1038((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(34) byte[] local34 = Static25.aClass62_6.method2008(arg0, 4);
		local10 = new Class1_Sub1_Sub3();
		if (local34 != null) {
			local10.method267(arg0, new Class1_Sub18(local34));
		}
		local10.method269();
		Static46.aClass33_39.method1042(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method1959() {
		aClass39_1346 = null;
		aClass28_2 = null;
		anIntArray433 = null;
		aClass39_1342 = null;
		aClass39_1345 = null;
		aClass39_1344 = null;
		aClass39_1343 = null;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public static void method1960(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static34.aClass1_Sub1_Sub4_Sub4_3.anIntArray327;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local39 = (103 - local25) * 512 * 4 + 24628;
			for (local41 = 1; local41 < 103; local41++) {
				if ((Static51.aByteArrayArrayArray3[arg0][local41][local25] & 0x18) == 0) {
					Static32.aClass5_2.method107(local4, local39, arg0, local41, local25);
				}
				if (arg0 < 3 && (Static51.aByteArrayArrayArray3[arg0 + 1][local41][local25] & 0x8) != 0) {
					Static32.aClass5_2.method107(local4, local39, arg0 + 1, local41, local25);
				}
				local39 += 4;
			}
		}
		local39 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10 << 8) + 238 - 10;
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		Static34.aClass1_Sub1_Sub4_Sub4_3.method1526();
		for (@Pc(148) int local148 = 1; local148 < 103; local148++) {
			for (@Pc(152) int local152 = 1; local152 < 103; local152++) {
				if ((Static51.aByteArrayArrayArray3[arg0][local152][local148] & 0x18) == 0) {
					Static126.method2124(local148, arg0, local39, local152, local41);
				}
				if (arg0 < 3 && (Static51.aByteArrayArrayArray3[arg0 + 1][local152][local148] & 0x8) != 0) {
					Static126.method2124(local148, arg0 + 1, local39, local152, local41);
				}
			}
		}
		Static110.anInt2788 = 0;
		for (@Pc(219) int local219 = 0; local219 < 104; local219++) {
			for (@Pc(223) int local223 = 0; local223 < 104; local223++) {
				@Pc(231) int local231 = Static32.aClass5_2.method102(Static9.anInt2983, local219, local223);
				if (local231 != 0) {
					local231 = local231 >> 14 & 0x7FFF;
					@Pc(244) int local244 = Static104.method1862(local231).anInt3051;
					if (local244 >= 0) {
						@Pc(248) int local248 = local219;
						@Pc(250) int local250 = local223;
						if (local244 != 22 && local244 != 29 && local244 != 34 && local244 != 36 && local244 != 46 && local244 != 47 && local244 != 48) {
							@Pc(286) int[][] local286 = Static62.aClass23Array2[Static9.anInt2983].anIntArrayArray9;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local248 > 0 && local248 > local219 - 3 && (local286[local248 - 1][local250] & 0x12C0108) == 0) {
									local248--;
								}
								if (local295 == 1 && local248 < 103 && local248 < local219 + 3 && (local286[local248 + 1][local250] & 0x12C0180) == 0) {
									local248++;
								}
								if (local295 == 2 && local250 > 0 && local250 > local223 - 3 && (local286[local248][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local295 == 3 && local250 < 103 && local250 < local223 + 3 && (local286[local248][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static124.aClass1_Sub1_Sub4_Sub4Array12[Static110.anInt2788] = Static79.aClass1_Sub1_Sub4_Sub4Array11[local244];
						Static86.anIntArray320[Static110.anInt2788] = local248;
						Static99.anIntArray378[Static110.anInt2788] = local250;
						Static110.anInt2788++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIILclient!b;IILclient!ge;III)V")
	public static void method1962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static51.anIntArrayArrayArray6[arg0][arg7][arg1];
		@Pc(23) int local23 = Static51.anIntArrayArrayArray6[arg0][arg7][arg1 + 1];
		@Pc(35) int local35 = Static51.anIntArrayArrayArray6[arg0][arg7 + 1][arg1 + 1];
		@Pc(45) int local45 = Static51.anIntArrayArrayArray6[arg0][arg7 + 1][arg1];
		@Pc(55) int local55 = local23 + local35 + local45 + local9 >> 2;
		@Pc(61) Class1_Sub1_Sub18 local61 = Static104.method1862(arg6);
		@Pc(73) int local73 = (arg1 << 7) + arg7 + (arg6 << 14) + 1073741824;
		if (local61.anInt3060 == 0) {
			local73 += Integer.MIN_VALUE;
		}
		@Pc(86) int local86 = arg4 + (arg8 << 6);
		if (local61.anInt3041 == 1) {
			local86 += 256;
		}
		@Pc(116) Class1_Sub1_Sub2 local116;
		if (arg4 == 22) {
			if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
				local116 = local61.method2111(local9, local23, arg8, local45, local35, 22);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub4(arg6, 22, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
			}
			arg2.method134(arg3, arg7, arg1, local55, local116, local73, local86);
			if (local61.anInt3033 == 1) {
				arg5.method775(arg1, arg7);
			}
			return;
		}
		@Pc(205) int local205;
		if (arg4 == 10 || arg4 == 11) {
			if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
				local116 = local61.method2111(local9, local23, arg8, local45, local35, 10);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub4(arg6, 10, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
			}
			if (local116 != null) {
				@Pc(202) int local202;
				if (arg8 == 1 || arg8 == 3) {
					local202 = local61.anInt3039;
					local205 = local61.anInt3029;
				} else {
					local202 = local61.anInt3029;
					local205 = local61.anInt3039;
				}
				@Pc(215) int local215 = 0;
				if (arg4 == 11) {
					local215 += 256;
				}
				arg2.method128(arg3, arg7, arg1, local55, local205, local202, local116, local215, local73, local86);
			}
			if (local61.anInt3033 != 0) {
				arg5.method770(arg1, arg7, arg8, local61.anInt3039, local61.anInt3029, local61.aBoolean243);
			}
		} else if (arg4 >= 12) {
			if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
				local116 = local61.method2111(local9, local23, arg8, local45, local35, arg4);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub4(arg6, arg4, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
			}
			arg2.method128(arg3, arg7, arg1, local55, 1, 1, local116, 0, local73, local86);
			if (local61.anInt3033 != 0) {
				arg5.method770(arg1, arg7, arg8, local61.anInt3039, local61.anInt3029, local61.aBoolean243);
			}
		} else if (arg4 == 0) {
			if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
				local116 = local61.method2111(local9, local23, arg8, local45, local35, 0);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub4(arg6, 0, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
			}
			arg2.method133(arg3, arg7, arg1, local55, local116, null, Static96.anIntArray345[arg8], 0, local73, local86);
			if (local61.anInt3033 != 0) {
				arg5.method769(arg4, arg7, arg8, local61.aBoolean243, arg1);
			}
		} else if (arg4 == 1) {
			if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
				local116 = local61.method2111(local9, local23, arg8, local45, local35, 1);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub4(arg6, 1, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
			}
			arg2.method133(arg3, arg7, arg1, local55, local116, null, Static86.anIntArray319[arg8], 0, local73, local86);
			if (local61.anInt3033 != 0) {
				arg5.method769(arg4, arg7, arg8, local61.aBoolean243, arg1);
			}
		} else {
			@Pc(463) int local463;
			@Pc(502) Class1_Sub1_Sub2 local502;
			if (arg4 == 2) {
				local463 = arg8 + 1 & 0x3;
				@Pc(487) Class1_Sub1_Sub2 local487;
				if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
					local487 = local61.method2111(local9, local23, arg8 + 4, local45, local35, 2);
					local502 = local61.method2111(local9, local23, local463, local45, local35, 2);
				} else {
					local487 = new Class1_Sub1_Sub2_Sub4(arg6, 2, arg8 + 4, local9, local45, local35, local23, local61.anInt3059, true, null);
					local502 = new Class1_Sub1_Sub2_Sub4(arg6, 2, local463, local9, local45, local35, local23, local61.anInt3059, true, null);
				}
				arg2.method133(arg3, arg7, arg1, local55, local487, local502, Static96.anIntArray345[arg8], Static96.anIntArray345[local463], local73, local86);
				if (local61.anInt3033 != 0) {
					arg5.method769(arg4, arg7, arg8, local61.aBoolean243, arg1);
				}
			} else if (arg4 == 3) {
				if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
					local116 = local61.method2111(local9, local23, arg8, local45, local35, 3);
				} else {
					local116 = new Class1_Sub1_Sub2_Sub4(arg6, 3, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
				}
				arg2.method133(arg3, arg7, arg1, local55, local116, null, Static86.anIntArray319[arg8], 0, local73, local86);
				if (local61.anInt3033 != 0) {
					arg5.method769(arg4, arg7, arg8, local61.aBoolean243, arg1);
				}
			} else if (arg4 == 9) {
				if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
					local116 = local61.method2111(local9, local23, arg8, local45, local35, arg4);
				} else {
					local116 = new Class1_Sub1_Sub2_Sub4(arg6, arg4, arg8, local9, local45, local35, local23, local61.anInt3059, true, null);
				}
				arg2.method128(arg3, arg7, arg1, local55, 1, 1, local116, 0, local73, local86);
				if (local61.anInt3033 != 0) {
					arg5.method770(arg1, arg7, arg8, local61.anInt3039, local61.anInt3029, local61.aBoolean243);
				}
			} else {
				if (local61.aBoolean248) {
					if (arg8 == 1) {
						local463 = local23;
						local23 = local35;
						local35 = local45;
						local45 = local9;
						local9 = local463;
					} else if (arg8 == 2) {
						local463 = local23;
						local23 = local45;
						local45 = local463;
						local463 = local35;
						local35 = local9;
						local9 = local463;
					} else if (arg8 == 3) {
						local463 = local23;
						local23 = local9;
						local9 = local45;
						local45 = local35;
						local35 = local463;
					}
				}
				if (arg4 == 4) {
					if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
						local116 = local61.method2111(local9, local23, 0, local45, local35, 4);
					} else {
						local116 = new Class1_Sub1_Sub2_Sub4(arg6, 4, 0, local9, local45, local35, local23, local61.anInt3059, true, null);
					}
					arg2.method131(arg3, arg7, arg1, local55, local116, Static96.anIntArray345[arg8], arg8 * 512, 0, 0, local73, local86);
				} else if (arg4 == 5) {
					local205 = arg2.method141(arg3, arg7, arg1);
					local463 = 16;
					if (local205 != 0) {
						local463 = Static104.method1862(local205 >> 14 & 0x7FFF).anInt3057;
					}
					if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
						local502 = local61.method2111(local9, local23, 0, local45, local35, 4);
					} else {
						local502 = new Class1_Sub1_Sub2_Sub4(arg6, 4, 0, local9, local45, local35, local23, local61.anInt3059, true, null);
					}
					arg2.method131(arg3, arg7, arg1, local55, local502, Static96.anIntArray345[arg8], arg8 * 512, local463 * Static126.anIntArray473[arg8], Static123.anIntArray468[arg8] * local463, local73, local86);
				} else if (arg4 == 6) {
					if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
						local116 = local61.method2111(local9, local23, 0, local45, local35, 4);
					} else {
						local116 = new Class1_Sub1_Sub2_Sub4(arg6, 4, 0, local9, local45, local35, local23, local61.anInt3059, true, null);
					}
					arg2.method131(arg3, arg7, arg1, local55, local116, 256, arg8, 0, 0, local73, local86);
				} else if (arg4 == 7) {
					if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
						local116 = local61.method2111(local9, local23, 0, local45, local35, 4);
					} else {
						local116 = new Class1_Sub1_Sub2_Sub4(arg6, 4, 0, local9, local45, local35, local23, local61.anInt3059, true, null);
					}
					arg2.method131(arg3, arg7, arg1, local55, local116, 512, arg8, 0, 0, local73, local86);
				} else if (arg4 == 8) {
					if (local61.anInt3059 == -1 && local61.anIntArray477 == null) {
						local116 = local61.method2111(local9, local23, 0, local45, local35, 4);
					} else {
						local116 = new Class1_Sub1_Sub2_Sub4(arg6, 4, 0, local9, local45, local35, local23, local61.anInt3059, true, null);
					}
					arg2.method131(arg3, arg7, arg1, local55, local116, 768, arg8, 0, 0, local73, local86);
				}
			}
		}
	}
}
