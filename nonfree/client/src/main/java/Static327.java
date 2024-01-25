import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!it;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!n;)Ljava/lang/String;")
	public static String method5372(@OriginalArg(1) Class225 arg0) {
		if (Static69.method1180(arg0).method131() == 0) {
			return null;
		} else if (arg0.aString68 == null || arg0.aString68.trim().length() == 0) {
			return Static57.aBoolean43 ? "Hidden-use" : null;
		} else {
			return arg0.aString68;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5374(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static444.method6843(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static267.anInt5132; local29++) {
			@Pc(35) String local35 = Static523.aStringArray64[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static444.method6843(local35);
			if (local35 != null && local35.equals(local20)) {
				Static267.anInt5132--;
				for (@Pc(59) int local59 = local29; local59 < Static267.anInt5132; local59++) {
					Static523.aStringArray64[local59] = Static523.aStringArray64[local59 + 1];
					Static535.aStringArray66[local59] = Static535.aStringArray66[local59 + 1];
					Static282.aStringArray27[local59] = Static282.aStringArray27[local59 + 1];
					Static502.aStringArray63[local59] = Static502.aStringArray63[local59 + 1];
					Static324.aBooleanArray20[local59] = Static324.aBooleanArray20[local59 + 1];
				}
				Static341.anInt6623 = Static436.anInt8161;
				@Pc(116) Class4_Sub14 local116 = Static196.method3380(Static17.aClass159_1, Static219.aClass173_69);
				local116.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(arg0));
				local116.aClass4_Sub11_Sub1_3.method4945(arg0);
				Static353.method5712(local116);
				return;
			}
		}
	}
}
