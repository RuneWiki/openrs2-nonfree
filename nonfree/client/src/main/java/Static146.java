import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!qf", name = "Hc", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!qf", name = "kc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1261 = Static120.method1824("(U(Y");

	@OriginalMember(owner = "client!qf", name = "zc", descriptor = "Lclient!pf;")
	public static final Class3_Sub17_Sub1 aClass3_Sub17_Sub1_3 = new Class3_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!qf", name = "Fc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1263 = Static120.method1824("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!qf", name = "Gc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1264 = Static120.method1824("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg8 == arg3 && arg0 == arg2 && arg6 == arg5 && arg7 == arg1) {
			Static67.method1000(arg6, arg1, arg4, arg2, arg3);
			return;
		}
		@Pc(37) int local37 = arg2;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(43) int local43 = arg3;
		@Pc(47) int local47 = arg8 * 3;
		@Pc(51) int local51 = arg0 * 3;
		@Pc(55) int local55 = arg2 * 3;
		@Pc(59) int local59 = arg5 * 3;
		@Pc(68) int local68 = arg6 + local47 - local59 - arg3;
		@Pc(72) int local72 = arg7 * 3;
		@Pc(82) int local82 = local41 + local59 - local47 - local47;
		@Pc(91) int local91 = local51 + arg1 - local72 - arg2;
		@Pc(102) int local102 = local72 + local55 - local51 - local51;
		@Pc(107) int local107 = local51 - local55;
		@Pc(112) int local112 = local47 - local41;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local122 * local114 >> 12;
			@Pc(132) int local132 = local68 * local128;
			@Pc(136) int local136 = local91 * local128;
			@Pc(140) int local140 = local102 * local122;
			@Pc(144) int local144 = local82 * local122;
			@Pc(148) int local148 = local114 * local112;
			@Pc(152) int local152 = local107 * local114;
			@Pc(162) int local162 = (local148 + local144 + local132 >> 12) + arg3;
			@Pc(175) int local175 = arg2 + (local136 + local140 + local152 >> 12);
			Static67.method1000(local162, local175, arg4, local37, local43);
			local37 = local175;
			local43 = local162;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
	public static boolean method2331(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
