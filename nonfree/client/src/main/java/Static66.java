import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
	public static int anInt10099 = 765;

	@OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
	public static int anInt10109 = 0;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public static void method8416(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static113.aClass350ArrayArray1 = new Class350[arg1][arg2];
		Static566.aClass95_14 = arg0;
		if (Static65.anIntArray92 != null) {
			Static608.aClass12_4 = Static485.method6791(Static65.anIntArray92[2], Static65.anIntArray92[5], Static65.anIntArray92[0], Static65.anIntArray92[3], Static65.anIntArray92[1], Static65.anIntArray92[4]);
		}
		Static642.aClass350_2 = new Class350();
		Static363.method4915();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III)V")
	public static void method8417(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static325.anInt5186 = arg0;
		Static482.anInt7691 = arg1;
		if (Static491.anInt8078 == 0) {
			Static158.anInt2827 = Static54.anInt256 * 2 + Static482.anInt7691;
			Static61.anInt1162 = Static251.anInt4017 * 2 + Static325.anInt5186;
		} else if (Static491.anInt8078 == 1) {
			Static174.anInt3080 = Static482.anInt7691 / Static598.anInt9689 + Static151.anInt2698 + 2;
			Static176.anInt3100 = Static240.anInt543 + Static325.anInt5186 / Static281.anInt4510 + 2;
			Static158.anInt2827 = Static174.anInt3080 * Static598.anInt9689;
			Static61.anInt1162 = Static281.anInt4510 * Static176.anInt3100;
			Static54.anInt256 = Static158.anInt2827 - Static482.anInt7691 >> 1;
			Static251.anInt4017 = Static61.anInt1162 - Static325.anInt5186 >> 1;
		} else if (Static491.anInt8078 == 2) {
			Static158.anInt2827 = Static482.anInt7691;
			Static61.anInt1162 = Static325.anInt5186;
			return;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLclient!vj;)Lclient!og;")
	public static Class247 method8418(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(7) String local7 = arg0.method8549();
		@Pc(14) Class361 local14 = Static108.method1608()[arg0.method8547()];
		@Pc(21) Class306 local21 = Static366.method4960()[arg0.method8547()];
		@Pc(34) int local34 = arg0.method8526();
		@Pc(38) int local38 = arg0.method8526();
		@Pc(42) int local42 = arg0.method8547();
		@Pc(46) int local46 = arg0.method8547();
		@Pc(50) int local50 = arg0.method8547();
		@Pc(54) int local54 = arg0.method8546();
		@Pc(58) int local58 = arg0.method8546();
		@Pc(62) int local62 = arg0.method8542();
		@Pc(66) int local66 = arg0.method8542();
		@Pc(70) int local70 = arg0.method8542();
		return new Class247(local7, local14, local21, local34, local38, local42, local46, local50, local54, local58, local62, local66, local70);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)I")
	public static int method8419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}
}
