import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "Lclient!pc;")
	public static Class63 aClass63_4;

	@OriginalMember(owner = "client!gf", name = "hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "Lclient!dh;")
	public static Class18 aClass18_7 = new Class18(4096);

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_627 = Static51.method932("<col=ffb000>");

	@OriginalMember(owner = "client!gf", name = "lb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_632 = Static51.method932("wishes to trade with you)3");

	@OriginalMember(owner = "client!gf", name = "gb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_628 = aClass10_632;

	@OriginalMember(owner = "client!gf", name = "ib", descriptor = "Lclient!cd;")
	private static Class10 aClass10_629 = Static51.method932("Loading fonts )2 ");

	@OriginalMember(owner = "client!gf", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_630 = Static51.method932("<)4col>");

	@OriginalMember(owner = "client!gf", name = "kb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_631 = aClass10_629;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
	public static void method1066() {
		aClass10_630 = null;
		aClass63_4 = null;
		aClass10_629 = null;
		aClass18_7 = null;
		anObject3 = null;
		aClass10_627 = null;
		aClass10_632 = null;
		aClass10_631 = null;
		aByteArrayArrayArray5 = null;
		aClass10_628 = null;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 method1067() {
		@Pc(14) Class2_Sub1_Sub4_Sub2 local14 = new Class2_Sub1_Sub4_Sub2();
		@Pc(18) byte[] local18 = Static115.aByteArrayArray9[0];
		local14.anInt889 = Static171.anInt3704;
		local14.anInt888 = Static14.anIntArray26[0];
		local14.anInt891 = Static148.anInt3209;
		local14.anInt893 = Static68.anIntArray178[0];
		local14.anInt892 = Static98.anIntArray240[0];
		local14.anInt890 = Static96.anIntArray401[0];
		@Pc(50) int local50 = local14.anInt893 * local14.anInt892;
		local14.anIntArray71 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local14.anIntArray71[local56] = Static118.anIntArray284[local18[local56] & 0xFF];
		}
		Static155.method2394();
		return local14;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
	public static void method1068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static180.aClass60_1.method1785(arg1, arg3, arg0);
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(71) int local71;
		@Pc(55) int local55;
		if (local15 != 0) {
			local27 = Static180.aClass60_1.method1803(arg1, arg3, arg0, local15);
			local29 = arg2;
			local33 = local27 & 0x1F;
			if (local15 > 0) {
				local29 = arg4;
			}
			local46 = local27 >> 6 & 0x3;
			@Pc(49) int[] local49 = Static128.aClass2_Sub1_Sub4_Sub2_34.anIntArray71;
			local55 = local15 >> 14 & 0x7FFF;
			local71 = arg3 * 4 + (-(arg0 * 512) + 52736) * 4 + 24624;
			@Pc(75) Class2_Sub1_Sub10 local75 = Static62.method1106(local55);
			if (local75.anInt2234 == -1) {
				if (local33 == 0 || local33 == 2) {
					if (local46 == 0) {
						local49[local71] = local29;
						local49[local71 + 512] = local29;
						local49[local71 + 1024] = local29;
						local49[local71 + 1536] = local29;
					} else if (local46 == 1) {
						local49[local71] = local29;
						local49[local71 + 1] = local29;
						local49[local71 + 2] = local29;
						local49[local71 + 3] = local29;
					} else if (local46 == 2) {
						local49[local71 + 3] = local29;
						local49[local71 + 512 + 3] = local29;
						local49[local71 + 1024 + 3] = local29;
						local49[local71 + 1536 + 3] = local29;
					} else if (local46 == 3) {
						local49[local71 + 1536] = local29;
						local49[local71 + 1536 + 1] = local29;
						local49[local71 + 1538] = local29;
						local49[local71 + 3 + 1536] = local29;
					}
				}
				if (local33 == 3) {
					if (local46 == 0) {
						local49[local71] = local29;
					} else if (local46 == 1) {
						local49[local71 + 3] = local29;
					} else if (local46 == 2) {
						local49[local71 + 1536 + 3] = local29;
					} else if (local46 == 3) {
						local49[local71 + 1536] = local29;
					}
				}
				if (local33 == 2) {
					if (local46 == 3) {
						local49[local71] = local29;
						local49[local71 + 512] = local29;
						local49[local71 + 1024] = local29;
						local49[local71 + 1536] = local29;
					} else if (local46 == 0) {
						local49[local71] = local29;
						local49[local71 + 1] = local29;
						local49[local71 + 2] = local29;
						local49[local71 + 3] = local29;
					} else if (local46 == 1) {
						local49[local71 + 3] = local29;
						local49[local71 + 512 + 3] = local29;
						local49[local71 + 3 + 1024] = local29;
						local49[local71 + 1539] = local29;
					} else if (local46 == 2) {
						local49[local71 + 1536] = local29;
						local49[local71 + 1 + 1536] = local29;
						local49[local71 + 2 + 1536] = local29;
						local49[local71 + 3 + 1536] = local29;
					}
				}
			} else {
				@Pc(399) Class2_Sub1_Sub4_Sub3 local399 = Static41.aClass2_Sub1_Sub4_Sub3Array10[local75.anInt2234];
				if (local399 != null) {
					@Pc(412) int local412 = (local75.anInt2225 * 4 - local399.anInt2635) / 2;
					@Pc(423) int local423 = (local75.anInt2210 * 4 - local399.anInt2632) / 2;
					local399.method1874(arg3 * 4 + local412 + 48, local423 + (-local75.anInt2210 + -arg0 + 104) * 4 + 48);
				}
			}
		}
		local15 = Static180.aClass60_1.method1819(arg1, arg3, arg0);
		if (local15 != 0) {
			local27 = Static180.aClass60_1.method1803(arg1, arg3, arg0, local15);
			local46 = local27 >> 6 & 0x3;
			local29 = local15 >> 14 & 0x7FFF;
			local33 = local27 & 0x1F;
			@Pc(482) Class2_Sub1_Sub10 local482 = Static62.method1106(local29);
			@Pc(514) int local514;
			if (local482.anInt2234 != -1) {
				@Pc(491) Class2_Sub1_Sub4_Sub3 local491 = Static41.aClass2_Sub1_Sub4_Sub3Array10[local482.anInt2234];
				if (local491 != null) {
					local55 = (local482.anInt2225 * 4 - local491.anInt2635) / 2;
					local514 = (local482.anInt2210 * 4 - local491.anInt2632) / 2;
					local491.method1874(local55 + arg3 * 4 + 48, (104 - arg0 - local482.anInt2210) * 4 + 48 - -local514);
				}
			} else if (local33 == 9) {
				local71 = 15658734;
				@Pc(546) int[] local546 = Static128.aClass2_Sub1_Sub4_Sub2_34.anIntArray71;
				if (local15 > 0) {
					local71 = 15597568;
				}
				local514 = arg3 * 4 + (52736 - arg0 * 512) * 4 + 24624;
				if (local46 == 0 || local46 == 2) {
					local546[local514 + 1536] = local71;
					local546[local514 + 1 + 1024] = local71;
					local546[local514 + 514] = local71;
					local546[local514 + 3] = local71;
				} else {
					local546[local514] = local71;
					local546[local514 + 513] = local71;
					local546[local514 + 1024 + 2] = local71;
					local546[local514 + 3 + 1536] = local71;
				}
			}
		}
		local15 = Static180.aClass60_1.method1784(arg1, arg3, arg0);
		if (local15 == 0) {
			return;
		}
		local27 = local15 >> 14 & 0x7FFF;
		@Pc(651) Class2_Sub1_Sub10 local651 = Static62.method1106(local27);
		if (local651.anInt2234 == -1) {
			return;
		}
		@Pc(661) Class2_Sub1_Sub4_Sub3 local661 = Static41.aClass2_Sub1_Sub4_Sub3Array10[local651.anInt2234];
		if (local661 != null) {
			@Pc(673) int local673 = (local651.anInt2210 * 4 - local661.anInt2632) / 2;
			local29 = (local651.anInt2225 * 4 - local661.anInt2635) / 2;
			local661.method1874(arg3 * 4 + local29 + 48, 48 - -((-arg0 + 104 - local651.anInt2210) * 4) - -local673);
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ke;IZIZI)V")
	public static void method1069(@OriginalArg(0) Class2_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static48.anInt1160 >= 50 || (arg0.anIntArray215 == null || arg4 >= arg0.anIntArray215.length)) {
			return;
		}
		@Pc(21) int local21 = arg0.anIntArray215[arg4];
		if (local21 == 0) {
			return;
		}
		@Pc(28) int local28 = local21 >> 8;
		@Pc(39) int local39 = local21 >> 4 & 0x7;
		@Pc(43) int local43 = local21 & 0xF;
		if (local43 == 0) {
			if (arg2) {
				Static179.method2709(local39, 0, local28);
			}
		} else if (Static180.anInt3818 != 0) {
			Static59.anIntArray169[Static48.anInt1160] = local28;
			@Pc(72) int local72 = (arg3 - 64) / 128;
			@Pc(78) int local78 = (arg1 - 64) / 128;
			Static110.anIntArray256[Static48.anInt1160] = local39;
			Static28.anIntArray62[Static48.anInt1160] = 0;
			Static26.aClass57Array1[Static48.anInt1160] = null;
			Static106.anIntArray250[Static48.anInt1160] = local43 + (local78 << 16) + (local72 << 8);
			Static48.anInt1160++;
		}
	}
}
