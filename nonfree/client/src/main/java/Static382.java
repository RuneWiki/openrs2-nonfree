import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_246 = new Class184(30, -2);

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_218 = new Class175(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static338.anInt1381 == 1) {
			Static267.aClass22Array18[Static189.anInt3802 / 100].method6074(Static323.anInt5893 - 8, Static98.anInt2228 + -8);
		}
		if (Static338.anInt1381 == 2) {
			Static267.aClass22Array18[Static189.anInt3802 / 100 + 4].method6074(Static323.anInt5893 - 8, Static98.anInt2228 + -8);
		}
		Static192.method3182();
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	public static void method5245() {
		Static442.method5899(Static435.aClass68_14);
		Static51.anInt1242++;
		if (Static357.aBoolean447 && Static439.aBoolean517) {
			@Pc(26) int local26 = Static155.aClass74_1.method1870();
			@Pc(30) int local30 = Static155.aClass74_1.method1865();
			local30 -= Static418.anInt7210;
			local26 -= Static273.anInt5049;
			if (local26 < Static273.anInt5050) {
				local26 = Static273.anInt5050;
			}
			if (Static273.anInt5050 + Static71.aClass68_1.anInt2178 < local26 - -Static435.aClass68_14.anInt2178) {
				local26 = Static273.anInt5050 + Static71.aClass68_1.anInt2178 - Static435.aClass68_14.anInt2178;
			}
			if (local30 < Static13.anInt424) {
				local30 = Static13.anInt424;
			}
			if (local30 + Static435.aClass68_14.lb > Static13.anInt424 - -Static71.aClass68_1.lb) {
				local30 = Static13.anInt424 + Static71.aClass68_1.lb - Static435.aClass68_14.lb;
			}
			@Pc(111) int local111 = Static71.aClass68_1.anInt2147 + local26 - Static273.anInt5050;
			@Pc(119) int local119 = Static71.aClass68_1.anInt2151 + local30 - Static13.anInt424;
			@Pc(186) Class3_Sub20 local186;
			if (Static155.aClass74_1.method1869()) {
				if (Static51.anInt1242 > Static435.aClass68_14.anInt2166) {
					@Pc(136) int local136 = local26 - Static89.anInt1907;
					@Pc(141) int local141 = local30 - Static188.anInt3769;
					if (Static435.aClass68_14.anInt2158 < local136 || -Static435.aClass68_14.anInt2158 > local136 || Static435.aClass68_14.anInt2158 < local141 || local141 < -Static435.aClass68_14.anInt2158) {
						Static9.aBoolean14 = true;
					}
				}
				if (Static435.aClass68_14.anObjectArray16 != null && Static9.aBoolean14) {
					local186 = new Class3_Sub20();
					local186.anInt2706 = local111;
					local186.anObjectArray35 = Static435.aClass68_14.anObjectArray16;
					local186.aClass68_4 = Static435.aClass68_14;
					local186.anInt2713 = local119;
					Static272.method4044(local186);
					return;
				}
			} else {
				if (Static9.aBoolean14) {
					Static31.method766();
					if (Static435.aClass68_14.anObjectArray8 != null) {
						local186 = new Class3_Sub20();
						local186.aClass68_5 = Static364.aClass68_12;
						local186.anInt2713 = local119;
						local186.aClass68_4 = Static435.aClass68_14;
						local186.anObjectArray35 = Static435.aClass68_14.anObjectArray8;
						local186.anInt2706 = local111;
						Static272.method4044(local186);
					}
					if (Static364.aClass68_12 != null && Static56.method1155(Static435.aClass68_14) != null) {
						Static357.method5081(Static435.aClass68_14, Static364.aClass68_12);
					}
				} else if ((Static62.anInt1469 == 1 || Static336.method4873()) && Static169.anInt3551 > 2) {
					Static36.method847(Static89.anInt1907 + Static273.anInt5049, Static188.anInt3769 + Static418.anInt7210);
				} else if (Static402.method5435()) {
					Static36.method847(Static89.anInt1907 + Static273.anInt5049, Static188.anInt3769 + Static418.anInt7210);
				}
				Static435.aClass68_14 = null;
			}
		} else if (Static51.anInt1242 > 1) {
			Static435.aClass68_14 = null;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIII)V")
	public static void method5246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static142.anInt3212 <= arg3 && Static450.anInt7594 >= arg3) {
			@Pc(19) int local19 = Static439.method5863(arg1, Static163.anInt3488, Static161.anInt3448);
			@Pc(25) int local25 = Static439.method5863(arg2, Static163.anInt3488, Static161.anInt3448);
			Static355.method5027(local19, arg3, local25, arg0);
		}
	}
}
