import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!je", name = "Xc", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!je", name = "od", descriptor = "Lclient!da;")
	public static Class15 aClass15_38;

	@OriginalMember(owner = "client!je", name = "xd", descriptor = "I")
	public static int anInt1594;

	@OriginalMember(owner = "client!je", name = "Cd", descriptor = "Lclient!k;")
	public static Class33 aClass33_27;

	@OriginalMember(owner = "client!je", name = "Sc", descriptor = "I")
	public static int anInt1574 = 0;

	@OriginalMember(owner = "client!je", name = "Tc", descriptor = "Lclient!wb;")
	private static Class65 aClass65_716 = Static24.method441("Report abuse");

	@OriginalMember(owner = "client!je", name = "Uc", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!je", name = "ad", descriptor = "I")
	public static int anInt1580 = 1;

	@OriginalMember(owner = "client!je", name = "cd", descriptor = "Lclient!wb;")
	private static Class65 aClass65_717 = Static24.method441("Offline");

	@OriginalMember(owner = "client!je", name = "fd", descriptor = "Lclient!wb;")
	private static Class65 aClass65_718 = Static24.method441(" is already on your friend list");

	@OriginalMember(owner = "client!je", name = "hd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_719 = Static24.method441("mapdots");

	@OriginalMember(owner = "client!je", name = "ld", descriptor = "Lclient!wb;")
	public static Class65 aClass65_720 = Static24.method441("(Y");

	@OriginalMember(owner = "client!je", name = "td", descriptor = "Lclient!wb;")
	public static Class65 aClass65_721 = aClass65_718;

	@OriginalMember(owner = "client!je", name = "ud", descriptor = "Lclient!wb;")
	public static Class65 aClass65_722 = Static24.method441(": ");

	@OriginalMember(owner = "client!je", name = "vd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_723 = Static24.method441("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!je", name = "Ad", descriptor = "Lclient!wb;")
	public static Class65 aClass65_724 = aClass65_716;

	@OriginalMember(owner = "client!je", name = "Bd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_725 = aClass65_717;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!k;ZLclient!k;)V")
	public static void method927(@OriginalArg(1) Class33 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class33 arg2) {
		Static108.aClass33_44 = arg2;
		Static1.aBoolean1 = arg1;
		Static84.aClass33_37 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)Z")
	public static boolean method928() {
		@Pc(5) Class26 local5 = Static50.aClass26_1;
		synchronized (Static50.aClass26_1) {
			if (Static81.anInt2913 == Static110.anInt2938) {
				return false;
			} else {
				Static33.anInt2315 = Static76.anIntArray301[Static81.anInt2913];
				Static63.anInt1902 = Static5.anIntArray30[Static81.anInt2913];
				Static81.anInt2913 = Static81.anInt2913 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class2_Sub12 local15 = null;
		for (@Pc(20) Class2_Sub12 local20 = (Class2_Sub12) Static13.aClass52_3.method1587(); local20 != null; local20 = (Class2_Sub12) Static13.aClass52_3.method1588()) {
			if (arg7 == local20.anInt1702 && arg4 == local20.anInt1709 && arg2 == local20.anInt1698 && arg6 == local20.anInt1708) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class2_Sub12();
			local15.anInt1702 = arg7;
			local15.anInt1709 = arg4;
			local15.anInt1708 = arg6;
			local15.anInt1698 = arg2;
			Static33.method1408(local15);
			Static13.aClass52_3.method1593(local15);
		}
		local15.anInt1690 = arg1;
		local15.anInt1707 = arg0;
		local15.anInt1700 = arg3;
		local15.anInt1701 = arg5;
		local15.anInt1692 = arg8;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static67.aClass18_1.method581(arg4, arg1, arg2);
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(48) int local48;
		@Pc(54) int local54;
		if (local7 != 0) {
			local16 = Static67.aClass18_1.method620(arg4, arg1, arg2, local7);
			local22 = local16 >> 6 & 0x3;
			local26 = local16 & 0x1F;
			local28 = arg0;
			if (local7 > 0) {
				local28 = arg3;
			}
			@Pc(35) int[] local35 = Static90.aClass2_Sub1_Sub4_Sub2_6.anIntArray105;
			local48 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
			local54 = local7 >> 14 & 0x7FFF;
			@Pc(60) Class2_Sub1_Sub14 local60 = Static29.method518(local54);
			if (local60.anInt2642 == -1) {
				if (local26 == 0 || local26 == 2) {
					if (local22 == 0) {
						local35[local48] = local28;
						local35[local48 + 512] = local28;
						local35[local48 + 1024] = local28;
						local35[local48 + 1536] = local28;
					} else if (local22 == 1) {
						local35[local48] = local28;
						local35[local48 + 1] = local28;
						local35[local48 + 2] = local28;
						local35[local48 + 3] = local28;
					} else if (local22 == 2) {
						local35[local48 + 3] = local28;
						local35[local48 + 3 + 512] = local28;
						local35[local48 + 1024 + 3] = local28;
						local35[local48 + 3 + 1536] = local28;
					} else if (local22 == 3) {
						local35[local48 + 1536] = local28;
						local35[local48 + 1536 + 1] = local28;
						local35[local48 + 1536 + 2] = local28;
						local35[local48 + 1536 + 3] = local28;
					}
				}
				if (local26 == 3) {
					if (local22 == 0) {
						local35[local48] = local28;
					} else if (local22 == 1) {
						local35[local48 + 3] = local28;
					} else if (local22 == 2) {
						local35[local48 + 1536 + 3] = local28;
					} else if (local22 == 3) {
						local35[local48 + 1536] = local28;
					}
				}
				if (local26 == 2) {
					if (local22 == 3) {
						local35[local48] = local28;
						local35[local48 + 512] = local28;
						local35[local48 + 1024] = local28;
						local35[local48 + 1536] = local28;
					} else if (local22 == 0) {
						local35[local48] = local28;
						local35[local48 + 1] = local28;
						local35[local48 + 2] = local28;
						local35[local48 + 3] = local28;
					} else if (local22 == 1) {
						local35[local48 + 3] = local28;
						local35[local48 + 3 + 512] = local28;
						local35[local48 + 3 + 1024] = local28;
						local35[local48 + 1539] = local28;
					} else if (local22 == 2) {
						local35[local48 + 1536] = local28;
						local35[local48 + 1536 + 1] = local28;
						local35[local48 + 2 + 1536] = local28;
						local35[local48 + 1539] = local28;
					}
				}
			} else {
				@Pc(386) Class2_Sub1_Sub4_Sub3 local386 = Static33.aClass2_Sub1_Sub4_Sub3Array6[local60.anInt2642];
				if (local386 != null) {
					@Pc(398) int local398 = (local60.anInt2621 * 4 - local386.anInt2448) / 2;
					@Pc(409) int local409 = (local60.anInt2634 * 4 - local386.anInt2450) / 2;
					local386.method1479(arg1 * 4 + local398 + 48, local409 + 48 + (-local60.anInt2634 + -arg2 + 104) * 4);
				}
			}
		}
		local7 = Static67.aClass18_1.method592(arg4, arg1, arg2);
		if (local7 != 0) {
			local28 = local7 >> 14 & 0x7FFF;
			local16 = Static67.aClass18_1.method620(arg4, arg1, arg2, local7);
			local22 = local16 >> 6 & 0x3;
			local26 = local16 & 0x1F;
			@Pc(473) Class2_Sub1_Sub14 local473 = Static29.method518(local28);
			@Pc(505) int local505;
			if (local473.anInt2642 != -1) {
				@Pc(482) Class2_Sub1_Sub4_Sub3 local482 = Static33.aClass2_Sub1_Sub4_Sub3Array6[local473.anInt2642];
				if (local482 != null) {
					local54 = (local473.anInt2621 * 4 - local482.anInt2448) / 2;
					local505 = (local473.anInt2634 * 4 - local482.anInt2450) / 2;
					local482.method1479(local54 + arg1 * 4 + 48, (-local473.anInt2634 + (104 - arg2)) * 4 + 48 + local505);
				}
			} else if (local26 == 9) {
				@Pc(537) int[] local537 = Static90.aClass2_Sub1_Sub4_Sub2_6.anIntArray105;
				local48 = 15658734;
				if (local7 > 0) {
					local48 = 15597568;
				}
				local505 = arg1 * 4 + (-arg2 + 103) * 512 * 4 + 24624;
				if (local22 == 0 || local22 == 2) {
					local537[local505 + 1536] = local48;
					local537[local505 + 1 + 1024] = local48;
					local537[local505 + 2 + 512] = local48;
					local537[local505 + 3] = local48;
				} else {
					local537[local505] = local48;
					local537[local505 + 512 + 1] = local48;
					local537[local505 + 1024 + 2] = local48;
					local537[local505 + 1536 + 3] = local48;
				}
			}
		}
		local7 = Static67.aClass18_1.method608(arg4, arg1, arg2);
		if (local7 == 0) {
			return;
		}
		local16 = local7 >> 14 & 0x7FFF;
		@Pc(650) Class2_Sub1_Sub14 local650 = Static29.method518(local16);
		if (local650.anInt2642 == -1) {
			return;
		}
		@Pc(660) Class2_Sub1_Sub4_Sub3 local660 = Static33.aClass2_Sub1_Sub4_Sub3Array6[local650.anInt2642];
		if (local660 != null) {
			local28 = (local650.anInt2621 * 4 - local660.anInt2448) / 2;
			@Pc(684) int local684 = (local650.anInt2634 * 4 - local660.anInt2450) / 2;
			local660.method1479(arg1 * 4 + local28 + 48, local684 + (-local650.anInt2634 + 104 + -arg2) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	public static void method932() {
		aClass65_721 = null;
		aClass65_724 = null;
		aClass65_718 = null;
		aClass65_719 = null;
		aLongArray6 = null;
		aClass33_27 = null;
		aClass65_725 = null;
		aClass65_722 = null;
		aClass65_716 = null;
		aClass65_723 = null;
		aClass65_717 = null;
		aClass65_720 = null;
		aClass15_38 = null;
	}
}
