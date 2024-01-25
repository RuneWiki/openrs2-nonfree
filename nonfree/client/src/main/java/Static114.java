import java.awt.Canvas;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method1694(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static356.aClass287_5.aBoolean630) {
			Static176.aClass170_3 = new Class170();
			Static176.aClass170_3.anInt4548 = arg0;
			Static176.aClass170_3.aString35 = arg1;
			if (Static207.aClass258_3 != Static375.aClass258_6) {
				Static176.aClass170_3.anInt4550 = Static176.aClass170_3.anInt4548 + 40000;
				Static176.aClass170_3.anInt4549 = Static176.aClass170_3.anInt4548 + 50000;
			}
			if (arg0 < Static225.aClass136_Sub1Array1.length && Static225.aClass136_Sub1Array1[arg0] != null) {
				Static55.anInt3626 = Static225.aClass136_Sub1Array1[arg0].anInt4380;
			}
			return true;
		}
		@Pc(52) String local52 = "";
		if (Static375.aClass258_6 != Static207.aClass258_3) {
			local52 = ":" + (arg0 + 7000);
		}
		@Pc(67) String local67 = "";
		if (Static397.aString62 != null) {
			local67 = "/p=" + Static397.aString62;
		}
		@Pc(123) String local123 = "http://" + arg1 + local52 + "/l=" + Static52.anInt1264 + "/a=" + Static200.anInt3958 + local67 + "/j" + (Static590.aBoolean730 ? "1" : "0") + ",o" + (Static97.aBoolean181 ? "1" : "0") + ",a2";
		try {
			Static413.aClient1.getAppletContext().showDocument(new URL(local123), "_self");
			return true;
		} catch (@Pc(133) Exception local133) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;BLclient!fa;)Lclient!r;")
	public static Class100 method1695(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface5 arg1) {
		return new l(arg0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(JJ)J")
	public static long method1696(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ac;ZB)V")
	public static void method1697(@OriginalArg(0) Class6_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static347.anInt6255 >= 400) {
			return;
		}
		@Pc(22) Class86 local22 = arg0.aClass86_1;
		if (local22.anIntArray136 != null) {
			local22 = local22.method1567(Static70.aClass78_1);
			if (local22 == null) {
				return;
			}
		}
		if (!local22.aBoolean192) {
			return;
		}
		@Pc(40) String local40 = local22.aString16;
		if (local22.anInt2149 != 0) {
			@Pc(56) String local56 = Static404.aClass284_3 == Static328.aClass284_2 ? Static290.aClass198_32.method4365(Static52.anInt1264) : Static290.aClass198_30.method4365(Static52.anInt1264);
			local40 = local40 + Static71.method1164(local22.anInt2149, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430) + " (" + local56 + local22.anInt2149 + ")";
		}
		if (Static25.aBoolean32 && !arg1) {
			@Pc(93) Class352 local93 = Static371.anInt6556 == -1 ? null : Static241.aClass82_1.method1498(Static371.anInt6556);
			if ((Static242.anInt4524 & 0x2) != 0 && (local93 == null || local22.method1578(local93.anInt9310, Static371.anInt6556) != local93.anInt9310)) {
				Static304.method4554(0, false, 0, -1, true, Static540.anInt8826, (long) arg0.lb, Static12.aString4 + " -> <col=ffff00>" + local40, 20, Static271.aString38);
			}
		}
		if (!arg1) {
			@Pc(143) String[] local143 = local22.aStringArray33;
			if (Static395.aBoolean533) {
				local143 = Static344.method5176(local143);
			}
			@Pc(153) int local153;
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && (local22.aByte36 == 0 || !local143[local153].equalsIgnoreCase(Static290.aClass198_25.method4365(Static52.anInt1264)))) {
						@Pc(176) byte local176 = 0;
						@Pc(178) int local178 = Static261.anInt8058;
						if (local153 == 0) {
							local176 = 23;
						}
						if (local153 == 1) {
							local176 = 5;
						}
						if (local153 == 2) {
							local176 = 17;
						}
						if (local153 == 3) {
							local176 = 58;
						}
						if (local153 == local22.anInt2129) {
							local178 = local22.anInt2144;
						}
						if (local153 == 4) {
							local176 = 13;
						}
						if (local153 == local22.anInt2157) {
							local178 = local22.anInt2154;
						}
						Static304.method4554(0, false, 0, -1, true, local143[local153].equalsIgnoreCase(Static290.aClass198_25.method4365(Static52.anInt1264)) ? local22.anInt2164 : local178, (long) arg0.lb, "<col=ffff00>" + local40, local176, local143[local153]);
					}
				}
			}
			if (local22.aByte36 == 1 && local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && local143[local153].equalsIgnoreCase(Static290.aClass198_25.method4365(Static52.anInt1264))) {
						@Pc(292) short local292 = 0;
						if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430 < local22.anInt2149) {
							local292 = 2000;
						}
						@Pc(305) short local305 = 0;
						if (local153 == 0) {
							local305 = 23;
						}
						if (local153 == 1) {
							local305 = 5;
						}
						if (local153 == 2) {
							local305 = 17;
						}
						if (local153 == 3) {
							local305 = 58;
						}
						if (local153 == 4) {
							local305 = 13;
						}
						if (local305 != 0) {
							local305 += local292;
						}
						Static304.method4554(0, false, 0, -1, true, local22.anInt2164, (long) arg0.lb, "<col=ffff00>" + local40, local305, local143[local153]);
					}
				}
			}
		}
		Static304.method4554(0, arg1, 0, -1, true, Static338.anInt6209, (long) arg0.lb, "<col=ffff00>" + local40, 1001, Static290.aClass198_24.method4365(Static52.anInt1264));
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	public static void method1698(@OriginalArg(0) int arg0) {
		Static388.anInt6824 = arg0;
		@Pc(15) Class313 local15 = Static210.aClass313_25;
		synchronized (Static210.aClass313_25) {
			Static210.aClass313_25.method6977();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
	public static void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static328.aClass284_2 == Static404.aClass284_3) {
			if (Static295.method7121(0, -2, 1, 0, false, arg0, arg1, 1)) {
				return;
			}
			Static295.method7121(0, -3, 1, 0, false, arg0, arg1, 1);
		} else if (Static295.method7121(0, -3, 1, 0, false, arg0, arg1, 1)) {
			return;
		} else {
			Static295.method7121(0, -2, 1, 0, false, arg0, arg1, 1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!kp;)Lclient!kp;")
	public static Class196 method1700(@OriginalArg(1) Class196 arg0) {
		@Pc(6) Class196 local6 = Static67.method1088(arg0);
		if (local6 == null) {
			local6 = arg0.aClass196_2;
		}
		return local6;
	}
}
