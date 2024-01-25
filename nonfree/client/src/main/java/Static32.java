import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
	public static int anInt534 = 0;

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_16 = new Class88("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)I")
	public static int method686() {
		return 16;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method687(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static69.anInt9137++;
		Static96.anInt2250 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static477.anInt8709; local7 < Static36.anInt8450; local7++) {
			@Pc(12) Class37[][] local12 = Static120.aClass37ArrayArrayArray1[local7];
			for (local14 = Static355.anInt6649; local14 < Static59.anInt1440; local14++) {
				for (@Pc(17) int local17 = Static415.anInt3796; local17 < Static369.anInt6844; local17++) {
					@Pc(24) Class37 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static243.aBooleanArrayArray6[local14 + Static307.anInt5970 - Static176.anInt3987][local17 + Static307.anInt5970 - Static412.anInt7717] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean48 = true;
							local24.aBoolean47 = true;
							if (local24.aClass243_3 == null) {
								local24.aBoolean49 = false;
							} else {
								local24.aBoolean49 = true;
							}
							Static96.anInt2250++;
						} else {
							local24.aBoolean48 = false;
							local24.aBoolean47 = false;
							local24.aByte26 = 0;
							if (local14 >= Static176.anInt3987 - 16 && local14 <= Static176.anInt3987 + 16 && local17 >= Static412.anInt7717 - 16 && local17 <= Static412.anInt7717 + 16 && (local24.aClass30_Sub2_2 != null || local24.aClass30_Sub2_1 != null || local24.aClass30_Sub4_2 != null || local24.aClass30_Sub4_1 != null || local24.aClass30_Sub3_1 != null || local24.aClass243_3 != null)) {
								Static308.aClass126_1.method7344(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static67.aClass215Array2 == Static51.aClass215Array6;
		for (local14 = Static477.anInt8709; local14 < Static36.anInt8450; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static286.aClass42_5.method5843() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static243.aBooleanArrayArray6.length;
				if (Static355.anInt6649 + Static243.aBooleanArrayArray6.length > Static537.anInt9566) {
					local172 -= Static355.anInt6649 + Static243.aBooleanArrayArray6.length - Static537.anInt9566;
				}
				@Pc(192) int local192 = Static243.aBooleanArrayArray6[0].length;
				if (Static415.anInt3796 + Static243.aBooleanArrayArray6[0].length > Static509.anInt9164) {
					local192 -= Static415.anInt3796 + Static243.aBooleanArrayArray6[0].length - Static509.anInt9164;
				}
				@Pc(213) int local213 = Static105.anInt2406;
				while (true) {
					if (local213 >= local172) {
						Static308.aClass126_1.method7339(local161, local14, Static51.aClass215Array6[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static355.anInt6649 - Static105.anInt2406;
					for (@Pc(222) int local222 = Static256.anInt5235; local222 < local192; local222++) {
						Static143.aBooleanArrayArray3[local213][local222] = false;
						if (Static243.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static415.anInt3796 - Static256.anInt5235;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static120.aClass37ArrayArrayArray1[local243][local220][local241] != null && Static120.aClass37ArrayArrayArray1[local243][local220][local241].aByte23 == local14) {
									Static143.aBooleanArrayArray3[local213][local222] = Static120.aClass37ArrayArrayArray1[local243][local220][local241].aBoolean48;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static308.aClass126_1.method7339(local161, local14, Static51.aClass215Array6[local14], false);
			}
			Static308.aClass126_1.method7342();
		}
		if (!Static286.method4675(true)) {
			Static286.method4675(false);
		}
	}
}
