import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "Lclient!uu;")
	public static Class343 aClass343_57;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	public static int anInt2182 = -1;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public static void method1800() {
		Static585.anInt9494 = 0;
		Static493.anInt8364 = 0;
		Static648.anInt10294++;
		Static546.method7845();
		Static338.method5439();
		Static38.method707();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static493.anInt8364; local23++) {
			local29 = Static455.anIntArray478[local23];
			@Pc(36) Class3_Sub43 local36 = (Class3_Sub43) Static545.aClass25_40.method426((long) local29);
			@Pc(39) Class9_Sub2_Sub1_Sub2_Sub2 local39 = local36.aClass9_Sub2_Sub1_Sub2_Sub2_2;
			if (Static253.aBoolean362 && Static460.method6834(local29)) {
				Static303.method7247();
			}
			if (local39.anInt10198 != Static648.anInt10294) {
				if (local39.aClass309_1.method7589()) {
					Static250.method6647(local39);
				}
				local39.method8644((Class309) null);
				local36.method8682();
				local21 = true;
			}
		}
		if (local21) {
			Static73.anInt1445 = Static545.aClass25_40.method430();
			Static545.aClass25_40.method431(Static179.aClass3_Sub43Array1);
		}
		if (Static94.anInt1852 != Static47.aClass3_Sub9_Sub2_1.anInt6453) {
			throw new RuntimeException("gnp1 pos:" + Static47.aClass3_Sub9_Sub2_1.anInt6453 + " psize:" + Static94.anInt1852);
		}
		for (local29 = 0; local29 < Static596.anInt9702; local29++) {
			if (Static545.aClass25_40.method426((long) Static43.anIntArray50[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static596.anInt9702);
			}
		}
		if (Static73.anInt1445 - Static596.anInt9702 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static73.anInt1445 - Static596.anInt9702));
		}
		for (@Pc(177) int local177 = 0; local177 < Static73.anInt1445; local177++) {
			if (Static648.anInt10294 != Static179.aClass3_Sub43Array1[local177].aClass9_Sub2_Sub1_Sub2_Sub2_2.anInt10198) {
				throw new RuntimeException("gnp4 uk:" + Static179.aClass3_Sub43Array1[local177].aClass9_Sub2_Sub1_Sub2_Sub2_2.anInt10204);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
	public static boolean method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public static void method1802() {
		Static77.method1329();
	}
}
