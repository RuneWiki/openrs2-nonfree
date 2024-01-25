import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_41 = new Class316(31, -1);

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "Lclient!of;")
	public static final Class230 aClass230_23 = new Class230(8, 3);

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Z")
	public static final boolean aBoolean281 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!jr;)Lclient!aq;")
	public static Class18 method2971(@OriginalArg(1) Class6_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method6019();
		@Pc(16) Class114 local16 = Static551.method7703()[arg0.method6019()];
		@Pc(23) Class72 local23 = Static574.method4158()[arg0.method6019()];
		@Pc(27) int local27 = arg0.method6023();
		@Pc(31) int local31 = arg0.method6023();
		@Pc(35) int local35 = arg0.method6044();
		@Pc(39) int local39 = arg0.method6044();
		@Pc(43) int local43 = arg0.method6015();
		@Pc(47) int local47 = arg0.method6015();
		@Pc(51) int local51 = arg0.method6015();
		@Pc(62) boolean local62 = arg0.method6019() == 1;
		return new Class18(local7, local16, local23, local27, local31, local35, local39, local43, local47, local51, local62);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(CI)Z")
	public static boolean method2972(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!e;Ljava/awt/Canvas;I)Lclient!oa;")
	public static Class90 method2973(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Canvas arg1) {
		return new da(arg1, arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIZI)V")
	public static void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg6 && arg8 == arg0 && arg2 == arg7 && arg4 == arg3) {
			Static501.method6930(arg4, arg7, arg1, arg0, arg5);
			return;
		}
		@Pc(19) int local19 = arg1;
		@Pc(21) int local21 = arg0;
		@Pc(25) int local25 = arg1 * 3;
		@Pc(29) int local29 = arg0 * 3;
		@Pc(33) int local33 = arg6 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg2 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(54) int local54 = local33 + arg7 - local41 - arg1;
		@Pc(63) int local63 = local37 + arg4 - local45 - arg0;
		@Pc(72) int local72 = local25 + local41 - local33 - local33;
		@Pc(81) int local81 = local29 + local45 - local37 - local37;
		@Pc(86) int local86 = local33 - local25;
		@Pc(91) int local91 = local37 - local29;
		for (@Pc(93) int local93 = 128; local93 <= 4096; local93 += 128) {
			@Pc(101) int local101 = local93 * local93 >> 12;
			@Pc(107) int local107 = local93 * local101 >> 12;
			@Pc(111) int local111 = local107 * local54;
			@Pc(115) int local115 = local63 * local107;
			@Pc(119) int local119 = local101 * local72;
			@Pc(123) int local123 = local81 * local101;
			@Pc(127) int local127 = local93 * local86;
			@Pc(131) int local131 = local93 * local91;
			@Pc(142) int local142 = arg1 + (local127 + local119 + local111 >> 12);
			@Pc(153) int local153 = (local131 + local115 + local123 >> 12) + arg0;
			Static501.method6930(local153, local142, local19, local21, arg5);
			local19 = local142;
			local21 = local153;
		}
	}
}
