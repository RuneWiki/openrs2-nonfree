import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!rf;")
	private static Class70 aClass70_529 = Static49.method1293("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_530 = aClass70_529;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1667 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method1296() {
		aClass70_530 = null;
		aClass70_529 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method1297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub17 local28 = Static90.aClass1_Sub17ArrayArrayArray1[local9][arg0][arg1] = Static90.aClass1_Sub17ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt2950--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt2953; local38++) {
					@Pc(44) Class53 local44 = local28.aClass53Array2[local38];
					if ((local44.aLong99 >> 29 & 0x3L) == 2L && local44.anInt3109 == arg0 && local44.anInt3107 == arg1) {
						local44.anInt3113--;
					}
				}
			}
		}
		if (Static90.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			Static90.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub17(0, arg0, arg1);
		}
		Static90.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1].aClass1_Sub17_1 = local7;
		Static90.aClass1_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
