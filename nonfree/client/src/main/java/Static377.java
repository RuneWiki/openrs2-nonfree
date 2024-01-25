import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!lr", name = "O", descriptor = "Lclient!iu;")
	public static Class181 aClass181_7;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZII)Z")
	public static boolean method5449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static361.method5177(arg0)) {
			return true;
		} else {
			return !Static361.method5177(arg1);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[[I)V")
	public static void method5450(@OriginalArg(1) int[][] arg0) {
		Static384.anIntArrayArray38 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	public static void method5452() {
		for (@Pc(1) int local1 = 0; local1 < Static612.anInt9915; local1++) {
			@Pc(6) Class19_Sub1_Sub3 local6 = Static339.aClass19_Sub1_Sub3Array1[local1];
			Static458.method6791(local6, true);
			Static339.aClass19_Sub1_Sub3Array1[local1] = null;
		}
		Static612.anInt9915 = 0;
	}
}
