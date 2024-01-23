import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "Lclient!ld;")
	public static Class67 aClass67_5;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
	public static int anInt3125;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "Lclient!mb;")
	public static Class70 aClass70_31;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Z")
	public static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1104 = Static64.method1101("");

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1105 = Static64.method1101("Loading)3)3)3");

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	public static int anInt3128 = 0;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1106 = aClass51_1105;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ad;I)V")
	public static void method2481(@OriginalArg(0) Class5_Sub1 arg0) {
		if (Static109.anInt2430 == arg0.anInt3578 || arg0.anInt3585 == -1 || arg0.anInt3599 != 0 || arg0.anInt3595 + 1 > Static32.method546(arg0.anInt3585).anIntArray76[arg0.anInt3576]) {
			@Pc(38) int local38 = arg0.anInt3578 - arg0.anInt3610;
			@Pc(44) int local44 = Static109.anInt2430 - arg0.anInt3610;
			@Pc(54) int local54 = arg0.anInt3615 * 128 + arg0.anInt3584 * 64;
			@Pc(64) int local64 = arg0.anInt3584 * 64 + arg0.anInt3608 * 128;
			@Pc(74) int local74 = arg0.anInt3584 * 64 + arg0.anInt3590 * 128;
			arg0.anInt3624 = (local54 * (local38 - local44) + local44 * local64) / local38;
			@Pc(98) int local98 = arg0.anInt3602 * 128 + arg0.anInt3584 * 64;
			arg0.anInt3598 = (local98 * local44 + (local38 - local44) * local74) / local38;
		}
		arg0.anInt3589 = 0;
		if (arg0.anInt3586 == 0) {
			arg0.anInt3581 = 1024;
		}
		if (arg0.anInt3586 == 1) {
			arg0.anInt3581 = 1536;
		}
		if (arg0.anInt3586 == 2) {
			arg0.anInt3581 = 0;
		}
		if (arg0.anInt3586 == 3) {
			arg0.anInt3581 = 512;
		}
		arg0.anInt3575 = arg0.anInt3581;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
	public static void method2482(@OriginalArg(1) int arg0) {
		if (Static47.anInt1142 == arg0) {
			return;
		}
		@Pc(31) boolean local31 = arg0 == 5 || arg0 == 8 || arg0 == 10;
		if (Static47.anInt1142 == 0) {
			Static189.method3165();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static221.anInt4654 = 0;
			Static188.anInt4068 = 0;
			Static77.anInt1721 = -4;
			Static16.anInt386 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static128.aClass11_43 != null) {
			Static128.aClass11_43.method271();
			Static128.aClass11_43 = null;
		}
		if (arg0 == 25) {
			Static98.anInt2136 = 0;
			Static227.anInt4786 = 1;
			Static11.anInt235 = 0;
			Static50.anInt1201 = 0;
			Static184.anInt3991 = 1;
			Static18.method383();
		}
		if (arg0 == 5) {
			Static110.method1053(Static77.aClass70_Sub1_20);
		} else {
			method2485();
		}
		@Pc(119) boolean local119 = Static47.anInt1142 == 5 || Static47.anInt1142 == 8 || Static47.anInt1142 == 10 || Static47.anInt1142 == 28;
		if (local119 != local31) {
			if (local31) {
				Static69.anInt1577 = Static140.anInt3107;
				if (Static155.anInt3424 == 0) {
					Static226.method3703();
				} else {
					Static185.method3104(Static8.aClass70_Sub1_3, Static140.anInt3107, 255);
				}
				Static95.method1603(false);
			} else {
				Static226.method3703();
				Static95.method1603(true);
			}
		}
		if (arg0 == 8) {
			arg0 = Static79.method1379();
		}
		Static47.anInt1142 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!ad;)V")
	public static void method2483(@OriginalArg(1) Class5_Sub1 arg0) {
		if (arg0.anInt3601 == 0) {
			return;
		}
		@Pc(44) int local44;
		@Pc(37) int local37;
		if (arg0.anInt3621 != -1 && arg0.anInt3621 < 32768) {
			@Pc(28) Class5_Sub1_Sub2 local28 = Static168.aClass5_Sub1_Sub2Array1[arg0.anInt3621];
			if (local28 != null) {
				local37 = arg0.anInt3598 - local28.anInt3598;
				local44 = arg0.anInt3624 - local28.anInt3624;
				if (local44 != 0 || local37 != 0) {
					arg0.anInt3581 = (int) (Math.atan2((double) local44, (double) local37) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.anInt3621 >= 32768) {
			local44 = arg0.anInt3621 - 32768;
			if (local44 == Static228.anInt4794) {
				local44 = 2047;
			}
			@Pc(90) Class5_Sub1_Sub1 local90 = Static191.aClass5_Sub1_Sub1Array1[local44];
			if (local90 != null) {
				@Pc(99) int local99 = arg0.anInt3624 - local90.anInt3624;
				@Pc(106) int local106 = arg0.anInt3598 - local90.anInt3598;
				if (local99 != 0 || local106 != 0) {
					arg0.anInt3581 = (int) (Math.atan2((double) local99, (double) local106) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3630 != 0 || arg0.anInt3614 != 0) && (arg0.anInt3603 == 0 || arg0.anInt3589 > 0)) {
			local44 = arg0.anInt3584 * 64 + arg0.anInt3624 - (-Static198.anInt4217 + arg0.anInt3630 + -Static198.anInt4217) * 64 - 64;
			local37 = arg0.anInt3598 + arg0.anInt3584 * 64 - (arg0.anInt3614 - Static118.anInt2541 - Static118.anInt2541) * 64 - 64;
			if (local44 != 0 || local37 != 0) {
				arg0.anInt3581 = (int) (Math.atan2((double) local44, (double) local37) * 325.949D) & 0x7FF;
			}
			arg0.anInt3630 = 0;
			arg0.anInt3614 = 0;
		}
		local44 = arg0.anInt3581 - arg0.anInt3575 & 0x7FF;
		if (local44 == 0) {
			arg0.anInt3596 = 0;
			return;
		}
		arg0.anInt3596++;
		@Pc(236) boolean local236;
		if (local44 <= 1024) {
			arg0.anInt3575 += arg0.anInt3601;
			local236 = true;
			if (local44 < arg0.anInt3601 || local44 > 2048 - arg0.anInt3601) {
				local236 = false;
				arg0.anInt3575 = arg0.anInt3581;
			}
			if (arg0.anInt3618 == arg0.anInt3620 && (arg0.anInt3596 > 25 || local236)) {
				if (arg0.anInt3625 == -1) {
					arg0.anInt3620 = arg0.anInt3600;
				} else {
					arg0.anInt3620 = arg0.anInt3625;
				}
			}
		} else {
			arg0.anInt3575 -= arg0.anInt3601;
			local236 = true;
			if (arg0.anInt3601 > local44 || local44 > 2048 - arg0.anInt3601) {
				arg0.anInt3575 = arg0.anInt3581;
				local236 = false;
			}
			if (arg0.anInt3620 == arg0.anInt3618 && (arg0.anInt3596 > 25 || local236)) {
				if (arg0.anInt3580 == -1) {
					arg0.anInt3620 = arg0.anInt3600;
				} else {
					arg0.anInt3620 = arg0.anInt3580;
				}
			}
		}
		arg0.anInt3575 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	public static void method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static50.anInt1202 > 0) {
			Static152.method2614(Static50.anInt1202);
			Static50.anInt1202 = 0;
		}
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = arg0 * Static96.anInt2126;
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 1; local34 < 255; local34++) {
			@Pc(47) int local47 = Static177.anIntArray297[local34] * (256 - local34) / 256;
			if (local47 < 0) {
				local47 = 0;
			}
			local26 += local47;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = local47; local57 < 128; local57++) {
				local64 = Static206.anIntArray329[local26++];
				@Pc(71) int local71 = Static96.anIntArray137[local30++ + arg1];
				if (local64 == 0) {
					Static168.aClass1_Sub2_Sub1_Sub1_1.anIntArray157[local32++] = local71;
				} else {
					@Pc(80) int local80 = 256 - local64 - 18;
					if (local80 > 255) {
						local80 = 255;
					}
					@Pc(89) int local89 = local64 + 18;
					local64 = Static88.anIntArray127[local64];
					if (local89 > 255) {
						local89 = 255;
					}
					Static168.aClass1_Sub2_Sub1_Sub1_1.anIntArray157[local32++] = ((local64 & 0xFF00FF) * local89 + (local71 & 0xFF00FF) * local80 & 0xFF00FF00) + (local89 * (local64 & 0xFF00) + (local71 & 0xFF00) * local80 & 0xFF0000) >> 8;
				}
			}
			for (local64 = 0; local64 < local47; local64++) {
				Static168.aClass1_Sub2_Sub1_Sub1_1.anIntArray157[local32++] = Static96.anIntArray137[arg1 + local30++];
			}
			local30 += Static96.anInt2126 - 128;
		}
		Static168.aClass1_Sub2_Sub1_Sub1_1.method2067(arg1, arg0);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	private static void method2485() {
		if (Static151.aBoolean157) {
			Static146.aClass41_2 = null;
			Static151.aBoolean157 = false;
			Static118.aClass1_Sub2_Sub1_4 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)I")
	public static int method2486(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
