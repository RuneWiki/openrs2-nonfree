import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "Lclient!bf;")
	public static Class6_Sub4 aClass6_Sub4_2;

	@OriginalMember(owner = "client!ib", name = "Eb", descriptor = "I")
	public static int anInt1568;

	@OriginalMember(owner = "client!ib", name = "Sb", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!ib", name = "qb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_15 = new Class49(100);

	@OriginalMember(owner = "client!ib", name = "Qb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_838 = Static80.method1463("Error loading your profile)3");

	@OriginalMember(owner = "client!ib", name = "wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_831 = aClass63_838;

	@OriginalMember(owner = "client!ib", name = "Ib", descriptor = "Lclient!rd;")
	private static Class63 aClass63_835 = Static80.method1463("Unexpected server response");

	@OriginalMember(owner = "client!ib", name = "xb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_832 = aClass63_835;

	@OriginalMember(owner = "client!ib", name = "Ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_833 = Static80.method1463(":  ");

	@OriginalMember(owner = "client!ib", name = "Mb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_837 = Static80.method1463("Click to continue");

	@OriginalMember(owner = "client!ib", name = "Cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_834 = aClass63_837;

	@OriginalMember(owner = "client!ib", name = "Kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_836 = Static80.method1463("(Z");

	@OriginalMember(owner = "client!ib", name = "Lb", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!ib", name = "Rb", descriptor = "I")
	public static int anInt1576 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ib", name = "Vb", descriptor = "I")
	public static int anInt1579 = 0;

	@OriginalMember(owner = "client!ib", name = "Wb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_16 = new Class49(128);

	@OriginalMember(owner = "client!ib", name = "Xb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_839 = Static80.method1463("Untersuchen");

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
	public static void method1063() {
		aClass63_839 = null;
		aClass7_Sub1_7 = null;
		aClass63_832 = null;
		aClass6_Sub4_2 = null;
		aClass49_16 = null;
		aClass63_834 = null;
		aClass63_838 = null;
		aClass63_835 = null;
		aClass63_831 = null;
		aClass63_836 = null;
		aClass63_837 = null;
		aClass63_833 = null;
		aClass49_15 = null;
	}

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)V")
	public static void method1064() {
		if (Static18.anInt569 < 2 && Static29.anInt939 == 0 && !Static42.aBoolean63) {
			return;
		}
		@Pc(49) Class63 local49;
		if (Static29.anInt939 == 1 && Static18.anInt569 < 2) {
			local49 = Static15.method374(new Class63[] { Static18.aClass63_385, Static33.aClass63_608, Static1.aClass63_8, Static84.aClass63_1264 });
		} else if (Static42.aBoolean63 && Static18.anInt569 < 2) {
			local49 = Static15.method374(new Class63[] { Static33.aClass63_613, Static33.aClass63_608, Static50.aClass63_807, Static84.aClass63_1264 });
		} else {
			local49 = Static31.aClass63Array7[Static18.anInt569 - 1];
		}
		if (Static18.anInt569 > 2) {
			local49 = Static15.method374(new Class63[] { local49, Static47.aClass63_782, Static118.method2114(Static18.anInt569 - 2), Static20.aClass63_413 });
		}
		Static114.aClass6_Sub3_Sub3_Sub1_4.method441(local49, 4, 16777215, Static73.anInt2064 / 1000);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)Z")
	public static boolean method1065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && Static81.anInt2220 == arg0) {
			return true;
		} else if (arg1 == 1 && Static103.anInt3207 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static30.anInt958 == arg0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public static void method1066() {
		if (Static31.aClass41_1 != null) {
			@Pc(7) Class41 local7 = Static31.aClass41_1;
			synchronized (Static31.aClass41_1) {
				Static31.aClass41_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Z")
	public static boolean method1067(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[Lclient!wa;IIIIIII)V")
	public static void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub3_Sub17[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) Class6_Sub3_Sub17 local14 = arg2[local8];
			if (local14 != null && (local14.anInt3284 == 0 || local14.aBoolean175) && local14 != null && arg7 == local14.anInt3274 && !Static54.method1095(local14)) {
				@Pc(49) int local49 = arg0 + local14.anInt3221 - arg3;
				@Pc(57) int local57 = local14.anInt3287 + arg4 - arg5;
				@Pc(62) int local62 = local49 + local14.anInt3264;
				@Pc(67) int local67 = local14.anInt3230 + local57;
				@Pc(78) int local78 = local57 <= arg4 ? arg4 : local57;
				@Pc(89) int local89 = local49 <= arg0 ? arg0 : local49;
				@Pc(100) int local100 = arg8 <= local67 ? arg8 : local67;
				@Pc(107) int local107 = arg6 > local62 ? local62 : arg6;
				if (local14.anInt3284 == 0) {
					method1068(local89, arg1, arg2, local14.anInt3291 + local89 - local49, local78, local14.anInt3243 + local78 - local57, local107, local14.anInt3233, local100);
					if (local14.aClass6_Sub3_Sub17Array2 != null) {
						method1068(local89, arg1, local14.aClass6_Sub3_Sub17Array2, local14.anInt3291 + local89 - local49, local78, local78 + local14.anInt3243 - local57, local107, local14.anInt3233, local100);
					}
				}
				if (local14.aBoolean175) {
					@Pc(187) boolean local187;
					if (local78 <= Static102.anInt2823 && Static59.anInt1768 >= local89 && Static102.anInt2823 < local100 && Static59.anInt1768 < local107) {
						local187 = true;
					} else {
						local187 = false;
					}
					@Pc(193) boolean local193 = false;
					if (Static47.anInt1499 == 1 && local187) {
						local193 = true;
					}
					@Pc(202) boolean local202 = false;
					if (Static19.anInt642 == 1 && local78 <= Static59.anInt1765 && local89 <= Static61.anInt1804 && local100 > Static59.anInt1765 && Static61.anInt1804 < local107) {
						local202 = true;
					}
					if (local202 && Static18.aClass6_Sub3_Sub17_2 == null && (arg1 & 0x200) != 0 && !Static12.aBoolean23 && Static49.method1038(local14) != null) {
						Static40.anInt2117 = Static59.anInt1768;
						Static100.anInt2794 = 0;
						Static18.aClass6_Sub3_Sub17_2 = local14;
						Static93.aBoolean139 = false;
						Static79.anInt2159 = Static102.anInt2823;
					}
					if (Static18.aClass6_Sub3_Sub17_2 != null || Static12.aBoolean23) {
						local187 = false;
						local193 = false;
						local202 = false;
					}
					if (!local14.aBoolean172 && local202 && (arg1 & 0x1) != 0) {
						local14.aBoolean172 = true;
						if (local14.anObjectArray16 != null) {
							Static99.method1836(local14.anObjectArray16, local14, 0, Static61.anInt1804 - local49, null, Static59.anInt1765 - local57);
						}
					}
					if (local14.aBoolean172 && local193 && (arg1 & 0x4) != 0 && local14.anObjectArray18 != null) {
						Static99.method1836(local14.anObjectArray18, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
					}
					if (local14.aBoolean172 && !local193 && (arg1 & 0x2) != 0) {
						local14.aBoolean172 = false;
						if (local14.anObjectArray14 != null) {
							Static99.method1836(local14.anObjectArray14, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
						}
					}
					if (local193 && (arg1 & 0x8) != 0 && local14.anObjectArray9 != null) {
						Static99.method1836(local14.anObjectArray9, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
					}
					if (!local14.aBoolean180 && local187 && (arg1 & 0x10) != 0) {
						local14.aBoolean180 = true;
						if (local14.anObjectArray10 != null) {
							Static99.method1836(local14.anObjectArray10, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
						}
					}
					if (local14.aBoolean180 && local187 && (arg1 & 0x40) != 0 && local14.anObjectArray11 != null) {
						Static99.method1836(local14.anObjectArray11, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
					}
					if (local14.aBoolean180 && !local187 && (arg1 & 0x20) != 0) {
						local14.aBoolean180 = false;
						if (local14.anObjectArray4 != null) {
							Static99.method1836(local14.anObjectArray4, local14, 0, Static59.anInt1768 - local49, null, Static102.anInt2823 - local57);
						}
					}
					if (local14.anObjectArray13 != null && (arg1 & 0x80) != 0) {
						Static99.method1836(local14.anObjectArray13, local14, 0, 0, null, 0);
					}
					if (local187 && Static35.anInt1173 != 0 && local14.anObjectArray5 != null && (arg1 & 0x400) != 0) {
						Static99.method1836(local14.anObjectArray5, local14, 0, Static35.anInt1173, null, 0);
					}
					if ((arg1 & 0x100) != 0) {
						if (Static72.anInt2047 > local14.anInt3249 && local14.anObjectArray8 != null) {
							Static99.method1836(local14.anObjectArray8, local14, 0, 0, null, 0);
						}
						if (Static84.anInt2422 > local14.anInt3249 && local14.anObjectArray17 != null) {
							Static99.method1836(local14.anObjectArray17, local14, 0, 0, null, 0);
						}
						if (local14.anInt3249 < Static23.anInt2354 && local14.anObjectArray15 != null) {
							Static99.method1836(local14.anObjectArray15, local14, 0, 0, null, 0);
						}
						local14.anInt3249 = Static73.anInt2064;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public static void method1069() {
		for (@Pc(21) int local21 = 0; local21 < Static25.anInt845; local21++) {
			@Pc(27) int local27 = Static68.anIntArray223[local21]--;
			if (Static68.anIntArray223[local21] >= -10) {
				@Pc(96) Class62 local96 = Static15.aClass62Array1[local21];
				if (local96 == null) {
					local96 = Static130.method1730(Static86.aClass7_Sub1_16, Static11.anIntArray222[local21]);
					if (local96 == null) {
						continue;
					}
					Static68.anIntArray223[local21] += local96.method1729();
					Static15.aClass62Array1[local21] = local96;
				}
				if (Static68.anIntArray223[local21] < 0) {
					@Pc(218) int local218;
					if (Static85.anIntArray306[local21] == 0) {
						local218 = Static65.anInt1846;
					} else {
						@Pc(139) int local139 = (Static85.anIntArray306[local21] & 0xFF) * 128;
						@Pc(147) int local147 = Static85.anIntArray306[local21] >> 8 & 0xFF;
						@Pc(155) int local155 = Static85.anIntArray306[local21] >> 16 & 0xFF;
						@Pc(165) int local165 = local155 * 128 + 64 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319;
						@Pc(174) int local174 = local147 * 128 + 64 - Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347;
						if (local174 < 0) {
							local174 = -local174;
						}
						if (local165 < 0) {
							local165 = -local165;
						}
						@Pc(193) int local193 = local174 + local165 - 128;
						if (local193 > local139) {
							Static68.anIntArray223[local21] = -100;
							continue;
						}
						if (local193 < 0) {
							local193 = 0;
						}
						local218 = (local139 - local193) * Static56.anInt1713 / local139;
					}
					if (local218 > 0) {
						@Pc(229) Class6_Sub11_Sub1 local229 = local96.method1728().method1879(Static69.aClass43_1);
						@Pc(234) Class6_Sub6_Sub1 local234 = Static126.method772(local229, local218);
						local234.method784(Static96.anIntArray292[local21] - 1);
						Static54.aClass6_Sub6_Sub2_1.method1625(local234);
					}
					Static68.anIntArray223[local21] = -100;
				}
			} else {
				Static25.anInt845--;
				for (@Pc(43) int local43 = local21; local43 < Static25.anInt845; local43++) {
					Static11.anIntArray222[local43] = Static11.anIntArray222[local43 + 1];
					Static15.aClass62Array1[local43] = Static15.aClass62Array1[local43 + 1];
					Static96.anIntArray292[local43] = Static96.anIntArray292[local43 + 1];
					Static68.anIntArray223[local43] = Static68.anIntArray223[local43 + 1];
					Static85.anIntArray306[local43] = Static85.anIntArray306[local43 + 1];
				}
				local21--;
			}
		}
		if (Static64.aBoolean100 && !Static115.method2095()) {
			if (Static13.anInt433 != 0 && Static56.anInt1714 != -1) {
				Static47.method1028(Static64.aClass7_Sub1_10, Static56.anInt1714, 0, Static13.anInt433);
			}
			Static64.aBoolean100 = false;
		}
	}
}
