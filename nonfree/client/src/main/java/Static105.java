import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public static int anInt2107;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1043 = Static193.method3027("This computers address has been blocked");

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1042 = aClass70_1043;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public static int anInt2111 = 0;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public static void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class3_Sub6 local28 = Static118.aClass3_Sub6ArrayArrayArray1[local9][arg0][arg1] = Static118.aClass3_Sub6ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt822--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt827; local38++) {
					@Pc(44) Class99 local44 = local28.aClass99Array1[local38];
					if ((local44.aLong144 >> 29 & 0x3L) == 2L && local44.anInt4226 == arg0 && local44.anInt4239 == arg1) {
						local44.anInt4225--;
					}
				}
			}
		}
		if (Static118.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			Static118.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub6(0, arg0, arg1);
		}
		Static118.aClass3_Sub6ArrayArrayArray1[0][arg0][arg1].aClass3_Sub6_1 = local7;
		Static118.aClass3_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
