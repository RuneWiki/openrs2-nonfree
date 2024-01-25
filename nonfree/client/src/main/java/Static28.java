import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_14 = new Class256("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean50 = true;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_15 = new Class256("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method382(@OriginalArg(1) Class26 arg0) {
		if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 != Static292.anInt5291 && (Static176.aClass113ArrayArrayArray3 != null && Static2.method50(arg0, Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92))) {
			Static292.anInt5291 = Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[B")
	public static byte[] method383(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub13 local12 = (Class2_Sub2_Sub13) Static410.aClass164_3.method3874((long) arg0);
		if (local12 == null) {
			@Pc(27) byte[] local27 = new byte[512];
			@Pc(33) Random local33 = new Random((long) arg0);
			for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
				local27[local35] = (byte) local35;
			}
			for (@Pc(50) int local50 = 0; local50 < 255; local50++) {
				@Pc(56) int local56 = 255 - local50;
				@Pc(61) int local61 = Static159.method2512(local56, local33);
				@Pc(65) byte local65 = local27[local61];
				local27[local61] = local27[local56];
				local27[local56] = local27[511 - local50] = local65;
			}
			local12 = new Class2_Sub2_Sub13(local27);
			Static410.aClass164_3.method3877(local12, (long) arg0);
		}
		return local12.aByteArray130;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method385(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static243.anInt4537++;
		Static159.anInt3140 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static351.anInt6183; local7 < Static58.anInt1578; local7++) {
			@Pc(12) Class113[][] local12 = Static176.aClass113ArrayArrayArray3[local7];
			for (local14 = Static165.anInt6202; local14 < Static8.anInt266; local14++) {
				for (@Pc(17) int local17 = Static12.anInt315; local17 < Static257.anInt4830; local17++) {
					@Pc(24) Class113 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static348.aBooleanArrayArray7[local14 + Static178.anInt3432 - Static249.anInt4746][local17 + Static178.anInt3432 - Static404.anInt7034] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean270 = true;
							local24.aBoolean272 = true;
							if (local24.aClass134_1 == null) {
								local24.aBoolean271 = false;
							} else {
								local24.aBoolean271 = true;
							}
							Static159.anInt3140++;
						} else {
							local24.aBoolean270 = false;
							local24.aBoolean272 = false;
							local24.aByte28 = 0;
							if (local14 >= Static249.anInt4746 - 16 && local14 <= Static249.anInt4746 + 16 && local17 >= Static404.anInt7034 - 16 && local17 <= Static404.anInt7034 + 16 && (local24.aClass4_Sub4_2 != null || local24.aClass4_Sub4_1 != null || local24.aClass4_Sub1_2 != null || local24.aClass4_Sub1_3 != null || local24.aClass4_Sub3_1 != null || local24.aClass134_1 != null)) {
								Static151.aClass125_1.method2949(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static77.aClass106Array12 == Static372.aClass106Array11;
		for (local14 = Static351.anInt6183; local14 < Static58.anInt1578; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static444.aClass26_11.method2261() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static348.aBooleanArrayArray7.length;
				if (Static165.anInt6202 + Static348.aBooleanArrayArray7.length > Static86.anInt2009) {
					local172 -= Static165.anInt6202 + Static348.aBooleanArrayArray7.length - Static86.anInt2009;
				}
				@Pc(192) int local192 = Static348.aBooleanArrayArray7[0].length;
				if (Static12.anInt315 + Static348.aBooleanArrayArray7[0].length > Static360.anInt6340) {
					local192 -= Static12.anInt315 + Static348.aBooleanArrayArray7[0].length - Static360.anInt6340;
				}
				@Pc(213) int local213 = Static355.anInt6284;
				while (true) {
					if (local213 >= local172) {
						Static151.aClass125_1.method2950(local14, local161, true, Static372.aClass106Array11[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static165.anInt6202 - Static355.anInt6284;
					for (@Pc(222) int local222 = Static8.anInt260; local222 < local192; local222++) {
						Static24.aBooleanArrayArray1[local213][local222] = false;
						if (Static348.aBooleanArrayArray7[local213][local222]) {
							@Pc(241) int local241 = local222 + Static12.anInt315 - Static8.anInt260;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static176.aClass113ArrayArrayArray3[local243][local220][local241] != null && Static176.aClass113ArrayArrayArray3[local243][local220][local241].aByte33 == local14) {
									Static24.aBooleanArrayArray1[local213][local222] = Static176.aClass113ArrayArrayArray3[local243][local220][local241].aBoolean270;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static151.aClass125_1.method2950(local14, local161, false, Static372.aClass106Array11[local14]);
			}
			Static151.aClass125_1.method2955();
		}
		if (!Static317.method4550(true)) {
			Static317.method4550(false);
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lclient!jr;")
	public static Class59 method386() {
		try {
			return new Class59_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class59) Class.forName("Class59_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class59_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public static void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 13);
		local8.method434();
		local8.anInt657 = arg1;
	}
}
