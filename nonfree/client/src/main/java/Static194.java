import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_64 = new Class37(64);

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString155 = "Loaded wordpack";

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
	public static int method3442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method3445(@OriginalArg(0) Class134 arg0) {
		Static195.anInt6717 = 0;
		Static331.anInt3768 = 0;
		Static116.aClass122_2 = new Class122();
		Static35.aClass7_Sub2_Sub1_Sub1Array1 = new Class7_Sub2_Sub1_Sub1[1024];
		Static124.method1983(arg0);
		Static213.method3950(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ps;III)V")
	public static void method3446(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static157.aClass163_11 != null || Static308.aBoolean499 || (arg0 == null || Static261.method4724(arg0) == null)) {
			return;
		}
		Static157.aClass163_11 = arg0;
		Static177.aClass163_12 = Static261.method4724(arg0);
		Static14.aBoolean20 = false;
		Static171.anInt3616 = arg1;
		Static143.anInt2978 = 0;
		Static144.anInt3020 = arg2;
	}
}
