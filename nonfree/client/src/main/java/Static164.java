import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "Lclient!nm;")
	public static Class146 aClass146_1;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_52 = new Class40("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "Lclient!aj;")
	public static final Class5_Sub3_Sub1 aClass5_Sub3_Sub1_2 = new Class5_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
	public static void method2918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static398.anInt7144 && Static71.anInt4958 >= arg3 + arg2 && arg0 - arg3 >= Static4.anInt6709 && Static492.anInt8451 >= arg0 + arg3) {
			Static412.method5986(arg1, arg0, arg3, arg2);
		} else {
			Static106.method2146(arg0, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg3 < 0 || arg6 < 0 || Static460.anInt7894 - 1 <= arg3 || Static235.anInt4493 - 1 <= arg6) {
			return;
		}
		if (Static152.aClass37ArrayArrayArray1 == null) {
			return;
		}
		@Pc(63) Interface10 local63;
		if (arg5 == 0) {
			local63 = (Interface10) Static490.method6780(arg2, arg3, arg6);
			@Pc(263) Interface10 local263 = (Interface10) Static523.method7170(arg2, arg3, arg6);
			if (local63 != null && arg0 != 2) {
				if (local63 instanceof Class15_Sub3_Sub3) {
					((Class15_Sub3_Sub3) local63).aClass311_3.method7262(arg1);
				} else {
					Static317.method5107(arg0, arg4, arg2, arg3, arg6, arg5, local63.method6868(), arg1);
				}
			}
			if (local263 != null) {
				if (local263 instanceof Class15_Sub3_Sub3) {
					((Class15_Sub3_Sub3) local263).aClass311_3.method7262(arg1);
				} else {
					Static317.method5107(arg0, arg4, arg2, arg3, arg6, arg5, local263.method6868(), arg1);
				}
			}
		} else if (arg5 == 1) {
			local63 = (Interface10) Static475.method6634(arg2, arg3, arg6);
			if (local63 != null) {
				if (local63 instanceof Class15_Sub1_Sub2) {
					((Class15_Sub1_Sub2) local63).aClass311_2.method7262(arg1);
				} else {
					@Pc(148) int local148 = local63.method6868();
					if (arg0 == 4 || arg0 == 5) {
						Static317.method5107(4, arg4, arg2, arg3, arg6, arg5, local148, arg1);
					} else if (arg0 == 6) {
						Static317.method5107(4, arg4 + 4, arg2, arg3, arg6, arg5, local148, arg1);
					} else if (arg0 == 7) {
						Static317.method5107(4, (arg4 + 2 & 0x3) + 4, arg2, arg3, arg6, arg5, local148, arg1);
					} else if (arg0 == 8) {
						Static317.method5107(4, arg4 + 4, arg2, arg3, arg6, arg5, local148, arg1);
						Static317.method5107(4, (arg4 + 2 & 0x3) + 4, arg2, arg3, arg6, arg5, local148, arg1);
					}
				}
			}
		} else if (arg5 == 2) {
			local63 = (Interface10) Static188.method3173(arg2, arg3, arg6, p.class);
			if (local63 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (local63 instanceof Class15_Sub2_Sub2) {
					((Class15_Sub2_Sub2) local63).aClass311_1.method7262(arg1);
				} else {
					Static317.method5107(arg0, arg4, arg2, arg3, arg6, arg5, local63.method6868(), arg1);
				}
			}
		} else if (arg5 == 3) {
			local63 = (Interface10) Static469.method6581(arg2, arg3, arg6);
			if (local63 != null) {
				if (local63 instanceof Class15_Sub5_Sub2) {
					((Class15_Sub5_Sub2) local63).aClass311_4.method7262(arg1);
				} else {
					Static317.method5107(arg0, arg4, arg2, arg3, arg6, arg5, local63.method6868(), arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method2920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg2;
		@Pc(14) int local14 = arg3 - arg1;
		for (@Pc(16) int local16 = arg2; local16 < local9; local16++) {
			Static321.method5153(arg4, arg5, Static352.anIntArrayArray51[local16], arg6);
		}
		for (@Pc(32) int local32 = arg3; local32 > local14; local32--) {
			Static321.method5153(arg4, arg5, Static352.anIntArrayArray51[local32], arg6);
		}
		@Pc(55) int local55 = arg1 + arg5;
		@Pc(59) int local59 = arg6 - arg1;
		for (@Pc(61) int local61 = local9; local61 <= local14; local61++) {
			@Pc(67) int[] local67 = Static352.anIntArrayArray51[local61];
			Static321.method5153(arg4, arg5, local67, local55);
			Static321.method5153(arg0, local55, local67, local59);
			Static321.method5153(arg4, local59, local67, arg6);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ui;II)V")
	public static void method2921(@OriginalArg(1) Class5_Sub47 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static521.aClass99_78.aClass5_102) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt8479;
		@Pc(18) int local18 = arg0.anInt8477;
		@Pc(21) int local21 = arg0.anInt8474;
		@Pc(25) int local25 = (int) arg0.aLong237;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong237;
		if (local21 == 2) {
			Static42.anInt967 = 2;
			Static136.anInt2833 = arg1;
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static415.method5995(Static159.aClass236_30);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4181(Static383.anInt7004);
			aClass5_Sub3_Sub1_2.method4184(Static207.anInt3882);
			aClass5_Sub3_Sub1_2.method4200(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt4745);
			aClass5_Sub3_Sub1_2.method4224(Static496.anInt8516);
		}
		@Pc(90) Class5_Sub51 local90;
		@Pc(103) Class15_Sub2_Sub1_Sub2 local103;
		if (local21 == 60) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				Static310.anInt6067 = 0;
				Static42.anInt967 = 2;
				Static152.anInt3130 = arg2;
				Static136.anInt2833 = arg1;
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static415.method5995(Static169.aClass236_31);
				aClass5_Sub3_Sub1_2.method4224(local25);
				aClass5_Sub3_Sub1_2.method4204(Static59.aClass18_1.method5977(82) ? 1 : 0);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		@Pc(155) Class15_Sub2_Sub1_Sub1 local155;
		if (local21 == 51) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static42.anInt967 = 2;
				Static310.anInt6067 = 0;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				Static415.method5995(Static546.aClass236_101);
				aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4229(local25);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 16) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static310.anInt6067 = 0;
				Static42.anInt967 = 2;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				Static415.method5995(Static150.aClass236_27);
				aClass5_Sub3_Sub1_2.method4204(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4229(local25);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 49) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				Static152.anInt3130 = arg2;
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static310.anInt6067 = 0;
				Static42.anInt967 = 2;
				Static136.anInt2833 = arg1;
				Static415.method5995(Static479.aClass236_85);
				aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4229(local25);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		if (local21 == 1004) {
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static310.anInt6067 = 0;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static451.aClass236_77);
			aClass5_Sub3_Sub1_2.method4181(local25);
		}
		if (local21 == 11) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static42.anInt967 = 2;
				Static152.anInt3130 = arg2;
				Static310.anInt6067 = 0;
				Static136.anInt2833 = arg1;
				Static415.method5995(Static460.aClass236_78);
				aClass5_Sub3_Sub1_2.method4200(local25);
				aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 1003) {
			Static152.anInt3130 = arg2;
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static310.anInt6067 = 0;
			Static415.method5995(Static338.aClass236_56);
			aClass5_Sub3_Sub1_2.method4181(local25);
		}
		@Pc(460) Class220 local460;
		if (local21 == 5) {
			local460 = Static485.method6724(local15, local18);
			if (local460 != null) {
				Static541.method7393(local460);
			}
		}
		if (local21 == 58 && Static381.aClass220_16 == null) {
			Static101.method2099(local15, local18);
			Static381.aClass220_16 = Static485.method6724(local15, local18);
			Static377.method5650(Static381.aClass220_16);
		}
		if (local21 == 46) {
			if (Static137.anInt1383 > 0 && Static59.aClass18_1.method5977(82) && Static59.aClass18_1.method5977(81)) {
				Static281.method4575(Static515.anInt3214 + local15, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, Static338.anInt6353 + local18);
			} else {
				Static183.method3490(local15, local25, local18);
				if (local25 == 1) {
					aClass5_Sub3_Sub1_2.method4192(-1);
					aClass5_Sub3_Sub1_2.method4192(-1);
					aClass5_Sub3_Sub1_2.method4181((int) Static476.aFloat339);
					aClass5_Sub3_Sub1_2.method4192(57);
					aClass5_Sub3_Sub1_2.method4192(Static352.anInt6565);
					aClass5_Sub3_Sub1_2.method4192(Static145.anInt3048);
					aClass5_Sub3_Sub1_2.method4192(89);
					aClass5_Sub3_Sub1_2.method4181(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492);
					aClass5_Sub3_Sub1_2.method4181(Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493);
					aClass5_Sub3_Sub1_2.method4192(63);
				} else {
					Static152.anInt3130 = arg2;
					Static136.anInt2833 = arg1;
					Static42.anInt967 = 1;
					Static310.anInt6067 = 0;
				}
				Static534.method7283(local18, 0, -4, 0, local15, 1, true, 1);
			}
		}
		if (local21 == 25) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static152.anInt3130 = arg2;
				Static42.anInt967 = 2;
				Static136.anInt2833 = arg1;
				Static310.anInt6067 = 0;
				Static415.method5995(Static238.aClass236_46);
				aClass5_Sub3_Sub1_2.method4229(local25);
				aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 20) {
			Static310.anInt6067 = 0;
			Static42.anInt967 = 1;
			Static136.anInt2833 = arg1;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static395.aClass236_62);
			aClass5_Sub3_Sub1_2.method4224(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4229(Static383.anInt7004);
			aClass5_Sub3_Sub1_2.method4181(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4184(Static207.anInt3882);
			aClass5_Sub3_Sub1_2.method4181(Static496.anInt8516);
			Static534.method7283(local18, 0, -4, 0, local15, 1, true, 1);
		}
		if (local21 == 17) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				Static42.anInt967 = 2;
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				Static310.anInt6067 = 0;
				Static415.method5995(Static326.aClass236_50);
				aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4200(local25);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		if (local21 == 12) {
			local460 = Static485.method6724(local15, local18);
			if (local460 != null) {
				Static187.method3151();
				@Pc(795) Class5_Sub11 local795 = Static68.method1303(local460);
				Static121.method2295(local460, local795.method1953(), local795.anInt2105);
				Static150.aString37 = Static247.method4238(local460);
				if (Static150.aString37 == null) {
					Static150.aString37 = "Null";
				}
				Static516.aString81 = local460.aString63 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 4) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static136.anInt2833 = arg1;
				Static42.anInt967 = 2;
				Static152.anInt3130 = arg2;
				Static310.anInt6067 = 0;
				Static415.method5995(Static404.aClass236_65);
				aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4181(local25);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		if (local21 == 10) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static136.anInt2833 = arg1;
				Static310.anInt6067 = 0;
				Static42.anInt967 = 2;
				Static152.anInt3130 = arg2;
				Static415.method5995(Static159.aClass236_30);
				aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4181(Static383.anInt7004);
				aClass5_Sub3_Sub1_2.method4184(Static207.anInt3882);
				aClass5_Sub3_Sub1_2.method4200(local25);
				aClass5_Sub3_Sub1_2.method4224(Static496.anInt8516);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 1010) {
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static536.aClass236_99);
			aClass5_Sub3_Sub1_2.method4200(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4181(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4224((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static238.method4074(local34, local15, local18);
		}
		if (local21 == 59) {
			if (Static137.anInt1383 > 0 && Static59.aClass18_1.method5977(82) && Static59.aClass18_1.method5977(81)) {
				Static281.method4575(local15 + Static515.anInt3214, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, Static338.anInt6353 + local18);
			} else {
				Static42.anInt967 = 1;
				Static310.anInt6067 = 0;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				Static415.method5995(Static276.aClass236_49);
				aClass5_Sub3_Sub1_2.method4229(local15 + Static515.anInt3214);
				aClass5_Sub3_Sub1_2.method4224(local18 + Static338.anInt6353);
			}
		}
		if (local21 == 6) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static310.anInt6067 = 0;
				Static42.anInt967 = 2;
				Static152.anInt3130 = arg2;
				Static136.anInt2833 = arg1;
				Static415.method5995(Static334.aClass236_63);
				aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4181(local25);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 47) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				Static42.anInt967 = 2;
				Static136.anInt2833 = arg1;
				Static310.anInt6067 = 0;
				Static152.anInt3130 = arg2;
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static415.method5995(Static180.aClass236_33);
				aClass5_Sub3_Sub1_2.method4181(local25);
				aClass5_Sub3_Sub1_2.method4204(Static59.aClass18_1.method5977(82) ? 1 : 0);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		if (local21 == 22 || local21 == 1007) {
			Static307.method5028(local18, local15, arg0.aString77, local25);
		}
		if (local21 == 15) {
			Static152.anInt3130 = arg2;
			Static42.anInt967 = 2;
			Static136.anInt2833 = arg1;
			Static310.anInt6067 = 0;
			Static415.method5995(Static368.aClass236_59);
			aClass5_Sub3_Sub1_2.method4200(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4229(Integer.MAX_VALUE & (int) (local34 >>> 32));
			aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4200(local18 + Static338.anInt6353);
			Static238.method4074(local34, local15, local18);
		}
		if (local21 == 48) {
			Static310.anInt6067 = 0;
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static136.anInt2833 = arg1;
			Static415.method5995(Static142.aClass236_26);
			aClass5_Sub3_Sub1_2.method4181(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4229(Integer.MAX_VALUE & (int) (local34 >>> 32));
			aClass5_Sub3_Sub1_2.method4181(local15 + Static515.anInt3214);
			Static238.method4074(local34, local15, local18);
		}
		if (local21 == 18) {
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static415.method5995(Static169.aClass236_32);
			aClass5_Sub3_Sub1_2.method4181(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4181(local25);
			aClass5_Sub3_Sub1_2.method4200(Static338.anInt6353 + local18);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			Static366.method5591(local15, local18);
		}
		if (local21 == 45) {
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static415.method5995(Static96.aClass236_17);
			aClass5_Sub3_Sub1_2.method4200(local25);
			aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4224(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4229(Static338.anInt6353 + local18);
			Static366.method5591(local15, local18);
		}
		if (local21 == 23) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static152.anInt3130 = arg2;
				Static42.anInt967 = 2;
				Static310.anInt6067 = 0;
				Static136.anInt2833 = arg1;
				Static415.method5995(Static477.aClass236_84);
				aClass5_Sub3_Sub1_2.method4204(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4200(local25);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 57) {
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static427.aClass236_69);
			aClass5_Sub3_Sub1_2.method4181(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4224(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4200(local25);
			Static366.method5591(local15, local18);
		}
		if (local21 == 50) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static42.anInt967 = 2;
				Static310.anInt6067 = 0;
				Static152.anInt3130 = arg2;
				Static136.anInt2833 = arg1;
				Static415.method5995(Static37.aClass236_4);
				aClass5_Sub3_Sub1_2.method4200(local25);
				aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 8) {
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				Static42.anInt967 = 2;
				Static310.anInt6067 = 0;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				Static415.method5995(Static45.aClass236_6);
				aClass5_Sub3_Sub1_2.method4221(Static207.anInt3882);
				aClass5_Sub3_Sub1_2.method4204(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4200(local25);
				aClass5_Sub3_Sub1_2.method4181(Static383.anInt7004);
				aClass5_Sub3_Sub1_2.method4200(Static496.anInt8516);
				Static534.method7283(local103.anIntArray307[0], 0, -2, 0, local103.anIntArray306[0], local103.method4035(), true, local103.method4035());
			}
		}
		if (local21 == 21) {
			Static152.anInt3130 = arg2;
			Static42.anInt967 = 2;
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			Static415.method5995(Static347.aClass236_58);
			aClass5_Sub3_Sub1_2.method4229(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4224(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4200(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static238.method4074(local34, local15, local18);
		}
		if (local21 == 13) {
			local155 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local25];
			if (local155 != null) {
				Static42.anInt967 = 2;
				Static136.anInt2833 = arg1;
				Static152.anInt3130 = arg2;
				Static310.anInt6067 = 0;
				Static415.method5995(Static109.aClass236_19);
				aClass5_Sub3_Sub1_2.method4219(Static59.aClass18_1.method5977(82) ? 1 : 0);
				aClass5_Sub3_Sub1_2.method4181(local25);
				Static534.method7283(local155.anIntArray307[0], 0, -2, 0, local155.anIntArray306[0], local155.method4035(), true, local155.method4035());
			}
		}
		if (local21 == 30) {
			Static136.anInt2833 = arg1;
			Static310.anInt6067 = 0;
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static435.aClass236_71);
			aClass5_Sub3_Sub1_2.method4224(local25);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4181(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4181(Static338.anInt6353 + local18);
			Static366.method5591(local15, local18);
		}
		if (local21 == 1001 || local21 == 1011 || local21 == 1009 || local21 == 1008 || local21 == 1002) {
			Static455.method5580(local21, local15, local25);
		}
		if (local21 == 1012) {
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			local90 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local25);
			if (local90 != null) {
				local103 = local90.aClass15_Sub2_Sub1_Sub2_2;
				@Pc(1918) Class305 local1918 = local103.aClass305_1;
				if (local1918.anIntArray679 != null) {
					local1918 = local1918.method7150(Static540.aClass242_1);
				}
				if (local1918 != null) {
					Static415.method5995(Static471.aClass236_82);
					aClass5_Sub3_Sub1_2.method4181(local1918.anInt8805);
				}
			}
		}
		if (local21 == 19) {
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static42.anInt967 = 2;
			Static136.anInt2833 = arg1;
			Static415.method5995(Static130.aClass236_22);
			aClass5_Sub3_Sub1_2.method4224(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4229(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4200((int) (local34 >>> 32) & Integer.MAX_VALUE);
			aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
			Static238.method4074(local34, local15, local18);
		}
		if (local21 == 3) {
			Static310.anInt6067 = 0;
			Static42.anInt967 = 2;
			Static136.anInt2833 = arg1;
			Static152.anInt3130 = arg2;
			Static415.method5995(Static186.aClass236_34);
			aClass5_Sub3_Sub1_2.method4180(Static59.aClass18_1.method5977(82) ? 1 : 0);
			aClass5_Sub3_Sub1_2.method4229(Static338.anInt6353 + local18);
			aClass5_Sub3_Sub1_2.method4200(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4224(local25);
			Static366.method5591(local15, local18);
		}
		if (local21 == 9) {
			Static42.anInt967 = 2;
			Static136.anInt2833 = arg1;
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static415.method5995(Static312.aClass236_52);
			aClass5_Sub3_Sub1_2.method4200(local15 + Static515.anInt3214);
			aClass5_Sub3_Sub1_2.method4229(Static383.anInt7004);
			aClass5_Sub3_Sub1_2.method4187(Static207.anInt3882);
			aClass5_Sub3_Sub1_2.method4229(local25);
			aClass5_Sub3_Sub1_2.method4229(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4181(Static496.anInt8516);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			Static366.method5591(local15, local18);
		}
		if (local21 == 44) {
			Static42.anInt967 = 2;
			Static152.anInt3130 = arg2;
			Static310.anInt6067 = 0;
			Static136.anInt2833 = arg1;
			Static415.method5995(Static450.aClass236_75);
			aClass5_Sub3_Sub1_2.method4181(Static496.anInt8516);
			aClass5_Sub3_Sub1_2.method4229(Static515.anInt3214 + local15);
			aClass5_Sub3_Sub1_2.method4200((int) (local34 >>> 32) & Integer.MAX_VALUE);
			aClass5_Sub3_Sub1_2.method4200(local18 + Static338.anInt6353);
			aClass5_Sub3_Sub1_2.method4221(Static207.anInt3882);
			aClass5_Sub3_Sub1_2.method4229(Static383.anInt7004);
			aClass5_Sub3_Sub1_2.method4192(Static59.aClass18_1.method5977(82) ? 1 : 0);
			Static238.method4074(local34, local15, local18);
		}
		if (Static479.aBoolean594) {
			Static187.method3151();
		}
		if (Static14.aClass220_1 != null && Static195.anInt3782 == 0) {
			Static377.method5650(Static14.aClass220_1);
		}
	}
}
