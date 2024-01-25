import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kt", name = "U", descriptor = "I")
	public static int anInt5182;

	@OriginalMember(owner = "client!kt", name = "W", descriptor = "I")
	public static int anInt5184;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_26 = new Class326(5);

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_7 = new Class181(4, 2);

	@OriginalMember(owner = "client!kt", name = "Q", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_95 = new Class319(73, 3);

	@OriginalMember(owner = "client!kt", name = "X", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_121 = new Class81(6, -2);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4330(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static184.anInt5417 >= 200 && !Static40.aBoolean452 || Static184.anInt5417 >= 200) {
			Static172.method2626(Static103.aClass77_12.method1864(Static562.anInt9127));
			local30 = Static103.aClass77_13.method1864(Static562.anInt9127);
			if (local30 != null) {
				Static172.method2626(local30);
			}
			return;
		}
		local30 = Static344.method5101(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < Static184.anInt5417; local46++) {
			@Pc(54) String local54 = Static344.method5101(Static333.aStringArray26[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static172.method2626(arg0 + Static103.aClass77_40.method1864(Static562.anInt9127));
				return;
			}
			if (Static498.aStringArray34[local46] != null) {
				local85 = Static344.method5101(Static498.aStringArray34[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static172.method2626(arg0 + Static103.aClass77_40.method1864(Static562.anInt9127));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static54.anInt1399; local112++) {
			local85 = Static344.method5101(Static568.aStringArray40[local112]);
			if (local85 != null && local85.equals(local30)) {
				Static172.method2626(Static103.aClass77_45.method1864(Static562.anInt9127) + arg0 + Static103.aClass77_46.method1864(Static562.anInt9127));
				return;
			}
			if (Static279.aStringArray22[local112] != null) {
				@Pc(156) String local156 = Static344.method5101(Static279.aStringArray22[local112]);
				if (local156 != null && local156.equals(local30)) {
					Static172.method2626(Static103.aClass77_45.method1864(Static562.anInt9127) + arg0 + Static103.aClass77_46.method1864(Static562.anInt9127));
					return;
				}
			}
		}
		if (Static344.method5101(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49).equals(local30)) {
			Static172.method2626(Static103.aClass77_43.method1864(Static562.anInt9127));
		} else {
			@Pc(214) Class1_Sub48 local214 = Static320.method4867(Static442.aClass170_2, Static164.aClass319_59);
			local214.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0));
			local214.aClass1_Sub20_Sub1_2.method4399(arg0);
			Static34.method813(local214);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III[BIBI)Z")
	public static boolean method4332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg0 + 7) / 8);
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local13;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}
}
