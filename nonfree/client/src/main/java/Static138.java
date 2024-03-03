import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 37)
	public static void method2705() {
		Class2_Sub3_Sub24.anInt4949 = 0;
		Class92.aClass135_19.method3545();
		Class92.aClass135_19.method3541(Static22.aClass2_Sub5_1);
		Class2_Sub3_Sub24.anInt4949++;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)Lclient!nf;", line = 90)
	public static Class12_Sub4 method2708(@OriginalArg(0) int arg0) {
		@Pc(15) Class36[] local15 = Class2_Sub43.aClass36Array1;
		synchronized (Class2_Sub43.aClass36Array1) {
			@Pc(35) Class12_Sub4 local35;
			if (Class2_Sub43.aClass36Array1.length <= arg0 || Class2_Sub43.aClass36Array1[arg0].method1416()) {
				local35 = new Class12_Sub4();
				local35.aClass12_Sub2Array1 = new Class12_Sub2[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass12_Sub2Array1[local41] = new Class12_Sub2();
				}
			} else {
				local35 = (Class12_Sub4) Class2_Sub43.aClass36Array1[arg0].method1419();
				local35.method5685();
				@Pc(74) int local74 = Class144.anIntArray224[arg0]--;
			}
			return local35;
		}
	}
}
