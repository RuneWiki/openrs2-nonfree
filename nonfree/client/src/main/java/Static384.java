import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	public static int anInt6569;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt6573;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ha;ILclient!cn;)V")
	public static void method5622(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class73 arg3) {
		@Pc(10) Class1 local10 = arg3.method1287(arg1);
		if (local10 == null) {
			return;
		}
		arg1.KA(arg2, arg0, arg3.anInt1384 + arg2, arg3.anInt1394 + arg0);
		if (Static170.anInt2914 == 2 || Static170.anInt2914 == 5 || Static161.aClass134_21 == null) {
			arg1.A(-16777216, local10, arg2, arg0);
			return;
		}
		@Pc(71) int local71;
		@Pc(74) int local74;
		@Pc(68) int local68;
		@Pc(81) int local81;
		if (Static79.anInt1216 == 4) {
			local81 = 4096;
			local71 = Static497.anInt10511;
			local68 = (int) -Static429.aFloat132 & 0x3FFF;
			local74 = Static291.anInt5066;
		} else {
			local68 = Static609.anInt10107 + (int) -Static429.aFloat132 & 0x3FFF;
			local71 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
			local74 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
			local81 = 4096 - Static438.anInt7509 * 16;
		}
		@Pc(108) int local108 = local71 / 128 + 48 - (Static544.anInt9261 - 104) * 2;
		@Pc(126) int local126 = Static282.anInt4887 * 4 + 208 + 48 - Static282.anInt4887 * 2 - local74 / 128;
		Static161.aClass134_21.method9237((float) arg3.anInt1384 / 2.0F + (float) arg2, (float) arg0 + (float) arg3.anInt1394 / 2.0F, (float) local108, (float) local126, local81, local68 << 2, local10, arg2, arg0);
		@Pc(179) int local179;
		@Pc(189) int local189;
		@Pc(199) int local199;
		@Pc(210) int local210;
		for (@Pc(160) Class5_Sub29 local160 = (Class5_Sub29) Static551.aClass102_66.method1916(); local160 != null; local160 = (Class5_Sub29) Static551.aClass102_66.method1915()) {
			@Pc(167) int local167 = local160.anInt5492;
			local179 = (Static557.aClass197_1.anIntArray292[local167] >> 14 & 0x3FFF) - Static622.anInt10188;
			local189 = (Static557.aClass197_1.anIntArray292[local167] & 0x3FFF) - Static668.anInt10683;
			local199 = local179 * 4 + 2 - local71 / 128;
			local210 = local189 * 4 + 2 - local74 / 128;
			Static103.method1469(local199, arg1, arg2, local210, arg3, arg0, Static557.aClass197_1.anIntArray291[local167], local10);
		}
		for (local179 = 0; local179 < Static301.anInt9106; local179++) {
			local189 = Static532.anIntArray520[local179] * 4 + 2 - local71 / 128;
			local199 = Static360.anIntArray345[local179] * 4 + 2 - local74 / 128;
			@Pc(270) Class55 local270 = Static536.aClass392_2.method9293(0, Static411.anIntArray424[local179]);
			if (local270.anIntArray46 != null) {
				local270 = local270.method847(Static413.aClass118_1);
				if (local270 == null || local270.anInt938 == -1) {
					continue;
				}
			}
			Static103.method1469(local189, arg1, arg2, local199, arg3, arg0, local270.anInt938, local10);
		}
		@Pc(359) int local359;
		@Pc(370) int local370;
		for (@Pc(316) Class5_Sub25 local316 = (Class5_Sub25) Static466.aClass291_33.method6987(); local316 != null; local316 = (Class5_Sub25) Static466.aClass291_33.method6989()) {
			local199 = (int) (local316.aLong314 >> 28 & 0x3L);
			if (Static94.anInt1545 == local199) {
				local210 = (int) (local316.aLong314 & 0x3FFFL) - Static622.anInt10188;
				@Pc(349) int local349 = (int) (local316.aLong314 >> 14 & 0x3FFFL) - Static668.anInt10683;
				local359 = local210 * 4 + 2 - local71 / 128;
				local370 = local349 * 4 + 2 - local74 / 128;
				Static27.method453(arg0, arg3, Static530.aClass134Array14[0], arg2, local10, local370, local359);
			}
		}
		@Pc(469) int local469;
		for (local199 = 0; local199 < Static247.anInt4256; local199++) {
			@Pc(403) Class5_Sub35 local403 = (Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local199], 1);
			if (local403 != null) {
				@Pc(408) Class8_Sub1_Sub3_Sub2_Sub2 local408 = local403.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				if (local408.method6010((byte) -102) && local408.aByte145 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145) {
					@Pc(426) Class227 local426 = local408.aClass227_1;
					if (local426 != null && local426.anIntArray341 != null) {
						local426 = local426.method5322(Static413.aClass118_1);
					}
					if (local426 != null && local426.aBoolean466 && local426.aBoolean462) {
						local370 = local408.anInt10355 / 128 - local71 / 128;
						local469 = local408.anInt10363 / 128 - local74 / 128;
						if (local426.anInt6240 == -1) {
							Static27.method453(arg0, arg3, Static530.aClass134Array14[1], arg2, local10, local469, local370);
						} else {
							Static103.method1469(local370, arg1, arg2, local469, arg3, arg0, local426.anInt6240, local10);
						}
					}
				}
			}
		}
		local210 = Static116.anInt3318;
		@Pc(509) int[] local509 = Static88.anIntArray464;
		@Pc(568) int local568;
		@Pc(572) int local572;
		@Pc(605) int local605;
		for (local359 = 0; local359 < local210; local359++) {
			@Pc(519) Class8_Sub1_Sub3_Sub2_Sub1 local519 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local509[local359]];
			if (local519 != null && local519.method3600() && !local519.aBoolean327 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 != local519 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 == local519.aByte145) {
				local469 = local519.anInt10355 / 128 - local71 / 128;
				local568 = local519.anInt10363 / 128 - local74 / 128;
				@Pc(570) boolean local570 = false;
				for (local572 = 0; local572 < Static463.anInt7895; local572++) {
					if (local519.aString62.equals(Static444.aStringArray54[local572]) && Static279.anIntArray271[local572] != 0) {
						local570 = true;
						break;
					}
				}
				@Pc(603) boolean local603 = false;
				for (local605 = 0; local605 < Static7.anInt86; local605++) {
					if (local519.aString62.equals(Static191.aClass349Array1[local605].aString127)) {
						local603 = true;
						break;
					}
				}
				@Pc(631) boolean local631 = false;
				if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4223 != 0 && local519.anInt4223 != 0 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4223 == local519.anInt4223) {
					local631 = true;
				}
				if (local519.aBoolean328) {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[6], arg2, local10, local568, local469);
				} else if (local631) {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[4], arg2, local10, local568, local469);
				} else if (local519.aBoolean325) {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[7], arg2, local10, local568, local469);
				} else if (local570) {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[3], arg2, local10, local568, local469);
				} else if (local603) {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[5], arg2, local10, local568, local469);
				} else {
					Static27.method453(arg0, arg3, Static530.aClass134Array14[2], arg2, local10, local568, local469);
				}
			}
		}
		@Pc(774) Class28[] local774 = Static598.aClass28Array1;
		@Pc(866) int local866;
		for (local469 = 0; local469 < local774.length; local469++) {
			@Pc(782) Class28 local782 = local774[local469];
			if (local782 != null && local782.anInt500 != 0 && Static44.anInt740 % 20 < 10) {
				@Pc(829) int local829;
				if (local782.anInt500 == 1) {
					@Pc(814) Class5_Sub35 local814 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local782.anInt502, 1);
					if (local814 != null) {
						@Pc(819) Class8_Sub1_Sub3_Sub2_Sub2 local819 = local814.aClass8_Sub1_Sub3_Sub2_Sub2_2;
						local829 = local819.anInt10355 / 128 - local71 / 128;
						local605 = local819.anInt10363 / 128 - local74 / 128;
						Static110.method1592(360000L, local782.anInt505, arg0, local829, local605, arg2, local10, arg3);
					}
				}
				if (local782.anInt500 == 2) {
					local866 = local782.anInt503 / 128 - local71 / 128;
					local572 = local782.anInt498 / 128 - local74 / 128;
					@Pc(881) long local881 = (long) (local782.anInt504 << 7);
					@Pc(885) long local885 = local881 * local881;
					Static110.method1592(local885, local782.anInt505, arg0, local866, local572, arg2, local10, arg3);
				}
				if (local782.anInt500 == 10 && local782.anInt502 >= 0 && local782.anInt502 < Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1.length) {
					@Pc(921) Class8_Sub1_Sub3_Sub2_Sub1 local921 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local782.anInt502];
					if (local921 != null) {
						local572 = local921.anInt10355 / 128 - local71 / 128;
						local829 = local921.anInt10363 / 128 - local74 / 128;
						Static110.method1592(360000L, local782.anInt505, arg0, local572, local829, arg2, local10, arg3);
					}
				}
			}
		}
		if (Static79.anInt1216 == 4) {
			return;
		}
		if (Static86.anInt1451 != 0) {
			local568 = Static86.anInt1451 * 4 + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() + -1) * 2 + 2 - local71 / 128;
			local866 = Static669.anInt10711 * 4 + Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() * 2 + 2 - local74 / 128 - 2;
			Static27.method453(arg0, arg3, Static341.aClass134Array8[Static437.aBoolean584 ? 1 : 0], arg2, local10, local866, local568);
		}
		if (!Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aBoolean327) {
			arg1.method7731(-1, arg2 + arg3.anInt1384 / 2 - 1, 3, 3, arg0 + arg3.anInt1394 / 2 - 1);
			return;
		}
	}
}
