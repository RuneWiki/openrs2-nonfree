import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	public static int anInt220;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public static int anInt223 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method177(@OriginalArg(1) Class19 arg0) {
		if (Static407.anInt6710 < 2 && !Static341.aBoolean599 || Static281.aClass247_12 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static341.aBoolean599 && Static407.anInt6710 < 2) {
			local38 = Static388.aString62 + Static146.aClass83_10.method2267(Static178.anInt3423) + Static49.aString28 + " ->";
		} else if (Static434.aBoolean692 && Static384.aClass244_1.method5489(81) && Static407.anInt6710 > 2) {
			local38 = Static200.method3166((Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261.aClass4_261);
		} else {
			@Pc(55) Class4_Sub39 local55 = (Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261;
			local38 = Static200.method3166(local55);
			@Pc(61) int[] local61 = null;
			if (Static441.method5569(local55.anInt5699)) {
				local61 = Static444.aClass206_3.method4703((int) local55.aLong192).anIntArray435;
			} else if (local55.anInt5695 != -1) {
				local61 = Static444.aClass206_3.method4703(local55.anInt5695).anIntArray435;
			} else if (Static323.method4382(local55.anInt5699)) {
				@Pc(89) Class16_Sub1_Sub5_Sub2 local89 = Static143.aClass16_Sub1_Sub5_Sub2Array1[(int) local55.aLong192];
				if (local89 != null) {
					@Pc(94) Class264 local94 = local89.aClass264_1;
					if (local94.anIntArray544 != null) {
						local94 = local94.method5574(Static257.aClass114_1);
					}
					if (local94 != null) {
						local61 = local94.anIntArray547;
					}
				}
			} else if (Static106.method1982(local55.anInt5699)) {
				@Pc(132) Class202 local132;
				if (local55.anInt5699 == 1010) {
					local132 = Static267.aClass262_2.method5560((int) local55.aLong192);
				} else {
					local132 = Static267.aClass262_2.method5560((int) (local55.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local132.anIntArray407 != null) {
					local132 = local132.method4584(Static257.aClass114_1);
				}
				if (local132 != null) {
					local61 = local132.anIntArray408;
				}
			}
			if (local61 != null) {
				local38 = local38 + Static435.method5504(local61);
			}
		}
		if (Static407.anInt6710 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static407.anInt6710 - 2) + Static70.aClass83_31.method2267(Static178.anInt3423);
		}
		if (Static283.aClass247_13 != null) {
			@Pc(252) Class46 local252 = Static283.aClass247_13.method5310(arg0);
			if (local252 == null) {
				local252 = Static331.aClass46_10;
			}
			local252.method5047(Static283.aClass247_13.anInt6838, Static283.aClass247_13.anInt6805, Static239.anInt4519, Static278.anIntArray338, Static385.aClass57Array16, Static327.anInt5675, Static325.aRandom1, local38, Static283.aClass247_13.anInt6772, Static283.aClass247_13.anInt6833, Static283.aClass247_13.anInt6778, Static283.aClass247_13.anInt6803, Static191.anIntArray180, Static413.anInt6861);
			Static302.method4103(Static191.anIntArray180[0], Static191.anIntArray180[3], Static191.anIntArray180[2], Static191.anIntArray180[1]);
		} else if (Static161.aClass247_6 != null && Static393.aClass121_3 == Static196.aClass121_1) {
			@Pc(232) int local232 = Static331.aClass46_10.method5053(Static325.aRandom1, Static385.aClass57Array16, Static278.anIntArray338, Static239.anInt4519, local38, Static290.anInt6409 + 4, Static260.anInt4896 - -16);
			Static302.method4103(Static290.anInt6409 + 4, 16, Static118.aClass89_5.method2340(local38) + local232, Static260.anInt4896);
			return;
		}
	}
}
