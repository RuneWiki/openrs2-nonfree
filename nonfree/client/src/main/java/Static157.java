import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt3130 = 0;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt3131 = 64;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt3135 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIZ)I")
	public static int method2972(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iq;Lclient!qj;Lclient!qj;B)V")
	public static void method2973(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(2) Class165 arg2) {
		Static310.anInterface3_1 = arg0;
		Static87.aClass165_29 = arg2;
		Static88.aClass165_31 = arg1;
		if (Static88.aClass165_31 != null) {
			Static1.anInt49 = Static88.aClass165_31.method4499(1);
		}
		if (Static87.aClass165_29 != null) {
			Static111.anInt2271 = Static87.aClass165_29.method4499(1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method2975() {
		Static190.aClass140_99.method3824(5);
		Static175.aClass140_94.method3824(5);
	}
}
