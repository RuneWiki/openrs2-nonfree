import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!dd;")
	public static Class68 aClass68_4 = null;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V")
	public static void method2698(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(3, arg0);
		local8.method3257();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2699(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static171.anInt9038++;
		Static324.anInt6153 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static251.anInt4609; local7 < Static431.anInt7712; local7++) {
			@Pc(12) Class133[][] local12 = Static113.aClass133ArrayArrayArray1[local7];
			for (local14 = Static538.anInt9252; local14 < Static70.anInt1182; local14++) {
				for (local17 = Static203.anInt3852; local17 < Static210.anInt3998; local17++) {
					@Pc(24) Class133 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static528.aBooleanArrayArray9[local14 + Static2.anInt40 - Static207.anInt3926][local17 + Static2.anInt40 - Static3.anInt7083] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean302 = true;
							local24.aBoolean304 = true;
							if (local24.aClass315_1 == null) {
								local24.aBoolean303 = false;
							} else {
								local24.aBoolean303 = true;
							}
							Static324.anInt6153++;
						} else {
							local24.aBoolean302 = false;
							local24.aBoolean304 = false;
							local24.aByte48 = 0;
							if (local14 >= Static207.anInt3926 - 16 && local14 <= Static207.anInt3926 + 16 && local17 >= Static3.anInt7083 - 16 && local17 <= Static3.anInt7083 + 16 && (local24.aClass15_Sub1_2 != null || local24.aClass15_Sub1_1 != null || local24.aClass15_Sub4_2 != null || local24.aClass15_Sub4_1 != null || local24.aClass15_Sub3_2 != null || local24.aClass315_1 != null)) {
								Static221.aClass175_1.method4157(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static251.anInt4609; local140 < Static431.anInt7712; local140++) {
			if (Static276.aClass90_9.method7480() && local140 >= arg2 && arg1 != null) {
				local14 = Static528.aBooleanArrayArray9.length;
				if (Static538.anInt9252 + Static528.aBooleanArrayArray9.length > Static547.anInt9363) {
					local14 -= Static538.anInt9252 + Static528.aBooleanArrayArray9.length - Static547.anInt9363;
				}
				local17 = Static528.aBooleanArrayArray9[0].length;
				if (Static203.anInt3852 + Static528.aBooleanArrayArray9[0].length > Static20.anInt358) {
					local17 -= Static203.anInt3852 + Static528.aBooleanArrayArray9[0].length - Static20.anInt358;
				}
				@Pc(193) int local193 = Static274.anInt4855;
				while (true) {
					if (local193 >= local14) {
						Static221.aClass175_1.method4155(local140, true, Static205.aClass46Array1[local140]);
						break;
					}
					@Pc(200) int local200 = local193 + Static538.anInt9252 - Static274.anInt4855;
					for (@Pc(202) int local202 = Static283.anInt5218; local202 < local17; local202++) {
						Static467.aBooleanArrayArray7[local193][local202] = false;
						if (Static528.aBooleanArrayArray9[local193][local202]) {
							@Pc(221) int local221 = local202 + Static203.anInt3852 - Static283.anInt5218;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static113.aClass133ArrayArrayArray1[local223][local200][local221] != null && Static113.aClass133ArrayArrayArray1[local223][local200][local221].aByte49 == local140) {
									Static467.aBooleanArrayArray7[local193][local202] = Static113.aClass133ArrayArrayArray1[local223][local200][local221].aBoolean302;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static221.aClass175_1.method4155(local140, false, Static205.aClass46Array1[local140]);
			}
			Static221.aClass175_1.method4154();
		}
		if (!Static531.method7239(true)) {
			Static531.method7239(false);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	public static void method2701() {
		Static523.anInt9056 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static91.anInt1494; local3++) {
			@Pc(8) Class89 local8 = Static182.aClass89Array1[local3];
			@Pc(12) int local12;
			if (Static497.anIntArray618 != null) {
				for (local12 = 0; local12 < Static497.anIntArray618.length; local12++) {
					if (Static497.anIntArray618[local12] != -1000000 && (local8.anInt2229 <= Static497.anIntArray618[local12] || local8.anInt2228 <= Static497.anIntArray618[local12]) && (local8.anInt2225 <= Static525.anIntArray640[local12] || local8.anInt2216 <= Static525.anIntArray640[local12]) && (local8.anInt2225 >= Static249.anIntArray377[local12] || local8.anInt2216 >= Static249.anIntArray377[local12]) && (local8.anInt2218 <= Static231.anIntArray715[local12] || local8.anInt2219 <= Static231.anIntArray715[local12]) && (local8.anInt2218 >= Static359.anIntArray698[local12] || local8.anInt2219 >= Static359.anIntArray698[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt2215 == 1) {
				local12 = local8.anInt2222 + Static2.anInt40 - Static207.anInt3926;
				if (local12 >= 0 && local12 <= Static2.anInt40 + Static2.anInt40) {
					local110 = local8.anInt2220 + Static2.anInt40 - Static3.anInt7083;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static2.anInt40 + Static2.anInt40) {
						continue;
					}
					local128 = local8.anInt2224 + Static2.anInt40 - Static3.anInt7083;
					if (local128 > Static2.anInt40 + Static2.anInt40) {
						local128 = Static2.anInt40 + Static2.anInt40;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static528.aBooleanArrayArray9[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static226.anInt4160 - local8.anInt2225;
						if (local164 > Static342.anInt6507) {
							local8.anInt2214 = 1;
						} else {
							if (local164 >= -Static342.anInt6507) {
								continue;
							}
							local8.anInt2214 = 2;
							local164 = -local164;
						}
						local8.anInt2221 = (local8.anInt2218 - Static567.anInt9819 << 8) / local164;
						local8.anInt2223 = (local8.anInt2219 - Static567.anInt9819 << 8) / local164;
						local8.anInt2230 = (local8.anInt2229 - Static226.anInt4147 << 8) / local164;
						local8.anInt2226 = (local8.anInt2228 - Static226.anInt4147 << 8) / local164;
						Static244.aClass89Array2[Static523.anInt9056++] = local8;
					}
				}
			} else if (local8.anInt2215 == 2) {
				local12 = local8.anInt2220 + Static2.anInt40 - Static3.anInt7083;
				if (local12 >= 0 && local12 <= Static2.anInt40 + Static2.anInt40) {
					local110 = local8.anInt2222 + Static2.anInt40 - Static207.anInt3926;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static2.anInt40 + Static2.anInt40) {
						continue;
					}
					local128 = local8.anInt2212 + Static2.anInt40 - Static207.anInt3926;
					if (local128 > Static2.anInt40 + Static2.anInt40) {
						local128 = Static2.anInt40 + Static2.anInt40;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static528.aBooleanArrayArray9[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static567.anInt9819 - local8.anInt2218;
						if (local164 > Static342.anInt6507) {
							local8.anInt2214 = 3;
						} else {
							if (local164 >= -Static342.anInt6507) {
								continue;
							}
							local8.anInt2214 = 4;
							local164 = -local164;
						}
						local8.anInt2213 = (local8.anInt2225 - Static226.anInt4160 << 8) / local164;
						local8.anInt2231 = (local8.anInt2216 - Static226.anInt4160 << 8) / local164;
						local8.anInt2230 = (local8.anInt2229 - Static226.anInt4147 << 8) / local164;
						local8.anInt2226 = (local8.anInt2228 - Static226.anInt4147 << 8) / local164;
						Static244.aClass89Array2[Static523.anInt9056++] = local8;
					}
				}
			} else if (local8.anInt2215 == 4) {
				local12 = local8.anInt2229 - Static226.anInt4147;
				if (local12 > Static31.anInt582) {
					local110 = local8.anInt2220 + Static2.anInt40 - Static3.anInt7083;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static2.anInt40 + Static2.anInt40) {
						continue;
					}
					local128 = local8.anInt2224 + Static2.anInt40 - Static3.anInt7083;
					if (local128 > Static2.anInt40 + Static2.anInt40) {
						local128 = Static2.anInt40 + Static2.anInt40;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt2222 + Static2.anInt40 - Static207.anInt3926;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static2.anInt40 + Static2.anInt40) {
						continue;
					}
					local164 = local8.anInt2212 + Static2.anInt40 - Static207.anInt3926;
					if (local164 > Static2.anInt40 + Static2.anInt40) {
						local164 = Static2.anInt40 + Static2.anInt40;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static528.aBooleanArrayArray9[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt2214 = 5;
						local8.anInt2213 = (local8.anInt2225 - Static226.anInt4160 << 8) / local12;
						local8.anInt2231 = (local8.anInt2216 - Static226.anInt4160 << 8) / local12;
						local8.anInt2221 = (local8.anInt2218 - Static567.anInt9819 << 8) / local12;
						local8.anInt2223 = (local8.anInt2219 - Static567.anInt9819 << 8) / local12;
						Static244.aClass89Array2[Static523.anInt9056++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!tt;IILjava/lang/String;)Lclient!oaa;")
	public static Class224 method2702(@OriginalArg(0) Class313 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method6996(arg2);
		}
		@Pc(41) Class224 local41;
		if (arg1 == 1) {
			try {
				Static594.method6347(new Object[] { (new URL(Static198.anApplet1.getCodeBase(), arg2)).toString() }, "openjs", Static198.anApplet1);
				local41 = new Class224();
				local41.anInt6632 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class224();
				local41.anInt6632 = 2;
				return local41;
			}
		} else if (arg1 == 2) {
			try {
				Static198.anApplet1.getAppletContext().showDocument(new URL(Static198.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class224();
				local41.anInt6632 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class224();
				local41.anInt6632 = 2;
				return local41;
			}
		} else if (arg1 == 3) {
			try {
				Static594.method6348("loggedout", Static198.anApplet1);
			} catch (@Pc(102) Throwable local102) {
			}
			try {
				Static198.anApplet1.getAppletContext().showDocument(new URL(Static198.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class224();
				local41.anInt6632 = 1;
				return local41;
			} catch (@Pc(122) Exception local122) {
				local41 = new Class224();
				local41.anInt6632 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
