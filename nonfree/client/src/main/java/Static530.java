import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3328(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(19) int local19 = arg0.indexOf("--> ");
		if (local19 >= 0) {
			local7 = arg0.substring(0, local19 + 4);
			arg0 = arg0.substring(local19 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(47) int local47 = arg0.indexOf(" ", "directlogin ".length());
			if (local47 >= 0) {
				@Pc(52) int local52 = arg0.length();
				arg0 = arg0.substring(0, local47) + " ";
				for (@Pc(68) int local68 = local47 + 1; local68 < local52; local68++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIILclient!vea;Lclient!vea;)V")
	public static void method3337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21_Sub1_Sub3 arg3, @OriginalArg(4) Class21_Sub1_Sub3 arg4) {
		@Pc(4) Class182 local4 = Static560.method7938(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass21_Sub1_Sub3_2 = arg3;
		local4.aClass21_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static255.aClass115Array2 == Static140.aClass115Array1 ? 1 : 0;
		if (!arg3.method8235()) {
			Static375.aClass21_Sub1ArrayArray3[local19][Static27.anIntArray195[local19]++] = arg3;
		} else if (arg3.method8229()) {
			Static338.aClass21_Sub1ArrayArray2[local19][Static254.anIntArray281[local19]++] = arg3;
		} else {
			Static48.aClass21_Sub1ArrayArray4[local19][Static137.anIntArray143[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8235()) {
			if (arg4.method8229()) {
				Static338.aClass21_Sub1ArrayArray2[local19][Static254.anIntArray281[local19]++] = arg4;
				return;
			}
			Static48.aClass21_Sub1ArrayArray4[local19][Static137.anIntArray143[local19]++] = arg4;
			return;
		}
		Static375.aClass21_Sub1ArrayArray3[local19][Static27.anIntArray195[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "(II)V")
	public static void method3341(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub6_Sub5 local12 = Static396.method6079(arg0, 2);
		local12.method2302();
	}
}
