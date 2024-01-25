import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "B")
	public static byte aByte32;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!tj;")
	public static Class193 aClass193_37;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)Lclient!tg;")
	public static Class192 method2258(@OriginalArg(0) int arg0) {
		@Pc(15) Class192 local15 = (Class192) Static58.aClass198_53.method5210((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static3.aClass193_3.method5047(0, arg0);
		local15 = new Class192();
		if (local25 != null) {
			local15.method4991(new Class4_Sub11(local25));
		}
		local15.method4989();
		Static58.aClass198_53.method5201(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public static void method2267() {
		Static288.aClass131_1 = new Class131(8);
		Static189.anInt3955 = 0;
		for (@Pc(19) Class2_Sub4 local19 = (Class2_Sub4) Static178.aClass32_6.method850(); local19 != null; local19 = (Class2_Sub4) Static178.aClass32_6.method846()) {
			local19.method3932();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method2271(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static129.anInt3035 >= 100) {
			Static282.method4191(Static277.aClass159_298.method4311(Static180.anInt3835));
			return;
		}
		@Pc(28) String local28 = Static252.method4449(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(33) int local33 = 0; local33 < Static129.anInt3035; local33++) {
			@Pc(41) String local41 = Static252.method4449(Static161.aStringArray39[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static282.method4191(arg0 + Static60.aClass159_93.method4311(Static180.anInt3835));
				return;
			}
			if (Static45.aStringArray11[local33] != null) {
				local71 = Static252.method4449(Static45.aStringArray11[local33]);
				if (local71 != null && local71.equals(local28)) {
					Static282.method4191(arg0 + Static60.aClass159_93.method4311(Static180.anInt3835));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static202.anInt4162; local97++) {
			local71 = Static252.method4449(Static73.aStringArray21[local97]);
			if (local71 != null && local71.equals(local28)) {
				Static282.method4191(Static72.aClass159_106.method4311(Static180.anInt3835) + arg0 + Static82.aClass159_113.method4311(Static180.anInt3835));
				return;
			}
			if (Static345.aStringArray86[local97] != null) {
				@Pc(140) String local140 = Static252.method4449(Static345.aStringArray86[local97]);
				if (local140 != null && local140.equals(local28)) {
					Static282.method4191(Static72.aClass159_106.method4311(Static180.anInt3835) + arg0 + Static82.aClass159_113.method4311(Static180.anInt3835));
					return;
				}
			}
		}
		if (Static252.method4449(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24).equals(local28)) {
			Static282.method4191(Static335.aClass159_351.method4311(Static180.anInt3835));
		} else {
			Static15.aClass4_Sub11_Sub1_2.method706(158);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0) + 1);
			Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
			Static15.aClass4_Sub11_Sub1_2.method3434(arg1 ? 1 : 0);
		}
	}
}
