import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2482 = Static118.method2249("sl_back");

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2483 = Static118.method2249("<col=00ff00>");

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2484 = Static118.method2249("<img=0>");

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2485 = Static118.method2249(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2486 = Static118.method2249("VOLL");

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method3166() {
		while (true) {
			if (Static1.aClass1_Sub14_Sub1_43.method1758(Static62.anInt1604) >= 27) {
				@Pc(10) int local10 = Static1.aClass1_Sub14_Sub1_43.method1756(15);
				if (local10 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static106.aClass6_Sub4_Sub2Array1[local10] == null) {
						Static106.aClass6_Sub4_Sub2Array1[local10] = new Class6_Sub4_Sub2();
						local17 = true;
					}
					@Pc(33) Class6_Sub4_Sub2 local33 = Static106.aClass6_Sub4_Sub2Array1[local10];
					Static72.anIntArray197[Static22.anInt659++] = local10;
					local33.anInt3975 = Static174.anInt3887;
					local33.aClass1_Sub2_Sub11_1 = Static114.method2108(Static1.aClass1_Sub14_Sub1_43.method1756(14));
					@Pc(57) int local57 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
					if (local57 == 1) {
						Static191.anIntArray474[Static95.anInt2376++] = local10;
					}
					@Pc(73) int local73 = Static1.aClass1_Sub14_Sub1_43.method1756(5);
					if (local73 > 15) {
						local73 -= 32;
					}
					@Pc(86) int local86 = Static142.anIntArray394[Static1.aClass1_Sub14_Sub1_43.method1756(3)];
					if (local17) {
						local33.anInt3965 = local33.anInt3971 = local86;
					}
					@Pc(99) int local99 = Static1.aClass1_Sub14_Sub1_43.method1756(1);
					@Pc(104) int local104 = Static1.aClass1_Sub14_Sub1_43.method1756(5);
					local33.anInt3969 = local33.aClass1_Sub2_Sub11_1.anInt1578;
					local33.anInt3932 = local33.aClass1_Sub2_Sub11_1.anInt1592;
					local33.anInt3981 = local33.aClass1_Sub2_Sub11_1.anInt1593;
					local33.anInt3939 = local33.aClass1_Sub2_Sub11_1.anInt1600;
					if (local104 > 15) {
						local104 -= 32;
					}
					local33.anInt3959 = local33.aClass1_Sub2_Sub11_1.anInt1595;
					local33.anInt3930 = local33.aClass1_Sub2_Sub11_1.anInt1587;
					local33.anInt3938 = local33.aClass1_Sub2_Sub11_1.anInt1590;
					local33.anInt3972 = local33.aClass1_Sub2_Sub11_1.anInt1583;
					if (local33.anInt3939 == 0) {
						local33.anInt3971 = 0;
					}
					local33.anInt3954 = local33.aClass1_Sub2_Sub11_1.anInt1603;
					local33.method2991(Static201.aClass6_Sub4_Sub1_3.anIntArray451[0] + local104, local99 == 1, Static201.aClass6_Sub4_Sub1_3.anIntArray455[0] + local73);
					continue;
				}
			}
			Static1.aClass1_Sub14_Sub1_43.method1755();
			return;
		}
	}
}
