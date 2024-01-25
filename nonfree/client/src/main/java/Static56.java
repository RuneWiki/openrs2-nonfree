import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!cba", name = "U", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!cba", name = "V", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!cba", name = "J", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_2 = new Class147("", 12);

	@OriginalMember(owner = "client!cba", name = "O", descriptor = "I")
	public static int anInt915 = -1;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!hea;")
	public static Class135 method931(@OriginalArg(0) Component arg0) {
		try {
			@Pc(28) Constructor local28 = Class.forName("Class135_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class135) local28.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(46) Throwable local46) {
			return new Class135_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method938(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(32) String local32;
		if (Static493.anInt8959 >= 200 && !Static310.aBoolean452 || Static493.anInt8959 >= 200) {
			Static465.method7052(Static590.aClass364_14.method8334(Static154.anInt3181));
			local32 = Static590.aClass364_15.method8334(Static154.anInt3181);
			if (local32 != null) {
				Static465.method7052(local32);
			}
			return;
		}
		local32 = Static444.method6843(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(89) String local89;
		for (@Pc(48) int local48 = 0; local48 < Static493.anInt8959; local48++) {
			@Pc(56) String local56 = Static444.method6843(Static220.aStringArray22[local48]);
			if (local56 != null && local56.equals(local32)) {
				Static465.method7052(arg0 + Static590.aClass364_42.method8334(Static154.anInt3181));
				return;
			}
			if (Static274.aStringArray34[local48] != null) {
				local89 = Static444.method6843(Static274.aStringArray34[local48]);
				if (local89 != null && local89.equals(local32)) {
					Static465.method7052(arg0 + Static590.aClass364_42.method8334(Static154.anInt3181));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static267.anInt5132; local120++) {
			local89 = Static444.method6843(Static523.aStringArray64[local120]);
			if (local89 != null && local89.equals(local32)) {
				Static465.method7052(Static590.aClass364_47.method8334(Static154.anInt3181) + arg0 + Static590.aClass364_48.method8334(Static154.anInt3181));
				return;
			}
			if (Static282.aStringArray27[local120] != null) {
				@Pc(164) String local164 = Static444.method6843(Static282.aStringArray27[local120]);
				if (local164 != null && local164.equals(local32)) {
					Static465.method7052(Static590.aClass364_47.method8334(Static154.anInt3181) + arg0 + Static590.aClass364_48.method8334(Static154.anInt3181));
					return;
				}
			}
		}
		if (Static444.method6843(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78).equals(local32)) {
			Static465.method7052(Static590.aClass364_45.method8334(Static154.anInt3181));
		} else {
			@Pc(224) Class4_Sub14 local224 = Static196.method3380(Static17.aClass159_1, Static94.aClass173_28);
			local224.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0));
			local224.aClass4_Sub11_Sub1_3.method4945(arg0);
			Static353.method5712(local224);
		}
	}
}
