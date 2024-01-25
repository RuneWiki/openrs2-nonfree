import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
	public static void method6747() {
		@Pc(14) int local14 = Static7.aClass3_Sub15_Sub1_1.method6964(Static382.anInt7091);
		if (local14 == 0) {
			Static58.aByteArrayArrayArray2 = null;
			Static250.method4299(0);
		} else if (local14 == 1) {
			Static178.method3429((byte) 0);
			Static250.method4299(512);
			if (Static232.aByteArrayArrayArray18 != null) {
				Static380.method5915();
			}
		} else {
			Static178.method3429((byte) (Static127.anInt2665 - 4 & 0xFF));
			Static250.method4299(2);
		}
		Static41.anInt1006 = Static420.anInt7829;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!qb;)V")
	public static void method6748(@OriginalArg(1) Class6_Sub1_Sub2 arg0) {
		@Pc(19) int local19 = arg0.anInt8555 - Static223.anInt4829;
		@Pc(31) int local31 = arg0.anInt8561 * 512 + arg0.method7083() * 256;
		@Pc(43) int local43 = arg0.anInt8532 * 512 + arg0.method7083() * 256;
		arg0.anInt8813 += (local43 - arg0.anInt8813) / local19;
		arg0.anInt8598 = 0;
		arg0.anInt8811 += (local31 - arg0.anInt8811) / local19;
		if (arg0.anInt8541 == 0) {
			arg0.method7085(8192);
		}
		if (arg0.anInt8541 == 1) {
			arg0.method7085(12288);
		}
		if (arg0.anInt8541 == 2) {
			arg0.method7085(0);
		}
		if (arg0.anInt8541 == 3) {
			arg0.method7085(4096);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method6749(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static457.anInt8266++;
		Static265.anInt5515 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static392.anInt7211; local7 < Static399.anInt7385; local7++) {
			@Pc(12) Class290[][] local12 = Static279.aClass290ArrayArrayArray7[local7];
			for (local14 = Static165.anInt3845; local14 < Static44.anInt1046; local14++) {
				for (local17 = Static407.anInt7474; local17 < Static33.anInt875; local17++) {
					@Pc(24) Class290 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static30.aBooleanArrayArray3[local14 + Static345.anInt6586 - Static227.anInt4884][local17 + Static345.anInt6586 - Static320.anInt6157] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean640 = true;
							local24.aBoolean641 = true;
							if (local24.aClass98_3 == null) {
								local24.aBoolean639 = false;
							} else {
								local24.aBoolean639 = true;
							}
							Static265.anInt5515++;
						} else {
							local24.aBoolean640 = false;
							local24.aBoolean641 = false;
							local24.aByte98 = 0;
							if (local14 >= Static227.anInt4884 - 16 && local14 <= Static227.anInt4884 + 16 && local17 >= Static320.anInt6157 - 16 && local17 <= Static320.anInt6157 + 16 && (local24.aClass6_Sub2_2 != null || local24.aClass6_Sub2_3 != null || local24.aClass6_Sub4_3 != null || local24.aClass6_Sub4_2 != null || local24.aClass6_Sub3_2 != null || local24.aClass98_3 != null)) {
								Static442.aClass7_1.method1157(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static392.anInt7211; local140 < Static399.anInt7385; local140++) {
			if (Static263.aClass5_9.method7462() && local140 >= arg2 && arg1 != null) {
				local14 = Static30.aBooleanArrayArray3.length;
				if (Static165.anInt3845 + Static30.aBooleanArrayArray3.length > Static126.anInt2626) {
					local14 -= Static165.anInt3845 + Static30.aBooleanArrayArray3.length - Static126.anInt2626;
				}
				local17 = Static30.aBooleanArrayArray3[0].length;
				if (Static407.anInt7474 + Static30.aBooleanArrayArray3[0].length > Static108.anInt2385) {
					local17 -= Static407.anInt7474 + Static30.aBooleanArrayArray3[0].length - Static108.anInt2385;
				}
				@Pc(193) int local193 = Static331.anInt6307;
				while (true) {
					if (local193 >= local14) {
						Static442.aClass7_1.method1156(Static511.aClass52Array3[local140], local140, true);
						break;
					}
					@Pc(200) int local200 = local193 + Static165.anInt3845 - Static331.anInt6307;
					for (@Pc(202) int local202 = Static80.anInt1724; local202 < local17; local202++) {
						Static131.aBooleanArrayArray4[local193][local202] = false;
						if (Static30.aBooleanArrayArray3[local193][local202]) {
							@Pc(221) int local221 = local202 + Static407.anInt7474 - Static80.anInt1724;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static279.aClass290ArrayArrayArray7[local223][local200][local221] != null && Static279.aClass290ArrayArrayArray7[local223][local200][local221].aByte95 == local140) {
									Static131.aBooleanArrayArray4[local193][local202] = Static279.aClass290ArrayArrayArray7[local223][local200][local221].aBoolean640;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static442.aClass7_1.method1156(Static511.aClass52Array3[local140], local140, false);
			}
			Static442.aClass7_1.method1155();
		}
		if (!Static344.method5478(true)) {
			Static344.method5478(false);
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)Lclient!mf;")
	public static Class6_Sub4 method6750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub4_2;
	}
}
