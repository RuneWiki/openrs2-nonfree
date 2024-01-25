import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "[J")
	public static final long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_30 = new Class163(47, 2);

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	public static void method930() {
		if (Static230.aClass35_2 != Static238.aClass35_3) {
			try {
				Static473.method5059(Static382.aClient1, "tbrefresh");
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public static void method931(@OriginalArg(1) boolean arg0) {
		Static124.anInt2278 = 0;
		Static359.anInt6117 = 0;
		Static438.method2070();
		Static77.method1406(arg0);
		Static334.method4608();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static359.anInt6117; local20++) {
			local26 = Static453.anIntArray505[local20];
			@Pc(33) Class3_Sub40 local33 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local26);
			@Pc(36) Class1_Sub2_Sub6_Sub1 local36 = local33.aClass1_Sub2_Sub6_Sub1_2;
			if (Static367.aBoolean425 && Static32.method583(local26)) {
				Static149.method2338();
			}
			if (Static172.anInt3107 != local36.anInt7602) {
				if (local36.aClass158_1.method3710()) {
					Static186.method2925(local36);
				}
				local36.method5632(null);
				local18 = true;
				local33.method6288();
			}
		}
		if (local18) {
			Static76.anInt1390 = Static63.aClass140_37.method3492();
			Static63.aClass140_37.method3484(Static407.aClass3_Sub40Array1);
		}
		if (Static176.aClass3_Sub25_Sub1_1.anInt4974 != Static102.anInt1839) {
			throw new RuntimeException("gnp1 pos:" + Static176.aClass3_Sub25_Sub1_1.anInt4974 + " psize:" + Static102.anInt1839);
		}
		for (local26 = 0; local26 < Static379.anInt6398; local26++) {
			if (Static63.aClass140_37.method3490((long) Static198.anIntArray225[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static379.anInt6398);
			}
		}
	}
}
