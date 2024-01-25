import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
	public static void method3694(@OriginalArg(0) int arg0) {
		if (Static581.anInt9720 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static226.aString47 == null) {
				Static637.method8383(Static562.aString109, Static231.anInt5230, Static141.aString29);
			} else {
				Static576.method8016(Static231.anInt5230);
			}
		}
		if (arg0 != 13 && Static57.aClass51_34 != null) {
			Static57.aClass51_34.method3508();
			Static57.aClass51_34 = null;
		}
		if (arg0 == 3) {
			Static63.method1342(Static16.anInt166 != Static530.anInt9144);
		}
		if (arg0 == 7) {
			Static491.method7200(Static273.anInt5829 != Static530.anInt9144);
		}
		if (arg0 == 5) {
			if (Static226.aString47 == null) {
				Static239.method4610(Static141.aString29, Static562.aString109);
			} else {
				Static272.method4929();
			}
		} else if (arg0 == 6) {
			if (Static226.aString47 == null) {
				Static637.method8383(Static562.aString109, Static231.anInt5230, Static141.aString29);
			} else {
				Static576.method8016(Static231.anInt5230);
			}
		} else if (arg0 == 9) {
			if (Static226.aString47 == null) {
				Static637.method8383(Static562.aString109, Static231.anInt5230, Static141.aString29);
			} else {
				Static576.method8016(Static231.anInt5230);
			}
		} else if (arg0 == 12) {
			if (Static226.aString47 == null) {
				Static239.method4610(Static141.aString29, Static562.aString109);
			} else {
				Static272.method4929();
			}
		}
		if (Static556.method7824(Static581.anInt9720)) {
			Static187.aClass181_36.anInt5947 = 2;
			Static34.aClass181_2.anInt5947 = 2;
			Static493.aClass181_100.anInt5947 = 2;
			Static293.aClass181_57.anInt5947 = 2;
			Static387.aClass181_73.anInt5947 = 2;
			Static574.aClass181_117.anInt5947 = 2;
			Static37.aClass181_5.anInt5947 = 2;
		}
		if (Static556.method7824(arg0)) {
			Static320.anInt6482 = 0;
			Static276.anInt5845 = 1;
			Static375.anInt7103 = 0;
			Static50.anInt1086 = 1;
			Static621.anInt10312 = 0;
			Static234.method4503(true);
			Static187.aClass181_36.anInt5947 = 1;
			Static34.aClass181_2.anInt5947 = 1;
			Static493.aClass181_100.anInt5947 = 1;
			Static293.aClass181_57.anInt5947 = 1;
			Static387.aClass181_73.anInt5947 = 1;
			Static574.aClass181_117.anInt5947 = 1;
			Static37.aClass181_5.anInt5947 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static362.method5872();
		}
		@Pc(226) boolean local226 = arg0 == 2 || Static408.method6434(arg0) || Static135.method3115(arg0);
		@Pc(243) boolean local243 = Static581.anInt9720 == 2 || Static408.method6434(Static581.anInt9720) || Static135.method3115(Static581.anInt9720);
		if (local243 != local226) {
			if (local226) {
				Static148.anInt3680 = Static20.anInt213;
				if (Static552.aClass3_Sub48_30.aClass23_Sub8_4.method3378() == 0) {
					Static300.method5151();
				} else {
					Static149.method3262(Static399.aClass181_75, Static20.anInt213, Static552.aClass3_Sub48_30.aClass23_Sub8_4.method3378());
					Static545.method7726();
				}
				Static262.aClass65_2.method2522(false);
			} else {
				Static300.method5151();
				Static262.aClass65_2.method2522(true);
			}
		}
		if (Static556.method7824(arg0) || arg0 == 13) {
			Static47.aClass33_3.method6181();
		}
		Static581.anInt9720 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZ)V")
	public static void method3695(@OriginalArg(1) boolean arg0) {
		Static269.aClass47_2.method7877(Static67.aClass33_5.method6200());
		@Pc(10) int[] local10 = Static67.aClass33_5.Y();
		Static68.anInt1435 = local10[1];
		Static634.anInt10446 = local10[3];
		Static529.anInt9120 = local10[0];
		Static544.anInt9360 = local10[2];
		if (arg0) {
			Static67.aClass33_5.DA(Static414.anInt7736, Static260.anInt5721, Static379.anInt7212, Static502.anInt8865);
			Static257.method4824(Static69.aDouble8);
		} else {
			Static67.aClass33_5.DA(Static165.anInt3961, Static175.anInt4148, Static392.anInt7445, Static231.anInt5229);
			Static257.method4824(Static99.aDouble12);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public static void method3696(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 12);
		local8.method8628();
	}
}
