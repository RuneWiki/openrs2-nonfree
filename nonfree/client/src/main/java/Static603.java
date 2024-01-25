import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "[Lclient!ia;")
	public static Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "[I")
	public static final int[] anIntArray556 = new int[14];

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "Lclient!cc;")
	public static final Class5_Sub11 aClass5_Sub11_1 = new Class5_Sub11(0, 0);

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "[I")
	public static final int[] anIntArray557 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_306 = new Class196(51, 4);

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!kia;ZI)V")
	public static void method8109(@OriginalArg(0) Class41_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static223.anInt3566 >= 400) {
			return;
		}
		@Pc(17) Class311 local17 = arg0.aClass311_1;
		@Pc(20) String local20 = arg0.aString45;
		if (local17.anIntArray476 != null) {
			local17 = local17.method7325(Static413.aClass63_1);
			if (local17 == null) {
				return;
			}
			local20 = local17.aString92;
		}
		if (!local17.aBoolean624) {
			return;
		}
		if (arg0.anInt5483 != 0) {
			@Pc(57) String local57 = Static478.aClass174_6 == Static591.aClass174_7 ? Static49.aClass42_30.method730(Static259.anInt4113) : Static49.aClass42_28.method730(Static259.anInt4113);
			local20 = local20 + Static578.method7878(arg0.anInt5483, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558) + " (" + local57 + arg0.anInt5483 + ")";
		}
		if (Static386.aBoolean482 && !arg1) {
			@Pc(97) Class53 local97 = Static350.anInt6210 == -1 ? null : Static522.aClass282_2.method6901(Static350.anInt6210);
			if ((Static2.anInt22 & 0x2) != 0 && (local97 == null || local17.method7324(local97.anInt1028, Static350.anInt6210) != local97.anInt1028)) {
				Static244.method3492(23, Static116.aString18 + " -> <col=ffff00>" + local20, true, -1, Static11.aString1, Static476.anInt8267, (long) arg0.anInt9469, false, false, 0, 0, (long) arg0.anInt9469);
			}
		}
		if (!arg1) {
			@Pc(151) String[] local151 = local17.aStringArray33;
			if (Static534.aBoolean764) {
				local151 = Static261.method3623(local151);
			}
			@Pc(161) int local161;
			if (local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && (local17.aByte108 == 0 || !local151[local161].equalsIgnoreCase(Static49.aClass42_23.method730(Static259.anInt4113)))) {
						@Pc(184) byte local184 = 0;
						if (local161 == 0) {
							local184 = 47;
						}
						@Pc(193) int local193 = Static478.anInt8275;
						if (local161 == 1) {
							local184 = 5;
						}
						if (local161 == 2) {
							local184 = 9;
						}
						if (local161 == 3) {
							local184 = 46;
						}
						if (local17.anInt8644 == local161) {
							local193 = local17.anInt8673;
						}
						if (local161 == 4) {
							local184 = 17;
						}
						if (local161 == local17.anInt8638) {
							local193 = local17.anInt8660;
						}
						Static244.method3492(local184, "<col=ffff00>" + local20, true, -1, local151[local161], local151[local161].equalsIgnoreCase(Static49.aClass42_23.method730(Static259.anInt4113)) ? local17.anInt8647 : local193, (long) arg0.anInt9469, false, false, 0, 0, (long) arg0.anInt9469);
					}
				}
			}
			if (local17.aByte108 == 1 && local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && local151[local161].equalsIgnoreCase(Static49.aClass42_23.method730(Static259.anInt4113))) {
						@Pc(312) short local312 = 0;
						if (arg0.anInt5483 > Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558) {
							local312 = 2000;
						}
						@Pc(321) short local321 = 0;
						if (local161 == 0) {
							local321 = 47;
						}
						if (local161 == 1) {
							local321 = 5;
						}
						if (local161 == 2) {
							local321 = 9;
						}
						if (local161 == 3) {
							local321 = 46;
						}
						if (local161 == 4) {
							local321 = 17;
						}
						if (local321 != 0) {
							local321 += local312;
						}
						Static244.method3492(local321, "<col=ffff00>" + local20, true, -1, local151[local161], local17.anInt8647, (long) arg0.anInt9469, false, false, 0, 0, (long) arg0.anInt9469);
					}
				}
			}
		}
		Static244.method3492(1002, "<col=ffff00>" + local20, true, -1, Static49.aClass42_22.method730(Static259.anInt4113), Static522.anInt8721, (long) arg0.anInt9469, arg1, false, 0, 0, (long) arg0.anInt9469);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
	public static void method8111() {
		@Pc(1) Class265 local1 = Static168.aClass265_9;
		synchronized (Static168.aClass265_9) {
			Static168.aClass265_9.method6568();
		}
		local1 = Static360.aClass265_36;
		synchronized (Static360.aClass265_36) {
			Static360.aClass265_36.method6568();
		}
	}
}
