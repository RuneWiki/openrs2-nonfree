import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
	public static int anInt10625;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
	public static int anInt10620 = 0;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
	public static int anInt10622 = 0;

	@OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
	public static int anInt10636 = -1;

	@OriginalMember(owner = "client!vj", name = "db", descriptor = "Z")
	public static boolean aBoolean726 = false;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	public static void method8882() {
		Static273.aClass20_8.method7303(Static392.aFloat164, Static138.aFloat102, Static581.aFloat209);
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)Lclient!et;")
	public static Class2_Sub6_Sub6 method8883() {
		@Pc(13) Class2_Sub6_Sub6 local13 = (Class2_Sub6_Sub6) Static47.aClass211_2.method6008();
		if (local13 != null) {
			local13.method9253();
			local13.method8933();
			return local13;
		}
		do {
			local13 = (Class2_Sub6_Sub6) Static119.aClass211_3.method6008();
			if (local13 == null) {
				return null;
			}
			if (local13.method3092() > Static277.method5091()) {
				return null;
			}
			local13.method9253();
			local13.method8933();
		} while ((Long.MIN_VALUE & local13.aLong267) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8884(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (anInt10620 >= 200 && !Static486.aBoolean654 || anInt10620 >= 200) {
			Static271.method9045(Static588.aClass351_12.method8691(Static476.anInt8915));
			local30 = Static588.aClass351_13.method8691(Static476.anInt8915);
			if (local30 != null) {
				Static271.method9045(local30);
			}
			return;
		}
		local30 = Static31.method765(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(85) String local85;
		for (@Pc(46) int local46 = 0; local46 < anInt10620; local46++) {
			@Pc(54) String local54 = Static31.method765(Static314.aStringArray29[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static271.method9045(arg0 + Static588.aClass351_40.method8691(Static476.anInt8915));
				return;
			}
			if (Static101.aStringArray15[local46] != null) {
				local85 = Static31.method765(Static101.aStringArray15[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static271.method9045(arg0 + Static588.aClass351_40.method8691(Static476.anInt8915));
					return;
				}
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static89.anInt2628; local116++) {
			local85 = Static31.method765(Static251.aStringArray20[local116]);
			if (local85 != null && local85.equals(local30)) {
				Static271.method9045(Static588.aClass351_45.method8691(Static476.anInt8915) + arg0 + Static588.aClass351_46.method8691(Static476.anInt8915));
				return;
			}
			if (Static496.aStringArray38[local116] != null) {
				@Pc(160) String local160 = Static31.method765(Static496.aStringArray38[local116]);
				if (local160 != null && local160.equals(local30)) {
					Static271.method9045(Static588.aClass351_45.method8691(Static476.anInt8915) + arg0 + Static588.aClass351_46.method8691(Static476.anInt8915));
					return;
				}
			}
		}
		if (Static31.method765(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64).equals(local30)) {
			Static271.method9045(Static588.aClass351_43.method8691(Static476.anInt8915));
		} else {
			@Pc(214) Class2_Sub52 local214 = Static130.method3019(Static618.aClass94_106, Static361.aClass183_1);
			local214.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0));
			local214.aClass2_Sub11_Sub2_7.method8329(arg0);
			Static96.method2563(local214);
		}
	}
}
