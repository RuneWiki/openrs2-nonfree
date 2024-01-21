import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_25;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!ec;")
	private static Class22 aClass22_263 = Static60.method1113("Invalid username or password)3");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_262 = aClass22_263;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public static int anInt916 = 2;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_264 = Static60.method1113("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	public static int anInt924 = -2;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_265 = Static60.method1113("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method593() {
		aClass4_Sub1_Sub2_Sub2Array9 = null;
		aClass4_Sub1_Sub2_Sub2Array8 = null;
		aClass22_265 = null;
		aClass22_264 = null;
		aClass22_263 = null;
		aClass22_262 = null;
		aClass20_Sub1_25 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
	public static void method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static134.aClass77_1.method1957(arg1, arg2, arg3);
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(28) int local28;
		@Pc(60) int local60;
		@Pc(45) int local45;
		if (local11 != 0) {
			local20 = Static134.aClass77_1.method1925(arg1, arg2, arg3, local11);
			local26 = local20 >> 6 & 0x3;
			local28 = arg0;
			local32 = local20 & 0x1F;
			if (local11 > 0) {
				local28 = arg4;
			}
			@Pc(39) int[] local39 = Static119.aClass4_Sub1_Sub2_Sub2_7.anIntArray129;
			local45 = local11 >> 14 & 0x7FFF;
			local60 = (52736 - arg3 * 512) * 4 + arg2 * 4 + 24624;
			@Pc(64) Class4_Sub1_Sub5 local64 = Static5.method45(local45);
			if (local64.anInt1260 == -1) {
				if (local32 == 0 || local32 == 2) {
					if (local26 == 0) {
						local39[local60] = local28;
						local39[local60 + 512] = local28;
						local39[local60 + 1024] = local28;
						local39[local60 + 1536] = local28;
					} else if (local26 == 1) {
						local39[local60] = local28;
						local39[local60 + 1] = local28;
						local39[local60 + 2] = local28;
						local39[local60 + 3] = local28;
					} else if (local26 == 2) {
						local39[local60 + 3] = local28;
						local39[local60 + 512 + 3] = local28;
						local39[local60 + 1024 + 3] = local28;
						local39[local60 + 3 + 1536] = local28;
					} else if (local26 == 3) {
						local39[local60 + 1536] = local28;
						local39[local60 + 1537] = local28;
						local39[local60 + 1536 + 2] = local28;
						local39[local60 + 3 + 1536] = local28;
					}
				}
				if (local32 == 3) {
					if (local26 == 0) {
						local39[local60] = local28;
					} else if (local26 == 1) {
						local39[local60 + 3] = local28;
					} else if (local26 == 2) {
						local39[local60 + 3 + 1536] = local28;
					} else if (local26 == 3) {
						local39[local60 + 1536] = local28;
					}
				}
				if (local32 == 2) {
					if (local26 == 3) {
						local39[local60] = local28;
						local39[local60 + 512] = local28;
						local39[local60 + 1024] = local28;
						local39[local60 + 1536] = local28;
					} else if (local26 == 0) {
						local39[local60] = local28;
						local39[local60 + 1] = local28;
						local39[local60 + 2] = local28;
						local39[local60 + 3] = local28;
					} else if (local26 == 1) {
						local39[local60 + 3] = local28;
						local39[local60 + 515] = local28;
						local39[local60 + 1027] = local28;
						local39[local60 + 3 + 1536] = local28;
					} else if (local26 == 2) {
						local39[local60 + 1536] = local28;
						local39[local60 + 1 + 1536] = local28;
						local39[local60 + 1538] = local28;
						local39[local60 + 1539] = local28;
					}
				}
			} else {
				@Pc(74) Class4_Sub1_Sub2_Sub3 local74 = Static51.aClass4_Sub1_Sub2_Sub3Array4[local64.anInt1260];
				if (local74 != null) {
					@Pc(87) int local87 = (local64.anInt1256 * 4 - local74.anInt1206) / 2;
					@Pc(98) int local98 = (local64.anInt1267 * 4 - local74.anInt1210) / 2;
					local74.method853(local87 + arg2 * 4 + 48, local98 + (-local64.anInt1267 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		local11 = Static134.aClass77_1.method1937(arg1, arg2, arg3);
		if (local11 != 0) {
			local20 = Static134.aClass77_1.method1925(arg1, arg2, arg3, local11);
			local26 = local20 >> 6 & 0x3;
			local32 = local20 & 0x1F;
			local28 = local11 >> 14 & 0x7FFF;
			@Pc(463) Class4_Sub1_Sub5 local463 = Static5.method45(local28);
			@Pc(496) int local496;
			if (local463.anInt1260 != -1) {
				@Pc(472) Class4_Sub1_Sub2_Sub3 local472 = Static51.aClass4_Sub1_Sub2_Sub3Array4[local463.anInt1260];
				if (local472 != null) {
					local45 = (local463.anInt1256 * 4 - local472.anInt1206) / 2;
					local496 = (local463.anInt1267 * 4 - local472.anInt1210) / 2;
					local472.method853(arg2 * 4 + local45 + 48, local496 + (-local463.anInt1267 + -arg3 + 104) * 4 + 48);
				}
			} else if (local32 == 9) {
				local60 = 15658734;
				@Pc(532) int[] local532 = Static119.aClass4_Sub1_Sub2_Sub2_7.anIntArray129;
				local496 = arg2 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
				if (local11 > 0) {
					local60 = 15597568;
				}
				if (local26 == 0 || local26 == 2) {
					local532[local496 + 1536] = local60;
					local532[local496 + 1024 + 1] = local60;
					local532[local496 + 512 + 2] = local60;
					local532[local496 + 3] = local60;
				} else {
					local532[local496] = local60;
					local532[local496 + 1 + 512] = local60;
					local532[local496 + 2 + 1024] = local60;
					local532[local496 + 1539] = local60;
				}
			}
		}
		local11 = Static134.aClass77_1.method1938(arg1, arg2, arg3);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(642) Class4_Sub1_Sub5 local642 = Static5.method45(local20);
		if (local642.anInt1260 == -1) {
			return;
		}
		@Pc(652) Class4_Sub1_Sub2_Sub3 local652 = Static51.aClass4_Sub1_Sub2_Sub3Array4[local642.anInt1260];
		if (local652 != null) {
			local28 = (local642.anInt1256 * 4 - local652.anInt1206) / 2;
			@Pc(676) int local676 = (local642.anInt1267 * 4 - local652.anInt1210) / 2;
			local652.method853(local28 + arg2 * 4 + 48, local676 + (-arg3 - local642.anInt1267 + 104) * 4 + 48);
			return;
		}
	}
}
