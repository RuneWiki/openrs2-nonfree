import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "I")
	public static int anInt1748;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!em;)V")
	public static void method1460(@OriginalArg(1) Class68 arg0) {
		if (Static245.anInt6498 == arg0.anInt2226) {
			Static243.aBooleanArray19[arg0.anInt2250] = true;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V")
	public static void method1461(@OriginalArg(0) boolean arg0) {
		Static141.anInt3016 = 0;
		Static121.anInt2701 = 0;
		Static408.method5376();
		Static218.method3412(arg0);
		Static86.method3568();
		@Pc(24) int local24;
		for (@Pc(18) int local18 = 0; local18 < Static141.anInt3016; local18++) {
			local24 = Static146.anIntArray271[local18];
			if (Static174.aClass3_Sub2_Sub1_Sub1Array1[local24].anInt6130 != Static131.anInt2821) {
				if (Static174.aClass3_Sub2_Sub1_Sub1Array1[local24].aClass65_1.method1707()) {
					Static417.method5540(Static174.aClass3_Sub2_Sub1_Sub1Array1[local24]);
				}
				Static174.aClass3_Sub2_Sub1_Sub1Array1[local24].method1426(null);
				Static174.aClass3_Sub2_Sub1_Sub1Array1[local24] = null;
			}
		}
		if (Static438.aClass2_Sub23_Sub2_2.anInt6952 != Static379.anInt6425) {
			throw new RuntimeException("gnp1 pos:" + Static438.aClass2_Sub23_Sub2_2.anInt6952 + " psize:" + Static379.anInt6425);
		}
		for (local24 = 0; local24 < Static62.anInt1371; local24++) {
			if (Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local24]] == null) {
				throw new RuntimeException("gnp2 pos:" + local24 + " size:" + Static62.anInt1371);
			}
		}
	}
}
