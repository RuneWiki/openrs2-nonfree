import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
	public static final int[] anIntArray91 = new int[3];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z")
	public static boolean method2181(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBIIZ)V")
	public static void method2182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static478.method7175(arg2)) {
			Static289.method5062(arg1, -1, arg3, arg0, Static343.aClass225ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZIIII)V")
	public static void method2184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static214.aClass4_Sub19_Sub1_1.anInt3064 != 0 && arg4 != 0 && Static459.anInt8551 < 50 && arg3 != -1) {
			Static104.aClass281Array1[Static459.anInt8551++] = new Class281((byte) 2, arg3, arg4, arg0, arg5, arg2, arg1, null);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!r;)V")
	public static void method2189(@OriginalArg(1) Class44 arg0) {
		@Pc(7) int local7 = Static19.anInt285;
		@Pc(9) int local9 = Static543.anInt9642;
		@Pc(11) int local11 = Static179.anInt3618;
		@Pc(15) int local15 = Static17.anInt279 - 3;
		if (Static296.aClass78_10 == null || Static320.aClass78_13 == null) {
			if (Static281.aClass176_74.method3996(Static438.anInt8192) && Static281.aClass176_74.method3996(Static238.anInt4326)) {
				Static296.aClass78_10 = arg0.method5018(Static598.method6312(Static281.aClass176_74, Static438.anInt8192, 0), true);
				@Pc(60) Class261 local60 = Static598.method6312(Static281.aClass176_74, Static238.anInt4326, 0);
				Static320.aClass78_13 = arg0.method5018(local60, true);
				local60.method6319();
				Static119.aClass78_5 = arg0.method5018(local60, true);
			} else {
				arg0.J(local7, local9, local11, 20, Static248.anInt4557 | 255 - Static173.anInt3514 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static296.aClass78_10 != null && Static320.aClass78_13 != null) {
			local87 = (local11 - Static320.aClass78_13.E() * 2) / Static296.aClass78_10.E();
			for (local89 = 0; local89 < local87; local89++) {
				Static296.aClass78_10.method8185(Static320.aClass78_13.E() + local7 + local89 * Static296.aClass78_10.E(), local9);
			}
			Static320.aClass78_13.method8185(local7, local9);
			Static119.aClass78_5.method8185(local11 + local7 - Static119.aClass78_5.E(), local9);
		}
		Static552.aClass58_14.method8156(-1, -16777216 | Static158.anInt3278, Static590.aClass364_28.method8334(Static154.anInt3181), local9 + 14, local7 + 3);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static248.anInt4557 | -Static173.anInt3514 + 255 << 24, 1);
		local87 = Static172.aClass135_1.method6370();
		local89 = Static172.aClass135_1.method6378();
		@Pc(173) int local173 = 0;
		@Pc(195) int local195;
		for (@Pc(178) Class4_Sub39 local178 = (Class4_Sub39) Static40.aClass244_4.method5963(); local178 != null; local178 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			local195 = (Static339.anInt6583 - local173 - 1) * 16 + local9 + 20 + 13;
			local173++;
			if (local87 > local7 && local7 + local11 > local87 && local195 - 13 < local89 && local89 < local195 + 4 && local178.aBoolean605) {
				arg0.J(local7, local195 - 12, local11, 16, Static442.anInt8224 | 255 - Static148.anInt10017 << 24, 1);
			}
		}
		if ((Static517.aClass78_33 == null || Static234.aClass78_7 == null || Static368.aClass78_21 == null) && Static281.aClass176_74.method3996(Static111.anInt2627) && Static281.aClass176_74.method3996(Static15.anInt245) && Static281.aClass176_74.method3996(Static547.anInt9707)) {
			@Pc(279) Class261 local279 = Static598.method6312(Static281.aClass176_74, Static15.anInt245, 0);
			Static234.aClass78_7 = arg0.method5018(local279, true);
			local279.method6319();
			Static502.aClass78_31 = arg0.method5018(local279, true);
			Static517.aClass78_33 = arg0.method5018(Static598.method6312(Static281.aClass176_74, Static111.anInt2627, 0), true);
			@Pc(304) Class261 local304 = Static598.method6312(Static281.aClass176_74, Static547.anInt9707, 0);
			Static368.aClass78_21 = arg0.method5018(local304, true);
			local304.method6319();
			Static442.aClass78_30 = arg0.method5018(local304, true);
		}
		@Pc(369) int local369;
		@Pc(334) int local334;
		if (Static517.aClass78_33 != null && Static234.aClass78_7 != null && Static368.aClass78_21 != null) {
			local195 = (local11 - Static368.aClass78_21.E() * 2) / Static517.aClass78_33.E();
			for (local334 = 0; local334 < local195; local334++) {
				Static517.aClass78_33.method8185(Static368.aClass78_21.E() + local7 + Static517.aClass78_33.E() * local334, local15 + local9 - Static517.aClass78_33.u());
			}
			local369 = (local15 - Static368.aClass78_21.u() - 20) / Static234.aClass78_7.u();
			for (@Pc(371) int local371 = 0; local371 < local369; local371++) {
				Static234.aClass78_7.method8185(local7, local371 * Static234.aClass78_7.u() + local9 + 20);
				Static502.aClass78_31.method8185(local7 + local11 - Static502.aClass78_31.E(), local9 + 20 + local371 * Static234.aClass78_7.u());
			}
			Static368.aClass78_21.method8185(local7, local15 + local9 - Static368.aClass78_21.u());
			Static442.aClass78_30.method8185(local11 + local7 - Static368.aClass78_21.E(), -Static368.aClass78_21.u() + (local9 - -local15));
		}
		local173 = 0;
		for (@Pc(444) Class4_Sub39 local444 = (Class4_Sub39) Static40.aClass244_4.method5963(); local444 != null; local444 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			local334 = (Static339.anInt6583 - local173 - 1) * 16 + local9 + 33;
			local369 = Static158.anInt3278 | 0xFF000000;
			if (local7 < local87 && local87 < local7 + local11 && local334 - 13 < local89 && local89 < local334 + 4 && local444.aBoolean605) {
				local369 = Static379.anInt7312 | 0xFF000000;
			}
			@Pc(506) int[] local506 = null;
			if (Static504.method7403(local444.anInt8541)) {
				local506 = Static521.aClass273_2.method6712((int) local444.aLong219).anIntArray364;
			} else if (local444.anInt8545 != -1) {
				local506 = Static521.aClass273_2.method6712(local444.anInt8545).anIntArray364;
			} else if (Static114.method7979(local444.anInt8541)) {
				@Pc(547) Class4_Sub4 local547 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local444.aLong219);
				if (local547 != null) {
					@Pc(552) Class1_Sub4_Sub2_Sub1_Sub1 local552 = local547.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					@Pc(555) Class283 local555 = local552.aClass283_1;
					if (local555.anIntArray453 != null) {
						local555 = local555.method6834(Static45.aClass148_1);
					}
					if (local555 != null) {
						local506 = local555.anIntArray451;
					}
				}
			} else if (Static52.method683(local444.anInt8541)) {
				@Pc(593) Class101 local593;
				if (local444.anInt8541 == 1011) {
					local593 = Static204.aClass139_8.method3309((int) local444.aLong219);
				} else {
					local593 = Static204.aClass139_8.method3309((int) (local444.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local593.anIntArray140 != null) {
					local593 = local593.method2710(Static45.aClass148_1);
				}
				if (local593 != null) {
					local506 = local593.anIntArray135;
				}
			}
			@Pc(618) String local618 = Static464.method7047(local444);
			if (local506 != null) {
				local618 = local618 + Static67.method1095(local506);
			}
			Static552.aClass58_14.method8174(Static12.anIntArray10, local7 + 3, local618, local369, local334, Static500.aClass78Array18);
			local173++;
			if (local444.aBoolean606) {
				Static32.aClass78_1.method8185(local7 + Static314.aClass114_11.method2950(local618) + 5, local334 + -12);
			}
		}
		Static506.method2842(Static543.anInt9642, Static17.anInt279, Static19.anInt285, Static179.anInt3618);
	}
}
