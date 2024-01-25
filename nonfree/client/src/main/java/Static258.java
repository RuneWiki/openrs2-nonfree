import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	public static int anInt4728;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_85 = new Class36(64, 2);

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method3601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg6 == arg8 && arg2 == arg0 && arg3 == arg4) {
			Static390.method5263(arg7, arg6, arg3, arg5, arg2);
			return;
		}
		@Pc(19) int local19 = arg5;
		@Pc(21) int local21 = arg6;
		@Pc(25) int local25 = arg5 * 3;
		@Pc(29) int local29 = arg6 * 3;
		@Pc(33) int local33 = arg1 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg0 * 3;
		@Pc(45) int local45 = arg4 * 3;
		@Pc(54) int local54 = local33 + arg2 - arg5 - local41;
		@Pc(65) int local65 = arg3 + local37 - arg6 - local45;
		@Pc(74) int local74 = local41 + local25 - local33 - local33;
		@Pc(84) int local84 = local29 + local45 - local37 - local37;
		@Pc(89) int local89 = local33 - local25;
		@Pc(94) int local94 = local37 - local29;
		for (@Pc(96) int local96 = 128; local96 <= 4096; local96 += 128) {
			@Pc(104) int local104 = local96 * local96 >> 12;
			@Pc(110) int local110 = local96 * local104 >> 12;
			@Pc(114) int local114 = local110 * local54;
			@Pc(118) int local118 = local110 * local65;
			@Pc(122) int local122 = local74 * local104;
			@Pc(126) int local126 = local84 * local104;
			@Pc(130) int local130 = local96 * local89;
			@Pc(134) int local134 = local94 * local96;
			@Pc(145) int local145 = (local130 + local114 + local122 >> 12) + arg5;
			@Pc(155) int local155 = arg6 + (local134 + local118 + local126 >> 12);
			Static390.method5263(arg7, local21, local155, local19, local145);
			local21 = local155;
			local19 = local145;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIII)V")
	public static void method3605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 11);
		local8.method2762();
		local8.anInt3611 = arg1;
		local8.anInt3610 = arg2;
	}
}
