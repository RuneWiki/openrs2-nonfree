import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ch;I)V")
	public static void method3294(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0) {
		@Pc(17) Class1_Sub22 local17 = (Class1_Sub22) Static155.aClass38_15.method765((long) arg0.anInt1299);
		if (local17 == null) {
			return;
		}
		if (local17.aClass1_Sub19_Sub4_3 != null) {
			Static12.aClass1_Sub19_Sub2_1.method3181(local17.aClass1_Sub19_Sub4_3);
			local17.aClass1_Sub19_Sub4_3 = null;
		}
		local17.method6178();
	}
}
