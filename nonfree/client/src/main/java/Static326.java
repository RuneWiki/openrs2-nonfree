import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_72 = new Class241(7, 4);

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_101 = new Class322(29, -1);

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIII)V")
	public static void method5115(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(17) Class60_Sub8 local17 = (Class60_Sub8) Static292.aClass385_4.method8778(); local17 != null; local17 = (Class60_Sub8) Static292.aClass385_4.method8773()) {
			if (local17.anInt8456 <= Static141.anInt8737) {
				local17.method8914();
			} else {
				Static211.method3846((local17.anInt8460 << 9) + 256, local17.anInt8463 * 2, arg1 >> 1, local17.anInt8461, (local17.anInt8457 << 9) + 256, arg0 >> 1);
				Static205.aClass67_6.method8291(Static609.anIntArray627[1] + arg2, arg3 - -Static609.anIntArray627[0], local17.anInt8458 | 0xFF000000, 0, local17.aString98);
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)[Lclient!u;")
	public static Class352[] method5116() {
		return new Class352[] { Static41.aClass352_2, Static88.aClass352_3, Static452.aClass352_7, Static353.aClass352_6, Static92.aClass352_4, Static31.aClass352_1, Static340.aClass352_5 };
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIILclient!ha;II)V")
	public static void method5117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(5) int arg4) {
		arg3.KA(arg4, arg1, arg0 + arg4, arg1 - -arg2);
		arg3.method6631(arg0, arg4, arg2, -16777216, arg1);
		if (Static98.anInt1457 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static627.anInt7272 / (float) Static627.anInt7266;
		@Pc(41) int local41 = arg0;
		@Pc(43) int local43 = arg2;
		if (local39 < (float) 1) {
			local43 = (int) (local39 * (float) arg0);
		} else {
			local41 = (int) ((float) arg2 / local39);
		}
		@Pc(71) int local71 = arg4 + (arg0 - local41) / 2;
		@Pc(80) int local80 = arg1 + (arg2 - local43) / 2;
		if (Static158.aClass49_8 == null || Static158.aClass49_8.method8988() != arg0 || Static158.aClass49_8.method8993() != arg2) {
			Static627.method6484(Static627.anInt7264, Static627.anInt7272 + Static627.anInt7268, Static627.anInt7264 - -Static627.anInt7266, Static627.anInt7268, local71, local80, local71 + local41, local80 + local43);
			Static627.method6472(arg3);
			Static158.aClass49_8 = arg3.method6687(local71, local80, local41, local43, false);
		}
		Static158.aClass49_8.method8997(local71, local80);
		@Pc(138) int local138 = local41 * Static56.anInt690 / Static627.anInt7266;
		@Pc(144) int local144 = local43 * Static543.anInt8805 / Static627.anInt7272;
		@Pc(153) int local153 = local71 + Static442.anInt7704 * local41 / Static627.anInt7266;
		@Pc(167) int local167 = local43 + local80 - local144 - local43 * Static223.anInt4376 / Static627.anInt7272;
		@Pc(169) int local169 = -1996554240;
		if (Static567.aClass121_9 == Static129.aClass121_1) {
			local169 = -1996488705;
		}
		arg3.aa(local153, local167, local138, local144, local169, 1);
		arg3.method6701(local153, local167, local138, local144, local169, 0);
		if (Static626.anInt9859 <= 0) {
			return;
		}
		@Pc(206) int local206;
		if (Static344.anInt5861 <= 50) {
			local206 = Static344.anInt5861 * 5;
		} else {
			local206 = 500 - Static344.anInt5861 * 5;
		}
		for (@Pc(220) Class6_Sub24 local220 = (Class6_Sub24) Static627.aClass340_57.method8124(); local220 != null; local220 = (Class6_Sub24) Static627.aClass340_57.method8134()) {
			@Pc(228) Class361 local228 = Static627.aClass190_5.method4695(local220.anInt4787);
			if (Static607.method8345(local228)) {
				@Pc(259) int local259;
				@Pc(270) int local270;
				if (Static119.anInt2286 == local220.anInt4787) {
					local259 = local71 + local220.anInt4789 * local41 / Static627.anInt7266;
					local270 = local80 + local43 * (Static627.anInt7272 - local220.anInt4794) / Static627.anInt7272;
					arg3.method6631(4, local259 - 2, 4, local206 << 24 | 0xFFFF00, local270 - 2);
				} else if (Static604.anInt9539 != -1 && Static604.anInt9539 == local228.anInt9818) {
					local259 = local220.anInt4789 * local41 / Static627.anInt7266 + local71;
					local270 = local43 * (Static627.anInt7272 - local220.anInt4794) / Static627.anInt7272 + local80;
					arg3.method6631(4, local259 - 2, 4, local206 << 24 | 0xFFFF00, local270 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIIIIILclient!uda;II)Z")
	public static boolean method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class356 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg0;
		@Pc(23) int local23 = arg8 - 64;
		@Pc(28) int local28 = arg0 - 64;
		Static2.anIntArrayArray1[64][64] = 99;
		Static311.anIntArrayArray30[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static173.anIntArray191[0] = arg8;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static313.anIntArray315[0] = arg0;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray53;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(81) int local81;
				@Pc(86) int local86;
				@Pc(91) int local91;
				@Pc(265) int local265;
				@Pc(314) int local314;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static322.anInt5560 = local9;
									Static150.anInt3124 = local7;
									return false;
								}
								local9 = Static313.anIntArray315[local48];
								local7 = Static173.anIntArray191[local48];
								local70 = local7 - local23;
								local48 = local48 + 1 & 0xFFF;
								local81 = local9 - local28;
								local86 = local7 - arg9.anInt9620;
								local91 = local9 - arg9.anInt9604;
								if (arg7 == -4) {
									if (local7 == arg6 && local9 == arg2) {
										Static150.anInt3124 = local7;
										Static322.anInt5560 = local9;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static51.method616(arg5, local7, local9, arg5, arg6, arg3, arg2, arg4)) {
										Static322.anInt5560 = local9;
										Static150.anInt3124 = local7;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg9.method8384(arg2, arg10, arg4, arg6, local7, arg5, arg5, arg3, local9)) {
										Static150.anInt3124 = local7;
										Static322.anInt5560 = local9;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg9.method8390(arg2, local9, arg4, local7, arg5, arg6, arg10, arg3)) {
										Static150.anInt3124 = local7;
										Static322.anInt5560 = local9;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg9.method8392(local9, arg1, arg6, local7, arg2, arg7, arg5)) {
										Static322.anInt5560 = local9;
										Static150.anInt3124 = local7;
										return true;
									}
								} else if (arg9.method8398(local7, arg1, local9, arg7, arg6, arg5, arg2)) {
									Static322.anInt5560 = local9;
									Static150.anInt3124 = local7;
									return true;
								}
								local265 = Static311.anIntArrayArray30[local70][local81] + 1;
								if (local70 > 0 && Static2.anIntArrayArray1[local70 - 1][local81] == 0 && (local56[local86 - 1][local91] & 0x43A40000) == 0 && (local56[local86 - 1][local91 + arg5 - 1] & 0x4E240000) == 0) {
									local314 = 1;
									while (true) {
										if (local314 >= arg5 - 1) {
											Static173.anIntArray191[local51] = local7 - 1;
											Static313.anIntArray315[local51] = local9;
											Static2.anIntArrayArray1[local70 - 1][local81] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static311.anIntArrayArray30[local70 - 1][local81] = local265;
											break;
										}
										if ((local56[local86 - 1][local91 + local314] & 0x4FA40000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (128 - arg5 > local70 && Static2.anIntArrayArray1[local70 + 1][local81] == 0 && (local56[local86 + arg5][local91] & 0x60E40000) == 0 && (local56[local86 + arg5][arg5 + local91 - 1] & 0x78240000) == 0) {
									local314 = 1;
									while (true) {
										if (local314 >= arg5 - 1) {
											Static173.anIntArray191[local51] = local7 + 1;
											Static313.anIntArray315[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static2.anIntArrayArray1[local70 + 1][local81] = 8;
											Static311.anIntArrayArray30[local70 + 1][local81] = local265;
											break;
										}
										if ((local56[local86 + arg5][local314 + local91] & 0x78E40000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (local81 > 0 && Static2.anIntArrayArray1[local70][local81 - 1] == 0 && (local56[local86][local91 - 1] & 0x43A40000) == 0 && (local56[arg5 + local86 - 1][local91 - 1] & 0x60E40000) == 0) {
									local314 = 1;
									while (true) {
										if (arg5 - 1 <= local314) {
											Static173.anIntArray191[local51] = local7;
											Static313.anIntArray315[local51] = local9 - 1;
											Static2.anIntArrayArray1[local70][local81 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static311.anIntArrayArray30[local70][local81 - 1] = local265;
											break;
										}
										if ((local56[local314 + local86][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (128 - arg5 > local81 && Static2.anIntArrayArray1[local70][local81 + 1] == 0 && (local56[local86][arg5 + local91] & 0x4E240000) == 0 && (local56[arg5 + local86 - 1][local91 + arg5] & 0x78240000) == 0) {
									local314 = 1;
									while (true) {
										if (local314 >= arg5 - 1) {
											Static173.anIntArray191[local51] = local7;
											Static313.anIntArray315[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static2.anIntArrayArray1[local70][local81 + 1] = 4;
											Static311.anIntArrayArray30[local70][local81 + 1] = local265;
											break;
										}
										if ((local56[local86 + local314][arg5 + local91] & 0x7E240000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (local70 > 0 && local81 > 0 && Static2.anIntArrayArray1[local70 - 1][local81 - 1] == 0 && (local56[local86 - 1][local91 - 1] & 0x43A40000) == 0) {
									local314 = 1;
									while (true) {
										if (local314 >= arg5) {
											Static173.anIntArray191[local51] = local7 - 1;
											Static313.anIntArray315[local51] = local9 - 1;
											Static2.anIntArrayArray1[local70 - 1][local81 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static311.anIntArrayArray30[local70 - 1][local81 - 1] = local265;
											break;
										}
										if ((local56[local86 - 1][local91 + local314 - 1] & 0x4FA40000) != 0 || (local56[local86 + local314 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (local70 < 128 - arg5 && local81 > 0 && Static2.anIntArrayArray1[local70 + 1][local81 - 1] == 0 && (local56[arg5 + local86][local91 - 1] & 0x60E40000) == 0) {
									local314 = 1;
									while (true) {
										if (local314 >= arg5) {
											Static173.anIntArray191[local51] = local7 + 1;
											Static313.anIntArray315[local51] = local9 - 1;
											Static2.anIntArrayArray1[local70 + 1][local81 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static311.anIntArrayArray30[local70 + 1][local81 - 1] = local265;
											break;
										}
										if ((local56[arg5 + local86][local314 + local91 - 1] & 0x78E40000) != 0 || (local56[local86 + local314][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local314++;
									}
								}
								if (local70 > 0 && 128 - arg5 > local81 && Static2.anIntArrayArray1[local70 - 1][local81 + 1] == 0 && (local56[local86 - 1][arg5 + local91] & 0x4E240000) == 0) {
									for (local314 = 1; local314 < arg5; local314++) {
										if ((local56[local86 - 1][local314 + local91] & 0x4FA40000) != 0 || (local56[local86 + local314 - 1][arg5 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static173.anIntArray191[local51] = local7 - 1;
									Static313.anIntArray315[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static2.anIntArrayArray1[local70 - 1][local81 + 1] = 6;
									Static311.anIntArrayArray30[local70 - 1][local81 + 1] = local265;
								}
							} while (local70 >= 128 - arg5);
						} while (128 - arg5 <= local81);
					} while (Static2.anIntArrayArray1[local70 + 1][local81 + 1] != 0);
				} while ((local56[local86 + arg5][local91 + arg5] & 0x78240000) != 0);
				for (local314 = 1; local314 < arg5; local314++) {
					if ((local56[local314 + local86][local91 + arg5] & 0x7E240000) != 0 || (local56[local86 + arg5][local91 + local314] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static173.anIntArray191[local51] = local7 + 1;
				Static313.anIntArray315[local51] = local9 + 1;
				Static2.anIntArrayArray1[local70 + 1][local81 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static311.anIntArrayArray30[local70 + 1][local81 + 1] = local265;
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	public static void method5120() {
		Static82.aClass92Array1 = null;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III[BILjava/lang/String;)I")
	public static int method5121(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(22) char local22 = arg3.charAt(local12);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				arg1[arg2 + local12] = (byte) local22;
			} else if (local22 == '€') {
				arg1[arg2 + local12] = -128;
			} else if (local22 == '‚') {
				arg1[local12 + arg2] = -126;
			} else if (local22 == 'ƒ') {
				arg1[arg2 + local12] = -125;
			} else if (local22 == '„') {
				arg1[local12 + arg2] = -124;
			} else if (local22 == '…') {
				arg1[local12 + arg2] = -123;
			} else if (local22 == '†') {
				arg1[local12 + arg2] = -122;
			} else if (local22 == '‡') {
				arg1[local12 + arg2] = -121;
			} else if (local22 == 'ˆ') {
				arg1[local12 + arg2] = -120;
			} else if (local22 == '‰') {
				arg1[arg2 + local12] = -119;
			} else if (local22 == 'Š') {
				arg1[arg2 + local12] = -118;
			} else if (local22 == '‹') {
				arg1[arg2 + local12] = -117;
			} else if (local22 == 'Œ') {
				arg1[local12 + arg2] = -116;
			} else if (local22 == 'Ž') {
				arg1[arg2 + local12] = -114;
			} else if (local22 == '‘') {
				arg1[arg2 + local12] = -111;
			} else if (local22 == '’') {
				arg1[local12 + arg2] = -110;
			} else if (local22 == '“') {
				arg1[local12 + arg2] = -109;
			} else if (local22 == '”') {
				arg1[arg2 + local12] = -108;
			} else if (local22 == '•') {
				arg1[arg2 + local12] = -107;
			} else if (local22 == '–') {
				arg1[local12 + arg2] = -106;
			} else if (local22 == '—') {
				arg1[arg2 + local12] = -105;
			} else if (local22 == '˜') {
				arg1[local12 + arg2] = -104;
			} else if (local22 == '™') {
				arg1[arg2 + local12] = -103;
			} else if (local22 == 'š') {
				arg1[arg2 + local12] = -102;
			} else if (local22 == '›') {
				arg1[arg2 + local12] = -101;
			} else if (local22 == 'œ') {
				arg1[arg2 + local12] = -100;
			} else if (local22 == 'ž') {
				arg1[local12 + arg2] = -98;
			} else if (local22 == 'Ÿ') {
				arg1[arg2 + local12] = -97;
			} else {
				arg1[local12 + arg2] = 63;
			}
		}
		return local10;
	}
}
