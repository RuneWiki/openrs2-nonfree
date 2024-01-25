import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	public static void method7804() {
		@Pc(8) Class3_Sub2_Sub1 local8 = Static95.aClass292_2.aClass3_Sub2_Sub1_2;
		@Pc(12) int local12 = local8.method2029();
		Static49.anInt1325 = local8.method2039();
		@Pc(20) int local20 = local8.method2060();
		@Pc(24) int local24 = local8.method2039();
		@Pc(36) boolean local36 = local8.method2053() == 1;
		Static202.method3079();
		Static599.method7699(local24);
		local8.method225();
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(63) int local63;
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			for (local52 = 0; local52 < Static497.anInt7926 >> 3; local52++) {
				for (local56 = 0; local56 < Static646.anInt9979 >> 3; local56++) {
					local63 = local8.method216(1);
					if (local63 == 1) {
						Static66.anIntArrayArrayArray1[local48][local52][local56] = local8.method216(26);
					} else {
						Static66.anIntArrayArrayArray1[local48][local52][local56] = -1;
					}
				}
			}
		}
		local8.method219();
		local52 = (Static95.aClass292_2.anInt8012 - local8.anInt2178) / 16;
		Static297.anIntArrayArray21 = new int[local52][4];
		for (local56 = 0; local56 < local52; local56++) {
			for (local63 = 0; local63 < 4; local63++) {
				Static297.anIntArrayArray21[local56][local63] = local8.method2036();
			}
		}
		Static266.anIntArray325 = new int[local52];
		Static253.anIntArray292 = new int[local52];
		Static699.aByteArrayArray23 = new byte[local52][];
		Static186.aByteArrayArray5 = null;
		Static169.aByteArrayArray3 = new byte[local52][];
		Static385.anIntArray437 = new int[local52];
		Static592.aByteArrayArray14 = new byte[local52][];
		Static176.aByteArrayArray4 = new byte[local52][];
		Static469.anIntArray550 = new int[local52];
		Static22.anIntArray50 = new int[local52];
		Static223.anIntArray250 = null;
		local52 = 0;
		for (local63 = 0; local63 < 4; local63++) {
			for (@Pc(219) int local219 = 0; local219 < Static497.anInt7926 >> 3; local219++) {
				for (@Pc(223) int local223 = 0; local223 < Static646.anInt9979 >> 3; local223++) {
					@Pc(233) int local233 = Static66.anIntArrayArrayArray1[local63][local219][local223];
					if (local233 != -1) {
						@Pc(243) int local243 = local233 >> 14 & 0x3FF;
						@Pc(249) int local249 = local233 >> 3 & 0x7FF;
						@Pc(259) int local259 = (local243 / 8 << 8) + local249 / 8;
						for (@Pc(261) int local261 = 0; local261 < local52; local261++) {
							if (Static385.anIntArray437[local261] == local259) {
								local259 = -1;
								break;
							}
						}
						if (local259 != -1) {
							Static385.anIntArray437[local52] = local259;
							@Pc(301) int local301 = local259 >> 8 & 0xFF;
							@Pc(305) int local305 = local259 & 0xFF;
							Static266.anIntArray325[local52] = Static699.aClass182_127.method3978("m" + local301 + "_" + local305);
							Static22.anIntArray50[local52] = Static699.aClass182_127.method3978("l" + local301 + "_" + local305);
							Static253.anIntArray292[local52] = Static699.aClass182_127.method3978("um" + local301 + "_" + local305);
							Static469.anIntArray550[local52] = Static699.aClass182_127.method3978("ul" + local301 + "_" + local305);
							local52++;
						}
					}
				}
			}
		}
		Static326.method4755(local20, local12, local36, 12);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public static void method7805() {
		Static126.aClass22_3.L(Static150.anInt2707, Static580.aClass3_Sub22_24.aClass21_Sub8_1.method3997() == 1 ? Static36.anInt1194 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIILclient!cja;Lclient!cja;)V")
	public static void method7806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub1_Sub2 arg3, @OriginalArg(4) Class9_Sub1_Sub2 arg4) {
		@Pc(4) Class364 local4 = Static309.method4578(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub1_Sub2_2 = arg3;
		local4.aClass9_Sub1_Sub2_1 = arg4;
		@Pc(22) int local22 = Static477.aClass259Array3 == Static378.aClass259Array2 ? 1 : 0;
		if (!arg3.method9093()) {
			arg3.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local22];
			Static52.aClass9_Sub1Array1[local22] = arg3;
		} else if (arg3.method9084()) {
			arg3.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local22];
			Static120.aClass9_Sub1Array2[local22] = arg3;
		} else {
			arg3.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local22];
			Static356.aClass9_Sub1Array4[local22] = arg3;
			Static632.aBoolean653 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9093()) {
			if (arg4.method9084()) {
				arg4.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local22];
				Static120.aClass9_Sub1Array2[local22] = arg4;
				return;
			}
			arg4.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local22];
			Static356.aClass9_Sub1Array4[local22] = arg4;
			Static632.aBoolean653 = true;
			return;
		}
		arg4.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local22];
		Static52.aClass9_Sub1Array1[local22] = arg4;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZII)Z")
	public static boolean method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static275.method4891(arg0, arg1) || Static70.method3134(arg0, arg1);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!uu;[[BB)V")
	public static void method7808(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt10214; local7++) {
			Static445.method5895();
			for (@Pc(15) int local15 = 0; local15 < Static497.anInt7926 >> 3; local15++) {
				for (@Pc(19) int local19 = 0; local19 < Static646.anInt9979 >> 3; local19++) {
					@Pc(29) int local29 = Static66.anIntArrayArrayArray1[local7][local15][local19];
					if (local29 != -1) {
						@Pc(38) int local38 = local29 >> 24 & 0x3;
						if (!arg0.aBoolean680 || local38 == 0) {
							@Pc(51) int local51 = local29 >> 1 & 0x3;
							@Pc(57) int local57 = local29 >> 14 & 0x3FF;
							@Pc(63) int local63 = local29 >> 3 & 0x7FF;
							@Pc(74) int local74 = (local57 / 8 << 8) + (local63 / 8);
							for (@Pc(76) int local76 = 0; local76 < Static385.anIntArray437.length; local76++) {
								if (local74 == Static385.anIntArray437[local76] && arg1[local76] != null) {
									arg0.method8695(arg1[local76], local51, Static455.aClass109Array1, (local57 & 0x7) * 8, local15 * 8, local38, Static153.aClass22_4, local19 * 8, (local63 & 0x7) * 8, local7);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (-34 == -34) {
			;
		}
	}
}
