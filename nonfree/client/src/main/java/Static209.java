import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!ek;")
	public static Class42 aClass42_63;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public static int anInt4315;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public static int anInt4310 = 50;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
	public static int[] anIntArray426 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
	public static int[] anIntArray427 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[anInt4310];

	@OriginalMember(owner = "client!om", name = "e", descriptor = "I")
	public static int anInt4309 = 0;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
	public static int[] anIntArray428 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "i", descriptor = "[I")
	public static int[] anIntArray429 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "m", descriptor = "[I")
	public static int[] anIntArray430 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
	public static int[] anIntArray431 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "o", descriptor = "I")
	public static int anInt4314 = -1;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
	public static int[] anIntArray432 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!om", name = "q", descriptor = "[I")
	public static int[] anIntArray433 = new int[anInt4310];

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public static int anInt4316 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public static void method3502() {
		while (true) {
			@Pc(14) Class2_Sub5 local14 = (Class2_Sub5) Static61.aClass44_5.method1353();
			if (local14 == null) {
				return;
			}
			@Pc(33) Class15_Sub2 local33;
			@Pc(29) int local29;
			if (local14.anInt396 >= 0) {
				local29 = local14.anInt396 - 1;
				local33 = Static35.aClass15_Sub2_Sub1Array2[local29];
			} else {
				local29 = -local14.anInt396 - 1;
				if (local29 == Static22.anInt504) {
					local33 = Static22.aClass15_Sub2_Sub2_1;
				} else {
					local33 = Static188.aClass15_Sub2_Sub2Array41[local29];
				}
			}
			if (local33 != null) {
				@Pc(63) Class146 local63 = Static10.method158(local14.anInt384);
				@Pc(76) int local76;
				@Pc(79) int local79;
				if (local14.anInt390 == 1 || local14.anInt390 == 3) {
					local76 = local63.anInt4721;
					local79 = local63.anInt4749;
				} else {
					local79 = local63.anInt4721;
					local76 = local63.anInt4749;
				}
				@Pc(95) int local95 = local14.anInt391 + (local76 >> 1);
				if (Static32.anInt876 >= 3) {
				}
				@Pc(108) int local108 = local14.anInt393 + (local79 >> 1);
				@Pc(118) int local118 = local14.anInt391 + (local76 + 1 >> 1);
				@Pc(127) int local127 = local14.anInt393 + (local79 + 1 >> 1);
				@Pc(131) int[][] local131 = Static9.anIntArrayArrayArray7[Static32.anInt876];
				@Pc(159) int local159 = local131[local118][local108] + local131[local95][local108] + local131[local95][local127] + local131[local118][local127] >> 2;
				@Pc(161) Class15 local161 = null;
				@Pc(166) int local166 = Static61.anIntArray129[local14.anInt394];
				if (local166 == 0) {
					@Pc(231) Class122 local231 = Static27.method4363(Static32.anInt876, local14.anInt391, local14.anInt393);
					if (local231 != null) {
						local161 = local231.aClass15_3;
					}
				} else if (local166 == 1) {
					@Pc(217) Class147 local217 = Static249.method3906(Static32.anInt876, local14.anInt391, local14.anInt393);
					if (local217 != null) {
						local161 = local217.aClass15_5;
					}
				} else if (local166 == 2) {
					@Pc(202) Class170 local202 = Static278.method4341(Static32.anInt876, local14.anInt391, local14.anInt393);
					if (local202 != null) {
						local161 = local202.aClass15_9;
					}
				} else if (local166 == 3) {
					@Pc(188) Class191 local188 = Static191.method3296(Static32.anInt876, local14.anInt391, local14.anInt393);
					if (local188 != null) {
						local161 = local188.aClass15_10;
					}
				}
				if (local161 != null) {
					Static143.method2544(0, local14.anInt391, Static32.anInt876, local166, local14.anInt395 + 1, local14.anInt393, -1, 0, local14.anInt385 + 1);
					@Pc(261) int local261 = local14.anInt397;
					local33.anInt5359 = Static268.anInt5236 + local14.anInt395;
					@Pc(270) int local270 = local14.anInt392;
					local33.anInt5357 = local79 * 64 + local14.anInt393 * 128;
					@Pc(283) int local283 = local14.anInt387;
					local33.anInt5294 = local159;
					local33.anObject7 = local161;
					@Pc(292) int local292 = local14.anInt386;
					@Pc(298) int local298;
					if (local270 > local292) {
						local298 = local270;
						local270 = local292;
						local292 = local298;
					}
					if (local261 < local283) {
						local298 = local283;
						local283 = local261;
						local261 = local298;
					}
					local33.anInt5302 = local14.anInt391 + local270;
					local33.anInt5312 = local14.anInt385 + Static268.anInt5236;
					local33.anInt5292 = local283 + local14.anInt393;
					local33.anInt5380 = local292 + local14.anInt391;
					local33.anInt5299 = local76 * 64 + local14.anInt391 * 128;
					local33.anInt5339 = local14.anInt393 + local261;
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Lclient!vj;")
	public static Class187 method3503(@OriginalArg(0) int arg0) {
		@Pc(10) Class187 local10 = (Class187) Static141.aClass157_26.method4031((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static67.aClass42_19.method1256(16, arg0);
		local10 = new Class187();
		if (local21 != null) {
			local10.method4558(new Class2_Sub16(local21));
		}
		Static141.aClass157_26.method4026((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIILclient!ml;JLclient!ml;Lclient!ml;)V")
	public static void method3505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) Class15 arg7) {
		@Pc(3) Class167 local3 = new Class167();
		local3.aClass15_8 = arg4;
		local3.anInt5231 = arg1 * 128 + 64;
		local3.anInt5232 = arg2 * 128 + 64;
		local3.anInt5234 = arg3;
		local3.aLong189 = arg5;
		local3.aClass15_6 = arg6;
		local3.aClass15_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub13 local42 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1544; local46++) {
				@Pc(55) Class170 local55 = local42.aClass170Array1[local46];
				if ((local55.aLong195 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass15_9.method4274();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt5237 = -local34;
		if (Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub13(arg0, arg1, arg2);
		}
		Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass167_1 = local3;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!la;IBLclient!oe;)V")
	public static void method3506(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		@Pc(17) Class2_Sub6 local17 = new Class2_Sub6();
		local17.anInt407 = arg2.method2146();
		local17.anInt408 = arg2.method2145();
		local17.aByteArrayArrayArray4 = new byte[local17.anInt407][][];
		local17.anIntArray52 = new int[local17.anInt407];
		local17.aClass111Array1 = new Class111[local17.anInt407];
		local17.anIntArray53 = new int[local17.anInt407];
		local17.aClass111Array2 = new Class111[local17.anInt407];
		local17.anIntArray54 = new int[local17.anInt407];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt407; local59++) {
			try {
				@Pc(71) int local71 = arg2.method2146();
				@Pc(86) String local86;
				@Pc(90) String local90;
				@Pc(92) int local92;
				if (local71 == 0 || local71 == 1 || local71 == 2) {
					local86 = arg2.method2158();
					local90 = arg2.method2158();
					local92 = 0;
					if (local71 == 1) {
						local92 = arg2.method2145();
					}
					local17.anIntArray53[local59] = local71;
					local17.anIntArray54[local59] = local92;
					local17.aClass111Array1[local59] = arg0.method2888(Static190.method3288(local86), local90);
				} else if (local71 == 3 || local71 == 4) {
					local86 = arg2.method2158();
					local90 = arg2.method2158();
					local92 = arg2.method2146();
					@Pc(149) String[] local149 = new String[local92];
					for (@Pc(151) int local151 = 0; local151 < local92; local151++) {
						local149[local151] = arg2.method2158();
					}
					@Pc(166) byte[][] local166 = new byte[local92][];
					@Pc(185) int local185;
					if (local71 == 3) {
						for (@Pc(174) int local174 = 0; local174 < local92; local174++) {
							local185 = arg2.method2145();
							local166[local174] = new byte[local185];
							arg2.method2135(local166[local174], local185);
						}
					}
					local17.anIntArray53[local59] = local71;
					@Pc(209) Class[] local209 = new Class[local92];
					for (local185 = 0; local185 < local92; local185++) {
						local209[local185] = Static190.method3288(local149[local185]);
					}
					local17.aClass111Array2[local59] = arg0.method2883(local209, local90, Static190.method3288(local86));
					local17.aByteArrayArrayArray4[local59] = local166;
				}
			} catch (@Pc(244) ClassNotFoundException local244) {
				local17.anIntArray52[local59] = -1;
			} catch (@Pc(251) SecurityException local251) {
				local17.anIntArray52[local59] = -2;
			} catch (@Pc(258) NullPointerException local258) {
				local17.anIntArray52[local59] = -3;
			} catch (@Pc(265) Exception local265) {
				local17.anIntArray52[local59] = -4;
			} catch (@Pc(272) Throwable local272) {
				local17.anIntArray52[local59] = -5;
			}
		}
		Static184.aClass44_20.method1358(local17);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public static void method3507() {
		Static296.aClass157_44.method4033();
		Static257.aClass157_41.method4033();
	}
}
