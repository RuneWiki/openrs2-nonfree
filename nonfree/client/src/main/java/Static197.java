import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!fi;ZI)I")
	public static int method2625(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		if (!Static55.method885(arg0).method5380(arg1) && arg0.anObjectArray13 == null) {
			return -1;
		} else if (arg0.anIntArray108 == null || arg0.anIntArray108.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray108[arg1];
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2626() {
		for (@Pc(14) Class5_Sub3 local14 = (Class5_Sub3) Static242.aClass177_24.method3618(); local14 != null; local14 = (Class5_Sub3) Static242.aClass177_24.method3619()) {
			if (local14.anInt335 == -1) {
				local14.anInt337 = 0;
				if (local14.anInt338 >= 0 && local14.anInt336 >= 0 && Static433.anInt7210 > local14.anInt338 && local14.anInt336 < Static418.anInt6969) {
					Static327.method862(local14);
				}
			} else {
				local14.method6003();
			}
		}
	}
}
