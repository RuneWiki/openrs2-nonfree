import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ld", name = "pb", descriptor = "[I")
	public static int[] anIntArray196;

	@OriginalMember(owner = "client!ld", name = "ub", descriptor = "I")
	public static int anInt1588;

	@OriginalMember(owner = "client!ld", name = "wb", descriptor = "J")
	public static long aLong47;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "Lclient!gd;")
	public static Class22 aClass22_23 = new Class22(100);

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "Lclient!kc;")
	public static Class36 aClass36_758 = Static14.method2017("hitmarks");

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "Lclient!kc;")
	private static Class36 aClass36_759 = Static14.method2017("Hidden");

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
	public static int anInt1578 = 0;

	@OriginalMember(owner = "client!ld", name = "kb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_762 = Static14.method2017("Enter message to send to ");

	@OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_760 = aClass36_762;

	@OriginalMember(owner = "client!ld", name = "ib", descriptor = "Lclient!kc;")
	public static Class36 aClass36_761 = aClass36_759;

	@OriginalMember(owner = "client!ld", name = "nb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_4 = new Class8();

	@OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!ld", name = "vb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_765 = Static14.method2017("Create a free account");

	@OriginalMember(owner = "client!ld", name = "qb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_763 = aClass36_765;

	@OriginalMember(owner = "client!ld", name = "rb", descriptor = "[I")
	public static int[] anIntArray197 = new int[50];

	@OriginalMember(owner = "client!ld", name = "sb", descriptor = "I")
	public static final int anInt1587 = 5063219;

	@OriginalMember(owner = "client!ld", name = "tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_764 = Static14.method2017("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
	public static void method1098() {
		@Pc(7) Class9 local7 = Static77.aClass9_1;
		synchronized (Static77.aClass9_1) {
			Static19.anInt2912 = Static6.anInt153;
			@Pc(23) int local23;
			if (Static69.anInt1751 < 0) {
				for (local23 = 0; local23 < 112; local23++) {
					Static60.aBooleanArray8[local23] = false;
				}
				Static69.anInt1751 = Static42.anInt1107;
			} else {
				while (Static42.anInt1107 != Static69.anInt1751) {
					local23 = Static89.anIntArray276[Static42.anInt1107];
					Static42.anInt1107 = Static42.anInt1107 + 1 & 0x7F;
					if (local23 < 0) {
						Static60.aBooleanArray8[~local23] = false;
					} else {
						Static60.aBooleanArray8[local23] = true;
					}
				}
			}
			Static6.anInt153 = anInt1586;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(JB)V")
	public static void method1101(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static106.anInt2724 >= 100) {
			Static40.method1546(Static78.aClass36_960, 0, Static105.aClass36_1352);
			return;
		}
		@Pc(27) Class36 local27 = Static114.method2077(arg0).method1017();
		for (@Pc(29) int local29 = 0; local29 < Static106.anInt2724; local29++) {
			if (Static4.aLongArray1[local29] == arg0) {
				Static40.method1546(Static49.method949(new Class36[] { local27, Static63.aClass36_788 }), 0, Static105.aClass36_1352);
				return;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static7.anInt189; local60++) {
			if (Static24.aLongArray2[local60] == arg0) {
				Static40.method1546(Static49.method949(new Class36[] { Static86.aClass36_1032, local27, Static18.aClass36_232 }), 0, Static105.aClass36_1352);
				return;
			}
		}
		if (!local27.method1022(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass36_1027)) {
			Static4.aLongArray1[Static106.anInt2724++] = arg0;
			Static100.aBoolean118 = true;
			Static42.aClass2_Sub12_Sub1_1.method1422(163);
			Static42.aClass2_Sub12_Sub1_1.method1377(arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I")
	public static int method1102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static10.method210(arg0 - 1, arg1 - 1) + Static10.method210(arg0 - 1, arg1 + 1) + Static10.method210(arg0 - -1, arg1 + -1) + Static10.method210(arg0 + 1, arg1 + 1);
		@Pc(69) int local69 = Static10.method210(arg0, arg1 - 1) + Static10.method210(arg0, arg1 + 1) + Static10.method210(arg0 - 1, arg1) + Static10.method210(arg0 + 1, arg1);
		@Pc(74) int local74 = Static10.method210(arg0, arg1);
		return local69 / 8 + local41 / 16 + local74 / 4;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!ed;)Z")
	public static boolean method1103(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		@Pc(8) int local8 = arg0.anInt694;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static34.method717(50, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, Static43.aClass36Array21[local8] }), 0, Static49.aClass36_651);
			Static34.method717(44, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, Static43.aClass36Array21[local8] }), 0, Static60.aClass36_766);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static34.method717(28, 0, 0, Static49.method949(new Class36[] { Static36.aClass36_489, arg0.aClass36_369 }), 0, Static49.aClass36_651);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V")
	public static void method1104() {
		aClass8_4 = null;
		aClass36_759 = null;
		aClass36_761 = null;
		aClass36_763 = null;
		anIntArray197 = null;
		aClass36_765 = null;
		aClass36_758 = null;
		aClass36_760 = null;
		anIntArray196 = null;
		aClass22_23 = null;
		aClass36_764 = null;
		aClass36_762 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLclient!hd;)V")
	public static void method1105(@OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg0) {
		arg0.anInt2181 = arg0.anInt2200;
		if (arg0.anInt2158 == 0) {
			arg0.anInt2148 = 0;
			return;
		}
		if (arg0.anInt2168 != -1 && arg0.anInt2162 == 0) {
			@Pc(31) Class2_Sub1_Sub14 local31 = Static56.method1045(arg0.anInt2168);
			if (arg0.anInt2192 > 0 && local31.anInt2408 == 0) {
				arg0.anInt2148++;
				return;
			}
			if (arg0.anInt2192 <= 0 && local31.anInt2399 == 0) {
				arg0.anInt2148++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt2204;
		@Pc(69) int local69 = arg0.anInt2149;
		@Pc(84) int local84 = arg0.anInt2163 * 64 + arg0.anIntArray258[arg0.anInt2158 - 1] * 128;
		@Pc(99) int local99 = arg0.anInt2163 * 64 + arg0.anIntArray252[arg0.anInt2158 - 1] * 128;
		if (local99 - local66 > 256 || local99 - local66 < -256 || local84 - local69 > 256 || local84 - local69 < -256) {
			arg0.anInt2149 = local84;
			arg0.anInt2204 = local99;
			return;
		}
		if (local66 < local99) {
			if (local69 < local84) {
				arg0.anInt2170 = 1280;
			} else if (local84 < local69) {
				arg0.anInt2170 = 1792;
			} else {
				arg0.anInt2170 = 1536;
			}
		} else if (local99 >= local66) {
			if (local69 < local84) {
				arg0.anInt2170 = 1024;
			} else if (local84 < local69) {
				arg0.anInt2170 = 0;
			}
		} else if (local69 < local84) {
			arg0.anInt2170 = 768;
		} else if (local69 > local84) {
			arg0.anInt2170 = 256;
		} else {
			arg0.anInt2170 = 512;
		}
		@Pc(223) int local223 = arg0.anInt2170 - arg0.anInt2156 & 0x7FF;
		if (local223 > 1024) {
			local223 -= 2048;
		}
		@Pc(229) int local229 = 4;
		if (arg0.anInt2156 != arg0.anInt2170 && arg0.anInt2157 == -1 && arg0.anInt2195 != 0) {
			local229 = 2;
		}
		@Pc(246) int local246 = arg0.anInt2161;
		if (arg0.anInt2158 > 2) {
			local229 = 6;
		}
		if (arg0.anInt2158 > 3) {
			local229 = 8;
		}
		if (arg0.anInt2148 > 0 && arg0.anInt2158 > 1) {
			local229 = 8;
			arg0.anInt2148--;
		}
		if (local223 >= -256 && local223 <= 256) {
			local246 = arg0.anInt2185;
		} else if (local223 >= 256 && local223 < 768) {
			local246 = arg0.anInt2172;
		} else if (local223 >= -768 && local223 <= -256) {
			local246 = arg0.anInt2179;
		}
		if (local246 == -1) {
			local246 = arg0.anInt2185;
		}
		arg0.anInt2181 = local246;
		if (arg0.aBooleanArray13[arg0.anInt2158 - 1]) {
			local229 <<= 0x1;
		}
		if (local66 < local99) {
			arg0.anInt2204 += local229;
			if (local99 < arg0.anInt2204) {
				arg0.anInt2204 = local99;
			}
		} else if (local99 < local66) {
			arg0.anInt2204 -= local229;
			if (local99 > arg0.anInt2204) {
				arg0.anInt2204 = local99;
			}
		}
		if (local229 >= 8 && arg0.anInt2185 == arg0.anInt2181 && arg0.anInt2154 != -1) {
			arg0.anInt2181 = arg0.anInt2154;
		}
		if (local69 < local84) {
			arg0.anInt2149 += local229;
			if (arg0.anInt2149 > local84) {
				arg0.anInt2149 = local84;
			}
		} else if (local84 < local69) {
			arg0.anInt2149 -= local229;
			if (arg0.anInt2149 < local84) {
				arg0.anInt2149 = local84;
			}
		}
		if (local99 != arg0.anInt2204 || arg0.anInt2149 != local84) {
			return;
		}
		arg0.anInt2158--;
		if (arg0.anInt2192 > 0) {
			arg0.anInt2192--;
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!kc;)V")
	public static void method1106(@OriginalArg(1) Class36 arg0) {
		if (arg0 == null || arg0.method1028() == 0) {
			Static118.anInt2997 = 0;
			return;
		}
		@Pc(18) Class36 local18 = arg0;
		@Pc(26) Class36[] local26 = new Class36[100];
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(33) int local33 = local18.method1003();
			if (local33 == -1) {
				local18 = local18.method1014();
				if (local18.method1028() > 0) {
					local26[local28++] = local18.method1016();
				}
				Static118.anInt2997 = 0;
				label46: for (local33 = 0; local33 < Static113.anInt2955; local33++) {
					@Pc(91) Class2_Sub1_Sub18 local91 = Static43.method832(local33);
					if (local91.anInt2823 == -1 && local91.aClass36_1397 != null) {
						@Pc(105) Class36 local105 = local91.aClass36_1397.method1016();
						for (@Pc(107) int local107 = 0; local107 < local28; local107++) {
							if (local105.method1009(local26[local107]) == -1) {
								continue label46;
							}
						}
						Static63.aClass36Array29[Static118.anInt2997] = local105;
						Static104.anIntArray328[Static118.anInt2997] = local33;
						Static118.anInt2997++;
						if (Static63.aClass36Array29.length <= Static118.anInt2997) {
							return;
						}
					}
				}
				return;
			}
			@Pc(61) Class36 local61 = local18.method1018(0, local33).method1014();
			if (local61.method1028() > 0) {
				local26[local28++] = local61.method1016();
			}
			local18 = local18.method1020(local33 + 1);
		}
	}
}
