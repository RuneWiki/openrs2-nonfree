import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!rha", name = "m", descriptor = "J")
	public static long aLong257 = 20000000L;

	@OriginalMember(owner = "client!rha", name = "n", descriptor = "[I")
	public static int[] anIntArray497 = new int[1];

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([Lclient!cn;IB)V")
	public static void method7463(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class73 local18 = arg0[local12];
			if (local18 != null && local18.anInt1410 == arg1 && !Static81.method1261(local18)) {
				if (local18.anInt1391 == 0) {
					method7463(arg0, local18.anInt1388);
					if (local18.aClass73Array1 != null) {
						method7463(local18.aClass73Array1, local18.anInt1388);
					}
					@Pc(65) Class5_Sub49 local65 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local18.anInt1388, 1);
					if (local65 != null) {
						Static91.method1356(local65.anInt9322);
					}
				}
				if (local18.anInt1391 == 6 && local18.anInt1401 != -1) {
					@Pc(92) Class165 local92 = Static158.aClass317_1.method7882(local18.anInt1401, 100);
					if (local92 != null) {
						local18.anInt1338 += Static315.anInt5591;
						@Pc(103) int local103 = local18.anInt1335;
						while (local92.anIntArray225[local18.anInt1335] < local18.anInt1338) {
							local18.anInt1338 -= local92.anIntArray225[local18.anInt1335];
							local18.anInt1335++;
							if (local92.anIntArray226.length <= local18.anInt1335) {
								local18.anInt1335 -= local92.anInt3907;
								if (local18.anInt1335 < 0 || local18.anInt1335 >= local92.anIntArray226.length) {
									local18.anInt1335 = 0;
								}
							}
							local18.anInt1373 = local18.anInt1335 + 1;
							if (local92.anIntArray226.length <= local18.anInt1373) {
								local18.anInt1373 -= local92.anInt3907;
								if (local18.anInt1373 < 0 || local18.anInt1373 >= local92.anIntArray226.length) {
									local18.anInt1373 = -1;
								}
							}
							Static298.method4399(local18);
						}
						if (local103 != local18.anInt1335) {
							Static388.method5661(local18.anInt1335, local92);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)V")
	public static void method7465() {
		Static161.aClass134_21 = null;
		Static94.anInt1545 = -1;
	}
}
