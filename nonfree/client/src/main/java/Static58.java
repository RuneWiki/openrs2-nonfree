import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cq", name = "H", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!cq", name = "E", descriptor = "[I")
	public static final int[] anIntArray77 = new int[4096];

	@OriginalMember(owner = "client!cq", name = "J", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_19 = new Class231(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)V")
	public static void method965() {
		@Pc(9) int local9 = Static202.aClass2_Sub17_Sub1_1.method6168();
		@Pc(13) int local13 = Static202.aClass2_Sub17_Sub1_1.method6148();
		@Pc(22) int local22 = Static202.aClass2_Sub17_Sub1_1.method6148();
		@Pc(33) boolean local33 = Static202.aClass2_Sub17_Sub1_1.method6168() == 1;
		Static409.anInt701 = Static202.aClass2_Sub17_Sub1_1.method6119();
		Static70.method1093();
		Static29.method475(local9);
		Static202.aClass2_Sub17_Sub1_1.method5585();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(62) int local62;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static234.anInt3949 >> 3; local51++) {
				for (local55 = 0; local55 < Static371.anInt6492 >> 3; local55++) {
					local62 = Static202.aClass2_Sub17_Sub1_1.method5577(1);
					if (local62 == 1) {
						Static111.anIntArrayArrayArray4[local47][local51][local55] = Static202.aClass2_Sub17_Sub1_1.method5577(26);
					} else {
						Static111.anIntArrayArrayArray4[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static202.aClass2_Sub17_Sub1_1.method5579();
		local51 = (Static302.anInt5465 - Static202.aClass2_Sub17_Sub1_1.anInt7523) / 16;
		Static83.anIntArrayArray38 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static83.anIntArrayArray38[local55][local62] = Static202.aClass2_Sub17_Sub1_1.method6129();
			}
		}
		Static59.anIntArray532 = new int[local51];
		Static246.aByteArrayArray15 = new byte[local51][];
		Static265.anIntArray391 = new int[local51];
		Static423.anIntArray585 = null;
		Static328.aByteArrayArray18 = null;
		Static414.anIntArray577 = new int[local51];
		Static450.anIntArray635 = new int[local51];
		Static388.aByteArrayArray19 = new byte[local51][];
		Static428.aByteArrayArray21 = new byte[local51][];
		Static222.aByteArrayArray12 = new byte[local51][];
		Static437.anIntArray600 = new int[local51];
		local51 = 0;
		for (local62 = 0; local62 < 4; local62++) {
			for (@Pc(186) int local186 = 0; local186 < Static234.anInt3949 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static371.anInt6492 >> 3; local190++) {
					@Pc(200) int local200 = Static111.anIntArrayArrayArray4[local62][local186][local190];
					if (local200 != -1) {
						@Pc(209) int local209 = local200 >> 14 & 0x3FF;
						@Pc(215) int local215 = local200 >> 3 & 0x7FF;
						@Pc(226) int local226 = (local209 / 8 << 8) + (local215 / 8);
						for (@Pc(228) int local228 = 0; local228 < local51; local228++) {
							if (local226 == Static450.anIntArray635[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static450.anIntArray635[local51] = local226;
							@Pc(256) int local256 = local226 >> 8 & 0xFF;
							@Pc(260) int local260 = local226 & 0xFF;
							Static59.anIntArray532[local51] = Static11.aClass171_2.method3668("m" + local256 + "_" + local260);
							Static437.anIntArray600[local51] = Static11.aClass171_2.method3668("l" + local256 + "_" + local260);
							Static414.anIntArray577[local51] = Static11.aClass171_2.method3668("um" + local256 + "_" + local260);
							Static265.anIntArray391[local51] = Static11.aClass171_2.method3668("ul" + local256 + "_" + local260);
							local51++;
						}
					}
				}
			}
		}
		Static144.method2216(local33, 10, local13, local22);
	}
}
