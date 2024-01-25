import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!av;B)V")
	public static void method6883(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0) {
		@Pc(17) Class1_Sub37 local17 = (Class1_Sub37) Static61.aClass230_11.method6144((long) arg0.anInt8969);
		if (local17 == null) {
			return;
		}
		if (local17.aClass1_Sub4_Sub1_3 != null) {
			Static475.aClass1_Sub4_Sub2_2.method3184(local17.aClass1_Sub4_Sub1_3);
			local17.aClass1_Sub4_Sub1_3 = null;
		}
		local17.method8239();
	}
}
