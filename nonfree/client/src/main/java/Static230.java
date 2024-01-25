import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!id", name = "W", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!id", name = "H", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!id", name = "U", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!id", name = "V", descriptor = "[Lclient!nt;")
	public static final Class240[] aClass240Array1 = new Class240[4];

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Z")
	public static boolean method3178(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 46 || arg0 == 44 || arg0 == 57 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static321.aClass327Array3[Static631.anInt9614++] = new Class327(4, arg3, arg0, arg1, arg1, arg0, arg6, arg4, arg4, arg6, arg5, arg5, arg2, arg2);
	}

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)V")
	public static void method3180() {
		Static78.aClient1.method1061();
		Static166.method1420();
		Static146.aClass288_90 = null;
		Static243.anInt3928 = 0;
		Static109.aClass288_71 = null;
		Static363.anInt5740 = 0;
		Static53.aClass2_Sub22_Sub2_1.anInt10247 = 0;
		Static198.aClass288_282 = null;
		Static475.method6407();
		Static641.anInt10324 = 0;
		Static619.aClass211Array1 = null;
		Static352.anInt5497 = 0;
		Static37.aString9 = null;
		Static159.anInt2843 = 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!jf;I)V")
	public static void method3181(@OriginalArg(0) Class168 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (arg0 == Static548.aClass168_12) {
			local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static588.anIntArray654[local16];
			local28 = Static53.aClass2_Sub22_Sub2_1.method8545();
			local36 = Static258.anInt4069 + (local28 >> 4 & 0x7);
			local42 = (local28 & 0x7) + Static307.anInt4957;
			local46 = Static53.aClass2_Sub22_Sub2_1.method8520();
			if (Static139.method2122(Static592.anInt9602) || local36 >= 0 && local42 >= 0 && local36 < Static228.anInt3704 && local42 < Static162.anInt2911) {
				Static634.method8474(Static170.anInt9508, local46, local36, local20, local24, local42, local16);
			}
		} else if (arg0 == Static554.aClass168_14) {
			Static53.aClass2_Sub22_Sub2_1.method8547();
			local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
			local16 = Static258.anInt4069 + (local12 >> 4 & 0x7);
			local20 = Static307.anInt4957 + (local12 & 0x7);
			local24 = Static53.aClass2_Sub22_Sub2_1.method8546();
			local28 = Static53.aClass2_Sub22_Sub2_1.method8547();
			local36 = Static53.aClass2_Sub22_Sub2_1.method8539();
			@Pc(125) String local125 = Static53.aClass2_Sub22_Sub2_1.method8549();
			Static631.method8041(local36, local20, Static170.anInt9508, local16, local28, local125, local24);
		} else if (Static4.aClass168_1 == arg0) {
			local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
			local16 = Static258.anInt4069 + (local12 >> 4 & 0x7);
			local20 = Static307.anInt4957 + (local12 & 0x7);
			local24 = Static53.aClass2_Sub22_Sub2_1.method8547();
			local28 = local24 >> 2;
			local36 = local24 & 0x3;
			local42 = Static588.anIntArray654[local28];
			local46 = Static53.aClass2_Sub22_Sub2_1.method8544();
			if (local46 == 65535) {
				local46 = -1;
			}
			Static408.method5478(local42, Static170.anInt9508, local16, local28, local46, local36, local20);
		} else if (Static184.aClass168_5 == arg0) {
			local12 = Static53.aClass2_Sub22_Sub2_1.method8546();
			local16 = Static53.aClass2_Sub22_Sub2_1.method8547();
			Static319.aClass141_4.method2971(local12).method4052(local16);
		} else {
			@Pc(296) int local296;
			@Pc(300) int local300;
			@Pc(304) int local304;
			@Pc(321) int local321;
			@Pc(288) int local288;
			@Pc(292) int local292;
			if (Static184.aClass168_4 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = Static258.anInt4069 * 2 + (local12 >> 4 & 0xF);
				local20 = Static307.anInt4957 * 2 + (local12 & 0xF);
				local24 = Static53.aClass2_Sub22_Sub2_1.method8547();
				@Pc(255) boolean local255 = (local24 & 0x1) != 0;
				@Pc(266) boolean local266 = (local24 & 0x2) != 0;
				local42 = local266 ? local24 >> 2 : -1;
				local46 = Static53.aClass2_Sub22_Sub2_1.method8548() + local16;
				local288 = Static53.aClass2_Sub22_Sub2_1.method8548() + local20;
				local292 = Static53.aClass2_Sub22_Sub2_1.method8526();
				local296 = Static53.aClass2_Sub22_Sub2_1.method8526();
				local300 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local304 = Static53.aClass2_Sub22_Sub2_1.method8547();
				if (local266) {
					local304 = (byte) local304;
				} else {
					local304 *= 4;
				}
				local321 = Static53.aClass2_Sub22_Sub2_1.method8547() * 4;
				@Pc(325) int local325 = Static53.aClass2_Sub22_Sub2_1.method8546();
				@Pc(329) int local329 = Static53.aClass2_Sub22_Sub2_1.method8546();
				@Pc(333) int local333 = Static53.aClass2_Sub22_Sub2_1.method8547();
				if (local333 == 255) {
					local333 = -1;
				}
				@Pc(344) int local344 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local16 >= 0 && local20 >= 0 && Static228.anInt3704 * 2 > local16 && Static228.anInt3704 * 2 > local20 && local46 >= 0 && local288 >= 0 && local46 < Static162.anInt2911 * 2 && Static162.anInt2911 * 2 > local288 && local300 != 65535) {
					local304 <<= 0x2;
					local288 = local288 * 256;
					local321 <<= 0x2;
					local344 <<= 0x2;
					local20 *= 256;
					local16 *= 256;
					local46 = local46 * 256;
					if (local292 != 0 && local42 != -1) {
						@Pc(425) Class13_Sub1_Sub1_Sub1 local425 = null;
						@Pc(432) int local432;
						if (local292 < 0) {
							local432 = -local292 - 1;
							if (Static528.anInt8672 == local432) {
								local425 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1;
							} else {
								local425 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local432];
							}
						} else {
							local432 = local292 - 1;
							@Pc(458) Class2_Sub43 local458 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local432);
							if (local458 != null) {
								local425 = local458.aClass13_Sub1_Sub1_Sub1_Sub1_2;
							}
						}
						if (local425 != null) {
							@Pc(469) Class334 local469 = local425.method3964();
							if (local469.anIntArrayArray58 != null && local469.anIntArrayArray58[local42] != null) {
								local304 -= local469.anIntArrayArray58[local42][1];
							}
							if (local469.anIntArrayArray59 != null && local469.anIntArrayArray59[local42] != null) {
								local304 -= local469.anIntArrayArray59[local42][1];
							}
						}
					}
					@Pc(528) Class13_Sub1_Sub1_Sub3 local528 = new Class13_Sub1_Sub1_Sub3(local300, Static170.anInt9508, Static170.anInt9508, local16, local20, local304, local325 + Static262.anInt5597, local329 - -Static262.anInt5597, local333, local344, local292, local296, local321, local255, local42);
					local528.method6403(local325 + Static262.anInt5597, Static504.method6917(local46, Static170.anInt9508, local288) - local321, local46, local288);
					Static378.aClass109_71.method2323(new Class2_Sub2_Sub20(local528));
				}
			} else if (Static392.aClass168_10 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = Static258.anInt4069 + (local12 >> 4 & 0x7);
				local20 = Static307.anInt4957 + (local12 & 0x7);
				local24 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local28 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local36 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local42 = Static53.aClass2_Sub22_Sub2_1.method8547();
				if (local16 >= 0 && local20 >= 0 && local16 < Static228.anInt3704 && Static162.anInt2911 > local20) {
					local46 = local16 * 512 + 256;
					local288 = local20 * 512 + 256;
					local292 = Static170.anInt9508;
					if (local292 < 3 && Static181.method2642(local20, local16)) {
						local292++;
					}
					@Pc(651) Class13_Sub1_Sub1_Sub2 local651 = new Class13_Sub1_Sub1_Sub2(local24, local36, Static262.anInt5597, Static170.anInt9508, local292, local46, Static504.method6917(local46, Static170.anInt9508, local288) - local28, local288, local16, local16, local20, local20, local42);
					Static616.aClass109_73.method2323(new Class2_Sub2_Sub21(local651));
				}
			} else if (Static548.aClass168_13 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = (local12 & 0x7) + Static307.anInt4957;
				local20 = local16 + Static123.anInt2176;
				local24 = Static258.anInt4069 + (local12 >> 4 & 0x7);
				local28 = Static132.anInt2246 + local24;
				local36 = Static53.aClass2_Sub22_Sub2_1.method8521();
				@Pc(707) Class2_Sub11 local707 = (Class2_Sub11) Static41.aClass118_6.method2595((long) (local28 | local20 << 14 | Static170.anInt9508 << 28));
				if (local707 != null) {
					for (@Pc(715) Class2_Sub4 local715 = (Class2_Sub4) local707.aClass109_23.method2325(); local715 != null; local715 = (Class2_Sub4) local707.aClass109_23.method2318()) {
						if (local715.anInt69 == (local36 & 0x7FFF)) {
							local715.method8653();
							break;
						}
					}
					if (local707.aClass109_23.method2328()) {
						local707.method8653();
					}
					if (local24 >= 0 && local16 >= 0 && Static228.anInt3704 > local24 && Static162.anInt2911 > local16) {
						Static185.method2704(local16, local24, Static170.anInt9508);
					}
				}
			} else if (Static312.aClass168_8 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8544();
				local16 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local20 = Static53.aClass2_Sub22_Sub2_1.method8527();
				local24 = (local20 & 0x7) + Static307.anInt4957;
				local28 = local24 + Static123.anInt2176;
				local36 = Static258.anInt4069 + (local20 >> 4 & 0x7);
				local42 = local36 + Static132.anInt2246;
				@Pc(828) boolean local828 = local36 >= 0 && local24 >= 0 && local36 < Static228.anInt3704 && local24 < Static162.anInt2911;
				if (local828 || Static139.method2122(Static592.anInt9602)) {
					Static491.method6843(Static170.anInt9508, local28, local42, new Class2_Sub4(local12, local16));
					if (local828) {
						Static185.method2704(local24, local36, Static170.anInt9508);
					}
				}
			} else if (Static259.aClass168_7 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				@Pc(872) boolean local872 = (local12 & 0x80) != 0;
				local20 = (local12 >> 3 & 0x7) + Static258.anInt4069;
				local24 = Static307.anInt4957 + (local12 & 0x7);
				local28 = Static53.aClass2_Sub22_Sub2_1.method8548() + local20;
				local36 = local24 + Static53.aClass2_Sub22_Sub2_1.method8548();
				local42 = Static53.aClass2_Sub22_Sub2_1.method8526();
				local46 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local288 = Static53.aClass2_Sub22_Sub2_1.method8547() * 4;
				local292 = Static53.aClass2_Sub22_Sub2_1.method8547() * 4;
				local296 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local300 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local304 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local321 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local304 == 255) {
					local304 = -1;
				}
				if (local20 >= 0 && local24 >= 0 && Static228.anInt3704 > local20 && Static162.anInt2911 > local24 && local28 >= 0 && local36 >= 0 && Static228.anInt3704 > local28 && Static162.anInt2911 > local36 && local46 != 65535) {
					local36 = local36 * 512 + 256;
					local24 = local24 * 512 + 256;
					local28 = local28 * 512 + 256;
					local292 <<= 0x2;
					local321 <<= 0x2;
					local20 = local20 * 512 + 256;
					local288 <<= 0x2;
					@Pc(1040) Class13_Sub1_Sub1_Sub3 local1040 = new Class13_Sub1_Sub1_Sub3(local46, Static170.anInt9508, Static170.anInt9508, local20, local24, local288, Static262.anInt5597 + local296, Static262.anInt5597 + local300, local304, local321, 0, local42, local292, local872, -1);
					local1040.method6403(local296 + Static262.anInt5597, Static504.method6917(local28, Static170.anInt9508, local36) - local292, local28, local36);
					Static378.aClass109_71.method2323(new Class2_Sub2_Sub20(local1040));
				}
			} else if (Static476.aClass168_11 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = (local12 >> 4 & 0x7) + Static258.anInt4069;
				local20 = Static307.anInt4957 + (local12 & 0x7);
				local24 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local46 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local288 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local292 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local16 >= 0 && local20 >= 0 && Static228.anInt3704 > local16 && Static162.anInt2911 > local20) {
					local296 = local36 + 1;
					if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] >= local16 - local296 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] <= local16 + local296 && local20 - local296 <= Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] <= local296 + local20) {
						Static185.method2705(local36 + (Static170.anInt9508 << 24) + (local16 << 16) + (local20 << 8), local46, local288, local42, local24, local292);
					}
				}
			} else if (arg0 == Static60.aClass168_2) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = Static258.anInt4069 + (local12 >> 4 & 0x7);
				local20 = (local12 & 0x7) + Static307.anInt4957;
				local24 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local36 = local28 >> 4 & 0xF;
				local42 = local28 & 0x7;
				local46 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local288 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local292 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (local16 >= 0 && local20 >= 0 && Static228.anInt3704 > local16 && local20 < Static162.anInt2911) {
					local296 = local36 + 1;
					if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] >= local16 - local296 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray307[0] <= local16 + local296 && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0] >= local20 - local296 && local296 + local20 >= Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anIntArray306[0]) {
						Static506.method6920(local24, local288, local42, (local20 << 8) + ((Static170.anInt9508 << 24) - (-(local16 << 16) - local36)), local292, local46);
					}
				}
			} else if (arg0 == Static137.aClass168_3) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = local12 >> 2;
				local20 = local12 & 0x3;
				local24 = Static588.anIntArray654[local16];
				local28 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local36 = Static258.anInt4069 + (local28 >> 4 & 0x7);
				local42 = (local28 & 0x7) + Static307.anInt4957;
				if (Static139.method2122(Static592.anInt9602) || local36 >= 0 && local42 >= 0 && local36 < Static228.anInt3704 && Static162.anInt2911 > local42) {
					Static634.method8474(Static170.anInt9508, -1, local36, local20, local24, local42, local16);
				}
			} else if (arg0 == Static368.aClass168_9) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8547();
				local16 = (local12 & 0x7) + Static307.anInt4957;
				local20 = Static123.anInt2176 + local16;
				local24 = (local12 >> 4 & 0x7) + Static258.anInt4069;
				local28 = Static132.anInt2246 + local24;
				local36 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local42 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local46 = Static53.aClass2_Sub22_Sub2_1.method8546();
				if (Static41.aClass118_6 != null) {
					@Pc(1474) Class2_Sub11 local1474 = (Class2_Sub11) Static41.aClass118_6.method2595((long) (Static170.anInt9508 << 28 | local20 << 14 | local28));
					if (local1474 != null) {
						for (@Pc(1482) Class2_Sub4 local1482 = (Class2_Sub4) local1474.aClass109_23.method2325(); local1482 != null; local1482 = (Class2_Sub4) local1474.aClass109_23.method2318()) {
							if (local1482.anInt69 == (local36 & 0x7FFF) && local42 == local1482.anInt71) {
								local1482.method8653();
								local1482.anInt71 = local46;
								Static491.method6843(Static170.anInt9508, local20, local28, local1482);
								break;
							}
						}
						if (local24 >= 0 && local16 >= 0 && local24 < Static228.anInt3704 && local16 < Static162.anInt2911) {
							Static185.method2704(local16, local24, Static170.anInt9508);
						}
					}
				}
			} else if (Static204.aClass168_6 == arg0) {
				local12 = Static53.aClass2_Sub22_Sub2_1.method8544();
				local16 = Static53.aClass2_Sub22_Sub2_1.method8545();
				local20 = (local16 & 0x7) + Static307.anInt4957;
				local24 = Static123.anInt2176 + local20;
				local28 = Static258.anInt4069 + (local16 >> 4 & 0x7);
				local36 = Static132.anInt2246 + local28;
				local42 = Static53.aClass2_Sub22_Sub2_1.method8546();
				local46 = Static53.aClass2_Sub22_Sub2_1.method8520();
				if (Static528.anInt8672 != local42) {
					@Pc(1622) boolean local1622 = local28 >= 0 && local20 >= 0 && local28 < Static228.anInt3704 && Static162.anInt2911 > local20;
					if (local1622 || Static139.method2122(Static592.anInt9602)) {
						Static491.method6843(Static170.anInt9508, local24, local36, new Class2_Sub4(local12, local46));
						if (local1622) {
							Static185.method2704(local20, local28, Static170.anInt9508);
						}
					}
				}
			} else {
				Static163.method2447(null, "T3 - " + arg0);
				Static211.method2746(false);
			}
		}
	}
}
