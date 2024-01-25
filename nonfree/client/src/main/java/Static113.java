import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
	public static int[] anIntArray533;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "[I")
	public static int[] anIntArray534;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt6413;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean433 = true;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt6408 = 0;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt6409 = -1;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString237 = "Connecting to update server";

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt6411 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!sj;)I")
	public static int method5424(@OriginalArg(0) int arg0, @OriginalArg(2) Class181 arg1) {
		if (arg1.anIntArrayArray54 == null || arg0 >= arg1.anIntArrayArray54.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg1.anIntArrayArray54[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local29[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local31;
				}
				if (local40 == 1) {
					local42 = Static334.anIntArray541[local29[local33++]];
				}
				if (local40 == 2) {
					local42 = Static107.anIntArray133[local29[local33++]];
				}
				if (local40 == 3) {
					local42 = Static38.anIntArray54[local29[local33++]];
				}
				@Pc(94) int local94;
				@Pc(105) Class181 local105;
				@Pc(110) int local110;
				@Pc(122) int local122;
				if (local40 == 4) {
					local94 = local29[local33++] << 16;
					@Pc(101) int local101 = local94 + local29[local33++];
					local105 = Static20.method415(local101);
					local110 = local29[local33++];
					if (local110 != -1 && (!Static230.method5537(local110).lb || Static126.aBoolean251)) {
						for (local122 = 0; local122 < local105.anIntArray469.length; local122++) {
							if (local105.anIntArray469[local122] == local110 + 1) {
								local42 += local105.anIntArray456[local122];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static38.anIntArray55[local29[local33++]];
				}
				if (local40 == 6) {
					local42 = Class3_Sub18.anIntArray103[Static107.anIntArray133[local29[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static38.anIntArray55[local29[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417;
				}
				if (local40 == 9) {
					for (local94 = 0; local94 < 25; local94++) {
						if (Static124.aBooleanArray12[local94]) {
							local42 += Static107.anIntArray133[local94];
						}
					}
				}
				if (local40 == 10) {
					local94 = local29[local33++] << 16;
					local94 += local29[local33++];
					local105 = Static20.method415(local94);
					local110 = local29[local33++];
					if (local110 != -1 && (!Static230.method5537(local110).lb || Static126.aBoolean251)) {
						for (local122 = 0; local122 < local105.anIntArray469.length; local122++) {
							if (local105.anIntArray469[local122] == local110 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static338.anInt6576;
				}
				if (local40 == 12) {
					local42 = Static250.anInt4794;
				}
				if (local40 == 13) {
					local94 = Static38.anIntArray55[local29[local33++]];
					@Pc(327) int local327 = local29[local33++];
					local42 = (local94 & 0x1 << local327) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local94 = local29[local33++];
					local42 = Static174.method2862(local94);
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 18) {
					local42 = (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7) + Static186.anInt3094;
				}
				if (local40 == 19) {
					local42 = Static296.anInt5889 + (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7);
				}
				if (local40 == 20) {
					local42 = local29[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local31 += local42;
					}
					if (local35 == 1) {
						local31 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local31 /= local42;
					}
					if (local35 == 3) {
						local31 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(451) Exception local451) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method5425() {
		@Pc(8) int local8 = Static76.aByteArrayArray8.length;
		for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
			if (Static76.aByteArrayArray8[local16] != null) {
				@Pc(24) int local24 = -1;
				for (@Pc(26) int local26 = 0; local26 < Static51.anInt1105; local26++) {
					if (Static190.anIntArray334[local26] == Static169.anIntArray239[local16]) {
						local24 = local26;
						break;
					}
				}
				if (local24 == -1) {
					Static190.anIntArray334[Static51.anInt1105] = Static169.anIntArray239[local16];
					local24 = Static51.anInt1105++;
				}
				@Pc(70) Class3_Sub4 local70 = new Class3_Sub4(Static76.aByteArrayArray8[local16]);
				@Pc(72) int local72 = 0;
				while (Static76.aByteArrayArray8[local16].length > local70.anInt4268 && local72 < 511 && Static42.anInt897 < 1023) {
					@Pc(91) int local91 = local72++ << 6 | local24;
					@Pc(95) int local95 = local70.method3649();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(121) int local121 = local105 + (Static169.anIntArray239[local16] >> 8) * 64 - Static186.anInt3094;
					@Pc(134) int local134 = local109 + (Static169.anIntArray239[local16] & 0xFF) * 64 - Static296.anInt5889;
					@Pc(140) Class119 local140 = Static339.method4911(local70.method3649());
					if (Static244.aClass5_Sub4_Sub4_Sub2Array1[local91] == null && (local140.aByte37 & 0x1) > 0 && Static353.anInt6829 == local99 && local121 >= 0 && local140.anInt3645 + local121 < Static162.anInt2152 && local134 >= 0 && local140.anInt3645 + local134 < Static122.anInt2632) {
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local91] = new Class5_Sub4_Sub4_Sub2();
						Static244.aClass5_Sub4_Sub4_Sub2Array1[local91].anInt4946 = local91;
						@Pc(197) Class5_Sub4_Sub4_Sub2 local197 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local91];
						Static130.anIntArray180[Static42.anInt897++] = local91;
						local197.anInt4921 = Static51.anInt1101;
						local197.method4223(local140);
						local197.method4205(local197.aClass119_1.anInt3645);
						local197.anInt4931 = local197.aClass119_1.anInt3659 << 3;
						if (local197.anInt4931 == 0) {
							local197.method4210(0);
						} else {
							local197.method4210(Static147.anIntArray208[local197.aClass119_1.aByte36 - 1]);
						}
						local197.method4212(true, local99, local121, local134, local197.method4208());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
	public static int method5426(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(21) Class3_Sub43 local21 = (Class3_Sub43) Static24.aClass24_29.method609((long) arg0);
		if (local21 == null) {
			return Static149.method2425(arg0).anInt3882;
		}
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < local21.anIntArray560.length; local32++) {
			if (local21.anIntArray560[local32] == -1) {
				local30++;
			}
		}
		return local30 + Static149.method2425(arg0).anInt3882 - local21.anIntArray560.length;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
	public static void method5427(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static81.aByteArrayArray9;
		} else {
			local9 = Static73.aByteArrayArray7;
		}
		@Pc(24) int local24 = Static290.aByteArrayArray19.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(32) byte[] local32 = local9[local26];
			if (local32 != null) {
				@Pc(44) int local44 = (Static169.anIntArray239[local26] >> 8) * 64 - Static186.anInt3094;
				@Pc(55) int local55 = (Static169.anIntArray239[local26] & 0xFF) * 64 - Static296.anInt5889;
				Static123.method2158();
				Static303.method4717(local32, local44, Static34.aClass13Array1, arg0, local55, Static212.aClass122_2);
			}
		}
	}
}
