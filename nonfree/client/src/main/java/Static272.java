import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!th;")
	public static Class191_Sub1 aClass191_Sub1_1;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_159 = new Class214(91, 6);

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
	public static int anInt5156 = 1;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V")
	public static void method4368() {
		Static196.aClass4_Sub20_Sub1_4.method3235();
		@Pc(21) int local21 = Static196.aClass4_Sub20_Sub1_4.method3245(8);
		@Pc(30) int local30;
		if (local21 < Static77.anInt1870) {
			for (local30 = local21; local30 < Static77.anInt1870; local30++) {
				Static259.anIntArray382[Static316.anInt5738++] = Static2.anIntArray1[local30];
			}
		}
		if (local21 > Static77.anInt1870) {
			throw new RuntimeException("gnpov1");
		}
		Static77.anInt1870 = 0;
		for (local30 = 0; local30 < local21; local30++) {
			@Pc(68) int local68 = Static2.anIntArray1[local30];
			@Pc(76) Class11_Sub5_Sub2_Sub2 local76 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) local68)).aClass11_Sub5_Sub2_Sub2_2;
			@Pc(81) int local81 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
			if (local81 == 0) {
				Static2.anIntArray1[Static77.anInt1870++] = local68;
				local76.anInt6475 = Static277.anInt2834;
			} else {
				@Pc(104) int local104 = Static196.aClass4_Sub20_Sub1_4.method3245(2);
				if (local104 == 0) {
					Static2.anIntArray1[Static77.anInt1870++] = local68;
					local76.anInt6475 = Static277.anInt2834;
					Static206.anIntArray321[Static222.anInt4450++] = local68;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local104 == 1) {
						Static2.anIntArray1[Static77.anInt1870++] = local68;
						local76.anInt6475 = Static277.anInt2834;
						local148 = Static196.aClass4_Sub20_Sub1_4.method3245(3);
						local76.method5318(1, local148);
						local158 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
						if (local158 == 1) {
							Static206.anIntArray321[Static222.anInt4450++] = local68;
						}
					} else if (local104 == 2) {
						Static2.anIntArray1[Static77.anInt1870++] = local68;
						local76.anInt6475 = Static277.anInt2834;
						if (Static196.aClass4_Sub20_Sub1_4.method3245(1) == 1) {
							local148 = Static196.aClass4_Sub20_Sub1_4.method3245(3);
							local76.method5318(2, local148);
							local158 = Static196.aClass4_Sub20_Sub1_4.method3245(3);
							local76.method5318(2, local158);
						} else {
							local148 = Static196.aClass4_Sub20_Sub1_4.method3245(3);
							local76.method5318(0, local148);
						}
						local148 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
						if (local148 == 1) {
							Static206.anIntArray321[Static222.anInt4450++] = local68;
						}
					} else if (local104 == 3) {
						Static259.anIntArray382[Static316.anInt5738++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Lclient!ue;")
	public static Class253 method4369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class253 local7 = new Class253();
		local7.anInt7191 = -1;
		local7.anInt7192 = arg1 + 5 + 1;
		local7.anInt7189 = -1;
		local7.anInt7190 = arg0 + 6;
		local7.anIntArrayArray55 = new int[local7.anInt7190][local7.anInt7192];
		local7.method5745();
		return local7;
	}
}
