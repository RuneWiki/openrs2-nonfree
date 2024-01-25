import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!eo;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_75 = new Class254(84, 6);

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static467.anInt8612++;
		Static480.anInt9428 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static98.anInt2326; local7 < Static192.anInt4157; local7++) {
			@Pc(12) Class224[][] local12 = Static256.aClass224ArrayArrayArray1[local7];
			for (local14 = Static118.anInt2585; local14 < Static275.anInt5345; local14++) {
				for (local17 = Static17.anInt874; local17 < Static67.anInt1577; local17++) {
					@Pc(24) Class224 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static487.aBooleanArrayArray9[local14 + Static203.anInt4358 - Static579.anInt7897][local17 + Static203.anInt4358 - Static266.anInt4817] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean469 = true;
							local24.aBoolean471 = true;
							if (local24.aClass270_1 == null) {
								local24.aBoolean470 = false;
							} else {
								local24.aBoolean470 = true;
							}
							Static480.anInt9428++;
						} else {
							local24.aBoolean469 = false;
							local24.aBoolean471 = false;
							local24.aByte71 = 0;
							if (local14 >= Static579.anInt7897 - 16 && local14 <= Static579.anInt7897 + 16 && local17 >= Static266.anInt4817 - 16 && local17 <= Static266.anInt4817 + 16 && (local24.aClass11_Sub4_3 != null || local24.aClass11_Sub4_2 != null || local24.aClass11_Sub3_2 != null || local24.aClass11_Sub3_1 != null || local24.aClass11_Sub5_2 != null || local24.aClass270_1 != null)) {
								Static83.aClass58_2.method5091(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static98.anInt2326; local140 < Static192.anInt4157; local140++) {
			if (Static114.aClass9_5.method5458() && local140 >= arg2 && arg1 != null) {
				local14 = Static487.aBooleanArrayArray9.length;
				if (Static118.anInt2585 + Static487.aBooleanArrayArray9.length > Static396.anInt7505) {
					local14 -= Static118.anInt2585 + Static487.aBooleanArrayArray9.length - Static396.anInt7505;
				}
				local17 = Static487.aBooleanArrayArray9[0].length;
				if (Static17.anInt874 + Static487.aBooleanArrayArray9[0].length > Static54.anInt1441) {
					local17 -= Static17.anInt874 + Static487.aBooleanArrayArray9[0].length - Static54.anInt1441;
				}
				@Pc(193) int local193 = Static113.anInt2545;
				while (true) {
					if (local193 >= local14) {
						Static83.aClass58_2.method5094(Static47.aClass62Array1[local140], true, local140);
						break;
					}
					@Pc(200) int local200 = local193 + Static118.anInt2585 - Static113.anInt2545;
					for (@Pc(202) int local202 = Static37.anInt1206; local202 < local17; local202++) {
						Static277.aBooleanArrayArray3[local193][local202] = false;
						if (Static487.aBooleanArrayArray9[local193][local202]) {
							@Pc(221) int local221 = local202 + Static17.anInt874 - Static37.anInt1206;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static256.aClass224ArrayArrayArray1[local223][local200][local221] != null && Static256.aClass224ArrayArrayArray1[local223][local200][local221].aByte69 == local140) {
									Static277.aBooleanArrayArray3[local193][local202] = Static256.aClass224ArrayArrayArray1[local223][local200][local221].aBoolean469;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static83.aClass58_2.method5094(Static47.aClass62Array1[local140], false, local140);
			}
			Static83.aClass58_2.method5095();
		}
		if (!Static282.method4621(true)) {
			Static282.method4621(false);
		}
	}
}
