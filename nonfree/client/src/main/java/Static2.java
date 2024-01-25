import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "Lclient!ho;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_4 = new Class303(42, -1);

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "[I")
	public static int[] anIntArray4 = new int[1];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
	public static void method41() {
		Static334.anInt5596 = 0;
		Static313.anInt5338 = 0;
		Static323.anInt5466 = 0;
		Static172.anInt9422 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!np;I)Lclient!ig;")
	public static Class144 method42(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(14) String local14 = arg0.method5181();
		@Pc(23) Class63 local23 = Static407.method5865()[arg0.method5175()];
		@Pc(30) Class249 local30 = Static448.method7373()[arg0.method5175()];
		@Pc(34) int local34 = arg0.method5231();
		@Pc(38) int local38 = arg0.method5231();
		@Pc(42) int local42 = arg0.method5175();
		@Pc(46) int local46 = arg0.method5175();
		@Pc(50) int local50 = arg0.method5175();
		@Pc(54) int local54 = arg0.method5198();
		@Pc(58) int local58 = arg0.method5198();
		@Pc(62) int local62 = arg0.method5186();
		@Pc(66) int local66 = arg0.method5186();
		@Pc(70) int local70 = arg0.method5186();
		return new Class144(local14, local23, local30, local34, local38, local42, local46, local50, local54, local58, local62, local66, local70);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Z")
	public static boolean method43(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
