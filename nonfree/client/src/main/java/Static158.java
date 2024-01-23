import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lclient!vf;")
	public static Class1_Sub26 aClass1_Sub26_4;

	@OriginalMember(owner = "client!oi", name = "fb", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!oi", name = "hb", descriptor = "I")
	public static int anInt3484;

	@OriginalMember(owner = "client!oi", name = "mb", descriptor = "Lclient!tg;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_68;

	@OriginalMember(owner = "client!oi", name = "ab", descriptor = "Lclient!hd;")
	public static Class50 aClass50_19 = new Class50(16);

	@OriginalMember(owner = "client!oi", name = "db", descriptor = "Lclient!sc;")
	private static Class107 aClass107_922 = Static231.method3737("wave:");

	@OriginalMember(owner = "client!oi", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_921 = aClass107_922;

	@OriginalMember(owner = "client!oi", name = "gb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_923 = Static231.method3737(" )2>");

	@OriginalMember(owner = "client!oi", name = "ib", descriptor = "Lclient!sc;")
	private static Class107 aClass107_924 = Static231.method3737("Drop");

	@OriginalMember(owner = "client!oi", name = "jb", descriptor = "Lclient!o;")
	public static Class86 aClass86_11 = null;

	@OriginalMember(owner = "client!oi", name = "kb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_925 = aClass107_924;

	@OriginalMember(owner = "client!oi", name = "lb", descriptor = "[I")
	public static int[] anIntArray304 = new int[2];

	@OriginalMember(owner = "client!oi", name = "pb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_926 = aClass107_922;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	public static void method2564() {
		Static141.anIntArray266 = null;
		Static172.anIntArray329 = null;
		Static223.anIntArray373 = null;
		aByteArrayArray7 = null;
		Static169.anIntArray324 = null;
		Static56.anIntArray124 = null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILclient!jb;)Lclient!ib;")
	public static Class1_Sub14 method2565(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(13) byte[] local13 = arg1.method836(arg0);
		return local13 == null ? null : new Class1_Sub14(local13);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!jb;Z)V")
	public static void method2566(@OriginalArg(0) Class28 arg0) {
		Static185.anInt4914 = arg0.method837(Static73.aClass107_486);
		Static20.anInt2216 = arg0.method837(Static187.aClass107_1090);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
	public static void method2567() {
		if (Static53.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static39.anIntArray84[220] = 74;
			Static39.anIntArray84[221] = 43;
			Static39.anIntArray84[223] = 28;
			Static39.anIntArray84[189] = 26;
			Static39.anIntArray84[190] = 72;
			Static39.anIntArray84[192] = 58;
			Static39.anIntArray84[219] = 42;
			Static39.anIntArray84[186] = 57;
			Static39.anIntArray84[188] = 71;
			Static39.anIntArray84[187] = 27;
			Static39.anIntArray84[191] = 73;
			Static39.anIntArray84[222] = 59;
			return;
		}
		Static39.anIntArray84[44] = 71;
		Static39.anIntArray84[45] = 26;
		if (Static53.aMethod2 == null) {
			Static39.anIntArray84[222] = 59;
			Static39.anIntArray84[192] = 58;
		} else {
			Static39.anIntArray84[222] = 58;
			Static39.anIntArray84[192] = 28;
			Static39.anIntArray84[520] = 59;
		}
		Static39.anIntArray84[61] = 27;
		Static39.anIntArray84[47] = 73;
		Static39.anIntArray84[92] = 74;
		Static39.anIntArray84[46] = 72;
		Static39.anIntArray84[59] = 57;
		Static39.anIntArray84[93] = 43;
		Static39.anIntArray84[91] = 42;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method2569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static86.anInt1909++;
		Static2.anInt116 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(30) int local30;
		@Pc(33) int local33;
		@Pc(180) int local180;
		for (@Pc(23) int local23 = Static13.anInt332; local23 < Static11.anInt296; local23++) {
			@Pc(28) Class1_Sub9[][] local28 = Static174.aClass1_Sub9ArrayArrayArray2[local23];
			for (local30 = Static19.anInt389; local30 < Static10.anInt282; local30++) {
				for (local33 = Static194.anInt4294; local33 < Static178.anInt3878; local33++) {
					@Pc(40) Class1_Sub9 local40 = local28[local30][local33];
					if (local40 != null) {
						if (Static85.aBooleanArrayArray2[local30 + Static111.anInt2473 - Static153.anInt3385][local33 + Static111.anInt2473 - Static175.anInt3799] && (arg3 == null || local23 < arg4 || arg3[local23][local30][local33] != arg5)) {
							local40.aBoolean126 = true;
							local40.aBoolean127 = true;
							if (local40.anInt1416 > 0) {
								local40.aBoolean125 = true;
							} else {
								local40.aBoolean125 = false;
							}
							Static2.anInt116++;
						} else {
							local40.aBoolean126 = false;
							local40.aBoolean127 = false;
							local40.anInt1417 = 0;
							if (local30 >= local9 && local30 <= local13 && local33 >= local17 && local33 <= local21) {
								if (local40.aClass97_1 != null) {
									@Pc(97) Class97 local97 = local40.aClass97_1;
									local97.aClass5_8.method2295(local97.anInt3715, local97.anInt3719, local97.anInt3719, local97.anInt3715);
									if (local97.aClass5_9 != null) {
										local97.aClass5_9.method2295(local97.anInt3715, local97.anInt3719, local97.anInt3719, local97.anInt3715);
									}
								}
								if (local40.aClass46_1 != null) {
									@Pc(130) Class46 local130 = local40.aClass46_1;
									local130.aClass5_3.method2295(local130.anInt1688, local130.anInt1698, local130.anInt1698, local130.anInt1688);
									if (local130.aClass5_2 != null) {
										local130.aClass5_2.method2295(local130.anInt1688, local130.anInt1698, local130.anInt1698, local130.anInt1688);
									}
								}
								if (local40.aClass40_1 != null) {
									@Pc(163) Class40 local163 = local40.aClass40_1;
									local163.aClass5_1.method2295(local163.anInt1529, local163.anInt1528, local163.anInt1528, local163.anInt1529);
								}
								if (local40.aClass99Array2 != null) {
									for (local180 = 0; local180 < local40.anInt1416; local180++) {
										@Pc(186) Class99 local186 = local40.aClass99Array2[local180];
										local186.aClass5_10.method2295(local186.anInt3819, local186.anInt3811, local186.anInt3808, local186.anInt3807);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(243) boolean local243 = Static166.anIntArrayArrayArray11 == Static36.anIntArrayArrayArray3;
		@Pc(271) int local271;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(262) int local262;
		for (local30 = Static13.anInt332; local30 < Static11.anInt296; local30++) {
			@Pc(250) Class1_Sub9[][] local250 = Static174.aClass1_Sub9ArrayArrayArray2[local30];
			for (@Pc(253) int local253 = -Static111.anInt2473; local253 <= 0; local253++) {
				local180 = Static153.anInt3385 + local253;
				local262 = Static153.anInt3385 - local253;
				if (local180 >= Static19.anInt389 || local262 < Static10.anInt282) {
					for (local271 = -Static111.anInt2473; local271 <= 0; local271++) {
						local276 = Static175.anInt3799 + local271;
						local280 = Static175.anInt3799 - local271;
						@Pc(292) Class1_Sub9 local292;
						if (local180 >= Static19.anInt389) {
							if (local276 >= Static194.anInt4294) {
								local292 = local250[local180][local276];
								if (local292 != null && local292.aBoolean126) {
									Static32.method603(local292, true);
								}
							}
							if (local280 < Static178.anInt3878) {
								local292 = local250[local180][local280];
								if (local292 != null && local292.aBoolean126) {
									Static32.method603(local292, true);
								}
							}
						}
						if (local262 < Static10.anInt282) {
							if (local276 >= Static194.anInt4294) {
								local292 = local250[local262][local276];
								if (local292 != null && local292.aBoolean126) {
									Static32.method603(local292, true);
								}
							}
							if (local280 < Static178.anInt3878) {
								local292 = local250[local262][local280];
								if (local292 != null && local292.aBoolean126) {
									Static32.method603(local292, true);
								}
							}
						}
						if (Static2.anInt116 == 0) {
							if (!local243) {
								Static231.aBoolean446 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local33 = Static13.anInt332; local33 < Static11.anInt296; local33++) {
			@Pc(378) Class1_Sub9[][] local378 = Static174.aClass1_Sub9ArrayArrayArray2[local33];
			for (local180 = -Static111.anInt2473; local180 <= 0; local180++) {
				local262 = Static153.anInt3385 + local180;
				local271 = Static153.anInt3385 - local180;
				if (local262 >= Static19.anInt389 || local271 < Static10.anInt282) {
					for (local276 = -Static111.anInt2473; local276 <= 0; local276++) {
						local280 = Static175.anInt3799 + local276;
						@Pc(408) int local408 = Static175.anInt3799 - local276;
						@Pc(420) Class1_Sub9 local420;
						if (local262 >= Static19.anInt389) {
							if (local280 >= Static194.anInt4294) {
								local420 = local378[local262][local280];
								if (local420 != null && local420.aBoolean126) {
									Static32.method603(local420, false);
								}
							}
							if (local408 < Static178.anInt3878) {
								local420 = local378[local262][local408];
								if (local420 != null && local420.aBoolean126) {
									Static32.method603(local420, false);
								}
							}
						}
						if (local271 < Static10.anInt282) {
							if (local280 >= Static194.anInt4294) {
								local420 = local378[local271][local280];
								if (local420 != null && local420.aBoolean126) {
									Static32.method603(local420, false);
								}
							}
							if (local408 < Static178.anInt3878) {
								local420 = local378[local271][local408];
								if (local420 != null && local420.aBoolean126) {
									Static32.method603(local420, false);
								}
							}
						}
						if (Static2.anInt116 == 0) {
							if (!local243) {
								Static231.aBoolean446 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static231.aBoolean446 = false;
	}
}
