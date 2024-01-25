import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_31 = new Class47(42, 3);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIII)V")
	public static void method1378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class262[] local12 = Static434.aClass262Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class262 local20 = local12[local14];
			if (local20 != null && local20.anInt7229 == 2) {
				Static134.method2627(local20.anInt7231, arg1 >> 1, local20.anInt7234 * 2, local20.anInt7232, local20.anInt7235, arg0 >> 1);
				if (Static373.anIntArray490[0] > -1 && Static312.anInt5688 % 20 < 10) {
					Static188.aClass58Array8[local20.anInt7227].method7666(arg2 + Static373.anIntArray490[0] - 12, Static373.anIntArray490[1] + -28 + arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)V")
	public static void method1379() {
		@Pc(7) Class40[] local7 = Class128.aClass40Array1;
		synchronized (Class128.aClass40Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class128.aClass40Array1.length; local16++) {
				Class128.aClass40Array1[local16] = new Class40();
				Static541.anIntArray496[local16] = 0;
			}
		}
	}
}
