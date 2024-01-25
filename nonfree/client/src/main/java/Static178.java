import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_164 = new Class140("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_224 = new Class221(65, 14);

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_225 = new Class221(48, 14);

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Z")
	public static boolean aBoolean611 = false;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Lclient!dr;I)V")
	public static void method5752(@OriginalArg(0) Class37 arg0) {
		@Pc(7) int local7 = Static118.anInt2499;
		@Pc(9) int local9 = Static220.anInt4855;
		@Pc(11) int local11 = Static118.anInt2488;
		@Pc(15) int local15 = Static130.anInt2766 - 3;
		if (Static107.aClass46_8 == null || Static101.aClass46_7 == null) {
			if (Static338.aClass104_184.method2755(Static83.anInt1550) && Static338.aClass104_184.method2755(Static177.anInt3975)) {
				Static107.aClass46_8 = arg0.method3708(Static368.method843(Static338.aClass104_184, Static83.anInt1550, 0));
				@Pc(44) Class40 local44 = Static368.method843(Static338.aClass104_184, Static177.anInt3975, 0);
				Static101.aClass46_7 = arg0.method3708(local44);
				local44.method840();
				Static40.aClass46_5 = arg0.method3708(local44);
			} else {
				arg0.method3712(local7, local9, local11, 20, 255 - Static214.anInt4720 << 24 | Static219.anInt4846, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static107.aClass46_8 != null && Static101.aClass46_7 != null) {
			local88 = (local11 - Static101.aClass46_7.method5019() * 2) / Static107.aClass46_8.method5019();
			for (local90 = 0; local90 < local88; local90++) {
				Static107.aClass46_8.method5016(local7 + Static101.aClass46_7.method5019() + Static107.aClass46_8.method5019() * local90, local9);
			}
			Static101.aClass46_7.method5016(local7, local9);
			Static40.aClass46_5.method5016(local7 + local11 - Static40.aClass46_5.method5019(), local9);
		}
		Static25.aClass71_1.method5250(Static251.aClass140_124.method4155(Static239.anInt2803), local9 + 14, Static180.anInt4020 | 0xFF000000, -1, local7 + 3);
		arg0.method3712(local7, local9 + 20, local11, local15 - 20, -Static214.anInt4720 + 255 << 24 | Static219.anInt4846, 1);
		local88 = Class1_Sub2_Sub5.lb.method2470();
		local90 = Class1_Sub2_Sub5.lb.method2466();
		@Pc(177) int local177 = 0;
		@Pc(200) int local200;
		for (@Pc(182) Class2_Sub31 local182 = (Class2_Sub31) Static103.aClass180_24.method4919(); local182 != null; local182 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			local200 = local9 + (-local177 + -1 + Static225.anInt4918) * 16 + 13 + 20;
			local177++;
			if (local88 > local7 && local11 + local7 > local88 && local200 - 13 < local90 && local200 + 4 > local90 && local182.aBoolean468) {
				arg0.method3712(local7, local200 - 12, local11, 16, Static101.anInt2078 | 255 - Static212.anInt4636 << 24, 1);
			}
		}
		if ((Static299.aClass46_22 == null || Static184.aClass46_14 == null || Static283.aClass46_20 == null) && Static338.aClass104_184.method2755(Static134.anInt2877) && Static338.aClass104_184.method2755(Static89.anInt1730) && Static338.aClass104_184.method2755(Static195.anInt4283)) {
			@Pc(276) Class40 local276 = Static368.method843(Static338.aClass104_184, Static89.anInt1730, 0);
			Static184.aClass46_14 = arg0.method3708(local276);
			local276.method840();
			Static200.aClass46_15 = arg0.method3708(local276);
			Static299.aClass46_22 = arg0.method3708(Static368.method843(Static338.aClass104_184, Static134.anInt2877, 0));
			@Pc(301) Class40 local301 = Static368.method843(Static338.aClass104_184, Static195.anInt4283, 0);
			Static283.aClass46_20 = arg0.method3708(local301);
			local301.method840();
			Static86.aClass46_6 = arg0.method3708(local301);
		}
		@Pc(372) int local372;
		@Pc(332) int local332;
		if (Static299.aClass46_22 != null && Static184.aClass46_14 != null && Static283.aClass46_20 != null) {
			local200 = (local11 - Static283.aClass46_20.method5019() * 2) / Static299.aClass46_22.method5019();
			for (local332 = 0; local332 < local200; local332++) {
				Static299.aClass46_22.method5016(local7 + Static283.aClass46_20.method5019() + Static299.aClass46_22.method5019() * local332, -Static299.aClass46_22.method5023() + (local9 - -local15));
			}
			local372 = (local15 - Static283.aClass46_20.method5023() - 20) / Static184.aClass46_14.method5023();
			for (@Pc(374) int local374 = 0; local374 < local372; local374++) {
				Static184.aClass46_14.method5016(local7, local9 + Static184.aClass46_14.method5023() * local374 + 20);
				Static200.aClass46_15.method5016(local7 + local11 - Static200.aClass46_15.method5019(), local374 * Static184.aClass46_14.method5023() + local9 + 20);
			}
			Static283.aClass46_20.method5016(local7, local15 + local9 - Static283.aClass46_20.method5023());
			Static86.aClass46_6.method5016(local7 + local11 - Static283.aClass46_20.method5019(), local15 + local9 + -Static283.aClass46_20.method5023());
		}
		local177 = 0;
		for (@Pc(446) Class2_Sub31 local446 = (Class2_Sub31) Static103.aClass180_24.method4919(); local446 != null; local446 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			local332 = (Static225.anInt4918 - local177 - 1) * 16 + local9 + 13 + 20;
			local372 = Static180.anInt4020 | 0xFF000000;
			if (local7 < local88 && local88 < local11 + local7 && local332 - 13 < local90 && local90 < local332 + 4 && local446.aBoolean468) {
				local372 = Static273.anInt5607 | 0xFF000000;
			}
			@Pc(498) int[] local498 = null;
			if (Static2.method59(local446.anInt5368)) {
				local498 = Static310.aClass184_2.method5040((int) local446.aLong163).anIntArray296;
			} else if (Static223.method4181(local446.anInt5368)) {
				@Pc(559) Class1_Sub2_Sub3_Sub2 local559 = Static95.aClass1_Sub2_Sub3_Sub2Array1[(int) local446.aLong163];
				if (local559 != null) {
					@Pc(564) Class139 local564 = local559.aClass139_1;
					if (local564.anIntArray350 != null) {
						local564 = local564.method4120();
					}
					if (local564 != null) {
						local498 = local564.anIntArray351;
					}
				}
			} else if (Static237.method4310(local446.anInt5368)) {
				@Pc(533) Class74 local533;
				if (local446.anInt5368 == 1002) {
					local533 = Static228.method4210((int) local446.aLong163);
				} else {
					local533 = Static228.method4210((int) (local446.aLong163 >>> 32 & 0x7FFFFFFFL));
				}
				if (local533.anIntArray161 != null) {
					local533 = local533.method1997();
				}
				if (local533 != null) {
					local498 = local533.anIntArray164;
				}
			}
			@Pc(593) String local593 = Static159.method2497(local446);
			if (local498 != null) {
				local593 = local593 + Static106.method2086(local498);
			}
			Static25.aClass71_1.method5245(Static87.anIntArray130, Static65.aClass46Array24, local7 + 3, local332, local593, local372);
			if (local446.aBoolean469) {
				Static242.aClass46_18.method5016(local7 + Static99.aClass82_3.method2230(local593) + 5, local332 + -12);
			}
			local177++;
		}
		Static304.method5123(Static220.anInt4855, Static118.anInt2499, Static130.anInt2766, Static118.anInt2488);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method5753() {
		Static186.aClass107_20.method3011(5);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5755(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static325.anInt6336 = 7;
		Static6.anInt96 = 0x1 << Static325.anInt6336;
		Static31.anInt496 = Static6.anInt96 >> 1;
		Static312.anInt6196 = (int) Math.sqrt((double) (Static31.anInt496 * Static31.anInt496 + Static31.anInt496 * Static31.anInt496));
		Static344.anInt6692 = arg0;
		Static63.anInt1129 = arg1;
		Static26.anInt3838 = arg2;
		Static150.aClass51ArrayArrayArray2 = new Class51[4][Static344.anInt6692][Static63.anInt1129];
		Static101.aClass105Array2 = new Class105[4];
		if (arg3) {
			Static54.aClass51ArrayArrayArray1 = new Class51[1][Static344.anInt6692][Static63.anInt1129];
			Static26.anIntArrayArray35 = new int[Static344.anInt6692][Static63.anInt1129];
			Static121.aClass105Array3 = new Class105[1];
		} else {
			Static54.aClass51ArrayArrayArray1 = null;
			Static26.anIntArrayArray35 = null;
			Static121.aClass105Array3 = null;
		}
		if (arg4) {
			Static360.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static120.aClass2_Sub10_Sub1Array2 = new Class2_Sub10_Sub1[65535];
			Static121.aBooleanArray10 = new boolean[65535];
			Static88.anInt1647 = 0;
		} else {
			Static360.aLongArrayArrayArray1 = null;
			Static120.aClass2_Sub10_Sub1Array2 = null;
			Static121.aBooleanArray10 = null;
			Static88.anInt1647 = 0;
		}
		Static297.method4934(false);
		Static133.aClass175Array2 = new Class175[500];
		Static336.anInt6523 = 0;
		Static49.aClass175Array1 = new Class175[500];
		Static215.anInt4742 = 0;
		Static46.anIntArrayArrayArray3 = new int[4][Static344.anInt6692 + 1][Static63.anInt1129 + 1];
		Static230.aClass1_Sub2Array6 = new Class1_Sub2[5000];
		Static204.anInt4466 = 0;
		Static148.aBooleanArrayArray3 = new boolean[Static26.anInt3838 + Static26.anInt3838 + 1][Static26.anInt3838 + Static26.anInt3838 + 1];
		Static162.aBooleanArrayArray4 = new boolean[Static26.anInt3838 + Static26.anInt3838 + 2][Static26.anInt3838 + Static26.anInt3838 + 2];
		Static328.aClass80_29 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ef;)Lclient!gs;")
	public static Class85 method5760(@OriginalArg(1) Class2_Sub12 arg0) {
		@Pc(12) Class85 local12 = new Class85();
		local12.anInt2466 = arg0.method3104();
		local12.aClass2_Sub9_Sub8_1 = Static332.method5409(local12.anInt2466);
		return local12;
	}
}
