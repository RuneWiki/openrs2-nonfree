import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
	public static int anInt302;

	@OriginalMember(owner = "client!aw", name = "T", descriptor = "J")
	public static volatile long aLong11 = 0L;

	@OriginalMember(owner = "client!aw", name = "U", descriptor = "Lclient!pw;")
	public static final Class265 aClass265_1 = new Class265();

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(IB)V")
	public static void method293(@OriginalArg(0) int arg0) {
		if (arg0 == Static409.anInt1461) {
			return;
		}
		if (arg0 == 13) {
			if (Static148.aString76 == null) {
				Static431.method5967(Static422.aString202, Static314.anInt5779, Static525.aString237);
			} else {
				Static378.method5279(Static314.anInt5779);
			}
		}
		if (arg0 != 13 && Static333.aClass223_5 != null) {
			Static333.aClass223_5.method5105();
			Static333.aClass223_5 = null;
		}
		if (arg0 == 3) {
			Static210.method7449(Static79.anInt2118 != Static93.anInt2348);
		}
		if (arg0 == 7) {
			Static406.method5725(Static472.anInt8218 != Static79.anInt2118);
		}
		if (arg0 == 5) {
			if (Static148.aString76 == null) {
				Static44.method8137(Static422.aString202, Static525.aString237);
			} else {
				Static50.method1231();
			}
		} else if (arg0 == 6) {
			if (Static148.aString76 == null) {
				Static431.method5967(Static422.aString202, Static314.anInt5779, Static525.aString237);
			} else {
				Static378.method5279(Static314.anInt5779);
			}
		} else if (arg0 == 9) {
			if (Static148.aString76 == null) {
				Static431.method5967(Static422.aString202, Static314.anInt5779, Static525.aString237);
			} else {
				Static378.method5279(Static314.anInt5779);
			}
		} else if (arg0 == 12) {
			if (Static148.aString76 == null) {
				Static44.method8137(Static422.aString202, Static525.aString237);
			} else {
				Static50.method1231();
			}
		}
		if (Static338.method4924(Static409.anInt1461)) {
			Static347.aClass284_106.anInt8049 = 2;
			Static217.aClass284_66.anInt8049 = 2;
			Static222.aClass284_67.anInt8049 = 2;
			Static411.aClass284_117.anInt8049 = 2;
			Static401.aClass284_116.anInt8049 = 2;
			Static569.aClass284_164.anInt8049 = 2;
			Static374.aClass284_111.anInt8049 = 2;
		}
		if (Static338.method4924(arg0)) {
			Static467.anInt8132 = 1;
			Static75.anInt2068 = 0;
			Static218.anInt8725 = 0;
			Static336.anInt6066 = 0;
			Static96.anInt2368 = 1;
			Static427.method5898(true);
			Static347.aClass284_106.anInt8049 = 1;
			Static217.aClass284_66.anInt8049 = 1;
			Static222.aClass284_67.anInt8049 = 1;
			Static411.aClass284_117.anInt8049 = 1;
			Static401.aClass284_116.anInt8049 = 1;
			Static569.aClass284_164.anInt8049 = 1;
			Static374.aClass284_111.anInt8049 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static458.method6302();
		}
		@Pc(224) boolean local224 = arg0 == 2 || Static107.method2198(arg0) || Static438.method3441(arg0);
		@Pc(246) boolean local246 = Static409.anInt1461 == 2 || Static107.method2198(Static409.anInt1461) || Static438.method3441(Static409.anInt1461);
		if (local224 != local246) {
			if (local224) {
				Static526.anInt9227 = Static444.anInt7877;
				if (Static348.aClass3_Sub51_Sub1_5.anInt9951 == 0) {
					Static293.method4413();
				} else {
					Static399.method5601(Static444.anInt7877, Static348.aClass3_Sub51_Sub1_5.anInt9951, Static320.aClass284_98);
					Static115.method2284();
				}
				Static153.aClass117_1.method3180(false);
			} else {
				Static293.method4413();
				Static153.aClass117_1.method3180(true);
			}
		}
		if (Static338.method4924(arg0) || arg0 == 13) {
			Static319.aClass31_11.method8030();
		}
		Static409.anInt1461 = arg0;
	}
}
