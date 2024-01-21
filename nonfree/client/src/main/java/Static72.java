import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "J")
	public static long aLong79;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!f;")
	public static Class13 aClass13_14;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public static int anInt1641;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!sd;")
	public static Class73 aClass73_885 = Static122.method531("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_886 = Static122.method531("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "[I")
	public static int[] anIntArray176 = new int[100];

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt1640 = 0;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_887 = Static122.method531("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!sd;")
	public static Class73 aClass73_888 = Static122.method531("leuchten2:");

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!sd;")
	public static Class73 aClass73_889 = Static122.method531(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public static int anInt1642 = 0;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public static int anInt1643 = 1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static171.anInt3765 == 1) {
			Static99.aClass3_Sub1_Sub3_Sub4Array6[Static76.anInt1683 / 100].method2321(Static171.anInt3768 - 8, Static163.anInt3185 + -8);
		}
		if (Static171.anInt3765 == 2) {
			Static99.aClass3_Sub1_Sub3_Sub4Array6[Static76.anInt1683 / 100 + 4].method2321(Static171.anInt3768 - 8, Static163.anInt3185 + -8);
		}
		Static148.method2449();
		if (!Static115.aBoolean182) {
			return;
		}
		@Pc(51) int local51 = arg3 + 512 - 5;
		@Pc(55) int local55 = arg1 + 20;
		Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1073(Static19.method372(new Class73[] { Static88.aClass73_1074, Static154.method2485(Static4.anInt79) }), local51, local55, 16776960, -1);
		@Pc(76) int local76 = local55 + 15;
		@Pc(78) Runtime local78 = Runtime.getRuntime();
		@Pc(87) int local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
		@Pc(89) int local89 = 16776960;
		if (local87 > 32768 && Static85.aBoolean127) {
			local89 = 16711680;
		}
		if (local87 > 65536 && !Static85.aBoolean127) {
			local89 = 16711680;
		}
		Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1073(Static19.method372(new Class73[] { Static48.aClass73_647, Static154.method2485(local87), Static97.aClass73_1237 }), local51, local76, local89, -1);
		local55 = local76 + 15;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1260() {
		Static139.aClass3_Sub12_Sub1_3.method1400(63);
		for (@Pc(19) Class3_Sub13 local19 = (Class3_Sub13) Static91.aClass16_9.method551(); local19 != null; local19 = (Class3_Sub13) Static91.aClass16_9.method552()) {
			if (local19.anInt1132 == 0) {
				Static8.method155(local19, true);
			}
		}
		if (Static11.aClass83_3 != null) {
			Static60.method1104(Static11.aClass83_3);
			Static11.aClass83_3 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1261() {
		@Pc(7) int local7 = Static116.anInt2761;
		@Pc(9) int local9 = Static138.anInt3195;
		@Pc(11) int local11 = Static133.anInt3045;
		@Pc(15) int local15 = Static53.anInt3959;
		Static15.method2297(local7, local9, local11, local15, 6116423);
		Static15.method2297(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static15.method2303(local7 + 1, local9 + 18, local11 - 2, local15 + -19, 0);
		Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1069(Static102.aClass73_1312, local7 + 3, local9 - -14, 6116423, -1);
		@Pc(64) int local64 = Static37.anInt899;
		@Pc(66) int local66 = Static5.anInt107;
		for (@Pc(68) int local68 = 0; local68 < Static142.anInt3262; local68++) {
			@Pc(83) int local83 = (Static142.anInt3262 - local68 - 1) * 15 + local9 + 31;
			@Pc(85) int local85 = 16777215;
			if (local64 > local7 && local7 + local11 > local64 && local66 > local83 - 13 && local66 < local83 + 3) {
				local85 = 16776960;
			}
			Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1069(Static50.method909(local68), local7 + 3, local83, local85, 0);
		}
		Static143.method2384(Static53.anInt3959, Static138.anInt3195, Static116.anInt2761, Static133.anInt3045);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1262() {
		Static68.aClass7_9.method190();
		Static142.aClass7_23.method190();
		Static129.aClass7_21.method190();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1263() {
		aClass73_886 = null;
		aClass73_885 = null;
		aClass73_887 = null;
		aClass13_14 = null;
		anIntArray176 = null;
		anIntArray177 = null;
		aClass73_888 = null;
		aClass73_889 = null;
	}
}
