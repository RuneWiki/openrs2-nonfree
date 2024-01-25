import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!paa", name = "t", descriptor = "Z")
	public static boolean aBoolean584 = true;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method6491(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static453.anInt7761 >= 100) {
			Static111.method1603(Static582.aClass335_40.method8349(Static323.anInt5795));
			return;
		}
		@Pc(27) String local27 = Static250.method3679(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(77) String local77;
		for (@Pc(33) int local33 = 0; local33 < Static453.anInt7761; local33++) {
			@Pc(43) String local43 = Static250.method3679(Static197.aStringArray73[local33]);
			if (local43 != null && local43.equals(local27)) {
				Static111.method1603(arg0 + Static582.aClass335_41.method8349(Static323.anInt5795));
				return;
			}
			if (Static430.aStringArray43[local33] != null) {
				local77 = Static250.method3679(Static430.aStringArray43[local33]);
				if (local77 != null && local77.equals(local27)) {
					Static111.method1603(arg0 + Static582.aClass335_41.method8349(Static323.anInt5795));
					return;
				}
			}
		}
		@Pc(111) int local111 = 0;
		if (-19855 != -19855) {
			return;
		}
		while (Static463.anInt7895 > local111) {
			local77 = Static250.method3679(Static444.aStringArray54[local111]);
			if (local77 != null && local77.equals(local27)) {
				Static111.method1603(Static582.aClass335_46.method8349(Static323.anInt5795) + arg0 + Static582.aClass335_47.method8349(Static323.anInt5795));
				return;
			}
			if (Static446.aStringArray57[local111] != null) {
				@Pc(163) String local163 = Static250.method3679(Static446.aStringArray57[local111]);
				if (local163 != null && local163.equals(local27)) {
					Static111.method1603(Static582.aClass335_46.method8349(Static323.anInt5795) + arg0 + Static582.aClass335_47.method8349(Static323.anInt5795));
					return;
				}
			}
			local111++;
		}
		if (Static250.method3679(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62).equals(local27)) {
			Static111.method1603(Static582.aClass335_43.method8349(Static323.anInt5795));
			return;
		}
		@Pc(229) Class5_Sub50 local229 = Static457.method6722(Static325.aClass387_60, Static80.aClass313_1);
		local229.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0) + 1);
		local229.aClass5_Sub23_Sub2_2.method8538(arg0);
		local229.aClass5_Sub23_Sub2_2.method8502(arg1 ? 1 : 0);
		Static494.method7120(local229);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
	public static void method6493() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static386.aBooleanArray13[local15] = true;
		}
	}
}
