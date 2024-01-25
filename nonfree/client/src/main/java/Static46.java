import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[Lclient!qj;")
	public static final Class169[] aClass169Array1 = new Class169[6];

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!kr;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBILclient!ja;Lclient!fb;I)V")
	public static void method771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class81 arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class80 local12 = Static152.method3077(arg3.anInt1478);
		if (local12.anInt1736 == -1) {
			return;
		}
		if (arg3.aBoolean98) {
			@Pc(29) int local29 = arg4 + arg3.anInt1470;
			arg4 = local29 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(43) Class40 local43 = local12.method1721(arg3.aBoolean109, arg4, arg2);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg3.anInt1489;
		@Pc(52) int local52 = arg3.lb;
		if ((arg4 & 0x1) == 1) {
			local52 = arg3.anInt1489;
			local49 = arg3.lb;
		}
		@Pc(68) int local68 = local43.method5083();
		@Pc(71) int local71 = local43.method5084();
		if (local12.aBoolean128) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local12.anInt1743 == 0) {
			local43.method5073(arg1, arg0 + 4 - local52 * 4, local68, local71);
		} else {
			local43.method5082(arg1, arg0 + 4 - local52 * 4, local68, local71, 1, local12.anInt1743 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg4 && arg0 == arg3 && arg7 == arg2 && arg6 == arg1) {
			Static228.method4084(arg0, arg1, arg5, arg8, arg7);
			return;
		}
		@Pc(29) int local29 = arg5;
		@Pc(31) int local31 = arg0;
		@Pc(35) int local35 = arg5 * 3;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(43) int local43 = arg4 * 3;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg2 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(65) int local65 = arg7 + local43 - local51 - arg5;
		@Pc(75) int local75 = local47 + arg1 - arg0 - local55;
		@Pc(85) int local85 = local35 + local51 - local43 - local43;
		@Pc(95) int local95 = local55 + local39 - local47 - local47;
		@Pc(100) int local100 = local43 - local35;
		@Pc(105) int local105 = local47 - local39;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local115 * local107 >> 12;
			@Pc(125) int local125 = local121 * local65;
			@Pc(129) int local129 = local121 * local75;
			@Pc(133) int local133 = local115 * local85;
			@Pc(137) int local137 = local95 * local115;
			@Pc(141) int local141 = local107 * local100;
			@Pc(145) int local145 = local107 * local105;
			@Pc(157) int local157 = (local125 + local133 + local141 >> 12) + arg5;
			@Pc(168) int local168 = (local137 + local129 + local145 >> 12) + arg0;
			Static228.method4084(local31, local168, local29, arg8, local157);
			local29 = local157;
			local31 = local168;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
	public static boolean method773() {
		return Static189.anInt3601 != 0 || Static115.anInt2157 >= 2;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public static void method775(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub2_Sub8 local12 = Static239.method5786(2, arg0);
		local12.method2645();
	}
}
