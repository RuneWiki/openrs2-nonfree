import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!la;")
	public static Class196 aClass196_17;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "[Lclient!sl;")
	public static final Class3_Sub3[] aClass3_Sub3Array1 = new Class3_Sub3[2048];

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_13 = new Class200(33, 3);

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	public static int anInt1566 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method1574(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static597.aClass280_45.method7107((long) arg0);
		if (local15 != null) {
			@Pc(22) Class3_Sub6_Sub2 local22 = local15.aClass119_Sub1_1.method3523();
			if (local22 != null) {
				@Pc(29) double local29 = local15.aClass119_Sub1_1.method3522();
				if (local29 >= (double) local22.method6948() && local29 <= (double) local22.method6947()) {
					return local22.method6944();
				}
			}
		}
		return null;
	}
}
