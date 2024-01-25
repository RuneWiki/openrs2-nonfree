import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ej", name = "yd", descriptor = "Lclient!op;")
	public static Class255 aClass255_3;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	public static void method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static538.aClass263_5 == Static27.aClass263_1) {
			if (Static292.method4577(1, false, 0, 1, arg1, arg0, 0, -2)) {
				return;
			}
			Static292.method4577(1, false, 0, 1, arg1, arg0, 0, -3);
		} else if (Static292.method4577(1, false, 0, 1, arg1, arg0, 0, -3)) {
			return;
		} else {
			Static292.method4577(1, false, 0, 1, arg1, arg0, 0, -2);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBI)V")
	public static void method6909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(16) int local16 = -arg0;
		@Pc(18) int local18 = -1;
		Static336.method5023(arg1, arg2 + arg0, Static383.anIntArrayArray62[arg3], arg2 - arg0);
		while (local9 > local7) {
			local18 += 2;
			local16 += local18;
			local7++;
			if (local16 >= 0) {
				local9--;
				local16 -= local9 << 1;
				@Pc(54) int[] local54 = Static383.anIntArrayArray62[arg3 + local9];
				@Pc(60) int[] local60 = Static383.anIntArrayArray62[arg3 - local9];
				@Pc(64) int local64 = arg2 + local7;
				@Pc(69) int local69 = arg2 - local7;
				Static336.method5023(arg1, local64, local54, local69);
				Static336.method5023(arg1, local64, local60, local69);
			}
			@Pc(85) int local85 = local9 + arg2;
			@Pc(90) int local90 = arg2 - local9;
			@Pc(96) int[] local96 = Static383.anIntArrayArray62[arg3 + local7];
			@Pc(103) int[] local103 = Static383.anIntArrayArray62[arg3 - local7];
			Static336.method5023(arg1, local85, local96, local90);
			Static336.method5023(arg1, local85, local103, local90);
		}
	}

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "(I)V")
	public static void method6927() {
		Static288.aClass183_20.method4287();
		Static211.aClass286_5.method6411();
		Static511.aClass286_2.method6411();
	}

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "(B)Z")
	public static boolean method6948() {
		return Static300.anInt5730 > 0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZII)V")
	public static void method6962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static403.anInt6994 == 0) {
			Static245.method4153(false);
		} else {
			Static229.anInt4707 = Static403.anInt6994;
			Static8.method7640(0);
		}
		Static74.anInt1562 = arg0;
		Static303.anInt5528 = arg3;
		Static146.aBoolean259 = arg2;
		Static392.method7238(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(II)V")
	public static void method6993(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4 local5 = Static446.aClass183_31.method4286(); local5 != null; local5 = Static446.aClass183_31.method4283()) {
			if ((local5.aLong307 >> 48 & 0xFFFFL) == (long) arg0) {
				local5.method8013();
			}
		}
	}
}
