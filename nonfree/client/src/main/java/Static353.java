import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!wp", name = "rb", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!wp", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray97;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "[I")
	public static int[] anIntArray644 = new int[2];

	@OriginalMember(owner = "client!wp", name = "bb", descriptor = "[Lclient!om;")
	public static final Class14_Sub2_Sub15[] aClass14_Sub2_Sub15Array6 = new Class14_Sub2_Sub15[14];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public static void method5961() {
		Static245.aClass11_82.method214();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI[Lclient!fn;[BILclient!e;IIII)[I")
	public static int[] method5965(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class65[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if (!arg0) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				@Pc(11) Class65 local11 = arg1[local5];
				for (local13 = 0; local13 < 64; local13++) {
					for (local17 = 0; local17 < 64; local17++) {
						local24 = arg6 + local13;
						local28 = local17 + arg7;
						if (local24 >= 0 && Static195.anInt3965 > local24 && local28 >= 0 && Static298.anInt5716 > local28) {
							local11.method2129(local24, local28);
						}
					}
				}
			}
		}
		@Pc(73) Class14_Sub4 local73 = new Class14_Sub4(arg2);
		@Pc(77) int local77 = arg6 + arg5;
		local13 = arg3 + arg7;
		for (local17 = 0; local17 < arg8; local17++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local28 = 0; local28 < 64; local28++) {
					Static273.method4635(local28 + arg7, local24 + arg6, local28 + local13, local17, 0, local77 + local24, false, arg0, 0, local73, 0);
				}
			}
		}
		@Pc(130) boolean local130 = false;
		@Pc(132) boolean local132 = false;
		@Pc(138) int local138;
		@Pc(195) int local195;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(215) int local215;
		@Pc(260) int local260;
		while (local73.anInt2637 < local73.aByteArray74.length) {
			local138 = local73.method2548();
			if (local138 == 128) {
				Static27.anIntArray40[0] = local73.method2498();
				Static27.anIntArray40[1] = local73.method2502();
				Static27.anIntArray40[2] = local73.method2502();
				Static27.anIntArray40[3] = local73.method2502();
				Static27.anIntArray40[4] = local73.method2498();
				local130 = true;
			} else {
				if (local138 != 129) {
					local73.anInt2637--;
					break;
				}
				if (Static260.aByteArrayArrayArray10 == null) {
					Static260.aByteArrayArrayArray10 = new byte[4][][];
				}
				local132 = true;
				for (local195 = 0; local195 < 4; local195++) {
					@Pc(201) byte local201 = local73.method2553();
					if (local201 == 0 && Static260.aByteArrayArrayArray10[local195] != null) {
						local209 = arg6;
						local213 = arg6 + 64;
						local215 = arg7;
						if (local213 < 0) {
							local213 = 0;
						} else if (local213 >= Static195.anInt3965) {
							local213 = Static195.anInt3965;
						}
						if (arg7 < 0) {
							local215 = 0;
						} else if (arg7 >= Static298.anInt5716) {
							local215 = Static298.anInt5716;
						}
						if (arg6 < 0) {
							local209 = 0;
						} else if (arg6 >= Static195.anInt3965) {
							local209 = Static195.anInt3965;
						}
						local260 = arg7 + 64;
						if (local260 < 0) {
							local260 = 0;
						} else if (local260 >= Static298.anInt5716) {
							local260 = Static298.anInt5716;
						}
						while (local209 < local213) {
							while (local260 > local215) {
								Static260.aByteArrayArrayArray10[local195][local209][local215] = 0;
								local215++;
							}
							local209++;
						}
					} else if (local201 == 1) {
						if (Static260.aByteArrayArrayArray10[local195] == null) {
							Static260.aByteArrayArrayArray10[local195] = new byte[Static195.anInt3965 + 1][Static298.anInt5716 + 1];
						}
						for (local209 = 0; local209 < 64; local209 += 4) {
							for (local213 = 0; local213 < 64; local213 += 4) {
								@Pc(328) byte local328 = local73.method2553();
								for (local260 = arg6 + local209; local260 < local209 + arg6 + 4; local260++) {
									for (@Pc(338) int local338 = arg7 + local213; local338 < arg7 + local213 + 4; local338++) {
										if (local260 >= 0 && local260 < Static195.anInt3965 && local338 >= 0 && local338 < Static298.anInt5716) {
											Static260.aByteArrayArrayArray10[local195][local260][local338] = local328;
										}
									}
								}
							}
						}
					} else if (local201 == 2) {
						if (Static260.aByteArrayArrayArray10[local195] == null) {
							Static260.aByteArrayArrayArray10[local195] = new byte[Static195.anInt3965 + 1][Static298.anInt5716 + 1];
						}
						if (local195 > 0) {
							local209 = arg6;
							local213 = arg6 + 64;
							local215 = arg7;
							local260 = arg7 + 64;
							if (local213 < 0) {
								local213 = 0;
							} else if (Static195.anInt3965 <= local213) {
								local213 = Static195.anInt3965;
							}
							if (arg7 < 0) {
								local215 = 0;
							} else if (Static298.anInt5716 <= arg7) {
								local215 = Static298.anInt5716;
							}
							if (arg6 < 0) {
								local209 = 0;
							} else if (arg6 >= Static195.anInt3965) {
								local209 = Static195.anInt3965;
							}
							if (local260 < 0) {
								local260 = 0;
							} else if (local260 >= Static298.anInt5716) {
								local260 = Static298.anInt5716;
							}
							while (local213 > local209) {
								while (local215 < local260) {
									Static260.aByteArrayArrayArray10[local195][local209][local215] = Static260.aByteArrayArrayArray10[local195 - 1][local209][local215];
									local215++;
								}
								local209++;
							}
						}
					}
				}
			}
		}
		@Pc(549) int local549;
		if (!arg0) {
			@Pc(532) Class188 local532 = null;
			label280: while (true) {
				label273: do {
					while (true) {
						while (local73.aByteArray74.length > local73.anInt2637) {
							local195 = local73.method2548();
							if (local195 == 0) {
								local532 = new Class188(local73);
							} else {
								if (local195 == 1) {
									local549 = local73.method2548();
									continue label273;
								}
								if (local195 != 2) {
									throw new IllegalStateException();
								}
								if (local532 == null) {
									local532 = new Class188();
								}
								local532.method5076(local73);
							}
						}
						if (local532 != null) {
							for (local195 = 0; local195 < 8; local195++) {
								for (local549 = 0; local549 < 8; local549++) {
									local209 = (arg6 >> 3) + local195;
									local213 = (arg7 >> 3) + local549;
									if (local209 >= 0 && local209 < Static195.anInt3965 >> 3 && local213 >= 0 && local213 < Static298.anInt5716 >> 3) {
										Static251.method2948(local532, local213, local209);
									}
								}
							}
						}
						break label280;
					}
				} while (local549 <= 0);
				for (local209 = 0; local209 < local549; local209++) {
					@Pc(560) Class14_Sub13_Sub1 local560 = new Class14_Sub13_Sub1(local73);
					if (local560.anInt5646 == 31) {
						@Pc(572) Class194 local572 = Static262.method4489(local73.method2498());
						local560.method5023(local572.anInt5855, local572.anInt5858, local572.anInt5856, local572.anInt5861);
					}
					local560.anInt5638 += arg7 << 7;
					local560.anInt5640 += arg6 << 7;
					local215 = local560.anInt5640 >> 7;
					local260 = local560.anInt5638 >> 7;
					if (local215 >= 0 && local260 >= 0 && local215 < Static195.anInt3965 && Static298.anInt5716 > local260) {
						local560.anInt5635 = Static1.anIntArrayArrayArray12[local560.anInt5650][local215][local260] - local560.anInt5635;
						if (arg4.method5135() > 0) {
							Static286.method4893(local560);
						}
					}
				}
			}
		}
		if (!local132 && Static260.aByteArrayArrayArray10 != null) {
			for (local138 = 0; local138 < 4; local138++) {
				if (Static260.aByteArrayArrayArray10[local138] != null) {
					for (local195 = 0; local195 < 16; local195++) {
						for (local549 = 0; local549 < 16; local549++) {
							local209 = (arg6 >> 2) + local195;
							local213 = local549 + (arg7 >> 2);
							if (local209 >= 0 && local209 < 26 && local213 >= 0 && local213 < 26) {
								Static260.aByteArrayArrayArray10[local138][local209][local213] = 0;
							}
						}
					}
				}
			}
		}
		if (local130) {
			return Static27.anIntArray40;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public static void method5969() {
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(58) int local58;
		@Pc(79) int local79;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(54) int local54;
		if (Static116.anInt2565 == 142) {
			@Pc(12) int local12 = Static30.aClass14_Sub4_Sub2_1.method2548();
			local20 = (local12 >> 4 & 0x7) + Static155.anInt3312;
			local27 = Static167.anInt5369 + (local12 & 0x7);
			local31 = Static30.aClass14_Sub4_Sub2_1.method2498();
			if (local31 == 65535) {
				local31 = -1;
			}
			local40 = Static30.aClass14_Sub4_Sub2_1.method2548();
			local46 = local40 >> 4 & 0xF;
			local50 = local40 & 0x7;
			local54 = Static30.aClass14_Sub4_Sub2_1.method2548();
			local58 = Static30.aClass14_Sub4_Sub2_1.method2548();
			if (local20 >= 0 && local27 >= 0 && local20 < Static195.anInt3965 && local27 < Static298.anInt5716) {
				local79 = local46 + 1;
				if (local20 - local79 <= Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] && local79 + local20 >= Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] && local27 - local79 <= Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] && local79 + local27 >= Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] && Static78.anInt1894 != 0 && local50 > 0 && Static58.anInt1401 < 50 && local31 != -1) {
					Static354.anIntArray649[Static58.anInt1401] = local31;
					Static162.anIntArray300[Static58.anInt1401] = local50;
					Static275.anIntArray475[Static58.anInt1401] = local54;
					Static251.aClass91Array2[Static58.anInt1401] = null;
					Static15.anIntArray544[Static58.anInt1401] = (local27 << 8) + (local20 << 16) + local46;
					Static252.anIntArray439[Static58.anInt1401] = local58;
					Static58.anInt1401++;
				}
			}
		} else if (Static116.anInt2565 == 22) {
			Static30.aClass14_Sub4_Sub2_1.method2548();
			local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
			local27 = Static155.anInt3312 + (local20 >> 4 & 0x7);
			local31 = (local20 & 0x7) + Static167.anInt5369;
			local40 = Static30.aClass14_Sub4_Sub2_1.method2498();
			local46 = Static30.aClass14_Sub4_Sub2_1.method2548();
			local50 = Static30.aClass14_Sub4_Sub2_1.method2501();
			@Pc(223) String local223 = Static30.aClass14_Sub4_Sub2_1.method2496();
			Static20.method455(local46, local50, local31, local27, local40, local223);
		} else if (Static116.anInt2565 == 201) {
			local20 = Static30.aClass14_Sub4_Sub2_1.method2498();
			local27 = Static30.aClass14_Sub4_Sub2_1.method2548();
			Static232.method2200(local20).method1961(local27);
		} else {
			@Pc(313) int local313;
			@Pc(317) int local317;
			@Pc(321) int local321;
			@Pc(325) int local325;
			@Pc(418) Class10_Sub3_Sub4 local418;
			if (Static116.anInt2565 == 249) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local27 = (local20 >> 4 & 0x7) + Static155.anInt3312;
				local31 = Static167.anInt5369 + (local20 & 0x7);
				local40 = local27 + Static30.aClass14_Sub4_Sub2_1.method2553();
				local46 = local31 + Static30.aClass14_Sub4_Sub2_1.method2553();
				local50 = Static30.aClass14_Sub4_Sub2_1.method2502();
				local54 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local58 = Static30.aClass14_Sub4_Sub2_1.method2548() * 4;
				local79 = Static30.aClass14_Sub4_Sub2_1.method2548() * 4;
				local313 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local317 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local321 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local325 = Static30.aClass14_Sub4_Sub2_1.method2548();
				if (local321 == 255) {
					local321 = -1;
				}
				if (local27 >= 0 && local31 >= 0 && Static195.anInt3965 > local27 && local31 < Static298.anInt5716 && local40 >= 0 && local46 >= 0 && local40 < Static195.anInt3965 && local46 < Static298.anInt5716 && local54 != 65535) {
					local31 = local31 * 128 + 64;
					local46 = local46 * 128 + 64;
					local27 = local27 * 128 + 64;
					local40 = local40 * 128 + 64;
					local418 = new Class10_Sub3_Sub4(local54, Static219.anInt4400, local27, local31, Static279.method4730(Static219.anInt4400, local27, local31) - local58, local313 + Static153.anInt3257, Static153.anInt3257 + local317, local321, local325, local50, local79);
					local418.method3436(local40, Static153.anInt3257 + local313, local46, Static279.method4730(Static219.anInt4400, local40, local46) - local79);
					Static69.aClass18_5.method451(new Class14_Sub2_Sub1(local418));
				}
			} else if (Static116.anInt2565 == 73) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local27 = (local20 >> 4 & 0x7) + Static155.anInt3312;
				local31 = Static167.anInt5369 + (local20 & 0x7);
				local40 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local46 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local50 = Static30.aClass14_Sub4_Sub2_1.method2498();
				if (local27 >= 0 && local31 >= 0 && local27 < Static195.anInt3965 && local31 < Static298.anInt5716) {
					local54 = local27 * 128 + 64;
					local58 = local31 * 128 + 64;
					@Pc(521) Class10_Sub3_Sub5 local521 = new Class10_Sub3_Sub5(local40, local50, Static153.anInt3257, Static219.anInt4400, local54, Static279.method4730(Static219.anInt4400, local54, local58) - local46, local58, local27, local27, local31, local31);
					Static54.aClass18_4.method451(new Class14_Sub2_Sub7(local521));
				}
			} else if (Static116.anInt2565 == 159) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local27 = (local20 >> 4 & 0x7) + Static155.anInt3312;
				local31 = (local20 & 0x7) + Static167.anInt5369;
				local40 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local46 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local50 = Static30.aClass14_Sub4_Sub2_1.method2498();
				if (Static65.aClass25_32 != null && local27 >= 0 && local31 >= 0 && local27 < Static195.anInt3965 && local31 < Static298.anInt5716) {
					@Pc(599) Class14_Sub39 local599 = (Class14_Sub39) Static65.aClass25_32.method691((long) (local27 | local31 << 14 | Static219.anInt4400 << 28));
					if (local599 != null) {
						for (@Pc(607) Class14_Sub42 local607 = (Class14_Sub42) local599.aClass18_45.method459(); local607 != null; local607 = (Class14_Sub42) local599.aClass18_45.method453()) {
							if ((local40 & 0x7FFF) == local607.anInt6628 && local607.anInt6627 == local46) {
								local607.method5986();
								local607.anInt6627 = local50;
								Static61.method1355(Static219.anInt4400, local31, local27, local607);
								break;
							}
						}
						Static82.method2034(Static219.anInt4400, local31, local27);
					}
				}
			} else if (Static116.anInt2565 == 227) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2511();
				local27 = (local20 >> 4 & 0x7) + Static155.anInt3312;
				local31 = Static167.anInt5369 + (local20 & 0x7);
				local40 = Static30.aClass14_Sub4_Sub2_1.method2539();
				local46 = local40 >> 2;
				local50 = local40 & 0x3;
				local54 = Static125.anIntArray237[local46];
				if (local27 >= 0 && local31 >= 0 && Static195.anInt3965 > local27 && Static298.anInt5716 > local31) {
					Static27.method689(-1, -1, Static219.anInt4400, local27, local54, 0, local46, local50, local31);
				}
			} else if (Static116.anInt2565 == 125) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local27 = (local20 >> 4 & 0xF) + Static155.anInt3312 * 2;
				local31 = Static167.anInt5369 * 2 + (local20 & 0xF);
				local40 = local27 + Static30.aClass14_Sub4_Sub2_1.method2553();
				local46 = local31 + Static30.aClass14_Sub4_Sub2_1.method2553();
				local50 = Static30.aClass14_Sub4_Sub2_1.method2502();
				local54 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local58 = Static30.aClass14_Sub4_Sub2_1.method2548() * 4;
				local79 = Static30.aClass14_Sub4_Sub2_1.method2548() * 4;
				local313 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local317 = Static30.aClass14_Sub4_Sub2_1.method2498();
				local321 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local325 = Static30.aClass14_Sub4_Sub2_1.method2548();
				if (local321 == 255) {
					local321 = -1;
				}
				if (local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local40 >= 0 && local46 >= 0 && local40 < 208 && local46 < 208 && local54 != 65535) {
					local31 = local31 * 64;
					local40 *= 64;
					local46 *= 64;
					local27 = local27 * 64;
					local418 = new Class10_Sub3_Sub4(local54, Static219.anInt4400, local27, local31, Static279.method4730(Static219.anInt4400, local27, local31) - local58, Static153.anInt3257 + local313, local317 + Static153.anInt3257, local321, local325, local50, local79);
					local418.method3436(local40, local313 + Static153.anInt3257, local46, Static279.method4730(Static219.anInt4400, local40, local46) - local79);
					Static69.aClass18_5.method451(new Class14_Sub2_Sub1(local418));
				}
			} else if (Static116.anInt2565 == 196) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2499();
				local27 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local31 = local27 >> 2;
				local40 = local27 & 0x3;
				local46 = Static125.anIntArray237[local31];
				local50 = Static30.aClass14_Sub4_Sub2_1.method2539();
				local54 = Static155.anInt3312 + (local50 >> 4 & 0x7);
				local58 = Static167.anInt5369 + (local50 & 0x7);
				if (local54 >= 0 && local58 >= 0 && local54 < Static195.anInt3965 && local58 < Static298.anInt5716) {
					Static27.method689(local20, -1, Static219.anInt4400, local54, local46, 0, local31, local40, local58);
				}
			} else if (Static116.anInt2565 == 38) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local27 = Static155.anInt3312 + (local20 >> 4 & 0x7);
				local31 = (local20 & 0x7) + Static167.anInt5369;
				local40 = Static30.aClass14_Sub4_Sub2_1.method2540();
				local46 = Static30.aClass14_Sub4_Sub2_1.method2540();
				local50 = Static30.aClass14_Sub4_Sub2_1.method2505();
				if (local27 >= 0 && local31 >= 0 && local27 < Static195.anInt3965 && Static298.anInt5716 > local31 && local40 != Static266.anInt5054) {
					Static61.method1355(Static219.anInt4400, local31, local27, new Class14_Sub42(local46, local50));
					Static82.method2034(Static219.anInt4400, local31, local27);
				}
			} else if (Static116.anInt2565 == 80) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2540();
				local27 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local31 = (local27 >> 4 & 0x7) + Static155.anInt3312;
				local40 = Static167.anInt5369 + (local27 & 0x7);
				if (local31 >= 0 && local40 >= 0 && local31 < Static195.anInt3965 && Static298.anInt5716 > local40) {
					@Pc(1104) Class14_Sub39 local1104 = (Class14_Sub39) Static65.aClass25_32.method691((long) (Static219.anInt4400 << 28 | local40 << 14 | local31));
					if (local1104 != null) {
						for (@Pc(1112) Class14_Sub42 local1112 = (Class14_Sub42) local1104.aClass18_45.method459(); local1112 != null; local1112 = (Class14_Sub42) local1104.aClass18_45.method453()) {
							if ((local20 & 0x7FFF) == local1112.anInt6628) {
								local1112.method5986();
								break;
							}
						}
						if (local1104.aClass18_45.method452()) {
							local1104.method5986();
						}
						Static82.method2034(Static219.anInt4400, local40, local31);
					}
				}
			} else if (Static116.anInt2565 == 119) {
				local20 = Static30.aClass14_Sub4_Sub2_1.method2499();
				local27 = Static30.aClass14_Sub4_Sub2_1.method2548();
				local31 = Static155.anInt3312 + (local27 >> 4 & 0x7);
				local40 = (local27 & 0x7) + Static167.anInt5369;
				local46 = Static30.aClass14_Sub4_Sub2_1.method2540();
				if (local31 >= 0 && local40 >= 0 && local31 < Static195.anInt3965 && local40 < Static298.anInt5716) {
					Static61.method1355(Static219.anInt4400, local40, local31, new Class14_Sub42(local46, local20));
					Static82.method2034(Static219.anInt4400, local40, local31);
				}
			} else {
				@Pc(1281) int local1281;
				if (Static116.anInt2565 == 157) {
					local20 = Static30.aClass14_Sub4_Sub2_1.method2498();
					@Pc(1227) byte local1227 = Static30.aClass14_Sub4_Sub2_1.method2520();
					local31 = Static30.aClass14_Sub4_Sub2_1.method2539();
					local40 = local31 >> 2;
					local46 = local31 & 0x3;
					local50 = Static30.aClass14_Sub4_Sub2_1.method2502();
					@Pc(1247) byte local1247 = Static30.aClass14_Sub4_Sub2_1.method2533();
					local58 = Static30.aClass14_Sub4_Sub2_1.method2540();
					local79 = Static30.aClass14_Sub4_Sub2_1.method2513();
					local313 = Static155.anInt3312 + (local79 >> 4 & 0x7);
					local317 = Static167.anInt5369 + (local79 & 0x7);
					@Pc(1273) byte local1273 = Static30.aClass14_Sub4_Sub2_1.method2533();
					@Pc(1277) byte local1277 = Static30.aClass14_Sub4_Sub2_1.method2520();
					local1281 = Static30.aClass14_Sub4_Sub2_1.method2499();
					if (!Static218.aClass46_5.method5160()) {
						Static315.method5745(local313, local1273, local1277, local46, local317, local50, local1281, local58, local1227, local40, local20, local1247);
					}
				}
				if (Static116.anInt2565 == 232) {
					local20 = Static30.aClass14_Sub4_Sub2_1.method2548();
					local27 = Static155.anInt3312 * 2 + (local20 >> 4 & 0xF);
					local31 = (local20 & 0xF) + Static167.anInt5369 * 2;
					local40 = Static30.aClass14_Sub4_Sub2_1.method2553() + local27;
					local46 = Static30.aClass14_Sub4_Sub2_1.method2553() + local31;
					local50 = Static30.aClass14_Sub4_Sub2_1.method2502();
					local54 = Static30.aClass14_Sub4_Sub2_1.method2502();
					local58 = Static30.aClass14_Sub4_Sub2_1.method2498();
					local79 = Static30.aClass14_Sub4_Sub2_1.method2553();
					local313 = Static30.aClass14_Sub4_Sub2_1.method2548() * 4;
					local317 = Static30.aClass14_Sub4_Sub2_1.method2498();
					local321 = Static30.aClass14_Sub4_Sub2_1.method2498();
					local325 = Static30.aClass14_Sub4_Sub2_1.method2548();
					if (local325 == 255) {
						local325 = -1;
					}
					local1281 = Static30.aClass14_Sub4_Sub2_1.method2548();
					if (local27 >= 0 && local31 >= 0 && local27 < 208 && local31 < 208 && local40 >= 0 && local46 >= 0 && local40 < 208 && local46 < 208 && local58 != 65535) {
						local46 *= 64;
						local40 = local40 * 64;
						local27 *= 64;
						local31 *= 64;
						if (local50 != 0) {
							@Pc(1449) int local1449;
							@Pc(1457) Class10_Sub3_Sub3 local1457;
							@Pc(1443) int local1443;
							@Pc(1453) int local1453;
							if (local50 >= 0) {
								local1443 = local50 - 1;
								local1449 = local1443 >> 11 & 0xF;
								local1453 = local1443 & 0x7FF;
								local1457 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local1453];
							} else {
								local1443 = -local50 - 1;
								local1449 = local1443 >> 11 & 0xF;
								local1453 = local1443 & 0x7FF;
								if (local1453 == Static266.anInt5054) {
									local1457 = Static173.aClass10_Sub3_Sub3_Sub2_1;
								} else {
									local1457 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local1453];
								}
							}
							if (local1457 != null) {
								@Pc(1495) Class128 local1495 = local1457.method5364();
								if (local1495.anIntArrayArray57 != null && local1495.anIntArrayArray57[local1449] != null) {
									local1453 = local1495.anIntArrayArray57[local1449][0];
									@Pc(1517) int local1517 = local1495.anIntArrayArray57[local1449][2];
									@Pc(1522) int local1522 = local1457.aClass133_7.method3620();
									@Pc(1526) int local1526 = Class14_Sub3_Sub34.anIntArray547[local1522];
									@Pc(1530) int local1530 = Class14_Sub3_Sub34.anIntArray546[local1522];
									@Pc(1540) int local1540 = local1453 * local1530 + local1517 * local1526 >> 15;
									@Pc(1550) int local1550 = local1517 * local1530 - local1526 * local1453 >> 15;
									local79 -= local1495.anIntArrayArray57[local1449][1];
									local27 += local1540;
									local31 += local1550;
								}
							}
						}
						@Pc(1594) Class10_Sub3_Sub4 local1594 = new Class10_Sub3_Sub4(local58, Static219.anInt4400, local27, local31, Static279.method4730(Static219.anInt4400, local27, local31) - local79, local317 + Static153.anInt3257, local321 + Static153.anInt3257, local325, local1281, local54, local313);
						local1594.method3436(local40, Static153.anInt3257 + local317, local46, Static279.method4730(Static219.anInt4400, local40, local46) - local313);
						Static69.aClass18_5.method451(new Class14_Sub2_Sub1(local1594));
					}
				} else if (Static116.anInt2565 == 199) {
					local20 = Static30.aClass14_Sub4_Sub2_1.method2539();
					local27 = local20 >> 2;
					local31 = local20 & 0x3;
					local40 = Static125.anIntArray237[local27];
					local46 = Static30.aClass14_Sub4_Sub2_1.method2498();
					if (local46 == 65535) {
						local46 = -1;
					}
					local50 = Static30.aClass14_Sub4_Sub2_1.method2539();
					local54 = (local50 >> 4 & 0x7) + Static155.anInt3312;
					local58 = Static167.anInt5369 + (local50 & 0x7);
					Static348.method4752(local54, Static219.anInt4400, local27, local58, local46, local40, local31);
				}
			}
		}
	}
}
