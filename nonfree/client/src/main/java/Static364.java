import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!m;")
	public static Class151 aClass151_2;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_18 = new Class126(20);

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_37 = new Class253(54, 14);

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_43 = new Class55("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public static int anInt2000 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg0 && arg7 == arg8 && arg4 == arg1 && arg6 == arg2) {
			Static13.method118(arg4, arg3, arg7, arg6, arg0);
			return;
		}
		@Pc(23) int local23 = arg0;
		@Pc(25) int local25 = arg7;
		@Pc(29) int local29 = arg0 * 3;
		@Pc(33) int local33 = arg7 * 3;
		@Pc(37) int local37 = arg5 * 3;
		@Pc(41) int local41 = arg8 * 3;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(59) int local59 = local37 + arg4 - local45 - arg0;
		@Pc(69) int local69 = local41 + arg6 - arg7 - local49;
		@Pc(79) int local79 = local45 + local29 - local37 - local37;
		@Pc(89) int local89 = local49 + local33 - local41 - local41;
		@Pc(94) int local94 = local37 - local29;
		@Pc(99) int local99 = local41 - local33;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local101 * local109 >> 12;
			@Pc(119) int local119 = local59 * local115;
			@Pc(123) int local123 = local69 * local115;
			@Pc(127) int local127 = local109 * local79;
			@Pc(131) int local131 = local109 * local89;
			@Pc(135) int local135 = local94 * local101;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = (local119 + local127 + local135 >> 12) + arg0;
			@Pc(161) int local161 = (local123 + local131 + local139 >> 12) + arg7;
			Static13.method118(local149, arg3, local25, local161, local23);
			local23 = local149;
			local25 = local161;
		}
	}
}
