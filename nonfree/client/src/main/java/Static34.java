import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
	public static int anInt588;

	@OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
	public static int anInt593;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_11 = new Class208(43, 8);

	@OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
	public static final int anInt591 = 1406;

	@OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
	public static int anInt592 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(JIZI)V")
	public static void method465(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static312.method5048(0, true, 0, arg1, local22, local15, arg2, 0);
			return;
		}
		@Pc(45) Class47 local45 = Static230.aClass96_4.method2303(local29);
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (local22 == 0 || local22 == 2) {
			local55 = local45.anInt1241;
			local58 = local45.anInt1247;
		} else {
			local55 = local45.anInt1247;
			local58 = local45.anInt1241;
		}
		@Pc(69) int local69 = local45.anInt1267;
		if (local22 != 0) {
			local69 = (local69 << local22 & 0xF) + (local69 >> 4 - local22);
		}
		Static312.method5048(local55, true, local69, arg1, 0, 0, arg2, local58);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!vt;IB)V")
	public static void method466(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (Static151.aClass70_6 == null) {
			return;
		}
		try {
			Static151.aClass70_6.method1552(0L);
			Static151.aClass70_6.method1553(arg0.aByteArray100, arg1, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[Lclient!ab;)V")
	public static void method468(@OriginalArg(1) int arg0, @OriginalArg(2) Class3[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) Class3 local18 = arg1[local12];
			if (local18 != null) {
				if (local18.anInt91 == 0) {
					if (local18.aClass3Array1 != null) {
						method468(arg0, local18.aClass3Array1);
					}
					@Pc(39) Class2_Sub26 local39 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local18.anInt94);
					if (local39 != null) {
						Static206.method3765(arg0, local39.anInt4145);
					}
				}
				@Pc(55) Class2_Sub5 local55;
				if (arg0 == 0 && local18.anObjectArray22 != null) {
					local55 = new Class2_Sub5();
					local55.anObjectArray33 = local18.anObjectArray22;
					local55.aClass3_4 = local18;
					Static351.method5589(local55);
				}
				if (arg0 == 1 && local18.anObjectArray23 != null) {
					if (local18.anInt45 >= 0) {
						@Pc(78) Class3 local78 = Static380.method5987(local18.anInt94);
						if (local78 == null || local78.aClass3Array1 == null || local78.aClass3Array1.length <= local18.anInt45 || local78.aClass3Array1[local18.anInt45] != local18) {
							continue;
						}
					}
					local55 = new Class2_Sub5();
					local55.aClass3_4 = local18;
					local55.anObjectArray33 = local18.anObjectArray23;
					Static351.method5589(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)I")
	public static int method469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static146.anIntArray241[arg1 & 0x3] : Static50.anIntArray79[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public static void method470() {
		Static272.aClass3ArrayArray1 = new Class3[Static180.aClass83_69.method1956()][];
		Static260.aBooleanArray19 = new boolean[Static180.aClass83_69.method1956()];
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)V")
	public static void method472() {
		for (@Pc(18) Class2_Sub25 local18 = (Class2_Sub25) Static209.aClass238_19.method5795(); local18 != null; local18 = (Class2_Sub25) Static209.aClass238_19.method5799()) {
			if (Static45.aClass188ArrayArrayArray5 == null) {
				local18.method6130();
			} else {
				@Pc(44) int local44;
				@Pc(268) Class1_Sub5 local268;
				@Pc(304) Class1_Sub5_Sub2 local304;
				@Pc(213) Class1_Sub3 local213;
				@Pc(113) Class1_Sub2 local113;
				@Pc(68) Class1_Sub1 local68;
				@Pc(249) Class1_Sub3_Sub2 local249;
				@Pc(87) Class1_Sub1_Sub3 local87;
				if (local18.anInt3746 <= Static339.anInt6265) {
					local44 = Static307.anIntArray497[local18.anInt3732];
					if (local44 == 0) {
						local268 = Static94.method1598(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local268 instanceof Class1_Sub5_Sub2) {
							Static306.method5014(local18.anInt3744, local18.anInt3731, local18.anInt3745);
							local304 = (Class1_Sub5_Sub2) local268;
							if (local304.aClass1_Sub5_3 != null) {
								Static210.method5843(local18.anInt3744, local18.anInt3731, local18.anInt3745, local304.aClass1_Sub5_3, null);
							}
						}
					} else if (local44 == 1) {
						local213 = Static204.method3744(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local213 instanceof Class1_Sub3_Sub2) {
							Static288.method4746(local18.anInt3744, local18.anInt3731, local18.anInt3745);
							local249 = (Class1_Sub3_Sub2) local213;
							if (local249.aClass1_Sub3_1 != null) {
								Static29.method337(local18.anInt3744, local18.anInt3731, local18.anInt3745, local249.aClass1_Sub3_1, null);
							}
						}
					} else if (local44 == 2) {
						local113 = Static278.method4615(local18.anInt3744, local18.anInt3731, local18.anInt3745, td.class);
						if (local113 instanceof Class1_Sub2_Sub3) {
							Static135.method2359(local18.anInt3744, local18.anInt3731, local18.anInt3745, td.class);
							@Pc(440) Class1_Sub2_Sub3 local440 = (Class1_Sub2_Sub3) local113;
							if (local440.aClass1_Sub2_2 != null) {
								Static233.method4185(local440.aClass1_Sub2_2, false);
							}
						}
					} else if (local44 == 3) {
						local68 = Static266.method4518(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local68 instanceof Class1_Sub1_Sub3) {
							Static319.method5150(local18.anInt3744, local18.anInt3731, local18.anInt3745);
							local87 = (Class1_Sub1_Sub3) local68;
							if (local87.aClass1_Sub1_1 != null) {
								Static339.method5453(local18.anInt3744, local18.anInt3731, local18.anInt3745, local87.aClass1_Sub1_1);
							}
						}
					}
					local18.method6130();
				} else if (local18.anInt3734 == Static339.anInt6265) {
					local44 = Static307.anIntArray497[local18.anInt3732];
					if (local44 == 0) {
						local268 = Static94.method1598(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local268 instanceof Class1_Sub5_Sub2) {
							local18.method6130();
						} else if (Static313.method5079(local18.anInt3744, local18.anInt3731, local18.anInt3745) == null) {
							local304 = new Class1_Sub5_Sub2(local18.anInt3732, local18.anInt3730, local18.anInt3747, local18.anInt3728, local18.anInt3740, local268);
							Static210.method5843(local18.anInt3744, local18.anInt3731, local18.anInt3745, local304, null);
						} else {
							local18.method6130();
						}
					} else if (local44 == 1) {
						local213 = Static204.method3744(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local213 instanceof Class1_Sub3_Sub2) {
							local18.method6130();
						} else if (Static121.method5862(local18.anInt3744, local18.anInt3731, local18.anInt3745) == null) {
							local249 = new Class1_Sub3_Sub2(local18.anInt3732, local18.anInt3730, local18.anInt3747, local18.anInt3728, local18.anInt3740, local213);
							Static29.method337(local18.anInt3744, local18.anInt3731, local18.anInt3745, local249, null);
						} else {
							local18.method6130();
						}
					} else if (local44 == 2) {
						local113 = Static278.method4615(local18.anInt3744, local18.anInt3731, local18.anInt3745, td.class);
						if (local113 instanceof Class1_Sub2_Sub3) {
							local18.method6130();
						} else {
							Static135.method2359(local18.anInt3744, local18.anInt3731, local18.anInt3745, td.class);
							@Pc(142) Class47 local142 = Static230.aClass96_4.method2303(local18.anInt3729);
							@Pc(155) int local155;
							@Pc(158) int local158;
							if (local18.anInt3730 == 1 || local18.anInt3730 == 3) {
								local155 = local142.anInt1241;
								local158 = local142.anInt1247;
							} else {
								local155 = local142.anInt1247;
								local158 = local142.anInt1241;
							}
							@Pc(199) Class1_Sub2_Sub3 local199 = new Class1_Sub2_Sub3(local18.anInt3732, local18.anInt3730, local18.anInt3744, local18.anInt3747, local18.anInt3728, local18.anInt3740, local18.anInt3731, local155 + local18.anInt3731 - 1, local18.anInt3745, local158 + local18.anInt3745 - 1, local113);
							Static233.method4185(local199, false);
						}
					} else if (local44 == 3) {
						local68 = Static266.method4518(local18.anInt3744, local18.anInt3731, local18.anInt3745);
						if (local68 instanceof Class1_Sub1_Sub3) {
							local18.method6130();
						} else {
							local87 = new Class1_Sub1_Sub3(local18.anInt3747, local18.anInt3728, local18.anInt3740, local68);
							Static339.method5453(local18.anInt3744, local18.anInt3731, local18.anInt3745, local87);
						}
					}
				}
			}
		}
	}
}
