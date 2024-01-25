import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_10 = new Class277(10, 19);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
	public static boolean method4454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static246.method3936(arg1, arg0)) {
			return Static249.method2740(arg0, arg1) | (arg0 & 0x9000) != 0 | Static494.method7140(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | Static571.method8035(arg0, arg1) | Static214.method3480(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg0 < 0 || arg5 >= Static338.anInt6508 - 1 || Static390.anInt7654 - 1 <= arg0) {
			return;
		}
		if (Static571.aClass182ArrayArrayArray3 == null) {
			return;
		}
		@Pc(46) Interface21 local46;
		if (arg3 != 0) {
			if (arg3 == 1) {
				local46 = (Interface21) Static228.method3717(arg6, arg5, arg0);
				if (local46 != null) {
					if (local46 instanceof Class21_Sub1_Sub3_Sub2) {
						((Class21_Sub1_Sub3_Sub2) local46).aClass28_4.method970(arg2);
						return;
					}
					@Pc(62) int local62 = local46.method7281();
					if (arg4 != 4 && arg4 != 5) {
						if (arg4 == 6) {
							Static235.method3838(4, arg5, local62, arg3, arg6, arg1 + 4, arg0, arg2);
							return;
						}
						if (arg4 == 7) {
							Static235.method3838(4, arg5, local62, arg3, arg6, (arg1 + 2 & 0x3) + 4, arg0, arg2);
						} else if (arg4 == 8) {
							Static235.method3838(4, arg5, local62, arg3, arg6, arg1 + 4, arg0, arg2);
							Static235.method3838(4, arg5, local62, arg3, arg6, (arg1 + 2 & 0x3) + 4, arg0, arg2);
							return;
						}
						return;
					}
					Static235.method3838(4, arg5, local62, arg3, arg6, arg1, arg0, arg2);
					return;
				}
				return;
			}
			if (arg3 == 2) {
				local46 = (Interface21) Static36.method1049(arg6, arg5, arg0, sw.class);
				if (local46 != null) {
					if (arg4 == 11) {
						arg4 = 10;
					}
					if (local46 instanceof Class21_Sub1_Sub1_Sub3) {
						((Class21_Sub1_Sub1_Sub3) local46).aClass28_1.method970(arg2);
						return;
					}
					Static235.method3838(arg4, arg5, local46.method7281(), arg3, arg6, arg1, arg0, arg2);
					return;
				}
				return;
			}
			if (arg3 == 3) {
				local46 = (Interface21) Static570.method8016(arg6, arg5, arg0);
				if (local46 != null) {
					if (local46 instanceof Class21_Sub1_Sub5_Sub2) {
						((Class21_Sub1_Sub5_Sub2) local46).aClass28_3.method970(arg2);
						return;
					}
					Static235.method3838(arg4, arg5, local46.method7281(), arg3, arg6, arg1, arg0, arg2);
					return;
				}
			}
			return;
		}
		local46 = (Interface21) Static497.method7181(arg6, arg5, arg0);
		@Pc(250) Interface21 local250 = (Interface21) Static266.method4175(arg6, arg5, arg0);
		if (local46 != null && arg4 != 2) {
			if (local46 instanceof Class21_Sub1_Sub2_Sub2) {
				((Class21_Sub1_Sub2_Sub2) local46).aClass28_2.method970(arg2);
			} else {
				Static235.method3838(arg4, arg5, local46.method7281(), arg3, arg6, arg1, arg0, arg2);
			}
		}
		if (local250 == null) {
			return;
		}
		if (local250 instanceof Class21_Sub1_Sub2_Sub2) {
			((Class21_Sub1_Sub2_Sub2) local250).aClass28_2.method970(arg2);
			return;
		}
		Static235.method3838(arg4, arg5, local250.method7281(), arg3, arg6, arg1, arg0, arg2);
		return;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!is;IZI)V")
	public static void method4457(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) int local8 = arg1.anInt4806;
		if (arg1.aByte78 == 0) {
			arg1.anInt4806 = arg1.anInt4780;
		} else if (arg1.aByte78 == 1) {
			arg1.anInt4806 = arg2 - arg1.anInt4780;
		} else if (arg1.aByte78 == 2) {
			arg1.anInt4806 = arg2 * arg1.anInt4780 >> 14;
		}
		@Pc(45) int local45 = arg1.anInt4831;
		if (arg1.aByte79 == 0) {
			arg1.anInt4831 = arg1.anInt4774;
		} else if (arg1.aByte79 == 1) {
			arg1.anInt4831 = arg0 - arg1.anInt4774;
		} else if (arg1.aByte79 == 2) {
			arg1.anInt4831 = arg1.anInt4774 * arg0 >> 14;
		}
		if (arg1.aByte78 == 4) {
			arg1.anInt4806 = arg1.anInt4759 * arg1.anInt4831 / arg1.anInt4768;
		}
		if (arg1.aByte79 == 4) {
			arg1.anInt4831 = arg1.anInt4768 * arg1.anInt4806 / arg1.anInt4759;
		}
		if (Static80.aBoolean170 && (Static70.method1542(arg1).anInt8126 != 0 || arg1.anInt4796 == 0)) {
			if (arg1.anInt4831 < 5 && arg1.anInt4806 < 5) {
				arg1.anInt4806 = 5;
				arg1.anInt4831 = 5;
			} else {
				if (arg1.anInt4831 <= 0) {
					arg1.anInt4831 = 5;
				}
				if (arg1.anInt4806 <= 0) {
					arg1.anInt4806 = 5;
				}
			}
		}
		if (Static175.anInt3712 == arg1.anInt4825) {
			Static375.aClass155_8 = arg1;
		}
		if (arg3 && arg1.anObjectArray22 != null && (arg1.anInt4806 != local8 || arg1.anInt4831 != local45)) {
			@Pc(189) Class4_Sub37 local189 = new Class4_Sub37();
			local189.anObjectArray31 = arg1.anObjectArray22;
			local189.aClass155_10 = arg1;
			Static197.aClass22_23.method894(local189);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	public static void method4458() {
		Static296.aClass324_3.method7427();
		Static432.aClass335_3.method7599();
		Static516.aClass127_2.method2863();
		Static103.aClass298_1.method6820();
		Class21_Sub1_Sub2_Sub1.lb.method4989();
		Static338.aClass29_1.method976();
		Static17.aClass254_1.method5937();
		Static342.aClass132_2.method2959();
		Static420.aClass60_1.method1602();
		Static152.aClass290_1.method6671();
		Static203.aClass230_1.method5251();
		Static259.aClass249_2.method5894();
		Static89.aClass121_1.method2683();
		Static5.aClass301_1.method6913();
		Static245.aClass107_2.method2504();
		Static145.aClass56_1.method1555();
		Static240.aClass175_1.method4143();
		Static207.aClass201_1.method4808();
		Static198.aClass338_1.method7715();
		Static288.aClass47_1.method1277();
		Static98.method1902();
		Static286.method4841();
		Static75.method1601();
		Static199.method3262();
		if (Static342.aClass326_6 != Static383.aClass326_7) {
			for (@Pc(82) int local82 = 0; local82 < Static302.aByteArrayArray20.length; local82++) {
				Static302.aByteArrayArray20[local82] = null;
			}
			Static215.anInt4516 = 0;
		}
		Static20.method827();
		Static309.method4890();
		Static28.method914();
		Static36.method1052();
		Static343.method5246();
		Static471.aClass167_53.method3961();
		Static39.aClass7_2.method7811();
		Static535.method7527();
		Static536.method7530();
		Static388.aClass348_95.method7980();
		Static42.aClass348_21.method7980();
		Static196.aClass348_49.method7980();
		Static414.aClass348_98.method7980();
		Static518.aClass348_118.method7980();
		Static46.aClass348_22.method7980();
		Static326.aClass348_69.method7980();
		Static383.aClass348_91.method7980();
		Static159.aClass348_38.method7980();
		Static580.aClass348_84.method7980();
		Static26.aClass348_12.method7980();
		Static84.aClass348_28.method7980();
		Static75.aClass348_26.method7980();
		Static478.aClass348_114.method7980();
		Static19.aClass348_11.method7980();
		Static359.aClass348_76.method7980();
		Static7.aClass348_6.method7980();
		Static364.aClass348_77.method7980();
		Static249.aClass348_41.method7980();
		Static384.aClass348_92.method7980();
		Static377.aClass348_85.method7980();
		Static325.aClass348_68.method7980();
		Static506.aClass348_117.method7980();
		Static272.aClass348_136.method7980();
		Static390.aClass348_96.method7980();
		Static417.aClass348_56.method7980();
		Static453.aClass348_104.method7980();
		Static277.aClass348_62.method7980();
		Static459.aClass348_101.method7980();
		Static175.aClass348_44.method7980();
		Static131.aClass348_30.method7980();
		Static18.aClass348_10.method7980();
		Static365.aClass167_34.method3961();
		Static278.aClass167_20.method3961();
		Static499.aClass167_44.method3961();
		Static107.aClass167_7.method3961();
	}
}
