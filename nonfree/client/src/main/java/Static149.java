import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static int anInt3006;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt3007;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public static int anInt3012 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
	public static int method2411(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method2412() {
		Static203.aClass61_37.method1378();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method2413() {
		for (@Pc(14) Class8_Sub1_Sub9 local14 = (Class8_Sub1_Sub9) Static123.aClass182_11.method4319(); local14 != null; local14 = (Class8_Sub1_Sub9) Static123.aClass182_11.method4329()) {
			@Pc(19) Class36_Sub6 local19 = local14.aClass36_Sub6_1;
			if (local19.anInt4733 != Static34.anInt770 || Static183.anInt3590 > local19.anInt4740) {
				local14.method4273();
			} else if (Static183.anInt3590 >= local19.anInt4744) {
				if (local19.anInt4758 > 0) {
					@Pc(54) Class36_Sub3_Sub2 local54 = Static48.aClass36_Sub3_Sub2Array1[local19.anInt4758 - 1];
					if (local54 != null && local54.anInt4117 >= 0 && local54.anInt4117 < 13312 && local54.anInt4118 >= 0 && local54.anInt4118 < 13312) {
						local19.method3582(Static183.anInt3590, local54.anInt4117, local54.anInt4118, Static59.method927(local54.anInt4117, local54.anInt4118, local19.anInt4733) - local19.anInt4731);
					}
				}
				if (local19.anInt4758 < 0) {
					@Pc(110) int local110 = -local19.anInt4758 - 1;
					@Pc(115) Class36_Sub3_Sub1 local115;
					if (Static34.anInt765 == local110) {
						local115 = Static21.aClass36_Sub3_Sub1_1;
					} else {
						local115 = Static230.aClass36_Sub3_Sub1Array1[local110];
					}
					if (local115 != null && local115.anInt4117 >= 0 && local115.anInt4117 < 13312 && local115.anInt4118 >= 0 && local115.anInt4118 < 13312) {
						local19.method3582(Static183.anInt3590, local115.anInt4117, local115.anInt4118, Static59.method927(local115.anInt4117, local115.anInt4118, local19.anInt4733) - local19.anInt4731);
					}
				}
				local19.method3579(Static185.anInt3691);
				Static37.method3011(Static34.anInt770, (int) local19.aDouble4, (int) local19.aDouble8, (int) local19.aDouble6, 60, local19, local19.anInt4752, -1L, false);
			}
		}
	}
}
