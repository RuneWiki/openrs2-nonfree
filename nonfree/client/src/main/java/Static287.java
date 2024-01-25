import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "J")
	public static long aLong157;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
	public static int anInt5832;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_49 = new Class99();

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	public static final int[] anIntArray397 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
	public static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIILclient!gp;)Lclient!ld;")
	public static Class184 method4830(@OriginalArg(1) int arg0, @OriginalArg(3) Class117 arg1) {
		@Pc(14) byte[] local14 = arg1.method2962(0, arg0);
		return local14 == null ? null : new Class184(local14);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	public static void method4831(@OriginalArg(1) int arg0) {
		if (arg0 == Static389.anInt7024) {
			return;
		}
		if (Static389.anInt7024 == 0) {
			Static192.method3217();
		}
		if (arg0 == 12) {
			if (Static291.aString59 == null) {
				Static511.method7084(Static17.aString14, Static523.anInt8857, Static469.aString73);
			} else {
				Static98.method2074(Static523.anInt8857);
			}
		}
		if (arg0 != 12 && Static138.aClass58_1 != null) {
			Static138.aClass58_1.method4920();
			Static138.aClass58_1 = null;
		}
		if (arg0 == 2) {
			Static156.method2835(Static82.anInt1573 != Static395.anInt7085);
		}
		if (arg0 == 6) {
			Static92.method1978(Static314.anInt4187 != Static395.anInt7085);
		}
		if (arg0 == 4) {
			if (Static291.aString59 == null) {
				Static76.method1381(Static17.aString14, Static469.aString73);
			} else {
				Static302.method4985();
			}
		} else if (arg0 == 5) {
			if (Static291.aString59 == null) {
				Static511.method7084(Static17.aString14, Static523.anInt8857, Static469.aString73);
			} else {
				Static98.method2074(Static523.anInt8857);
			}
		} else if (arg0 == 8) {
			if (Static291.aString59 == null) {
				Static511.method7084(Static17.aString14, Static523.anInt8857, Static469.aString73);
			} else {
				Static98.method2074(Static523.anInt8857);
			}
		} else if (arg0 == 11) {
			if (Static291.aString59 == null) {
				Static76.method1381(Static17.aString14, Static469.aString73);
			} else {
				Static302.method4985();
			}
		}
		if (Static143.method2702(Static389.anInt7024)) {
			Static212.aClass117_110.anInt3362 = 2;
			Static437.aClass117_181.anInt3362 = 2;
			Static382.aClass117_162.anInt3362 = 2;
			Static315.aClass117_141.anInt3362 = 2;
			Static178.aClass117_97.anInt3362 = 2;
			Static444.aClass117_183.anInt3362 = 2;
			Static162.aClass117_88.anInt3362 = 2;
		}
		if (Static143.method2702(arg0)) {
			Static178.anInt3484 = 0;
			Static224.anInt4180 = 1;
			Static23.anInt489 = 0;
			Static307.anInt6046 = 1;
			Static246.anInt5007 = 0;
			Static515.method2859(true);
			Static212.aClass117_110.anInt3362 = 1;
			Static437.aClass117_181.anInt3362 = 1;
			Static382.aClass117_162.anInt3362 = 1;
			Static315.aClass117_141.anInt3362 = 1;
			Static178.aClass117_97.anInt3362 = 1;
			Static444.aClass117_183.anInt3362 = 1;
			Static162.aClass117_88.anInt3362 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static303.method4990();
		}
		if (arg0 == 1) {
			Static420.method7305(Static533.aClass117_228, Static110.aClass62_15);
		} else {
			Static372.method2812();
		}
		@Pc(238) boolean local238 = arg0 == 1 || Static443.method6281(arg0) || Static545.method7421(arg0);
		@Pc(255) boolean local255 = Static389.anInt7024 == 1 || Static443.method6281(Static389.anInt7024) || Static545.method7421(Static389.anInt7024);
		if (local238 != local255) {
			if (local238) {
				Static161.anInt3277 = Static50.anInt1097;
				if (Static300.aClass5_Sub28_Sub1_1.anInt4889 == 0) {
					Static152.method2793();
				} else {
					Static447.method6323(Static50.anInt1097, Static300.aClass5_Sub28_Sub1_1.anInt4889, Static108.aClass117_61);
				}
				Static301.aClass55_3.method1334(false);
			} else {
				Static152.method2793();
				Static301.aClass55_3.method1334(true);
			}
		}
		if (Static143.method2702(arg0) || arg0 == 12) {
			Static110.aClass62_15.method7065();
		}
		Static389.anInt7024 = arg0;
	}
}
