import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Lclient!rl;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_14 = new Class21(9, 2);

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	public static int anInt6682 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBI)Lclient!hp;")
	public static Class4_Sub1_Sub11 method5222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class4_Sub1_Sub11 local20 = (Class4_Sub1_Sub11) Static34.aClass102_4.method2700((long) arg1 << 32 | (long) arg0);
		if (local20 == null) {
			local20 = new Class4_Sub1_Sub11(arg1, arg0);
			Static34.aClass102_4.method2703(local20.aLong224, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method5224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class164 local28 = Static202.aClass164ArrayArrayArray5[local9][arg0][arg1] = Static202.aClass164ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte54--;
				for (@Pc(40) Class7 local40 = local28.aClass7_3; local40 != null; local40 = local40.aClass7_1) {
					@Pc(44) Class16_Sub1 local44 = local40.aClass16_Sub1_1;
					if (local44.aShort94 == arg0 && local44.aShort96 == arg1) {
						local44.aByte82--;
					}
				}
			}
		}
		if (Static202.aClass164ArrayArrayArray5[0][arg0][arg1] == null) {
			Static202.aClass164ArrayArrayArray5[0][arg0][arg1] = new Class164(0, arg0, arg1);
			Static202.aClass164ArrayArrayArray5[0][arg0][arg1].aByte53 = 1;
		}
		Static202.aClass164ArrayArrayArray5[0][arg0][arg1].aClass164_1 = local7;
		Static202.aClass164ArrayArrayArray5[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)V")
	public static void method5228(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class65 local8 = Static67.aClass65Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static171.anInt3361; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static422.anInt6945; local15++) {
						local1 = local8.k(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static231.anInt4434;
							@Pc(32) int local32 = local12 << Static231.anInt4434;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class65 local41 = Static67.aClass65Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.l(local15, local12) - local41.l(local15, local12);
									@Pc(67) int local67 = local8.l(local15 + 1, local12) - local41.l(local15 + 1, local12);
									@Pc(85) int local85 = local8.l(local15 + 1, local12 + 1) - local41.l(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.l(local15, local12 + 1) - local41.l(local15, local12 + 1);
									local41.b(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(ZI)V")
	public static void method5231(@OriginalArg(1) int arg0) {
		Static140.anInt2835 = 3;
		Static85.anInt1763 = arg0;
		Static402.anInt6662 = -1;
		Static274.anInt5136 = 100;
	}
}
