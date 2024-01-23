import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt497;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt502;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt499 = -1;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[I")
	public static int[] anIntArray89 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!oe;Z)V")
	public static void method364(@OriginalArg(0) Class72 arg0) {
		Static67.aClass79_Sub1Array3 = Static102.method1745(Static131.anInt2978, arg0);
		Static2.aClass2_Sub3_Sub8_Sub1Array1 = Static185.method3429(Static64.anInt1249, arg0);
		Static84.aClass2_Sub3_Sub8Array5 = Static95.method1661(arg0, Static19.anInt362);
		Static95.method1661(arg0, Static154.anInt3543);
		Static209.aClass2_Sub3_Sub8Array10 = Static95.method1661(arg0, anInt502);
		Static158.aClass2_Sub3_Sub8Array7 = Static95.method1661(arg0, Static48.anInt870);
		Static161.aClass2_Sub3_Sub8Array8 = Static74.method1234(arg0, Static23.anInt420);
		Static53.aClass2_Sub3_Sub8Array4 = Static74.method1234(arg0, Static35.anInt584);
		Static70.aClass2_Sub3_Sub8_6 = Static190.method3496(Static213.anInt2030, arg0);
		Static221.aClass2_Sub3_Sub8Array12 = Static74.method1234(arg0, Static178.anInt4146);
		Static176.aClass2_Sub3_Sub8Array11 = Static74.method1234(arg0, Static199.anInt4490);
		Static226.aClass79Array8 = Static59.method767(arg0, Static226.anInt4897);
		Static73.aClass79Array5 = Static59.method767(arg0, Static111.anInt2450);
		Static110.aClass2_Sub3_Sub7_2.method880(Static73.aClass79Array5, null);
		Static211.aClass2_Sub3_Sub7_3.method880(Static73.aClass79Array5, null);
		Static75.aClass2_Sub3_Sub7_1.method880(Static73.aClass79Array5, null);
		@Pc(106) Class2_Sub3_Sub8_Sub1 local106 = Static103.method1781(Static108.anInt2401, arg0);
		local106.method2274();
		Static12.aClass2_Sub3_Sub8_1 = local106;
		@Pc(116) Class2_Sub3_Sub8_Sub1[] local116 = Static185.method3429(Static116.anInt2728, arg0);
		for (@Pc(118) int local118 = 0; local118 < local116.length; local118++) {
			local116[local118].method2274();
		}
		Static12.aClass2_Sub3_Sub8Array1 = local116;
		@Pc(138) int local138 = (int) (Math.random() * 21.0D) - 10;
		@Pc(145) int local145 = (int) (Math.random() * 21.0D) - 10;
		@Pc(152) int local152 = (int) (Math.random() * 21.0D) - 10;
		@Pc(159) int local159 = (int) (Math.random() * 41.0D) - 20;
		for (@Pc(161) int local161 = 0; local161 < Static2.aClass2_Sub3_Sub8_Sub1Array1.length; local161++) {
			Static2.aClass2_Sub3_Sub8_Sub1Array1[local161].method2272(local159 + local138, local159 + local152, local159 + local145);
		}
		Static67.aClass79_Sub1Array3[0].method3075(local138 + local159, local159 + local152, local145 + local159);
		Static36.aClass2_Sub3_Sub8Array2 = Static2.aClass2_Sub3_Sub8_Sub1Array1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method365() {
		Static186.anIntArray702 = null;
		Static31.aByteArrayArray3 = null;
		Static198.anIntArray725 = null;
		Static113.anIntArray423 = null;
		Static131.anIntArray489 = null;
		Static37.anIntArray108 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method366() {
		if (Static226.anInt4903 == 30) {
			Static125.method1281(25);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method368() {
		Static14.aClass53_13.method1797();
	}
}
