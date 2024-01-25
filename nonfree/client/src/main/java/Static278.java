import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!el;")
	public static final Class109 aClass109_108 = new Class109(1, -1);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)Z")
	public static boolean method4090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static526.aBoolean669) {
			return false;
		}
		@Pc(14) int local14 = arg1 >> 16;
		@Pc(26) int local26 = arg1 & 0xFFFF;
		if (Static489.aClass73ArrayArray2[local14] == null || Static489.aClass73ArrayArray2[local14][local26] == null) {
			return false;
		}
		@Pc(47) Class73 local47 = Static489.aClass73ArrayArray2[local14][local26];
		@Pc(64) Class5_Sub5_Sub19 local64;
		if (arg0 == -1 && local47.anInt1391 == 0) {
			for (local64 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local64 != null; local64 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				if (local64.anInt9210 == 17 || local64.anInt9210 == 1004 || local64.anInt9210 == 46 || local64.anInt9210 == 52 || local64.anInt9210 == 47) {
					for (@Pc(105) Class73 local105 = Static259.method3831(local64.anInt9207); local105 != null; local105 = Static446.method6636(local105)) {
						if (local47.anInt1388 == local105.anInt1388) {
							return true;
						}
					}
				}
			}
		} else {
			for (local64 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1916(); local64 != null; local64 = (Class5_Sub5_Sub19) Static199.aClass102_63.method1915()) {
				if (local64.anInt9213 == arg0 && local47.anInt1388 == local64.anInt9207 && (local64.anInt9210 == 17 || local64.anInt9210 == 1004 || local64.anInt9210 == 46 || local64.anInt9210 == 52 || local64.anInt9210 == 47)) {
					return true;
				}
			}
		}
		return false;
	}
}
