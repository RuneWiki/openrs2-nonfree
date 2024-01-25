import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[B")
	public static final byte[] aByteArray87 = new byte[2048];

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static int anInt7609 = -1;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[Lclient!ab;")
	public static final Class3[] aClass3Array1 = new Class3[8];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!qa;)V")
	public static void method5896(@OriginalArg(1) Class109 arg0) {
		@Pc(7) int local7 = Static309.anInt2246;
		@Pc(9) int local9 = Static24.anInt543;
		@Pc(11) int local11 = Static49.anInt5921;
		@Pc(13) int local13 = Static125.anInt2237;
		arg0.method4743(local7, -10660793, local9, local13, local11);
		arg0.method4743(local7 + 1, -16777216, local9 + 1, 16, local11 - 2);
		arg0.method4723(-16777216, local13 - 19, local7 + 1, local9 + 18, local11 - 2);
		Static139.aClass129_1.method5825(Static141.aClass84_35.method1678(Static167.anInt3118), -10660793, local7 + 3, -1, local9 - -14);
		@Pc(78) int local78 = Static16.aClass228_1.method5485();
		@Pc(82) int local82 = Static16.aClass228_1.method5486();
		@Pc(84) int local84 = 0;
		for (@Pc(89) Class1_Sub8 local89 = (Class1_Sub8) Static8.aClass266_2.method6000(); local89 != null; local89 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			@Pc(104) int local104 = (Static82.anInt1627 - local84 - 1) * 16 + local9 + 31;
			@Pc(106) short local106 = -1;
			if (local78 > local7 && local11 + local7 > local78 && local104 - 13 < local82 && local104 + 3 > local82 && local89.aBoolean96) {
				local106 = -256;
			}
			@Pc(143) int[] local143 = null;
			if (Static396.method5372(local89.anInt1758)) {
				local143 = Static196.aClass139_1.method3228((int) local89.aLong50).anIntArray684;
			} else if (local89.anInt1757 != -1) {
				local143 = Static196.aClass139_1.method3228(local89.anInt1757).anIntArray684;
			} else if (Static302.method4317(local89.anInt1758)) {
				@Pc(176) Class26_Sub2_Sub2_Sub2 local176 = Static410.aClass26_Sub2_Sub2_Sub2Array1[(int) local89.aLong50];
				if (local176 != null) {
					@Pc(181) Class66 local181 = local176.aClass66_1;
					if (local181.anIntArray152 != null) {
						local181 = local181.method1454(Static51.aClass79_1);
					}
					if (local181 != null) {
						local143 = local181.anIntArray151;
					}
				}
			} else if (Static202.method3066(local89.anInt1758)) {
				@Pc(219) Class182 local219;
				if (local89.anInt1758 == 1003) {
					local219 = Static71.aClass105_6.method2336((int) local89.aLong50);
				} else {
					local219 = Static71.aClass105_6.method2336((int) (local89.aLong50 >>> 32 & 0x7FFFFFFFL));
				}
				if (local219.anIntArray425 != null) {
					local219 = local219.method4388(Static51.aClass79_1);
				}
				if (local219 != null) {
					local143 = local219.anIntArray430;
				}
			}
			@Pc(256) String local256 = Static125.method1868(local89);
			if (local143 != null) {
				local256 = local256 + Static31.method549(local143);
			}
			Static139.aClass129_1.method5826(Static63.anIntArray87, local104, local256, Static364.aClass80Array17, local7 + 3, local106);
			if (local89.aBoolean95) {
				Static123.aClass80_5.method6099(local7 + Static167.aClass101_3.method1963(local256) + 5, local104 + -12);
			}
			local84++;
		}
		Static406.method5495(Static49.anInt5921, Static125.anInt2237, Static24.anInt543, Static309.anInt2246);
	}
}
