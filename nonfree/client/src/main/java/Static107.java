import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!cf;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public static int anInt2405;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "Lclient!wf;")
	public static Class2_Sub1_Sub4_Sub3_Sub1 aClass2_Sub1_Sub4_Sub3_Sub1_3;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1010 = Static119.method1462("No response from server)3");

	@OriginalMember(owner = "client!sb", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1011 = Static119.method1462("(U2");

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1012 = aClass65_1010;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
	public static int anInt2410 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
	public static void method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub14 local6 = (Class2_Sub14) Static12.aClass13_5.method270(); local6 != null; local6 = (Class2_Sub14) Static12.aClass13_5.method273()) {
			if (local6.anInt2393 != -1 || local6.anIntArray312 != null) {
				@Pc(26) int local26 = 0;
				if (arg0 > local6.anInt2387) {
					local26 = arg0 - local6.anInt2387;
				} else if (arg0 < local6.anInt2379) {
					local26 = local6.anInt2379 - arg0;
				}
				if (local6.anInt2384 < arg2) {
					local26 += arg2 - local6.anInt2384;
				} else if (local6.anInt2386 > arg2) {
					local26 += local6.anInt2386 - arg2;
				}
				if (local26 - 64 > local6.anInt2383 || Static7.anInt221 == 0 || local6.anInt2377 != arg1) {
					if (local6.aClass2_Sub2_Sub1_1 != null) {
						Static104.aClass2_Sub2_Sub4_33.method1775(local6.aClass2_Sub2_Sub1_1);
						local6.aClass2_Sub2_Sub1_1 = null;
					}
					if (local6.aClass2_Sub2_Sub1_2 != null) {
						Static104.aClass2_Sub2_Sub4_33.method1775(local6.aClass2_Sub2_Sub1_2);
						local6.aClass2_Sub2_Sub1_2 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(149) int local149 = (local6.anInt2383 - local26) * Static7.anInt221 / local6.anInt2383;
					if (local6.aClass2_Sub2_Sub1_1 != null) {
						local6.aClass2_Sub2_Sub1_1.method513(local149);
					} else if (local6.anInt2393 >= 0) {
						@Pc(170) Class44 local170 = Static140.method1081(Static16.aClass56_Sub1_25, local6.anInt2393, 0);
						if (local170 != null) {
							@Pc(177) Class2_Sub5_Sub1 local177 = local170.method1084().method737(Static72.aClass64_1);
							@Pc(182) Class2_Sub2_Sub1 local182 = Static137.method508(local177, local149);
							local182.method511(-1);
							Static104.aClass2_Sub2_Sub4_33.method1770(local182);
							local6.aClass2_Sub2_Sub1_1 = local182;
						}
					}
					if (local6.aClass2_Sub2_Sub1_2 != null) {
						local6.aClass2_Sub2_Sub1_2.method513(local149);
						if (!local6.aClass2_Sub2_Sub1_2.method2055()) {
							local6.aClass2_Sub2_Sub1_2 = null;
						}
					} else if (local6.anIntArray312 != null && (local6.anInt2380 -= arg3) <= 0) {
						@Pc(213) int local213 = (int) ((double) local6.anIntArray312.length * Math.random());
						@Pc(221) Class44 local221 = Static140.method1081(Static16.aClass56_Sub1_25, local6.anIntArray312[local213], 0);
						if (local221 != null) {
							@Pc(228) Class2_Sub5_Sub1 local228 = local221.method1084().method737(Static72.aClass64_1);
							@Pc(233) Class2_Sub2_Sub1 local233 = Static137.method508(local228, local149);
							local233.method511(0);
							Static104.aClass2_Sub2_Sub4_33.method1770(local233);
							local6.aClass2_Sub2_Sub1_2 = local233;
							local6.anInt2380 = local6.anInt2374 + (int) ((double) (local6.anInt2378 - local6.anInt2374) * Math.random());
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method1731(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCC) >>> 2);
		@Pc(37) int local37 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!na;ZLclient!na;)V")
	public static void method1732(@OriginalArg(0) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		Static130.aClass56_39 = arg1;
		Static48.aClass56_20 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	public static void method1734() {
		aClass65_1010 = null;
		aClass15_9 = null;
		aClass65_1011 = null;
		aClass65_1012 = null;
		aClass2_Sub1_Sub4_Sub3_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1735(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static49.aClass39_1);
		arg0.removeMouseMotionListener(Static49.aClass39_1);
		arg0.removeFocusListener(Static49.aClass39_1);
		Static103.anInt2333 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!na;ZBI)V")
	public static void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(5) int arg3) {
		Static108.anInt2425 = arg1;
		Static78.aClass56_26 = arg2;
		Static44.anInt1080 = 1;
		Static79.anInt1731 = 10000;
		Static121.aBoolean105 = false;
		Static39.anInt839 = arg3;
		Static133.anInt2917 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
	public static void method1737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static49.anInt1205 < 2 && Static113.anInt2520 == 0 && !Static117.aBoolean103) {
			return;
		}
		@Pc(37) Class65 local37;
		if (Static113.anInt2520 == 1 && Static49.anInt1205 < 2) {
			local37 = Static35.method647(new Class65[] { Static76.aClass65_725, Static100.aClass65_960, Static18.aClass65_143, Static99.aClass65_942 });
		} else if (Static117.aBoolean103 && Static49.anInt1205 < 2) {
			local37 = Static35.method647(new Class65[] { Static103.aClass65_984, Static100.aClass65_960, Static22.aClass65_262, Static99.aClass65_942 });
		} else {
			local37 = Static70.method1235(Static49.anInt1205 - 1);
		}
		if (Static49.anInt1205 > 2) {
			local37 = Static35.method647(new Class65[] { local37, Static1.aClass65_3, Static120.method1871(Static49.anInt1205 - 2), Static128.aClass65_1205 });
		}
		Static2.aClass2_Sub1_Sub4_Sub3_Sub1_1.method2098(local37, arg1 + 4, arg0 + 15, Static10.anInt2951 / 1000);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wa;Z)V")
	public static void method1738(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(7) int local7 = arg0.anInt2801;
		if (local7 == 324) {
			if (Static95.anInt2152 == -1) {
				Static81.anInt1770 = arg0.anInt2822;
				Static95.anInt2152 = arg0.anInt2786;
			}
			if (Static14.aClass9_1.aBoolean13) {
				arg0.anInt2786 = Static95.anInt2152;
			} else {
				arg0.anInt2786 = Static81.anInt1770;
			}
		} else if (local7 == 325) {
			if (Static95.anInt2152 == -1) {
				Static81.anInt1770 = arg0.anInt2822;
				Static95.anInt2152 = arg0.anInt2786;
			}
			if (Static14.aClass9_1.aBoolean13) {
				arg0.anInt2786 = Static81.anInt1770;
			} else {
				arg0.anInt2786 = Static95.anInt2152;
			}
		} else if (local7 == 327) {
			arg0.anInt2829 = 150;
			arg0.anInt2812 = (int) (Math.sin((double) Static10.anInt2951 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2790 = 5;
			arg0.anInt2831 = 0;
		} else if (local7 == 328) {
			arg0.anInt2829 = 150;
			arg0.anInt2812 = (int) (Math.sin((double) Static10.anInt2951 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2831 = 1;
			arg0.anInt2790 = 5;
		}
	}
}
