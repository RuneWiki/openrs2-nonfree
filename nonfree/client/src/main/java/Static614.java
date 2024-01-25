import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!us", name = "g", descriptor = "[Lclient!qm;")
	public static Class290[] aClass290Array1 = null;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	public static void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class6_Sub4_Sub18 local11 = Static565.method7924((long) arg1, 16);
		local11.method7976();
		local11.anInt9466 = arg0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	public static void method8484() {
		if (!Static387.aBoolean434) {
			return;
		}
		while (true) {
			while (Static668.aClass235_Sub1Array2.length > Static52.anInt1071) {
				@Pc(22) Class235_Sub1 local22 = Static668.aClass235_Sub1Array2[Static52.anInt1071];
				if (local22 != null && local22.anInt6481 == -1) {
					if (Static275.aClass6_Sub32_4 == null) {
						Static275.aClass6_Sub32_4 = Static564.aClass301_1.method7181(local22.aString90);
					}
					@Pc(45) int local45 = Static275.aClass6_Sub32_4.anInt4924;
					if (local45 == -1) {
						return;
					}
					Static52.anInt1071++;
					Static275.aClass6_Sub32_4 = null;
					local22.anInt6481 = local45;
				} else {
					Static52.anInt1071++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	public static void method8490(@OriginalArg(0) boolean arg0) {
		Static32.aClass207_6.method8211(Static367.aClass132_7.method7496());
		@Pc(10) int[] local10 = Static367.aClass132_7.Y();
		Static62.anInt1176 = local10[1];
		Static654.anInt2125 = local10[3];
		Static484.anInt8272 = local10[0];
		Static627.anInt10198 = local10[2];
		if (arg0) {
			Static367.aClass132_7.DA(Static289.anInt4893, Static404.anInt5096, Static161.anInt2733, Static333.anInt5730);
			Static224.method3271(Static229.aDouble71);
		} else {
			Static367.aClass132_7.DA(Static286.anInt4874, Static69.anInt1272, Static629.anInt10267, Static643.anInt10394);
			Static224.method3271(Static187.aDouble60);
		}
	}
}
