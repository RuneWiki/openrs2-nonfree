import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public static int anInt3058;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!jv;")
	public static Class138 aClass138_5;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_67 = new Class209("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_57 = new Class265(8, 3);

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_49 = new Class142(8, 0, 4, 1);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
	public static void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
		Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_6.anInt6576);
		Static424.aClass2_Sub23_Sub2_1.method5449(arg0);
		Static424.aClass2_Sub23_Sub2_1.method5449(arg2);
		Static424.aClass2_Sub23_Sub2_1.method5502(arg1);
		Static424.aClass2_Sub23_Sub2_1.method5502(arg3);
		Static103.anInt2416 = 0;
		Static449.anInt7307 = 0;
		Static3.anInt113 = -3;
		Static10.anInt258 = 1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLclient!gg;)Lclient!ae;")
	public static Class4 method2417(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(7) Class4 local7;
		if (Static47.aClass4_2 == null) {
			local7 = new Class4();
		} else {
			local7 = Static47.aClass4_2;
			Static47.aClass4_2 = Static47.aClass4_2.aClass4_1;
			local7.aClass4_1 = null;
			Static360.anInt6968--;
		}
		local7.anInt123 = arg0;
		local7.aClass3_Sub2_1 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method2419() {
		Static47.aClass14_6.method305();
		for (@Pc(13) Class2_Sub22 local13 = (Class2_Sub22) Static248.aClass14_35.method309(); local13 != null; local13 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			if (local13.anInt3716 < 1000) {
				local13.method5866();
				Static47.aClass14_6.method300(local13);
			}
		}
		Static47.aClass14_6.method299(Static248.aClass14_35);
		@Pc(48) int local48 = -1;
		@Pc(53) Class2_Sub15 local53 = (Class2_Sub15) Static360.aClass14_47.method309();
		if (local53 != null) {
			local48 = local53.method2337();
		}
		if (!Static123.aBoolean212) {
			if (local48 == 0 && (Class64_Sub1.lb == 1 && Static373.anInt4900 > 2 || Static387.method5126())) {
				local48 = 2;
			}
			if (local48 == 2 && Static373.anInt4900 > 0 && local53 != null) {
				if (Static182.aClass68_7 == null && Static110.anInt2578 == 0) {
					Static320.method4498(local53.method2336(), local53.method2334());
				} else {
					Static222.anInt4314 = 2;
				}
			}
			if (local48 == 0 && Static373.anInt4900 > 0) {
				Static211.method3339();
			}
			if (Static182.aClass68_7 != null || Static110.anInt2578 != 0) {
				return;
			}
			Static77.aClass2_Sub22_1 = null;
			Static222.anInt4314 = 0;
			return;
		}
		@Pc(69) int local69;
		@Pc(75) int local75;
		if (local48 == -1) {
			local69 = Static109.aClass1_2.method702();
			local75 = Static109.aClass1_2.method698();
			if (Static237.anInt4550 - 10 > local69 || Static296.anInt5305 + Static237.anInt4550 + 10 < local69 || local75 < Static19.anInt5290 - 10 || local75 > Static372.anInt2931 + Static19.anInt5290 + 10) {
				Static123.aBoolean212 = false;
				Static444.method5713(Static372.anInt2931, Static296.anInt5305, Static237.anInt4550, Static19.anInt5290);
			}
		}
		if (local48 != 0) {
			return;
		}
		local69 = Static237.anInt4550;
		local75 = Static19.anInt5290;
		@Pc(132) int local132 = Static296.anInt5305;
		@Pc(136) int local136 = local53.method2334();
		@Pc(142) int local142 = local53.method2336();
		@Pc(144) int local144 = -1;
		@Pc(163) int local163;
		for (@Pc(146) int local146 = 0; local146 < Static373.anInt4900; local146++) {
			if (Static82.aBoolean109) {
				local163 = local75 + (Static373.anInt4900 + -1 + -local146) * 16 + 33;
				if (local136 > local69 && local136 < local69 + local132 && local163 - 13 < local142 && local142 < local163 + 4) {
					local144 = local146;
				}
			} else {
				local163 = (Static373.anInt4900 - local146 - 1) * 16 + local75 + 31;
				if (local69 < local136 && local136 < local69 + local132 && local142 > local163 - 13 && local142 < local163 + 3) {
					local144 = local146;
				}
			}
		}
		if (local144 != -1) {
			local163 = 0;
			@Pc(246) Class249 local246 = new Class249(Static248.aClass14_35);
			for (@Pc(251) Class2_Sub22 local251 = (Class2_Sub22) local246.method5441(); local251 != null; local251 = (Class2_Sub22) local246.method5444()) {
				if (local144 == local163) {
					Static437.method5683(local142, local136, local251);
				}
				local163++;
			}
		}
		Static123.aBoolean212 = false;
		Static444.method5713(Static372.anInt2931, Static296.anInt5305, Static237.anInt4550, Static19.anInt5290);
		return;
	}
}
