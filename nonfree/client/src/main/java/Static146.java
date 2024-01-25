import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_11 = new Class87(13, 18);

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_12 = new Class87(6, 2);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Lclient!vg;")
	public static final Class247 aClass247_3 = new Class247("RC", 1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z")
	public static boolean method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static152.method2705(arg0, arg1) || Static199.method3243(arg1, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public static void method2659() {
		for (@Pc(1) int local1 = 0; local1 < Static389.anInt6739; local1++) {
			@Pc(6) Class1_Sub3 local6 = Static36.aClass1_Sub3Array1[local1];
			Static171.method2966(local6);
			Static36.aClass1_Sub3Array1[local1] = null;
		}
		Static389.anInt6739 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(B)V")
	public static void method2661() {
		if (Static162.anInt3462 != 3) {
			Static379.anInt2076 = -1;
		}
	}
}
