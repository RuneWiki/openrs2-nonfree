import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!lc;")
	public static final Class58 aClass58_13 = new Class58(32);

	@OriginalMember(owner = "client!o", name = "D", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1022 = Static151.method2243("sl_stars");

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1024 = Static151.method2243("");

	@OriginalMember(owner = "client!o", name = "E", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1023 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	public static int anInt2897 = 0;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1025 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1026 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1027 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1028 = Static151.method2243(":clanreq:");

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1029 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1030 = aClass62_1024;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(21) Class2_Sub25 local21 = null;
		for (@Pc(26) Class2_Sub25 local26 = (Class2_Sub25) Static76.aClass13_3.method303(); local26 != null; local26 = (Class2_Sub25) Static76.aClass13_3.method309()) {
			if (arg2 == local26.anInt4159 && local26.anInt4168 == arg8 && arg4 == local26.anInt4163 && arg5 == local26.anInt4166) {
				local21 = local26;
				break;
			}
		}
		if (local21 == null) {
			local21 = new Class2_Sub25();
			local21.anInt4159 = arg2;
			local21.anInt4163 = arg4;
			local21.anInt4166 = arg5;
			local21.anInt4168 = arg8;
			Static3.method94(local21);
			Static76.aClass13_3.method304(local21);
		}
		local21.anInt4161 = arg1;
		local21.anInt4155 = arg3;
		local21.anInt4162 = arg7;
		local21.anInt4165 = arg6;
		local21.anInt4154 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rg;I)V")
	public static void method2052(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static56.aBoolean49) {
			Static205.method2998(arg0);
			return;
		}
		if (Static44.anInt998 == 1 && Static43.anInt985 >= 715 && Static170.anInt3634 >= 453) {
			Static153.aBoolean140 = !Static153.aBoolean140;
			if (Static153.aBoolean140) {
				Static184.method1386();
			} else {
				Static78.method1104(255, Static63.aClass71_Sub1_5, Static131.anInt1518);
			}
		}
		if (Static87.anInt1821 == 5) {
			return;
		}
		Static68.anInt1428++;
		if (Static87.anInt1821 != 10) {
			return;
		}
		if (anInt2897 != 2) {
			if (Static44.anInt998 == 1 && Static43.anInt985 >= 5 && Static43.anInt985 <= 105 && Static170.anInt3634 >= 463 && Static170.anInt3634 <= 498) {
				Static44.method688();
				return;
			}
			if (Static3.aClass92_1 != null) {
				Static44.method688();
			}
		}
		@Pc(110) int local110 = Static43.anInt985;
		@Pc(112) int local112 = Static44.anInt998;
		@Pc(114) int local114 = Static170.anInt3634;
		if (Static198.anInt4146 == 0) {
			if (local112 == 1 && local110 >= 227 && local110 <= 377 && local114 >= 271 && local114 <= 311) {
				Static198.anInt4146 = 3;
				Static130.anInt2829 = 0;
			}
			@Pc(166) boolean local166 = false;
			if (Static187.anInt3891 != 0) {
				while (Static77.method2464()) {
					if (Static172.anInt678 == 84) {
						local166 = true;
						break;
					}
				}
			}
			if (local166 || local112 == 1 && local110 >= 387 && local110 <= 537 && local114 >= 271 && local114 <= 311) {
				aClass62_1025 = Static154.aClass62_1163;
				aClass62_1029 = Static109.aClass62_832;
				Static198.anInt4146 = 2;
				aClass62_1023 = Static154.aClass62_1176;
				Static130.anInt2829 = 0;
			}
		} else if (Static198.anInt4146 == 2) {
			@Pc(231) short local231 = 231;
			@Pc(232) int local232 = local231 + 30;
			if (local112 == 1 && local114 >= 246 && local114 < 261) {
				Static130.anInt2829 = 0;
			}
			local232 += 15;
			if (local112 == 1 && local114 >= 261 && local114 < 276) {
				Static130.anInt2829 = 1;
			}
			local232 += 15;
			if (local112 == 1 && local110 >= 227 && local110 <= 377 && local114 >= 301 && local114 <= 341) {
				aClass62_1026 = aClass62_1026.method1882().method1876();
				if (aClass62_1026.method1878() == 0) {
					Static43.method676(Static154.aClass62_1159, Static170.aClass62_1277, Static154.aClass62_1166);
				} else if (aClass62_1030.method1878() == 0) {
					Static43.method676(Static154.aClass62_1156, Static36.aClass62_277, Static154.aClass62_1165);
				} else {
					Static43.method676(Static154.aClass62_1140, Static62.aClass62_431, Static154.aClass62_1168);
					Static2.method55(20);
				}
			} else {
				if (local112 == 1 && local110 >= 387 && local110 <= 537 && local114 >= 301 && local114 <= 341) {
					aClass62_1026 = aClass62_1024;
					aClass62_1030 = aClass62_1024;
					Static198.anInt4146 = 0;
				}
				while (true) {
					while (Static77.method2464()) {
						@Pc(378) boolean local378 = false;
						for (@Pc(380) int local380 = 0; local380 < Static42.aClass62_1483.method1878(); local380++) {
							if (Static185.anInt3853 == Static42.aClass62_1483.method1857(local380)) {
								local378 = true;
								break;
							}
						}
						if (Static130.anInt2829 == 0) {
							if (Static172.anInt678 == 85 && aClass62_1026.method1878() > 0) {
								aClass62_1026 = aClass62_1026.method1862(0, aClass62_1026.method1878() - 1);
							}
							if (Static172.anInt678 == 84 || Static172.anInt678 == 80) {
								Static130.anInt2829 = 1;
							}
							if (local378 && aClass62_1026.method1878() < 12) {
								aClass62_1026 = aClass62_1026.method1851(Static185.anInt3853);
							}
						} else if (Static130.anInt2829 == 1) {
							if (Static172.anInt678 == 85 && aClass62_1030.method1878() > 0) {
								aClass62_1030 = aClass62_1030.method1862(0, aClass62_1030.method1878() - 1);
							}
							if (Static172.anInt678 == 84 || Static172.anInt678 == 80) {
								Static130.anInt2829 = 0;
							}
							if (Static187.anInt3891 != 0 && Static172.anInt678 == 84) {
								aClass62_1026 = aClass62_1026.method1882().method1876();
								if (aClass62_1026.method1878() == 0) {
									Static43.method676(Static154.aClass62_1159, Static170.aClass62_1277, Static154.aClass62_1166);
									return;
								}
								if (aClass62_1030.method1878() == 0) {
									Static43.method676(Static154.aClass62_1156, Static36.aClass62_277, Static154.aClass62_1165);
									return;
								}
								Static43.method676(Static154.aClass62_1140, Static62.aClass62_431, Static154.aClass62_1168);
								Static2.method55(20);
								return;
							}
							if (local378 && aClass62_1030.method1878() < 20) {
								aClass62_1030 = aClass62_1030.method1851(Static185.anInt3853);
							}
						}
					}
					return;
				}
			}
		} else if (Static198.anInt4146 == 3 && local112 == 1 && local110 >= 307 && local110 <= 457 && local114 >= 301 && local114 <= 341) {
			Static198.anInt4146 = 0;
		}
	}
}
