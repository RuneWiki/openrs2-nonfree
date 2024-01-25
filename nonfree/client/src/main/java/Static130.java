import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Lclient!bh;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public static int anInt3199 = -1;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method2915() {
		while (true) {
			if (Static281.aClass3_Sub15_Sub1_4.method2434(Static172.anInt4126) >= 15) {
				@Pc(14) int local14 = Static281.aClass3_Sub15_Sub1_4.method2432(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class3_Sub49 local26 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local14);
					@Pc(32) Class2_Sub3_Sub1_Sub2_Sub1 local32;
					if (local26 == null) {
						local32 = new Class2_Sub3_Sub1_Sub2_Sub1();
						local32.anInt6289 = local14;
						local26 = new Class3_Sub49(local32);
						Static60.aClass307_6.method7425((long) local14, local26);
						local19 = true;
						Static482.aClass3_Sub49Array1[Static234.anInt5314++] = local26;
					}
					local32 = local26.aClass2_Sub3_Sub1_Sub2_Sub1_2;
					Static176.anIntArray229[Static377.anInt7132++] = local14;
					local32.anInt6288 = Static364.anInt7008;
					if (local32.aClass22_1 != null && local32.aClass22_1.method422()) {
						Static9.method113(local32);
					}
					@Pc(86) int local86 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
					if (local86 == 1) {
						Static480.anIntArray536[Static111.anInt2930++] = local14;
					}
					local32.method2679(Static604.aClass139_2.method4345(Static281.aClass3_Sub15_Sub1_4.method2432(14)));
					@Pc(112) int local112 = Static281.aClass3_Sub15_Sub1_4.method2432(2);
					@Pc(117) int local117 = Static281.aClass3_Sub15_Sub1_4.method2432(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					@Pc(128) int local128 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
					@Pc(139) int local139 = Static281.aClass3_Sub15_Sub1_4.method2432(3) + 4 << 11 & 0x39A6;
					@Pc(144) int local144 = Static281.aClass3_Sub15_Sub1_4.method2432(5);
					if (local144 > 15) {
						local144 -= 32;
					}
					local32.method5309(local32.aClass22_1.anInt404);
					local32.anInt6275 = local32.aClass22_1.anInt423 << 3;
					if (local19) {
						local32.method5322(local139, true);
					}
					local32.method2683(local128 == 1, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] + local117, local32.method5308(), local112, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] + local144);
					if (local32.aClass22_1.method422()) {
						Static493.method7238(local32.anIntArray378[0], null, local32.anIntArray377[0], local32.aByte128, null, 0, local32);
					}
					continue;
				}
			}
			Static281.aClass3_Sub15_Sub1_4.method2440();
			return;
		}
	}
}
