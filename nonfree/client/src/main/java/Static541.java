import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_183 = new Class151(125, -1);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7235(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static84.method1755("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZII[[[Lclient!dq;I)Z")
	public static boolean method7236(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class73[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(25) byte local25 = arg0 ? 1 : (byte) (Static472.anInt7502 & 0xFF);
		if (local25 == Static558.aByteArrayArrayArray18[Static296.anInt4684][arg2][arg1]) {
			return false;
		} else if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][arg2][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(57) byte local57 = 0;
			@Pc(59) int local59 = 0;
			Static194.anIntArray241[0] = arg2;
			@Pc(66) int local66 = local57 + 1;
			Static449.anIntArray487[0] = arg1;
			Static558.aByteArrayArrayArray18[Static296.anInt4684][arg2][arg1] = local25;
			while (local66 != local59) {
				@Pc(84) int local84 = Static194.anIntArray241[local59] & 0xFFFF;
				@Pc(92) int local92 = Static194.anIntArray241[local59] >> 16 & 0xFF;
				@Pc(100) int local100 = Static194.anIntArray241[local59] >> 24 & 0xFF;
				@Pc(106) int local106 = Static449.anIntArray487[local59] & 0xFFFF;
				@Pc(114) int local114 = Static449.anIntArray487[local59] >> 16 & 0xFF;
				local59 = local59 + 1 & 0xFFF;
				@Pc(122) boolean local122 = false;
				if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local84][local106] & 0x4) == 0) {
					local122 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(142) int local142;
				@Pc(184) int local184;
				@Pc(225) int local225;
				if (arg3 != null) {
					label237: for (local142 = Static296.anInt4684 + 1; local142 <= 3; local142++) {
						if (arg3[local142] != null && (Static47.aByteArrayArrayArray3[local142][local84][local106] & 0x8) == 0) {
							@Pc(327) Class3_Sub1_Sub2 local327;
							@Pc(337) int local337;
							@Pc(316) Class73 local316;
							@Pc(322) Class144 local322;
							if (local122 && arg3[local142][local84][local106] != null) {
								if (arg3[local142][local84][local106].aClass3_Sub1_Sub4_1 != null) {
									local184 = Static590.method7766(local92);
									if (arg3[local142][local84][local106].aClass3_Sub1_Sub4_1.aShort106 == local184 || arg3[local142][local84][local106].aClass3_Sub1_Sub4_2 != null && local184 == arg3[local142][local84][local106].aClass3_Sub1_Sub4_2.aShort106) {
										continue;
									}
									if (local100 != 0) {
										local225 = Static590.method7766(local100);
										if (arg3[local142][local84][local106].aClass3_Sub1_Sub4_1.aShort106 == local225 || arg3[local142][local84][local106].aClass3_Sub1_Sub4_2 != null && local225 == arg3[local142][local84][local106].aClass3_Sub1_Sub4_2.aShort106) {
											continue;
										}
									}
									if (local114 != 0) {
										local225 = Static590.method7766(local114);
										if (arg3[local142][local84][local106].aClass3_Sub1_Sub4_1.aShort106 == local225 || arg3[local142][local84][local106].aClass3_Sub1_Sub4_2 != null && arg3[local142][local84][local106].aClass3_Sub1_Sub4_2.aShort106 == local225) {
											continue;
										}
									}
								}
								local316 = arg3[local142][local84][local106];
								if (local316.aClass144_1 != null) {
									for (local322 = local316.aClass144_1; local322 != null; local322 = local322.aClass144_2) {
										local327 = local322.aClass3_Sub1_Sub2_1;
										if (local327 instanceof Interface20) {
											@Pc(333) Interface20 local333 = (Interface20) local327;
											local337 = local333.method7086();
											if (local337 == 21) {
												local337 = 19;
											}
											@Pc(346) int local346 = local333.method7088();
											@Pc(352) int local352 = local337 | local346 << 6;
											if (local352 == local92 || local100 != 0 && local352 == local100 || local114 != 0 && local114 == local352) {
												continue label237;
											}
										}
									}
								}
							}
							local316 = arg3[local142][local84][local106];
							if (local316 != null && local316.aClass144_1 != null) {
								for (local322 = local316.aClass144_1; local322 != null; local322 = local322.aClass144_2) {
									local327 = local322.aClass3_Sub1_Sub2_1;
									if (local327.aShort124 != local327.aShort123 || local327.aShort122 != local327.aShort125) {
										for (@Pc(421) int local421 = local327.aShort124; local421 <= local327.aShort123; local421++) {
											for (local337 = local327.aShort125; local337 <= local327.aShort122; local337++) {
												Static558.aByteArrayArrayArray18[local142][local421][local337] = local25;
											}
										}
									}
								}
							}
							local136 = true;
							Static558.aByteArrayArrayArray18[local142][local84][local106] = local25;
						}
					}
				}
				if (local136) {
					local142 = Static140.aClass42Array4[Static296.anInt4684 + 1].method7450(local106, local84);
					if (Static27.anIntArray52[arg4] < local142) {
						Static27.anIntArray52[arg4] = local142;
					}
					local184 = local84 << 9;
					local225 = local106 << 9;
					if (local184 < Static533.anIntArray564[arg4]) {
						Static533.anIntArray564[arg4] = local184;
					} else if (Static248.anIntArray296[arg4] < local184) {
						Static248.anIntArray296[arg4] = local184;
					}
					if (local225 < Static481.anIntArray515[arg4]) {
						Static481.anIntArray515[arg4] = local225;
					} else if (local225 > Static289.anIntArray351[arg4]) {
						Static289.anIntArray351[arg4] = local225;
					}
				}
				if (!local122) {
					if (local84 >= 1 && local25 != Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106]) {
						Static194.anIntArray241[local66] = local84 - 1 | 0xD3000000 | 0x120000;
						Static449.anIntArray487[local66] = local106 | 0x130000;
						local66 = local66 + 1 & 0xFFF;
						Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106] = local25;
					}
					local106++;
					if (Static267.anInt4309 > local106) {
						if (local84 - 1 >= 0 && Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106] != local25 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84][local106] & 0x4) == 0 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84 - 1][local106 - 1] & 0x4) == 0) {
							Static194.anIntArray241[local66] = 0x52000000 | 0x120000 | local84 - 1;
							Static449.anIntArray487[local66] = local106 | 0x130000;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
						if (Static558.aByteArrayArrayArray18[Static296.anInt4684][local84][local106] != local25) {
							Static194.anIntArray241[local66] = 0x13000000 | 0x520000 | local84;
							Static449.anIntArray487[local66] = local106 | 0x530000;
							local66 = local66 + 1 & 0xFFF;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84][local106] = local25;
						}
						if (local84 + 1 < Static224.anInt3557 && local25 != Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106] && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84][local106] & 0x4) == 0 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84 + 1][local106 - 1] & 0x4) == 0) {
							Static194.anIntArray241[local66] = local84 + 1 | 0x520000 | 0x92000000;
							Static449.anIntArray487[local66] = local106 | 0x530000;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
					}
					local106--;
					if (local84 + 1 < Static224.anInt3557 && local25 != Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106]) {
						Static194.anIntArray241[local66] = 0x53000000 | 0x920000 | local84 + 1;
						Static449.anIntArray487[local66] = local106 | 0x930000;
						Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106] = local25;
						local66 = local66 + 1 & 0xFFF;
					}
					local106--;
					if (local106 >= 0) {
						if (local84 - 1 >= 0 && Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106] != local25 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84][local106] & 0x4) == 0 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84 - 1][local106 + 1] & 0x4) == 0) {
							Static194.anIntArray241[local66] = local84 - 1 | 0xD20000 | 0x12000000;
							Static449.anIntArray487[local66] = local106 | 0xD30000;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 - 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
						if (Static558.aByteArrayArrayArray18[Static296.anInt4684][local84][local106] != local25) {
							Static194.anIntArray241[local66] = local84 | 0xD20000 | 0x93000000;
							Static449.anIntArray487[local66] = local106 | 0xD30000;
							local66 = local66 + 1 & 0xFFF;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84][local106] = local25;
						}
						if (local84 + 1 < Static224.anInt3557 && local25 != Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106] && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84][local106] & 0x4) == 0 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][local84 + 1][local106 + 1] & 0x4) == 0) {
							Static194.anIntArray241[local66] = local84 + 1 | 0x920000 | 0xD2000000;
							Static449.anIntArray487[local66] = local106 | 0x930000;
							Static558.aByteArrayArrayArray18[Static296.anInt4684][local84 + 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static27.anIntArray52[arg4] != -1000000) {
				Static27.anIntArray52[arg4] += 40;
				Static533.anIntArray564[arg4] -= 512;
				Static248.anIntArray296[arg4] += 512;
				Static289.anIntArray351[arg4] += 512;
				Static481.anIntArray515[arg4] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[BZII[BIII)V")
	public static void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) int local21 = -(arg2 >> 2);
		@Pc(26) int local26 = -(arg2 & 0x3);
		for (@Pc(29) int local29 = -arg5; local29 < 0; local29++) {
			@Pc(37) int local37;
			for (@Pc(33) int local33 = local21; local33 < 0; local33++) {
				local37 = arg6++;
				arg4[local37] = (byte) (arg4[local37] - arg1[arg7++]);
				@Pc(50) int local50 = arg6++;
				arg4[local50] = (byte) (arg4[local50] - arg1[arg7++]);
				@Pc(63) int local63 = arg6++;
				arg4[local63] = (byte) (arg4[local63] - arg1[arg7++]);
				@Pc(76) int local76 = arg6++;
				arg4[local76] = (byte) (arg4[local76] - arg1[arg7++]);
			}
			for (@Pc(95) int local95 = local26; local95 < 0; local95++) {
				local37 = arg6++;
				arg4[local37] = (byte) (arg4[local37] - arg1[arg7++]);
			}
			arg6 += arg0;
			arg7 += arg3;
		}
	}
}
