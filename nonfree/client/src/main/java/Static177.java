import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!jc;")
	public static Class40 aClass40_39;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
	public static int[] anIntArray362 = new int[128];

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2334 = Static107.method1838("Unable to find ");

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2332 = aClass28_2334;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2333 = Static107.method1838("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
	public static int[] anIntArray363 = new int[200];

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public static int anInt3920 = -1;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public static int anInt3922 = 0;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!ff;")
	public static Class24 aClass24_13 = null;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!ff;")
	public static Class24 aClass24_14 = null;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method2754() {
		aClass40_39 = null;
		anIntArray362 = null;
		aClass28_2332 = null;
		aClass24_13 = null;
		anIntArray363 = null;
		aClass28_2333 = null;
		aClass28_2334 = null;
		aClass24_14 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method2755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass19_1 = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	public static void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub14 local28 = Static133.aClass2_Sub14ArrayArrayArray1[local9][arg0][arg1] = Static133.aClass2_Sub14ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt2266--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt2269; local38++) {
					@Pc(44) Class43 local44 = local28.aClass43Array56[local38];
					if ((local44.aLong83 >> 29 & 0x3L) == 2L && local44.anInt2326 == arg0 && local44.anInt2322 == arg1) {
						local44.anInt2316--;
					}
				}
			}
		}
		if (Static133.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1] == null) {
			Static133.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub14(0, arg0, arg1);
		}
		Static133.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1].aClass2_Sub14_1 = local7;
		Static133.aClass2_Sub14ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method2757() {
		if (Static120.aClass21_1 != null) {
			Static120.aClass21_1.method1341();
		}
		if (Static165.aClass21_2 != null) {
			Static165.aClass21_2.method1341();
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)J")
	public static synchronized long method2758() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static135.aLong115 > local5) {
			Static133.aLong114 += Static135.aLong115 - local5;
		}
		Static135.aLong115 = local5;
		return Static133.aLong114 + local5;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
	public static void method2759() {
		@Pc(6) int local6 = Static170.anInt4068 + Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633;
		if (Static9.aBooleanArray6[96]) {
			Static123.anInt2913 += (-Static123.anInt2913 - 24) / 2;
		} else if (Static9.aBooleanArray6[97]) {
			Static123.anInt2913 += (24 - Static123.anInt2913) / 2;
		} else {
			Static123.anInt2913 /= 2;
		}
		Static66.anInt1789 = Static66.anInt1789 + Static123.anInt2913 / 2 & 0x7FF;
		if (Static9.aBooleanArray6[98]) {
			Static93.anInt2352 += (12 - Static93.anInt2352) / 2;
		} else if (Static9.aBooleanArray6[99]) {
			Static93.anInt2352 += (-Static93.anInt2352 - 12) / 2;
		} else {
			Static93.anInt2352 /= 2;
		}
		@Pc(90) int local90 = Static157.anInt3496 + Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635;
		Static83.anInt2112 += Static93.anInt2352 / 2;
		if (Static135.anInt3105 - local6 < -500 || Static135.anInt3105 - local6 > 500 || Static179.anInt4040 - local90 < -500 || Static179.anInt4040 - local90 > 500) {
			Static179.anInt4040 = local90;
			Static135.anInt3105 = local6;
		}
		if (Static135.anInt3105 != local6) {
			Static135.anInt3105 += (local6 - Static135.anInt3105) / 16;
		}
		@Pc(153) int local153 = Static135.anInt3105 >> 7;
		if (Static83.anInt2112 < 128) {
			Static83.anInt2112 = 128;
		}
		if (Static83.anInt2112 > 383) {
			Static83.anInt2112 = 383;
		}
		if (local90 != Static179.anInt4040) {
			Static179.anInt4040 += (local90 - Static179.anInt4040) / 16;
		}
		@Pc(183) int local183 = Static179.anInt4040 >> 7;
		@Pc(189) int local189 = Static103.method1808(Static103.anInt2568, Static135.anInt3105, Static179.anInt4040);
		@Pc(191) int local191 = 0;
		@Pc(213) int local213;
		if (local153 > 3 && local183 > 3 && local153 < 100 && local183 < 100) {
			for (local213 = local153 - 4; local213 <= local153 + 4; local213++) {
				for (@Pc(219) int local219 = local183 - 4; local219 <= local183 + 4; local219++) {
					@Pc(223) int local223 = Static103.anInt2568;
					if (local223 < 3 && (Static49.aByteArrayArrayArray4[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(251) int local251 = local189 - Static78.anIntArrayArrayArray6[local223][local213][local219];
					if (local251 > local191) {
						local191 = local251;
					}
				}
			}
		}
		local213 = local191 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (Static175.anInt3891 < local213) {
			Static175.anInt3891 += (local213 - Static175.anInt3891) / 24;
		} else if (local213 < Static175.anInt3891) {
			Static175.anInt3891 += (local213 - Static175.anInt3891) / 80;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!eh;I)V")
	public static void method2760(@OriginalArg(0) Class2_Sub4_Sub1_Sub1 arg0) {
		arg0.anInt1606 = arg0.anInt1608;
		if (arg0.anInt1643 == 0) {
			arg0.anInt1638 = 0;
			return;
		}
		if (arg0.anInt1653 != -1 && arg0.anInt1641 == 0) {
			@Pc(32) Class2_Sub4_Sub2 local32 = Static49.method926(arg0.anInt1653);
			if (arg0.anInt1644 > 0 && local32.anInt474 == 0) {
				arg0.anInt1638++;
				return;
			}
			if (arg0.anInt1644 <= 0 && local32.anInt480 == 0) {
				arg0.anInt1638++;
				return;
			}
		}
		@Pc(70) int local70 = arg0.anInt1633;
		@Pc(85) int local85 = arg0.anInt1618 * 64 + arg0.anIntArray139[arg0.anInt1643 - 1] * 128;
		@Pc(100) int local100 = arg0.anInt1618 * 64 + arg0.anIntArray142[arg0.anInt1643 - 1] * 128;
		@Pc(103) int local103 = arg0.anInt1635;
		if (local85 - local70 > 256 || local85 - local70 < -256 || local100 - local103 > 256 || local100 - local103 < -256) {
			arg0.anInt1635 = local100;
			arg0.anInt1633 = local85;
			return;
		}
		if (local70 >= local85) {
			if (local85 >= local70) {
				if (local100 > local103) {
					arg0.anInt1623 = 1024;
				} else if (local100 < local103) {
					arg0.anInt1623 = 0;
				}
			} else if (local103 < local100) {
				arg0.anInt1623 = 768;
			} else if (local103 > local100) {
				arg0.anInt1623 = 256;
			} else {
				arg0.anInt1623 = 512;
			}
		} else if (local100 > local103) {
			arg0.anInt1623 = 1280;
		} else if (local100 >= local103) {
			arg0.anInt1623 = 1536;
		} else {
			arg0.anInt1623 = 1792;
		}
		@Pc(226) int local226 = arg0.anInt1639;
		@Pc(235) int local235 = arg0.anInt1623 - arg0.anInt1603 & 0x7FF;
		if (local235 > 1024) {
			local235 -= 2048;
		}
		@Pc(241) int local241 = 4;
		if (local235 >= -256 && local235 <= 256) {
			local226 = arg0.anInt1610;
		} else if (local235 >= 256 && local235 < 768) {
			local226 = arg0.anInt1619;
		} else if (local235 >= -768 && local235 <= -256) {
			local226 = arg0.anInt1646;
		}
		if (local226 == -1) {
			local226 = arg0.anInt1610;
		}
		arg0.anInt1606 = local226;
		@Pc(287) boolean local287 = true;
		if (arg0 instanceof Class2_Sub4_Sub1_Sub1_Sub1) {
			local287 = ((Class2_Sub4_Sub1_Sub1_Sub1) arg0).aClass2_Sub4_Sub4_1.aBoolean30;
		}
		if (local287) {
			if (arg0.anInt1623 != arg0.anInt1603 && arg0.anInt1625 == -1 && arg0.anInt1612 != 0) {
				local241 = 2;
			}
			if (arg0.anInt1643 > 2) {
				local241 = 6;
			}
			if (arg0.anInt1643 > 3) {
				local241 = 8;
			}
			if (arg0.anInt1638 > 0 && arg0.anInt1643 > 1) {
				local241 = 8;
				arg0.anInt1638--;
			}
		} else {
			if (arg0.anInt1643 > 1) {
				local241 = 6;
			}
			if (arg0.anInt1643 > 2) {
				local241 = 8;
			}
			if (arg0.anInt1638 > 0 && arg0.anInt1643 > 1) {
				arg0.anInt1638--;
				local241 = 8;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt1643 - 1]) {
			local241 <<= 0x1;
		}
		if (local241 >= 8 && arg0.anInt1610 == arg0.anInt1606 && arg0.anInt1648 != -1) {
			arg0.anInt1606 = arg0.anInt1648;
		}
		if (local100 > local103) {
			arg0.anInt1635 += local241;
			if (arg0.anInt1635 > local100) {
				arg0.anInt1635 = local100;
			}
		} else if (local100 < local103) {
			arg0.anInt1635 -= local241;
			if (arg0.anInt1635 < local100) {
				arg0.anInt1635 = local100;
			}
		}
		if (local85 > local70) {
			arg0.anInt1633 += local241;
			if (arg0.anInt1633 > local85) {
				arg0.anInt1633 = local85;
			}
		} else if (local85 < local70) {
			arg0.anInt1633 -= local241;
			if (local85 > arg0.anInt1633) {
				arg0.anInt1633 = local85;
			}
		}
		if (local85 != arg0.anInt1633 || arg0.anInt1635 != local100) {
			return;
		}
		arg0.anInt1643--;
		if (arg0.anInt1644 > 0) {
			arg0.anInt1644--;
			return;
		}
	}
}
