import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray6;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
	public static int anInt7764 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIILclient!fha;)V")
	public static void method6650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4) {
		@Pc(4) Class100 local4 = Static633.method9184(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10303 = (arg1 << Static151.anInt3896) + Static361.anInt7189;
		arg4.anInt10306 = arg3;
		arg4.anInt10310 = (arg2 << Static151.anInt3896) + Static361.anInt7189;
		local4.aClass3_Sub1_Sub4_1 = arg4;
		@Pc(33) int local33 = Static9.aClass65Array1 == Static103.aClass65Array3 ? 1 : 0;
		if (arg4.method8600()) {
			if (arg4.method8601()) {
				arg4.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local33];
				Static548.aClass3_Sub1Array129[local33] = arg4;
				return;
			}
			arg4.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local33];
			Static124.aClass3_Sub1Array151[local33] = arg4;
			Static240.aBoolean380 = true;
			return;
		}
		arg4.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local33];
		Static359.aClass3_Sub1Array94[local33] = arg4;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6652(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static31.method765(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < Static89.anInt2628; local34++) {
			@Pc(40) String local40 = Static251.aStringArray20[local34];
			if (local40.startsWith("*")) {
				local40 = local40.substring(1);
			}
			local40 = Static31.method765(local40);
			if (local40 != null && local40.equals(local20)) {
				Static89.anInt2628--;
				for (@Pc(64) int local64 = local34; local64 < Static89.anInt2628; local64++) {
					Static251.aStringArray20[local64] = Static251.aStringArray20[local64 + 1];
					Static370.aStringArray34[local64] = Static370.aStringArray34[local64 + 1];
					Static496.aStringArray38[local64] = Static496.aStringArray38[local64 + 1];
					Static331.aStringArray30[local64] = Static331.aStringArray30[local64 + 1];
					Static537.aBooleanArray24[local64] = Static537.aBooleanArray24[local64 + 1];
				}
				Static373.anInt7362 = Static7.anInt132;
				@Pc(121) Class2_Sub52 local121 = Static130.method3019(Static199.aClass94_86, Static361.aClass183_1);
				local121.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0));
				local121.aClass2_Sub11_Sub2_7.method8329(arg0);
				Static96.method2563(local121);
				return;
			}
		}
	}
}
