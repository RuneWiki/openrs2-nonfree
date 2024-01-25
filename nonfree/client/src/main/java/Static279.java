import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
	public static int anInt4567 = 104;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "([[[Lclient!ih;B)V")
	public static void method4181(@OriginalArg(0) Class156[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class156[][] local18 = arg0[local7];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class156 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass14_Sub1_Sub5_1 instanceof Interface20) {
							((Interface20) local32.aClass14_Sub1_Sub5_1).method8013();
						}
						if (local32.aClass14_Sub1_Sub2_2 instanceof Interface20) {
							((Interface20) local32.aClass14_Sub1_Sub2_2).method8013();
						}
						if (local32.aClass14_Sub1_Sub2_1 instanceof Interface20) {
							((Interface20) local32.aClass14_Sub1_Sub2_1).method8013();
						}
						if (local32.aClass14_Sub1_Sub3_1 instanceof Interface20) {
							((Interface20) local32.aClass14_Sub1_Sub3_1).method8013();
						}
						if (local32.aClass14_Sub1_Sub3_2 instanceof Interface20) {
							((Interface20) local32.aClass14_Sub1_Sub3_2).method8013();
						}
						for (@Pc(82) Class66 local82 = local32.aClass66_2; local82 != null; local82 = local82.aClass66_1) {
							@Pc(87) Class14_Sub1_Sub1 local87 = local82.aClass14_Sub1_Sub1_1;
							if (local87 instanceof Interface20) {
								((Interface20) local87).method8013();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
	public static void method4182(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class5_Sub40 local6 = Static599.method8376();
		local6.aClass5_Sub12_Sub2_2.method8647(Static603.aClass244_7.anInt6597);
		local6.aClass5_Sub12_Sub2_2.method8655(0);
		@Pc(21) int local21 = local6.aClass5_Sub12_Sub2_2.anInt10154;
		local6.aClass5_Sub12_Sub2_2.method8655(640);
		@Pc(30) int[] local30 = Static192.method7615(local6);
		@Pc(34) int local34 = local6.aClass5_Sub12_Sub2_2.anInt10154;
		local6.aClass5_Sub12_Sub2_2.method8619(arg1);
		local6.aClass5_Sub12_Sub2_2.method8655(Static141.anInt2321);
		local6.aClass5_Sub12_Sub2_2.method8619(arg0);
		local6.aClass5_Sub12_Sub2_2.method8653(Static55.aLong30);
		local6.aClass5_Sub12_Sub2_2.method8647(Static321.anInt5554);
		local6.aClass5_Sub12_Sub2_2.method8647(Static24.aClass235_1.anInt6378);
		Static403.method6186(local6.aClass5_Sub12_Sub2_2);
		@Pc(71) String local71 = Static19.aString5;
		local6.aClass5_Sub12_Sub2_2.method8647(local71 == null ? 0 : 1);
		if (local71 != null) {
			local6.aClass5_Sub12_Sub2_2.method8619(local71);
		}
		local6.aClass5_Sub12_Sub2_2.method8647(arg3);
		local6.aClass5_Sub12_Sub2_2.method8647(arg2 ? 1 : 0);
		local6.aClass5_Sub12_Sub2_2.anInt10154 += 7;
		local6.aClass5_Sub12_Sub2_2.method8620(local30, local6.aClass5_Sub12_Sub2_2.anInt10154, local34);
		local6.aClass5_Sub12_Sub2_2.method8642(local6.aClass5_Sub12_Sub2_2.anInt10154 - local21);
		Static612.method8496(local6);
		Static45.anInt744 = -3;
		Static621.anInt10073 = 0;
		Static301.anInt4797 = 1;
		Static361.anInt6379 = 0;
		if (arg3 < 13) {
			Static80.aBoolean105 = true;
			Static102.method1480();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public static void method4184() {
		Static47.anInt748++;
		Static18.anInt423 = 0;
		Static208.anInt3629 = 0;
		Static124.method8855();
		Static207.method3197();
		Static336.method5170();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static208.anInt3629; local23++) {
			local29 = Static227.anIntArray328[local23];
			@Pc(36) Class5_Sub13 local36 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local29);
			@Pc(39) Class14_Sub1_Sub1_Sub3_Sub2 local39 = local36.aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (Static251.aBoolean343 && Static109.method1604(local29)) {
				Static500.method7322();
			}
			if (local39.anInt2935 != Static47.anInt748) {
				if (local39.aClass271_1.method6479()) {
					Static341.method5232(local39);
				}
				local39.method2534((Class271) null);
				local21 = true;
				local36.method8911();
			}
		}
		if (local21) {
			Static108.anInt1716 = Static51.aClass81_11.method1611();
			Static51.aClass81_11.method1606(Static367.aClass5_Sub13Array1);
		}
		if (Static60.anInt3115 != Static167.aClass5_Sub12_Sub2_1.anInt10154) {
			throw new RuntimeException("gnp1 pos:" + Static167.aClass5_Sub12_Sub2_1.anInt10154 + " psize:" + Static60.anInt3115);
		}
		for (local29 = 0; local29 < Static58.anInt926; local29++) {
			if (Static51.aClass81_11.method1599((long) Static191.anIntArray287[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static58.anInt926);
			}
		}
		if (Static108.anInt1716 - Static58.anInt926 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static108.anInt1716 - Static58.anInt926));
		}
		for (@Pc(172) int local172 = 0; local172 < Static108.anInt1716; local172++) {
			if (Static367.aClass5_Sub13Array1[local172].aClass14_Sub1_Sub1_Sub3_Sub2_1.anInt2935 != Static47.anInt748) {
				throw new RuntimeException("gnp4 uk:" + Static367.aClass5_Sub13Array1[local172].aClass14_Sub1_Sub1_Sub3_Sub2_1.anInt2960);
			}
		}
	}
}
