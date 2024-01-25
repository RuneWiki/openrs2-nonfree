import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "Lclient!vj;")
	public static Class2_Sub22 aClass2_Sub22_9;

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "Lclient!ir;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z")
	public static boolean method4777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static83.aClass177_3.method7866(arg2, arg0, arg1, Static421.anIntArray490);
		@Pc(13) int local13 = Static421.anIntArray490[2];
		if (local13 < 50) {
			return false;
		} else {
			Static421.anIntArray490[1] = Static79.anInt1416 + Static421.anIntArray490[1] * Static340.anInt5397 / local13;
			Static421.anIntArray490[0] = Static421.anIntArray490[0] * Static131.anInt10156 / local13 + Static99.anInt7119;
			Static421.anIntArray490[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method4778(@OriginalArg(0) Class95 arg0) {
		Static554.aClass91Array1 = new Class91[Static200.anIntArray222.length];
		for (@Pc(11) int local11 = 0; local11 < Static200.anIntArray222.length; local11++) {
			@Pc(17) int local17 = Static200.anIntArray222[local11];
			@Pc(22) Class256 local22 = Static3.method8590(Static343.aClass380_80, local17);
			@Pc(30) Class62 local30 = arg0.method6956(local22, Static655.method7422(Static144.aClass380_40, local17));
			Static554.aClass91Array1[local11] = new Class91(local30, local22);
		}
	}
}
