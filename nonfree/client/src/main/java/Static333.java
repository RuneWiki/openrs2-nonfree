import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
	public static int anInt5747;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array12;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	public static int anInt5744 = -1;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	public static void method4529() {
		Static146.aClass4_Sub12_Sub1_3.method1136();
		@Pc(13) int local13 = Static146.aClass4_Sub12_Sub1_3.method1143(8);
		@Pc(18) int local18;
		if (local13 < Static12.anInt163) {
			for (local18 = local13; local18 < Static12.anInt163; local18++) {
				Static31.anIntArray35[Static88.anInt1816++] = Static342.anIntArray412[local18];
			}
		}
		if (local13 > Static12.anInt163) {
			throw new RuntimeException("gnpov1");
		}
		Static12.anInt163 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static342.anIntArray412[local18];
			@Pc(60) Class16_Sub1_Sub5_Sub2 local60 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local56];
			@Pc(65) int local65 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
			if (local65 == 0) {
				Static342.anIntArray412[Static12.anInt163++] = local56;
				local60.anInt6015 = Static24.anInt5323;
			} else {
				@Pc(90) int local90 = Static146.aClass4_Sub12_Sub1_3.method1143(2);
				if (local90 == 0) {
					Static342.anIntArray412[Static12.anInt163++] = local56;
					local60.anInt6015 = Static24.anInt5323;
					Static440.anIntArray543[Static41.anInt759++] = local56;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local90 == 1) {
						Static342.anIntArray412[Static12.anInt163++] = local56;
						local60.anInt6015 = Static24.anInt5323;
						local134 = Static146.aClass4_Sub12_Sub1_3.method1143(3);
						local60.method4763(local134, 1);
						local144 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
						if (local144 == 1) {
							Static440.anIntArray543[Static41.anInt759++] = local56;
						}
					} else if (local90 == 2) {
						Static342.anIntArray412[Static12.anInt163++] = local56;
						local60.anInt6015 = Static24.anInt5323;
						if (Static146.aClass4_Sub12_Sub1_3.method1143(1) == 1) {
							local134 = Static146.aClass4_Sub12_Sub1_3.method1143(3);
							local60.method4763(local134, 2);
							local144 = Static146.aClass4_Sub12_Sub1_3.method1143(3);
							local60.method4763(local144, 2);
						} else {
							local134 = Static146.aClass4_Sub12_Sub1_3.method1143(3);
							local60.method4763(local134, 0);
						}
						local134 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
						if (local134 == 1) {
							Static440.anIntArray543[Static41.anInt759++] = local56;
						}
					} else if (local90 == 3) {
						Static31.anIntArray35[Static88.anInt1816++] = local56;
					}
				}
			}
		}
	}
}
