import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
	public static int anInt3001 = 0;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "[Lclient!om;")
	public static final Interface23[] anInterface23Array1 = new Interface23[128];

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "(I)[Lclient!lt;")
	public static Class226[] method2816() {
		return new Class226[] { Static428.aClass226_17, Static113.aClass226_11, Static415.aClass226_16, Static114.aClass226_9, Static640.aClass226_20, Static36.aClass226_2, Static111.aClass226_8, Static41.aClass226_5, Static261.aClass226_12, Static25.aClass226_1, Static626.aClass226_19, Static57.aClass226_6, Static473.aClass226_18, Static368.aClass226_13, Static68.aClass226_15 };
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([[[Lclient!gf;IIIZI)Z")
	public static boolean method2821(@OriginalArg(0) Class128[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(15) byte local15 = arg4 ? 1 : (byte) (anInt3001 & 0xFF);
		if (Static524.aByteArrayArrayArray22[Static324.anInt5529][arg1][arg3] == local15) {
			return false;
		} else if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(52) byte local52 = 0;
			@Pc(54) int local54 = 0;
			Static188.anIntArray609[0] = arg1;
			@Pc(61) int local61 = local52 + 1;
			Static635.anIntArray587[0] = arg3;
			Static524.aByteArrayArrayArray22[Static324.anInt5529][arg1][arg3] = local15;
			while (local61 != local54) {
				@Pc(79) int local79 = Static188.anIntArray609[local54] & 0xFFFF;
				@Pc(87) int local87 = Static188.anIntArray609[local54] >> 16 & 0xFF;
				@Pc(95) int local95 = Static188.anIntArray609[local54] >> 24 & 0xFF;
				@Pc(101) int local101 = Static635.anIntArray587[local54] & 0xFFFF;
				@Pc(109) int local109 = Static635.anIntArray587[local54] >> 16 & 0xFF;
				local54 = local54 + 1 & 0xFFF;
				@Pc(117) boolean local117 = false;
				if ((Static172.aByteArrayArrayArray23[Static324.anInt5529][local79][local101] & 0x4) == 0) {
					local117 = true;
				}
				@Pc(134) boolean local134 = false;
				@Pc(140) int local140;
				@Pc(190) int local190;
				@Pc(240) int local240;
				if (arg0 != null) {
					label237: for (local140 = Static324.anInt5529 + 1; local140 <= 3; local140++) {
						if (arg0[local140] != null && (Static172.aByteArrayArrayArray23[local140][local79][local101] & 0x8) == 0) {
							@Pc(360) Class4_Sub1_Sub1 local360;
							@Pc(370) int local370;
							@Pc(349) Class128 local349;
							@Pc(355) Class299 local355;
							if (local117 && arg0[local140][local79][local101] != null) {
								if (arg0[local140][local79][local101].aClass4_Sub1_Sub2_2 != null) {
									local190 = Static133.method1962(local87);
									if (local190 == arg0[local140][local79][local101].aClass4_Sub1_Sub2_2.aShort67 || arg0[local140][local79][local101].aClass4_Sub1_Sub2_1 != null && local190 == arg0[local140][local79][local101].aClass4_Sub1_Sub2_1.aShort67) {
										continue;
									}
									if (local95 != 0) {
										local240 = Static133.method1962(local95);
										if (local240 == arg0[local140][local79][local101].aClass4_Sub1_Sub2_2.aShort67 || arg0[local140][local79][local101].aClass4_Sub1_Sub2_1 != null && local240 == arg0[local140][local79][local101].aClass4_Sub1_Sub2_1.aShort67) {
											continue;
										}
									}
									if (local109 != 0) {
										local240 = Static133.method1962(local109);
										if (arg0[local140][local79][local101].aClass4_Sub1_Sub2_2.aShort67 == local240 || arg0[local140][local79][local101].aClass4_Sub1_Sub2_1 != null && local240 == arg0[local140][local79][local101].aClass4_Sub1_Sub2_1.aShort67) {
											continue;
										}
									}
								}
								local349 = arg0[local140][local79][local101];
								if (local349.aClass299_2 != null) {
									for (local355 = local349.aClass299_2; local355 != null; local355 = local355.aClass299_3) {
										local360 = local355.aClass4_Sub1_Sub1_1;
										if (local360 instanceof Interface9) {
											@Pc(366) Interface9 local366 = (Interface9) local360;
											local370 = local366.method8366();
											if (local370 == 21) {
												local370 = 19;
											}
											@Pc(381) int local381 = local366.method8367();
											@Pc(387) int local387 = local370 | local381 << 6;
											if (local87 == local387 || local95 != 0 && local95 == local387 || local109 != 0 && local387 == local109) {
												continue label237;
											}
										}
									}
								}
							}
							local349 = arg0[local140][local79][local101];
							if (local349 != null && local349.aClass299_2 != null) {
								for (local355 = local349.aClass299_2; local355 != null; local355 = local355.aClass299_3) {
									local360 = local355.aClass4_Sub1_Sub1_1;
									if (local360.aShort104 != local360.aShort103 || local360.aShort102 != local360.aShort105) {
										for (@Pc(464) int local464 = local360.aShort104; local464 <= local360.aShort103; local464++) {
											for (local370 = local360.aShort105; local370 <= local360.aShort102; local370++) {
												Static524.aByteArrayArrayArray22[local140][local464][local370] = local15;
											}
										}
									}
								}
							}
							Static524.aByteArrayArrayArray22[local140][local79][local101] = local15;
							local134 = true;
						}
					}
				}
				if (local134) {
					local140 = Static177.aClass84Array2[Static324.anInt5529 + 1].method7620(local101, local79);
					if (Static371.anIntArray362[arg2] < local140) {
						Static371.anIntArray362[arg2] = local140;
					}
					local190 = local79 << 9;
					if (Static250.anIntArray249[arg2] > local190) {
						Static250.anIntArray249[arg2] = local190;
					} else if (Static553.anIntArray497[arg2] < local190) {
						Static553.anIntArray497[arg2] = local190;
					}
					local240 = local101 << 9;
					if (local240 < Static497.anIntArray462[arg2]) {
						Static497.anIntArray462[arg2] = local240;
					} else if (local240 > Static442.anIntArray434[arg2]) {
						Static442.anIntArray434[arg2] = local240;
					}
				}
				if (!local117) {
					if (local79 >= 1 && Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] != local15) {
						Static188.anIntArray609[local61] = local79 - 1 | 0x120000 | 0xD3000000;
						Static635.anIntArray587[local61] = local101 | 0x130000;
						local61 = local61 + 1 & 0xFFF;
						Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] = local15;
					}
					@Pc(668) int local668 = ~Static613.anInt9909;
					local101++;
					if (local668 < ~local101) {
						if (local79 - 1 >= 0 && local15 != Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79][local101] & 0x4) == 0 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79 - 1][local101 - 1] & 0x4) == 0) {
							Static188.anIntArray609[local61] = local79 - 1 | 0x120000 | 0x52000000;
							Static635.anIntArray587[local61] = local101 | 0x130000;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] = local15;
							local61 = local61 + 1 & 0xFFF;
						}
						if (local15 != Static524.aByteArrayArrayArray22[Static324.anInt5529][local79][local101]) {
							Static188.anIntArray609[local61] = local79 | 0x520000 | 0x13000000;
							Static635.anIntArray587[local61] = local101 | 0x530000;
							local61 = local61 + 1 & 0xFFF;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79][local101] = local15;
						}
						if (Static271.anInt4910 > local79 + 1 && local15 != Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79][local101] & 0x4) == 0 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79 + 1][local101 - 1] & 0x4) == 0) {
							Static188.anIntArray609[local61] = 0x92000000 | 0x520000 | local79 + 1;
							Static635.anIntArray587[local61] = local101 | 0x530000;
							local61 = local61 + 1 & 0xFFF;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] = local15;
						}
					}
					local101--;
					if (local79 + 1 < Static271.anInt4910 && Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] != local15) {
						Static188.anIntArray609[local61] = local79 + 1 | 0x920000 | 0x53000000;
						Static635.anIntArray587[local61] = local101 | 0x930000;
						Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] = local15;
						local61 = local61 + 1 & 0xFFF;
					}
					local101--;
					if (local101 >= 0) {
						if (local79 - 1 >= 0 && Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] != local15 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79][local101] & 0x4) == 0 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79 - 1][local101 + 1] & 0x4) == 0) {
							Static188.anIntArray609[local61] = 0x12000000 | 0xD20000 | local79 - 1;
							Static635.anIntArray587[local61] = local101 | 0xD30000;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 - 1][local101] = local15;
							local61 = local61 + 1 & 0xFFF;
						}
						if (local15 != Static524.aByteArrayArrayArray22[Static324.anInt5529][local79][local101]) {
							Static188.anIntArray609[local61] = local79 | 0xD20000 | 0x93000000;
							Static635.anIntArray587[local61] = local101 | 0xD30000;
							local61 = local61 + 1 & 0xFFF;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79][local101] = local15;
						}
						if (Static271.anInt4910 > local79 + 1 && Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] != local15 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79][local101] & 0x4) == 0 && (Static172.aByteArrayArrayArray23[Static324.anInt5529][local79 + 1][local101 + 1] & 0x4) == 0) {
							Static188.anIntArray609[local61] = 0xD2000000 | 0x920000 | local79 + 1;
							Static635.anIntArray587[local61] = local101 | 0x930000;
							local61 = local61 + 1 & 0xFFF;
							Static524.aByteArrayArrayArray22[Static324.anInt5529][local79 + 1][local101] = local15;
						}
					}
				}
			}
			if (Static371.anIntArray362[arg2] != -1000000) {
				Static371.anIntArray362[arg2] += 40;
				Static250.anIntArray249[arg2] -= 512;
				Static553.anIntArray497[arg2] += 512;
				Static442.anIntArray434[arg2] += 512;
				Static497.anIntArray462[arg2] -= 512;
			}
			return true;
		}
	}
}
