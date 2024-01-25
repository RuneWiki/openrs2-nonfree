import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_56 = new Class70(27, -1);

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_32 = new Class353();

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "[Lclient!bba;")
	public static final Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array4 = new Class1_Sub6_Sub1[14];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IBI)V")
	public static void method4308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub6_Sub16 local12 = Static212.method3332(13, arg0);
		local12.method6594();
		local12.anInt8204 = arg1;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!mo;)Lclient!caa;")
	public static Class43_Sub1 method4309(@OriginalArg(1) Class1_Sub35 arg0) {
		return new Class43_Sub1(arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5797(), arg0.method5797(), arg0.method5750());
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
	public static void method4311() {
		Static585.aClass1_Sub35_Sub2_2.method5809();
		@Pc(15) int local15 = Static585.aClass1_Sub35_Sub2_2.method5806(8);
		@Pc(24) int local24;
		if (Static39.anInt609 > local15) {
			for (local24 = local15; local24 < Static39.anInt609; local24++) {
				Static428.anIntArray573[Static4.anInt56++] = Static17.anIntArray24[local24];
			}
		}
		if (Static39.anInt609 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static39.anInt609 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(71) int local71 = Static17.anIntArray24[local24];
			@Pc(79) Class8_Sub3_Sub3_Sub1_Sub2 local79 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) local71)).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			@Pc(84) int local84 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
			if (local84 == 0) {
				Static17.anIntArray24[Static39.anInt609++] = local71;
				local79.anInt6780 = Static301.anInt5197;
			} else {
				@Pc(104) int local104 = Static585.aClass1_Sub35_Sub2_2.method5806(2);
				if (local104 == 0) {
					Static17.anIntArray24[Static39.anInt609++] = local71;
					local79.anInt6780 = Static301.anInt5197;
					Static283.anIntArray376[Static429.anInt7505++] = local71;
				} else {
					@Pc(151) int local151;
					@Pc(161) int local161;
					if (local104 == 1) {
						Static17.anIntArray24[Static39.anInt609++] = local71;
						local79.anInt6780 = Static301.anInt5197;
						local151 = Static585.aClass1_Sub35_Sub2_2.method5806(3);
						local79.method5442(1, local151);
						local161 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
						if (local161 == 1) {
							Static283.anIntArray376[Static429.anInt7505++] = local71;
						}
					} else if (local104 == 2) {
						Static17.anIntArray24[Static39.anInt609++] = local71;
						local79.anInt6780 = Static301.anInt5197;
						if (Static585.aClass1_Sub35_Sub2_2.method5806(1) == 1) {
							local151 = Static585.aClass1_Sub35_Sub2_2.method5806(3);
							local79.method5442(2, local151);
							local161 = Static585.aClass1_Sub35_Sub2_2.method5806(3);
							local79.method5442(2, local161);
						} else {
							local151 = Static585.aClass1_Sub35_Sub2_2.method5806(3);
							local79.method5442(0, local151);
						}
						local151 = Static585.aClass1_Sub35_Sub2_2.method5806(1);
						if (local151 == 1) {
							Static283.anIntArray376[Static429.anInt7505++] = local71;
						}
					} else if (local104 == 3) {
						Static428.anIntArray573[Static4.anInt56++] = local71;
					}
				}
			}
		}
	}
}
