import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public static int anInt5521;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public static int anInt5524;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_9;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt5514 = 0;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt5520 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZBI[[[Lclient!i;)Z")
	public static boolean method4311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub14[][][] arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static121.anInt2729 & 0xFF);
		if (Static269.aByteArrayArrayArray51[Static145.anInt3477][arg0][arg1] == local14) {
			return false;
		} else if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][arg0][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(40) byte local40 = 0;
			@Pc(42) int local42 = 0;
			Static8.anIntArray448[0] = arg0;
			@Pc(54) int local54 = local40 + 1;
			Static129.anIntArray267[0] = arg1;
			Static269.aByteArrayArrayArray51[Static145.anInt3477][arg0][arg1] = local14;
			while (local54 != local42) {
				@Pc(73) int local73 = Static8.anIntArray448[local42] & 0xFFFF;
				@Pc(81) int local81 = Static8.anIntArray448[local42] >> 24 & 0xFF;
				@Pc(87) int local87 = Static129.anIntArray267[local42] & 0xFFFF;
				@Pc(95) int local95 = Static8.anIntArray448[local42] >> 16 & 0xFF;
				@Pc(103) int local103 = Static129.anIntArray267[local42] >> 16 & 0xFF;
				local42 = local42 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				@Pc(113) boolean local113 = false;
				if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][local73][local87] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(132) int local132;
				@Pc(173) int local173;
				label235: for (local132 = Static145.anInt3477 + 1; local132 <= 3; local132++) {
					if ((Static126.aByteArrayArrayArray24[local132][local73][local87] & 0x8) == 0) {
						@Pc(208) int local208;
						@Pc(346) int local346;
						if (local111 && arg4[local132][local73][local87] != null) {
							if (arg4[local132][local73][local87].aClass133_1 != null) {
								local173 = Static223.method936(local95);
								if (arg4[local132][local73][local87].aClass133_1.anInt4872 == local173 || arg4[local132][local73][local87].aClass133_1.anInt4874 == local173) {
									continue;
								}
								if (local81 != 0) {
									local208 = Static223.method936(local81);
									if (arg4[local132][local73][local87].aClass133_1.anInt4872 == local208 || local208 == arg4[local132][local73][local87].aClass133_1.anInt4874) {
										continue;
									}
								}
								if (local103 != 0) {
									local208 = Static223.method936(local103);
									if (local208 == arg4[local132][local73][local87].aClass133_1.anInt4872 || local208 == arg4[local132][local73][local87].aClass133_1.anInt4874) {
										continue;
									}
								}
							}
							if (arg4[local132][local73][local87].aClass152Array1 != null) {
								for (local173 = 0; local173 < arg4[local132][local73][local87].anInt2332; local173++) {
									@Pc(316) int local316 = (int) (arg4[local132][local73][local87].aClass152Array1[local173].aLong181 >> 20 & 0x3L);
									local208 = (int) (arg4[local132][local73][local87].aClass152Array1[local173].aLong181 >> 14 & 0x3FL);
									if (local208 == 21) {
										local208 = 19;
									}
									local346 = local208 | local316 << 6;
									if (local95 == local346 || local81 != 0 && local346 == local81 || local103 != 0 && local103 == local346) {
										continue label235;
									}
								}
							}
						}
						local113 = true;
						@Pc(387) Class1_Sub14 local387 = arg4[local132][local73][local87];
						if (local387 != null && local387.anInt2332 > 0) {
							for (local208 = 0; local208 < local387.anInt2332; local208++) {
								@Pc(412) Class152 local412 = local387.aClass152Array1[local208];
								if (local412.anInt5509 != local412.anInt5510 || local412.anInt5519 != local412.anInt5512) {
									for (local346 = local412.anInt5509; local346 <= local412.anInt5510; local346++) {
										for (@Pc(444) int local444 = local412.anInt5519; local444 <= local412.anInt5512; local444++) {
											Static269.aByteArrayArrayArray51[local132][local346][local444] = local14;
										}
									}
								}
							}
						}
						Static269.aByteArrayArrayArray51[local132][local73][local87] = local14;
					}
				}
				if (local113) {
					local132 = local73 << 7;
					local173 = local87 << 7;
					if (Static287.anIntArrayArrayArray18[Static145.anInt3477 + 1][local73][local87] > Static73.anIntArray186[arg3]) {
						Static73.anIntArray186[arg3] = Static287.anIntArrayArrayArray18[Static145.anInt3477 + 1][local73][local87];
					}
					if (local132 < Static92.anIntArray217[arg3]) {
						Static92.anIntArray217[arg3] = local132;
					} else if (local132 > Static22.anIntArray48[arg3]) {
						Static22.anIntArray48[arg3] = local132;
					}
					if (local173 < Static277.anIntArray596[arg3]) {
						Static277.anIntArray596[arg3] = local173;
					} else if (Static94.anIntArray609[arg3] < local173) {
						Static94.anIntArray609[arg3] = local173;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] != local14) {
						Static8.anIntArray448[local54] = local73 - 1 | 0x120000 | 0xD3000000;
						Static129.anIntArray267[local54] = local87 | 0x130000;
						local54 = local54 + 1 & 0xFFF;
						Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] = local14;
					}
					local87++;
					if (local87 < 104) {
						if (local73 - 1 >= 0 && local14 != Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73][local87] & 0x4) == 0 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73 - 1][local87 - 1] & 0x4) == 0) {
							Static8.anIntArray448[local54] = local73 - 1 | 0x52000000 | 0x120000;
							Static129.anIntArray267[local54] = local87 | 0x130000;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local14 != Static269.aByteArrayArrayArray51[Static145.anInt3477][local73][local87]) {
							Static8.anIntArray448[local54] = local73 | 0x520000 | 0x13000000;
							Static129.anIntArray267[local54] = local87 | 0x530000;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73][local87] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local73 + 1 < 104 && local14 != Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87] && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73][local87] & 0x4) == 0 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73 + 1][local87 - 1] & 0x4) == 0) {
							Static8.anIntArray448[local54] = local73 + 1 | 0x92000000 | 0x520000;
							Static129.anIntArray267[local54] = local87 | 0x530000;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
					}
					local87--;
					if (local73 + 1 < 104 && local14 != Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87]) {
						Static8.anIntArray448[local54] = local73 + 1 | 0x53000000 | 0x920000;
						Static129.anIntArray267[local54] = local87 | 0x930000;
						Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87] = local14;
						local54 = local54 + 1 & 0xFFF;
					}
					local87--;
					if (local87 >= 0) {
						if (local73 - 1 >= 0 && Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] != local14 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73][local87] & 0x4) == 0 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73 - 1][local87 + 1] & 0x4) == 0) {
							Static8.anIntArray448[local54] = local73 - 1 | 0x12000000 | 0xD20000;
							Static129.anIntArray267[local54] = local87 | 0xD30000;
							local54 = local54 + 1 & 0xFFF;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 - 1][local87] = local14;
						}
						if (local14 != Static269.aByteArrayArrayArray51[Static145.anInt3477][local73][local87]) {
							Static8.anIntArray448[local54] = local73 | 0xD20000 | 0x93000000;
							Static129.anIntArray267[local54] = local87 | 0xD30000;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73][local87] = local14;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local73 + 1 < 104 && Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87] != local14 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73][local87] & 0x4) == 0 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][local73 + 1][local87 + 1] & 0x4) == 0) {
							Static8.anIntArray448[local54] = local73 + 1 | 0x920000 | 0xD2000000;
							Static129.anIntArray267[local54] = local87 | 0x930000;
							local54 = local54 + 1 & 0xFFF;
							Static269.aByteArrayArrayArray51[Static145.anInt3477][local73 + 1][local87] = local14;
						}
					}
				}
			}
			if (Static73.anIntArray186[arg3] != -1000000) {
				Static73.anIntArray186[arg3] += 10;
				Static92.anIntArray217[arg3] -= 50;
				Static22.anIntArray48[arg3] += 50;
				Static94.anIntArray609[arg3] += 50;
				Static277.anIntArray596[arg3] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public static void method4312() {
		Static144.aClass155_28.method4364(5);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method4313(@OriginalArg(0) Class25_Sub1_Sub1 arg0) {
		@Pc(8) Class1_Sub5 local8 = (Class1_Sub5) Static156.aClass117_13.method3438(Static94.method4774(arg0.aString26));
		if (local8 == null) {
			return;
		}
		if (local8.aClass1_Sub3_Sub4_2 != null) {
			Static245.aClass1_Sub3_Sub1_2.method520(local8.aClass1_Sub3_Sub4_2);
			local8.aClass1_Sub3_Sub4_2 = null;
		}
		local8.method4742();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZ)V")
	public static void method4314(@OriginalArg(0) boolean arg0) {
		if (Static220.aBoolean270 != arg0) {
			Static220.aBoolean270 = arg0;
			Static206.method3663();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method4315(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		if (local11 > local8) {
			return false;
		}
		for (@Pc(27) int local27 = 0; local27 < local11; local27++) {
			@Pc(38) char local38 = arg1.charAt(local27);
			@Pc(42) char local42 = arg0.charAt(local27);
			if (local38 != local42 && Character.toLowerCase(local38) != Character.toLowerCase(local42) && Character.toUpperCase(local38) != Character.toUpperCase(local42)) {
				return false;
			}
		}
		return true;
	}
}
