import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!ni;")
	public static Class162 aClass162_4;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
	public static int anInt6697 = 0;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt6698 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method5208(@OriginalArg(0) Class30 arg0) {
		@Pc(7) int local7 = Static104.anInt2229;
		@Pc(9) int local9 = Static171.anInt3173;
		@Pc(11) int local11 = Static346.anInt6292;
		@Pc(13) int local13 = Static434.anInt7227;
		arg0.method4692(local11, local13, local7, -10660793, local9);
		arg0.method4692(local11 - 2, 16, local7 + 1, -16777216, local9 + 1);
		arg0.method4702(local7 + 1, -16777216, local11 + -2, local13 - 19, local9 + 18);
		Static245.aClass105_4.method5600(Static379.aClass242_95.method5320(Static139.anInt2670), -10660793, local7 + 3, -1, local9 - -14);
		@Pc(72) int local72 = Static284.aClass12_1.method4220();
		@Pc(76) int local76 = Static284.aClass12_1.method4219();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class4_Sub21 local83 = (Class4_Sub21) Static126.aClass258_19.method5538(); local83 != null; local83 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			@Pc(98) int local98 = local9 + (Static83.anInt1893 + -1 + -local78) * 16 + 31;
			@Pc(100) short local100 = -1;
			if (local72 > local7 && local11 + local7 > local72 && local98 - 13 < local76 && local98 + 3 > local76 && local83.aBoolean218) {
				local100 = -256;
			}
			@Pc(137) int[] local137 = null;
			if (Static390.method5265(local83.anInt3041)) {
				local137 = Static390.aClass204_2.method4629((int) local83.aLong82).anIntArray292;
			} else if (local83.anInt3046 != -1) {
				local137 = Static390.aClass204_2.method4629(local83.anInt3046).anIntArray292;
			} else if (Static41.method736(local83.anInt3041)) {
				@Pc(210) Class6_Sub2_Sub1_Sub2 local210 = Static176.aClass6_Sub2_Sub1_Sub2Array1[(int) local83.aLong82];
				if (local210 != null) {
					@Pc(215) Class243 local215 = local210.aClass243_1;
					if (local215.anIntArray613 != null) {
						local215 = local215.method5337(Static155.aClass149_1);
					}
					if (local215 != null) {
						local137 = local215.anIntArray610;
					}
				}
			} else if (Static286.method4000(local83.anInt3041)) {
				@Pc(178) Class71 local178;
				if (local83.anInt3041 == 1006) {
					local178 = Static2.aClass74_13.method1683((int) local83.aLong82);
				} else {
					local178 = Static2.aClass74_13.method1683((int) (local83.aLong82 >>> 32 & 0x7FFFFFFFL));
				}
				if (local178.anIntArray138 != null) {
					local178 = local178.method1626(Static155.aClass149_1);
				}
				if (local178 != null) {
					local137 = local178.anIntArray141;
				}
			}
			@Pc(243) String local243 = Static381.method5199(local83);
			if (local137 != null) {
				local243 = local243 + Static54.method5870(local137);
			}
			Static245.aClass105_4.method5606(local98, local243, local7 + 3, Static429.anIntArray630, Static208.aClass3Array9, local100);
			local78++;
			if (local83.aBoolean217) {
				Static241.aClass3_13.method5877(Static266.aClass215_8.method4976(local243) + local7 + 5, local98 + -12);
			}
		}
		Static19.method436(Static104.anInt2229, Static171.anInt3173, Static346.anInt6292, Static434.anInt7227);
	}
}
