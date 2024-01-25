import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!jfa;")
	public static final Class178 aClass178_1 = new Class178();

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_7 = new Class108(2, 2);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
	public static void method4163() {
		for (@Pc(1) int local1 = 0; local1 < Static23.anInt559; local1++) {
			@Pc(6) Class34_Sub1_Sub1 local6 = Static579.aClass34_Sub1_Sub1Array1[local1];
			Static525.method6827(local6, true);
			Static579.aClass34_Sub1_Sub1Array1[local1] = null;
		}
		Static23.anInt559 = 0;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Z)V")
	public static void method4164() {
		Static218.method3194(Static264.aClass265_8);
		Static310.anInt5192++;
		if (Static464.aBoolean528 && Static52.aBoolean75) {
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			if (Static498.aBoolean757) {
				local31 = Static84.method1336();
				local33 = Static614.method8324();
			}
			@Pc(47) int local47 = Static627.aClass48_1.method7512() + local31;
			@Pc(53) int local53 = local33 + Static627.aClass48_1.method7511();
			local53 -= Static260.anInt4561;
			local47 -= Static548.anInt8559;
			if (Static381.anInt6391 > local47) {
				local47 = Static381.anInt6391;
			}
			if (Static264.aClass265_8.anInt7024 + local47 > Static478.aClass265_12.anInt7024 + Static381.anInt6391) {
				local47 = Static478.aClass265_12.anInt7024 + Static381.anInt6391 - Static264.aClass265_8.anInt7024;
			}
			if (Static450.anInt7241 > local53) {
				local53 = Static450.anInt7241;
			}
			if (Static478.aClass265_12.anInt6997 + Static450.anInt7241 < local53 + Static264.aClass265_8.anInt6997) {
				local53 = Static478.aClass265_12.anInt6997 + Static450.anInt7241 - Static264.aClass265_8.anInt6997;
			}
			@Pc(127) int local127 = local47 + Static478.aClass265_12.anInt7033 - Static381.anInt6391;
			@Pc(135) int local135 = local53 + Static478.aClass265_12.anInt7002 - Static450.anInt7241;
			@Pc(185) Class3_Sub53 local185;
			if (Static627.aClass48_1.method7515()) {
				if (Static310.anInt5192 > Static264.aClass265_8.anInt6978) {
					@Pc(147) int local147 = local47 - Static340.anInt5862;
					@Pc(152) int local152 = local53 - Static292.anInt5089;
					if (local147 > Static264.aClass265_8.anInt7031 || local147 < -Static264.aClass265_8.anInt7031 || local152 > Static264.aClass265_8.anInt7031 || local152 < -Static264.aClass265_8.anInt7031) {
						Static479.aBoolean676 = true;
					}
				}
				if (Static264.aClass265_8.anObjectArray12 != null && Static479.aBoolean676) {
					local185 = new Class3_Sub53();
					local185.anObjectArray35 = Static264.aClass265_8.anObjectArray12;
					local185.anInt10769 = local127;
					local185.aClass265_16 = Static264.aClass265_8;
					local185.anInt10767 = local135;
					Static250.method3767(local185);
					return;
				}
			} else {
				if (Static479.aBoolean676) {
					Static252.method3806();
					if (Static264.aClass265_8.anObjectArray26 != null) {
						local185 = new Class3_Sub53();
						local185.anInt10769 = local127;
						local185.anInt10767 = local135;
						local185.aClass265_16 = Static264.aClass265_8;
						local185.aClass265_15 = Static630.aClass265_14;
						local185.anObjectArray35 = Static264.aClass265_8.anObjectArray26;
						Static250.method3767(local185);
					}
					if (Static630.aClass265_14 != null && Static86.method1374(Static264.aClass265_8) != null) {
						Static480.method6354(Static630.aClass265_14, Static264.aClass265_8);
					}
				} else if ((Static218.anInt3740 == 1 || Static619.method8378()) && Static166.anInt3037 > 2) {
					Static476.method5364(Static340.anInt5862 + Static548.anInt8559, Static292.anInt5089 + Static260.anInt4561);
				} else if (Static620.method8393()) {
					Static476.method5364(Static340.anInt5862 + Static548.anInt8559, Static292.anInt5089 + Static260.anInt4561);
				}
				Static264.aClass265_8 = null;
			}
		} else if (Static310.anInt5192 > 1) {
			Static264.aClass265_8 = null;
		}
	}
}
