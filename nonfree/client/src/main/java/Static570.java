import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!saa", name = "P", descriptor = "[I")
	public static int[] anIntArray655;

	@OriginalMember(owner = "client!saa", name = "sb", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_133 = new Class349(11, -1);

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString99 = "";

	@OriginalMember(owner = "client!saa", name = "J", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_169 = new Class225(11, -2);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLclient!efa;I)V")
	public static void method7905(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub2 arg1) {
		if (Static535.anInt8486 >= 400) {
			return;
		}
		@Pc(23) Class261 local23 = arg1.aClass261_1;
		@Pc(26) String local26 = arg1.aString24;
		if (local23.anIntArray499 != null) {
			local23 = local23.method6272(Static396.aClass107_1);
			if (local23 == null) {
				return;
			}
			local26 = local23.aString76;
		}
		if (!local23.aBoolean585) {
			return;
		}
		if (arg1.anInt2378 != 0) {
			@Pc(68) String local68 = Static174.aClass150_3 == Static249.aClass150_6 ? Class191.lb.method4067(Static414.anInt9485) : Static289.aClass191_28.method4067(Static414.anInt9485);
			local26 = local26 + Static575.method7991(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851, arg1.anInt2378) + " (" + local68 + arg1.anInt2378 + ")";
		}
		if (Static581.aBoolean787 && !arg0) {
			@Pc(114) Class22 local114 = Static27.anInt377 == -1 ? null : Static97.aClass328_2.method7810(Static27.anInt377);
			if ((Static523.anInt6605 & 0x2) != 0 && (local114 == null || local23.method6271(local114.anInt376, Static27.anInt377, 0) != local114.anInt376)) {
				Static27.method371(Static96.anInt1729, (long) arg1.anInt2320, true, -1, Static175.aString127, false, 2, false, Static701.aString94 + " -> <col=ffff00>" + local26, (long) arg1.anInt2320, 0, 0);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(173) String[] local173 = local23.aStringArray30;
		if (Static652.aBoolean884) {
			local173 = Static671.method9146(local173);
		}
		if (local173 == null) {
			return;
		}
		for (@Pc(186) int local186 = local173.length - 1; local186 >= 0; local186--) {
			if (local173[local186] != null && (local23.aByte89 == 0 || !local173[local186].equalsIgnoreCase(Static289.aClass191_23.method4067(Static414.anInt9485)) && !local173[local186].equalsIgnoreCase(Static289.aClass191_22.method4067(Static414.anInt9485)))) {
				@Pc(223) short local223 = 0;
				@Pc(225) int local225 = Static576.anInt9090;
				if (local186 == 0) {
					local223 = 53;
				}
				if (local186 == 1) {
					local223 = 16;
				}
				if (local186 == 2) {
					local223 = 25;
				}
				if (local186 == 3) {
					local223 = 19;
				}
				if (local186 == 4) {
					local223 = 50;
				}
				if (local186 == 5) {
					local223 = 1009;
				}
				if (local186 == local23.anInt7003) {
					local225 = local23.anInt7018;
				}
				if (local186 == local23.anInt7030) {
					local225 = local23.anInt6997;
				}
				Static27.method371(local173[local186].equalsIgnoreCase(Static289.aClass191_23.method4067(Static414.anInt9485)) ? local23.anInt7020 : local225, (long) arg1.anInt2320, true, -1, local173[local186], false, local223, false, "<col=ffff00>" + local26, (long) arg1.anInt2320, 0, 0);
			}
		}
		if (local23.aByte89 != 1) {
			return;
		}
		for (@Pc(345) int local345 = 0; local345 < local173.length; local345++) {
			if (local173[local345] != null && (local173[local345].equalsIgnoreCase(Static289.aClass191_23.method4067(Static414.anInt9485)) || local173[local345].equalsIgnoreCase(Static289.aClass191_22.method4067(Static414.anInt9485)))) {
				@Pc(377) short local377 = 0;
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851 < arg1.anInt2378) {
					local377 = 2000;
				}
				@Pc(390) short local390 = 0;
				if (local345 == 0) {
					local390 = 53;
				}
				@Pc(396) int local396 = Static576.anInt9090;
				if (local345 == 1) {
					local390 = 16;
				}
				if (local345 == 2) {
					local390 = 25;
				}
				if (local345 == 3) {
					local390 = 19;
				}
				if (local345 == 4) {
					local390 = 50;
				}
				if (local345 == 5) {
					local390 = 1009;
				}
				if (local390 != 0) {
					local390 += local377;
				}
				if (local23.anInt7003 == local345) {
					local396 = local23.anInt7018;
				}
				if (local23.anInt7030 == local345) {
					local396 = local23.anInt6997;
				}
				Static27.method371(local173[local345].equalsIgnoreCase(Static289.aClass191_23.method4067(Static414.anInt9485)) ? local23.anInt7020 : local396, (long) arg1.anInt2320, true, -1, local173[local345], false, local390, false, "<col=ffff00>" + local26, (long) arg1.anInt2320, 0, 0);
			}
		}
		return;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(JI)V")
	public static void method7907(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static468.method6729(arg0 - 1L);
			Static468.method6729(1L);
		} else {
			Static468.method6729(arg0);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)Z")
	public static boolean method7911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
