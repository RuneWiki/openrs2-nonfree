import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_169 = new Class359(59, 2);

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString73 = null;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public static void method6634() {
		@Pc(9) int[] local9 = new int[Static110.aClass105_1.anInt2978];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static110.aClass105_1.anInt2978; local13++) {
			@Pc(20) Class238 local20 = Static110.aClass105_1.method2659(local13);
			if (local20.anInt6836 >= 0 || local20.anInt6868 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static645.anIntArray593 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static645.anIntArray593[local52] = local9[local52];
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!mc;)Ljava/lang/String;")
	public static String method6637(@OriginalArg(2) Class5_Sub41 arg0) {
		try {
			@Pc(7) int local7 = arg0.method7812();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local7];
			arg0.anInt9230 += Static465.aClass229_1.method5595(arg0.aByteArray93, arg0.anInt9230, 0, local7, local20);
			return Static602.method8247(local7, local20, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method6638(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class5_Sub21 local17 = Static64.method905(Static263.aClass49_1, Static595.aClass305_96);
			local17.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg0));
			local17.aClass5_Sub41_Sub2_1.method7854(arg0);
			Static495.method7092(local17);
		}
	}
}
