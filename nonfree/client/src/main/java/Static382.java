import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
	public static int anInt3953;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public static int anInt3956 = 0;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_136 = new Class214(27, -2);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public static void method3540(@OriginalArg(1) int arg0) {
		if (Static70.anInt1726 == arg0) {
			return;
		}
		if (Static70.anInt1726 == 0) {
			Static375.method5336();
		}
		if (arg0 == 12) {
			Static142.method2610(Static67.anInt1640, Static337.aString51, Static410.aString67);
		}
		if (arg0 != 12 && Static204.aClass13_2 != null) {
			Static204.aClass13_2.method172();
			Static204.aClass13_2 = null;
		}
		if (arg0 == 2) {
			Static234.method3955(Static248.anInt4793 != Static345.anInt6103);
		}
		if (arg0 == 6) {
			Static138.method2556(Static208.anInt4252 != Static248.anInt4793);
		}
		if (arg0 == 4) {
			Static376.method5361(Static410.aString67, Static337.aString51);
		} else if (arg0 == 5) {
			Static142.method2610(Static67.anInt1640, Static337.aString51, Static410.aString67);
		} else if (arg0 == 8) {
			Static142.method2610(Static67.anInt1640, Static337.aString51, Static410.aString67);
		} else if (arg0 == 11) {
			Static376.method5361(Static410.aString67, Static337.aString51);
		}
		if (Static257.method4208(Static70.anInt1726)) {
			Static29.aClass38_93.anInt1056 = 2;
			Static444.aClass38_92.anInt1056 = 2;
			Static340.aClass38_70.anInt1056 = 2;
			Static327.aClass38_66.anInt1056 = 2;
			Static258.aClass38_38.anInt1056 = 2;
			Static220.aClass38_46.anInt1056 = 2;
			Static109.aClass38_22.anInt1056 = 2;
		}
		if (Static257.method4208(arg0)) {
			Static93.anInt2062 = 0;
			Static330.anInt5880 = 0;
			Static77.anInt1869 = 0;
			Static272.anInt5156 = 1;
			Static106.anInt7774 = 1;
			Static35.method519(true);
			Static29.aClass38_93.anInt1056 = 1;
			Static444.aClass38_92.anInt1056 = 1;
			Static340.aClass38_70.anInt1056 = 1;
			Static327.aClass38_66.anInt1056 = 1;
			Static258.aClass38_38.anInt1056 = 1;
			Static220.aClass38_46.anInt1056 = 1;
			Static109.aClass38_22.anInt1056 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static268.method4312();
		}
		if (arg0 == 1) {
			Static319.method4779(Static30.aClass30_3, Static143.aClass38_30);
		} else {
			Static165.method2910();
		}
		@Pc(215) boolean local215 = arg0 == 1 || Static252.method4140(arg0) || Static35.method516(arg0);
		@Pc(230) boolean local230 = Static70.anInt1726 == 1 || Static252.method4140(Static70.anInt1726) || Static35.method516(Static70.anInt1726);
		if (local215 != local230) {
			if (local215) {
				Static305.anInt5655 = Static319.anInt5750;
				if (Static157.aClass185_Sub1_1.anInt5567 == 0) {
					Static207.method3648();
				} else {
					Static141.method6326(Static296.aClass38_80, Static157.aClass185_Sub1_1.anInt5567, Static319.anInt5750);
				}
				Static236.aClass184_2.method4431(false);
			} else {
				Static207.method3648();
				Static236.aClass184_2.method4431(true);
			}
		}
		if (Static257.method4208(arg0) || arg0 == 12) {
			Static30.aClass30_3.method2088();
		}
		Static70.anInt1726 = arg0;
	}
}
