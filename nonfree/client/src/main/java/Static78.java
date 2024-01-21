import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array3;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
	public static int anInt434;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
	private static boolean aBoolean29;

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "Lclient!ad;")
	private static Class4 aClass4_228 = Static75.method1216("white:");

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_220 = aClass4_228;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt420 = 0;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_221 = Static75.method1216("b12_full");

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "Lclient!ad;")
	private static Class4 aClass4_227 = Static75.method1216("Please try using a different world)3");

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_222 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_223 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_224 = Static75.method1216("Handel)4Duell");

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_225 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
	public static int anInt438 = 0;

	@OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
	public static int anInt441 = 0;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "Lclient!ad;")
	public static Class4 aClass4_226 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "Lclient!ad;")
	public static Class4 aClass4_229 = Static75.method1216("m");

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "Lclient!ad;")
	public static Class4 aClass4_230 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "Lclient!ad;")
	public static Class4 aClass4_231 = Static75.method1216("Handel akzeptieren");

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_232 = aClass4_227;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	public static int anInt454 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!rc;I)V")
	public static void method267(@OriginalArg(0) Class3_Sub1_Sub14 arg0) {
		@Pc(13) int local13 = arg0.anInt2087;
		@Pc(91) int local91;
		if (local13 >= 1 && local13 <= 100 || local13 >= 701 && local13 <= 800) {
			if (local13 == 1 && Static56.anInt1397 == 0) {
				arg0.anInt2112 = 0;
				arg0.aClass4_1186 = Static79.aClass4_1057;
			} else if (local13 == 1 && Static56.anInt1397 == 1) {
				arg0.aClass4_1186 = Static100.aClass4_1345;
				arg0.anInt2112 = 0;
			} else if (local13 == 2 && Static56.anInt1397 != 2) {
				arg0.aClass4_1186 = Static69.aClass4_1268;
				arg0.anInt2112 = 0;
			} else {
				if (local13 > 700) {
					local13 -= 601;
				} else {
					local13--;
				}
				local91 = Static87.anInt1451;
				if (Static56.anInt1397 != 2) {
					local91 = 0;
				}
				if (local13 >= local91) {
					arg0.aClass4_1186 = Static113.aClass4_1604;
					arg0.anInt2112 = 0;
				} else {
					arg0.aClass4_1186 = Static21.aClass4Array2[local13];
					arg0.anInt2112 = 1;
				}
			}
		} else if (local13 >= 101 && local13 <= 200 || local13 >= 801 && local13 <= 900) {
			if (local13 > 800) {
				local13 -= 701;
			} else {
				local13 -= 101;
			}
			local91 = Static87.anInt1451;
			if (Static56.anInt1397 != 2) {
				local91 = 0;
			}
			if (local13 >= local91) {
				arg0.aClass4_1186 = Static113.aClass4_1604;
				arg0.anInt2112 = 0;
			} else {
				if (Static36.anIntArray101[local13] == 0) {
					arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static104.aClass4_1405, Static87.aClass4_747 });
				} else if (Static36.anIntArray101[local13] < 5000) {
					if (Static5.anInt255 == Static36.anIntArray101[local13]) {
						arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static34.aClass4_522, Static103.aClass4_1397, Static93.method1632(Static36.anIntArray101[local13]) });
					} else {
						arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static65.aClass4_832, Static103.aClass4_1397, Static93.method1632(Static36.anIntArray101[local13]) });
					}
				} else if (Static5.anInt255 == Static36.anIntArray101[local13]) {
					arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static34.aClass4_522, Static53.aClass4_1362, Static93.method1632(Static36.anIntArray101[local13] - 5000) });
				} else {
					arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static65.aClass4_832, Static53.aClass4_1362, Static93.method1632(Static36.anIntArray101[local13] - 5000) });
				}
				arg0.anInt2112 = 1;
			}
		} else if (local13 == 203) {
			local91 = Static87.anInt1451;
			if (Static56.anInt1397 != 2) {
				local91 = 0;
			}
			arg0.anInt2078 = local91 * 15 + 20;
			if (arg0.anInt2117 >= arg0.anInt2078) {
				arg0.anInt2078 = arg0.anInt2117 + 1;
			}
		} else if (local13 >= 401 && local13 <= 500) {
			local13 -= 401;
			if (local13 == 0 && Static56.anInt1397 == 0) {
				arg0.aClass4_1186 = Static107.aClass4_1495;
				arg0.anInt2112 = 0;
			} else if (local13 == 1 && Static56.anInt1397 == 0) {
				arg0.aClass4_1186 = Static69.aClass4_1268;
				arg0.anInt2112 = 0;
			} else {
				local91 = Static28.anInt869;
				if (Static56.anInt1397 == 0) {
					local91 = 0;
				}
				if (local13 >= local91) {
					arg0.anInt2112 = 0;
					arg0.aClass4_1186 = Static113.aClass4_1604;
				} else {
					arg0.aClass4_1186 = Static96.method1165(Static13.aLongArray6[local13]).method130();
					arg0.anInt2112 = 1;
				}
			}
		} else if (local13 == 503) {
			arg0.anInt2078 = Static28.anInt869 * 15 + 20;
			if (arg0.anInt2078 <= arg0.anInt2117) {
				arg0.anInt2078 = arg0.anInt2117 + 1;
			}
		} else if (local13 == 324) {
			if (Static55.anInt1392 == -1) {
				Static81.anInt1896 = arg0.anInt2105;
				Static55.anInt1392 = arg0.anInt2080;
			}
			if (Static30.aClass41_1.aBoolean91) {
				arg0.anInt2080 = Static55.anInt1392;
			} else {
				arg0.anInt2080 = Static81.anInt1896;
			}
		} else if (local13 == 325) {
			if (Static55.anInt1392 == -1) {
				Static55.anInt1392 = arg0.anInt2080;
				Static81.anInt1896 = arg0.anInt2105;
			}
			if (Static30.aClass41_1.aBoolean91) {
				arg0.anInt2080 = Static81.anInt1896;
			} else {
				arg0.anInt2080 = Static55.anInt1392;
			}
		} else if (local13 == 327) {
			arg0.anInt2123 = 150;
			arg0.anInt2124 = (int) (Math.sin((double) Static60.anInt1489 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2102 = 5;
			arg0.anInt2110 = 0;
		} else if (local13 == 328) {
			arg0.anInt2123 = 150;
			arg0.anInt2124 = (int) (Math.sin((double) Static60.anInt1489 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2102 = 5;
			arg0.anInt2110 = 1;
		} else if (local13 == 600) {
			arg0.aClass4_1186 = Static60.method1012(new Class4[] { Static113.aClass4_1602, Static107.aClass4_1496 });
		} else if (local13 == 620) {
			if (Static67.anInt1652 < 1) {
				arg0.aClass4_1186 = Static113.aClass4_1604;
			} else if (Static70.aBoolean130) {
				arg0.anInt2131 = 16711680;
				arg0.aClass4_1186 = Static111.aClass4_1561;
			} else {
				arg0.aClass4_1186 = Static47.aClass4_599;
				arg0.anInt2131 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
	public static void method269() {
		aClass4_226 = null;
		aClass4_223 = null;
		aClass4_227 = null;
		aClass4_228 = null;
		aClass3_Sub1_Sub4_Sub2Array3 = null;
		aClass4_221 = null;
		aClass4_224 = null;
		aClass4_231 = null;
		aClass4_232 = null;
		aClass4_222 = null;
		aClass4_230 = null;
		aClass4_229 = null;
		aClass4_220 = null;
		aClass4_225 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[B)Lclient!ad;")
	public static Class4 method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class4 local9 = new Class4();
		local9.anInt238 = 0;
		local9.aByteArray1 = new byte[arg1];
		for (@Pc(18) int local18 = arg0; local18 < arg1 + arg0; local18++) {
			if (arg2[local18] != 0) {
				local9.aByteArray1[local9.anInt238++] = arg2[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)V")
	public static void method275() {
		Static32.aClass3_Sub4_Sub1_2.method468();
		@Pc(11) int local11 = Static32.aClass3_Sub4_Sub1_2.method462(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static32.aClass3_Sub4_Sub1_2.method462(2);
		if (local19 == 0) {
			Static12.anIntArray13[Static95.anInt2230++] = 2047;
			return;
		}
		@Pc(46) int local46;
		@Pc(56) int local56;
		if (local19 == 1) {
			local46 = Static32.aClass3_Sub4_Sub1_2.method462(3);
			Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1551(false, local46);
			local56 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			if (local56 == 1) {
				Static12.anIntArray13[Static95.anInt2230++] = 2047;
			}
			return;
		}
		@Pc(96) int local96;
		if (local19 == 2) {
			local46 = Static32.aClass3_Sub4_Sub1_2.method462(3);
			Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1551(true, local46);
			local56 = Static32.aClass3_Sub4_Sub1_2.method462(3);
			Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1551(true, local56);
			local96 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			if (local96 == 1) {
				Static12.anIntArray13[Static95.anInt2230++] = 2047;
			}
		} else if (local19 == 3) {
			local46 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			if (local46 == 1) {
				Static12.anIntArray13[Static95.anInt2230++] = 2047;
			}
			Static49.anInt1203 = Static32.aClass3_Sub4_Sub1_2.method462(2);
			local56 = Static32.aClass3_Sub4_Sub1_2.method462(1);
			local96 = Static32.aClass3_Sub4_Sub1_2.method462(7);
			@Pc(151) int local151 = Static32.aClass3_Sub4_Sub1_2.method462(7);
			Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1553(local96, local56 == 1, local151);
		}
	}
}
