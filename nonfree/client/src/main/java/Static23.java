import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	public static void method331() {
		if (Static97.anInt1683 < 0) {
			Static644.anInt10590 = -1;
			Static97.anInt1683 = 0;
			Static19.anInt249 = -1;
		}
		if (Static97.anInt1683 > Static224.anInt1295) {
			Static97.anInt1683 = Static224.anInt1295;
			Static644.anInt10590 = -1;
			Static19.anInt249 = -1;
		}
		if (Static381.anInt6704 < 0) {
			Static644.anInt10590 = -1;
			Static381.anInt6704 = 0;
			Static19.anInt249 = -1;
		}
		if (Static381.anInt6704 > Static224.anInt1298) {
			Static19.anInt249 = -1;
			Static644.anInt10590 = -1;
			Static381.anInt6704 = Static224.anInt1298;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!qga;Lclient!aa;IILclient!fia;I)V")
	public static void method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299 arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class45 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static304.anInt5410 == 4) {
			local17 = (int) Static139.aFloat16 & 0x3FFF;
		} else {
			local17 = (int) Static139.aFloat16 + Static405.anInt7023 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg2.anInt8573 / 2, arg2.anInt8547 / 2) + 10;
		@Pc(47) int local47 = arg4 * arg4 + arg1 * arg1;
		if (local47 > local38 * local38) {
			return;
		}
		@Pc(62) int local62 = Class141.anIntArray207[local17];
		@Pc(74) int local74 = Class141.anIntArray208[local17];
		if (Static304.anInt5410 != 4) {
			local62 = local62 * 256 / (Static195.anInt3404 + 256);
			local74 = local74 * 256 / (Static195.anInt3404 + 256);
		}
		@Pc(105) int local105 = local74 * arg4 + local62 * arg1 >> 14;
		@Pc(115) int local115 = local74 * arg1 - arg4 * local62 >> 14;
		arg5.method7503(arg6 + arg2.anInt8573 / 2 + local105 - arg5.method7508() / 2, arg2.anInt8547 / 2 + (arg0 - local115 - arg5.method7504() / 2), arg3, arg6, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([Ljava/lang/String;Z)V")
	public static void method345(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static434.aString85 = Static434.aString85 + arg0[0];
			Static340.anInt5803 += arg0[0].length();
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			if (arg0[local9].startsWith("pause")) {
				@Pc(20) int local20 = 5;
				try {
					local20 = Integer.parseInt(arg0[local9].substring(6));
				} catch (@Pc(29) Exception local29) {
				}
				Static590.method8398("Pausing for " + local20 + " seconds...");
				Static82.anInt1435 = local9 + 1;
				Static434.aStringArray30 = arg0;
				Static213.aLong166 = (long) (local20 * 1000) + Static26.method382();
				return;
			}
			Static434.aString85 = arg0[local9];
			Static302.method4909(false);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIILclient!uda;ILclient!ha;IIIB)V")
	public static void method346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14_Sub2_Sub20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class144 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg2 > arg10 && arg10 + arg0 > arg2 && arg3 - 13 < arg4 && arg4 < arg3 + 3 && arg5.aBoolean691) {
			arg1 = arg8;
		}
		@Pc(41) int[] local41 = null;
		if (Static291.method7605(arg5.anInt10001)) {
			local41 = Static252.aClass56_1.method1052((int) arg5.aLong281).anIntArray409;
		} else if (arg5.anInt10007 != -1) {
			local41 = Static252.aClass56_1.method1052(arg5.anInt10007).anIntArray409;
		} else if (Static621.method8720(arg5.anInt10001)) {
			@Pc(82) Class14_Sub44 local82 = (Class14_Sub44) Static100.aClass125_9.method2630((long) (int) arg5.aLong281);
			if (local82 != null) {
				@Pc(87) Class4_Sub3_Sub3_Sub3_Sub1 local87 = local82.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				@Pc(90) Class362 local90 = local87.aClass362_1;
				if (local90.lb != null) {
					local90 = local90.method8641(Static188.aClass238_1);
				}
				if (local90 != null) {
					local41 = local90.anIntArray550;
				}
			}
		} else if (Static392.method5967(arg5.anInt10001)) {
			@Pc(120) Class128 local120 = Static212.aClass249_4.method6119((int) (arg5.aLong281 >>> 32 & 0x7FFFFFFFL));
			if (local120.anIntArray179 != null) {
				local120 = local120.method2685(Static188.aClass238_1);
			}
			if (local120 != null) {
				local41 = local120.anIntArray182;
			}
		}
		@Pc(137) String local137 = Static431.method6456(arg5);
		if (local41 != null) {
			local137 = local137 + Static355.method5400(local41);
		}
		Static255.aClass68_4.method9423(Static399.aClass45Array24, Static16.anIntArray22, local137, arg10 + 3, arg3, arg1);
		if (arg5.aBoolean690) {
			Static594.aClass45_24.method7488(Static497.aClass350_9.method8356(local137) + arg10 + 5, arg3 + -12);
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)V")
	public static void method348(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg0, 5);
		local9.method4001();
	}
}
