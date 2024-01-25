import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Lclient!mi;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Lclient!mg;")
	public static Class160 aClass160_34;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZII)Z")
	public static boolean method2957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static123.aBoolean212) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static60.aClass68ArrayArray1[local13] == null || Static60.aClass68ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class68 local40 = Static60.aClass68ArrayArray1[local13][local17];
		@Pc(54) Class2_Sub22 local54;
		if (arg1 == -1 && local40.anInt2249 == 0) {
			for (local54 = (Class2_Sub22) Static248.aClass14_35.method309(); local54 != null; local54 = (Class2_Sub22) Static248.aClass14_35.method311()) {
				if (local54.anInt3716 == 57 || local54.anInt3716 == 1003 || local54.anInt3716 == 15 || local54.anInt3716 == 9 || local54.anInt3716 == 4) {
					for (@Pc(148) Class68 local148 = Static165.method2704(local54.anInt3719); local148 != null; local148 = Static71.method1332(local148)) {
						if (local40.anInt2229 == local148.anInt2229) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class2_Sub22) Static248.aClass14_35.method309(); local54 != null; local54 = (Class2_Sub22) Static248.aClass14_35.method311()) {
				if (local54.anInt3715 == arg1 && local54.anInt3719 == local40.anInt2229 && (local54.anInt3716 == 57 || local54.anInt3716 == 1003 || local54.anInt3716 == 15 || local54.anInt3716 == 9 || local54.anInt3716 == 4)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	public static void method2962() {
		Static68.anInt5456 = 0;
		@Pc(16) int local16 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7) + Static48.anInt962;
		@Pc(23) int local23 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7) + Static324.anInt5624;
		if (local16 >= 3053 && local16 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static68.anInt5456 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static68.anInt5456 = 1;
		}
		if (Static68.anInt5456 == 1 && local16 >= 3139 && local16 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static68.anInt5456 = 0;
		}
	}
}
