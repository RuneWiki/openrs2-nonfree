import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Lclient!ef;")
	public static Class20 aClass20_14;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	public static int anInt4735;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array10;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1227 = Static8.method128("::noclip");

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1229 = Static8.method128("FULL");

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1228 = aClass18_1229;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray8 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1230 = Static8.method128("<col=ffff00>");

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public static int anInt4739 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ef;)Z")
	public static boolean method3190(@OriginalArg(1) Class20 arg0) {
		@Pc(6) int local6 = arg0.anInt1221;
		if (local6 == 205) {
			Static92.anInt2817 = 250;
			return true;
		}
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (local6 >= 300 && local6 <= 313) {
			local29 = (local6 - 300) / 2;
			local33 = local6 & 0x1;
			Static120.aClass31_1.method1288(local33 == 1, local29);
		}
		if (local6 >= 314 && local6 <= 323) {
			local29 = (local6 - 314) / 2;
			local33 = local6 & 0x1;
			Static120.aClass31_1.method1284(local29, local33 == 1);
		}
		if (local6 == 324) {
			Static120.aClass31_1.method1280(false);
		}
		if (local6 == 325) {
			Static120.aClass31_1.method1280(true);
		}
		if (local6 == 326) {
			Static95.aClass1_Sub6_Sub1_1.method555(27);
			Static120.aClass31_1.method1281(Static95.aClass1_Sub6_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!k;III)V")
	public static void method3191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub8_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		@Pc(13) int local13 = Static98.anInt3021 + Static180.anInt4777 & 0x7FF;
		@Pc(21) int local21 = arg1 * arg1 + arg4 * arg4;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Class1_Sub1_Sub8_Sub4.anIntArray212[local13];
		@Pc(33) int local33 = Class1_Sub1_Sub8_Sub4.anIntArray216[local13];
		@Pc(41) int local41 = local33 * 256 / (Static160.anInt4384 + 256);
		@Pc(49) int local49 = local29 * 256 / (Static160.anInt4384 + 256);
		@Pc(73) int local73 = arg1 * local41 + local49 * arg4 >> 16;
		@Pc(84) int local84 = arg4 * local41 - arg1 * local49 >> 16;
		if (local21 > 2500) {
			arg2.method1639(Static69.aClass1_Sub1_Sub8_Sub1_2, arg3 + local73 + 94 + 4 - arg2.anInt2316 / 2, -(arg2.anInt2315 / 2) + -local84 + (arg0 - -83) + -4);
		} else {
			arg2.method1659(arg3 + local73 + 4 + 94 - arg2.anInt2316 / 2, -(arg2.anInt2315 / 2) + (arg0 + 83 - (local84 + 4)));
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ef;BI)V")
	public static void method3192(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		if (Static41.aClass20_4 != null || Static149.aBoolean185 || (arg1 == null || Static139.method2684(arg1) == null)) {
			return;
		}
		Static41.aClass20_4 = arg1;
		Static157.aClass20_12 = Static139.method2684(arg1);
		Static180.aBoolean212 = false;
		Static88.anInt2736 = arg0;
		Static47.anInt4241 = 0;
		Static85.anInt2578 = arg2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public static boolean method3193(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIILclient!fh;IIIILclient!re;)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class68 arg8) {
		@Pc(13) Class1_Sub1_Sub11 local13 = Static62.method1274(arg6);
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (arg4 == 1 || arg4 == 3) {
			local22 = local13.anInt2822;
			local25 = local13.anInt2815;
		} else {
			local25 = local13.anInt2822;
			local22 = local13.anInt2815;
		}
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (local22 + arg7 > 104) {
			local42 = arg7;
			local46 = arg7 + 1;
		} else {
			local42 = arg7 + (local22 >> 1);
			local46 = (local22 + 1 >> 1) + arg7;
		}
		@Pc(70) int local70 = (arg7 << 7) + (local22 << 6);
		@Pc(84) int local84;
		@Pc(92) int local92;
		if (arg5 + local25 <= 104) {
			local84 = (local25 >> 1) + arg5;
			local92 = arg5 + (local25 + 1 >> 1);
		} else {
			local92 = arg5 + 1;
			local84 = arg5;
		}
		@Pc(104) int[][] local104 = Static135.anIntArrayArrayArray5[arg2];
		@Pc(131) int local131 = local104[local46][local92] + local104[local46][local84] + local104[local42][local84] + local104[local42][local92] >> 2;
		@Pc(139) int local139 = (local25 << 6) + (arg5 << 7);
		@Pc(151) int local151 = (arg6 << 14) + arg7 + (arg5 << 7) + 1073741824;
		if (local13.anInt2811 == 0) {
			local151 += Integer.MIN_VALUE;
		}
		@Pc(167) int local167 = arg1 + (arg4 << 6);
		if (local13.anInt2805 == 1) {
			local167 += 256;
		}
		@Pc(196) Class1_Sub1_Sub5 local196;
		if (arg1 == 22) {
			if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
				local196 = local13.method1963(arg4, local104, local70, local131, local139, 22);
			} else {
				local196 = new Class1_Sub1_Sub5_Sub6(arg6, 22, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
			}
			arg8.method2643(arg0, arg7, arg5, local131, local196, local151, local167);
			if (local13.anInt2820 == 1) {
				arg3.method1052(arg5, arg7);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
				local196 = local13.method1963(arg4, local104, local70, local131, local139, 10);
			} else {
				local196 = new Class1_Sub1_Sub5_Sub6(arg6, 10, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
			}
			if (local196 != null) {
				arg8.method2621(arg0, arg7, arg5, local131, local22, local25, local196, arg1 == 11 ? 256 : 0, local151, local167);
			}
			if (local13.anInt2820 != 0) {
				arg3.method1053(arg5, local25, local22, arg7, local13.aBoolean114);
			}
		} else if (arg1 >= 12) {
			if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
				local196 = local13.method1963(arg4, local104, local70, local131, local139, arg1);
			} else {
				local196 = new Class1_Sub1_Sub5_Sub6(arg6, arg1, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
			}
			arg8.method2621(arg0, arg7, arg5, local131, 1, 1, local196, 0, local151, local167);
			if (local13.anInt2820 != 0) {
				arg3.method1053(arg5, local25, local22, arg7, local13.aBoolean114);
			}
		} else if (arg1 == 0) {
			if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
				local196 = local13.method1963(arg4, local104, local70, local131, local139, 0);
			} else {
				local196 = new Class1_Sub1_Sub5_Sub6(arg6, 0, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
			}
			arg8.method2611(arg0, arg7, arg5, local131, local196, null, Static98.anIntArray266[arg4], 0, local151, local167);
			if (local13.anInt2820 != 0) {
				arg3.method1047(arg5, local13.aBoolean114, arg1, arg7, arg4);
			}
		} else if (arg1 == 1) {
			if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
				local196 = local13.method1963(arg4, local104, local70, local131, local139, 1);
			} else {
				local196 = new Class1_Sub1_Sub5_Sub6(arg6, 1, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
			}
			arg8.method2611(arg0, arg7, arg5, local131, local196, null, Static168.anIntArray416[arg4], 0, local151, local167);
			if (local13.anInt2820 != 0) {
				arg3.method1047(arg5, local13.aBoolean114, arg1, arg7, arg4);
			}
		} else {
			@Pc(550) Class1_Sub1_Sub5 local550;
			@Pc(512) int local512;
			if (arg1 == 2) {
				local512 = arg4 + 1 & 0x3;
				@Pc(536) Class1_Sub1_Sub5 local536;
				if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
					local536 = local13.method1963(arg4 + 4, local104, local70, local131, local139, 2);
					local550 = local13.method1963(local512, local104, local70, local131, local139, 2);
				} else {
					local536 = new Class1_Sub1_Sub5_Sub6(arg6, 2, arg4 + 4, arg2, arg7, arg5, local13.anInt2814, true, null);
					local550 = new Class1_Sub1_Sub5_Sub6(arg6, 2, local512, arg2, arg7, arg5, local13.anInt2814, true, null);
				}
				arg8.method2611(arg0, arg7, arg5, local131, local536, local550, Static98.anIntArray266[arg4], Static98.anIntArray266[local512], local151, local167);
				if (local13.anInt2820 != 0) {
					arg3.method1047(arg5, local13.aBoolean114, arg1, arg7, arg4);
				}
			} else if (arg1 == 3) {
				if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
					local196 = local13.method1963(arg4, local104, local70, local131, local139, 3);
				} else {
					local196 = new Class1_Sub1_Sub5_Sub6(arg6, 3, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
				}
				arg8.method2611(arg0, arg7, arg5, local131, local196, null, Static168.anIntArray416[arg4], 0, local151, local167);
				if (local13.anInt2820 != 0) {
					arg3.method1047(arg5, local13.aBoolean114, arg1, arg7, arg4);
				}
			} else if (arg1 == 9) {
				if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
					local196 = local13.method1963(arg4, local104, local70, local131, local139, arg1);
				} else {
					local196 = new Class1_Sub1_Sub5_Sub6(arg6, arg1, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
				}
				arg8.method2621(arg0, arg7, arg5, local131, 1, 1, local196, 0, local151, local167);
				if (local13.anInt2820 != 0) {
					arg3.method1053(arg5, local25, local22, arg7, local13.aBoolean114);
				}
			} else if (arg1 == 4) {
				if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
					local196 = local13.method1963(arg4, local104, local70, local131, local139, 4);
				} else {
					local196 = new Class1_Sub1_Sub5_Sub6(arg6, 4, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
				}
				arg8.method2619(arg0, arg7, arg5, local131, local196, null, Static98.anIntArray266[arg4], 0, 0, 0, local151, local167);
			} else {
				@Pc(803) int local803;
				if (arg1 == 5) {
					local803 = arg8.method2648(arg0, arg7, arg5);
					local512 = 16;
					if (local803 != 0) {
						local512 = Static62.method1274(local803 >> 14 & 0x7FFF).anInt2810;
					}
					if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
						local550 = local13.method1963(arg4, local104, local70, local131, local139, 4);
					} else {
						local550 = new Class1_Sub1_Sub5_Sub6(arg6, 4, arg4, arg2, arg7, arg5, local13.anInt2814, true, null);
					}
					arg8.method2619(arg0, arg7, arg5, local131, local550, null, Static98.anIntArray266[arg4], 0, Static20.anIntArray42[arg4] * local512, local512 * Static31.anIntArray70[arg4], local151, local167);
				} else if (arg1 == 6) {
					local512 = 8;
					local803 = arg8.method2648(arg0, arg7, arg5);
					if (local803 != 0) {
						local512 = Static62.method1274(local803 >> 14 & 0x7FFF).anInt2810 / 2;
					}
					if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
						local550 = local13.method1963(arg4 + 4, local104, local70, local131, local139, 4);
					} else {
						local550 = new Class1_Sub1_Sub5_Sub6(arg6, 4, arg4 + 4, arg2, arg7, arg5, local13.anInt2814, true, null);
					}
					arg8.method2619(arg0, arg7, arg5, local131, local550, null, 256, arg4, Static99.anIntArray267[arg4] * local512, Static72.anIntArray196[arg4] * local512, local151, local167);
				} else if (arg1 == 7) {
					local803 = arg4 + 2 & 0x3;
					if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
						local196 = local13.method1963(local803 + 4, local104, local70, local131, local139, 4);
					} else {
						local196 = new Class1_Sub1_Sub5_Sub6(arg6, 4, local803 + 4, arg2, arg7, arg5, local13.anInt2814, true, null);
					}
					arg8.method2619(arg0, arg7, arg5, local131, local196, null, 256, local803, 0, 0, local151, local167);
				} else if (arg1 == 8) {
					local512 = 8;
					local803 = arg8.method2648(arg0, arg7, arg5);
					if (local803 != 0) {
						local512 = Static62.method1274(local803 >> 14 & 0x7FFF).anInt2810 / 2;
					}
					@Pc(1056) int local1056 = arg4 + 2 & 0x3;
					@Pc(1087) Class1_Sub1_Sub5 local1087;
					if (local13.anInt2814 == -1 && local13.anIntArray250 == null) {
						local550 = local13.method1963(arg4 + 4, local104, local70, local131, local139, 4);
						local1087 = local13.method1963(local1056 + 4, local104, local70, local131, local139, 4);
					} else {
						local550 = new Class1_Sub1_Sub5_Sub6(arg6, 4, arg4 + 4, arg2, arg7, arg5, local13.anInt2814, true, null);
						local1087 = new Class1_Sub1_Sub5_Sub6(arg6, 4, local1056 + 4, arg2, arg7, arg5, local13.anInt2814, true, null);
					}
					arg8.method2619(arg0, arg7, arg5, local131, local550, local1087, 256, arg4, local512 * Static99.anIntArray267[arg4], local512 * Static72.anIntArray196[arg4], local151, local167);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method3195() {
		aShortArrayArray8 = null;
		aClass18_1229 = null;
		aClass18_1227 = null;
		aClass20_14 = null;
		aClass1_Sub1_Sub8_Sub3Array10 = null;
		aClass18_1230 = null;
		aClass18_1228 = null;
	}
}
