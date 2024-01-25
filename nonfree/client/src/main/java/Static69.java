import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method7887() {
		Static254.anInt4940 = Static449.aClass177_9.anInt5368 + Static449.aClass177_9.anInt5365 + 2;
		Static225.anInt4528 = Static159.aClass177_3.anInt5368 + Static159.aClass177_3.anInt5365 + 2;
		Static300.aStringArray26 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Static300.aStringArray26.length; local28++) {
			Static300.aStringArray26[local28] = "";
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
	public static void method7888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg0;
		@Pc(16) int local16 = -arg0;
		Static227.method7421(arg2 - arg0, arg1, arg2 + arg0, Static81.anIntArrayArray25[arg3]);
		@Pc(31) int local31 = -1;
		while (local13 > local7) {
			local31 += 2;
			local16 += local31;
			local7++;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(54) int[] local54 = Static81.anIntArrayArray25[local13 + arg3];
				@Pc(61) int[] local61 = Static81.anIntArrayArray25[arg3 - local13];
				@Pc(66) int local66 = arg2 + local7;
				@Pc(71) int local71 = arg2 - local7;
				Static227.method7421(local71, arg1, local66, local54);
				Static227.method7421(local71, arg1, local66, local61);
			}
			@Pc(88) int local88 = arg2 + local13;
			@Pc(93) int local93 = arg2 - local13;
			@Pc(99) int[] local99 = Static81.anIntArrayArray25[local7 + arg3];
			@Pc(105) int[] local105 = Static81.anIntArrayArray25[arg3 - local7];
			Static227.method7421(local93, arg1, local88, local99);
			Static227.method7421(local93, arg1, local88, local105);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBII)V")
	public static void method7889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(11, arg2);
		local8.method4919();
		local8.anInt5686 = arg0;
		local8.anInt5680 = arg1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)Z")
	public static boolean method7891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static32.method1277(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static246.anInt4759;
			@Pc(14) int local14 = arg2 << Static246.anInt4759;
			return Static237.method4032(local10 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static237.method4032(local10 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static237.method4032(local10 + Static40.anInt1354 - 1, Static290.aClass10Array7[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static40.anInt1354 - 1) && Static237.method4032(local10 + 1, Static290.aClass10Array7[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static40.anInt1354 - 1);
		} else {
			return false;
		}
	}
}
