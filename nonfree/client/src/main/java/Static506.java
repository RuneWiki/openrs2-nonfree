import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Z")
	public static boolean aBoolean670 = true;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIII)V")
	public static void method7744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static325.anInt6148 <= arg2 && Static119.anInt2469 >= arg2) {
			@Pc(11) int local11 = Static452.method6975(Static187.anInt3872, arg1, Static94.anInt2057);
			@Pc(17) int local17 = Static452.method6975(Static187.anInt3872, arg0, Static94.anInt2057);
			Static25.method774(local17, local11, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)V")
	public static void method7745(@OriginalArg(0) int arg0) {
		if (arg0 == Static186.anInt3863) {
			return;
		}
		if (Static186.anInt3863 == 0) {
			Static208.method3831();
		}
		if (arg0 == 12) {
			if (Static396.aString177 == null) {
				Static325.method5580(Static361.anInt6516, Static309.aString140, Static150.aString62);
			} else {
				Static531.method8097(Static361.anInt6516);
			}
		}
		if (arg0 != 12 && Static147.aClass134_1 != null) {
			Static147.aClass134_1.method8116();
			Static147.aClass134_1 = null;
		}
		if (arg0 == 2) {
			Static122.method2335(Static39.anInt1109 != Static328.anInt6167);
		}
		if (arg0 == 6) {
			Static168.method3191(Static328.anInt6167 != Static25.anInt735);
		}
		if (arg0 == 4) {
			if (Static396.aString177 == null) {
				Static27.method787(Static150.aString62, Static309.aString140);
			} else {
				Static248.method4353();
			}
		} else if (arg0 == 5) {
			if (Static396.aString177 == null) {
				Static325.method5580(Static361.anInt6516, Static309.aString140, Static150.aString62);
			} else {
				Static531.method8097(Static361.anInt6516);
			}
		} else if (arg0 == 8) {
			if (Static396.aString177 == null) {
				Static325.method5580(Static361.anInt6516, Static309.aString140, Static150.aString62);
			} else {
				Static531.method8097(Static361.anInt6516);
			}
		} else if (arg0 == 11) {
			if (Static396.aString177 == null) {
				Static27.method787(Static150.aString62, Static309.aString140);
			} else {
				Static248.method4353();
			}
		}
		if (Static139.method2617(Static186.anInt3863)) {
			Static205.aClass69_73.anInt2003 = 2;
			Static334.aClass69_65.anInt2003 = 2;
			Static237.aClass69_47.anInt2003 = 2;
			Static11.aClass69_5.anInt2003 = 2;
			Static272.aClass69_54.anInt2003 = 2;
			Static525.aClass69_97.anInt2003 = 2;
			Static80.aClass69_23.anInt2003 = 2;
		}
		if (Static139.method2617(arg0)) {
			Static134.anInt2698 = 0;
			Static291.anInt5561 = 1;
			Static155.anInt3072 = 1;
			Static519.anInt2064 = 0;
			Static264.anInt9555 = 0;
			Static518.method7916(true);
			Static205.aClass69_73.anInt2003 = 1;
			Static334.aClass69_65.anInt2003 = 1;
			Static237.aClass69_47.anInt2003 = 1;
			Static11.aClass69_5.anInt2003 = 1;
			Static272.aClass69_54.anInt2003 = 1;
			Static525.aClass69_97.anInt2003 = 1;
			Static80.aClass69_23.anInt2003 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static287.method6886();
		}
		if (arg0 == 1) {
			Static106.method2170(Static455.aClass4_11, Static46.aClass69_14);
		} else {
			Static539.method8205();
		}
		@Pc(250) boolean local250 = arg0 == 1 || Static167.method3162(arg0) || Static275.method4864(arg0);
		@Pc(267) boolean local267 = Static186.anInt3863 == 1 || Static167.method3162(Static186.anInt3863) || Static275.method4864(Static186.anInt3863);
		if (local267 != local250) {
			if (local250) {
				Static261.anInt5068 = Static81.anInt1883;
				if (Static286.aClass1_Sub15_Sub1_1.anInt7042 == 0) {
					Static427.method6648();
				} else {
					Static22.method607(Static81.anInt1883, Static286.aClass1_Sub15_Sub1_1.anInt7042, Static521.aClass69_96);
				}
				Static302.aClass117_5.method2933(false);
			} else {
				Static427.method6648();
				Static302.aClass117_5.method2933(true);
			}
		}
		if (Static139.method2617(arg0) || arg0 == 12) {
			Static455.aClass4_11.method7168();
		}
		Static186.anInt3863 = arg0;
	}
}
