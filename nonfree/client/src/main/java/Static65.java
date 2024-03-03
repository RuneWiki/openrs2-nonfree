import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZ)V", line = 11)
	public static void method1782(@OriginalArg(1) boolean arg0) {
		OutputStream_Sub1.anInt4443 = 0;
		Class226.anInt6378 = 0;
		Static292.method5383();
		Static17.method4211(arg0);
		Static219.method4113();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < OutputStream_Sub1.anInt4443; local18++) {
			local24 = Class12_Sub1_Sub1.anIntArray291[local18];
			if (Class83.anInt2345 != Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local24].anInt4601) {
				if (Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local24].aClass71_1.method2101()) {
					Static145.method2783(Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local24]);
				}
				Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local24].method4343(null);
				Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local24] = null;
			}
		}
		if (Class150.aClass2_Sub4_Sub2_3.anInt5289 != Class61.anInt1834) {
			throw new RuntimeException("gnp1 pos:" + Class150.aClass2_Sub4_Sub2_3.anInt5289 + " psize:" + Class61.anInt1834);
		}
		for (local24 = 0; local24 < Class117.anInt3183; local24++) {
			if (Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Class117.anInt3183);
			}
		}
	}
}
