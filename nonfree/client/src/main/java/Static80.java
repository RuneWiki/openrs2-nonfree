import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qa", name = "xd", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!qa", name = "Md", descriptor = "Z")
	public static boolean aBoolean106;

	@OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
	public static int anInt2234 = 0;

	@OriginalMember(owner = "client!qa", name = "vd", descriptor = "[Lclient!pb;")
	public static Class46[] aClass46Array1 = new Class46[14];

	@OriginalMember(owner = "client!qa", name = "Ad", descriptor = "Lclient!ba;")
	public static Class5 aClass5_47 = new Class5(50);

	@OriginalMember(owner = "client!qa", name = "Ed", descriptor = "I")
	public static int anInt2258 = 99;

	@OriginalMember(owner = "client!qa", name = "Gd", descriptor = "I")
	public static int anInt2260 = 0;

	@OriginalMember(owner = "client!qa", name = "Hd", descriptor = "[I")
	public static int[] anIntArray269 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qa", name = "Id", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1261 = Static15.method178("Loaded fonts");

	@OriginalMember(owner = "client!qa", name = "Kd", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1263 = Static15.method178("Password: ");

	@OriginalMember(owner = "client!qa", name = "Jd", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1262 = aClass23_1263;

	@OriginalMember(owner = "client!qa", name = "Ld", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!qa", name = "Nd", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1264 = aClass23_1261;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ee;Z)Lclient!ee;")
	public static Class1_Sub1_Sub7 method1396(@OriginalArg(0) Class1_Sub1_Sub7 arg0) {
		@Pc(10) int local10;
		if (arg0.anInt826 >= 0) {
			local10 = arg0.anInt826 >> 16;
		} else {
			local10 = arg0.anInt833 >> 16;
		}
		if (!Static77.method1346(local10)) {
			return null;
		} else if (arg0.anInt850 < 0) {
			@Pc(48) Class1_Sub1_Sub7 local48 = Static105.aClass1_Sub1_Sub7ArrayArray1[local10][arg0.anInt850 >> 15 & 0xFFFF];
			return local48 == null || local48.aClass1_Sub1_Sub7Array1 == null || (arg0.anInt850 & 0x7FFF) >= local48.aClass1_Sub1_Sub7Array1.length ? null : local48.aClass1_Sub1_Sub7Array1[arg0.anInt850 & 0x7FFF];
		} else {
			return Static105.aClass1_Sub1_Sub7ArrayArray1[local10][arg0.anInt850 & 0xFFFF];
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!fa;)V")
	public static void method1397(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.anInt2184 = arg0.anInt2225;
		if (arg0.anInt2195 == 0) {
			arg0.anInt2175 = 0;
			return;
		}
		if (arg0.anInt2213 != -1 && arg0.anInt2205 == 0) {
			@Pc(40) Class1_Sub1_Sub8 local40 = Static18.method249(arg0.anInt2213);
			if (arg0.anInt2177 > 0 && local40.anInt1068 == 0) {
				arg0.anInt2175++;
				return;
			}
			if (arg0.anInt2177 <= 0 && local40.anInt1085 == 0) {
				arg0.anInt2175++;
				return;
			}
		}
		@Pc(84) int local84 = arg0.anInt2197 * 64 + arg0.anIntArray266[arg0.anInt2195 - 1] * 128;
		@Pc(99) int local99 = arg0.anInt2197 * 64 + arg0.anIntArray264[arg0.anInt2195 - 1] * 128;
		@Pc(102) int local102 = arg0.anInt2196;
		@Pc(105) int local105 = arg0.anInt2232;
		if (local99 - local102 > 256 || local99 - local102 < -256 || local84 - local105 > 256 || local84 - local105 < -256) {
			arg0.anInt2232 = local84;
			arg0.anInt2196 = local99;
			return;
		}
		if (local99 > local102) {
			if (local105 < local84) {
				arg0.anInt2187 = 1280;
			} else if (local105 <= local84) {
				arg0.anInt2187 = 1536;
			} else {
				arg0.anInt2187 = 1792;
			}
		} else if (local102 <= local99) {
			if (local105 < local84) {
				arg0.anInt2187 = 1024;
			} else if (local105 > local84) {
				arg0.anInt2187 = 0;
			}
		} else if (local84 > local105) {
			arg0.anInt2187 = 768;
		} else if (local105 > local84) {
			arg0.anInt2187 = 256;
		} else {
			arg0.anInt2187 = 512;
		}
		@Pc(233) int local233 = arg0.anInt2187 - arg0.anInt2223 & 0x7FF;
		@Pc(236) int local236 = arg0.anInt2214;
		@Pc(238) int local238 = 4;
		if (arg0.anInt2187 != arg0.anInt2223 && arg0.anInt2174 == -1 && arg0.anInt2231 != 0) {
			local238 = 2;
		}
		if (local233 > 1024) {
			local233 -= 2048;
		}
		if (arg0.anInt2195 > 2) {
			local238 = 6;
		}
		if (arg0.anInt2195 > 3) {
			local238 = 8;
		}
		if (local233 >= -256 && local233 <= 256) {
			local236 = arg0.anInt2208;
		} else if (local233 >= 256 && local233 < 768) {
			local236 = arg0.anInt2190;
		} else if (local233 >= -768 && local233 <= -256) {
			local236 = arg0.anInt2199;
		}
		if (arg0.anInt2175 > 0 && arg0.anInt2195 > 1) {
			arg0.anInt2175--;
			local238 = 8;
		}
		if (local236 == -1) {
			local236 = arg0.anInt2208;
		}
		arg0.anInt2184 = local236;
		if (arg0.aBooleanArray7[arg0.anInt2195 - 1]) {
			local238 <<= 0x1;
		}
		if (local105 < local84) {
			arg0.anInt2232 += local238;
			if (local84 < arg0.anInt2232) {
				arg0.anInt2232 = local84;
			}
		} else if (local84 < local105) {
			arg0.anInt2232 -= local238;
			if (arg0.anInt2232 < local84) {
				arg0.anInt2232 = local84;
			}
		}
		if (local102 < local99) {
			arg0.anInt2196 += local238;
			if (arg0.anInt2196 > local99) {
				arg0.anInt2196 = local99;
			}
		} else if (local102 > local99) {
			arg0.anInt2196 -= local238;
			if (local99 > arg0.anInt2196) {
				arg0.anInt2196 = local99;
			}
		}
		if (arg0.anInt2196 == local99 && local84 == arg0.anInt2232) {
			arg0.anInt2195--;
			if (arg0.anInt2177 > 0) {
				arg0.anInt2177--;
			}
		}
		if (local238 >= 8 && arg0.anInt2208 == arg0.anInt2184 && arg0.anInt2207 != -1) {
			arg0.anInt2184 = arg0.anInt2207;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public static void method1398() {
		anIntArray268 = null;
		aClass23_1264 = null;
		aClass23_1262 = null;
		aClass5_47 = null;
		aClass23_1261 = null;
		anIntArray269 = null;
		aClass23_1263 = null;
		aClass46Array1 = null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
	public static void method1399(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static26.aBooleanArray4[arg0]) {
			return;
		}
		Static12.aClass55_38.method1887(arg0);
		if (Static105.aClass1_Sub1_Sub7ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < Static105.aClass1_Sub1_Sub7ArrayArray1[arg0].length; local30++) {
			if (Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local30] != null) {
				if (Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local30].anInt802 == 2) {
					local28 = false;
				} else {
					Static105.aClass1_Sub1_Sub7ArrayArray1[arg0][local30] = null;
				}
			}
		}
		if (local28) {
			Static105.aClass1_Sub1_Sub7ArrayArray1[arg0] = null;
		}
		Static26.aBooleanArray4[arg0] = false;
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(I)I")
	public static int method1400() {
		return 5;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ra;BZ)Z")
	public static boolean method1401(@OriginalArg(0) Class54 arg0, @OriginalArg(2) boolean arg1) {
		Static11.anInt219 = 20;
		try {
			Static97.aClass11_1 = (Class11) Class.forName("Class11_Sub2_Sub2").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(21) Throwable local21) {
			@Pc(25) Interface1 local25 = arg0.method1494();
			if (local25 != null) {
				Static97.aClass11_1 = new Class11_Sub2_Sub1(arg0, local25);
				return true;
			} else if (arg1) {
				Static97.aClass11_1 = new Class11_Sub1(arg0);
				return true;
			} else {
				return false;
			}
		}
	}
}
