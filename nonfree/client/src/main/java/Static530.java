import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
	public static int anInt9433;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
	public static int anInt9435;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
	public static int anInt9437 = 100;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_115 = new Class173(34, -1);

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean664 = true;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_206 = new Class362(87, 3);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method7703(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static267.anInt5132 >= 100) {
			Static465.method7052(Static590.aClass364_43.method8334(Static154.anInt3181));
			return;
		}
		@Pc(25) String local25 = Static444.method6843(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(35) int local35 = 0; local35 < Static267.anInt5132; local35++) {
			@Pc(43) String local43 = Static444.method6843(Static523.aStringArray64[local35]);
			if (local43 != null && local43.equals(local25)) {
				Static465.method7052(arg0 + Static590.aClass364_44.method8334(Static154.anInt3181));
				return;
			}
			if (Static282.aStringArray27[local35] != null) {
				local74 = Static444.method6843(Static282.aStringArray27[local35]);
				if (local74 != null && local74.equals(local25)) {
					Static465.method7052(arg0 + Static590.aClass364_44.method8334(Static154.anInt3181));
					return;
				}
			}
		}
		for (@Pc(101) int local101 = 0; local101 < Static493.anInt8959; local101++) {
			local74 = Static444.method6843(Static220.aStringArray22[local101]);
			if (local74 != null && local74.equals(local25)) {
				Static465.method7052(Static590.aClass364_49.method8334(Static154.anInt3181) + arg0 + Static590.aClass364_50.method8334(Static154.anInt3181));
				return;
			}
			if (Static274.aStringArray34[local101] != null) {
				@Pc(145) String local145 = Static444.method6843(Static274.aStringArray34[local101]);
				if (local145 != null && local145.equals(local25)) {
					Static465.method7052(Static590.aClass364_49.method8334(Static154.anInt3181) + arg0 + Static590.aClass364_50.method8334(Static154.anInt3181));
					return;
				}
			}
		}
		if (Static444.method6843(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78).equals(local25)) {
			Static465.method7052(Static590.aClass364_46.method8334(Static154.anInt3181));
			return;
		}
		@Pc(201) Class4_Sub14 local201 = Static196.method3380(Static17.aClass159_1, Static151.aClass173_85);
		local201.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0) + 1);
		local201.aClass4_Sub11_Sub1_3.method4945(arg0);
		local201.aClass4_Sub11_Sub1_3.method4957(arg1 ? 1 : 0);
		Static353.method5712(local201);
	}
}
