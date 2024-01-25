import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZIIZII)V")
	public static void method4762(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= arg5) {
			return;
		}
		@Pc(9) int local9 = (arg4 + arg5) / 2;
		@Pc(11) int local11 = arg4;
		@Pc(15) Class169_Sub1 local15 = Static545.aClass169_Sub1Array2[local9];
		Static545.aClass169_Sub1Array2[local9] = Static545.aClass169_Sub1Array2[arg5];
		Static545.aClass169_Sub1Array2[arg5] = local15;
		for (@Pc(27) int local27 = arg4; local27 < arg5; local27++) {
			if (Static162.method2327(local15, arg0, arg1, Static545.aClass169_Sub1Array2[local27], arg2, arg3) <= 0) {
				@Pc(46) Class169_Sub1 local46 = Static545.aClass169_Sub1Array2[local27];
				Static545.aClass169_Sub1Array2[local27] = Static545.aClass169_Sub1Array2[local11];
				Static545.aClass169_Sub1Array2[local11++] = local46;
			}
		}
		Static545.aClass169_Sub1Array2[arg5] = Static545.aClass169_Sub1Array2[local11];
		Static545.aClass169_Sub1Array2[local11] = local15;
		method4762(arg0, arg1, arg2, arg3, arg4, local11 - 1);
		method4762(arg0, arg1, arg2, arg3, local11 + 1, arg5);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static434.aBoolean515 = true;
		Static157.aBoolean165 = Static554.aClass144_12.method6926() > 0;
		Static39.aBoolean48 = true;
		Static307.anInt5453 = arg1 >> Static110.anInt1858;
		Static325.anInt5630 = arg3 >> Static110.anInt1858;
		Static543.anInt9224 = arg1;
		Static277.anInt5150 = arg3;
		Static171.anInt2640 = arg2;
		Static318.anInt5565 = Static307.anInt5453 - Static459.anInt10513;
		if (Static318.anInt5565 < 0) {
			Static408.anInt7042 = -Static318.anInt5565;
			Static318.anInt5565 = 0;
		} else {
			Static408.anInt7042 = 0;
		}
		Static81.anInt1405 = Static325.anInt5630 - Static459.anInt10513;
		if (Static81.anInt1405 < 0) {
			Static438.anInt7391 = -Static81.anInt1405;
			Static81.anInt1405 = 0;
		} else {
			Static438.anInt7391 = 0;
		}
		Static145.anInt2286 = Static307.anInt5453 + Static459.anInt10513;
		if (Static145.anInt2286 > Static654.anInt10715) {
			Static145.anInt2286 = Static654.anInt10715;
		}
		Static297.anInt5328 = Static325.anInt5630 + Static459.anInt10513;
		if (Static297.anInt5328 > Static180.anInt2928) {
			Static297.anInt5328 = Static180.anInt2928;
		}
		@Pc(79) boolean[][] local79 = Static18.aBooleanArrayArray1;
		@Pc(81) boolean[][] local81 = Static208.aBooleanArrayArray12;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static39.aBoolean48) {
			for (local85 = 0; local85 < Static459.anInt10513 + Static459.anInt10513 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static459.anInt10513 + Static459.anInt10513 + 2; local92++) {
					if (local92 > 1) {
						Static77.anIntArray72[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static307.anInt5453 + local85 - Static459.anInt10513;
					@Pc(118) int local118 = Static325.anInt5630 + local92 - Static459.anInt10513;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static654.anInt10715 && local118 < Static180.anInt2928) {
						local138 = local112 << Static110.anInt1858;
						@Pc(142) int local142 = local118 << Static110.anInt1858;
						@Pc(159) int local159 = Static445.aClass159Array3[Static445.aClass159Array3.length - 1].method8207(local118, local112) - (0x3E8 << Static110.anInt1858 - 7);
						@Pc(188) int local188 = (Static346.aClass159Array2 == null ? Static445.aClass159Array3[0].method8207(local118, local112) + Static391.anInt6813 : Static346.aClass159Array2[0].method8207(local118, local112) + Static391.anInt6813) + (0x3E8 << Static110.anInt1858 - 7);
						local90 = arg15 >= 0 ? Static554.aClass144_12.r(local138, local159, local142, local138, local188, local142, arg15) : Static554.aClass144_12.JA(local138, local159, local142, local138, local188, local142);
						Static208.aBooleanArrayArray12[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static208.aBooleanArrayArray12[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static77.anIntArray72[local92 - 1] & Static77.anIntArray72[local92] & local88 & local90;
						Static18.aBooleanArrayArray1[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static77.anIntArray72[Static459.anInt10513 + Static459.anInt10513] = local88;
				Static77.anIntArray72[Static459.anInt10513 + Static459.anInt10513 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static434.aBoolean515 = false;
			} else {
				Static54.anIntArray59 = arg5;
				Static265.anIntArray251 = arg6;
				Static614.anIntArray552 = arg7;
				Static53.anIntArray57 = arg8;
				Static645.anIntArray567 = arg9;
				Static549.method1239(arg10, Static554.aClass144_12);
			}
		} else {
			if (Static685.aBooleanArrayArray8 == null) {
				Static685.aBooleanArrayArray8 = new boolean[Static654.anInt10715 + Static654.anInt10715 + 1][Static180.anInt2928 + Static654.anInt10715 + 1];
			}
			for (local85 = 0; local85 < Static685.aBooleanArrayArray8.length; local85++) {
				for (local88 = 0; local88 < Static685.aBooleanArrayArray8[0].length; local88++) {
					Static685.aBooleanArrayArray8[local85][local88] = true;
				}
			}
			Static208.aBooleanArrayArray12 = Static685.aBooleanArrayArray8;
			Static18.aBooleanArrayArray1 = Static685.aBooleanArrayArray8;
			Static318.anInt5565 = 0;
			Static81.anInt1405 = 0;
			Static145.anInt2286 = Static654.anInt10715;
			Static297.anInt5328 = Static180.anInt2928;
			Static434.aBoolean515 = false;
		}
		Static24.method367(Static554.aClass144_12);
		if (!Static603.aClass307_3.aBoolean626) {
			@Pc(387) Class283 local387 = Static603.aClass307_3.aClass283_13;
			for (@Pc(392) Class4_Sub9 local392 = (Class4_Sub9) local387.method6791(); local392 != null; local392 = (Class4_Sub9) local387.method6792()) {
				local392.method9473();
				Static51.method942(local392);
			}
		}
		if (Static157.aBoolean165) {
			for (local85 = 0; local85 < Static306.anInt6132; local85++) {
				Static351.aClass275Array5[local85].method6619(arg0, arg14);
			}
		}
		if (Static326.aBoolean408) {
			Static391.anIntArray352 = Static554.aClass144_12.Y();
			Static554.aClass144_12.K(Static569.anIntArray492);
			local85 = (Static569.anIntArray492[2] - Static569.anIntArray492[0]) / Static496.anInt8374;
			for (local88 = 0; local88 < Static496.anInt8374 - 1; local88++) {
				Static634.anIntArray557[local88] = local85 * (local88 + 1) + Static510.anIntArray460[local88];
			}
			for (local90 = 0; local90 < Static156.aClass143Array1.length; local90++) {
				Static156.aClass143Array1[local90].method3051();
			}
		}
		if (Static389.aClass89ArrayArrayArray2 != null) {
			if (Static326.aBoolean408) {
				Static111.method1777(0);
			}
			Static303.method6870(true);
			Static554.aClass144_12.ra(-1, 1583160, 40, 127);
			Static210.method3208(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static326.aBoolean408) {
				Static508.method7617();
			}
			Static554.aClass144_12.pa();
			Static303.method6870(false);
		}
		Static210.method3208(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static326.aBoolean408) {
			for (local85 = 0; local85 < Static59.anInt987; local85++) {
				Static218.aBooleanArrayArrayArray1[local85] = Static684.aBooleanArrayArrayArray2[local85];
			}
			Static111.method1777(0);
			for (local88 = 0; local88 < Static156.aClass143Array1.length; local88++) {
				Static156.aClass143Array1[local88].method3051();
			}
		}
		if (Static326.aBoolean408) {
			Static508.method7617();
			for (local85 = 0; local85 < Static59.anInt987; local85++) {
				Static684.aBooleanArrayArrayArray2[local85] = Static218.aBooleanArrayArrayArray1[local85];
			}
			if (Static419.anInt10673 == 2) {
				@Pc(601) int local601;
				if (Static451.aLongArray16[0] < Static451.aLongArray16[1]) {
					if (Static634.anIntArray557[0] + Static510.anIntArray460[0] > Static569.anIntArray492[0]) {
						local601 = Static510.anIntArray460[0]++;
					}
				} else if (Static451.aLongArray16[0] > Static451.aLongArray16[1] && Static634.anIntArray557[0] + Static510.anIntArray460[0] < Static569.anIntArray492[2]) {
					local601 = Static510.anIntArray460[0]--;
				}
			}
		}
		if (!Static39.aBoolean48) {
			Static18.aBooleanArrayArray1 = local79;
			Static208.aBooleanArrayArray12 = local81;
		}
		Static552.method7979();
	}
}
