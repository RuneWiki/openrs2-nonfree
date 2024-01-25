import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array15;

	@OriginalMember(owner = "client!wj", name = "O", descriptor = "[I")
	public static int[] anIntArray719;

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
	public static int anInt9502 = 0;

	@OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
	public static int anInt9503 = -1;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
	public static void method7777() {
		@Pc(16) boolean local16 = Static420.aClass6_Sub14_Sub2_2.method6026() == 1;
		@Pc(20) int local20 = Static420.aClass6_Sub14_Sub2_2.method6032();
		@Pc(32) int local32 = Static420.aClass6_Sub14_Sub2_2.method6032();
		Static228.anInt3904 = Static420.aClass6_Sub14_Sub2_2.method6026();
		@Pc(40) int local40 = Static420.aClass6_Sub14_Sub2_2.method6041();
		Static552.method7593();
		Static301.method4219(local40);
		Static420.aClass6_Sub14_Sub2_2.method6045();
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(65) int local65;
		for (@Pc(50) int local50 = 0; local50 < 4; local50++) {
			for (local54 = 0; local54 < Static301.anInt4912 >> 3; local54++) {
				for (local58 = 0; local58 < Static473.anInt7969 >> 3; local58++) {
					local65 = Static420.aClass6_Sub14_Sub2_2.method6052(1);
					if (local65 == 1) {
						Static127.anIntArrayArrayArray9[local50][local54][local58] = Static420.aClass6_Sub14_Sub2_2.method6052(26);
					} else {
						Static127.anIntArrayArrayArray9[local50][local54][local58] = -1;
					}
				}
			}
		}
		Static420.aClass6_Sub14_Sub2_2.method6051();
		local54 = (anInt9502 - Static420.aClass6_Sub14_Sub2_2.anInt7244) / 16;
		Static84.anIntArrayArray25 = new int[local54][4];
		for (local58 = 0; local58 < local54; local58++) {
			for (local65 = 0; local65 < 4; local65++) {
				Static84.anIntArrayArray25[local58][local65] = Static420.aClass6_Sub14_Sub2_2.method6027();
			}
		}
		Static370.anIntArray541 = new int[local54];
		Static196.aByteArrayArray10 = new byte[local54][];
		Static69.aByteArrayArray3 = null;
		Static491.aByteArrayArray24 = new byte[local54][];
		Static193.anIntArray386 = new int[local54];
		Static202.aByteArrayArray11 = new byte[local54][];
		anIntArray719 = null;
		Static35.anIntArray45 = new int[local54];
		Static268.anIntArray440 = new int[local54];
		Static225.anIntArray414 = new int[local54];
		Static340.aByteArrayArray20 = new byte[local54][];
		local54 = 0;
		for (local65 = 0; local65 < 4; local65++) {
			for (@Pc(185) int local185 = 0; local185 < Static301.anInt4912 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static473.anInt7969 >> 3; local189++) {
					@Pc(199) int local199 = Static127.anIntArrayArrayArray9[local65][local185][local189];
					if (local199 != -1) {
						@Pc(208) int local208 = local199 >> 14 & 0x3FF;
						@Pc(214) int local214 = local199 >> 3 & 0x7FF;
						@Pc(224) int local224 = local214 / 8 + (local208 / 8 << 8);
						for (@Pc(226) int local226 = 0; local226 < local54; local226++) {
							if (local224 == Static35.anIntArray45[local226]) {
								local224 = -1;
								break;
							}
						}
						if (local224 != -1) {
							Static35.anIntArray45[local54] = local224;
							@Pc(263) int local263 = local224 >> 8 & 0xFF;
							@Pc(267) int local267 = local224 & 0xFF;
							Static268.anIntArray440[local54] = Static285.aClass251_84.method5863("m" + local263 + "_" + local267);
							Static193.anIntArray386[local54] = Static285.aClass251_84.method5863("l" + local263 + "_" + local267);
							Static225.anIntArray414[local54] = Static285.aClass251_84.method5863("um" + local263 + "_" + local267);
							Static370.anIntArray541[local54] = Static285.aClass251_84.method5863("ul" + local263 + "_" + local267);
							local54++;
						}
					}
				}
			}
		}
		Static242.method3514(local16, local32, 11, local20);
	}
}
