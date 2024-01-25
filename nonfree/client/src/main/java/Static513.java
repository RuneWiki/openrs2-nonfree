import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	public static void method6950(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg1, 13);
		local9.method9256();
		local9.anInt10899 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)V")
	public static void method6951() {
		@Pc(15) Class3_Sub29 local15 = Static507.method6901(Static190.aClass144_109, Static95.aClass292_2.aClass88_2);
		Static95.aClass292_2.method6855(local15);
		for (@Pc(24) Class3_Sub20 local24 = (Class3_Sub20) Static432.aClass313_34.method7103(); local24 != null; local24 = (Class3_Sub20) Static432.aClass313_34.method7110()) {
			if (!local24.method9597()) {
				local24 = (Class3_Sub20) Static432.aClass313_34.method7103();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt2491 == 0) {
				Static46.method1229(true, true, local24);
			}
		}
		if (120 > 114 && Static710.aClass270_11 != null) {
			Static539.method7146(Static710.aClass270_11);
			Static710.aClass270_11 = null;
		}
	}
}
