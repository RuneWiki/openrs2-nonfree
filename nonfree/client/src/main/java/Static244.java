import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
	public static final int[] anIntArray350 = new int[8];

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public static int anInt4499 = -1;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_138 = new Class235(28, -1);

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method3654() {
		@Pc(9) Class222 local9 = Static40.aClass222_2;
		synchronized (Static40.aClass222_2) {
			Static40.aClass222_2.method4422();
		}
		local9 = Static396.aClass222_42;
		synchronized (Static396.aClass222_42) {
			Static396.aClass222_42.method4422();
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method3655() {
		for (@Pc(10) Class1_Sub6_Sub8 local10 = (Class1_Sub6_Sub8) Static87.aClass353_33.method7677(); local10 != null; local10 = (Class1_Sub6_Sub8) Static87.aClass353_33.method7687()) {
			@Pc(20) Class8_Sub3_Sub3_Sub2 local20 = local10.aClass8_Sub3_Sub3_Sub2_1;
			if (Static301.anInt5197 > local20.anInt4176) {
				local10.method7859();
				local20.method3380();
			} else if (local20.anInt4200 <= Static301.anInt5197) {
				if (local20.anInt4193 > 0) {
					@Pc(56) Class1_Sub42 local56 = (Class1_Sub42) Static84.aClass187_40.method3797((long) (local20.anInt4193 - 1));
					if (local56 != null) {
						@Pc(61) Class8_Sub3_Sub3_Sub1_Sub2 local61 = local56.aClass8_Sub3_Sub3_Sub1_Sub2_2;
						if (local61.anInt9365 >= 0 && local61.anInt9365 < Static71.anInt1410 * 512 && local61.anInt9370 >= 0 && local61.anInt9370 < Static471.anInt8012 * 512) {
							local20.method3386(Static66.method1191(local61.anInt9365, local20.aByte123, local61.anInt9370) - local20.anInt4180, Static301.anInt5197, local61.anInt9370, local61.anInt9365);
						}
					}
				}
				if (local20.anInt4193 < 0) {
					@Pc(114) int local114 = -local20.anInt4193 - 1;
					@Pc(125) Class8_Sub3_Sub3_Sub1_Sub1 local125;
					if (Static296.anInt5113 == local114) {
						local125 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1;
					} else {
						local125 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local114];
					}
					if (local125 != null && local125.anInt9365 >= 0 && local125.anInt9365 < Static71.anInt1410 * 512 && local125.anInt9370 >= 0 && Static471.anInt8012 * 512 > local125.anInt9370) {
						local20.method3386(Static66.method1191(local125.anInt9365, local20.aByte123, local125.anInt9370) - local20.anInt4180, Static301.anInt5197, local125.anInt9370, local125.anInt9365);
					}
				}
				local20.method3383(Static504.anInt5717);
				Static227.method3465(local20, true);
			}
		}
	}
}
