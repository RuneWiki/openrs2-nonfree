import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method4825() {
		for (@Pc(10) Class1_Sub2_Sub8 local10 = (Class1_Sub2_Sub8) Static193.aClass266_10.method6000(); local10 != null; local10 = (Class1_Sub2_Sub8) Static193.aClass266_10.method5994()) {
			@Pc(17) Class26_Sub2_Sub5 local17 = local10.aClass26_Sub2_Sub5_1;
			if (Static152.anInt2600 != local17.aByte95 || local17.anInt5271 < Static403.anInt6978) {
				local10.method6071();
				local17.method4262();
			} else if (Static403.anInt6978 >= local17.anInt5279) {
				if (local17.anInt5263 > 0) {
					@Pc(43) Class26_Sub2_Sub2_Sub2 local43 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local17.anInt5263 - 1];
					if (local43 != null && local43.anInt7068 >= 0 && Static135.anInt2314 * 128 > local43.anInt7068 && local43.anInt7065 >= 0 && local43.anInt7065 < Static352.anInt6022 * 128) {
						local17.method4259(local43.anInt7065, Static289.method4078(local43.anInt7068, local43.anInt7065, local17.aByte95) - local17.anInt5255, local43.anInt7068, Static403.anInt6978);
					}
				}
				if (local17.anInt5263 < 0) {
					@Pc(104) int local104 = -local17.anInt5263 - 1;
					@Pc(113) Class26_Sub2_Sub2_Sub1 local113;
					if (Static453.anInt7845 == local104) {
						local113 = Static196.aClass26_Sub2_Sub2_Sub1_1;
					} else {
						local113 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local104];
					}
					if (local113 != null && local113.anInt7068 >= 0 && Static135.anInt2314 * 128 > local113.anInt7068 && local113.anInt7065 >= 0 && local113.anInt7065 < Static352.anInt6022 * 128) {
						local17.method4259(local113.anInt7065, Static289.method4078(local113.anInt7068, local113.anInt7065, local17.aByte95) - local17.anInt5255, local113.anInt7068, Static403.anInt6978);
					}
				}
				local17.method4258(Static9.anInt248);
				Static176.method2753(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIII)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static59.anIntArrayArray34[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static59.anIntArrayArray34[local10][arg3] = arg2;
			}
		}
	}
}
