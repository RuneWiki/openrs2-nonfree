import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_195 = new Class194(13, -1);

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
	public static void method5439() {
		while (true) {
			if (Static47.aClass3_Sub9_Sub2_1.method5644(Static94.anInt1852) >= 15) {
				@Pc(12) int local12 = Static47.aClass3_Sub9_Sub2_1.method5642(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					@Pc(26) Class3_Sub43 local26 = (Class3_Sub43) Static545.aClass25_40.method426((long) local12);
					@Pc(32) Class9_Sub2_Sub1_Sub2_Sub2 local32;
					if (local26 == null) {
						local32 = new Class9_Sub2_Sub1_Sub2_Sub2();
						local32.anInt10204 = local12;
						local26 = new Class3_Sub43(local32);
						Static545.aClass25_40.method434((long) local12, local26);
						local19 = true;
						Static179.aClass3_Sub43Array1[Static73.anInt1445++] = local26;
					}
					local32 = local26.aClass9_Sub2_Sub1_Sub2_Sub2_2;
					Static43.anIntArray50[Static596.anInt9702++] = local12;
					local32.anInt10198 = Static648.anInt10294;
					if (local32.aClass309_1 != null && local32.aClass309_1.method7589()) {
						Static250.method6647(local32);
					}
					@Pc(88) int local88 = Static47.aClass3_Sub9_Sub2_1.method5642(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(103) int local103 = Static47.aClass3_Sub9_Sub2_1.method5642(3) + 4 << 11 & 0x3BAE;
					@Pc(110) int local110 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
					if (local110 == 1) {
						Static533.anIntArray99[Static585.anInt9494++] = local12;
					}
					local32.method8644(Static153.aClass2_1.method23(Static47.aClass3_Sub9_Sub2_1.method5642(14)));
					@Pc(142) int local142 = Static47.aClass3_Sub9_Sub2_1.method5642(5);
					if (local142 > 15) {
						local142 -= 32;
					}
					@Pc(151) int local151 = Static47.aClass3_Sub9_Sub2_1.method5642(2);
					@Pc(156) int local156 = Static47.aClass3_Sub9_Sub2_1.method5642(1);
					local32.method8630(local32.aClass309_1.anInt8833);
					local32.anInt10196 = local32.aClass309_1.anInt8862 << 3;
					if (local19) {
						local32.method8621(true, local103);
					}
					local32.method8643(local151, local32.method8619(), Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] + local142, local156 == 1, local88 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0]);
					if (local32.aClass309_1.method7589()) {
						Static280.method4567((Class9_Sub2_Sub1_Sub2_Sub1) null, 0, local32, local32.anIntArray675[0], local32.aByte127, (Class330) null, local32.anIntArray676[0]);
					}
					continue;
				}
			}
			Static47.aClass3_Sub9_Sub2_1.method5649();
			return;
		}
	}
}
