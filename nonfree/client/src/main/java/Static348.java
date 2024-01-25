import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Lclient!h;")
	public static final Class125 aClass125_50 = new Class125(64);

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	public static int anInt6539 = 0;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "[I")
	public static final int[] anIntArray456 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_98 = new Class45(73, -2);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BZ)V")
	public static void method5474(@OriginalArg(1) boolean arg0) {
		Static82.anInt1957 = 0;
		Static34.anInt757 = 0;
		Static68.method1557();
		Static300.method4832(arg0);
		Static395.method6208();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static82.anInt1957; local20++) {
			local26 = Static81.anIntArray183[local20];
			@Pc(33) Class12_Sub41 local33 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local26);
			@Pc(36) Class30_Sub1_Sub1_Sub2 local36 = local33.aClass30_Sub1_Sub1_Sub2_2;
			if (Static389.aBoolean533 && Static416.method8002(local26)) {
				Static544.method7975();
			}
			if (Static409.anInt7683 != local36.anInt4151) {
				if (local36.aClass130_1.method3563()) {
					Static183.method3613(local36);
				}
				local36.method3609(null);
				local33.method7967();
				local18 = true;
			}
		}
		if (local18) {
			Static328.anInt6238 = Static29.aClass68_7.method1925();
			Static29.aClass68_7.method1921(Static352.aClass12_Sub41Array1);
		}
		if (Static394.aClass12_Sub8_Sub2_2.anInt6217 != Static331.anInt6307) {
			throw new RuntimeException("gnp1 pos:" + Static394.aClass12_Sub8_Sub2_2.anInt6217 + " psize:" + Static331.anInt6307);
		}
		for (local26 = 0; local26 < Static451.anInt4553; local26++) {
			if (Static29.aClass68_7.method1917((long) Static11.anIntArray16[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static451.anInt4553);
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V")
	public static void method5475(@OriginalArg(0) int arg0) {
		Static265.anInt5303 = -1;
		Static153.anInt3358 = arg0;
		Static544.anInt9625 = -1;
		Static505.method7495();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method5476(@OriginalArg(0) int arg0, @OriginalArg(1) Class215 arg1) {
		Static51.aClass215Array6[arg0] = arg1;
	}
}
