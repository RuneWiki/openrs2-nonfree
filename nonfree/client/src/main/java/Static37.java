import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!od;")
	private static Class60 aClass60_375 = Static41.method597("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_374 = aClass60_375;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!lb;")
	public static Class45 aClass45_7 = new Class45();

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!od;")
	private static Class60 aClass60_376 = Static41.method597("Loaded wordpack");

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_377 = Static41.method597("mod_icons");

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!od;")
	private static Class60 aClass60_384 = Static41.method597("Loading )2 please wait)3");

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_378 = aClass60_384;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_379 = Static41.method597("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_380 = Static41.method597("Null");

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_381 = aClass60_376;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!od;")
	public static Class60 aClass60_382 = Static41.method597(")1p");

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!od;")
	public static Class60 aClass60_383 = Static41.method597("<col=ffff00>");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method566() {
		for (@Pc(15) Class4_Sub23 local15 = (Class4_Sub23) Static14.aClass45_1.method982(); local15 != null; local15 = (Class4_Sub23) Static14.aClass45_1.method986()) {
			if (local15.anInt2927 == -1) {
				local15.anInt2921 = 0;
				Static115.method1869(local15);
			} else {
				local15.method1989();
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIB)V")
	public static void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static30.aClass48_1.method1015(arg3, arg0, arg1);
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(61) int local61;
		@Pc(67) int local67;
		if (local11 != 0) {
			local27 = Static30.aClass48_1.method1013(arg3, arg0, arg1, local11);
			local31 = local27 & 0x1F;
			local37 = local27 >> 6 & 0x3;
			@Pc(40) int[] local40 = Static106.aClass4_Sub3_Sub6_Sub3_5.anIntArray297;
			local42 = arg2;
			if (local11 > 0) {
				local42 = arg4;
			}
			local61 = arg0 * 4 + (52736 - arg1 * 512) * 4 + 24624;
			local67 = local11 >> 14 & 0x7FFF;
			@Pc(71) Class4_Sub3_Sub3 local71 = Static76.method1244(local67);
			if (local71.anInt736 == -1) {
				if (local31 == 0 || local31 == 2) {
					if (local37 == 0) {
						local40[local61] = local42;
						local40[local61 + 512] = local42;
						local40[local61 + 1024] = local42;
						local40[local61 + 1536] = local42;
					} else if (local37 == 1) {
						local40[local61] = local42;
						local40[local61 + 1] = local42;
						local40[local61 + 2] = local42;
						local40[local61 + 3] = local42;
					} else if (local37 == 2) {
						local40[local61 + 3] = local42;
						local40[local61 + 3 + 512] = local42;
						local40[local61 + 1024 + 3] = local42;
						local40[local61 + 3 + 1536] = local42;
					} else if (local37 == 3) {
						local40[local61 + 1536] = local42;
						local40[local61 + 1536 + 1] = local42;
						local40[local61 + 1536 + 2] = local42;
						local40[local61 + 1539] = local42;
					}
				}
				if (local31 == 3) {
					if (local37 == 0) {
						local40[local61] = local42;
					} else if (local37 == 1) {
						local40[local61 + 3] = local42;
					} else if (local37 == 2) {
						local40[local61 + 3 + 1536] = local42;
					} else if (local37 == 3) {
						local40[local61 + 1536] = local42;
					}
				}
				if (local31 == 2) {
					if (local37 == 3) {
						local40[local61] = local42;
						local40[local61 + 512] = local42;
						local40[local61 + 1024] = local42;
						local40[local61 + 1536] = local42;
					} else if (local37 == 0) {
						local40[local61] = local42;
						local40[local61 + 1] = local42;
						local40[local61 + 2] = local42;
						local40[local61 + 3] = local42;
					} else if (local37 == 1) {
						local40[local61 + 3] = local42;
						local40[local61 + 3 + 512] = local42;
						local40[local61 + 1027] = local42;
						local40[local61 + 3 + 1536] = local42;
					} else if (local37 == 2) {
						local40[local61 + 1536] = local42;
						local40[local61 + 1537] = local42;
						local40[local61 + 2 + 1536] = local42;
						local40[local61 + 3 + 1536] = local42;
					}
				}
			} else {
				@Pc(81) Class4_Sub3_Sub6_Sub2 local81 = Static24.aClass4_Sub3_Sub6_Sub2Array2[local71.anInt736];
				if (local81 != null) {
					@Pc(94) int local94 = (local71.anInt750 * 4 - local81.anInt2256) / 2;
					@Pc(105) int local105 = (local71.anInt760 * 4 - local81.anInt2255) / 2;
					local81.method1558(arg0 * 4 + local105 + 48, 48 - -((-arg1 + 104 + -local71.anInt750) * 4) + local94);
				}
			}
		}
		local11 = Static30.aClass48_1.method1024(arg3, arg0, arg1);
		if (local11 != 0) {
			local27 = Static30.aClass48_1.method1013(arg3, arg0, arg1, local11);
			local31 = local27 & 0x1F;
			local37 = local27 >> 6 & 0x3;
			local42 = local11 >> 14 & 0x7FFF;
			@Pc(484) Class4_Sub3_Sub3 local484 = Static76.method1244(local42);
			@Pc(518) int local518;
			if (local484.anInt736 != -1) {
				@Pc(589) Class4_Sub3_Sub6_Sub2 local589 = Static24.aClass4_Sub3_Sub6_Sub2Array2[local484.anInt736];
				if (local589 != null) {
					local67 = (local484.anInt760 * 4 - local589.anInt2255) / 2;
					local518 = (local484.anInt750 * 4 - local589.anInt2256) / 2;
					local589.method1558(local67 + arg0 * 4 + 48, local518 + (104 - (arg1 + local484.anInt750)) * 4 + 48);
				}
			} else if (local31 == 9) {
				@Pc(496) int[] local496 = Static106.aClass4_Sub3_Sub6_Sub3_5.anIntArray297;
				local61 = 15658734;
				if (local11 > 0) {
					local61 = 15597568;
				}
				local518 = arg0 * 4 + (-arg1 + 103) * 4 * 512 + 24624;
				if (local37 == 0 || local37 == 2) {
					local496[local518 + 1536] = local61;
					local496[local518 + 1 + 1024] = local61;
					local496[local518 + 2 + 512] = local61;
					local496[local518 + 3] = local61;
				} else {
					local496[local518] = local61;
					local496[local518 + 513] = local61;
					local496[local518 + 1024 + 2] = local61;
					local496[local518 + 1536 + 3] = local61;
				}
			}
		}
		local11 = Static30.aClass48_1.method1031(arg3, arg0, arg1);
		if (local11 == 0) {
			return;
		}
		local27 = local11 >> 14 & 0x7FFF;
		@Pc(652) Class4_Sub3_Sub3 local652 = Static76.method1244(local27);
		if (local652.anInt736 == -1) {
			return;
		}
		@Pc(662) Class4_Sub3_Sub6_Sub2 local662 = Static24.aClass4_Sub3_Sub6_Sub2Array2[local652.anInt736];
		if (local662 != null) {
			local42 = (local652.anInt760 * 4 - local662.anInt2255) / 2;
			@Pc(686) int local686 = (local652.anInt750 * 4 - local662.anInt2256) / 2;
			local662.method1558(local42 + arg0 * 4 + 48, local686 + 48 + (104 - arg1 + -local652.anInt750) * 4);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method568() {
		aClass60_379 = null;
		aClass60_381 = null;
		aClass60_384 = null;
		aClass60_377 = null;
		aClass60_376 = null;
		aClass60_383 = null;
		aClass60_382 = null;
		aClass60_374 = null;
		aClass60_375 = null;
		aClass60_380 = null;
		aClass45_7 = null;
		aClass60_378 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] method569() {
		@Pc(8) Class4_Sub3_Sub6_Sub3[] local8 = new Class4_Sub3_Sub6_Sub3[Static65.anInt1635];
		for (@Pc(10) int local10 = 0; local10 < Static65.anInt1635; local10++) {
			@Pc(20) Class4_Sub3_Sub6_Sub3 local20 = local8[local10] = new Class4_Sub3_Sub6_Sub3();
			local20.anInt2317 = Static5.anInt70;
			local20.anInt2313 = Static31.anInt910;
			local20.anInt2315 = Static2.anIntArray1[local10];
			local20.anInt2318 = Static29.anIntArray91[local10];
			local20.anInt2316 = Static125.anIntArray341[local10];
			local20.anInt2314 = Static113.anIntArray132[local10];
			@Pc(52) int local52 = local20.anInt2316 * local20.anInt2314;
			@Pc(56) byte[] local56 = Static56.aByteArrayArray7[local10];
			local20.anIntArray297 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray297[local62] = Static75.anIntArray125[local56[local62] & 0xFF];
			}
		}
		Static53.method866();
		return local8;
	}
}
