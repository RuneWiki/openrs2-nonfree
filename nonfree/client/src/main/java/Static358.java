import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	public static int anInt6196;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
	public static int anInt6209;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "Lclient!uj;")
	public static Class349 aClass349_4;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
	public static int anInt6214;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public static void method5348() {
		while (true) {
			if (Static327.aClass2_Sub17_Sub1_1.method2458(Static245.anInt4755) >= 15) {
				@Pc(12) int local12 = Static327.aClass2_Sub17_Sub1_1.method2456(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					@Pc(24) Class2_Sub32 local24 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local12);
					@Pc(30) Class16_Sub1_Sub1_Sub3_Sub1 local30;
					if (local24 == null) {
						local30 = new Class16_Sub1_Sub1_Sub3_Sub1();
						local30.anInt8075 = local12;
						local24 = new Class2_Sub32(local30);
						Static514.aClass323_32.method7477(local24, (long) local12);
						local17 = true;
						Static480.aClass2_Sub32Array1[Static608.anInt10053++] = local24;
					}
					local30 = local24.aClass16_Sub1_Sub1_Sub3_Sub1_2;
					Static363.anIntArray409[Static317.anInt5602++] = local12;
					local30.anInt8110 = Static340.anInt5976;
					if (local30.aClass113_1 != null && local30.aClass113_1.method2743()) {
						Static409.method6031(local30);
					}
					@Pc(84) int local84 = Static327.aClass2_Sub17_Sub1_1.method2456(5);
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(93) int local93 = Static327.aClass2_Sub17_Sub1_1.method2456(2);
					@Pc(98) int local98 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
					@Pc(109) int local109 = (Static327.aClass2_Sub17_Sub1_1.method2456(3) + 4 & 0x5B400007) << 11;
					@Pc(114) int local114 = Static327.aClass2_Sub17_Sub1_1.method2456(5);
					if (local114 > 15) {
						local114 -= 32;
					}
					local30.method1409(Static137.aClass366_1.method8551(Static327.aClass2_Sub17_Sub1_1.method2456(14)));
					@Pc(135) int local135 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
					if (local135 == 1) {
						Static170.anIntArray226[Static570.anInt9337++] = local12;
					}
					local30.method7005(local30.aClass113_1.anInt3238);
					local30.anInt8130 = local30.aClass113_1.anInt3233 << 3;
					if (local17) {
						local30.method7000(true, local109);
					}
					local30.method1410(local30.method6999(), local98 == 1, local114 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0], local93, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] + local84);
					if (local30.aClass113_1.method2743()) {
						Static264.method4366((Class16_Sub1_Sub1_Sub3_Sub2) null, (Class5) null, local30, 0, local30.aByte109, local30.anIntArray594[0], local30.anIntArray595[0]);
					}
					continue;
				}
			}
			Static327.aClass2_Sub17_Sub1_1.method2455();
			return;
		}
	}
}
