import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!of", name = "K", descriptor = "I")
	public static int anInt4299;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "Lclient!cj;")
	public static Class27 aClass27_26;

	@OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!of", name = "Ab", descriptor = "Lclient!th;")
	public static Class168 aClass168_144;

	@OriginalMember(owner = "client!of", name = "Hb", descriptor = "Lclient!th;")
	public static Class168 aClass168_145;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[S")
	public static short[] aShortArray82 = new short[256];

	@OriginalMember(owner = "client!of", name = "T", descriptor = "[I")
	public static int[] anIntArray379 = new int[100];

	@OriginalMember(owner = "client!of", name = "Gb", descriptor = "Ljava/lang/String;")
	public static String aString285 = " more options";

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)V")
	public static void method3141(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static253.aBoolean318) {
			Static253.aBoolean318 = arg0;
			Static131.method2254();
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	public static void method3154() {
		Static209.aClass89_31.method2273(5);
		Static185.aClass89_26.method2273(5);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3167(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) long local11 = (long) 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			local11 = (long) arg0.charAt(local13) + (local11 << 5) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(III)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static280.anInt5625 > 0) {
			Static257.method3964(Static280.anInt5625);
			Static280.anInt5625 = 0;
		}
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = arg0 * Static231.anInt4851;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 1; local32 < 255; local32++) {
			@Pc(52) int local52 = Static40.anIntArray125[local32] * (256 - local32) / 256;
			if (local52 < 0) {
				local52 = 0;
			}
			local24 += local52;
			@Pc(66) int local66;
			for (local66 = local52; local66 < 128; local66++) {
				@Pc(76) int local76 = Static231.anIntArray448[arg1 + local28++];
				@Pc(81) int local81 = Static188.anIntArray362[local24++];
				if (local81 == 0) {
					Static79.aClass1_Sub3_Sub13_Sub2_1.anIntArray504[local30++] = local76;
				} else {
					@Pc(98) int local98 = local81 + 18;
					if (local98 > 255) {
						local98 = 255;
					}
					@Pc(110) int local110 = 256 - local81 - 18;
					local81 = Static194.anIntArray370[local81];
					if (local110 > 255) {
						local110 = 255;
					}
					Static79.aClass1_Sub3_Sub13_Sub2_1.anIntArray504[local30++] = ((local81 & 0xFF00FF) * local98 + local110 * (local76 & 0xFF00FF) & 0xFF00FF00) + ((local76 & 0xFF00) * local110 + (local81 & 0xFF00) * local98 & 0xFF0000) >> 8;
				}
			}
			for (local66 = 0; local66 < local52; local66++) {
				Static79.aClass1_Sub3_Sub13_Sub2_1.anIntArray504[local30++] = Static231.anIntArray448[arg1 + local28++];
			}
			local28 += Static231.anInt4851 - 128;
		}
		if (Static294.aBoolean367) {
			Static156.method2529(Static79.aClass1_Sub3_Sub13_Sub2_1.anIntArray504, arg1, arg0, Static79.aClass1_Sub3_Sub13_Sub2_1.anInt5571, Static79.aClass1_Sub3_Sub13_Sub2_1.anInt5573);
		} else {
			Static79.aClass1_Sub3_Sub13_Sub2_1.method4210(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(II)Lclient!rb;")
	public static Class145 method3172(@OriginalArg(1) int arg0) {
		@Pc(10) Class145 local10 = (Class145) Static174.aClass89_44.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static264.aClass168_179.method4058(Static54.method1021(arg0), Static297.method4541(arg0));
		local10 = new Class145();
		local10.anInt4945 = arg0;
		if (local26 != null) {
			local10.method3717(new Class1_Sub14(local26));
		}
		local10.method3713();
		Static174.aClass89_44.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!jh;IIB)V")
	public static void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == Static56.aClass2_Sub4_Sub2_1 || Static181.anInt3973 >= 400) {
			return;
		}
		@Pc(138) String local138;
		if (arg1.anInt2876 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static56.aClass2_Sub4_Sub2_1.anInt2884 != -1 && arg1.anInt2884 != -1) {
				@Pc(45) int local45 = arg1.anInt2867 >= Static56.aClass2_Sub4_Sub2_1.anInt2867 ? arg1.anInt2867 : Static56.aClass2_Sub4_Sub2_1.anInt2867;
				@Pc(56) int local56 = Static56.aClass2_Sub4_Sub2_1.anInt2884 >= arg1.anInt2884 ? arg1.anInt2884 : Static56.aClass2_Sub4_Sub2_1.anInt2884;
				@Pc(67) int local67 = local56 + local45 * 10 / 100 + 5;
				@Pc(73) int local73 = Static56.aClass2_Sub4_Sub2_1.anInt2867 - arg1.anInt2867;
				if (local73 < 0) {
					local73 = -local73;
				}
				if (local67 < local73) {
					local23 = false;
				}
			}
			@Pc(95) String local95 = Static208.anInt4489 == 1 ? Static101.aString14 : Static220.aString328;
			if (arg1.anInt2874 > arg1.anInt2867) {
				local138 = arg1.method2104(true) + (local23 ? Static134.method2281(Static56.aClass2_Sub4_Sub2_1.anInt2867, arg1.anInt2867) : "<col=ffffff>") + " (" + local95 + arg1.anInt2867 + "+" + (arg1.anInt2874 - arg1.anInt2867) + ")";
			} else {
				local138 = arg1.method2104(true) + (local23 ? Static134.method2281(Static56.aClass2_Sub4_Sub2_1.anInt2867, arg1.anInt2867) : "<col=ffffff>") + " (" + local95 + arg1.anInt2867 + ")";
			}
		} else {
			local138 = arg1.method2104(true) + " (" + Static155.aString211 + arg1.anInt2876 + ")";
		}
		@Pc(225) int local225;
		if (Static24.anInt662 == 1) {
			Static12.method2960(arg0, Static7.anInt211, (long) arg2, Static311.aString444 + " -> <col=ffffff>" + local138, arg3, Static163.aString216, (short) 46);
		} else if (!Static230.aBoolean185) {
			for (local225 = 7; local225 >= 0; local225--) {
				if (Static290.aStringArray45[local225] != null) {
					@Pc(242) short local242 = 0;
					if (Static208.anInt4489 == 0 && Static290.aStringArray45[local225].equalsIgnoreCase(Static145.aString432)) {
						if (arg1.anInt2867 > Static56.aClass2_Sub4_Sub2_1.anInt2867) {
							local242 = 2000;
						}
						if (Static56.aClass2_Sub4_Sub2_1.anInt2857 != 0 && arg1.anInt2857 != 0) {
							if (Static56.aClass2_Sub4_Sub2_1.anInt2857 == arg1.anInt2857) {
								local242 = 2000;
							} else {
								local242 = 0;
							}
						}
					} else if (Static241.aBooleanArray24[local225]) {
						local242 = 2000;
					}
					@Pc(298) short local298 = Static309.aShortArray101[local225];
					@Pc(303) short local303 = (short) (local298 + local242);
					Static12.method2960(arg0, Static129.anIntArray280[local225], (long) arg2, "<col=ffffff>" + local138, arg3, Static290.aStringArray45[local225], local303);
				}
			}
		} else if ((Static56.anInt1257 & 0x8) != 0) {
			Static12.method2960(arg0, Static181.anInt3978, (long) arg2, Static303.aString426 + " -> <col=ffffff>" + local138, arg3, Static244.aString290, (short) 12);
		}
		for (local225 = 0; local225 < Static181.anInt3973; local225++) {
			if (Static86.aShortArray64[local225] == 48) {
				Static190.aStringArray34[local225] = "<col=ffffff>" + local138;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!th;Lclient!th;)V")
	public static void method3178(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static288.aClass168_197 = arg0;
		Static245.aClass168_166 = arg1;
		Static162.anInt3543 = Static288.aClass168_197.method4068(3);
	}
}
