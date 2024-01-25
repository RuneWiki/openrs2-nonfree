import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!uf;")
	public static final Class334 aClass334_5 = new Class334();

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)[I")
	public static int[] method4771() {
		return new int[] { Static616.anInt10014, Static304.anInt5617, Static224.anInt4613 };
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZILclient!ak;)V")
	public static void method4774(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub2_Sub1 arg1) {
		if (Static90.anInt1824 >= 400) {
			return;
		}
		if (arg1 != Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2) {
			@Pc(84) String local84;
			@Pc(142) int local142;
			if (arg1.anInt549 == 0) {
				@Pc(97) boolean local97 = true;
				if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt552 != -1 && arg1.anInt552 != -1) {
					@Pc(120) int local120 = arg1.anInt543 >= Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543 ? arg1.anInt543 : Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543;
					@Pc(131) int local131 = arg1.anInt552 > Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt552 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt552 : arg1.anInt552;
					local142 = local131 + local120 * 10 / 100 + 5;
					@Pc(149) int local149 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543 - arg1.anInt543;
					if (local149 < 0) {
						local149 = -local149;
					}
					if (local142 < local149) {
						local97 = false;
					}
				}
				@Pc(175) String local175 = Static499.aClass63_15 == Static230.aClass63_16 ? Static628.aClass369_30.method8475(Static377.anInt6756) : Static628.aClass369_28.method8475(Static377.anInt6756);
				if (arg1.anInt543 < arg1.anInt562) {
					local84 = arg1.method421() + (local97 ? Static455.method6664(arg1.anInt543, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543) : "<col=ffffff>") + " (" + local175 + arg1.anInt543 + "+" + (arg1.anInt562 - arg1.anInt543) + ")";
				} else {
					local84 = arg1.method421() + (local97 ? Static455.method6664(arg1.anInt543, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543) : "<col=ffffff>") + " (" + local175 + arg1.anInt543 + ")";
				}
			} else if (arg1.anInt549 == -1) {
				local84 = arg1.method421();
			} else {
				local84 = arg1.method421() + " (" + Static628.aClass369_29.method8475(Static377.anInt6756) + arg1.anInt549 + ")";
			}
			if (Static301.aBoolean423 && !arg0 && (Static73.anInt1590 & 0x8) != 0) {
				Static115.method1856((long) arg1.anInt3246, Static109.aString27 + " -> <col=ffffff>" + local84, 0, (long) arg1.anInt3246, true, Static81.aString20, 25, false, 0, false, Static20.anInt623, -1);
			}
			if (arg0) {
				Static115.method1856((long) arg1.anInt3246, "", 0, 0L, false, "<col=cccccc>" + local84, -1, false, 0, true, -1, 0);
			} else {
				for (@Pc(297) int local297 = 7; local297 >= 0; local297--) {
					if (Static182.aStringArray10[local297] != null) {
						@Pc(305) short local305 = 0;
						if (Static239.aClass63_14 == Static499.aClass63_15 && Static182.aStringArray10[local297].equalsIgnoreCase(Static628.aClass369_23.method8475(Static377.anInt6756))) {
							if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543 < arg1.anInt543) {
								local305 = 2000;
							}
							if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt538 != 0 && arg1.anInt538 != 0) {
								if (arg1.anInt538 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt538) {
									local305 = 2000;
								} else {
									local305 = 0;
								}
							}
						} else if (Static433.aBooleanArray39[local297]) {
							local305 = 2000;
						}
						@Pc(362) short local362 = (short) (Static395.aShortArray40[local297] + local305);
						local142 = Static117.anIntArray202[local297] == -1 ? Static492.anInt8385 : Static117.anIntArray202[local297];
						Static115.method1856((long) arg1.anInt3246, "<col=ffffff>" + local84, 0, (long) arg1.anInt3246, true, Static182.aStringArray10[local297], local362, false, 0, false, local142, -1);
					}
				}
			}
			if (!arg0) {
				for (@Pc(441) Class2_Sub5_Sub20 local441 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local441 != null; local441 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
					if (local441.anInt10077 == 16) {
						local441.aString99 = "<col=ffffff>" + local84;
						return;
					}
				}
			}
		} else if (Static301.aBoolean423 && (Static73.anInt1590 & 0x10) != 0) {
			Static115.method1856((long) arg1.anInt3246, Static109.aString27 + " -> <col=ffffff>" + Static628.aClass369_37.method8475(Static377.anInt6756), 0, 0L, true, Static81.aString20, 46, false, 0, false, Static20.anInt623, -1);
		}
	}
}
