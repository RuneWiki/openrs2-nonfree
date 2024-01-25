import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_9 = new Class66(16);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
	public static void method1475() {
		@Pc(9) int local9 = Static159.aClass4_Sub11_Sub1_1.method8871();
		@Pc(13) int local13 = Static159.aClass4_Sub11_Sub1_1.method8871();
		@Pc(22) boolean local22 = Static159.aClass4_Sub11_Sub1_1.method8855() == 1;
		Static124.anInt2310 = Static159.aClass4_Sub11_Sub1_1.method8862();
		@Pc(38) int local38 = Static159.aClass4_Sub11_Sub1_1.method8865();
		Static606.method7949();
		Static532.method7158(local38);
		Static159.aClass4_Sub11_Sub1_1.method986();
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(63) int local63;
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			for (local52 = 0; local52 < Static224.anInt3557 >> 3; local52++) {
				for (local56 = 0; local56 < Static267.anInt4309 >> 3; local56++) {
					local63 = Static159.aClass4_Sub11_Sub1_1.method988(1);
					if (local63 == 1) {
						Static418.anIntArrayArrayArray17[local48][local52][local56] = Static159.aClass4_Sub11_Sub1_1.method988(26);
					} else {
						Static418.anIntArrayArrayArray17[local48][local52][local56] = -1;
					}
				}
			}
		}
		Static159.aClass4_Sub11_Sub1_1.method992();
		local52 = (Static583.anInt8992 - Static159.aClass4_Sub11_Sub1_1.anInt10466) / 16;
		Static80.anIntArrayArray8 = new int[local52][4];
		for (local56 = 0; local56 < local52; local56++) {
			for (local63 = 0; local63 < 4; local63++) {
				Static80.anIntArrayArray8[local56][local63] = Static159.aClass4_Sub11_Sub1_1.method8850();
			}
		}
		Static8.aByteArrayArray1 = new byte[local52][];
		Static572.anIntArray632 = new int[local52];
		Static275.aByteArrayArray12 = null;
		Static661.aByteArrayArray28 = new byte[local52][];
		Static142.anIntArray366 = new int[local52];
		Static472.anIntArray505 = new int[local52];
		Static211.anIntArray729 = new int[local52];
		Static146.anIntArray195 = null;
		Static315.aByteArrayArray16 = new byte[local52][];
		Static352.aByteArrayArray21 = new byte[local52][];
		Static311.anIntArray368 = new int[local52];
		local52 = 0;
		for (local63 = 0; local63 < 4; local63++) {
			for (@Pc(195) int local195 = 0; local195 < Static224.anInt3557 >> 3; local195++) {
				for (@Pc(199) int local199 = 0; local199 < Static267.anInt4309 >> 3; local199++) {
					@Pc(209) int local209 = Static418.anIntArrayArrayArray17[local63][local195][local199];
					if (local209 != -1) {
						@Pc(219) int local219 = local209 >> 14 & 0x3FF;
						@Pc(225) int local225 = local209 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local52; local237++) {
							if (Static472.anIntArray505[local237] == local235) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static472.anIntArray505[local52] = local235;
							@Pc(269) int local269 = local235 >> 8 & 0xFF;
							@Pc(273) int local273 = local235 & 0xFF;
							Static311.anIntArray368[local52] = Static151.aClass34_38.method1252("m" + local269 + "_" + local273);
							Static211.anIntArray729[local52] = Static151.aClass34_38.method1252("l" + local269 + "_" + local273);
							Static572.anIntArray632[local52] = Static151.aClass34_38.method1252("um" + local269 + "_" + local273);
							Static142.anIntArray366[local52] = Static151.aClass34_38.method1252("ul" + local269 + "_" + local273);
							local52++;
						}
					}
				}
			}
		}
		Static561.method7434(11, local22, local9, local13);
	}
}
