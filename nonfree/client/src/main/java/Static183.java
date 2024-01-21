import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1613 = Static120.method1824("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ug", name = "cb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1614 = Static120.method1824("Nehmen");

	@OriginalMember(owner = "client!ug", name = "fb", descriptor = "Lclient!s;")
	public static Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!ug", name = "kb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1615 = Static120.method1824("Stufe)2");

	@OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
	public static int anInt4099 = 0;

	@OriginalMember(owner = "client!ug", name = "mb", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
	public static void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg3;
		@Pc(18) int local18 = arg4 * arg4;
		@Pc(22) int local22 = arg3 * arg3;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = arg3 << 1;
		@Pc(34) int local34 = local18 << 1;
		@Pc(43) int local43 = local18 * (1 - local30) + local26;
		@Pc(52) int local52 = local22 - (local30 - 1) * local34;
		@Pc(56) int local56 = local18 << 2;
		@Pc(64) int local64 = local26 * 3;
		@Pc(68) int local68 = local22 << 2;
		@Pc(74) int local74 = local68;
		@Pc(82) int local82 = local34 * ((arg3 << 1) - 3);
		@Pc(88) int local88 = local56 * (arg3 - 1);
		@Pc(106) int local106;
		@Pc(114) int local114;
		if (arg2 >= Static34.anInt790 && Static17.anInt440 >= arg2) {
			local106 = Static61.method895(arg4 + arg1, Static172.anInt3861, Static85.anInt1779);
			local114 = Static61.method895(arg1 - arg4, Static172.anInt3861, Static85.anInt1779);
			Static46.method726(local114, arg0, Static96.anIntArrayArray27[arg2], local106);
		}
		while (local5 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local64;
					local64 += local68;
					local3++;
					local52 += local74;
					local74 += local68;
				}
			}
			if (local52 < 0) {
				local3++;
				local43 += local64;
				local64 += local68;
				local52 += local74;
				local74 += local68;
			}
			local43 += -local88;
			local52 += -local82;
			local88 -= local56;
			local82 -= local56;
			local5--;
			local114 = local5 + arg2;
			local106 = arg2 - local5;
			if (local114 >= Static34.anInt790 && Static17.anInt440 >= local106) {
				@Pc(214) int local214 = Static61.method895(local3 + arg1, Static172.anInt3861, Static85.anInt1779);
				@Pc(223) int local223 = Static61.method895(arg1 - local3, Static172.anInt3861, Static85.anInt1779);
				if (local106 >= Static34.anInt790) {
					Static46.method726(local223, arg0, Static96.anIntArrayArray27[local106], local214);
				}
				if (Static17.anInt440 >= local114) {
					Static46.method726(local223, arg0, Static96.anIntArrayArray27[local114], local214);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ed;IIII)V")
	public static void method2934(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static173.anInt3892 >= 400) {
			return;
		}
		if (arg0.anIntArray133 != null) {
			arg0 = arg0.method623();
		}
		if (arg0 == null || !arg0.aBoolean41) {
			return;
		}
		@Pc(28) Class80 local28 = arg0.aClass80_333;
		if (arg0.anInt913 != 0) {
			local28 = Static154.method2467(new Class80[] { local28, Static184.method2972(arg0.anInt913, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4341), Static71.aClass80_612, Static47.aClass80_400, Static83.method1219(arg0.anInt913), Static154.aClass80_1335 });
		}
		if (Static7.anInt221 == 1) {
			Static16.method273((short) 15, (long) arg2, Static17.aClass80_131, arg1, Static154.method2467(new Class80[] { Static134.aClass80_1289, Static168.aClass80_1452, local28 }), arg3);
		} else if (!Static162.aBoolean147) {
			@Pc(151) Class80[] local151 = arg0.aClass80Array7;
			if (Static157.aBoolean144) {
				local151 = Static105.method1564(local151);
			}
			@Pc(161) int local161;
			if (local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && (Static44.anInt1010 != 0 || !local151[local161].method2432(Static54.aClass80_465))) {
						@Pc(182) byte local182 = 0;
						if (local161 == 0) {
							local182 = 29;
						}
						if (local161 == 1) {
							local182 = 9;
						}
						if (local161 == 2) {
							local182 = 43;
						}
						if (local161 == 3) {
							local182 = 11;
						}
						if (local161 == 4) {
							local182 = 12;
						}
						Static16.method273(local182, (long) arg2, local151[local161], arg1, Static154.method2467(new Class80[] { Static14.aClass80_101, local28 }), arg3);
					}
				}
			}
			if (Static44.anInt1010 == 0 && local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && local151[local161].method2432(Static54.aClass80_465)) {
						@Pc(264) short local264 = 0;
						if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4341 < arg0.anInt913) {
							local264 = 2000;
						}
						@Pc(277) short local277 = 0;
						if (local161 == 0) {
							local277 = 29;
						}
						if (local161 == 1) {
							local277 = 9;
						}
						if (local161 == 2) {
							local277 = 43;
						}
						if (local161 == 3) {
							local277 = 11;
						}
						if (local161 == 4) {
							local277 = 12;
						}
						if (local277 != 0) {
							local277 += local264;
						}
						Static16.method273(local277, (long) arg2, local151[local161], arg1, Static154.method2467(new Class80[] { Static14.aClass80_101, local28 }), arg3);
					}
				}
			}
			Static16.method273((short) 1004, (long) arg2, Static148.aClass80_1303, arg1, Static154.method2467(new Class80[] { Static14.aClass80_101, local28 }), arg3);
		} else if ((Static33.anInt778 & 0x2) == 2) {
			Static16.method273((short) 14, (long) arg2, Static44.aClass80_376, arg1, Static154.method2467(new Class80[] { Static38.aClass80_309, Static168.aClass80_1452, local28 }), arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)I")
	public static int method2935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static141.method2186(arg1 - 1, arg0 + -1) + Static141.method2186(arg1 + 1, arg0 + -1) + Static141.method2186(arg1 - 1, arg0 + 1) + Static141.method2186(arg1 - -1, arg0 + 1);
		@Pc(70) int local70 = Static141.method2186(arg1 - 1, arg0) + Static141.method2186(arg1 + 1, arg0) + Static141.method2186(arg1, arg0 - 1) + Static141.method2186(arg1, arg0 + 1);
		@Pc(75) int local75 = Static141.method2186(arg1, arg0);
		return local70 / 8 + local41 / 16 + local75 / 4;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BILclient!rd;)V")
	public static void method2936(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1) {
		@Pc(11) Class80 local11 = arg1.method2468().method2451();
		@Pc(13) boolean local13 = false;
		for (@Pc(23) int local23 = 0; local23 < Static15.anInt327; local23++) {
			@Pc(31) Class3_Sub1_Sub5_Sub4_Sub2 local31 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local23]];
			if (local31 != null && local31.aClass80_1689 != null && local31.aClass80_1689.method2432(local11)) {
				local13 = true;
				Static27.method3147(1, local31.anIntArray513[0], Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], local31.anIntArray509[0], false, 2, 0, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 1, 0);
				if (arg0 == 1) {
					Static146.aClass3_Sub17_Sub1_3.method2146(253);
					Static146.aClass3_Sub17_Sub1_3.method2118(Static168.anIntArray460[local23]);
				} else if (arg0 == 4) {
					Static146.aClass3_Sub17_Sub1_3.method2146(134);
					Static146.aClass3_Sub17_Sub1_3.method2125(Static168.anIntArray460[local23]);
				} else if (arg0 == 6) {
					Static146.aClass3_Sub17_Sub1_3.method2146(211);
					Static146.aClass3_Sub17_Sub1_3.method2118(Static168.anIntArray460[local23]);
				} else if (arg0 == 7) {
					Static146.aClass3_Sub17_Sub1_3.method2146(198);
					Static146.aClass3_Sub17_Sub1_3.method2125(Static168.anIntArray460[local23]);
				}
				break;
			}
		}
		if (!local13) {
			Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { Static11.aClass80_90, local11 }));
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public static void method2937(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static133.anInt2865 >= 100) {
			Static147.method2354(Static185.aClass80_1637, 0, Static182.aClass80_1594);
			return;
		}
		@Pc(31) Class80 local31 = Static19.method321(arg0).method2451();
		for (@Pc(33) int local33 = 0; local33 < Static133.anInt2865; local33++) {
			if (arg0 == Static47.aLongArray4[local33]) {
				Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { local31, Static48.aClass80_404 }));
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static116.anInt4479; local74++) {
			if (Static186.aLongArray10[local74] == arg0) {
				Static147.method2354(Static185.aClass80_1637, 0, Static154.method2467(new Class80[] { Static130.aClass80_1107, local31, Static152.aClass80_1334 }));
				return;
			}
		}
		if (local31.method2437(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass80_1689)) {
			Static147.method2354(Static185.aClass80_1637, 0, Static92.aClass80_1193);
			return;
		}
		Static47.aLongArray4[Static133.anInt2865] = arg0;
		Static170.aClass80Array28[Static133.anInt2865++] = Static19.method321(arg0);
		Static168.anInt3770 = Static31.anInt747;
		Static146.aClass3_Sub17_Sub1_3.method2146(229);
		Static146.aClass3_Sub17_Sub1_3.method2112(arg0);
	}
}
