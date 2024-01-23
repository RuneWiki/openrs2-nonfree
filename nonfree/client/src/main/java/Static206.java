import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
	public static int anInt4113;

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_9;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "[I")
	public static int[] anIntArray470 = new int[5];

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	public static void method3223() {
		Static205.aClass31_31.method850();
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)I")
	public static int method3225() {
		if ((double) Static57.aFloat32 == 3.0D) {
			return 37;
		} else if ((double) Static57.aFloat32 == 4.0D) {
			return 50;
		} else if ((double) Static57.aFloat32 == 6.0D) {
			return 75;
		} else if ((double) Static57.aFloat32 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	public static void method3226() {
		Static101.anInt1926 = 0;
		Static110.anInt2061 = 0;
		Static183.method4445();
		Static55.method928();
		Static278.method4270();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static110.anInt2061; local19++) {
			@Pc(30) int local30 = Static246.anIntArray395[local19];
			if (Static261.anInt5259 != Static211.aClass6_Sub6_Sub1Array2[local30].anInt4519) {
				if (Static211.aClass6_Sub6_Sub1Array2[local30].aClass19_1.method505()) {
					Static165.method2523(Static211.aClass6_Sub6_Sub1Array2[local30]);
				}
				Static211.aClass6_Sub6_Sub1Array2[local30].method3458(null);
				Static211.aClass6_Sub6_Sub1Array2[local30] = null;
			}
		}
		if (Static63.aClass1_Sub18_Sub1_1.anInt3911 != Static292.anInt5802) {
			throw new RuntimeException("gnp1 pos:" + Static63.aClass1_Sub18_Sub1_1.anInt3911 + " psize:" + Static292.anInt5802);
		}
		for (local19 = 0; local19 < Static293.anInt5831; local19++) {
			if (Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local19]] == null) {
				throw new RuntimeException("gnp2 pos:" + local19 + " size:" + Static293.anInt5831);
			}
		}
	}
}
