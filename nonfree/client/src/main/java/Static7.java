import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_77 = Static80.method1463("::gc");

	@OriginalMember(owner = "client!af", name = "vb", descriptor = "Lclient!mb;")
	public static Class49 aClass49_2 = new Class49(64);

	@OriginalMember(owner = "client!af", name = "wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_78 = Static80.method1463("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!af", name = "yb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_79 = Static80.method1463(":chalreq:");

	@OriginalMember(owner = "client!af", name = "Ab", descriptor = "Lclient!rd;")
	private static Class63 aClass63_81 = Static80.method1463("wave:");

	@OriginalMember(owner = "client!af", name = "zb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_80 = aClass63_81;

	@OriginalMember(owner = "client!af", name = "Bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_82 = aClass63_81;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIB)V")
	public static void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static76.aClass19_1.method689(arg2, arg0, arg1);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(67) int local67;
		if (local11 != 0) {
			local23 = Static76.aClass19_1.method697(arg2, arg0, arg1, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local49 = arg0 * 4 + (52736 - arg1 * 512) * 4 + 24624;
			local51 = arg4;
			if (local11 > 0) {
				local51 = arg3;
			}
			@Pc(61) int[] local61 = Static123.aClass6_Sub3_Sub3_Sub2_6.anIntArray221;
			local67 = local11 >> 14 & 0x7FFF;
			@Pc(71) Class6_Sub3_Sub10 local71 = Static123.method2172(local67);
			if (local71.anInt1695 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local29 == 0) {
						local61[local49] = local51;
						local61[local49 + 512] = local51;
						local61[local49 + 1024] = local51;
						local61[local49 + 1536] = local51;
					} else if (local29 == 1) {
						local61[local49] = local51;
						local61[local49 + 1] = local51;
						local61[local49 + 2] = local51;
						local61[local49 + 3] = local51;
					} else if (local29 == 2) {
						local61[local49 + 3] = local51;
						local61[local49 + 512 + 3] = local51;
						local61[local49 + 3 + 1024] = local51;
						local61[local49 + 1536 + 3] = local51;
					} else if (local29 == 3) {
						local61[local49 + 1536] = local51;
						local61[local49 + 1537] = local51;
						local61[local49 + 2 + 1536] = local51;
						local61[local49 + 3 + 1536] = local51;
					}
				}
				if (local33 == 3) {
					if (local29 == 0) {
						local61[local49] = local51;
					} else if (local29 == 1) {
						local61[local49 + 3] = local51;
					} else if (local29 == 2) {
						local61[local49 + 3 + 1536] = local51;
					} else if (local29 == 3) {
						local61[local49 + 1536] = local51;
					}
				}
				if (local33 == 2) {
					if (local29 == 3) {
						local61[local49] = local51;
						local61[local49 + 512] = local51;
						local61[local49 + 1024] = local51;
						local61[local49 + 1536] = local51;
					} else if (local29 == 0) {
						local61[local49] = local51;
						local61[local49 + 1] = local51;
						local61[local49 + 2] = local51;
						local61[local49 + 3] = local51;
					} else if (local29 == 1) {
						local61[local49 + 3] = local51;
						local61[local49 + 515] = local51;
						local61[local49 + 1027] = local51;
						local61[local49 + 1536 + 3] = local51;
					} else if (local29 == 2) {
						local61[local49 + 1536] = local51;
						local61[local49 + 1 + 1536] = local51;
						local61[local49 + 1538] = local51;
						local61[local49 + 3 + 1536] = local51;
					}
				}
			} else {
				@Pc(387) Class6_Sub3_Sub3_Sub3 local387 = Static69.aClass6_Sub3_Sub3_Sub3Array3[local71.anInt1695];
				if (local387 != null) {
					@Pc(400) int local400 = (local71.anInt1672 * 4 - local387.anInt2689) / 2;
					@Pc(411) int local411 = (local71.anInt1683 * 4 - local387.anInt2687) / 2;
					local387.method1768(arg0 * 4 + local400 + 48, local411 + (-local71.anInt1683 + -arg1 + 104) * 4 + 48);
				}
			}
		}
		local11 = Static76.aClass19_1.method690(arg2, arg0, arg1);
		if (local11 != 0) {
			local23 = Static76.aClass19_1.method697(arg2, arg0, arg1, local11);
			local29 = local23 >> 6 & 0x3;
			local33 = local23 & 0x1F;
			local51 = local11 >> 14 & 0x7FFF;
			@Pc(474) Class6_Sub3_Sub10 local474 = Static123.method2172(local51);
			@Pc(504) int local504;
			if (local474.anInt1695 != -1) {
				@Pc(574) Class6_Sub3_Sub3_Sub3 local574 = Static69.aClass6_Sub3_Sub3_Sub3Array3[local474.anInt1695];
				if (local574 != null) {
					local67 = (local474.anInt1672 * 4 - local574.anInt2689) / 2;
					local504 = (local474.anInt1683 * 4 - local574.anInt2687) / 2;
					local574.method1768(arg0 * 4 + local67 + 48, local504 + (104 - arg1 + -local474.anInt1683) * 4 + 48);
				}
			} else if (local33 == 9) {
				local49 = 15658734;
				@Pc(487) int[] local487 = Static123.aClass6_Sub3_Sub3_Sub2_6.anIntArray221;
				if (local11 > 0) {
					local49 = 15597568;
				}
				local504 = arg0 * 4 + (103 - arg1) * 2048 + 24624;
				if (local29 == 0 || local29 == 2) {
					local487[local504 + 1536] = local49;
					local487[local504 + 1 + 1024] = local49;
					local487[local504 + 512 + 2] = local49;
					local487[local504 + 3] = local49;
				} else {
					local487[local504] = local49;
					local487[local504 + 513] = local49;
					local487[local504 + 1024 + 2] = local49;
					local487[local504 + 3 + 1536] = local49;
				}
			}
		}
		local11 = Static76.aClass19_1.method694(arg2, arg0, arg1);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(637) Class6_Sub3_Sub10 local637 = Static123.method2172(local23);
		if (local637.anInt1695 == -1) {
			return;
		}
		@Pc(647) Class6_Sub3_Sub3_Sub3 local647 = Static69.aClass6_Sub3_Sub3_Sub3Array3[local637.anInt1695];
		if (local647 != null) {
			@Pc(660) int local660 = (local637.anInt1683 * 4 - local647.anInt2687) / 2;
			local51 = (local637.anInt1672 * 4 - local647.anInt2689) / 2;
			local647.method1768(local51 + arg0 * 4 + 48, local660 + (-arg1 + 104 + -local637.anInt1683) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method121() {
		aClass63_80 = null;
		aClass63_81 = null;
		aClass63_82 = null;
		aClass63_78 = null;
		aClass63_79 = null;
		aClass49_2 = null;
		aClass63_77 = null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method122() {
		Static106.aClass49_27.method1389();
	}
}
