import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_65 = new Class41(76, -1);

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_66 = new Class41(3, 8);

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_74 = new Class77(78, 10);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!lk;)Ljava/lang/String;")
	public static String method2278(@OriginalArg(1) Class2_Sub13 arg0) {
		return Static150.method2533(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Lclient!to;")
	public static Class22_Sub8 method2279(@OriginalArg(1) int arg0) {
		@Pc(7) Class56[] local7 = Class107.aClass56Array1;
		synchronized (Class107.aClass56Array1) {
			@Pc(30) Class22_Sub8 local30;
			if (arg0 >= Class107.aClass56Array1.length || Class107.aClass56Array1[arg0].method1258()) {
				local30 = new Class22_Sub8();
				local30.aClass22_Sub1Array1 = new Class22_Sub1[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass22_Sub1Array1[local52] = new Class22_Sub1();
				}
			} else {
				local30 = (Class22_Sub8) Class107.aClass56Array1[arg0].method1251();
				local30.method5237();
				@Pc(37) int local37 = Static357.anIntArray128[arg0]--;
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg2; local15 <= arg3; local15++) {
			for (@Pc(19) int local19 = arg0; local19 <= arg1; local19++) {
				if (Static240.anIntArrayArray28[local15][local19] == arg4 && Static280.anIntArrayArray41[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
