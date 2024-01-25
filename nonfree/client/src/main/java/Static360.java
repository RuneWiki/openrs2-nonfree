import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!maa", name = "n", descriptor = "J")
	public static long aLong187;

	@OriginalMember(owner = "client!maa", name = "r", descriptor = "Lclient!nga;")
	public static Class237 aClass237_1;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_134 = new Class180(50, 20);

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_135 = new Class180(62, 7);

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
	public static int anInt5808 = 0;

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V")
	public static void method5284() {
		if (Static674.aClass13_22 == null) {
			return;
		}
		if (Static82.aBoolean134) {
			Static391.method8981();
		}
		Static645.aClass321_3.method7867();
		Static405.method5734();
		Static649.method8991();
		Static75.method1423();
		Static585.method8257();
		Static374.method5408();
		if (Static536.aClass206_5 != null) {
			Static536.aClass206_5.method5247();
		}
		Static246.method4106();
		Static429.method6182();
		Static181.method3236();
		Static243.method7723();
		Static460.method6706(false);
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class28_Sub1_Sub1_Sub1_Sub1 local47 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local41];
			if (local47 != null) {
				for (@Pc(51) int local51 = 0; local51 < local47.aClass95Array3.length; local51++) {
					local47.aClass95Array3[local51] = null;
				}
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static567.anInt5909; local76++) {
			@Pc(83) Class28_Sub1_Sub1_Sub1_Sub2 local83 = Static84.aClass3_Sub3Array1[local76].aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < local83.aClass95Array3.length; local87++) {
					local83.aClass95Array3[local87] = null;
				}
			}
		}
		Static63.aClass239_1 = null;
		Static101.aClass239_2 = null;
		Static674.aClass13_22.method8459();
		Static674.aClass13_22 = null;
	}
}
