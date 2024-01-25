import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_63 = new Class211(80, -1);

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static final int[] anIntArray200 = new int[1000];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static260.method3501(arg8)) {
			return;
		}
		if (Static388.aClass16ArrayArray4[arg8] == null) {
			Static55.method813(Static151.aClass16ArrayArray1[arg8], -1, arg4, arg7, arg0, arg1, arg5, arg2, arg6, arg3);
		} else {
			Static55.method813(Static388.aClass16ArrayArray4[arg8], -1, arg4, arg7, arg0, arg1, arg5, arg2, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2135(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static460.anInt7074 = 7;
		Static67.anInt1221 = 0x1 << Static460.anInt7074;
		Static179.anInt3078 = Static67.anInt1221 >> 1;
		Static86.anInt6940 = (int) Math.sqrt((double) (Static179.anInt3078 * Static179.anInt3078 + Static179.anInt3078 * Static179.anInt3078));
		Static252.anInt4056 = Static67.anInt1221 >> 2;
		Static264.anInt4297 = Static67.anInt1221;
		Static169.anInt2876 = arg0;
		Static316.anInt5459 = arg1;
		Static453.anInt7270 = arg2;
		Static192.aClass270ArrayArrayArray2 = new Class270[4][Static169.anInt2876][Static316.anInt5459];
		Static314.aClass162Array2 = new Class162[4];
		if (arg3) {
			Static329.anIntArrayArray42 = new int[Static169.anInt2876][Static316.anInt5459];
			Static94.aByteArrayArray60 = new byte[Static169.anInt2876][Static316.anInt5459];
			Static116.aShortArrayArray2 = new short[Static169.anInt2876][Static316.anInt5459];
			Static65.aClass270ArrayArrayArray1 = new Class270[1][Static169.anInt2876][Static316.anInt5459];
			Static109.aClass162Array1 = new Class162[1];
		} else {
			Static329.anIntArrayArray42 = null;
			Static94.aByteArrayArray60 = null;
			Static116.aShortArrayArray2 = null;
			Static65.aClass270ArrayArrayArray1 = null;
			Static109.aClass162Array1 = null;
		}
		if (arg4) {
			Static174.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static210.aClass250Array1 = new Class250[65535];
			Static40.aBooleanArray3 = new boolean[65535];
			Static312.anInt5377 = 0;
		} else {
			Static174.aLongArrayArrayArray1 = null;
			Static210.aClass250Array1 = null;
			Static40.aBooleanArray3 = null;
			Static312.anInt5377 = 0;
		}
		Static56.method816(false);
		Static328.aClass22Array2 = new Class22[1000];
		Static10.anInt151 = 0;
		Static29.aClass22Array1 = new Class22[1000];
		Static376.anInt6257 = 0;
		Static332.anIntArrayArrayArray12 = new int[4][Static169.anInt2876 + 1][Static316.anInt5459 + 1];
		Static117.aClass3_Sub4Array3 = new Class3_Sub4[5000];
		Static289.anInt4758 = 0;
		Static356.aBooleanArrayArray6 = new boolean[Static453.anInt7270 + Static453.anInt7270 + 1][Static453.anInt7270 + Static453.anInt7270 + 1];
		Static19.aBooleanArrayArray1 = new boolean[Static453.anInt7270 + Static453.anInt7270 + 2][Static453.anInt7270 + Static453.anInt7270 + 2];
		Static460.aClass45_4 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBII)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub35 local6 = (Class2_Sub35) Static111.aClass156_12.method3155(); local6 != null; local6 = (Class2_Sub35) Static111.aClass156_12.method3150()) {
			Static81.method1177(arg3, arg0, arg1, local6, arg2);
		}
		for (@Pc(33) Class2_Sub35 local33 = (Class2_Sub35) Static289.aClass156_36.method3155(); local33 != null; local33 = (Class2_Sub35) Static289.aClass156_36.method3150()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) Class173 local42 = local33.aClass3_Sub4_Sub1_Sub1_2.method4001();
			if (local33.aClass3_Sub4_Sub1_Sub1_2.aBoolean353) {
				local37 = 0;
			} else if (local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 == local42.anInt4463 || local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 == local42.anInt4485 || local42.anInt4459 == local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 || local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 == local42.anInt4460) {
				local37 = 2;
			} else if (local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 == local42.anInt4488 || local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 == local42.anInt4472 || local42.anInt4476 == local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922 || local42.anInt4454 == local33.aClass3_Sub4_Sub1_Sub1_2.anInt4922) {
				local37 = 3;
			}
			if (local33.anInt4564 != local37) {
				@Pc(129) int local129 = Static397.method5062(local33.aClass3_Sub4_Sub1_Sub1_2);
				if (local33.anInt4551 != local129) {
					if (local33.aClass2_Sub1_Sub3_3 != null) {
						Static421.aClass2_Sub1_Sub4_2.method3237(local33.aClass2_Sub1_Sub3_3);
						local33.aClass2_Sub1_Sub3_3 = null;
					}
					local33.anInt4551 = local129;
				}
				local33.anInt4564 = local37;
			}
			local33.anInt4556 = local33.aClass3_Sub4_Sub1_Sub1_2.anInt6833;
			local33.anInt4563 = local33.aClass3_Sub4_Sub1_Sub1_2.anInt6833 + (local33.aClass3_Sub4_Sub1_Sub1_2.method4009() << 6);
			local33.anInt4565 = local33.aClass3_Sub4_Sub1_Sub1_2.anInt6835;
			local33.anInt4553 = local33.aClass3_Sub4_Sub1_Sub1_2.anInt6835 + (local33.aClass3_Sub4_Sub1_Sub1_2.method4009() << 6);
			Static81.method1177(arg3, arg0, arg1, local33, arg2);
		}
		for (@Pc(204) Class2_Sub35 local204 = (Class2_Sub35) Static427.aClass72_47.method1655(); local204 != null; local204 = (Class2_Sub35) Static427.aClass72_47.method1649()) {
			@Pc(213) byte local213 = 1;
			@Pc(218) Class173 local218 = local204.aClass3_Sub4_Sub1_Sub2_2.method4001();
			if (local204.aClass3_Sub4_Sub1_Sub2_2.aBoolean353) {
				local213 = 0;
			} else if (local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 == local218.anInt4463 || local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 == local218.anInt4485 || local218.anInt4459 == local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 || local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 == local218.anInt4460) {
				local213 = 2;
			} else if (local218.anInt4488 == local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 || local218.anInt4472 == local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 || local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 == local218.anInt4476 || local204.aClass3_Sub4_Sub1_Sub2_2.anInt4922 == local218.anInt4454) {
				local213 = 3;
			}
			if (local213 != local204.anInt4564) {
				@Pc(313) int local313 = Static351.method4669(local204.aClass3_Sub4_Sub1_Sub2_2);
				if (local204.anInt4551 != local313) {
					if (local204.aClass2_Sub1_Sub3_3 != null) {
						Static421.aClass2_Sub1_Sub4_2.method3237(local204.aClass2_Sub1_Sub3_3);
						local204.aClass2_Sub1_Sub3_3 = null;
					}
					local204.anInt4551 = local313;
				}
				local204.anInt4564 = local213;
			}
			local204.anInt4556 = local204.aClass3_Sub4_Sub1_Sub2_2.anInt6833;
			local204.anInt4563 = local204.aClass3_Sub4_Sub1_Sub2_2.anInt6833 + (local204.aClass3_Sub4_Sub1_Sub2_2.method4009() << 6);
			local204.anInt4565 = local204.aClass3_Sub4_Sub1_Sub2_2.anInt6835;
			local204.anInt4553 = local204.aClass3_Sub4_Sub1_Sub2_2.anInt6835 + (local204.aClass3_Sub4_Sub1_Sub2_2.method4009() << 6);
			Static81.method1177(arg3, arg0, arg1, local204, arg2);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method2137() {
		if (Static2.aClass148_Sub1_1.method3051(Static288.anInt4743) != 2) {
			return;
		}
		@Pc(26) byte local26 = (byte) (Static197.anInt3347 - 4 & 0xFF);
		@Pc(30) int local30 = Static197.anInt3347 % Static166.anInt2852;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static426.anInt6923; local36++) {
				Static111.aByteArrayArrayArray1[local32][local30][local36] = local26;
			}
		}
		if (Static61.anInt1129 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static90.anIntArray136[local36] = -1000000;
			Static81.anIntArray127[local36] = 1000000;
			Static120.anIntArray171[local36] = 0;
			Static319.anIntArray480[local36] = 1000000;
			Static449.anIntArray635[local36] = 0;
		}
		@Pc(132) int local132;
		if (Static414.anInt6776 != 1) {
			local132 = Static302.method3973(Static143.anInt2544, Static174.anInt3028, Static61.anInt1129);
			if (local132 - Static40.anInt771 >= 800 || (Static253.aByteArrayArrayArray11[Static61.anInt1129][Static174.anInt3028 >> 7][Static143.anInt2544 >> 7] & 0x4) == 0) {
				return;
			}
			Static64.method959(false, Static143.anInt2544 >> 7, 1, Static174.anInt3028 >> 7, Static309.aClass270ArrayArrayArray3);
			return;
		}
		if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7][Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7] & 0x4) != 0) {
			Static64.method959(false, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7, 0, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7, Static309.aClass270ArrayArrayArray3);
		}
		if (Static235.anInt3805 >= 2560) {
			return;
		}
		local132 = Static174.anInt3028 >> 7;
		@Pc(136) int local136 = Static143.anInt2544 >> 7;
		@Pc(141) int local141 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7;
		@Pc(146) int local146 = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7;
		@Pc(154) int local154;
		if (local132 >= local141) {
			local154 = local132 - local141;
		} else {
			local154 = local141 - local132;
		}
		@Pc(169) int local169;
		if (local146 > local136) {
			local169 = local146 - local136;
		} else {
			local169 = local136 - local146;
		}
		if ((local154 != 0 || local169 != 0) && -Static166.anInt2852 < local154 && Static166.anInt2852 > local154 && -Static426.anInt6923 < local169 && local169 < Static426.anInt6923) {
			@Pc(247) int local247;
			@Pc(249) int local249;
			if (local154 <= local169) {
				local247 = local154 * 65536 / local169;
				local249 = 32768;
				while (local146 != local136) {
					if (local146 > local136) {
						local136++;
					} else if (local136 > local146) {
						local136--;
					}
					if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][local132][local136] & 0x4) != 0) {
						Static64.method959(false, local136, 1, local132, Static309.aClass270ArrayArrayArray3);
						return;
					}
					local249 += local247;
					if (local249 >= 65536) {
						local249 -= 65536;
						if (local141 > local132) {
							local132++;
						} else if (local141 < local132) {
							local132--;
						}
						if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][local132][local136] & 0x4) != 0) {
							Static64.method959(false, local136, 1, local132, Static309.aClass270ArrayArrayArray3);
							return;
						}
					}
				}
				return;
			}
			local247 = local169 * 65536 / local154;
			local249 = 32768;
			while (local141 != local132) {
				if (local141 > local132) {
					local132++;
				} else if (local132 > local141) {
					local132--;
				}
				if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][local132][local136] & 0x4) != 0) {
					Static64.method959(false, local136, 1, local132, Static309.aClass270ArrayArrayArray3);
					return;
				}
				local249 += local247;
				if (local249 >= 65536) {
					if (local136 < local146) {
						local136++;
					} else if (local136 > local146) {
						local136--;
					}
					local249 -= 65536;
					if ((Static253.aByteArrayArrayArray11[Static61.anInt1129][local132][local136] & 0x4) != 0) {
						Static64.method959(false, local136, 1, local132, Static309.aClass270ArrayArrayArray3);
						return;
					}
				}
			}
			return;
		}
		Static434.method5460(null, "RC: " + local132 + "," + local136 + " " + local141 + "," + local146 + " " + Static275.anInt4506 + "," + Static209.anInt3497);
		return;
	}
}
