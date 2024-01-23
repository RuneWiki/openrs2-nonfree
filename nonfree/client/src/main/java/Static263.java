import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[J")
	public static long[] aLongArray10 = new long[1000];

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!qc;")
	public static Class135 aClass135_37 = new Class135(64);

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt5153 = 0;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Lclient!ik;")
	public static Class70 aClass70_19 = new Class70(512);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub18 local8 = Static130.method2227(arg0, 6);
		local8.method3905();
		local8.anInt5005 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method4038() {
		Static68.anInt1450 = 0;
		Static1.anInt4241 = 0;
		Static75.method1308();
		Static30.method2672();
		Static233.method3605();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static68.anInt1450; local17++) {
			@Pc(28) int local28 = Static59.anIntArray358[local17];
			if (Static254.aClass14_Sub2_Sub2Array1[local28].anInt4645 != Static237.anInt4710) {
				if (Static254.aClass14_Sub2_Sub2Array1[local28].aClass46_1.method1271()) {
					Static152.method2618(Static254.aClass14_Sub2_Sub2Array1[local28]);
				}
				Static254.aClass14_Sub2_Sub2Array1[local28].method3663(null);
				Static254.aClass14_Sub2_Sub2Array1[local28] = null;
			}
		}
		if (Static187.aClass1_Sub11_Sub1_2.anInt3264 != Static33.anInt762) {
			throw new RuntimeException("gnp1 pos:" + Static187.aClass1_Sub11_Sub1_2.anInt3264 + " psize:" + Static33.anInt762);
		}
		for (local17 = 0; local17 < Static233.anInt4582; local17++) {
			if (Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static233.anInt4582);
			}
		}
	}
}
