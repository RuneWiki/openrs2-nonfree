import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	public static int anInt859;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array4;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_7;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
	public static boolean aBoolean53;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt858 = 1;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_422 = Static193.method3027("Hidden)2");

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt862 = 0;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_423 = Static193.method3027("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!di", name = "o", descriptor = "[I")
	public static final int[] anIntArray43 = new int[128];

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!oc;")
	public static Class70 aClass70_424 = null;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_427 = Static193.method3027("scroll:");

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Lclient!oc;")
	public static Class70 aClass70_425 = aClass70_427;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_426 = aClass70_427;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "I")
	public static int anInt869 = -2;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public static void method672() {
		if (Static55.aClass6_32 != null || Static154.aClass6_83 != null) {
			return;
		}
		@Pc(18) int local18 = Static15.anInt343;
		@Pc(83) int local83;
		@Pc(89) int local89;
		if (Static134.aBoolean131) {
			@Pc(176) int local176;
			if (local18 != 1) {
				local83 = Static167.anInt3403;
				local176 = Static8.anInt187;
				if (local176 < Static199.anInt4049 - 10 || local176 > Static36.anInt795 + Static199.anInt4049 + 10 || Static36.anInt796 - 10 > local83 || Static85.anInt1693 + Static36.anInt796 + 10 < local83) {
					Static134.aBoolean131 = false;
					Static5.method92(Static199.anInt4049, Static36.anInt795, Static36.anInt796, Static85.anInt1693);
				}
			}
			if (local18 != 1) {
				return;
			}
			local83 = Static36.anInt796;
			local176 = Static199.anInt4049;
			local89 = Static36.anInt795;
			@Pc(223) int local223 = -1;
			@Pc(225) int local225 = Static96.anInt2006;
			@Pc(227) int local227 = Static124.anInt3874;
			for (@Pc(229) int local229 = 0; local229 < Static35.anInt770; local229++) {
				@Pc(243) int local243 = (Static35.anInt770 - local229 - 1) * 15 + local83 + 31;
				if (local176 < local227 && local227 < local176 + local89 && local243 - 13 < local225 && local243 + 3 > local225) {
					local223 = local229;
				}
			}
			if (local223 != -1) {
				Static56.method887(local223);
			}
			Static134.aBoolean131 = false;
			Static5.method92(Static199.anInt4049, Static36.anInt795, Static36.anInt796, Static85.anInt1693);
			return;
		}
		if (local18 == 1 && Static35.anInt770 > 0) {
			@Pc(31) short local31 = Static55.aShortArray13[Static35.anInt770 - 1];
			if (local31 == 29 || local31 == 48 || local31 == 49 || local31 == 5 || local31 == 13 || local31 == 42 || local31 == 45 || local31 == 2 || local31 == 34 || local31 == 15 || local31 == 19 || local31 == 1001) {
				local83 = Static155.anIntArray233[Static35.anInt770 - 1];
				local89 = Static175.anIntArray293[Static35.anInt770 - 1];
				@Pc(93) Class6 local93 = Static146.method2127(local89);
				if (Static131.method1838(Static157.method2365(local93)) || Static136.method1947(Static157.method2365(local93))) {
					Static58.aBoolean76 = false;
					Static149.anInt3040 = 0;
					if (Static55.aClass6_32 != null) {
						Static9.method237(Static55.aClass6_32);
					}
					Static55.aClass6_32 = Static146.method2127(local89);
					Static209.anInt4238 = Static124.anInt3874;
					Static127.anInt2501 = Static96.anInt2006;
					Static23.anInt456 = local83;
					Static9.method237(Static55.aClass6_32);
					return;
				}
			}
		}
		if (local18 == 1 && (Static75.anInt1476 == 1 && Static35.anInt770 > 2 || Static17.method308(Static35.anInt770 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static35.anInt770 > 0) {
			Static56.method887(Static35.anInt770 - 1);
		}
		if (local18 == 2 && Static35.anInt770 > 0) {
			Static153.method2268();
			return;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II[Lclient!b;II)V")
	public static void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) int local10 = 0; local10 < arg2.length; local10++) {
			@Pc(15) Class6 local15 = arg2[local10];
			if (local15 != null && local15.anInt198 == arg1) {
				if (local15.aByte3 == 0) {
					local15.anInt244 = local15.anInt247;
				} else if (local15.aByte3 == 1) {
					local15.anInt244 = arg3 - local15.anInt247;
				} else if (local15.aByte3 == 2) {
					local15.anInt244 = arg3 * local15.anInt247 >> 14;
				} else if (local15.aByte3 == 3) {
					if (local15.anInt250 == 2) {
						local15.anInt244 = local15.anInt247 * 32 + local15.anInt240 * (local15.anInt247 - 1);
					} else if (local15.anInt250 == 7) {
						local15.anInt244 = (local15.anInt247 - 1) * local15.anInt240 + local15.anInt247 * 115;
					}
				}
				if (local15.aByte4 == 0) {
					local15.anInt236 = local15.anInt223;
				} else if (local15.aByte4 == 1) {
					local15.anInt236 = local15.anInt223 + (arg3 - local15.anInt244) / 2;
				} else if (local15.aByte4 == 2) {
					local15.anInt236 = arg3 - local15.anInt223 - local15.anInt244;
				} else if (local15.aByte4 == 3) {
					local15.anInt236 = local15.anInt223 * arg3 >> 14;
				} else if (local15.aByte4 == 4) {
					local15.anInt236 = (local15.anInt223 * arg3 >> 14) + (arg3 - local15.anInt244) / 2;
				} else {
					local15.anInt236 = arg3 - local15.anInt244 - (arg3 * local15.anInt223 >> 14);
				}
				if (local15.anInt209 - local15.anInt244 < local15.anInt271) {
					local15.anInt271 = local15.anInt209 - local15.anInt244;
				}
				if (local15.aByte2 == 0) {
					local15.anInt217 = local15.anInt234;
				} else if (local15.aByte2 == 1) {
					local15.anInt217 = arg0 - local15.anInt234;
				} else if (local15.aByte2 == 2) {
					local15.anInt217 = arg0 * local15.anInt234 >> 14;
				} else if (local15.aByte2 == 3) {
					if (local15.anInt250 == 2) {
						local15.anInt217 = local15.anInt234 * 32 + (local15.anInt234 - 1) * local15.anInt272;
					} else if (local15.anInt250 == 7) {
						local15.anInt217 = local15.anInt234 * 12 + (local15.anInt234 - 1) * local15.anInt272;
					}
				}
				if (local15.aByte5 == 0) {
					local15.anInt219 = local15.anInt202;
				} else if (local15.aByte5 == 1) {
					local15.anInt219 = local15.anInt202 + (arg0 - local15.anInt217) / 2;
				} else if (local15.aByte5 == 2) {
					local15.anInt219 = arg0 - local15.anInt217 - local15.anInt202;
				} else if (local15.aByte5 == 3) {
					local15.anInt219 = arg0 * local15.anInt202 >> 14;
				} else if (local15.aByte5 == 4) {
					local15.anInt219 = (arg0 - local15.anInt217) / 2 + (arg0 * local15.anInt202 >> 14);
				} else {
					local15.anInt219 = arg0 - (local15.anInt202 * arg0 >> 14) - local15.anInt217;
				}
				if (local15.anInt271 < 0) {
					local15.anInt271 = 0;
				}
				if (local15.anInt270 > local15.anInt220 - local15.anInt217) {
					local15.anInt270 = local15.anInt220 - local15.anInt217;
				}
				if (local15.anInt270 < 0) {
					local15.anInt270 = 0;
				}
				if (local15.anInt250 == 0) {
					Static83.method1194(local15);
				}
			}
		}
	}
}
