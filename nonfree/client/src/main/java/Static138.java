import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "F")
	public static float aFloat122;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public static int anInt7421;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString88 = "";

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
	public static boolean aBoolean636 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method5724(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(31) long local31 = arg0;
			while (local31 != 0L) {
				local31 /= 37L;
				local29++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static423.aCharArray7[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public static void method5726() {
		for (@Pc(7) int local7 = 0; local7 < Static47.anInt760; local7++) {
			@Pc(13) int local13 = Static151.anIntArray211[local7];
			@Pc(17) Class47_Sub1_Sub5_Sub1 local17 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local13];
			if (local17 != null) {
				Static379.method5350(local17.aClass196_1.anInt5550, local17);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(CB)Z")
	public static boolean method5728(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)Z")
	public static boolean method5729(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method5730() {
		@Pc(12) int local12 = Static81.aByteArrayArray5.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static81.aByteArrayArray5[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static53.anInt934; local24++) {
					if (Static68.anIntArray59[local14] == Static87.anIntArray412[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static87.anIntArray412[Static53.anInt934] = Static68.anIntArray59[local14];
					local22 = Static53.anInt934++;
				}
				@Pc(71) Class1_Sub14 local71 = new Class1_Sub14(Static81.aByteArrayArray5[local14]);
				@Pc(73) int local73 = 0;
				while (local71.anInt5695 < Static81.aByteArrayArray5[local14].length && local73 < 511 && Static47.anInt760 < 1023) {
					@Pc(90) int local90 = local73++ << 6 | local22;
					@Pc(94) int local94 = local71.method4498();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = (Static68.anIntArray59[local14] >> 8) * 64 + local104 - Static190.anInt3507;
					@Pc(135) int local135 = (Static68.anIntArray59[local14] & 0xFF) * 64 + local108 - Static331.anInt6034;
					@Pc(142) Class196 local142 = Static268.aClass26_1.method429(local71.method4498());
					if (Static307.aClass47_Sub1_Sub5_Sub1Array1[local90] == null && (local142.aByte87 & 0x1) > 0 && local98 == Static29.anInt483 && local121 >= 0 && local142.anInt5550 + local121 < Static80.anInt6558 && local135 >= 0 && local142.anInt5550 + local135 < Static104.anInt2048) {
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local90] = new Class47_Sub1_Sub5_Sub1();
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local90].anInt5358 = local90;
						@Pc(189) Class47_Sub1_Sub5_Sub1 local189 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local90];
						Static151.anIntArray211[Static47.anInt760++] = local90;
						local189.anInt5343 = Static123.anInt2333;
						local189.method3157(local142);
						local189.method4330(local189.aClass196_1.anInt5550);
						local189.anInt5404 = local189.aClass196_1.anInt5547 << 3;
						if (local189.anInt5404 == 0) {
							local189.method4320(0);
						} else {
							local189.method4320(local189.aClass196_1.aByte84 + 4 << 11 & 0x3BB7);
						}
						local189.method3158(true, local189.method4317(), local135, local121, local98);
					}
				}
			}
		}
	}
}
