import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!n", name = "M", descriptor = "[I")
	public static final int[] anIntArray493 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!n", name = "P", descriptor = "I")
	public static int anInt6303 = 0;

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public static void method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static196.aClass51ArrayArrayArray3[0][arg1][arg2] != null && Static196.aClass51ArrayArrayArray3[0][arg1][arg2].aClass51_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static196.aClass51ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class51 local46 = Static196.aClass51ArrayArrayArray3[local22][arg1][arg2] = new Class51(local22, arg1, arg2);
				if (local20) {
					local46.aByte9++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
	public static void method5301() {
		Static291.aClass107_33.method3015();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!dr;IIII)V")
	public static void method5302(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg1.method3677(arg0, arg3, arg4 + arg0, arg3 + arg2);
		arg1.method3694(arg4, -16777216, arg2, arg0, arg3);
		if (Static249.anInt5214 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static202.anInt4957 / (float) Static202.anInt4956;
		@Pc(35) int local35 = arg4;
		@Pc(41) int local41 = arg2;
		if (local33 < 1.0F) {
			local41 = (int) ((float) arg4 * local33);
		} else {
			local35 = (int) ((float) arg2 / local33);
		}
		@Pc(67) int local67 = arg3 + (arg2 - local41) / 2;
		@Pc(75) int local75 = arg0 + (arg4 - local35) / 2;
		if (Static112.aClass46_10 == null || Static112.aClass46_10.method5019() != arg4 || arg2 != Static112.aClass46_10.method5023()) {
			Static202.method4226(Static202.anInt4952, Static202.anInt4958 + Static202.anInt4957, Static202.anInt4956 + Static202.anInt4952, Static202.anInt4958, local75, local67, local75 + local35, local41 + local67);
			Static202.method4235(arg1);
			Static112.aClass46_10 = arg1.method3741(local75, local67, local35, local41, false);
		}
		Static112.aClass46_10.method5016(local75, local67);
		@Pc(123) int local123 = local35 * Static105.anInt2194 / Static202.anInt4956;
		@Pc(129) int local129 = local41 * Static133.anInt2847 / Static202.anInt4957;
		@Pc(137) int local137 = Static114.anInt2420 * local35 / Static202.anInt4956 + local75;
		@Pc(151) int local151 = local67 + local41 - local129 - local41 * Static43.anInt2553 / Static202.anInt4957;
		@Pc(153) int local153 = -1996554240;
		if (Static13.aClass172_1 == Static150.aClass172_3) {
			local153 = -1996488705;
		}
		arg1.method3712(local137, local151, local123, local129, local153, 1);
		arg1.method3697(local137, local151, local123, local129, local153, 0);
		if (Static314.anInt6200 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static328.anInt6685 > 50) {
			local191 = 500 - Static328.anInt6685 * 5;
		} else {
			local191 = Static328.anInt6685 * 5;
		}
		for (@Pc(202) Class2_Sub8 local202 = (Class2_Sub8) Static202.aClass180_34.method4919(); local202 != null; local202 = (Class2_Sub8) Static202.aClass180_34.method4916()) {
			@Pc(211) Class66 local211 = Static312.method5209(local202.anInt1039);
			if (Static316.method5254(local211)) {
				@Pc(243) int local243;
				@Pc(255) int local255;
				if (Static308.anInt6109 == local202.anInt1039) {
					local243 = local75 + local202.anInt1043 * local35 / Static202.anInt4956;
					local255 = local67 + local41 * (Static202.anInt4957 - local202.anInt1037) / Static202.anInt4957;
					arg1.method3694(4, local191 << 24 | 0xFFFF00, 4, local243 - 2, local255 + -2);
				} else if (Static286.anInt5744 != -1 && Static286.anInt5744 == local211.anInt1764) {
					local243 = local75 + local202.anInt1043 * local35 / Static202.anInt4956;
					local255 = local41 * (Static202.anInt4957 - local202.anInt1037) / Static202.anInt4957 + local67;
					arg1.method3694(4, local191 << 24 | 0xFFFF00, 4, local243 - 2, local255 + -2);
				}
			}
		}
	}
}
