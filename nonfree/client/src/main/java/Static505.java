import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[Lclient!kg;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public static int anInt8017 = 0;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public static final int anInt8019 = 1408;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_117 = new Class349(63, -1);

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)[Lclient!mfa;")
	public static Class239[] method7161() {
		return new Class239[] { Static146.aClass239_5, Static726.aClass239_22, Static621.aClass239_20 };
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7162(@OriginalArg(0) Class145 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static392.aBoolean549) {
			local7 = Static637.method3733();
			local9 = Static400.method5900();
		}
		Static235.method3346(Static442.anInt7174, Static699.anInt10734, Static215.anInt3422 + local9, Static216.anInt3440 + local7, arg0);
		Static387.aClass68_12.method7882(local7 + Static216.anInt3440 + 3, -10660793, Static289.aClass191_24.method4067(Static414.anInt9485), local9 + Static215.anInt3422 + 14, -1);
		@Pc(65) int local65 = local7 + Static402.aClass138_1.method4767();
		@Pc(71) int local71 = Static402.aClass138_1.method4771() + local9;
		@Pc(75) int local75;
		@Pc(99) int local99;
		if (Static721.aBoolean939) {
			local75 = 0;
			for (@Pc(138) Class2_Sub6_Sub7 local138 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local138 != null; local138 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
				local99 = Static215.anInt3422 + local9 + local75 * 16 + 31;
				local75++;
				if (local138.anInt4448 == 1) {
					Static626.method8457(Static699.anInt10734, Static442.anInt7174, -256, arg0, local71, -1, local65, (Class2_Sub6_Sub20) local138.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64, Static215.anInt3422 + local9, Static216.anInt3440 + local7, local99);
				} else {
					Static267.method3770(Static699.anInt10734, local7 + Static216.anInt3440, local9 + Static215.anInt3422, local65, -256, -1, Static442.anInt7174, local71, local99, local138, arg0);
				}
			}
			if (Static671.aClass2_Sub6_Sub7_1 != null) {
				Static235.method3346(Static563.anInt8853, Static18.anInt242, Static555.anInt8749, Static261.anInt10711, arg0);
				local75 = 0;
				Static387.aClass68_12.method7882(Static261.anInt10711 + 3, -10660793, Static671.aClass2_Sub6_Sub7_1.aString51, Static555.anInt8749 + 14, -1);
				for (@Pc(240) Class2_Sub6_Sub20 local240 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9213(); local240 != null; local240 = (Class2_Sub6_Sub20) Static671.aClass2_Sub6_Sub7_1.aClass388_4.method9212()) {
					@Pc(252) int local252 = local75 * 16 + Static555.anInt8749 + 31;
					local75++;
					Static626.method8457(Static18.anInt242, Static563.anInt8853, -256, arg0, local71, -1, local65, local240, Static555.anInt8749, Static261.anInt10711, local252);
				}
				Static540.method7560(Static555.anInt8749, Static261.anInt10711, Static18.anInt242, Static563.anInt8853);
			}
		} else {
			local75 = 0;
			for (@Pc(82) Class2_Sub6_Sub20 local82 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local82 != null; local82 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				local99 = local9 + Static215.anInt3422 + (-local75 + Static535.anInt8486 - 1) * 16 + 31;
				Static626.method8457(Static699.anInt10734, Static442.anInt7174, -256, arg0, local71, -1, local65, local82, Static215.anInt3422 + local9, Static216.anInt3440 - -local7, local99);
				local75++;
			}
		}
		Static540.method7560(Static215.anInt3422 + local9, Static216.anInt3440 + local7, Static699.anInt10734, Static442.anInt7174);
	}
}
