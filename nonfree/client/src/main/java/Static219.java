import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!pd;")
	public static final Class270 aClass270_3 = new Class270();

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
	public static int anInt3472 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg6 && arg4 == arg0 && arg3 == arg1 && arg5 == arg2) {
			Static277.method3848(arg4, arg2, arg3, arg6, arg7);
			return;
		}
		@Pc(30) int local30 = arg6;
		@Pc(32) int local32 = arg4;
		@Pc(36) int local36 = arg6 * 3;
		@Pc(40) int local40 = arg4 * 3;
		@Pc(44) int local44 = arg8 * 3;
		@Pc(48) int local48 = arg0 * 3;
		@Pc(52) int local52 = arg1 * 3;
		@Pc(56) int local56 = arg5 * 3;
		@Pc(67) int local67 = arg3 + local44 - arg6 - local52;
		@Pc(78) int local78 = arg2 + local48 - arg4 - local56;
		@Pc(86) int local86 = local52 + local36 - local44 - local44;
		@Pc(95) int local95 = local40 + local56 - local48 - local48;
		@Pc(100) int local100 = local44 - local36;
		@Pc(105) int local105 = local48 - local40;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(114) int local114 = local107 * local107 >> 12;
			@Pc(120) int local120 = local107 * local114 >> 12;
			@Pc(124) int local124 = local67 * local120;
			@Pc(128) int local128 = local120 * local78;
			@Pc(132) int local132 = local86 * local114;
			@Pc(136) int local136 = local95 * local114;
			@Pc(140) int local140 = local100 * local107;
			@Pc(144) int local144 = local107 * local105;
			@Pc(156) int local156 = (local124 + local132 + local140 >> 12) + arg6;
			@Pc(167) int local167 = arg4 + (local144 + local136 + local128 >> 12);
			Static277.method3848(local32, local167, local156, local30, arg7);
			local30 = local156;
			local32 = local167;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZIII)I")
	public static int method3106(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray497.length) {
			return local8.anIntArray497[arg1];
		} else {
			return -1;
		}
	}
}
