import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[[[Lclient!fl;")
	public static Class82[][][] aClass82ArrayArrayArray2;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_99 = new Class214(23, 7);

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_100 = new Class214(14, 1);

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
	public static int anInt2650 = 0;

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_101 = new Class214(73, 6);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2210(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(21) int local21 = local8.length() - 3; local21 > 0; local21 -= 3) {
			local8 = local8.substring(0, local21) + "," + local8.substring(local21);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static203.aClass151_107.method3122(Static188.anInt3028) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static158.aClass151_90.method3122(Static188.anInt3028) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
