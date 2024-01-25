import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
	public static final int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!ka;")
	public static final Class129 aClass129_3 = new Class129(0);

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_164 = new Class103(57, 4);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([[[Lclient!no;IIIZI)Z")
	public static boolean method3505(@OriginalArg(0) Class169[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static49.anInt840 & 0xFF);
		if (local14 == Static41.aByteArrayArrayArray4[Static265.anInt4807][arg2][arg4]) {
			return false;
		} else if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(41) int local41 = 0;
			Static336.anIntArray392[0] = arg2;
			@Pc(54) int local54 = local39 + 1;
			Static110.anIntArray140[0] = arg4;
			Static41.aByteArrayArrayArray4[Static265.anInt4807][arg2][arg4] = local14;
			while (local41 != local54) {
				@Pc(72) int local72 = Static336.anIntArray392[local41] & 0xFFFF;
				@Pc(80) int local80 = Static336.anIntArray392[local41] >> 16 & 0xFF;
				@Pc(88) int local88 = Static336.anIntArray392[local41] >> 24 & 0xFF;
				@Pc(94) int local94 = Static110.anIntArray140[local41] & 0xFFFF;
				@Pc(102) int local102 = Static110.anIntArray140[local41] >> 16 & 0xFF;
				local41 = local41 + 1 & 0xFFF;
				@Pc(110) boolean local110 = false;
				if ((Static147.aByteArrayArrayArray22[Static265.anInt4807][local72][local94] & 0x4) == 0) {
					local110 = true;
				}
				@Pc(124) boolean local124 = false;
				@Pc(165) int local165;
				@Pc(210) int local210;
				label231: for (@Pc(128) int local128 = Static265.anInt4807 + 1; local128 <= 3; local128++) {
					if ((Static147.aByteArrayArrayArray22[local128][local72][local94] & 0x8) == 0) {
						@Pc(304) Class25_Sub5 local304;
						@Pc(314) int local314;
						@Pc(293) Class169 local293;
						@Pc(299) Class27 local299;
						if (local110 && arg0[local128][local72][local94] != null) {
							if (arg0[local128][local72][local94].aClass25_Sub4_2 != null) {
								local165 = Static94.method1484(local80);
								if (local165 == arg0[local128][local72][local94].aClass25_Sub4_2.anInt5873 || arg0[local128][local72][local94].aClass25_Sub4_1 != null && local165 == arg0[local128][local72][local94].aClass25_Sub4_1.anInt5873) {
									continue;
								}
								if (local88 != 0) {
									local210 = Static94.method1484(local88);
									if (arg0[local128][local72][local94].aClass25_Sub4_2.anInt5873 == local210 || arg0[local128][local72][local94].aClass25_Sub4_1 != null && arg0[local128][local72][local94].aClass25_Sub4_1.anInt5873 == local210) {
										continue;
									}
								}
								if (local102 != 0) {
									local210 = Static94.method1484(local102);
									if (local210 == arg0[local128][local72][local94].aClass25_Sub4_2.anInt5873 || arg0[local128][local72][local94].aClass25_Sub4_1 != null && arg0[local128][local72][local94].aClass25_Sub4_1.anInt5873 == local210) {
										continue;
									}
								}
							}
							local293 = arg0[local128][local72][local94];
							if (local293.aClass27_3 != null) {
								for (local299 = local293.aClass27_3; local299 != null; local299 = local299.aClass27_1) {
									local304 = local299.aClass25_Sub5_1;
									if (local304 instanceof Interface8) {
										@Pc(310) Interface8 local310 = (Interface8) local304;
										local314 = local310.method4617();
										if (local314 == 21) {
											local314 = 19;
										}
										@Pc(325) int local325 = local310.method4620();
										@Pc(331) int local331 = local325 << 6 | local314;
										if (local331 == local80 || local88 != 0 && local331 == local88 || local102 != 0 && local102 == local331) {
											continue label231;
										}
									}
								}
							}
						}
						local293 = arg0[local128][local72][local94];
						if (local293 != null && local293.aClass27_3 != null) {
							for (local299 = local293.aClass27_3; local299 != null; local299 = local299.aClass27_1) {
								local304 = local299.aClass25_Sub5_1;
								if (local304.aShort97 != local304.aShort96 || local304.aShort95 != local304.aShort94) {
									for (@Pc(392) int local392 = local304.aShort97; local392 <= local304.aShort96; local392++) {
										for (local314 = local304.aShort94; local314 <= local304.aShort95; local314++) {
											Static41.aByteArrayArrayArray4[local128][local392][local314] = local14;
										}
									}
								}
							}
						}
						local124 = true;
						Static41.aByteArrayArrayArray4[local128][local72][local94] = local14;
					}
				}
				if (local124) {
					local165 = Static94.aClass157Array1[Static265.anInt4807 + 1].ua(local72, local94);
					if (Static416.anIntArray463[arg1] < local165) {
						Static416.anIntArray463[arg1] = local165;
					}
					local210 = local72 << 7;
					if (Static318.anIntArray225[arg1] > local210) {
						Static318.anIntArray225[arg1] = local210;
					} else if (local210 > Static338.anIntArray396[arg1]) {
						Static338.anIntArray396[arg1] = local210;
					}
					@Pc(502) int local502 = local94 << 7;
					if (local502 < Static447.anIntArray280[arg1]) {
						Static447.anIntArray280[arg1] = local502;
					} else if (local502 > Static437.anIntArray494[arg1]) {
						Static437.anIntArray494[arg1] = local502;
					}
				}
				if (!local110) {
					if (local72 >= 1 && Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] != local14) {
						Static336.anIntArray392[local54] = local72 - 1 | 0xD3000000 | 0x120000;
						Static110.anIntArray140[local54] = local94 | 0x130000;
						local54 = local54 + 1 & 0xFFF;
						Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] = local14;
					}
					local94++;
					if (Static206.anInt3607 > local94) {
						if (local72 - 1 >= 0 && local14 != Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72][local94] & 0x4) == 0 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72 - 1][local94 - 1] & 0x4) == 0) {
							Static336.anIntArray392[local54] = 0x52000000 | 0x120000 | local72 - 1;
							Static110.anIntArray140[local54] = local94 | 0x130000;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local14 != Static41.aByteArrayArrayArray4[Static265.anInt4807][local72][local94]) {
							Static336.anIntArray392[local54] = 0x13000000 | 0x520000 | local72;
							Static110.anIntArray140[local54] = local94 | 0x530000;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72][local94] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (Static296.anInt5187 > local72 + 1 && Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] != local14 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72][local94] & 0x4) == 0 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72 + 1][local94 - 1] & 0x4) == 0) {
							Static336.anIntArray392[local54] = local72 + 1 | 0x520000 | 0x92000000;
							Static110.anIntArray140[local54] = local94 | 0x530000;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
					}
					local94--;
					if (Static296.anInt5187 > local72 + 1 && Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] != local14) {
						Static336.anIntArray392[local54] = local72 + 1 | 0x53000000 | 0x920000;
						Static110.anIntArray140[local54] = local94 | 0x930000;
						local54 = local54 + 1 & 0xFFF;
						Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] = local14;
					}
					local94--;
					if (local94 >= 0) {
						if (local72 - 1 >= 0 && local14 != Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72][local94] & 0x4) == 0 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72 - 1][local94 + 1] & 0x4) == 0) {
							Static336.anIntArray392[local54] = 0x12000000 | 0xD20000 | local72 - 1;
							Static110.anIntArray140[local54] = local94 | 0xD30000;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 - 1][local94] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (Static41.aByteArrayArrayArray4[Static265.anInt4807][local72][local94] != local14) {
							Static336.anIntArray392[local54] = local72 | 0x93000000 | 0xD20000;
							Static110.anIntArray140[local54] = local94 | 0xD30000;
							local54 = local54 + 1 & 0xFFF;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72][local94] = local14;
						}
						if (local72 + 1 < Static296.anInt5187 && Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] != local14 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72][local94] & 0x4) == 0 && (Static147.aByteArrayArrayArray22[Static265.anInt4807][local72 + 1][local94 + 1] & 0x4) == 0) {
							Static336.anIntArray392[local54] = local72 + 1 | 0x920000 | 0xD2000000;
							Static110.anIntArray140[local54] = local94 | 0x930000;
							Static41.aByteArrayArrayArray4[Static265.anInt4807][local72 + 1][local94] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static416.anIntArray463[arg1] != -1000000) {
				Static416.anIntArray463[arg1] += 10;
				Static318.anIntArray225[arg1] -= 50;
				Static338.anIntArray396[arg1] += 50;
				Static437.anIntArray494[arg1] += 50;
				Static447.anIntArray280[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
	public static void method3507(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 12);
		local8.method2667();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method3508(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static117.anInt2198 != 3) {
			Static259.aClass156_4 = new Class156();
			Static259.aClass156_4.anInt4501 = arg0;
			Static259.aClass156_4.aString53 = arg1;
			if (Static459.aClass30_13 != Static328.aClass30_10) {
				Static259.aClass156_4.anInt4508 = Static259.aClass156_4.anInt4501 + 40000;
				Static259.aClass156_4.anInt4505 = Static259.aClass156_4.anInt4501 + 50000;
			}
			return true;
		}
		@Pc(37) String local37 = "";
		if (Static459.aClass30_13 != Static328.aClass30_10) {
			local37 = ":" + (arg0 + 7000);
		}
		@Pc(52) String local52 = "";
		if (Static87.aString74 != null) {
			local52 = "/p=" + Static87.aString74;
		}
		@Pc(100) String local100 = "http://" + arg1 + local37 + "/l=" + Static394.anInt6582 + "/a=" + Static83.anInt1575 + local52 + "/j" + (Static330.aBoolean639 ? "1" : "0") + ",o" + (Static122.aBoolean254 ? "1" : "0") + ",a2";
		try {
			Static159.aClient1.getAppletContext().showDocument(new URL(local100), "_self");
			return true;
		} catch (@Pc(118) Exception local118) {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3509(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
