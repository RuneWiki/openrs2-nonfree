import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "Lclient!lb;")
	public static Class221 aClass221_51;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!uc;I)V")
	public static void method2895(@OriginalArg(0) Class3_Sub53 arg0) {
		if (Static584.aClass262ArrayArrayArray2 == null) {
			return;
		}
		@Pc(9) Interface19 local9 = null;
		if (arg0.anInt10320 == 0) {
			local9 = (Interface19) Static32.method476(arg0.anInt10313, arg0.anInt10319, arg0.anInt10317);
		}
		if (arg0.anInt10320 == 1) {
			local9 = (Interface19) Static117.method2043(arg0.anInt10313, arg0.anInt10319, arg0.anInt10317);
		}
		if (arg0.anInt10320 == 2) {
			local9 = (Interface19) Static89.method1199(arg0.anInt10313, arg0.anInt10319, arg0.anInt10317, aClass10 == null ? (aClass10 = Class3_Sub24.a("pe")) : aClass10);
		}
		if (arg0.anInt10320 == 3) {
			local9 = (Interface19) Static724.method9433(arg0.anInt10313, arg0.anInt10319, arg0.anInt10317);
		}
		if (local9 == null) {
			arg0.anInt10312 = -1;
			arg0.anInt10310 = 0;
			arg0.anInt10318 = 0;
		} else {
			arg0.anInt10312 = local9.method9384();
			arg0.anInt10318 = local9.method9381();
			arg0.anInt10310 = local9.method9385();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ns;Z)I")
	public static int method2897(@OriginalArg(0) Class261 arg0) {
		if (arg0 == Static438.aClass261_11) {
			return 5120;
		} else if (arg0 == Static438.aClass261_12) {
			return 5122;
		} else if (Static438.aClass261_13 == arg0) {
			return 5124;
		} else if (arg0 == Static438.aClass261_14) {
			return 5121;
		} else if (Static438.aClass261_15 == arg0) {
			return 5123;
		} else if (Static438.aClass261_16 == arg0) {
			return 5125;
		} else if (Static438.aClass261_17 == arg0) {
			return 5131;
		} else if (Static438.aClass261_18 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public static void method2898() {
		Static391.method5905(Static509.aClass20_16);
		Static349.anInt5938++;
		if (Static414.aBoolean572 && Static89.aBoolean123) {
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = 0;
			if (Static178.aBoolean264) {
				local41 = Static448.method6652();
				local43 = Static143.method2382();
			}
			@Pc(59) int local59 = local41 + Static714.aClass161_1.method8581();
			@Pc(65) int local65 = local43 + Static714.aClass161_1.method8573();
			local65 -= Static445.anInt7712;
			local59 -= Static273.anInt5007;
			if (Static535.anInt9010 > local59) {
				local59 = Static535.anInt9010;
			}
			if (Static535.anInt9010 + Static85.aClass20_5.anInt509 < Static509.aClass20_16.anInt509 + local59) {
				local59 = Static535.anInt9010 + Static85.aClass20_5.anInt509 - Static509.aClass20_16.anInt509;
			}
			if (Static162.anInt3022 > local65) {
				local65 = Static162.anInt3022;
			}
			if (local65 + Static509.aClass20_16.anInt569 > Static162.anInt3022 - -Static85.aClass20_5.anInt569) {
				local65 = Static162.anInt3022 + Static85.aClass20_5.anInt569 - Static509.aClass20_16.anInt569;
			}
			@Pc(134) int local134 = Static85.aClass20_5.anInt537 + local59 - Static535.anInt9010;
			@Pc(142) int local142 = Static85.aClass20_5.anInt554 + local65 - Static162.anInt3022;
			@Pc(208) Class3_Sub7 local208;
			if (Static714.aClass161_1.method8577()) {
				if (Static509.aClass20_16.anInt601 < Static349.anInt5938) {
					@Pc(251) int local251 = local59 - Static636.anInt10303;
					@Pc(256) int local256 = local65 - Static224.anInt4275;
					if (local251 > Static509.aClass20_16.anInt563 || local251 < -Static509.aClass20_16.anInt563 || local256 > Static509.aClass20_16.anInt563 || -Static509.aClass20_16.anInt563 > local256) {
						Static659.aBoolean761 = true;
					}
				}
				if (Static509.aClass20_16.anObjectArray4 != null && Static659.aBoolean761) {
					local208 = new Class3_Sub7();
					local208.anObjectArray1 = Static509.aClass20_16.anObjectArray4;
					local208.aClass20_2 = Static509.aClass20_16;
					local208.anInt375 = local142;
					local208.anInt376 = local134;
					Static185.method2811(local208);
				}
			} else {
				if (Static659.aBoolean761) {
					Static427.method6535();
					if (Static509.aClass20_16.anObjectArray34 != null) {
						local208 = new Class3_Sub7();
						local208.anInt375 = local142;
						local208.aClass20_1 = Static704.aClass20_19;
						local208.aClass20_2 = Static509.aClass20_16;
						local208.anObjectArray1 = Static509.aClass20_16.anObjectArray34;
						local208.anInt376 = local134;
						Static185.method2811(local208);
					}
					if (Static704.aClass20_19 != null && Static87.method1173(Static509.aClass20_16) != null) {
						Static255.method3994(Static704.aClass20_19, Static509.aClass20_16);
					}
				} else if ((Static78.anInt1229 == 1 || Static79.method1033()) && Static285.anInt5168 > 2) {
					Static34.method517(Static273.anInt5007 + Static636.anInt10303, Static445.anInt7712 - -Static224.anInt4275);
				} else if (Static453.method6736()) {
					Static34.method517(Static636.anInt10303 + Static273.anInt5007, Static445.anInt7712 + Static224.anInt4275);
				}
				Static509.aClass20_16 = null;
			}
		} else if (Static349.anInt5938 > 1) {
			Static509.aClass20_16 = null;
		}
	}
}
