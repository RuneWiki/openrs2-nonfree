import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
	public static int anInt2935;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
	public static int anInt2936;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean method2687(@OriginalArg(0) Interface19 arg0) {
		@Pc(15) Class279 local15 = Static49.aClass155_2.method4063(arg0.method7915());
		if (local15.anInt8323 == -1) {
			return true;
		} else {
			@Pc(27) Class310 local27 = Static149.aClass292_2.method7212(local15.anInt8323);
			return local27.anInt9357 == -1 ? true : local27.method7756();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public static void method2688() {
		try {
			if (Static111.anInt2588 == 1) {
				@Pc(14) int local14 = Static493.aClass12_Sub13_Sub2_3.method4265();
				if (local14 > 0 && Static493.aClass12_Sub13_Sub2_3.method4264()) {
					local14 -= Static224.anInt8484;
					if (local14 < 0) {
						local14 = 0;
					}
					Static493.aClass12_Sub13_Sub2_3.method4262(local14);
				} else {
					Static493.aClass12_Sub13_Sub2_3.method4242();
					Static493.aClass12_Sub13_Sub2_3.method4256();
					Static108.aClass12_Sub45_1 = null;
					Static351.aClass132_1 = null;
					if (Static444.aClass16_104 == null) {
						Static111.anInt2588 = 0;
					} else {
						Static111.anInt2588 = 2;
					}
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static493.aClass12_Sub13_Sub2_3.method4242();
			Static351.aClass132_1 = null;
			Static111.anInt2588 = 0;
			Static444.aClass16_104 = null;
			Static108.aClass12_Sub45_1 = null;
		}
	}
}
