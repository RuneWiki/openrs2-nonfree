import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	public static int anInt5037;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_169 = new Class123(27, 11);

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	public static int anInt5041 = -1;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
	public static int anInt5047 = 0;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ie;B)Lclient!rc;")
	public static Class38 method4026(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(10) Class154 local10 = Static447.method6195()[arg0.method6814()];
		@Pc(22) Class201 local22 = Static342.method4995()[arg0.method6814()];
		@Pc(26) int local26 = arg0.method6789();
		@Pc(30) int local30 = arg0.method6789();
		@Pc(34) int local34 = arg0.method6811();
		@Pc(38) int local38 = arg0.method6811();
		@Pc(42) int local42 = arg0.method6789();
		@Pc(46) int local46 = arg0.method6816();
		@Pc(50) int local50 = arg0.method6816();
		return new Class38(local10, local22, local26, local30, local34, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZII)V")
	public static void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static4.method56(arg5, Static112.anInt2687, Static333.anInt6022);
		@Pc(17) int local17 = Static4.method56(arg4, Static112.anInt2687, Static333.anInt6022);
		@Pc(23) int local23 = Static4.method56(arg3, Static384.anInt6641, Static191.anInt4134);
		@Pc(29) int local29 = Static4.method56(arg0, Static384.anInt6641, Static191.anInt4134);
		@Pc(37) int local37 = Static4.method56(arg5 + arg2, Static112.anInt2687, Static333.anInt6022);
		@Pc(46) int local46 = Static4.method56(arg4 - arg2, Static112.anInt2687, Static333.anInt6022);
		for (@Pc(53) int local53 = local11; local53 < local37; local53++) {
			Static504.method6755(arg6, local29, Static570.anIntArrayArray100[local53], local23);
		}
		for (@Pc(73) int local73 = local17; local73 > local46; local73--) {
			Static504.method6755(arg6, local29, Static570.anIntArrayArray100[local73], local23);
		}
		@Pc(95) int local95 = Static4.method56(arg2 + arg3, Static384.anInt6641, Static191.anInt4134);
		@Pc(104) int local104 = Static4.method56(arg0 - arg2, Static384.anInt6641, Static191.anInt4134);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static570.anIntArrayArray100[local106];
			Static504.method6755(arg6, local95, local112, local23);
			Static504.method6755(arg1, local104, local112, local95);
			Static504.method6755(arg6, local29, local112, local104);
		}
	}
}
