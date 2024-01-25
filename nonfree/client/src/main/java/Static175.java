import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!cn;IIIII)V")
	public static void method2926(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static373.anInt6613) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static410.anInt6962) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static315.anInt5894 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class247 local62 = Static332.aClass247ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static343.aClass104Array2[local17].method8279(local32, local23) + Static343.aClass104Array2[local17].method8279(local32, local23 + 1) + Static343.aClass104Array2[local17].method8279(local32 + 1, local23) + Static343.aClass104Array2[local17].method8279(local32 + 1, local23 + 1)) / 4 - (Static343.aClass104Array2[arg1].method8279(arg3, arg2) + Static343.aClass104Array2[arg1].method8279(arg3, arg2 + 1) + Static343.aClass104Array2[arg1].method8279(arg3 + 1, arg2) + Static343.aClass104Array2[arg1].method8279(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class23_Sub2_Sub5 local151 = local62.aClass23_Sub2_Sub5_1;
									@Pc(154) Class23_Sub2_Sub5 local154 = local62.aClass23_Sub2_Sub5_2;
									if (local151 != null && local151.method8607()) {
										arg0.method8596(Static486.aClass16_8, local151, (local23 - arg2) * Static10.anInt118 + (1 - arg4) * Static589.anInt9316, (local32 - arg3) * Static10.anInt118 + (1 - arg5) * Static589.anInt9316, local1, local148);
									}
									if (local154 != null && local154.method8607()) {
										arg0.method8596(Static486.aClass16_8, local154, (local23 - arg2) * Static10.anInt118 + (1 - arg4) * Static589.anInt9316, (local32 - arg3) * Static10.anInt118 + (1 - arg5) * Static589.anInt9316, local1, local148);
									}
									for (@Pc(227) Class85 local227 = local62.aClass85_3; local227 != null; local227 = local227.aClass85_1) {
										@Pc(231) Class23_Sub2_Sub1 local231 = local227.aClass23_Sub2_Sub1_1;
										if (local231 != null && local231.method8607() && (local23 == local231.aShort123 || local23 == local3) && (local32 == local231.aShort124 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort125 + 1 - local231.aShort123;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort124;
											arg0.method8596(Static486.aClass16_8, local231, (local231.aShort123 - arg2) * Static10.anInt118 + (local260 - arg4) * Static589.anInt9316, (local231.aShort124 - arg3) * Static10.anInt118 + (local268 - arg5) * Static589.anInt9316, local1, local148);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILclient!ha;IIIII)V")
	public static void method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) Interface2 local11 = (Interface2) Static363.method5416(arg0, arg5, arg1);
		@Pc(20) Class178 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static349.aClass374_2.method8357(local11.method7823());
			local26 = local11.method7827() & 0x3;
			local30 = local11.method7824();
			if (local20.anInt4729 == -1) {
				local46 = arg4;
				if (local20.anInt4743 > 0) {
					local46 = arg7;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method8151(arg6, 4, local46, arg2);
					} else if (local26 == 1) {
						arg3.method8153(4, local46, arg2, arg6);
					} else if (local26 == 2) {
						arg3.method8151(arg6 + 3, 4, local46, arg2);
					} else if (local26 == 3) {
						arg3.method8153(4, local46, arg2 + 3, arg6);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method8113(1, arg6, 1, local46, arg2);
					} else if (local26 == 1) {
						arg3.method8113(1, arg6 + 3, 1, local46, arg2);
					} else if (local26 == 2) {
						arg3.method8113(1, arg6 + 3, 1, local46, arg2 + 3);
					} else if (local26 == 3) {
						arg3.method8113(1, arg6, 1, local46, arg2 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method8153(4, local46, arg2, arg6);
					} else if (local26 == 1) {
						arg3.method8151(arg6 + 3, 4, local46, arg2);
					} else if (local26 == 2) {
						arg3.method8153(4, local46, arg2 + 3, arg6);
					} else if (local26 == 3) {
						arg3.method8151(arg6, 4, local46, arg2);
					}
				}
			} else {
				Static181.method2981(local20, local26, arg2, arg3, arg6);
			}
		}
		local11 = (Interface2) Static344.method5203(arg0, arg5, arg1, bea.class);
		if (local11 != null) {
			local20 = Static349.aClass374_2.method8357(local11.method7823());
			local26 = local11.method7827() & 0x3;
			local30 = local11.method7824();
			if (local20.anInt4729 != -1) {
				Static181.method2981(local20, local26, arg2, arg3, arg6);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.anInt4743 > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method8141(arg2, arg6 + 3, arg2 + 3, arg6, local46);
				} else {
					arg3.method8141(arg2 + 3, arg6 - -3, arg2, arg6, local46);
				}
			}
		}
		local11 = (Interface2) Static306.method4709(arg0, arg5, arg1);
		if (local11 == null) {
			return;
		}
		local20 = Static349.aClass374_2.method8357(local11.method7823());
		local26 = local11.method7827() & 0x3;
		if (local20.anInt4729 != -1) {
			Static181.method2981(local20, local26, arg2, arg3, arg6);
			return;
		}
	}
}
