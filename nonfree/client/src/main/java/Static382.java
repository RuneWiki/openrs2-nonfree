import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
	public static int anInt7435;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "F")
	public static float aFloat171;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "Z")
	public static final boolean aBoolean539 = false;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method6145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static350.aBoolean469 = true;
		Static172.aBoolean300 = Static269.aClass16_11.method6074() > 0;
		Static545.aBoolean663 = true;
		Static603.anInt10257 = arg1 >> Static172.anInt4156;
		Static470.anInt8495 = arg3 >> Static172.anInt4156;
		Static143.anInt3624 = arg1;
		Static11.anInt160 = arg3;
		Static564.anInt9725 = arg2;
		Static444.anInt8261 = Static603.anInt10257 - Static183.anInt4307;
		if (Static444.anInt8261 < 0) {
			Static283.anInt5875 = -Static444.anInt8261;
			Static444.anInt8261 = 0;
		} else {
			Static283.anInt5875 = 0;
		}
		Static614.anInt6685 = Static470.anInt8495 - Static183.anInt4307;
		if (Static614.anInt6685 < 0) {
			Static221.anInt5059 = -Static614.anInt6685;
			Static614.anInt6685 = 0;
		} else {
			Static221.anInt5059 = 0;
		}
		Static239.anInt5361 = Static603.anInt10257 + Static183.anInt4307;
		if (Static239.anInt5361 > Static489.anInt8688) {
			Static239.anInt5361 = Static489.anInt8688;
		}
		Static345.anInt6694 = Static470.anInt8495 + Static183.anInt4307;
		if (Static345.anInt6694 > Static596.anInt10195) {
			Static345.anInt6694 = Static596.anInt10195;
		}
		@Pc(72) boolean[][] local72 = Static100.aBooleanArrayArray3;
		@Pc(74) boolean[][] local74 = Static565.aBooleanArrayArray8;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static545.aBoolean663) {
			for (local78 = 0; local78 < Static183.anInt4307 + Static183.anInt4307 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static183.anInt4307 + Static183.anInt4307 + 2; local85++) {
					if (local85 > 1) {
						Static152.anIntArray197[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static603.anInt10257 + local78 - Static183.anInt4307;
					@Pc(109) int local109 = Static470.anInt8495 + local85 - Static183.anInt4307;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static489.anInt8688 && local109 < Static596.anInt10195) {
						local123 = local103 << Static172.anInt4156;
						@Pc(127) int local127 = local109 << Static172.anInt4156;
						@Pc(144) int local144 = Static86.aClass86Array2[Static86.aClass86Array2.length - 1].method8086(local109, local103) - (0x3E8 << Static172.anInt4156 - 7);
						@Pc(166) int local166 = Static253.aClass86Array4 == null ? Static86.aClass86Array2[0].method8086(local109, local103) + Static572.anInt9827 : Static253.aClass86Array4[0].method8086(local109, local103) + Static572.anInt9827;
						local83 = arg15 >= 0 ? Static269.aClass16_11.r(local123, local144, local127, local123, local166, local127, arg15) : Static269.aClass16_11.JA(local123, local144, local127, local123, local166, local127);
						Static565.aBooleanArrayArray8[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static565.aBooleanArrayArray8[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static152.anIntArray197[local85 - 1] & Static152.anIntArray197[local85] & local81 & local83;
						Static100.aBooleanArrayArray3[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static152.anIntArray197[Static183.anInt4307 + Static183.anInt4307] = local81;
				Static152.anIntArray197[Static183.anInt4307 + Static183.anInt4307 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static350.aBoolean469 = false;
			} else {
				Static336.anIntArray371 = arg5;
				Static595.anIntArray595 = arg6;
				Static573.anIntArray544 = arg7;
				Static265.anIntArray331 = arg8;
				Static260.anIntArray324 = arg9;
				Static182.method3473(arg10, Static269.aClass16_11);
			}
		} else {
			if (Static74.aBooleanArrayArray2 == null) {
				Static74.aBooleanArrayArray2 = new boolean[Static489.anInt8688 + Static489.anInt8688 + 1][Static596.anInt10195 + Static489.anInt8688 + 1];
			}
			for (local78 = 0; local78 < Static74.aBooleanArrayArray2.length; local78++) {
				for (local81 = 0; local81 < Static74.aBooleanArrayArray2[0].length; local81++) {
					Static74.aBooleanArrayArray2[local78][local81] = true;
				}
			}
			Static565.aBooleanArrayArray8 = Static74.aBooleanArrayArray2;
			Static100.aBooleanArrayArray3 = Static74.aBooleanArrayArray2;
			Static444.anInt8261 = 0;
			Static614.anInt6685 = 0;
			Static239.anInt5361 = Static489.anInt8688;
			Static345.anInt6694 = Static596.anInt10195;
			Static350.aBoolean469 = false;
		}
		Static365.method5687(Static269.aClass16_11);
		if (!Static40.aClass194_2.aBoolean443) {
			@Pc(349) Class123 local349 = Static40.aClass194_2.aClass123_8;
			for (@Pc(354) Class15_Sub7 local354 = (Class15_Sub7) local349.method3537(); local354 != null; local354 = (Class15_Sub7) local349.method3541()) {
				local354.method8314();
				Static513.method7386(local354);
			}
		}
		if (Static172.aBoolean300) {
			for (local78 = 0; local78 < Static171.anInt4135; local78++) {
				Static626.aClass204Array1[local78].method5432(arg0, arg14);
			}
		}
		if (Static403.aBoolean556) {
			Static287.anIntArray344 = Static269.aClass16_11.Y();
			Static269.aClass16_11.K(Static636.anIntArray623);
			local78 = (Static636.anIntArray623[2] - Static636.anIntArray623[0]) / Static587.anInt10308;
			for (local81 = 0; local81 < Static587.anInt10308 - 1; local81++) {
				Static630.anIntArray621[local81] = local78 * (local81 + 1) + Static546.anIntArray513[local81];
			}
			for (local83 = 0; local83 < Static394.aClass124Array1.length; local83++) {
				Static394.aClass124Array1[local83].method3581();
			}
		}
		if (Static591.aClass56ArrayArrayArray3 != null) {
			if (Static403.aBoolean556) {
				Static360.method5665(0);
			}
			Static287.method4821(true);
			Static269.aClass16_11.ra(-1, 1583160, 40, 127);
			Static192.method3626(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static403.aBoolean556) {
				Static359.method5650();
			}
			Static269.aClass16_11.pa();
			Static287.method4821(false);
		}
		Static192.method3626(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static403.aBoolean556) {
			for (local78 = 0; local78 < Static192.anInt4507; local78++) {
				Static121.aBooleanArrayArrayArray1[local78] = Static320.aBooleanArrayArrayArray2[local78];
			}
			Static360.method5665(0);
			for (local81 = 0; local81 < Static394.aClass124Array1.length; local81++) {
				Static394.aClass124Array1[local81].method3581();
			}
		}
		if (Static403.aBoolean556) {
			Static359.method5650();
			for (local78 = 0; local78 < Static192.anInt4507; local78++) {
				Static320.aBooleanArrayArrayArray2[local78] = Static121.aBooleanArrayArrayArray1[local78];
			}
			if (Static151.anInt3713 == 2) {
				@Pc(543) int local543;
				if (Static183.aLongArray4[0] < Static183.aLongArray4[1]) {
					if (Static630.anIntArray621[0] + Static546.anIntArray513[0] > Static636.anIntArray623[0]) {
						local543 = Static546.anIntArray513[0]++;
					}
				} else if (Static183.aLongArray4[0] > Static183.aLongArray4[1] && Static630.anIntArray621[0] + Static546.anIntArray513[0] < Static636.anIntArray623[2]) {
					local543 = Static546.anIntArray513[0]--;
				}
			}
		}
		if (!Static545.aBoolean663) {
			Static100.aBooleanArrayArray3 = local72;
			Static565.aBooleanArrayArray8 = local74;
		}
		Static7.method5202();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z")
	public static boolean method6146() {
		return Static435.anInt8191 >= 1;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
	public static void method6149() {
		if (Static88.aClass296_2 != null) {
			Static609.aClass42_3 = new Class42();
			Static609.aClass42_3.method1405(Static88.aClass296_2, Static88.aClass296_2.anInt8689, Static452.aLong214, Static88.aClass296_2.aClass84_63.method2710(Static372.anInt7083));
			Static156.aThread1 = new Thread(Static609.aClass42_3, "");
			Static156.aThread1.start();
		}
	}
}
