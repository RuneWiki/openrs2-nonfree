import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!hia;")
	public static Class70 aClass70_3;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	public static int anInt9334;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_6 = new Class152(4, 1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)Z")
	public static boolean method8232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static189.aBoolean301) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static581.aClass273ArrayArray2[local21] == null || Static581.aClass273ArrayArray2[local21][local25] == null) {
			return false;
		}
		@Pc(46) Class273 local46 = Static581.aClass273ArrayArray2[local21][local25];
		@Pc(60) Class2_Sub6_Sub20 local60;
		if (arg1 == -1 && local46.anInt7371 == 0) {
			for (local60 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local60 != null; local60 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				if (local60.anInt9603 == 9 || local60.anInt9603 == 1001 || local60.anInt9603 == 52 || local60.anInt9603 == 47 || local60.anInt9603 == 58) {
					for (@Pc(97) Class273 local97 = Static417.method6111(local60.anInt9599); local97 != null; local97 = Static407.method6010(local97)) {
						if (local46.anInt7350 == local97.anInt7350) {
							return true;
						}
					}
				}
			}
		} else {
			for (local60 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local60 != null; local60 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				if (local60.anInt9598 == arg1 && local60.anInt9599 == local46.anInt7350 && (local60.anInt9603 == 9 || local60.anInt9603 == 1001 || local60.anInt9603 == 52 || local60.anInt9603 == 47 || local60.anInt9603 == 58)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method8234() {
		Static347.aClass85_39.method1748();
	}
}
