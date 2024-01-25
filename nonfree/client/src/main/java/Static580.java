import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_109 = new Class185(17, -1);

	@OriginalMember(owner = "client!up", name = "j", descriptor = "I")
	public static int anInt9867 = 100;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "I")
	public static int anInt9870 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public static void method8047() {
		while (true) {
			if (Static84.aClass6_Sub8_Sub1_1.method1513(Static125.anInt3103) >= 15) {
				@Pc(14) int local14 = Static84.aClass6_Sub8_Sub1_1.method1512(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class6_Sub42 local26 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local14);
					@Pc(32) Class9_Sub4_Sub2_Sub1_Sub1 local32;
					if (local26 == null) {
						local32 = new Class9_Sub4_Sub2_Sub1_Sub1();
						local32.anInt4299 = local14;
						local26 = new Class6_Sub42(local32);
						Static461.aClass380_35.method8753(local26, (long) local14);
						local19 = true;
						Static303.aClass6_Sub42Array1[Static337.anInt6701++] = local26;
					}
					local32 = local26.aClass9_Sub4_Sub2_Sub1_Sub1_1;
					Static562.anIntArray508[Static288.anInt5977++] = local14;
					local32.anInt4333 = Static369.anInt7055;
					if (local32.aClass158_1 != null && local32.aClass158_1.method4869()) {
						Static626.method8555(local32);
					}
					local32.method1994(Static8.aClass309_1.method7453(Static84.aClass6_Sub8_Sub1_1.method1512(14)));
					@Pc(96) int local96 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
					@Pc(101) int local101 = Static84.aClass6_Sub8_Sub1_1.method1512(5);
					if (local101 > 15) {
						local101 -= 32;
					}
					@Pc(112) int local112 = Static84.aClass6_Sub8_Sub1_1.method1512(5);
					if (local112 > 15) {
						local112 -= 32;
					}
					@Pc(123) int local123 = Static84.aClass6_Sub8_Sub1_1.method1512(2);
					@Pc(128) int local128 = Static84.aClass6_Sub8_Sub1_1.method1512(1);
					if (local128 == 1) {
						Static635.anIntArray570[Static125.anInt3107++] = local14;
					}
					@Pc(150) int local150 = Static84.aClass6_Sub8_Sub1_1.method1512(3) + 4 << 11 & 0x3EE3;
					local32.method3631(local32.aClass158_1.anInt5826);
					local32.anInt4342 = local32.aClass158_1.anInt5813 << 3;
					if (local19) {
						local32.method3633(local150, true);
					}
					local32.method1989(local32.method3620(), local101 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0], local96 == 1, local112 + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0], local123);
					if (local32.aClass158_1.method4869()) {
						Static621.method8510((Class9_Sub4_Sub2_Sub1_Sub2) null, (Class356) null, local32.anIntArray197[0], 0, local32.anIntArray198[0], local32.aByte135, local32);
					}
					continue;
				}
			}
			Static84.aClass6_Sub8_Sub1_1.method1509();
			return;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!sba;)V")
	public static void method8049(@OriginalArg(1) Class302 arg0) {
		if (Static394.anInt7366 == arg0.anInt8868) {
			Static366.aBooleanArray16[arg0.anInt8861] = true;
		}
	}
}
