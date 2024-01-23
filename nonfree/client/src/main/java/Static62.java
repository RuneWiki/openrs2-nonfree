import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
	public static int anInt1230;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Lclient!hh;")
	private static Class50 aClass50_443 = Static186.method3527("wishes to trade with you)3");

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	public static int anInt1226 = -2;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_444 = Static186.method3527("::fpsoff");

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_445 = aClass50_443;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BZ)V")
	public static void method939(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub17 local10 = new Class1_Sub17(arg0);
		local10.anInt2656 = arg0.length - 2;
		Static70.anInt1320 = local10.method2178();
		Static165.aBooleanArray12 = new boolean[Static70.anInt1320];
		Static228.anIntArray507 = new int[Static70.anInt1320];
		Static37.aByteArrayArray2 = new byte[Static70.anInt1320][];
		Static8.anIntArray20 = new int[Static70.anInt1320];
		Static191.aByteArrayArray11 = new byte[Static70.anInt1320][];
		Static101.anIntArray191 = new int[Static70.anInt1320];
		Static169.anIntArray370 = new int[Static70.anInt1320];
		local10.anInt2656 = arg0.length - Static70.anInt1320 * 8 - 7;
		Static204.anInt4108 = local10.method2178();
		Static146.anInt3070 = local10.method2178();
		@Pc(68) int local68 = (local10.method2142() & 0xFF) + 1;
		for (@Pc(70) int local70 = 0; local70 < Static70.anInt1320; local70++) {
			Static169.anIntArray370[local70] = local10.method2178();
		}
		for (@Pc(84) int local84 = 0; local84 < Static70.anInt1320; local84++) {
			Static228.anIntArray507[local84] = local10.method2178();
		}
		for (@Pc(98) int local98 = 0; local98 < Static70.anInt1320; local98++) {
			Static8.anIntArray20[local98] = local10.method2178();
		}
		for (@Pc(116) int local116 = 0; local116 < Static70.anInt1320; local116++) {
			Static101.anIntArray191[local116] = local10.method2178();
		}
		local10.anInt2656 = arg0.length - (local68 - 1) * 3 - Static70.anInt1320 * 8 - 7;
		Static78.anIntArray127 = new int[local68];
		for (@Pc(151) int local151 = 1; local151 < local68; local151++) {
			Static78.anIntArray127[local151] = local10.method2135();
			if (Static78.anIntArray127[local151] == 0) {
				Static78.anIntArray127[local151] = 1;
			}
		}
		local10.anInt2656 = 0;
		for (@Pc(180) int local180 = 0; local180 < Static70.anInt1320; local180++) {
			@Pc(186) int local186 = Static8.anIntArray20[local180];
			@Pc(188) boolean local188 = false;
			@Pc(192) int local192 = Static101.anIntArray191[local180];
			@Pc(196) int local196 = local192 * local186;
			@Pc(199) byte[] local199 = new byte[local196];
			Static191.aByteArrayArray11[local180] = local199;
			@Pc(206) byte[] local206 = new byte[local196];
			Static37.aByteArrayArray2[local180] = local206;
			@Pc(214) int local214 = local10.method2142();
			@Pc(220) int local220;
			@Pc(224) int local224;
			if ((local214 & 0x1) == 0) {
				for (local220 = 0; local220 < local196; local220++) {
					local199[local220] = local10.method2155();
				}
				if ((local214 & 0x2) != 0) {
					for (local224 = 0; local224 < local196; local224++) {
						@Pc(332) byte local332 = local206[local224] = local10.method2155();
						local188 |= local332 != -1;
					}
				}
			} else {
				local220 = 0;
				label87: while (true) {
					if (local220 >= local186) {
						if ((local214 & 0x2) == 0) {
							break;
						}
						local224 = 0;
						while (true) {
							if (local186 <= local224) {
								break label87;
							}
							for (@Pc(258) int local258 = 0; local258 < local192; local258++) {
								@Pc(272) byte local272 = local206[local224 + local258 * local186] = local10.method2155();
								local188 |= local272 != -1;
							}
							local224++;
						}
					}
					for (local224 = 0; local224 < local192; local224++) {
						local199[local220 + local224 * local186] = local10.method2155();
					}
					local220++;
				}
			}
			Static165.aBooleanArray12[local180] = local188;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lclient!bd;")
	public static Class1_Sub1_Sub2 method940(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub2 local6 = (Class1_Sub1_Sub2) Static113.aClass4_4.method81((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static121.aClass86_43.method3325(5, arg0);
		local6 = new Class1_Sub1_Sub2();
		if (local25 != null) {
			local6.method212(new Class1_Sub17(local25));
		}
		Static113.aClass4_4.method83(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)[Lclient!vf;")
	public static Class1_Sub1_Sub8[] method941() {
		@Pc(13) Class1_Sub1_Sub8[] local13 = new Class1_Sub1_Sub8[Static70.anInt1320];
		for (@Pc(15) int local15 = 0; local15 < Static70.anInt1320; local15++) {
			@Pc(25) int local25 = Static8.anIntArray20[local15] * Static101.anIntArray191[local15];
			@Pc(28) int[] local28 = new int[local25];
			@Pc(32) byte[] local32 = Static191.aByteArrayArray11[local15];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local28[local34] = Static78.anIntArray127[local32[local34] & 0xFF];
			}
			local13[local15] = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[local15], Static228.anIntArray507[local15], Static8.anIntArray20[local15], Static101.anIntArray191[local15], local28);
		}
		Static216.method3375();
		return local13;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIBI)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static131.anInt2713 <= arg2 - arg1 && arg2 + arg1 <= Static135.anInt2790 && arg0 - arg1 >= Static49.anInt1030 && arg1 + arg0 <= Static177.anInt3701) {
			Static110.method1753(arg2, arg0, arg3, arg1);
		} else {
			Static3.method51(arg3, arg0, arg2, arg1);
		}
	}
}
