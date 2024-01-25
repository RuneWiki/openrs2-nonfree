import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	public static int anInt5368 = 503;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)Z")
	public static boolean method4729(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method4730(@OriginalArg(1) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static423.aBoolean517) {
			local7 = Static383.method8455();
			local9 = Static286.method4120();
		}
		@Pc(26) int local26 = Static357.anInt5417 + local7;
		@Pc(30) int local30 = Static430.anInt6771 + local9;
		@Pc(32) int local32 = Static506.anInt7915;
		@Pc(36) int local36 = Static342.anInt8649 - 3;
		Static639.method8543(Static342.anInt8649, Static357.anInt5417 + local7, Static430.anInt6771 + local9, Static506.anInt7915, Static279.aClass179_24.method4066(Static164.anInt2984), arg0);
		@Pc(63) int local63 = Static373.aClass161_1.method5903() + local7;
		@Pc(70) int local70 = Static373.aClass161_1.method5898() + local9;
		@Pc(74) int local74;
		@Pc(79) Class4_Sub5_Sub17 local79;
		@Pc(97) int local97;
		@Pc(291) int local291;
		@Pc(171) Class4_Sub5_Sub12 local171;
		@Pc(278) Class4_Sub5_Sub17 local278;
		if (Static19.aBoolean35) {
			local74 = 0;
			for (local171 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local171 != null; local171 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
				local97 = local30 + local74 * 16 + 20 + 13;
				local74++;
				if (Static357.anInt5417 + local7 < local63 && local63 < Static357.anInt5417 + local7 + Static506.anInt7915 && local70 > local97 - 13 && local97 + 4 > local70 && (local171.anInt4687 > 1 || ((Class4_Sub5_Sub17) local171.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67).aBoolean599)) {
					arg0.aa(Static357.anInt5417 + local7, local97 + -12, Static506.anInt7915, 16, Static6.anInt86 | 255 - Static465.anInt7433 << 24, 1);
				}
			}
			if (Static581.aClass4_Sub5_Sub12_1 != null) {
				Static639.method8543(Static485.anInt7635, Static398.anInt5803, Static587.anInt9057, Static4.anInt76, Static581.aClass4_Sub5_Sub12_1.aString45, arg0);
				local74 = 0;
				for (local278 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8308(); local278 != null; local278 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8309()) {
					local291 = local74 * 16 + Static587.anInt9057 + 13 + 20;
					local74++;
					if (Static398.anInt5803 < local63 && local63 < Static4.anInt76 + Static398.anInt5803 && local70 > local291 - 13 && local291 + 4 > local70 && local278.aBoolean599) {
						arg0.aa(Static398.anInt5803, local291 - 12, Static4.anInt76, 16, 255 - Static465.anInt7433 << 24 | Static6.anInt86, 1);
					}
				}
				Static673.method8937(Static398.anInt5803, arg0, Static4.anInt76, Static485.anInt7635, Static587.anInt9057);
			}
		} else {
			local74 = 0;
			for (local79 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local79 != null; local79 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				local97 = local30 + (-local74 + -1 + Static574.anInt8895) * 16 + 20 + 13;
				if (Static357.anInt5417 + local7 < local63 && local63 < local7 + Static357.anInt5417 + Static506.anInt7915 && local70 > local97 - 13 && local70 < local97 + 4 && local79.aBoolean599) {
					arg0.aa(Static357.anInt5417 + local7, local97 - 12, Static506.anInt7915, 16, 255 - Static465.anInt7433 << 24 | Static6.anInt86, 1);
				}
				local74++;
			}
		}
		Static673.method8937(Static357.anInt5417 + local7, arg0, Static506.anInt7915, Static342.anInt8649, local9 + Static430.anInt6771);
		if (Static19.aBoolean35) {
			local74 = 0;
			for (local171 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local171 != null; local171 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
				local97 = Static430.anInt6771 + local9 + local74 * 16 + 33;
				if (local171.anInt4687 == 1) {
					Static239.method3539(local63, Static430.anInt6771 + local9, local70, arg0, Static222.anInt7628 | 0xFF000000, Static342.anInt8649, (Class4_Sub5_Sub17) local171.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67, Static506.anInt7915, local97, local7 + Static357.anInt5417, Static294.anInt4652 | 0xFF000000);
				} else {
					Static219.method3256(arg0, Static506.anInt7915, local97, Static430.anInt6771 + local9, local63, Static294.anInt4652 | 0xFF000000, local171, local70, Static357.anInt5417 + local7, Static342.anInt8649, Static222.anInt7628 | 0xFF000000);
				}
				local74++;
			}
			if (Static581.aClass4_Sub5_Sub12_1 != null) {
				local74 = 0;
				for (local278 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8308(); local278 != null; local278 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8309()) {
					local291 = local74 * 16 + Static587.anInt9057 + 20 + 13;
					Static239.method3539(local63, Static587.anInt9057, local70, arg0, Static222.anInt7628 | 0xFF000000, Static485.anInt7635, local278, Static4.anInt76, local291, Static398.anInt5803, Static294.anInt4652 | 0xFF000000);
					local74++;
				}
				Static39.method4896(Static398.anInt5803, Static4.anInt76, Static587.anInt9057, Static485.anInt7635);
			}
		} else {
			local74 = 0;
			for (local79 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local79 != null; local79 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				local97 = local30 + (Static574.anInt8895 - (1 - -local74)) * 16 + 33;
				Static239.method3539(local63, local30, local70, arg0, Static222.anInt7628 | 0xFF000000, local36, local79, local32, local97, local26, Static294.anInt4652 | 0xFF000000);
				local74++;
			}
		}
		Static39.method4896(local7 + Static357.anInt5417, Static506.anInt7915, Static430.anInt6771 + local9, Static342.anInt8649);
	}
}
