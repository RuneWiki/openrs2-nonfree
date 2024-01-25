import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_131 = new Class140("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_173 = new Class157(26, -1);

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_38 = new Class180();

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method4687() {
		Static273.aClass2_Sub12_Sub2_3.method3165();
		@Pc(13) int local13 = Static273.aClass2_Sub12_Sub2_3.method3172(8);
		@Pc(26) int local26;
		if (Static186.anInt4092 > local13) {
			for (local26 = local13; local26 < Static186.anInt4092; local26++) {
				Static142.anIntArray246[Static66.anInt1170++] = Static171.anIntArray292[local26];
			}
		}
		if (Static186.anInt4092 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static186.anInt4092 = 0;
		for (local26 = 0; local26 < local13; local26++) {
			@Pc(64) int local64 = Static171.anIntArray292[local26];
			@Pc(68) Class1_Sub2_Sub3_Sub2 local68 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local64];
			@Pc(73) int local73 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
			if (local73 == 0) {
				Static171.anIntArray292[Static186.anInt4092++] = local64;
				local68.anInt6932 = Static6.anInt91;
			} else {
				@Pc(96) int local96 = Static273.aClass2_Sub12_Sub2_3.method3172(2);
				if (local96 == 0) {
					Static171.anIntArray292[Static186.anInt4092++] = local64;
					local68.anInt6932 = Static6.anInt91;
					Static281.anIntArray443[Static159.anInt2743++] = local64;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local96 == 1) {
						Static171.anIntArray292[Static186.anInt4092++] = local64;
						local68.anInt6932 = Static6.anInt91;
						local138 = Static273.aClass2_Sub12_Sub2_3.method3172(3);
						local68.method5794(1, local138);
						local148 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
						if (local148 == 1) {
							Static281.anIntArray443[Static159.anInt2743++] = local64;
						}
					} else if (local96 == 2) {
						Static171.anIntArray292[Static186.anInt4092++] = local64;
						local68.anInt6932 = Static6.anInt91;
						if (Static273.aClass2_Sub12_Sub2_3.method3172(1) == 1) {
							local138 = Static273.aClass2_Sub12_Sub2_3.method3172(3);
							local68.method5794(2, local138);
							local148 = Static273.aClass2_Sub12_Sub2_3.method3172(3);
							local68.method5794(2, local148);
						} else {
							local138 = Static273.aClass2_Sub12_Sub2_3.method3172(3);
							local68.method5794(0, local138);
						}
						local138 = Static273.aClass2_Sub12_Sub2_3.method3172(1);
						if (local138 == 1) {
							Static281.anIntArray443[Static159.anInt2743++] = local64;
						}
					} else if (local96 == 3) {
						Static142.anIntArray246[Static66.anInt1170++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public static void method4688() {
		@Pc(1) Class107 local1 = Static338.aClass107_54;
		synchronized (Static338.aClass107_54) {
			Static338.aClass107_54.method3015();
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public static void method4689() {
		Static144.aClass180_23.method4917();
		for (@Pc(13) Class2_Sub31 local13 = (Class2_Sub31) Static103.aClass180_24.method4919(); local13 != null; local13 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			if (local13.anInt5368 < 1000) {
				local13.method5723();
				Static144.aClass180_23.method4909(local13);
			}
		}
		Static144.aClass180_23.method4910(Static103.aClass180_24);
		if (Static18.aClass68_1 != null || Static366.anInt4511 > 0) {
			return;
		}
		@Pc(48) int local48 = -1;
		if (Static17.aClass2_Sub1_1 != null) {
			local48 = Static17.aClass2_Sub1_1.method53();
		}
		if (!Static258.aBoolean470) {
			if (Static356.anInt6794 >= 0) {
				local48 = Static356.anInt6794;
			}
			Static356.anInt6794 = -1;
			if (local48 == 0 && (Static163.anInt3758 == 1 && Static225.anInt4918 > 2 || Static354.method5666())) {
				local48 = 2;
			}
			if (local48 == 2 && Static225.anInt4918 > 0) {
				if (Static17.aClass2_Sub1_1 == null) {
					Static66.method1360(Static50.anInt826, Static64.anInt1136);
				} else {
					Static66.method1360(Static17.aClass2_Sub1_1.method51(), Static17.aClass2_Sub1_1.method49());
				}
			}
			if (local48 == 0 && Static225.anInt4918 > 0) {
				Static80.method1628();
				return;
			}
			return;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local48 == -1) {
			local129 = Class1_Sub2_Sub5.lb.method2470();
			local133 = Class1_Sub2_Sub5.lb.method2466();
			if (Static118.anInt2499 - 10 > local129 || Static118.anInt2488 + Static118.anInt2499 + 10 < local129 || local133 < Static220.anInt4855 - 10 || Static130.anInt2766 + Static220.anInt4855 + 10 < local133) {
				Static258.aBoolean470 = false;
				Static237.method4317(Static118.anInt2499, Static130.anInt2766, Static118.anInt2488, Static220.anInt4855);
			}
		}
		if (local48 != 0) {
			return;
		}
		local129 = Static118.anInt2499;
		local133 = Static220.anInt4855;
		@Pc(180) int local180 = Static118.anInt2488;
		@Pc(184) int local184 = Static17.aClass2_Sub1_1.method49();
		@Pc(188) int local188 = Static17.aClass2_Sub1_1.method51();
		@Pc(190) int local190 = -1;
		@Pc(209) int local209;
		for (@Pc(192) int local192 = 0; local192 < Static225.anInt4918; local192++) {
			if (Static257.aBoolean463) {
				local209 = (Static225.anInt4918 - local192 - 1) * 16 + local133 + 33;
				if (local184 > local129 && local129 + local180 > local184 && local188 > local209 - 13 && local209 + 4 > local188) {
					local190 = local192;
				}
			} else {
				local209 = (Static225.anInt4918 - local192 - 1) * 16 + local133 + 31;
				if (local184 > local129 && local184 < local180 + local129 && local188 > local209 - 13 && local209 + 3 > local188) {
					local190 = local192;
				}
			}
		}
		if (local190 != -1) {
			local209 = 0;
			@Pc(287) Class91 local287 = new Class91(Static103.aClass180_24);
			for (@Pc(292) Class2_Sub31 local292 = (Class2_Sub31) local287.method2446(); local292 != null; local292 = (Class2_Sub31) local287.method2443()) {
				if (local190 == local209) {
					Static140.method2719(local292);
				}
				local209++;
			}
		}
		Static258.aBoolean470 = false;
		Static237.method4317(Static118.anInt2499, Static130.anInt2766, Static118.anInt2488, Static220.anInt4855);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V")
	public static void method4690() {
		Static251.aClass107_32.method3011(5);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
	public static int method4691() {
		@Pc(10) Class107 local10 = Static217.aClass107_29;
		synchronized (Static217.aClass107_29) {
			return Static217.aClass107_29.method3008();
		}
	}
}
