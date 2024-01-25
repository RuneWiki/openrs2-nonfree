import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_43 = new Class217(58, 2);

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt2382 = -1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_76 = new Class189("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "[Lclient!kf;")
	public static final Class128[] aClass128Array2 = new Class128[14];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1821() {
		Static237.aClass3_Sub7_Sub1_1.method1064();
		@Pc(15) int local15 = Static237.aClass3_Sub7_Sub1_1.method1063(8);
		@Pc(24) int local24;
		if (local15 < Static54.anInt1472) {
			for (local24 = local15; local24 < Static54.anInt1472; local24++) {
				Static454.anIntArray534[Static9.anInt191++] = Static319.anIntArray114[local24];
			}
		}
		if (Static54.anInt1472 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static54.anInt1472 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(64) int local64 = Static319.anIntArray114[local24];
			@Pc(68) Class7_Sub2_Sub3_Sub1 local68 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local64];
			@Pc(73) int local73 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
			if (local73 == 0) {
				Static319.anIntArray114[Static54.anInt1472++] = local64;
				local68.anInt4357 = Static253.anInt4787;
			} else {
				@Pc(95) int local95 = Static237.aClass3_Sub7_Sub1_1.method1063(2);
				if (local95 == 0) {
					Static319.anIntArray114[Static54.anInt1472++] = local64;
					local68.anInt4357 = Static253.anInt4787;
					Static444.anIntArray524[Static51.anInt1367++] = local64;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local95 == 1) {
						Static319.anIntArray114[Static54.anInt1472++] = local64;
						local68.anInt4357 = Static253.anInt4787;
						local139 = Static237.aClass3_Sub7_Sub1_1.method1063(3);
						local68.method455(1, local139);
						local149 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
						if (local149 == 1) {
							Static444.anIntArray524[Static51.anInt1367++] = local64;
						}
					} else if (local95 == 2) {
						Static319.anIntArray114[Static54.anInt1472++] = local64;
						local68.anInt4357 = Static253.anInt4787;
						if (Static237.aClass3_Sub7_Sub1_1.method1063(1) == 1) {
							local139 = Static237.aClass3_Sub7_Sub1_1.method1063(3);
							local68.method455(2, local139);
							local149 = Static237.aClass3_Sub7_Sub1_1.method1063(3);
							local68.method455(2, local149);
						} else {
							local139 = Static237.aClass3_Sub7_Sub1_1.method1063(3);
							local68.method455(0, local139);
						}
						local139 = Static237.aClass3_Sub7_Sub1_1.method1063(1);
						if (local139 == 1) {
							Static444.anIntArray524[Static51.anInt1367++] = local64;
						}
					} else if (local95 == 3) {
						Static454.anIntArray534[Static9.anInt191++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!hu;[[BI)V")
	public static void method1827(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.anInt3293; local1++) {
			Static170.method2751();
			for (@Pc(6) int local6 = 0; local6 < Static40.anInt1089 >> 3; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static44.anInt7276 >> 3; local9++) {
					@Pc(18) int local18 = Static201.anIntArrayArrayArray6[local1][local6][local9];
					if (local18 != -1) {
						@Pc(27) int local27 = local18 >> 24 & 0x3;
						if (!arg0.aBoolean286 || local27 == 0) {
							@Pc(38) int local38 = local18 >> 1 & 0x3;
							@Pc(44) int local44 = local18 >> 14 & 0x3FF;
							@Pc(50) int local50 = local18 >> 3 & 0x7FF;
							@Pc(60) int local60 = (local44 / 8 << 8) + local50 / 8;
							for (@Pc(62) int local62 = 0; local62 < Static81.anIntArray204.length; local62++) {
								if (local60 == Static81.anIntArray204[local62] && arg1[local62] != null) {
									arg0.method2683(local27, Static382.aClass29Array3, (local44 & 0x7) * 8, local6 * 8, arg1[local62], local38, (local50 & 0x7) * 8, local9 * 8, Static121.aClass172_3, local1);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
