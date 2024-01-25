import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	public static int anInt1983;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[Lclient!cq;)V")
	public static void method1626(@OriginalArg(1) Class8[] arg0) {
		Static228.anInt4755 = arg0.length;
		Static67.aClass8Array4 = new Class8[Static228.anInt4755 + 10];
		Static76.anIntArray117 = new int[Static228.anInt4755 + 10];
		Static361.method1850(arg0, 0, Static67.aClass8Array4, 0, Static228.anInt4755);
		for (@Pc(26) int local26 = 0; local26 < Static228.anInt4755; local26++) {
			Static76.anIntArray117[local26] = Static67.aClass8Array4[local26].method4395();
		}
		for (@Pc(53) int local53 = Static228.anInt4755; local53 < Static67.aClass8Array4.length; local53++) {
			Static76.anIntArray117[local53] = 12;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLclient!n;)V")
	public static void method1627(@OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class1_Sub43 local16 = (Class1_Sub43) Static102.aClass207_13.method5555((long) arg0.anInt4036);
		if (local16 == null) {
			return;
		}
		if (local16.aClass1_Sub31_Sub1_3 != null) {
			Static142.aClass1_Sub31_Sub2_1.method4444(local16.aClass1_Sub31_Sub1_3);
			local16.aClass1_Sub31_Sub1_3 = null;
		}
		local16.method5796();
	}
}
