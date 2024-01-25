import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public static int anInt7428;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_111 = new Class252(2, -1);

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_112 = new Class252(68, 6);

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public static int anInt7434 = -1;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!vi;ZZ)V")
	public static void method6644(@OriginalArg(0) Class20_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static197.anInt4015 >= 400) {
			return;
		}
		@Pc(16) Class283 local16 = arg0.aClass283_1;
		if (local16.anIntArray743 != null) {
			local16 = local16.method7368(Static417.aClass10_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean621) {
			return;
		}
		@Pc(34) String local34 = local16.aString196;
		if (local16.anInt8442 != 0) {
			@Pc(53) String local53 = Static116.aClass250_2 == Static332.aClass250_4 ? Static219.aClass45_63.method1474(Static544.anInt7853) : Static299.aClass45_90.method1474(Static544.anInt7853);
			local34 = local34 + Static338.method3568(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668, local16.anInt8442) + " (" + local53 + local16.anInt8442 + ")";
		}
		if (!Static181.aBoolean310) {
			if (!arg1) {
				@Pc(143) String[] local143 = local16.aStringArray34;
				if (Static429.aBoolean562) {
					local143 = Static255.method4633(local143);
				}
				@Pc(153) int local153;
				if (local143 != null) {
					for (local153 = 4; local153 >= 0; local153--) {
						if (local143[local153] != null && (local16.aByte98 == 0 || !local143[local153].equalsIgnoreCase(Static215.aClass45_61.method1474(Static544.anInt7853)))) {
							@Pc(176) byte local176 = 0;
							@Pc(178) int local178 = Static92.anInt2926;
							if (local153 == 0) {
								local176 = 21;
							}
							if (local153 == 1) {
								local176 = 17;
							}
							if (local153 == 2) {
								local176 = 59;
							}
							if (local153 == 3) {
								local176 = 23;
							}
							if (local16.anInt8431 == local153) {
								local178 = local16.anInt8443;
							}
							if (local153 == 4) {
								local176 = 45;
							}
							if (local153 == local16.anInt8423) {
								local178 = local16.anInt8438;
							}
							Static18.method539(local176, true, 0, local143[local153].equalsIgnoreCase(Static215.aClass45_61.method1474(Static544.anInt7853)) ? local16.anInt8413 : local178, 0, "<col=ffff00>" + local34, local143[local153], (long) arg0.anInt8969, false, -1);
						}
					}
				}
				if (local16.aByte98 == 1 && local143 != null) {
					for (local153 = 4; local153 >= 0; local153--) {
						if (local143[local153] != null && local143[local153].equalsIgnoreCase(Static215.aClass45_61.method1474(Static544.anInt7853))) {
							@Pc(291) short local291 = 0;
							if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668 < local16.anInt8442) {
								local291 = 2000;
							}
							@Pc(300) short local300 = 0;
							if (local153 == 0) {
								local300 = 21;
							}
							if (local153 == 1) {
								local300 = 17;
							}
							if (local153 == 2) {
								local300 = 59;
							}
							if (local153 == 3) {
								local300 = 23;
							}
							if (local153 == 4) {
								local300 = 45;
							}
							if (local300 != 0) {
								local300 += local291;
							}
							Static18.method539(local300, true, 0, local16.anInt8413, 0, "<col=ffff00>" + local34, local143[local153], (long) arg0.anInt8969, false, -1);
						}
					}
				}
			}
			Static18.method539(1012, true, 0, Class1_Sub2_Sub1.anInt228, 0, "<col=ffff00>" + local34, Static319.aClass45_92.method1474(Static544.anInt7853), (long) arg0.anInt8969, arg1, -1);
		} else if (!arg1) {
			@Pc(91) Class53 local91 = Static395.anInt6942 == -1 ? null : Static440.aClass266_1.method6930(Static395.anInt6942);
			if ((Static59.anInt1479 & 0x2) != 0) {
				if (local91 == null || local16.method7378(local91.anInt1685, Static395.anInt6942) != local91.anInt1685) {
					Static18.method539(25, true, 0, Static266.anInt5103, 0, Static201.aString84 + " -> <col=ffff00>" + local34, Static151.aString116, (long) arg0.anInt8969, false, -1);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZLclient!pq;Ljava/lang/String;Z)V")
	public static void method6646(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static314.method5434(arg1, 3, arg2);
			return;
		}
		@Pc(31) String local31;
		if (Static380.aString170.startsWith("win") && Static380.anInt6743 != 3) {
			local31 = null;
			if (arg1.anApplet1 != null) {
				local31 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local31 == null || !local31.equals("1")) {
				@Pc(51) Class311 local51 = Static314.method5434(arg1, 0, arg2);
				Static274.aClass229_9 = arg1;
				Static340.aClass311_2 = local51;
				Static148.aString60 = arg2;
				return;
			}
		}
		if (Static380.aString170.startsWith("mac")) {
			local31 = null;
			if (arg1.anApplet1 != null) {
				local31 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local31 != null && local31.equals("1") && arg0) {
				Static314.method5434(arg1, 1, arg2);
				return;
			}
		}
		Static314.method5434(arg1, 2, arg2);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	public static void method6648() {
		Static99.anInt2118 = -1;
		Static382.anInt6788 = 0;
		Static129.aBoolean226 = false;
		Static471.aClass69_91 = null;
		Static179.anInt3754 = -1;
		Static322.anInt6116 = 2;
		Static283.anInt5391 = 1;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I")
	public static int method6649(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
