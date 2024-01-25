import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
	public static int anInt861;

	@OriginalMember(owner = "client!bda", name = "v", descriptor = "J")
	public static long aLong36 = -1L;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)V")
	public static void method756() {
		if (Static538.anInt8985 == 9) {
			Static51.method997(5);
		} else if (Static538.anInt8985 == 5 || Static538.anInt8985 == 6) {
			Static51.method997(3);
		} else if (Static538.anInt8985 == 12) {
			Static51.method997(3);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method758(@OriginalArg(0) Class87 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (Static558.aBoolean680) {
			local5 = Static257.method4233();
			local7 = Static290.method4545();
		}
		Static598.method2765(Static256.anInt5056, Static133.anInt3038, local7 + Static378.anInt6772, arg0, local5 + Static254.anInt5025);
		Static4.aClass64_1.method7508(local7 + Static378.anInt6772 + 14, Static628.aClass369_24.method8475(Static377.anInt6756), -1, local5 + Static254.anInt5025 + 3, -10660793);
		@Pc(59) int local59 = local5 + Static6.aClass40_1.method4504();
		@Pc(65) int local65 = Static6.aClass40_1.method4499() + local7;
		@Pc(69) int local69;
		@Pc(85) int local85;
		if (Static155.aBoolean303) {
			local69 = 0;
			for (@Pc(74) Class2_Sub5_Sub2 local74 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local74 != null; local74 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
				local85 = local69 * 16 + local7 + Static378.anInt6772 + 31;
				local69++;
				if (local74.anInt964 == 1) {
					Static427.method6421(-256, Static378.anInt6772 + local7, arg0, Static256.anInt5056, Static133.anInt3038, -1, local65, (Class2_Sub5_Sub20) local74.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66, local59, local5 + Static254.anInt5025, local85);
				} else {
					Static605.method8281(Static133.anInt3038, local85, local5 + Static254.anInt5025, local59, arg0, local65, Static378.anInt6772 + local7, Static256.anInt5056, local74, -1, -256);
				}
			}
			if (Static591.aClass2_Sub5_Sub2_1 != null) {
				Static598.method2765(Static67.anInt1403, Static63.anInt1369, Static320.anInt5800, arg0, Static331.anInt5908);
				Static4.aClass64_1.method7508(Static320.anInt5800 + 14, Static591.aClass2_Sub5_Sub2_1.aString8, -1, Static331.anInt5908 + 3, -10660793);
				local69 = 0;
				for (@Pc(173) Class2_Sub5_Sub20 local173 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4280(); local173 != null; local173 = (Class2_Sub5_Sub20) Static591.aClass2_Sub5_Sub2_1.aClass175_1.method4288()) {
					@Pc(183) int local183 = Static320.anInt5800 + local69 * 16 + 31;
					local69++;
					Static427.method6421(-256, Static320.anInt5800, arg0, Static67.anInt1403, Static63.anInt1369, -1, local65, local173, local59, Static331.anInt5908, local183);
				}
				Static7.method127(Static67.anInt1403, Static63.anInt1369, Static320.anInt5800, Static331.anInt5908);
			}
		} else {
			local69 = 0;
			for (@Pc(219) Class2_Sub5_Sub20 local219 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local219 != null; local219 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				local85 = (Static90.anInt1824 - local69 - 1) * 16 + Static378.anInt6772 + local7 + 31;
				local69++;
				Static427.method6421(-256, local7 + Static378.anInt6772, arg0, Static256.anInt5056, Static133.anInt3038, -1, local65, local219, local59, Static254.anInt5025 + local5, local85);
			}
		}
		Static7.method127(Static256.anInt5056, Static133.anInt3038, local7 + Static378.anInt6772, local5 + Static254.anInt5025);
	}
}
