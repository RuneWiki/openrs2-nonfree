import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!tja", name = "j", descriptor = "I")
	public static int anInt9669;

	@OriginalMember(owner = "client!tja", name = "w", descriptor = "Z")
	public static boolean aBoolean647;

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!cp;")
	public static Class18 method8233(@OriginalArg(2) Component arg0) {
		try {
			@Pc(36) Constructor local36 = Class.forName("ama").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class18) local36.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(54) Throwable local54) {
			return new Class18_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method8237(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static453.anInt6954 >= 100) {
			Static304.method4498(Static430.aClass257_38.method5699(Static456.anInt7118));
			return;
		}
		@Pc(25) String local25 = Static69.method1531(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(73) String local73;
		for (@Pc(31) int local31 = 0; local31 < Static453.anInt6954; local31++) {
			@Pc(39) String local39 = Static69.method1531(Static501.aStringArray34[local31]);
			if (local39 != null && local39.equals(local25)) {
				Static304.method4498(arg0 + Static430.aClass257_39.method5699(Static456.anInt7118));
				return;
			}
			if (Static166.aStringArray15[local31] != null) {
				local73 = Static69.method1531(Static166.aStringArray15[local31]);
				if (local73 != null && local73.equals(local25)) {
					Static304.method4498(arg0 + Static430.aClass257_39.method5699(Static456.anInt7118));
					return;
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static544.anInt9946; local107++) {
			local73 = Static69.method1531(Static636.aStringArray41[local107]);
			if (local73 != null && local73.equals(local25)) {
				Static304.method4498(Static430.aClass257_44.method5699(Static456.anInt7118) + arg0 + Static430.aClass257_45.method5699(Static456.anInt7118));
				return;
			}
			if (Static61.aStringArray3[local107] != null) {
				@Pc(158) String local158 = Static69.method1531(Static61.aStringArray3[local107]);
				if (local158 != null && local158.equals(local25)) {
					Static304.method4498(Static430.aClass257_44.method5699(Static456.anInt7118) + arg0 + Static430.aClass257_45.method5699(Static456.anInt7118));
					return;
				}
			}
		}
		if (Static69.method1531(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4).equals(local25)) {
			Static304.method4498(Static430.aClass257_41.method5699(Static456.anInt7118));
			return;
		}
		@Pc(222) Class292 local222 = Static631.method8307();
		@Pc(233) Class3_Sub29 local233 = Static507.method6901(Static566.aClass144_86, local222.aClass88_2);
		local233.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0) + 1);
		local233.aClass3_Sub2_Sub1_1.method2073(arg0);
		local233.aClass3_Sub2_Sub1_1.method2065(arg1 ? 1 : 0);
		local222.method6855(local233);
	}
}
