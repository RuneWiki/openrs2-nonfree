import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public static int anInt6920;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
	public static int anInt6921;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "Lclient!la;")
	public static Class117 aClass117_8;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "J")
	public static long aLong195 = -1L;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method5907() {
		Static398.method5824();
		Static574.method7622(Static278.aClass3_Sub13_Sub1_1.aBoolean411);
		Static483.aClass288_2 = Static511.method6833(0, 22050, Static409.aClass221_6, Static347.aCanvas9);
		Static483.aClass288_2.method6798(Static510.aClass3_Sub6_Sub3_3);
		Static172.aClass288_1 = Static511.method6833(1, 2048, Static409.aClass221_6, Static347.aCanvas9);
		Static172.aClass288_1.method6798(Static164.aClass3_Sub6_Sub1_1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5908(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static82.anInt2184 >= 100) {
			Static118.method2471(Static48.aClass33_41.method797(Static131.anInt2839));
			return;
		}
		@Pc(27) String local27 = Static575.method7623(arg1);
		if (local27 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(32) int local32 = 0; local32 < Static82.anInt2184; local32++) {
			@Pc(40) String local40 = Static575.method7623(Static145.aStringArray14[local32]);
			if (local40 != null && local40.equals(local27)) {
				Static118.method2471(arg1 + Static48.aClass33_42.method797(Static131.anInt2839));
				return;
			}
			if (Static553.aStringArray47[local32] != null) {
				local71 = Static575.method7623(Static553.aStringArray47[local32]);
				if (local71 != null && local71.equals(local27)) {
					Static118.method2471(arg1 + Static48.aClass33_42.method797(Static131.anInt2839));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static590.anInt9377; local100++) {
			local71 = Static575.method7623(Static595.aStringArray49[local100]);
			if (local71 != null && local71.equals(local27)) {
				Static118.method2471(Static48.aClass33_47.method797(Static131.anInt2839) + arg1 + Static48.aClass33_48.method797(Static131.anInt2839));
				return;
			}
			if (Static588.aStringArray13[local100] != null) {
				@Pc(146) String local146 = Static575.method7623(Static588.aStringArray13[local100]);
				if (local146 != null && local146.equals(local27)) {
					Static118.method2471(Static48.aClass33_47.method797(Static131.anInt2839) + arg1 + Static48.aClass33_48.method797(Static131.anInt2839));
					return;
				}
			}
		}
		if (Static575.method7623(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94).equals(local27)) {
			Static118.method2471(Static48.aClass33_44.method797(Static131.anInt2839));
			return;
		}
		@Pc(208) Class3_Sub34 local208 = Static374.method5522(Static450.aClass298_153, Static220.aClass287_2);
		local208.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg1) + 1);
		local208.aClass3_Sub11_Sub1_2.method3136(arg1);
		local208.aClass3_Sub11_Sub1_2.method3079(arg0 ? 1 : 0);
		Static131.method2572(local208);
	}
}
