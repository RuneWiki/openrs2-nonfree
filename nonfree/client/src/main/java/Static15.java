import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)Z")
	public static boolean method206(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public static void method207() {
		Static99.aClass367_4.method8498();
		Static494.aClass314_5.method7467();
		Static619.aClass94_2.method2324();
		Static568.aClass315_5.method7507();
		Static231.aClass19_2.method281();
		Static110.aClass105_1.method2646();
		Static591.aClass66_2.method1766();
		Static239.aClass91_1.method2241();
		Static545.aClass171_1.method4162();
		Static294.aClass389_1.method8877();
		Static667.aClass278_1.method6503();
		Static299.aClass286_2.method6796();
		Static367.aClass365_4.method8486();
		Static49.aClass93_1.method2283();
		Static62.aClass336_1.method7776();
		Static191.aClass381_2.method8727();
		Static62.aClass393_1.method9018();
		Static230.aClass122_1.method2979();
		Static497.aClass182_4.method4677();
		Static317.aClass176_2.method4507();
		Static73.aClass211_1.method5180();
		Static463.aClass70_2.method1845();
		Static265.method4127();
		Static309.method4879();
		Static636.method8563();
		Static203.method3290();
		Static538.method7524();
		Static80.aClass340_4.method8000();
		Static334.aClass340_38.method8000();
		Static196.aClass340_21.method8000();
		Static486.aClass340_48.method8000();
		Static652.aClass340_67.method8000();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method211() {
		@Pc(15) Class5_Sub6 local15;
		for (local15 = (Class5_Sub6) Static173.aClass114_20.method2805(); local15 != null; local15 = (Class5_Sub6) Static173.aClass114_20.method2814()) {
			if (local15.aBoolean36) {
				local15.method9052();
			} else {
				local15.aBoolean37 = true;
				if (local15.anInt548 >= 0 && local15.anInt547 >= 0 && local15.anInt548 < Static201.anInt3834 && Static626.anInt10238 > local15.anInt547) {
					Static340.method5190(local15);
				}
			}
		}
		for (local15 = (Class5_Sub6) Static256.aClass114_27.method2805(); local15 != null; local15 = (Class5_Sub6) Static256.aClass114_27.method2814()) {
			if (local15.aBoolean36) {
				local15.method9052();
			} else {
				local15.aBoolean37 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)I")
	public static int method212(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
