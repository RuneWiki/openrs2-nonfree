import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array9;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public static int anInt2728;

	@OriginalMember(owner = "client!fba", name = "l", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_27 = new Class208(29, -1);

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public static int anInt2727 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static121.method1987((String) null, arg3, arg5, arg4, -1, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!wh;Z)V")
	public static void method2340(@OriginalArg(0) Class100_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static297.anObject17 == null) {
			@Pc(9) Class25_Sub1_Sub1 local9 = new Class25_Sub1_Sub1();
			local16 = local9.method523();
			Static297.anObject17 = Static493.method7391(local16);
		}
		if (Static304.anObject13 == null) {
			@Pc(27) Class25_Sub2_Sub2 local27 = new Class25_Sub2_Sub2();
			local16 = local27.method4071();
			Static304.anObject13 = Static493.method7391(local16);
		}
		@Pc(42) Class66 local42 = arg0.aClass66_1;
		if (local42.method1759() && Static265.anObject8 == null) {
			local16 = Static586.method8240(0.6F, new Class206_Sub1(419684), 4.0F, 0.5F, 4.0F, 16.0F);
			Static265.anObject8 = Static493.method7391(local16);
		}
	}
}
