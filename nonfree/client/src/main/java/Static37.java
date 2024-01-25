import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_68 = new Class96("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZILclient!kh;)V")
	public static void method3518(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class47_Sub1_Sub5_Sub1 arg1) {
		if (Static119.anInt2296 >= 400) {
			return;
		}
		@Pc(14) Class196 local14 = arg1.aClass196_1;
		if (local14.anIntArray419 != null) {
			local14 = local14.method4412(Static237.aClass80_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean441) {
			return;
		}
		@Pc(36) String local36 = local14.aString68;
		if (local14.anInt5562 != 0) {
			@Pc(52) String local52 = Static325.aClass169_2 == Static92.aClass169_1 ? Static334.aClass96_94.method1935(Static389.anInt7061) : Static93.aClass96_34.method1935(Static389.anInt7061);
			local36 = local36 + Static342.method4925(local14.anInt5562, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429) + " (" + local52 + local14.anInt5562 + ")";
		}
		if (!Static217.aBoolean311) {
			if (!arg0) {
				@Pc(138) String[] local138 = local14.aStringArray28;
				if (Static98.aBoolean149) {
					local138 = Static240.method3507(local138);
				}
				@Pc(148) int local148;
				if (local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && (Static392.aClass169_3 != Static325.aClass169_2 || !local138[local148].equalsIgnoreCase(Static316.aClass96_89.method1935(Static389.anInt7061)))) {
							@Pc(168) byte local168 = 0;
							if (local148 == 0) {
								local168 = 6;
							}
							@Pc(174) int local174 = Static356.anInt6525;
							if (local148 == 1) {
								local168 = 2;
							}
							if (local148 == 2) {
								local168 = 51;
							}
							if (local148 == 3) {
								local168 = 60;
							}
							if (local148 == local14.anInt5534) {
								local174 = local14.anInt5540;
							}
							if (local148 == 4) {
								local168 = 57;
							}
							if (local14.anInt5535 == local148) {
								local174 = local14.anInt5531;
							}
							Static379.method5349(-1, local174, "<col=ffff00>" + local36, local138[local148], 0, false, (long) arg1.anInt5358, local168, true, 0);
						}
					}
				}
				if (Static325.aClass169_2 == Static392.aClass169_3 && local138 != null) {
					for (local148 = 4; local148 >= 0; local148--) {
						if (local138[local148] != null && local138[local148].equalsIgnoreCase(Static316.aClass96_89.method1935(Static389.anInt7061))) {
							@Pc(272) short local272 = 0;
							if (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429 < local14.anInt5562) {
								local272 = 2000;
							}
							@Pc(285) short local285 = 0;
							if (local148 == 0) {
								local285 = 6;
							}
							if (local148 == 1) {
								local285 = 2;
							}
							if (local148 == 2) {
								local285 = 51;
							}
							if (local148 == 3) {
								local285 = 60;
							}
							if (local148 == 4) {
								local285 = 57;
							}
							if (local285 != 0) {
								local285 += local272;
							}
							Static379.method5349(-1, local14.anInt5530, "<col=ffff00>" + local36, local138[local148], 0, false, (long) arg1.anInt5358, local285, true, 0);
						}
					}
				}
			}
			Static379.method5349(-1, Static273.anInt4616, "<col=ffff00>" + local36, Static332.aClass96_93.method1935(Static389.anInt7061), 0, arg0, (long) arg1.anInt5358, 1008, true, 0);
		} else if (!arg0) {
			@Pc(90) Class108 local90 = Static308.anInt7729 == -1 ? null : Static192.aClass75_1.method1517(Static308.anInt7729);
			if ((Static93.anInt1804 & 0x2) != 0) {
				if (local90 == null || local14.method4415(Static308.anInt7729, local90.anInt2527) != local90.anInt2527) {
					Static379.method5349(-1, Static36.anInt7708, Static363.aString75 + " -> <col=ffff00>" + local36, Static225.aString52, 0, false, (long) arg1.anInt5358, 17, true, 0);
				}
				return;
			}
		}
	}
}
