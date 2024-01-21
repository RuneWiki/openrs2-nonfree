import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1271;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public static int anInt1277;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Lclient!ed;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public static int anInt1292;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_627 = Static69.method1231("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_628 = Static69.method1231("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_629 = Static69.method1231("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public static int anInt1272 = 0;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public static int anInt1280 = 0;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_630 = Static69.method1231("hel");

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array7 = new Class2_Sub1_Sub2_Sub4[1000];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!je;BLclient!je;Lclient!fd;)Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1 method863(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class24 arg2) {
		@Pc(8) int local8 = arg2.method1915(arg1);
		@Pc(14) int local14 = arg2.method1918(arg0, local8);
		return Static125.method2074(local8, local14, arg2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method864() {
		for (@Pc(11) Class2_Sub11 local11 = (Class2_Sub11) Static61.aClass77_6.method2031(); local11 != null; local11 = (Class2_Sub11) Static61.aClass77_6.method2039()) {
			@Pc(16) int local16 = local11.anInt1313;
			if (Static112.method1873(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class2_Sub13[] local26 = Static45.aClass2_Sub13ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean112;
						break;
					}
				}
				if (!local22) {
					@Pc(52) int local52 = (int) local11.aLong100;
					@Pc(56) Class2_Sub13 local56 = Static55.method972(local52);
					if (local56 != null) {
						Static17.method316(local56);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public static void method865() {
		Static127.aClass55_88.method1413();
		Static75.aClass55_53.method1413();
		Static66.aClass55_46.method1413();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!qa;III)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static57.anInt1500 >= 400) {
			return;
		}
		if (arg1.anIntArray255 != null) {
			arg1 = arg1.method1665();
		}
		if (arg1 == null || !arg1.aBoolean185) {
			return;
		}
		@Pc(31) Class40 local31 = arg1.aClass40_1219;
		if (arg1.anInt2333 != 0) {
			local31 = Static40.method722(new Class40[] { local31, Static61.method1115(arg1.anInt2333, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1827), Static101.aClass40_1320, Static83.aClass40_1114, Static49.method886(arg1.anInt2333), Static14.aClass40_221 });
		}
		if (Static111.anInt2597 == 1) {
			Static46.method830(arg3, arg2, Static40.method722(new Class40[] { Static2.aClass40_72, Static110.aClass40_885, local31 }), arg0, 2, Static70.aClass40_936);
		} else if (!Static31.aBoolean53) {
			@Pc(114) Class40[] local114 = arg1.aClass40Array18;
			if (Static12.aBoolean249) {
				local114 = Static16.method300(local114);
			}
			@Pc(124) int local124;
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && !local114[local124].method984(Static114.aClass40_1423)) {
						@Pc(143) byte local143 = 0;
						if (local124 == 0) {
							local143 = 25;
						}
						if (local124 == 1) {
							local143 = 40;
						}
						if (local124 == 2) {
							local143 = 39;
						}
						if (local124 == 3) {
							local143 = 47;
						}
						if (local124 == 4) {
							local143 = 48;
						}
						Static46.method830(arg3, arg2, Static40.method722(new Class40[] { Static51.aClass40_693, local31 }), arg0, local143, local114[local124]);
					}
				}
			}
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && local114[local124].method984(Static114.aClass40_1423)) {
						@Pc(218) short local218 = 0;
						@Pc(220) int local220 = 0;
						if (arg1.anInt2333 > Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1827) {
							local218 = 2000;
						}
						if (local124 == 0) {
							local220 = local218 + 25;
						}
						if (local124 == 1) {
							local220 = local218 + 40;
						}
						if (local124 == 2) {
							local220 = local218 + 39;
						}
						if (local124 == 3) {
							local220 = local218 + 47;
						}
						if (local124 == 4) {
							local220 = local218 + 48;
						}
						Static46.method830(arg3, arg2, Static40.method722(new Class40[] { Static51.aClass40_693, local31 }), arg0, local220, local114[local124]);
					}
				}
			}
			Static46.method830(arg3, arg2, Static40.method722(new Class40[] { Static51.aClass40_693, local31 }), arg0, 1001, Static111.aClass40_1406);
		} else if ((Static95.anInt2422 & 0x2) == 2) {
			Static46.method830(arg3, arg2, Static40.method722(new Class40[] { Static118.aClass40_1491, Static110.aClass40_885, local31 }), arg0, 45, Static34.aClass40_471);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!kc;I)Lclient!kc;")
	public static Class2_Sub13 method867(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(12) Class2_Sub13 local12 = Static86.method2165(arg0);
		if (local12 == null) {
			local12 = arg0.aClass2_Sub13_8;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method868() {
		aClass2_Sub1_Sub2_Sub4Array7 = null;
		aClass40_627 = null;
		aClass19_1 = null;
		aClass40_628 = null;
		aClass40_629 = null;
		aClass40_630 = null;
	}
}
