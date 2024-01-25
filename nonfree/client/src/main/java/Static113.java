import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2218;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public static int anInt2222 = -1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!vg;ZIILclient!r;)V")
	public static void method1785(@OriginalArg(0) Class341 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class134 arg3) {
		@Pc(10) Class204 local10 = arg0.method7563(arg3);
		if (local10 == null) {
			return;
		}
		arg3.da(arg1, arg2, arg0.anInt9300 + arg1, arg2 - -arg0.anInt9248);
		if (Static509.anInt5326 == 2 || Static509.anInt5326 == 5 || Static296.aClass22_28 == null) {
			arg3.FA(-16777216, local10, arg1, arg2);
			return;
		}
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(58) int local58;
		@Pc(50) int local50;
		if (Static340.anInt5707 == 4) {
			local48 = Static308.anInt5286;
			local50 = 4096;
			local52 = Static177.anInt3135;
			local58 = (int) -Static167.aFloat59 & 0x3FFF;
		} else {
			local50 = 4096 - Static348.anInt5786 * 16;
			local52 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
			local58 = (int) -Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
			local48 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
		}
		@Pc(94) int local94 = local52 / 128 + 48 + 208 - Static71.anInt1410 * 2;
		@Pc(112) int local112 = Static471.anInt8012 * 4 + 48 - (Static471.anInt8012 - 104) * 2 - local48 / 128;
		Static296.aClass22_28.method7659((float) arg1 + (float) arg0.anInt9300 / 2.0F, (float) arg0.anInt9248 / 2.0F + (float) arg2, (float) local94, (float) local112, local50, local58 << 2, local10, arg1, arg2);
		@Pc(163) int local163;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(193) int local193;
		for (@Pc(146) Class1_Sub13 local146 = (Class1_Sub13) Static523.aClass353_62.method7677(); local146 != null; local146 = (Class1_Sub13) Static523.aClass353_62.method7687()) {
			@Pc(151) int local151 = local146.anInt1812;
			local163 = (Static439.aClass13_3.anIntArray26[local151] >> 14 & 0x3FFF) - Static541.anInt9058;
			local172 = (Static439.aClass13_3.anIntArray26[local151] & 0x3FFF) - Static116.anInt2289;
			local183 = local163 * 4 + 2 - local52 / 128;
			local193 = local172 * 4 + 2 - local48 / 128;
			Static583.method7800(local183, arg2, arg3, arg1, arg0, local193, local10, Static439.aClass13_3.anIntArray25[local151]);
		}
		for (local163 = 0; local163 < Static460.anInt9459; local163++) {
			local172 = Static46.anIntArray89[local163] * 4 + 2 - local52 / 128;
			local183 = Static434.anIntArray587[local163] * 4 + 2 - local48 / 128;
			@Pc(250) Class95 local250 = Static518.aClass96_4.method1925(Static242.anIntArray348[local163]);
			if (local250.anIntArray208 != null) {
				local250 = local250.method1922(Static430.aClass321_1);
				if (local250 == null || local250.anInt2393 == -1) {
					continue;
				}
			}
			Static583.method7800(local172, arg2, arg3, arg1, arg0, local183, local10, local250.anInt2393);
		}
		@Pc(331) int local331;
		@Pc(341) int local341;
		for (@Pc(287) Class1_Sub28 local287 = (Class1_Sub28) Static19.aClass187_3.method3799(); local287 != null; local287 = (Class1_Sub28) Static19.aClass187_3.method3805()) {
			local183 = (int) (local287.aLong301 >> 28 & 0x3L);
			if (Static567.anInt9401 == local183) {
				local193 = (int) (local287.aLong301 & 0x3FFFL) - Static541.anInt9058;
				@Pc(320) int local320 = (int) (local287.aLong301 >> 14 & 0x3FFFL) - Static116.anInt2289;
				local331 = local193 * 4 + 2 - local52 / 128;
				local341 = local320 * 4 + 2 - local48 / 128;
				Static387.method5334(local10, local331, arg0, arg2, arg1, local341, Static308.aClass22Array16[0]);
			}
		}
		@Pc(426) int local426;
		for (local183 = 0; local183 < Static39.anInt609; local183++) {
			@Pc(372) Class1_Sub42 local372 = (Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local183]);
			if (local372 != null) {
				@Pc(377) Class8_Sub3_Sub3_Sub1_Sub2 local377 = local372.aClass8_Sub3_Sub3_Sub1_Sub2_2;
				if (local377.method5443() && local377.aByte123 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123) {
					@Pc(389) Class20 local389 = local377.aClass20_1;
					if (local389 != null && local389.anIntArray40 != null) {
						local389 = local389.method284(Static430.aClass321_1);
					}
					if (local389 != null && local389.aBoolean34 && local389.aBoolean36) {
						local341 = local377.anInt9365 / 128 - local52 / 128;
						local426 = local377.anInt9370 / 128 - local48 / 128;
						if (local389.anInt334 == -1) {
							Static387.method5334(local10, local341, arg0, arg2, arg1, local426, Static308.aClass22Array16[1]);
						} else {
							Static583.method7800(local341, arg2, arg3, arg1, arg0, local426, local10, local389.anInt334);
						}
					}
				}
			}
		}
		local193 = Static220.anInt4237;
		@Pc(463) int[] local463 = Static572.anIntArray717;
		@Pc(511) int local511;
		@Pc(515) int local515;
		@Pc(544) int local544;
		for (local331 = 0; local331 < local193; local331++) {
			@Pc(473) Class8_Sub3_Sub3_Sub1_Sub1 local473 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local463[local331]];
			if (local473 != null && local473.method1442() && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 != local473 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 == local473.aByte123) {
				local426 = local473.anInt9365 / 128 - local52 / 128;
				local511 = local473.anInt9370 / 128 - local48 / 128;
				@Pc(513) boolean local513 = false;
				for (local515 = 0; local515 < Static281.anInt4916; local515++) {
					if (local473.aString16.equals(Static308.aStringArray24[local515]) && Static448.anIntArray598[local515] != 0) {
						local513 = true;
						break;
					}
				}
				@Pc(542) boolean local542 = false;
				for (local544 = 0; local544 < Static482.anInt8105; local544++) {
					if (local473.aString16.equals(Static301.aClass218Array1[local544].aString47)) {
						local542 = true;
						break;
					}
				}
				@Pc(564) boolean local564 = false;
				if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1735 != 0 && local473.anInt1735 != 0 && local473.anInt1735 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1735) {
					local564 = true;
				}
				if (local473.aBoolean137) {
					Static387.method5334(local10, local426, arg0, arg2, arg1, local511, Static308.aClass22Array16[6]);
				} else if (local513) {
					Static387.method5334(local10, local426, arg0, arg2, arg1, local511, Static308.aClass22Array16[3]);
				} else if (local542) {
					Static387.method5334(local10, local426, arg0, arg2, arg1, local511, Static308.aClass22Array16[5]);
				} else if (local564) {
					Static387.method5334(local10, local426, arg0, arg2, arg1, local511, Static308.aClass22Array16[4]);
				} else {
					Static387.method5334(local10, local426, arg0, arg2, arg1, local511, Static308.aClass22Array16[2]);
				}
			}
		}
		@Pc(659) Class154[] local659 = Static41.aClass154Array1;
		@Pc(743) int local743;
		for (local426 = 0; local426 < local659.length; local426++) {
			@Pc(667) Class154 local667 = local659[local426];
			if (local667 != null && local667.anInt4116 != 0 && Static301.anInt5197 % 20 < 10) {
				@Pc(708) int local708;
				if (local667.anInt4116 == 1) {
					@Pc(693) Class1_Sub42 local693 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local667.anInt4115);
					if (local693 != null) {
						@Pc(698) Class8_Sub3_Sub3_Sub1_Sub2 local698 = local693.aClass8_Sub3_Sub3_Sub1_Sub2_2;
						local708 = local698.anInt9365 / 128 - local52 / 128;
						local544 = local698.anInt9370 / 128 - local48 / 128;
						Static272.method3863(arg0, arg2, 360000L, local10, local544, local708, local667.anInt4117, arg1);
					}
				}
				if (local667.anInt4116 == 2) {
					local743 = local667.anInt4120 / 128 - local52 / 128;
					local515 = local667.anInt4114 / 128 - local48 / 128;
					@Pc(758) long local758 = (long) (local667.anInt4107 << 7);
					@Pc(762) long local762 = local758 * local758;
					Static272.method3863(arg0, arg2, local762, local10, local515, local743, local667.anInt4117, arg1);
				}
				if (local667.anInt4116 == 10 && local667.anInt4115 >= 0 && local667.anInt4115 < Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1.length) {
					@Pc(796) Class8_Sub3_Sub3_Sub1_Sub1 local796 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local667.anInt4115];
					if (local796 != null) {
						local515 = local796.anInt9365 / 128 - local52 / 128;
						local708 = local796.anInt9370 / 128 - local48 / 128;
						Static272.method3863(arg0, arg2, 360000L, local10, local708, local515, local667.anInt4117, arg1);
					}
				}
			}
		}
		if (Static340.anInt5707 == 4) {
			return;
		}
		if (Static228.anInt4297 != 0) {
			local511 = Static228.anInt4297 * 4 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() * 2 + 2 - local52 / 128 - 2;
			local743 = Static66.anInt1351 * 4 + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() - 1) * 2 + 2 - local48 / 128;
			Static387.method5334(local10, local511, arg0, arg2, arg1, local743, Static229.aClass22Array13[Static309.aBoolean425 ? 1 : 0]);
		}
		arg3.method6929(3, arg2 + arg0.anInt9248 / 2 - 1, arg0.anInt9300 / 2 + -1 + arg1, -1, 3);
		return;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg5 > arg3 && arg3 + arg6 > arg5) {
			return arg4 < arg1 + arg7 && arg4 + arg2 > arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static17.method163(arg1, arg0)) {
			return Static494.method6891(arg1, arg0) | (arg1 & 0x9000) != 0 | Static344.method4702(arg1, arg0) ? true : (Static50.method830(arg0, arg1) | (arg1 & 0x2000) != 0 | Static351.method4775(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1788() {
		if (Static181.anInt3169 == 6) {
			Static181.anInt3169 = 7;
		}
	}
}
