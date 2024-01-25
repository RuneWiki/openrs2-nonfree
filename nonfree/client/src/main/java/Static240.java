import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jea", name = "M", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_28 = new Class183();

	@OriginalMember(owner = "client!jea", name = "Q", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_61 = new Class276(7, 7);

	@OriginalMember(owner = "client!jea", name = "S", descriptor = "[I")
	public static final int[] anIntArray304 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "(B)V")
	public static void method4169() {
		Static350.anImage12 = null;
		Static160.aFont1 = null;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLclient!lj;)I")
	public static int method4171(@OriginalArg(1) Class200 arg0) {
		if (arg0 == Static302.aClass200_8) {
			return 5120;
		} else if (Static302.aClass200_9 == arg0) {
			return 5122;
		} else if (Static302.aClass200_10 == arg0) {
			return 5124;
		} else if (Static302.aClass200_11 == arg0) {
			return 5121;
		} else if (Static302.aClass200_12 == arg0) {
			return 5123;
		} else if (Static302.aClass200_13 == arg0) {
			return 5125;
		} else if (arg0 == Static302.aClass200_14) {
			return 5131;
		} else if (Static302.aClass200_15 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "(B)V")
	public static void method4172() {
		Static282.method4860(Static360.aClass305_3);
		Static394.anInt7571++;
		if (Static522.aBoolean797 && Static484.aBoolean752) {
			@Pc(26) int local26 = Static258.aClass116_1.method8249();
			@Pc(34) int local34 = Static258.aClass116_1.method8250();
			local34 -= Static99.anInt2399;
			local26 -= Static337.anInt6958;
			if (local26 < Static63.anInt1628) {
				local26 = Static63.anInt1628;
			}
			if (local34 < Static49.anInt1211) {
				local34 = Static49.anInt1211;
			}
			if (Static327.aClass305_9.anInt9242 + Static63.anInt1628 < Static360.aClass305_3.anInt9242 + local26) {
				local26 = Static327.aClass305_9.anInt9242 + Static63.anInt1628 - Static360.aClass305_3.anInt9242;
			}
			if (local34 + Static360.aClass305_3.anInt9160 > Static49.anInt1211 + Static327.aClass305_9.anInt9160) {
				local34 = Static327.aClass305_9.anInt9160 + Static49.anInt1211 - Static360.aClass305_3.anInt9160;
			}
			@Pc(107) int local107 = Static327.aClass305_9.anInt9215 + local26 - Static63.anInt1628;
			@Pc(115) int local115 = Static327.aClass305_9.anInt9233 + local34 - Static49.anInt1211;
			@Pc(163) Class3_Sub38 local163;
			if (Static258.aClass116_1.method8248()) {
				if (Static394.anInt7571 > Static360.aClass305_3.anInt9176) {
					@Pc(202) int local202 = local26 - Static119.anInt2739;
					@Pc(206) int local206 = local34 - Static537.anInt9851;
					if (local202 > Static360.aClass305_3.anInt9232 || local202 < -Static360.aClass305_3.anInt9232 || local206 > Static360.aClass305_3.anInt9232 || local206 < -Static360.aClass305_3.anInt9232) {
						Static354.aBoolean598 = true;
					}
				}
				if (Static360.aClass305_3.anObjectArray29 != null && Static354.aBoolean598) {
					local163 = new Class3_Sub38();
					local163.anInt7107 = local107;
					local163.anObjectArray4 = Static360.aClass305_3.anObjectArray29;
					local163.anInt7106 = local115;
					local163.aClass305_11 = Static360.aClass305_3;
					Static597.method8423(local163);
				}
			} else {
				if (Static354.aBoolean598) {
					Static583.method7888();
					if (Static360.aClass305_3.anObjectArray27 != null) {
						local163 = new Class3_Sub38();
						local163.anObjectArray4 = Static360.aClass305_3.anObjectArray27;
						local163.anInt7106 = local115;
						local163.aClass305_10 = Static86.aClass305_4;
						local163.anInt7107 = local107;
						local163.aClass305_11 = Static360.aClass305_3;
						Static597.method8423(local163);
					}
					if (Static86.aClass305_4 != null && Static68.method1696(Static360.aClass305_3) != null) {
						Static566.method8140(Static86.aClass305_4, Static360.aClass305_3);
					}
				} else if ((Static539.anInt9736 == 1 || Static392.method6253()) && Static309.anInt6170 > 2) {
					Static314.method5269(Static119.anInt2739 + Static337.anInt6958, Static537.anInt9851 + Static99.anInt2399);
				} else if (Static420.method6744()) {
					Static314.method5269(Static119.anInt2739 + Static337.anInt6958, Static99.anInt2399 - -Static537.anInt9851);
				}
				Static360.aClass305_3 = null;
			}
		} else if (Static394.anInt7571 > 1) {
			Static360.aClass305_3 = null;
		}
	}
}
