import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt7969 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class103 method6847(@OriginalArg(0) int arg0) {
		@Pc(10) Class103[] local10 = Static237.method1621();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class103 local18 = local10[local12];
			if (local18.anInt2257 == arg0) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IC)Z")
	public static boolean method6848(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZB)V")
	public static void method6849() {
		@Pc(23) Class5_Sub50 local23 = Static457.method6722(Static516.aClass387_93, Static80.aClass313_1);
		Static494.method7120(local23);
		for (@Pc(31) Class5_Sub49 local31 = (Class5_Sub49) Static549.aClass291_37.method6987(); local31 != null; local31 = (Class5_Sub49) Static549.aClass291_37.method6989()) {
			if (!local31.method9326()) {
				local31 = (Class5_Sub49) Static549.aClass291_37.method6987();
				if (local31 == null) {
					break;
				}
			}
			if (local31.anInt9318 == 0) {
				Static372.method7048(local31, true, true);
			}
		}
		if (Static24.aClass73_3 != null) {
			Static298.method4399(Static24.aClass73_3);
			Static24.aClass73_3 = null;
		}
	}
}
