import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Lclient!lt;")
	public static Class158 aClass158_68;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_88 = new Class186(40, 16);

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_5 = new Class193("", 10);

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_81 = new Class25(11, 8);

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "Lclient!qi;")
	public static final Class207 aClass207_7 = new Class207("WTQA", 2);

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V")
	public static void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg2; local12++) {
			Static73.method1404(Static347.anIntArrayArray54[local12], arg3, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method4468() {
		if (Static54.anInt1123 == 10 || Static54.anInt1123 == 28) {
			Static183.method4958(5000, Static214.anInt3730 >> 10, Static32.anInt521 >> 10);
		} else {
			@Pc(17) int local17 = Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray582[0] >> 3;
			@Pc(24) int local24 = Static134.aClass3_Sub3_Sub6_Sub1_1.anIntArray583[0] >> 3;
			if (local17 >= 0 && local17 < Static84.anInt1632 >> 3 && local24 >= 0 && Static261.anInt4480 >> 3 > local24) {
				Static183.method4958(5000, local24, local17);
			} else {
				Static183.method4958(0, Static261.anInt4480 >> 4, Static84.anInt1632 >> 4);
			}
		}
		Static332.method4751();
		Static428.method5839();
		Static380.method5247();
		Static127.method2070();
	}
}
