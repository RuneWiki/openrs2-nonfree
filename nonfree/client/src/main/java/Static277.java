import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!gk;")
	public static Class7_Sub14 aClass7_Sub14_5;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public static int anInt4656;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)V")
	public static void method3697(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static210.aClass7_Sub14_Sub1_4.method1351(Static205.anInt3627) >= 15) {
				@Pc(14) int local14 = Static210.aClass7_Sub14_Sub1_4.method1358(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static171.aClass26_Sub2_Sub4_Sub1Array1[local14] == null) {
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local14] = new Class26_Sub2_Sub4_Sub1();
						Static171.aClass26_Sub2_Sub4_Sub1Array1[local14].anInt7080 = local14;
						local19 = true;
					}
					@Pc(40) Class26_Sub2_Sub4_Sub1 local40 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local14];
					Static228.anIntArray347[Static56.anInt943++] = local14;
					local40.anInt7098 = Static274.anInt4617;
					if (local40.aClass249_1 != null && local40.aClass249_1.method5178()) {
						Static322.method4276(local40);
					}
					@Pc(67) int local67 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
					if (local67 == 1) {
						Static209.anIntArray328[Static42.anInt690++] = local14;
					}
					@Pc(89) int local89 = Static210.aClass7_Sub14_Sub1_4.method1358(3) + 4 << 11 & 0x3E89;
					@Pc(94) int local94 = Static210.aClass7_Sub14_Sub1_4.method1358(1);
					@Pc(103) int local103;
					if (arg0) {
						local103 = Static210.aClass7_Sub14_Sub1_4.method1358(8);
						if (local103 > 127) {
							local103 -= 256;
						}
					} else {
						local103 = Static210.aClass7_Sub14_Sub1_4.method1358(5);
						if (local103 > 15) {
							local103 -= 32;
						}
					}
					@Pc(125) int local125;
					if (arg0) {
						local125 = Static210.aClass7_Sub14_Sub1_4.method1358(8);
						if (local125 > 127) {
							local125 -= 256;
						}
					} else {
						local125 = Static210.aClass7_Sub14_Sub1_4.method1358(5);
						if (local125 > 15) {
							local125 -= 32;
						}
					}
					@Pc(147) int local147 = Static210.aClass7_Sub14_Sub1_4.method1358(2);
					local40.method4827(Static442.aClass98_1.method2241(Static210.aClass7_Sub14_Sub1_4.method1358(14)));
					local40.method5519(local40.aClass249_1.anInt6507);
					local40.anInt7044 = local40.aClass249_1.anInt6543 << 3;
					if (local40.anInt7044 == 0) {
						local40.method5505(0);
					} else if (local19) {
						local40.method5505(local89);
					}
					local40.method4824(local94 == 1, Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0] + local103, Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] + local125, local40.method5512(), local147);
					if (local40.aClass249_1.method5178()) {
						Static130.method2096(0, null, local40, null, local40.aByte102, local40.anIntArray603[0], local40.anIntArray604[0]);
					}
					continue;
				}
			}
			Static210.aClass7_Sub14_Sub1_4.method1353();
			return;
		}
	}
}
