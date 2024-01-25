import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "Lclient!dn;")
	public static Class67 aClass67_2;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "Lclient!fea;")
	public static Class99 aClass99_69 = new Class99();

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_77 = new Class236(18, 2);

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_192 = new Class150(48, 6);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lclient!ak;")
	public static Class14 method6359(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static193.aClass14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V")
	public static void method6360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 + arg0;
		@Pc(13) int local13 = arg3 - arg0;
		for (@Pc(15) int local15 = arg5; local15 < local9; local15++) {
			Static321.method5153(arg2, arg1, Static352.anIntArrayArray51[local15], arg4);
		}
		@Pc(38) int local38 = arg1 + arg0;
		@Pc(43) int local43 = arg4 - arg0;
		for (@Pc(45) int local45 = arg3; local45 > local13; local45--) {
			Static321.method5153(arg2, arg1, Static352.anIntArrayArray51[local45], arg4);
		}
		for (@Pc(65) int local65 = local9; local65 <= local13; local65++) {
			@Pc(71) int[] local71 = Static352.anIntArrayArray51[local65];
			Static321.method5153(arg2, arg1, local71, local38);
			Static321.method5153(arg2, local43, local71, arg4);
		}
	}
}
