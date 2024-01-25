import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V")
	public static void method6964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static457.anInt8300; local7++) {
			@Pc(13) Rectangle local13 = Class160.aRectangleArray2[local7];
			if (local13.width + local13.x > arg1 && arg3 + arg1 > local13.x && arg2 < local13.y + local13.height && local13.y < arg2 + arg0) {
				Static441.aBooleanArray17[local7] = true;
			}
		}
		Static241.method4616(arg2 + arg0, arg2, arg1 + arg3, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	public static int method6965() {
		@Pc(10) byte local10;
		if (Static6.anInt66 < 96) {
			local10 = 1;
			Static534.method7607();
		} else {
			@Pc(18) int local18 = Static473.method7011();
			if (local18 <= 100) {
				Static351.method5758();
				local10 = 4;
			} else if (local18 <= 500) {
				Static596.method8155();
				local10 = 3;
			} else if (local18 > 1000) {
				Static534.method7607();
				local10 = 1;
			} else {
				Static173.method8277();
				local10 = 2;
			}
		}
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() != 0) {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, 0);
			Static559.method7893(false, 0);
		}
		Static152.method3314();
		return local10;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZIIIZI)V")
	public static void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg4 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg4 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) Class153_Sub1 local16 = Static199.aClass153_Sub1Array1[local10];
		Static199.aClass153_Sub1Array1[local10] = Static199.aClass153_Sub1Array1[arg4];
		Static199.aClass153_Sub1Array1[arg4] = local16;
		for (@Pc(28) int local28 = arg3; local28 < arg4; local28++) {
			if (Static171.method3553(arg0, arg2, Static199.aClass153_Sub1Array1[local28], arg5, local16, arg1) <= 0) {
				@Pc(45) Class153_Sub1 local45 = Static199.aClass153_Sub1Array1[local28];
				Static199.aClass153_Sub1Array1[local28] = Static199.aClass153_Sub1Array1[local12];
				Static199.aClass153_Sub1Array1[local12++] = local45;
			}
		}
		Static199.aClass153_Sub1Array1[arg4] = Static199.aClass153_Sub1Array1[local12];
		Static199.aClass153_Sub1Array1[local12] = local16;
		method6966(arg0, arg1, arg2, arg3, local12 - 1, arg5);
		method6966(arg0, arg1, arg2, local12 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIII)V")
	public static void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg1, 10);
		local8.method8631();
		local8.anInt10489 = arg2;
		local8.anInt10490 = arg0;
		local8.anInt10491 = arg3;
	}
}
