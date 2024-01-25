import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!ds;")
	public static Class62 aClass62_3;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!da", name = "s", descriptor = "I")
	public static int anInt1161 = 0;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BZLclient!ps;)V")
	public static void method970(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class47_Sub1_Sub5_Sub2 arg1) {
		if (Static119.anInt2296 >= 400) {
			return;
		}
		if (arg1 != Static255.aClass47_Sub1_Sub5_Sub2_2) {
			@Pc(177) String local177;
			@Pc(79) int local79;
			@Pc(107) int local107;
			if (arg1.anInt5431 == 0) {
				@Pc(55) boolean local55 = true;
				if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5451 != -1 && arg1.anInt5451 != -1) {
					local79 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429 <= arg1.anInt5429 ? arg1.anInt5429 : Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429;
					@Pc(90) int local90 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5451 < arg1.anInt5451 ? Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5451 : arg1.anInt5451;
					@Pc(100) int local100 = local79 * 10 / 100 + local90 + 5;
					local107 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429 - arg1.anInt5429;
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local107 > local100) {
						local55 = false;
					}
				}
				@Pc(134) String local134 = Static325.aClass169_2 == Static92.aClass169_1 ? Static334.aClass96_94.method1935(Static389.anInt7061) : Static93.aClass96_34.method1935(Static389.anInt7061);
				if (arg1.anInt5433 > arg1.anInt5429) {
					local177 = arg1.method4345() + (local55 ? Static342.method4925(arg1.anInt5429, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429) : "<col=ffffff>") + " (" + local134 + arg1.anInt5429 + "+" + (arg1.anInt5433 - arg1.anInt5429) + ")";
				} else {
					local177 = arg1.method4345() + (local55 ? Static342.method4925(arg1.anInt5429, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429) : "<col=ffffff>") + " (" + local134 + arg1.anInt5429 + ")";
				}
			} else {
				local177 = arg1.method4345() + " (" + Static328.aClass96_92.method1935(Static389.anInt7061) + arg1.anInt5431 + ")";
			}
			if (Static217.aBoolean311) {
				if (!arg0 && (Static93.anInt1804 & 0x8) != 0) {
					Static379.method5349(-1, Static36.anInt7708, Static363.aString75 + " -> <col=ffffff>" + local177, Static225.aString52, 0, false, (long) arg1.anInt5358, 18, true, 0);
				}
			} else if (arg0) {
				Static379.method5349(0, -1, "", "<col=cccccc>" + local177, 0, true, 0L, -1, false, 0);
			} else {
				for (local79 = 7; local79 >= 0; local79--) {
					if (Static51.aStringArray8[local79] != null) {
						@Pc(255) short local255 = 0;
						if (Static325.aClass169_2 == Static392.aClass169_3 && Static51.aStringArray8[local79].equalsIgnoreCase(Static316.aClass96_89.method1935(Static389.anInt7061))) {
							if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429 < arg1.anInt5429) {
								local255 = 2000;
							}
							if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5422 != 0 && arg1.anInt5422 != 0) {
								if (arg1.anInt5422 == Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5422) {
									local255 = 2000;
								} else {
									local255 = 0;
								}
							}
						} else if (Static308.aBooleanArray26[local79]) {
							local255 = 2000;
						}
						@Pc(313) short local313 = (short) (Static225.aShortArray58[local79] + local255);
						local107 = Static129.anIntArray175[local79] == -1 ? Static356.anInt6525 : Static129.anIntArray175[local79];
						Static379.method5349(-1, local107, "<col=ffffff>" + local177, Static51.aStringArray8[local79], 0, false, (long) arg1.anInt5358, local313, true, 0);
					}
				}
			}
			if (!arg0) {
				for (@Pc(416) Class1_Sub3 local416 = (Class1_Sub3) Static251.aClass142_26.method3199(); local416 != null; local416 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
					if (local416.anInt227 == 48) {
						local416.aString4 = "<col=ffffff>" + local177;
						return;
					}
				}
			}
		} else if (Static217.aBoolean311 && (Static93.anInt1804 & 0x10) != 0) {
			Static379.method5349(-1, Static36.anInt7708, Static363.aString75 + " -> <col=ffffff>" + Static39.aClass96_15.method1935(Static389.anInt7061), Static225.aString52, 0, false, 0L, 20, true, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lclient!cp;")
	public static Class48_Sub1 method971() {
		return Static4.aClass48_Sub1Array1.length > Static117.anInt2222 ? Static4.aClass48_Sub1Array1[Static117.anInt2222++] : null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)V")
	public static void method972() {
		Static74.aClass151_41.method3298();
	}
}
