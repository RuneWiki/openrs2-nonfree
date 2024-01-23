import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_788 = Static186.method3527("hitmarks");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public static int method1852(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method1854() {
		for (@Pc(7) int local7 = 0; local7 < Static223.anInt4343; local7++) {
			@Pc(13) int local13 = Static155.anIntArray332[local7]--;
			if (Static155.anIntArray332[local7] >= -10) {
				@Pc(82) Class71 local82 = Static27.aClass71Array1[local7];
				if (local82 == null) {
					local82 = Static240.method2006(Static38.aClass86_Sub1_6, Static148.anIntArray319[local7], 0);
					if (local82 == null) {
						continue;
					}
					Static155.anIntArray332[local7] += local82.method2007();
					Static27.aClass71Array1[local7] = local82;
				}
				if (Static155.anIntArray332[local7] < 0) {
					@Pc(202) int local202;
					if (Static204.anIntArray465[local7] == 0) {
						local202 = Static172.anInt3511;
					} else {
						@Pc(122) int local122 = (Static204.anIntArray465[local7] & 0xFF) * 128;
						@Pc(130) int local130 = Static204.anIntArray465[local7] >> 16 & 0xFF;
						@Pc(138) int local138 = Static204.anIntArray465[local7] >> 8 & 0xFF;
						@Pc(147) int local147 = local130 * 128 + 64 - Static230.aClass20_Sub3_Sub1_3.anInt3022;
						if (local147 < 0) {
							local147 = -local147;
						}
						@Pc(165) int local165 = local138 * 128 + 64 - Static230.aClass20_Sub3_Sub1_3.anInt3008;
						if (local165 < 0) {
							local165 = -local165;
						}
						@Pc(176) int local176 = local165 + local147 - 128;
						if (local122 < local176) {
							Static155.anIntArray332[local7] = -100;
							continue;
						}
						if (local176 < 0) {
							local176 = 0;
						}
						local202 = (local122 - local176) * Static146.anInt3076 / local122;
					}
					if (local202 > 0) {
						@Pc(213) Class1_Sub15_Sub1 local213 = local82.method2008().method2791(Static225.aClass8_1);
						@Pc(218) Class1_Sub12_Sub4 local218 = Static245.method3066(local213, local202);
						local218.method3041(Static10.anIntArray24[local7] - 1);
						Static226.aClass1_Sub12_Sub1_2.method895(local218);
					}
					Static155.anIntArray332[local7] = -100;
				}
			} else {
				Static223.anInt4343--;
				for (@Pc(29) int local29 = local7; local29 < Static223.anInt4343; local29++) {
					Static148.anIntArray319[local29] = Static148.anIntArray319[local29 + 1];
					Static27.aClass71Array1[local29] = Static27.aClass71Array1[local29 + 1];
					Static10.anIntArray24[local29] = Static10.anIntArray24[local29 + 1];
					Static155.anIntArray332[local29] = Static155.anIntArray332[local29 + 1];
					Static204.anIntArray465[local29] = Static204.anIntArray465[local29 + 1];
				}
				local7--;
			}
		}
		if (Static159.aBoolean199 && !Static68.method1007()) {
			if (Static152.anInt3168 != 0 && Static35.anInt737 != -1) {
				Static200.method3205(Static152.anInt3168, Static35.anInt737, Static58.aClass86_Sub1_9);
			}
			Static159.aBoolean199 = false;
		} else if (Static152.anInt3168 != 0 && Static35.anInt737 != -1 && !Static68.method1007()) {
			Static32.aClass1_Sub17_Sub1_1.method2182(186);
			Static32.aClass1_Sub17_Sub1_1.method2124(Static35.anInt737);
			Static35.anInt737 = -1;
		}
	}
}
