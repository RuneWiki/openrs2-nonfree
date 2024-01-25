import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!up", name = "N", descriptor = "I")
	public static int anInt7231;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_103 = new Class96("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "[I")
	public static int[] anIntArray544 = new int[1];

	@OriginalMember(owner = "client!up", name = "gb", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_104 = new Class96("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)Z")
	public static boolean method5583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static79.anInt1457++;
		Static311.anInt6533 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static360.anInt6590; local7 < Static29.anInt482; local7++) {
			@Pc(12) Class137[][] local12 = Static131.aClass137ArrayArrayArray2[local7];
			for (local14 = Static210.anInt3764; local14 < Static72.anInt1361; local14++) {
				for (@Pc(17) int local17 = Static194.anInt7614; local17 < Static345.anInt6297; local17++) {
					@Pc(24) Class137 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static6.aBooleanArrayArray3[local14 + Static370.anInt7659 - Static59.anInt1066][local17 + Static370.anInt7659 - Static161.anInt2868] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean294 = true;
							local24.aBoolean293 = true;
							if (local24.aClass167_1 == null) {
								local24.aBoolean292 = false;
							} else {
								local24.aBoolean292 = true;
							}
							Static311.anInt6533++;
						} else {
							local24.aBoolean294 = false;
							local24.aBoolean293 = false;
							local24.aByte50 = 0;
							if (local14 >= Static59.anInt1066 - 16 && local14 <= Static59.anInt1066 + 16 && local17 >= Static161.anInt2868 - 16 && local17 <= Static161.anInt2868 + 16 && (local24.aClass47_Sub2_1 != null || local24.aClass47_Sub2_2 != null || local24.aClass47_Sub4_1 != null || local24.aClass47_Sub4_2 != null || local24.aClass47_Sub5_1 != null || local24.aClass167_1 != null)) {
								Static68.aClass143_1.method5056(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static315.aClass70Array3 == Static256.aClass70Array2;
		for (local14 = Static360.anInt6590; local14 < Static29.anInt482; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static74.aClass121_3.method4605() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static6.aBooleanArrayArray3.length;
				if (Static210.anInt3764 + Static6.aBooleanArrayArray3.length > Static251.anInt4344) {
					local172 -= Static210.anInt3764 + Static6.aBooleanArrayArray3.length - Static251.anInt4344;
				}
				@Pc(192) int local192 = Static6.aBooleanArrayArray3[0].length;
				if (Static194.anInt7614 + Static6.aBooleanArrayArray3[0].length > Static219.anInt3872) {
					local192 -= Static194.anInt7614 + Static6.aBooleanArrayArray3[0].length - Static219.anInt3872;
				}
				@Pc(213) int local213 = Static322.anInt4032;
				while (true) {
					if (local213 >= local172) {
						Static68.aClass143_1.method5051(true, local161, Static256.aClass70Array2[local14], local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static210.anInt3764 - Static322.anInt4032;
					for (@Pc(222) int local222 = Static157.anInt2829; local222 < local192; local222++) {
						Static418.aBooleanArrayArray11[local213][local222] = false;
						if (Static6.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static194.anInt7614 - Static157.anInt2829;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static131.aClass137ArrayArrayArray2[local243][local220][local241] != null && Static131.aClass137ArrayArrayArray2[local243][local220][local241].aByte44 == local14) {
									Static418.aBooleanArrayArray11[local213][local222] = Static131.aClass137ArrayArrayArray2[local243][local220][local241].aBoolean294;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static68.aClass143_1.method5051(false, local161, Static256.aClass70Array2[local14], local14);
			}
			Static68.aClass143_1.method5054();
		}
		if (!Static320.method4414(true)) {
			Static320.method4414(false);
		}
	}
}
