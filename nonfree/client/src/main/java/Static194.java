import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_48 = new Class71(58, 7);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method3639() {
		for (@Pc(6) Class8_Sub52 local6 = (Class8_Sub52) Static16.aClass253_3.method6593(); local6 != null; local6 = (Class8_Sub52) Static16.aClass253_3.method6595()) {
			if (local6.aBoolean757) {
				local6.aBoolean757 = false;
			} else {
				Static373.method7299(local6.anInt10660);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method3640(@OriginalArg(0) Class16 arg0) {
		if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 != Static599.anInt10218 && (Static405.aClass56ArrayArrayArray2 != null && Static17.method805(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, arg0))) {
			Static599.anInt10218 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public static void method3643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static468.anInt10554 == 1) {
			Static575.method7980(arg1, Static416.aClass8_Sub5_Sub7_3, arg0);
		} else if (Static468.anInt10554 == 2) {
			if (Static513.aBoolean642) {
				Static546.method7689(arg1 + Static550.method8313(), Static530.method7484() + arg0);
			} else {
				Static546.method7689(arg1, arg0);
			}
		}
		Static468.anInt10554 = 0;
		Static416.aClass8_Sub5_Sub7_3 = null;
	}
}
