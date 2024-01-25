import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
	public static int[] anIntArray548;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
	public static int[] anIntArray549 = new int[2];

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_331 = new Class22(101, -1);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IJII)V")
	public static void method5589(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static166.method2734(local17, arg2, arg1, 0, true, 0, 0, local10);
			return;
		}
		@Pc(46) Class202 local46 = Static267.aClass262_2.method5560(local28);
		@Pc(62) int local62;
		@Pc(59) int local59;
		if (local17 == 0 || local17 == 2) {
			local59 = local46.anInt5801;
			local62 = local46.anInt5816;
		} else {
			local62 = local46.anInt5801;
			local59 = local46.anInt5816;
		}
		@Pc(73) int local73 = local46.anInt5834;
		if (local17 != 0) {
			local73 = (local73 << local17 & 0xF) + (local73 >> 4 - local17);
		}
		Static166.method2734(0, arg2, arg1, local59, true, local62, local73, 0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ya;BLclient!fs;)V")
	public static void method5592(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class76 arg1) {
		if (Static326.aBoolean509) {
			return;
		}
		arg0.p(0);
		Static400.aClass57_23 = arg0.method4308(Static456.method328(arg1, Static338.anInt5846));
		Static400.aClass57_23.method5534((Static141.anInt2881 - Static400.aClass57_23.j()) / 2, (Static302.anInt5346 - Static400.aClass57_23.T()) / 2);
		Static83.aClass57_10 = arg0.method4308(Static456.method328(arg1, Static367.anInt6320));
		Static83.aClass57_10.method5534((Static141.anInt2881 - Static83.aClass57_10.j()) / 2, 18);
		Static326.aBoolean509 = true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method5593(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static33.anInt606;
		@Pc(17) int[] local17 = Static99.anIntArray157;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(29) Class16_Sub1_Sub5_Sub1 local29 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local17[local21]];
			if (local29 != null && Static1.aClass16_Sub1_Sub5_Sub1_1 != local29 && local29.aString44 != null && local29.aString44.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static429.method5476(Static111.aClass215_28);
					Static3.aClass4_Sub12_Sub1_5.method2505(local17[local21]);
					Static3.aClass4_Sub12_Sub1_5.method2551(0);
				} else if (arg1 == 4) {
					Static429.method5476(Static130.aClass215_34);
					Static3.aClass4_Sub12_Sub1_5.method2521(0);
					Static3.aClass4_Sub12_Sub1_5.method2496(local17[local21]);
				} else if (arg1 == 5) {
					Static429.method5476(Static82.aClass215_18);
					Static3.aClass4_Sub12_Sub1_5.method2496(local17[local21]);
					Static3.aClass4_Sub12_Sub1_5.method2521(0);
				} else if (arg1 == 6) {
					Static429.method5476(Static122.aClass215_32);
					Static3.aClass4_Sub12_Sub1_5.method2521(0);
					Static3.aClass4_Sub12_Sub1_5.method2505(local17[local21]);
				} else if (arg1 == 7) {
					Static429.method5476(Static247.aClass215_52);
					Static3.aClass4_Sub12_Sub1_5.method2495(0);
					Static3.aClass4_Sub12_Sub1_5.method2524(local17[local21]);
				}
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static415.method5323(Static76.aClass83_32.method2267(Static178.anInt3423) + arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V")
	public static void method5595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static202.aClass164ArrayArrayArray5 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 << 14 | arg0 << 28 | arg1);
		@Pc(25) Class4_Sub18 local25 = (Class4_Sub18) Static440.aClass102_40.method2700(local19);
		if (local25 == null) {
			Static411.method5275(arg0, arg1, arg2);
			return;
		}
		@Pc(41) Class4_Sub45 local41 = (Class4_Sub45) local25.aClass183_14.method4140();
		if (local41 == null) {
			Static411.method5275(arg0, arg1, arg2);
			return;
		}
		@Pc(63) Class16_Sub3_Sub1 local63 = (Class16_Sub3_Sub1) Static411.method5275(arg0, arg1, arg2);
		if (local63 == null) {
			local63 = new Class16_Sub3_Sub1();
		} else {
			local63.anInt758 = local63.anInt746 = -1;
		}
		local63.anInt755 = local41.anInt7355;
		local63.anInt756 = local41.anInt7356;
		label44: while (true) {
			@Pc(91) Class4_Sub45 local91 = (Class4_Sub45) local25.aClass183_14.method4144();
			if (local91 == null) {
				break;
			}
			if (local91.anInt7355 != local63.anInt755) {
				local63.anInt758 = local91.anInt7355;
				local63.anInt752 = local91.anInt7356;
				while (true) {
					@Pc(112) Class4_Sub45 local112 = (Class4_Sub45) local25.aClass183_14.method4144();
					if (local112 == null) {
						break label44;
					}
					if (local63.anInt755 != local112.anInt7355 && local63.anInt758 != local112.anInt7355) {
						local63.anInt746 = local112.anInt7355;
						local63.anInt749 = local112.anInt7356;
					}
				}
			}
		}
		@Pc(156) int local156 = Static13.method135((arg1 << 7) + 64, arg0, (arg2 << 7) + 64);
		Static160.method2710(arg0, arg1, arg2, local156, local63);
	}
}
