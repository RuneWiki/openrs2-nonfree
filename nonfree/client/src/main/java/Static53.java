import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!th;")
	public static Class168 aClass168_41;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt1200 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public static void method1009() {
		while (true) {
			if (Static140.aClass1_Sub14_Sub1_2.method2253(Static188.anInt4164) >= 11) {
				@Pc(25) int local25 = Static140.aClass1_Sub14_Sub1_2.method2251(11);
				if (local25 != 2047) {
					@Pc(32) boolean local32 = false;
					if (Static155.aClass2_Sub4_Sub2Array1[local25] == null) {
						local32 = true;
						Static155.aClass2_Sub4_Sub2Array1[local25] = new Class2_Sub4_Sub2();
						if (Static62.aClass1_Sub14Array1[local25] != null) {
							Static155.aClass2_Sub4_Sub2Array1[local25].method2108(Static62.aClass1_Sub14Array1[local25], local25);
						}
					}
					Static304.anIntArray533[Static16.anInt461++] = local25;
					@Pc(72) Class2_Sub4_Sub2 local72 = Static155.aClass2_Sub4_Sub2Array1[local25];
					local72.anInt2824 = Static133.anInt3061;
					@Pc(82) int local82 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
					@Pc(87) int local87 = Static140.aClass1_Sub14_Sub1_2.method2251(5);
					@Pc(92) int local92 = Static140.aClass1_Sub14_Sub1_2.method2251(5);
					if (local87 > 15) {
						local87 -= 32;
					}
					if (local92 > 15) {
						local92 -= 32;
					}
					@Pc(112) int local112 = Static37.anIntArray119[Static140.aClass1_Sub14_Sub1_2.method2251(3)];
					if (local32) {
						local72.anInt2823 = local72.anInt2766 = local112;
					}
					@Pc(126) int local126 = Static140.aClass1_Sub14_Sub1_2.method2251(1);
					if (local126 == 1) {
						Static100.anIntArray223[Static242.anInt5012++] = local25;
					}
					local72.method2110(Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] + local87, Static56.aClass2_Sub4_Sub2_1.anIntArray286[0] - -local92, local82 == 1);
					continue;
				}
			}
			Static140.aClass1_Sub14_Sub1_2.method2256();
			return;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub3_Sub22 local15 = Static271.method4108(7, arg1);
		local15.method4468();
		local15.anInt5852 = arg0;
	}
}
