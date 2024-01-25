import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!ra;")
	public static Class170 aClass170_51;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	public static void method2282() {
		Static136.aClass66_46.method1944(5);
		Static297.aClass66_98.method1944(5);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(ZI)V")
	public static void method2283() {
		Static108.aClass66_36.method1944(5);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZ)I")
	public static int method2284(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!bm;)Lclient!en;")
	public static Class59 method2285(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface1 arg2) {
		return new Class59_Sub2(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method2286() {
		Static25.aClass66_3.method1942();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(19) int local19 = arg3 - arg2;
		if (local10 == 0) {
			if (local19 != 0) {
				Static54.method1176(arg2, arg4, arg3, arg1);
			}
		} else if (local19 == 0) {
			Static266.method4538(arg4, arg1, arg0, arg2);
		} else {
			@Pc(51) int local51 = (local19 << 12) / local10;
			@Pc(60) int local60 = arg2 - (arg4 * local51 >> 12);
			@Pc(78) int local78;
			@Pc(76) int local76;
			if (arg4 < Static184.anInt6250) {
				local76 = local60 + (Static184.anInt6250 * local51 >> 12);
				local78 = Static184.anInt6250;
			} else if (Static80.anInt4809 < arg4) {
				local78 = Static80.anInt4809;
				local76 = local60 + (local51 * Static80.anInt4809 >> 12);
			} else {
				local78 = arg4;
				local76 = arg2;
			}
			@Pc(109) int local109;
			@Pc(118) int local118;
			if (arg0 < Static184.anInt6250) {
				local109 = Static184.anInt6250;
				local118 = local60 + (Static184.anInt6250 * local51 >> 12);
			} else if (Static80.anInt4809 < arg0) {
				local109 = Static80.anInt4809;
				local118 = local60 + (local51 * Static80.anInt4809 >> 12);
			} else {
				local118 = arg3;
				local109 = arg0;
			}
			if (Static314.anInt6018 > local76) {
				local78 = (Static314.anInt6018 - local60 << 12) / local51;
				local76 = Static314.anInt6018;
			} else if (Static334.anInt6315 < local76) {
				local78 = (Static334.anInt6315 - local60 << 12) / local51;
				local76 = Static334.anInt6315;
			}
			if (Static314.anInt6018 > local118) {
				local118 = Static314.anInt6018;
				local109 = (Static314.anInt6018 - local60 << 12) / local51;
			} else if (local118 > Static334.anInt6315) {
				local109 = (Static334.anInt6315 - local60 << 12) / local51;
				local118 = Static334.anInt6315;
			}
			Static314.method5368(local78, local109, local76, local118, arg1);
		}
	}
}
