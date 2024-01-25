import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "Lclient!ag;")
	public static Class11 aClass11_2;

	@OriginalMember(owner = "client!gha", name = "j", descriptor = "Lclient!ip;")
	public static Class170 aClass170_19;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZZIIIII)V")
	public static void method2739(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) Class160_Sub1 local18 = Static475.aClass160_Sub1Array2[local12];
		Static475.aClass160_Sub1Array2[local12] = Static475.aClass160_Sub1Array2[arg2];
		Static475.aClass160_Sub1Array2[arg2] = local18;
		for (@Pc(30) int local30 = arg3; local30 < arg2; local30++) {
			if (Static562.method7684(arg5, arg0, arg4, local18, arg1, Static475.aClass160_Sub1Array2[local30]) <= 0) {
				@Pc(46) Class160_Sub1 local46 = Static475.aClass160_Sub1Array2[local30];
				Static475.aClass160_Sub1Array2[local30] = Static475.aClass160_Sub1Array2[local14];
				Static475.aClass160_Sub1Array2[local14++] = local46;
			}
		}
		Static475.aClass160_Sub1Array2[arg2] = Static475.aClass160_Sub1Array2[local14];
		Static475.aClass160_Sub1Array2[local14] = local18;
		method2739(arg0, arg1, local14 - 1, arg3, arg4, arg5);
		method2739(arg0, arg1, arg2, local14 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZLclient!rv;)Lclient!rl;")
	public static Class5_Sub6 method2740(@OriginalArg(1) Class5_Sub15 arg0) {
		arg0.method3642();
		@Pc(13) int local13 = arg0.method3642();
		@Pc(17) Class5_Sub6 local17 = Static401.method5879(local13);
		local17.anInt9758 = arg0.method3642();
		@Pc(26) int local26 = arg0.method3642();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method3642();
			local17.method8120(arg0, local34);
		}
		local17.method8118();
		return local17;
	}
}
