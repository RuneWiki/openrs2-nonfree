import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "[I")
	public static final int[] anIntArray196 = new int[128];

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1098 = Static118.method2249("You have only just left another world)3");

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1097 = aClass65_1098;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "[I")
	public static final int[] anIntArray197 = new int[32768];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BI)I")
	public static int method1239(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg2; local7++) {
			local5 = local5 >>> 8 ^ Class73.anIntArray399[(local5 ^ arg1[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Lclient!fb;")
	public static Class25 method1240() {
		try {
			return (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	public static void method1241() {
		for (@Pc(15) Class1_Sub2_Sub23 local15 = (Class1_Sub2_Sub23) Static169.aClass91_7.method3148(); local15 != null; local15 = (Class1_Sub2_Sub23) Static169.aClass91_7.method3150()) {
			@Pc(20) Class6_Sub6 local20 = local15.aClass6_Sub6_1;
			if (Static207.anInt4425 != local20.anInt3407 || local20.aBoolean139) {
				local15.method3295();
			} else if (Static174.anInt3887 >= local20.anInt3412) {
				local20.method2610(Static160.anInt2781);
				if (local20.aBoolean139) {
					local15.method3295();
				} else {
					Static133.method2536(local20.anInt3407, local20.anInt3409, local20.anInt3401, local20.anInt3415, 60, local20, 0, -1L, false);
				}
			}
		}
	}
}
