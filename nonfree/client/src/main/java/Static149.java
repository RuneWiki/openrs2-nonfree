import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1313 = Static120.method1824("Players");

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1311 = aClass80_1313;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1312 = Static120.method1824("<img=1>");

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
	public static int anInt3347 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg1 && arg8 == arg2 && arg7 == arg4 && arg0 == arg5) {
			Static130.method1959(arg5, arg8, arg4, arg1, arg3);
			return;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg1 * 3;
		@Pc(39) int local39 = arg8;
		@Pc(43) int local43 = arg2 * 3;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg0 * 3;
		@Pc(59) int local59 = arg8 * 3;
		@Pc(68) int local68 = local47 + arg4 - local51 - arg1;
		@Pc(79) int local79 = arg5 + local43 - arg8 - local55;
		@Pc(90) int local90 = local55 + local59 - local43 - local43;
		@Pc(95) int local95 = local47 - local37;
		@Pc(104) int local104 = local37 + local51 - local47 - local47;
		@Pc(109) int local109 = local43 - local59;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local125 * local79;
			@Pc(133) int local133 = local104 * local119;
			@Pc(137) int local137 = local119 * local90;
			@Pc(141) int local141 = local95 * local111;
			@Pc(145) int local145 = local125 * local68;
			@Pc(149) int local149 = local111 * local109;
			@Pc(160) int local160 = arg1 + (local133 + local145 + local141 >> 12);
			@Pc(171) int local171 = (local149 + local129 + local137 >> 12) + arg8;
			Static130.method1959(local171, local39, local160, local33, arg3);
			local33 = local160;
			local39 = local171;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBII)V")
	public static void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static46.method726(arg0, arg2, Static96.anIntArrayArray27[arg1], arg3);
		} else {
			Static46.method726(arg3, arg2, Static96.anIntArrayArray27[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!bc;IBLclient!bc;)Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 method2390(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1 arg3) {
		return Static15.method244(arg0, arg2, arg1) ? Static78.method1194(arg3.method60(arg0, arg2)) : null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLclient!oh;)V")
	public static void method2391(@OriginalArg(1) Class3_Sub1_Sub5_Sub4 arg0) {
		arg0.anInt4293 = 0;
		@Pc(8) int local8 = arg0.anInt4325 - Static193.anInt4411;
		if (arg0.anInt4274 == 0) {
			arg0.anInt4309 = 1024;
		}
		if (arg0.anInt4274 == 1) {
			arg0.anInt4309 = 1536;
		}
		if (arg0.anInt4274 == 2) {
			arg0.anInt4309 = 0;
		}
		@Pc(47) int local47 = arg0.anInt4277 * 64 + arg0.anInt4319 * 128;
		if (arg0.anInt4274 == 3) {
			arg0.anInt4309 = 512;
		}
		@Pc(66) int local66 = arg0.anInt4277 * 64 + arg0.anInt4316 * 128;
		arg0.anInt4329 += (local47 - arg0.anInt4329) / local8;
		arg0.anInt4315 += (local66 - arg0.anInt4315) / local8;
	}
}
