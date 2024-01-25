import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "[I")
	public static int[] anIntArray744;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_177 = new Class263(82, -2);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg6 == arg0 && arg5 == arg8 && arg1 == arg3) {
			Static217.method3382(arg4, arg1, arg8, arg7, arg0);
			return;
		}
		@Pc(33) int local33 = arg4;
		@Pc(35) int local35 = arg0;
		@Pc(39) int local39 = arg4 * 3;
		@Pc(43) int local43 = arg0 * 3;
		@Pc(47) int local47 = arg2 * 3;
		@Pc(51) int local51 = arg6 * 3;
		@Pc(55) int local55 = arg5 * 3;
		@Pc(59) int local59 = arg3 * 3;
		@Pc(68) int local68 = local47 + arg8 - local55 - arg4;
		@Pc(78) int local78 = arg1 + local51 - arg0 - local59;
		@Pc(88) int local88 = local39 + local55 - local47 - local47;
		@Pc(97) int local97 = local59 + local43 - local51 - local51;
		@Pc(102) int local102 = local47 - local39;
		@Pc(107) int local107 = local51 - local43;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(116) int local116 = local109 * local109 >> 12;
			@Pc(122) int local122 = local109 * local116 >> 12;
			@Pc(126) int local126 = local68 * local122;
			@Pc(130) int local130 = local122 * local78;
			@Pc(134) int local134 = local116 * local88;
			@Pc(138) int local138 = local116 * local97;
			@Pc(142) int local142 = local109 * local102;
			@Pc(146) int local146 = local107 * local109;
			@Pc(157) int local157 = arg4 + (local134 + local126 + local142 >> 12);
			@Pc(168) int local168 = arg0 + (local146 + local130 + local138 >> 12);
			Static217.method3382(local33, local168, local157, arg7, local35);
			local35 = local168;
			local33 = local157;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZII)V")
	public static void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg2, 4);
		local8.method2957();
		local8.anInt3823 = arg1;
		local8.anInt3820 = arg3;
		local8.anInt3819 = arg0;
	}
}
