import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lclient!lm;")
	public static Class134 aClass134_139;

	@OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
	public static int anInt6285;

	@OriginalMember(owner = "client!uk", name = "V", descriptor = "Lclient!he;")
	public static final Class1_Sub18 aClass1_Sub18_1 = new Class1_Sub18(0, 0);

	@OriginalMember(owner = "client!uk", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Loaded fonts";

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[200];

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method5396() {
		@Pc(5) String local5 = "www";
		if (Static217.anInt951 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(11) String local11 = "";
		if (Static59.aString51 != null) {
			local11 = "/p=" + Static59.aString51;
		}
		return Class10_Sub1_Sub1.lb == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static331.anInt3763 + "/a=" + Static76.anInt1569 + local11 + "/" : "http://" + local5 + ".runescape.com/l=" + Static331.anInt3763 + "/a=" + Static76.anInt1569 + local11 + "/";
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!ps;)I")
	public static int method5398(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1) {
		if (arg1.anIntArrayArray39 == null || arg0 >= arg1.anIntArrayArray39.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray39[arg0];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local24[local28++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local26;
				}
				if (local40 == 1) {
					local42 = Static174.anIntArray561[local24[local28++]];
				}
				if (local40 == 2) {
					local42 = Static157.anIntArray323[local24[local28++]];
				}
				if (local40 == 3) {
					local42 = Static26.anIntArray29[local24[local28++]];
				}
				@Pc(93) int local93;
				@Pc(104) Class163 local104;
				@Pc(109) int local109;
				@Pc(122) int local122;
				if (local40 == 4) {
					local93 = local24[local28++] << 16;
					@Pc(100) int local100 = local93 + local24[local28++];
					local104 = Static248.method22(local100);
					local109 = local24[local28++];
					if (local109 != -1 && (!Static348.method5333(local109).aBoolean196 || Static228.aBoolean379)) {
						for (local122 = 0; local122 < local104.anIntArray461.length; local122++) {
							if (local104.anIntArray461[local122] == local109 + 1) {
								local42 += local104.anIntArray460[local122];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static81.anIntArray119[local24[local28++]];
				}
				if (local40 == 6) {
					local42 = Class1_Sub25.anIntArray359[Static157.anIntArray323[local24[local28++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static81.anIntArray119[local24[local28++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107;
				}
				if (local40 == 9) {
					for (local93 = 0; local93 < 25; local93++) {
						if (Static87.aBooleanArray8[local93]) {
							local42 += Static157.anIntArray323[local93];
						}
					}
				}
				if (local40 == 10) {
					local93 = local24[local28++] << 16;
					local93 += local24[local28++];
					local104 = Static248.method22(local93);
					local109 = local24[local28++];
					if (local109 != -1 && (!Static348.method5333(local109).aBoolean196 || Static228.aBoolean379)) {
						for (local122 = 0; local122 < local104.anIntArray461.length; local122++) {
							if (local109 + 1 == local104.anIntArray461[local122]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static309.anInt6156;
				}
				if (local40 == 12) {
					local42 = Static231.anInt4827;
				}
				if (local40 == 13) {
					local93 = Static81.anIntArray119[local24[local28++]];
					@Pc(308) int local308 = local24[local28++];
					local42 = (0x1 << local308 & local93) == 0 ? 0 : 1;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 14) {
					local93 = local24[local28++];
					local42 = Static318.method5453(local93);
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 18) {
					local42 = Static92.anInt1755 + (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7);
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 19) {
					local42 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7) + Static98.anInt1911;
				}
				if (local40 == 20) {
					local42 = local24[local28++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local26 += local42;
					}
					if (local35 == 1) {
						local26 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local26 /= local42;
					}
					if (local35 == 3) {
						local26 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[II)[I")
	public static int[] method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < 32; local20++) {
			for (@Pc(24) int local24 = 0; local24 < 36; local24++) {
				@Pc(30) int local30 = arg1[local10];
				if (local30 == 0) {
					if (local24 > 0 && arg1[local10 - 1] != 0) {
						local30 = arg0;
					} else if (local20 > 0 && arg1[local10 - 36] != 0) {
						local30 = arg0;
					} else if (local24 < 35 && arg1[local10 + 1] != 0) {
						local30 = arg0;
					} else if (local20 < 31 && arg1[local10 + 36] != 0) {
						local30 = arg0;
					}
				}
				local8[local10++] = local30;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)V")
	public static void method5400(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(3, arg0);
		local8.method4782();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!ii;)V")
	public static void method5401(@OriginalArg(1) int arg0, @OriginalArg(2) Class105 arg1) {
		Static111.method1801(arg1);
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (arg0 > 1) {
			for (local14 = 0; local14 < Static43.anInt1151; local14++) {
				for (local18 = 0; local18 < Static260.anInt5348; local18++) {
					if ((Static291.aByteArrayArrayArray11[1][local14][local18] & 0x2) == 2) {
						Static298.method5216(local14, local18);
					}
				}
			}
		}
		for (local14 = 0; local14 < arg0; local14++) {
			for (local18 = 0; local18 <= Static260.anInt5348; local18++) {
				for (@Pc(67) int local67 = 0; local67 <= Static43.anInt1151; local67++) {
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(90) int local90;
					@Pc(139) int local139;
					@Pc(236) int local236;
					@Pc(244) int local244;
					@Pc(264) int local264;
					@Pc(268) int local268;
					if ((Static268.aByteArrayArrayArray10[local14][local67][local18] & 0x1) != 0) {
						local84 = local18;
						local86 = local18;
						local88 = local14;
						local90 = local14;
						while (Static260.anInt5348 > local86 && (Static268.aByteArrayArrayArray10[local14][local67][local86 + 1] & 0x1) != 0) {
							local86++;
						}
						while (local84 > 0 && (Static268.aByteArrayArrayArray10[local14][local67][local84 - 1] & 0x1) != 0) {
							local84--;
						}
						label164: while (local88 > 0) {
							for (local139 = local84; local139 <= local86; local139++) {
								if ((Static268.aByteArrayArrayArray10[local88 - 1][local67][local139] & 0x1) == 0) {
									break label164;
								}
							}
							local88--;
						}
						label153: while (local90 < 3) {
							for (local139 = local84; local139 <= local86; local139++) {
								if ((Static268.aByteArrayArrayArray10[local90 + 1][local67][local139] & 0x1) == 0) {
									break label153;
								}
							}
							local90++;
						}
						local139 = (local90 + 1 - local88) * (local86 + 1 - local84);
						if (local139 >= 2) {
							local236 = Static276.anIntArrayArrayArray12[local90][local67][local84] - 240;
							local244 = Static276.anIntArrayArrayArray12[local88][local67][local84];
							Static282.method2957(1, local67 * 128, local67 * 128, local84 * 128, local86 * 128 + 128, local236, local244);
							for (local264 = local88; local264 <= local90; local264++) {
								for (local268 = local84; local268 <= local86; local268++) {
									Static268.aByteArrayArrayArray10[local264][local67][local268] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static268.aByteArrayArrayArray10[local14][local67][local18] & 0x2) != 0) {
						local84 = local67;
						local86 = local67;
						local88 = local14;
						while (local84 > 0 && (Static268.aByteArrayArrayArray10[local14][local84 - 1][local18] & 0x2) != 0) {
							local84--;
						}
						while (Static43.anInt1151 > local86 && (Static268.aByteArrayArrayArray10[local14][local86 + 1][local18] & 0x2) != 0) {
							local86++;
						}
						local90 = local14;
						label217: while (local88 > 0) {
							for (local139 = local84; local139 <= local86; local139++) {
								if ((Static268.aByteArrayArrayArray10[local88 - 1][local139][local18] & 0x2) == 0) {
									break label217;
								}
							}
							local88--;
						}
						label206: while (local90 < 3) {
							for (local139 = local84; local139 <= local86; local139++) {
								if ((Static268.aByteArrayArrayArray10[local90 + 1][local139][local18] & 0x2) == 0) {
									break label206;
								}
							}
							local90++;
						}
						local139 = (local86 + 1 - local84) * (local90 + 1 - local88);
						if (local139 >= 2) {
							local236 = Static276.anIntArrayArrayArray12[local90][local84][local18] - 240;
							local244 = Static276.anIntArrayArrayArray12[local88][local84][local18];
							Static282.method2957(2, local84 * 128, local86 * 128 + 128, local18 * 128, local18 * 128, local236, local244);
							for (local264 = local88; local264 <= local90; local264++) {
								for (local268 = local84; local268 <= local86; local268++) {
									Static268.aByteArrayArrayArray10[local264][local268][local18] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static268.aByteArrayArrayArray10[local14][local67][local18] & 0x4) != 0) {
						local84 = local67;
						local86 = local67;
						local88 = local18;
						local90 = local18;
						while (local88 > 0 && (Static268.aByteArrayArrayArray10[local14][local67][local88 - 1] & 0x4) != 0) {
							local88--;
						}
						while (Static260.anInt5348 > local90 && (Static268.aByteArrayArrayArray10[local14][local67][local90 + 1] & 0x4) != 0) {
							local90++;
						}
						label271: while (local84 > 0) {
							for (local139 = local88; local139 <= local90; local139++) {
								if ((Static268.aByteArrayArrayArray10[local14][local84 - 1][local139] & 0x4) == 0) {
									break label271;
								}
							}
							local84--;
						}
						label260: while (Static43.anInt1151 > local86) {
							for (local139 = local88; local139 <= local90; local139++) {
								if ((Static268.aByteArrayArrayArray10[local14][local86 + 1][local139] & 0x4) == 0) {
									break label260;
								}
							}
							local86++;
						}
						if ((local86 + 1 - local84) * ((local90 + 1) - local88) >= 4) {
							local139 = Static276.anIntArrayArrayArray12[local14][local84][local88];
							Static282.method2957(4, local84 * 128, local86 * 128 + 128, local88 * 128, local90 * 128 + 128, local139, local139);
							for (@Pc(689) int local689 = local84; local689 <= local86; local689++) {
								for (local236 = local88; local236 <= local90; local236++) {
									Static268.aByteArrayArrayArray10[local14][local689][local236] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
