import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Lclient!np;")
	public static Class164 aClass164_27;

	@OriginalMember(owner = "client!js", name = "z", descriptor = "I")
	public static int anInt6735;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Lclient!pf;")
	public static final Class2_Sub13_Sub2 aClass2_Sub13_Sub2_27 = new Class2_Sub13_Sub2(5000);

	@OriginalMember(owner = "client!js", name = "y", descriptor = "I")
	public static final int anInt6734 = 1405;

	@OriginalMember(owner = "client!js", name = "B", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_180 = new Class77(31, 10);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I")
	public static int method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(25) int local25 = arg2 / arg1;
		@Pc(31) int local31 = arg1 - 1 & arg2;
		@Pc(38) int local38 = Static289.method4416(local25, local7);
		@Pc(47) int local47 = Static289.method4416(local25, local7 + 1);
		@Pc(54) int local54 = Static289.method4416(local25 + 1, local7);
		@Pc(65) int local65 = Static289.method4416(local25 + 1, local7 + 1);
		@Pc(72) int local72 = Static50.method978(local38, local13, arg1, local47);
		@Pc(79) int local79 = Static50.method978(local54, local13, arg1, local65);
		return Static50.method978(local72, local31, arg1, local79);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIZ)V")
	public static void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg1, 11);
		local8.method410();
		local8.anInt348 = arg2;
		local8.anInt341 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
	public static void method5752() {
		Static19.method552(Static76.aClass41_36);
		Static39.aClass2_Sub13_Sub2_4.method4207(0);
	}
}
