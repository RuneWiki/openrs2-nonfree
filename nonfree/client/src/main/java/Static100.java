import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "Lclient!rk;")
	public static Class180 aClass180_29;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
	public static int anInt2437;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "Lclient!rk;")
	public static Class180 aClass180_30;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "Lclient!on;")
	public static final Class154 aClass154_1 = new Class154(64);

	@OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
	public static int anInt2433 = 10;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
	public static int anInt2434 = -1;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public static int anInt2435 = -1;

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
	public static int anInt2436 = 0;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
	public static int anInt2439 = -1;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	public static void method2029() {
		Static200.aClass7_Sub3_Sub2_3.method2808();
		@Pc(15) int local15 = Static200.aClass7_Sub3_Sub2_3.method2806(8);
		@Pc(24) int local24;
		if (Static11.anInt3203 > local15) {
			for (local24 = local15; local24 < Static11.anInt3203; local24++) {
				Static53.anIntArray207[Static69.anInt1716++] = Static257.anIntArray649[local24];
			}
		}
		if (Static11.anInt3203 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static11.anInt3203 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(62) int local62 = Static257.anIntArray649[local24];
			@Pc(66) Class22_Sub2_Sub1_Sub2 local66 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local62];
			@Pc(71) int local71 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			if (local71 == 0) {
				Static257.anIntArray649[Static11.anInt3203++] = local62;
				local66.anInt5096 = Static212.anInt4234;
			} else {
				@Pc(91) int local91 = Static200.aClass7_Sub3_Sub2_3.method2806(2);
				if (local91 == 0) {
					Static257.anIntArray649[Static11.anInt3203++] = local62;
					local66.anInt5096 = Static212.anInt4234;
					Static71.anIntArray241[Static85.anInt2209++] = local62;
				} else {
					@Pc(135) int local135;
					@Pc(149) int local149;
					if (local91 == 1) {
						Static257.anIntArray649[Static11.anInt3203++] = local62;
						local66.anInt5096 = Static212.anInt4234;
						local135 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
						local66.method4406(local135, 1);
						local149 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
						if (local149 == 1) {
							Static71.anIntArray241[Static85.anInt2209++] = local62;
						}
					} else if (local91 == 2) {
						Static257.anIntArray649[Static11.anInt3203++] = local62;
						local66.anInt5096 = Static212.anInt4234;
						if (Static200.aClass7_Sub3_Sub2_3.method2806(1) == 1) {
							local135 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local66.method4406(local135, 2);
							local149 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local66.method4406(local149, 2);
						} else {
							local135 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
							local66.method4406(local135, 0);
						}
						local135 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
						if (local135 == 1) {
							Static71.anIntArray241[Static85.anInt2209++] = local62;
						}
					} else if (local91 == 3) {
						Static53.anIntArray207[Static69.anInt1716++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
	public static void method2031(@OriginalArg(0) int arg0) {
		@Pc(18) Class7_Sub9 local18 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg0);
		if (local18 != null) {
			local18.method5648();
		}
	}
}
