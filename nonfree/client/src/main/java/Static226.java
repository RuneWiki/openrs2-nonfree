import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!rk;")
	public static Class180 aClass180_57;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!vm;")
	public static Class208 aClass208_6;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public static int anInt4547 = 0;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	public static int anInt4551 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V")
	public static void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(20) int local20 = -arg0;
		@Pc(22) int local22 = -1;
		Static282.method4681(arg2, arg1 - arg0, Static323.anIntArrayArray55[arg3], arg0 + arg1);
		while (local7 < local9) {
			local22 += 2;
			local20 += local22;
			local7++;
			if (local20 >= 0) {
				local9--;
				local20 -= local9 << 1;
				@Pc(61) int[] local61 = Static323.anIntArrayArray55[local9 + arg3];
				@Pc(67) int[] local67 = Static323.anIntArrayArray55[arg3 - local9];
				@Pc(71) int local71 = local7 + arg1;
				@Pc(76) int local76 = arg1 - local7;
				Static282.method4681(arg2, local76, local61, local71);
				Static282.method4681(arg2, local76, local67, local71);
			}
			@Pc(93) int local93 = arg1 + local9;
			@Pc(98) int local98 = arg1 - local9;
			@Pc(105) int[] local105 = Static323.anIntArrayArray55[arg3 + local7];
			@Pc(112) int[] local112 = Static323.anIntArrayArray55[arg3 - local7];
			Static282.method4681(arg2, local98, local105, local93);
			Static282.method4681(arg2, local98, local112, local93);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method4016() {
		Static199.method3566(Static269.aCanvas4);
		Static119.method2527(Static269.aCanvas4);
		if (Static243.aClass82_1 != null) {
			Static243.aClass82_1.method2011(Static269.aCanvas4);
		}
		Static251.aClient4.method1014();
		Static269.aCanvas4.setBackground(Color.black);
		Static206.anInt4120 = -1;
		Static212.method3768(Static269.aCanvas4);
		Static274.method4567(Static269.aCanvas4);
		if (Static243.aClass82_1 != null) {
			Static243.aClass82_1.method2003(Static269.aCanvas4);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method4017(@OriginalArg(0) Class180 arg0) {
		Static179.aClass180_49 = arg0;
		Static179.aClass180_49.method4553(35);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!rk;ZII)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(2) Class180 arg1, @OriginalArg(4) int arg2) {
		Static98.aClass180_12 = arg1;
		Static129.anInt2826 = 1;
		Static301.aBoolean425 = false;
		Static286.anInt5630 = 10000;
		Static250.anInt4908 = 0;
		Static254.anInt4944 = arg2;
		Static61.anInt1532 = arg0;
	}
}
