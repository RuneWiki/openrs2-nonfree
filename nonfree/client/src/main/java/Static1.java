import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	public static int anInt15;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!qb;")
	public static Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static volatile int anInt8 = 0;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Lclient!ge;")
	public static Class29 aClass29_1 = new Class29(64);

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!r;")
	private static Class61 aClass61_1 = Static129.method2060("purple:");

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!na;")
	public static Class5_Sub14_Sub1 aClass5_Sub14_Sub1_1 = new Class5_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public static int anInt14 = 0;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array1 = new Class61[200];

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!r;")
	public static Class61 aClass61_2 = aClass61_1;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!r;")
	public static Class61 aClass61_3 = aClass61_1;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "Lclient!r;")
	public static Class61 aClass61_4 = Static129.method2060("leuchten2:");

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!r;")
	public static Class61 aClass61_5 = Static129.method2060("M");

	@OriginalMember(owner = "client!a", name = "D", descriptor = "I")
	public static int anInt16 = 0;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	public static int anInt17 = -1;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method1(@OriginalArg(1) int arg0) {
		@Pc(4) int[] local4 = Static89.aClass5_Sub2_Sub1_Sub4_5.anIntArray386;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(41) int local41;
		@Pc(43) int local43;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local41 = (52736 - local29 * 512) * 4 + 24628;
			for (local43 = 1; local43 < 103; local43++) {
				if ((Static30.aByteArrayArrayArray2[arg0][local43][local29] & 0x18) == 0) {
					Static61.aClass81_1.method2098(local4, local41, arg0, local43, local29);
				}
				if (arg0 < 3 && (Static30.aByteArrayArrayArray2[arg0 + 1][local43][local29] & 0x8) != 0) {
					Static61.aClass81_1.method2098(local4, local41, arg0 + 1, local43, local29);
				}
				local41 += 4;
			}
		}
		Static89.aClass5_Sub2_Sub1_Sub4_5.method2028();
		local41 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 228;
		local43 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(148) int local148;
		for (@Pc(144) int local144 = 1; local144 < 103; local144++) {
			for (local148 = 1; local148 < 103; local148++) {
				if ((Static30.aByteArrayArrayArray2[arg0][local148][local144] & 0x18) == 0) {
					Static98.method1673(local43, arg0, local148, local41, local144);
				}
				if (arg0 < 3 && (Static30.aByteArrayArrayArray2[arg0 + 1][local148][local144] & 0x8) != 0) {
					Static98.method1673(local43, arg0 + 1, local148, local41, local144);
				}
			}
		}
		Static113.anInt2955 = 0;
		for (local148 = 0; local148 < 104; local148++) {
			for (@Pc(215) int local215 = 0; local215 < 104; local215++) {
				@Pc(223) int local223 = Static61.aClass81_1.method2080(Static93.anInt2428, local148, local215);
				if (local223 != 0) {
					local223 = local223 >> 14 & 0x7FFF;
					@Pc(236) int local236 = Static43.method767(local223).anInt3140;
					if (local236 >= 0) {
						@Pc(240) int local240 = local148;
						@Pc(242) int local242 = local215;
						if (local236 != 22 && local236 != 29 && local236 != 34 && local236 != 36 && local236 != 46 && local236 != 47 && local236 != 48) {
							@Pc(274) int[][] local274 = Static103.aClass66Array1[Static93.anInt2428].anIntArrayArray22;
							for (@Pc(276) int local276 = 0; local276 < 10; local276++) {
								@Pc(283) int local283 = (int) (Math.random() * 4.0D);
								if (local283 == 0 && local240 > 0 && local148 - 3 < local240 && (local274[local240 - 1][local242] & 0x12C0108) == 0) {
									local240--;
								}
								if (local283 == 1 && local240 < 103 && local240 < local148 + 3 && (local274[local240 + 1][local242] & 0x12C0180) == 0) {
									local240++;
								}
								if (local283 == 2 && local242 > 0 && local215 - 3 < local242 && (local274[local240][local242 - 1] & 0x12C0102) == 0) {
									local242--;
								}
								if (local283 == 3 && local242 < 103 && local242 < local215 + 3 && (local274[local240][local242 + 1] & 0x12C0120) == 0) {
									local242++;
								}
							}
						}
						Static90.aClass5_Sub2_Sub1_Sub4Array6[Static113.anInt2955] = Static59.aClass5_Sub2_Sub1_Sub4Array3[local236];
						Static129.anIntArray392[Static113.anInt2955] = local240;
						Static72.anIntArray277[Static113.anInt2955] = local242;
						Static113.anInt2955++;
					}
				}
			}
		}
		Static11.aClass36_1.method1758();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!hb;")
	public static Class5_Sub2_Sub7 method2(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub7 local11 = (Class5_Sub2_Sub7) Static75.aClass29_19.method766((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static57.aClass26_6.method1038(13, arg0);
		local11 = new Class5_Sub2_Sub7();
		local11.anInt1206 = arg0;
		if (local25 != null) {
			local11.method854(new Class5_Sub14(local25));
		}
		Static75.aClass29_19.method762(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method3() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static36.anInt1015 - 1; local13++) {
				if (Static38.anIntArray223[local13] < 1000 && Static38.anIntArray223[local13 + 1] > 1000) {
					@Pc(35) Class61 local35 = Static107.aClass61Array19[local13];
					Static107.aClass61Array19[local13] = Static107.aClass61Array19[local13 + 1];
					Static107.aClass61Array19[local13 + 1] = local35;
					local7 = false;
					@Pc(55) Class61 local55 = Static123.aClass61Array23[local13];
					Static123.aClass61Array23[local13] = Static123.aClass61Array23[local13 + 1];
					Static123.aClass61Array23[local13 + 1] = local55;
					@Pc(73) int local73 = Static38.anIntArray223[local13];
					Static38.anIntArray223[local13] = Static38.anIntArray223[local13 + 1];
					Static38.anIntArray223[local13 + 1] = local73;
					@Pc(91) int local91 = Static76.anIntArray266[local13];
					Static76.anIntArray266[local13] = Static76.anIntArray266[local13 + 1];
					Static76.anIntArray266[local13 + 1] = local91;
					@Pc(109) int local109 = Static23.anIntArray124[local13];
					Static23.anIntArray124[local13] = Static23.anIntArray124[local13 + 1];
					Static23.anIntArray124[local13 + 1] = local109;
					@Pc(127) int local127 = Static86.anIntArray294[local13];
					Static86.anIntArray294[local13] = Static86.anIntArray294[local13 + 1];
					Static86.anIntArray294[local13 + 1] = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method4() {
		aClass5_Sub14_Sub1_1 = null;
		aClass29_1 = null;
		aClass61_4 = null;
		aClass61_5 = null;
		aClass58_1 = null;
		aClass61_3 = null;
		aClass61_1 = null;
		aClass61_2 = null;
		aClass61Array1 = null;
		aShortArrayArray1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!wa;ILclient!sc;IIIIIII)V")
	public static void method6(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) Class5_Sub2_Sub16 local11 = Static43.method767(arg3);
		@Pc(22) int local22;
		@Pc(25) int local25;
		if (arg7 == 1 || arg7 == 3) {
			local22 = local11.anInt3126;
			local25 = local11.anInt3120;
		} else {
			local22 = local11.anInt3120;
			local25 = local11.anInt3126;
		}
		@Pc(45) int local45;
		@Pc(54) int local54;
		if (arg6 + local22 <= 104) {
			local45 = arg6 + (local22 >> 1);
			local54 = arg6 + (local22 + 1 >> 1);
		} else {
			local45 = arg6;
			local54 = arg6 + 1;
		}
		@Pc(76) int local76;
		@Pc(74) int local74;
		if (arg8 + local25 > 104) {
			local74 = arg8 + 1;
			local76 = arg8;
		} else {
			local74 = (local25 + 1 >> 1) + arg8;
			local76 = (local25 >> 1) + arg8;
		}
		@Pc(96) int[][] local96 = Static65.anIntArrayArrayArray3[arg5];
		@Pc(104) int local104 = (arg6 << 7) + (local22 << 6);
		@Pc(130) int local130 = local96[local54][local74] + local96[local45][local74] + local96[local54][local76] + local96[local45][local76] >> 2;
		@Pc(144) int local144 = (arg8 << 7) + (local25 << 6);
		@Pc(150) int local150 = (arg7 << 6) + arg1;
		if (local11.anInt3131 == 1) {
			local150 += 256;
		}
		@Pc(170) int local170 = arg6 + (arg8 << 7) + (arg3 << 14) + 1073741824;
		if (local11.anInt3137 == 0) {
			local170 += Integer.MIN_VALUE;
		}
		@Pc(201) Class5_Sub2_Sub2 local201;
		if (arg1 == 22) {
			if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
				local201 = local11.method1972(local96, local130, arg7, local104, local144, 22);
			} else {
				local201 = new Class5_Sub2_Sub2_Sub7(arg3, 22, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
			}
			arg0.method2079(arg4, arg6, arg8, local130, local201, local170, local150);
			if (local11.anInt3133 == 1) {
				arg2.method1795(arg6, arg8);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
				local201 = local11.method1972(local96, local130, arg7, local104, local144, 10);
			} else {
				local201 = new Class5_Sub2_Sub2_Sub7(arg3, 10, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
			}
			if (local201 != null) {
				arg0.method2099(arg4, arg6, arg8, local130, local22, local25, local201, arg1 == 11 ? 256 : 0, local170, local150);
			}
			if (local11.anInt3133 != 0) {
				arg2.method1804(arg8, local25, local22, arg6, local11.aBoolean111);
			}
		} else if (arg1 >= 12) {
			if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
				local201 = local11.method1972(local96, local130, arg7, local104, local144, arg1);
			} else {
				local201 = new Class5_Sub2_Sub2_Sub7(arg3, arg1, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
			}
			arg0.method2099(arg4, arg6, arg8, local130, 1, 1, local201, 0, local170, local150);
			if (local11.anInt3133 != 0) {
				arg2.method1804(arg8, local25, local22, arg6, local11.aBoolean111);
			}
		} else if (arg1 == 0) {
			if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
				local201 = local11.method1972(local96, local130, arg7, local104, local144, 0);
			} else {
				local201 = new Class5_Sub2_Sub2_Sub7(arg3, 0, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
			}
			arg0.method2101(arg4, arg6, arg8, local130, local201, null, Static114.anIntArray351[arg7], 0, local170, local150);
			if (local11.anInt3133 != 0) {
				arg2.method1796(arg6, local11.aBoolean111, arg7, arg8, arg1);
			}
		} else if (arg1 == 1) {
			if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
				local201 = local11.method1972(local96, local130, arg7, local104, local144, 1);
			} else {
				local201 = new Class5_Sub2_Sub2_Sub7(arg3, 1, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
			}
			arg0.method2101(arg4, arg6, arg8, local130, local201, null, Static24.anIntArray126[arg7], 0, local170, local150);
			if (local11.anInt3133 != 0) {
				arg2.method1796(arg6, local11.aBoolean111, arg7, arg8, arg1);
			}
		} else {
			@Pc(565) Class5_Sub2_Sub2 local565;
			@Pc(527) int local527;
			if (arg1 == 2) {
				local527 = arg7 + 1 & 0x3;
				@Pc(551) Class5_Sub2_Sub2 local551;
				if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
					local551 = local11.method1972(local96, local130, arg7 + 4, local104, local144, 2);
					local565 = local11.method1972(local96, local130, local527, local104, local144, 2);
				} else {
					local551 = new Class5_Sub2_Sub2_Sub7(arg3, 2, arg7 + 4, arg5, arg6, arg8, local11.anInt3147, true, null);
					local565 = new Class5_Sub2_Sub2_Sub7(arg3, 2, local527, arg5, arg6, arg8, local11.anInt3147, true, null);
				}
				arg0.method2101(arg4, arg6, arg8, local130, local551, local565, Static114.anIntArray351[arg7], Static114.anIntArray351[local527], local170, local150);
				if (local11.anInt3133 != 0) {
					arg2.method1796(arg6, local11.aBoolean111, arg7, arg8, arg1);
				}
			} else if (arg1 == 3) {
				if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
					local201 = local11.method1972(local96, local130, arg7, local104, local144, 3);
				} else {
					local201 = new Class5_Sub2_Sub2_Sub7(arg3, 3, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
				}
				arg0.method2101(arg4, arg6, arg8, local130, local201, null, Static24.anIntArray126[arg7], 0, local170, local150);
				if (local11.anInt3133 != 0) {
					arg2.method1796(arg6, local11.aBoolean111, arg7, arg8, arg1);
				}
			} else if (arg1 == 9) {
				if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
					local201 = local11.method1972(local96, local130, arg7, local104, local144, arg1);
				} else {
					local201 = new Class5_Sub2_Sub2_Sub7(arg3, arg1, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
				}
				arg0.method2099(arg4, arg6, arg8, local130, 1, 1, local201, 0, local170, local150);
				if (local11.anInt3133 != 0) {
					arg2.method1804(arg8, local25, local22, arg6, local11.aBoolean111);
				}
			} else if (arg1 == 4) {
				if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
					local201 = local11.method1972(local96, local130, arg7, local104, local144, 4);
				} else {
					local201 = new Class5_Sub2_Sub2_Sub7(arg3, 4, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
				}
				arg0.method2103(arg4, arg6, arg8, local130, local201, null, Static114.anIntArray351[arg7], 0, 0, 0, local170, local150);
			} else {
				@Pc(821) int local821;
				if (arg1 == 5) {
					local527 = 16;
					local821 = arg0.method2093(arg4, arg6, arg8);
					if (local821 != 0) {
						local527 = Static43.method767(local821 >> 14 & 0x7FFF).anInt3146;
					}
					if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
						local565 = local11.method1972(local96, local130, arg7, local104, local144, 4);
					} else {
						local565 = new Class5_Sub2_Sub2_Sub7(arg3, 4, arg7, arg5, arg6, arg8, local11.anInt3147, true, null);
					}
					arg0.method2103(arg4, arg6, arg8, local130, local565, null, Static114.anIntArray351[arg7], 0, local527 * Static99.anIntArray326[arg7], local527 * Static98.anIntArray325[arg7], local170, local150);
				} else if (arg1 == 6) {
					local527 = 8;
					local821 = arg0.method2093(arg4, arg6, arg8);
					if (local821 != 0) {
						local527 = Static43.method767(local821 >> 14 & 0x7FFF).anInt3146 / 2;
					}
					if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
						local565 = local11.method1972(local96, local130, arg7 + 4, local104, local144, 4);
					} else {
						local565 = new Class5_Sub2_Sub2_Sub7(arg3, 4, arg7 + 4, arg5, arg6, arg8, local11.anInt3147, true, null);
					}
					arg0.method2103(arg4, arg6, arg8, local130, local565, null, 256, arg7, local527 * Static29.anIntArray150[arg7], local527 * Static77.anIntArray272[arg7], local170, local150);
				} else if (arg1 == 7) {
					local821 = arg7 + 2 & 0x3;
					if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
						local201 = local11.method1972(local96, local130, local821 + 4, local104, local144, 4);
					} else {
						local201 = new Class5_Sub2_Sub2_Sub7(arg3, 4, local821 + 4, arg5, arg6, arg8, local11.anInt3147, true, null);
					}
					arg0.method2103(arg4, arg6, arg8, local130, local201, null, 256, local821, 0, 0, local170, local150);
				} else if (arg1 == 8) {
					local821 = arg0.method2093(arg4, arg6, arg8);
					local527 = 8;
					if (local821 != 0) {
						local527 = Static43.method767(local821 >> 14 & 0x7FFF).anInt3146 / 2;
					}
					@Pc(1075) int local1075 = arg7 + 2 & 0x3;
					@Pc(1115) Class5_Sub2_Sub2 local1115;
					if (local11.anInt3147 == -1 && local11.anIntArray377 == null) {
						local565 = local11.method1972(local96, local130, arg7 + 4, local104, local144, 4);
						local1115 = local11.method1972(local96, local130, local1075 + 4, local104, local144, 4);
					} else {
						local565 = new Class5_Sub2_Sub2_Sub7(arg3, 4, arg7 + 4, arg5, arg6, arg8, local11.anInt3147, true, null);
						local1115 = new Class5_Sub2_Sub2_Sub7(arg3, 4, local1075 + 4, arg5, arg6, arg8, local11.anInt3147, true, null);
					}
					arg0.method2103(arg4, arg6, arg8, local130, local565, local1115, 256, arg7, Static29.anIntArray150[arg7] * local527, Static77.anIntArray272[arg7] * local527, local170, local150);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method7() {
		if (Static50.anInt1261 > 0) {
			Static118.method1891();
		} else {
			Static36.method697(40);
			Static102.aClass30_11 = Static108.aClass30_2;
			Static108.aClass30_2 = null;
		}
	}
}
