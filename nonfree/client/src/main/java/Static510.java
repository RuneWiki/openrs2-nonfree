import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!fg;")
	public static Class96 aClass96_7;

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	public static int anInt8281 = 0;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	public static void method6880() {
		@Pc(9) int local9 = Static532.aClass3_Sub11_Sub1_2.method5204();
		@Pc(13) int local13 = Static532.aClass3_Sub11_Sub1_2.method5178();
		@Pc(17) int local17 = Static532.aClass3_Sub11_Sub1_2.method5205();
		Static39.anInt749 = Static532.aClass3_Sub11_Sub1_2.method5204();
		@Pc(38) boolean local38 = Static532.aClass3_Sub11_Sub1_2.method5206() == 1;
		Static13.method4619();
		Static261.method3996(local9);
		Static532.aClass3_Sub11_Sub1_2.method1384();
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(63) int local63;
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			for (local52 = 0; local52 < Static54.anInt1038 >> 3; local52++) {
				for (local56 = 0; local56 < Static140.anInt3026 >> 3; local56++) {
					local63 = Static532.aClass3_Sub11_Sub1_2.method1383(1);
					if (local63 == 1) {
						Static358.anIntArrayArrayArray18[local48][local52][local56] = Static532.aClass3_Sub11_Sub1_2.method1383(26);
					} else {
						Static358.anIntArrayArrayArray18[local48][local52][local56] = -1;
					}
				}
			}
		}
		Static532.aClass3_Sub11_Sub1_2.method1392();
		local52 = (Static292.anInt4974 - Static532.aClass3_Sub11_Sub1_2.anInt6128) / 16;
		Static189.anIntArrayArray81 = new int[local52][4];
		for (local56 = 0; local56 < local52; local56++) {
			for (local63 = 0; local63 < 4; local63++) {
				Static189.anIntArrayArray81[local56][local63] = Static532.aClass3_Sub11_Sub1_2.method5186();
			}
		}
		Static274.aByteArrayArray12 = new byte[local52][];
		Static450.anIntArray623 = new int[local52];
		Static401.aByteArrayArray20 = new byte[local52][];
		Static346.aByteArrayArray18 = null;
		Static403.anIntArray428 = new int[local52];
		Static529.anIntArray557 = new int[local52];
		Static58.anIntArray60 = null;
		Static551.aByteArrayArray22 = new byte[local52][];
		Static73.anIntArray77 = new int[local52];
		Static299.anIntArray289 = new int[local52];
		Static308.aByteArrayArray13 = new byte[local52][];
		local52 = 0;
		for (local63 = 0; local63 < 4; local63++) {
			for (@Pc(185) int local185 = 0; local185 < Static54.anInt1038 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static140.anInt3026 >> 3; local189++) {
					@Pc(199) int local199 = Static358.anIntArrayArrayArray18[local63][local185][local189];
					if (local199 != -1) {
						@Pc(208) int local208 = local199 >> 14 & 0x3FF;
						@Pc(214) int local214 = local199 >> 3 & 0x7FF;
						@Pc(225) int local225 = (local208 / 8 << 8) + (local214 / 8);
						for (@Pc(227) int local227 = 0; local227 < local52; local227++) {
							if (Static403.anIntArray428[local227] == local225) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							Static403.anIntArray428[local52] = local225;
							@Pc(260) int local260 = local225 >> 8 & 0xFF;
							@Pc(264) int local264 = local225 & 0xFF;
							Static450.anIntArray623[local52] = Static99.aClass322_36.method6823("m" + local260 + "_" + local264);
							Static73.anIntArray77[local52] = Static99.aClass322_36.method6823("l" + local260 + "_" + local264);
							Static529.anIntArray557[local52] = Static99.aClass322_36.method6823("um" + local260 + "_" + local264);
							Static299.anIntArray289[local52] = Static99.aClass322_36.method6823("ul" + local260 + "_" + local264);
							local52++;
						}
					}
				}
			}
		}
		Static272.method4138(11, local17, local38, local13);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)Z")
	public static boolean method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static329.method6552(arg1, arg0) || Static171.method3051(arg1, arg0);
	}
}
