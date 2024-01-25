import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public static int anInt2434;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Lclient!fr;")
	public static Class68 aClass68_11;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Z")
	public static boolean aBoolean158 = true;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[C")
	public static final char[] aCharArray13 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method2253() {
		Static222.aClass164_1 = new Class164(8);
		Static70.anInt1762 = 0;
		for (@Pc(17) Class63_Sub5 local17 = (Class63_Sub5) Static337.aClass24_6.method619(); local17 != null; local17 = (Class63_Sub5) Static337.aClass24_6.method627()) {
			local17.method4122();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method2254() {
		@Pc(15) int local15 = Static6.aClass5_Sub1_Sub1_1.method182(8);
		@Pc(24) int local24;
		if (local15 < Static161.anInt3258) {
			for (local24 = local15; local24 < Static161.anInt3258; local24++) {
				Static269.anIntArray394[Static205.anInt3959++] = Static220.anIntArray311[local24];
			}
		}
		if (local15 > Static161.anInt3258) {
			throw new RuntimeException("gppov1");
		}
		Static161.anInt3258 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(62) int local62 = Static220.anIntArray311[local24];
			@Pc(66) Class25_Sub1_Sub1_Sub1 local66 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local62];
			@Pc(71) int local71 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			if (local71 == 0) {
				Static220.anIntArray311[Static161.anInt3258++] = local62;
				local66.anInt5320 = Static180.anInt3606;
			} else {
				@Pc(93) int local93 = Static6.aClass5_Sub1_Sub1_1.method182(2);
				if (local93 == 0) {
					Static220.anIntArray311[Static161.anInt3258++] = local62;
					local66.anInt5320 = Static180.anInt3606;
					Static178.anIntArray266[Static47.anInt1211++] = local62;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static220.anIntArray311[Static161.anInt3258++] = local62;
						local66.anInt5320 = Static180.anInt3606;
						local137 = Static6.aClass5_Sub1_Sub1_1.method182(3);
						local66.method4656(1, local137);
						local147 = Static6.aClass5_Sub1_Sub1_1.method182(1);
						if (local147 == 1) {
							Static178.anIntArray266[Static47.anInt1211++] = local62;
						}
					} else if (local93 == 2) {
						Static220.anIntArray311[Static161.anInt3258++] = local62;
						local66.anInt5320 = Static180.anInt3606;
						if (Static6.aClass5_Sub1_Sub1_1.method182(1) == 1) {
							local137 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local66.method4656(2, local137);
							local147 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local66.method4656(2, local147);
						} else {
							local137 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local66.method4656(0, local137);
						}
						local137 = Static6.aClass5_Sub1_Sub1_1.method182(1);
						if (local137 == 1) {
							Static178.anIntArray266[Static47.anInt1211++] = local62;
						}
					} else if (local93 == 3) {
						Static269.anIntArray394[Static205.anInt3959++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
	public static void method2255(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg2[local46]) {
				@Pc(68) long local68 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local68;
				@Pc(82) Object local82 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local82;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method2255(arg0, local16 - 1, arg2, arg3);
		method2255(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ac;Z[Lclient!dl;ILclient!en;)V")
	public static void method2256(@OriginalArg(0) int arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class49[] arg3, @OriginalArg(5) Class59 arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(27) int local27;
		if (!arg2) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static266.anInt5101; local9++) {
					for (local13 = 0; local13 < Static339.anInt6352; local13++) {
						if ((Static32.aByteArrayArrayArray4[local5][local9][local13] & 0x1) != 0) {
							local27 = local5;
							if ((Static32.aByteArrayArrayArray4[1][local9][local13] & 0x2) != 0) {
								local27 = local5 - 1;
							}
							if (local27 >= 0) {
								arg3[local27].method1237(local9, local13);
							}
						}
					}
				}
			}
		}
		@Pc(67) int[][] local67 = new int[Static266.anInt5101][Static339.anInt6352];
		for (local9 = 0; local9 < arg0; local9++) {
			for (local13 = 0; local13 < Static339.anInt6352; local13++) {
				Static162.anIntArray225[local13] = 0;
				Static289.anIntArray417[local13] = 0;
				Static175.anIntArray264[local13] = 0;
				Static250.anIntArray379[local13] = 0;
				Static133.anIntArray563[local13] = 0;
			}
			for (local27 = -5; local27 < Static266.anInt5101; local27++) {
				@Pc(115) int local115;
				@Pc(132) int local132;
				@Pc(201) int local201;
				for (@Pc(109) int local109 = 0; local109 < Static339.anInt6352; local109++) {
					local115 = local27 + 5;
					@Pc(179) int local179;
					if (local115 < Static266.anInt5101) {
						local132 = Static95.aByteArrayArrayArray30[local9][local115][local109] & 0xFF;
						if (local132 > 0) {
							@Pc(143) Class71 local143 = Static248.method4359(local132 - 1);
							Static162.anIntArray225[local109] += local143.anInt2212;
							Static289.anIntArray417[local109] += local143.anInt2208;
							Static175.anIntArray264[local109] += local143.anInt2210;
							Static250.anIntArray379[local109] += local143.anInt2209;
							local179 = Static133.anIntArray563[local109]++;
						}
					}
					local132 = local27 - 5;
					if (local132 >= 0) {
						local201 = Static95.aByteArrayArrayArray30[local9][local132][local109] & 0xFF;
						if (local201 > 0) {
							@Pc(209) Class71 local209 = Static248.method4359(local201 - 1);
							Static162.anIntArray225[local109] -= local209.anInt2212;
							Static289.anIntArray417[local109] -= local209.anInt2208;
							Static175.anIntArray264[local109] -= local209.anInt2210;
							Static250.anIntArray379[local109] -= local209.anInt2209;
							local179 = Static133.anIntArray563[local109]--;
						}
					}
				}
				if (local27 >= 0) {
					local115 = 0;
					local132 = 0;
					local201 = 0;
					@Pc(262) int local262 = 0;
					@Pc(264) int local264 = 0;
					for (@Pc(266) int local266 = -5; local266 < Static339.anInt6352; local266++) {
						@Pc(272) int local272 = local266 + 5;
						if (local272 < Static339.anInt6352) {
							local201 += Static175.anIntArray264[local272];
							local132 += Static289.anIntArray417[local272];
							local115 += Static162.anIntArray225[local272];
							local262 += Static250.anIntArray379[local272];
							local264 += Static133.anIntArray563[local272];
						}
						@Pc(309) int local309 = local266 - 5;
						if (local309 >= 0) {
							local264 -= Static133.anIntArray563[local309];
							local262 -= Static250.anIntArray379[local309];
							local132 -= Static289.anIntArray417[local309];
							local201 -= Static175.anIntArray264[local309];
							local115 -= Static162.anIntArray225[local309];
						}
						if (local266 >= 0 && local262 > 0 && local264 > 0) {
							local67[local27][local266] = Static140.method2611(local132 / local264, local115 * 256 / local262, local201 / local264);
						}
					}
				}
			}
			Static203.method3626(arg1, Static266.anInt5101, Static152.aByteArrayArrayArray14[local9], Static81.aByteArrayArrayArray9[local9], local9, Static130.aClass3Array2[local9], arg2, local67, Static95.aByteArrayArrayArray30[local9], Static171.aByteArrayArrayArray17[local9], Static339.anInt6352, arg4);
			Static95.aByteArrayArrayArray30[local9] = null;
			Static81.aByteArrayArrayArray9[local9] = null;
			Static152.aByteArrayArrayArray14[local9] = null;
			Static171.aByteArrayArrayArray17[local9] = null;
		}
		if (!arg2) {
			if (Static8.aBoolean7) {
				Static169.method3189();
			}
			if (Static134.anInt2750 != 0) {
				Static343.method5681();
			}
		}
		for (local27 = 0; local27 < arg0; local27++) {
			Static130.aClass3Array2[local27].method5629();
		}
	}
}
