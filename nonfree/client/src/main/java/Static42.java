import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!tr;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
	public static final int[] anIntArray123 = new int[50];

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!o;")
	public static final Class169 aClass169_36 = new Class169("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "[B")
	public static final byte[] aByteArray16 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method652(@OriginalArg(1) Class164 arg0) {
		@Pc(7) int local7 = Static90.anInt1655;
		@Pc(9) int local9 = Static38.anInt737;
		@Pc(11) int local11 = Static56.anInt1146;
		@Pc(15) int local15 = Static265.anInt4594 - 3;
		if (Static284.aClass51_15 == null || Static381.aClass51_22 == null) {
			if (Static145.aClass230_41.method4966(Static128.anInt2283) && Static145.aClass230_41.method4966(Static112.anInt1969)) {
				Static284.aClass51_15 = arg0.method5360(Static397.method1423(Static145.aClass230_41, Static128.anInt2283, 0));
				@Pc(46) Class80 local46 = Static397.method1423(Static145.aClass230_41, Static112.anInt1969, 0);
				Static381.aClass51_22 = arg0.method5360(local46);
				local46.method1422();
				Static152.aClass51_7 = arg0.method5360(local46);
			} else {
				arg0.method5321(local7, local9, local11, 20, 255 - Static186.anInt3266 << 24 | Static198.anInt3501, 1);
			}
		}
		@Pc(91) int local91;
		@Pc(89) int local89;
		if (Static284.aClass51_15 != null && Static381.aClass51_22 != null) {
			local89 = (local11 - Static381.aClass51_22.method4685() * 2) / Static284.aClass51_15.method4685();
			for (local91 = 0; local91 < local89; local91++) {
				Static284.aClass51_15.method4669(local7 + Static381.aClass51_22.method4685() + Static284.aClass51_15.method4685() * local91, local9);
			}
			Static381.aClass51_22.method4669(local7, local9);
			Static152.aClass51_7.method4669(local7 + local11 - Static152.aClass51_7.method4685(), local9);
		}
		Static101.aClass137_2.method5101(-1, Static39.aClass169_32.method3680(Static48.anInt952), local7 + 3, Static39.anInt749 | 0xFF000000, local9 + 14);
		arg0.method5321(local7, local9 + 20, local11, local15 - 20, -Static186.anInt3266 + 255 << 24 | Static198.anInt3501, 1);
		local89 = Static300.aClass182_1.method4112();
		local91 = Static300.aClass182_1.method4121();
		@Pc(176) int local176 = 0;
		@Pc(205) int local205;
		for (@Pc(188) Class1_Sub40 local188 = (Class1_Sub40) Static358.aClass17_66.method202(); local188 != null; local188 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			local205 = (Static215.anInt3678 - local176 - 1) * 16 + local9 + 13 + 20;
			local176++;
			if (local89 > local7 && local11 + local7 > local89 && local91 > local205 - 13 && local91 < local205 + 4 && local188.aBoolean509) {
				arg0.method5321(local7, local205 - 12, local11, 16, Static89.anInt1646 | 255 - Static26.anInt592 << 24, 1);
			}
		}
		if ((Static195.aClass51_23 == null || Static158.aClass51_6 == null || Static326.aClass51_17 == null) && Static145.aClass230_41.method4966(Static266.anInt4629) && Static145.aClass230_41.method4966(Static346.anInt5670) && Static145.aClass230_41.method4966(Static294.anInt5055)) {
			@Pc(283) Class80 local283 = Static397.method1423(Static145.aClass230_41, Static346.anInt5670, 0);
			Static158.aClass51_6 = arg0.method5360(local283);
			local283.method1422();
			Static361.aClass51_18 = arg0.method5360(local283);
			Static195.aClass51_23 = arg0.method5360(Static397.method1423(Static145.aClass230_41, Static266.anInt4629, 0));
			@Pc(308) Class80 local308 = Static397.method1423(Static145.aClass230_41, Static294.anInt5055, 0);
			Static326.aClass51_17 = arg0.method5360(local308);
			local308.method1422();
			Static274.aClass51_14 = arg0.method5360(local308);
		}
		@Pc(378) int local378;
		@Pc(339) int local339;
		if (Static195.aClass51_23 != null && Static158.aClass51_6 != null && Static326.aClass51_17 != null) {
			local205 = (local11 - Static326.aClass51_17.method4685() * 2) / Static195.aClass51_23.method4685();
			for (local339 = 0; local339 < local205; local339++) {
				Static195.aClass51_23.method4669(local7 + Static326.aClass51_17.method4685() + Static195.aClass51_23.method4685() * local339, local15 + local9 + -Static195.aClass51_23.method4681());
			}
			local378 = (local15 - Static326.aClass51_17.method4681() - 20) / Static158.aClass51_6.method4681();
			for (@Pc(380) int local380 = 0; local380 < local378; local380++) {
				Static158.aClass51_6.method4669(local7, Static158.aClass51_6.method4681() * local380 + local9 + 20);
				Static361.aClass51_18.method4669(local11 + local7 - Static361.aClass51_18.method4685(), local9 + (20 - -(Static158.aClass51_6.method4681() * local380)));
			}
			Static326.aClass51_17.method4669(local7, local15 + local9 - Static326.aClass51_17.method4681());
			Static274.aClass51_14.method4669(local11 + local7 - Static326.aClass51_17.method4685(), local9 + local15 + -Static326.aClass51_17.method4681());
		}
		local176 = 0;
		for (@Pc(451) Class1_Sub40 local451 = (Class1_Sub40) Static358.aClass17_66.method202(); local451 != null; local451 = (Class1_Sub40) Static358.aClass17_66.method207()) {
			local339 = local9 + (Static215.anInt3678 - (1 - -local176)) * 16 + 20 + 13;
			local378 = Static39.anInt749 | 0xFF000000;
			if (local7 < local89 && local89 < local7 + local11 && local91 > local339 - 13 && local91 < local339 + 4 && local451.aBoolean509) {
				local378 = Static145.anInt2703 | 0xFF000000;
			}
			@Pc(509) int[] local509 = null;
			if (Static5.method56(local451.anInt5411)) {
				local509 = Static263.aClass102_2.method2172((int) local451.aLong172).anIntArray261;
			} else if (local451.anInt5412 != -1) {
				local509 = Static263.aClass102_2.method2172(local451.anInt5412).anIntArray261;
			} else if (Static70.method1142(local451.anInt5411)) {
				@Pc(548) Class25_Sub1_Sub1_Sub2 local548 = Static171.aClass25_Sub1_Sub1_Sub2Array1[(int) local451.aLong172];
				if (local548 != null) {
					@Pc(553) Class59 local553 = local548.aClass59_1;
					if (local553.anIntArray186 != null) {
						local553 = local553.method1150(Static230.aClass72_3);
					}
					if (local553 != null) {
						local509 = local553.anIntArray188;
					}
				}
			} else if (Static265.method4069(local451.anInt5411)) {
				@Pc(585) Class236 local585;
				if (local451.anInt5411 == 1008) {
					local585 = Static54.aClass153_1.method3081((int) local451.aLong172);
				} else {
					local585 = Static54.aClass153_1.method3081((int) (local451.aLong172 >>> 32 & 0x7FFFFFFFL));
				}
				if (local585.anIntArray706 != null) {
					local585 = local585.method5074(Static230.aClass72_3);
				}
				if (local585 != null) {
					local509 = local585.anIntArray707;
				}
			}
			@Pc(614) String local614 = Static180.method2597(local451);
			if (local509 != null) {
				local614 = local614 + Static139.method2130(local509);
			}
			Static101.aClass137_2.method5109(local614, local7 + 3, local339, local378, Static87.anIntArray210, Static134.aClass51Array10);
			if (local451.aBoolean510) {
				Static294.aClass51_16.method4669(local7 + Static102.aClass110_3.method2413(local614) + 5, local339 + -12);
			}
			local176++;
		}
		Static232.method619(Static90.anInt1655, Static265.anInt4594, Static56.anInt1146, Static38.anInt737);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method655() {
		Static377.method5286();
	}
}
