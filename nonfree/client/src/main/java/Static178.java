import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!mn;")
	public static Class171 aClass171_45;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!jc;")
	public static final Class2_Sub20 aClass2_Sub20_1 = new Class2_Sub20(0, 0);

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean196 = Boolean.FALSE;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)Z")
	public static boolean method2591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static45.method700(arg2, arg0, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static145.method2219(local9) & true;
		}
		local9 = (Interface6) Static345.method4857(arg2, arg0, arg1, jq.class);
		if (local9 != null) {
			local11 &= Static145.method2219(local9);
		}
		local9 = (Interface6) Static115.method1883(arg2, arg0, arg1);
		if (local9 != null) {
			local11 &= Static145.method2219(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2592(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static155.method2318(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static127.anInt2142; local34++) {
			@Pc(40) String local40 = Static268.aStringArray47[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static155.method2318(local40);
			if (local40 != null && local40.equals(local20)) {
				Static127.anInt2142--;
				for (@Pc(64) int local64 = local34; local64 < Static127.anInt2142; local64++) {
					Static268.aStringArray47[local64] = Static268.aStringArray47[local64 + 1];
					Static296.aStringArray49[local64] = Static296.aStringArray49[local64 + 1];
					Static80.aStringArray58[local64] = Static80.aStringArray58[local64 + 1];
					Static148.aStringArray32[local64] = Static148.aStringArray32[local64 + 1];
					Static398.aBooleanArray22[local64] = Static398.aBooleanArray22[local64 + 1];
				}
				Static115.anInt1936 = Static144.anInt2663;
				Static164.method2403(Static343.aClass208_43);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg0));
				Static389.aClass2_Sub17_Sub1_2.method6151(arg0);
				return;
			}
		}
	}
}
