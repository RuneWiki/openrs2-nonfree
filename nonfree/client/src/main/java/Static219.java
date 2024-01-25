import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[Lclient!bl;")
	public static final Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array2 = new Class1_Sub1_Sub3[14];

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString177 = "Walk here";

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method3984() {
		if (Static168.aString145.toLowerCase().indexOf("microsoft") != -1) {
			Static184.anIntArray453[219] = 42;
			Static184.anIntArray453[221] = 43;
			Static184.anIntArray453[186] = 57;
			Static184.anIntArray453[192] = 58;
			Static184.anIntArray453[187] = 27;
			Static184.anIntArray453[220] = 74;
			Static184.anIntArray453[223] = 28;
			Static184.anIntArray453[191] = 73;
			Static184.anIntArray453[222] = 59;
			Static184.anIntArray453[188] = 71;
			Static184.anIntArray453[189] = 26;
			Static184.anIntArray453[190] = 72;
			return;
		}
		Static184.anIntArray453[93] = 43;
		if (Static168.aMethod2 == null) {
			Static184.anIntArray453[192] = 58;
			Static184.anIntArray453[222] = 59;
		} else {
			Static184.anIntArray453[520] = 59;
			Static184.anIntArray453[192] = 28;
			Static184.anIntArray453[222] = 58;
		}
		Static184.anIntArray453[91] = 42;
		Static184.anIntArray453[45] = 26;
		Static184.anIntArray453[46] = 72;
		Static184.anIntArray453[44] = 71;
		Static184.anIntArray453[47] = 73;
		Static184.anIntArray453[92] = 74;
		Static184.anIntArray453[59] = 57;
		Static184.anIntArray453[61] = 27;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	public static void method3991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static106.anInt2157 = 0;
		Static49.anInt1124 = 0;
		Static251.anInt6512 = arg1;
		Static291.anInt5657 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!aa;BLclient!to;)I")
	public static int method3992(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class199 arg1) {
		if (arg1.anInt5853 != -1) {
			return arg1.anInt5853;
		}
		if (arg1.anInt5861 != -1) {
			@Pc(31) Class215 local31 = Static62.anInterface7_1.method2788(arg0.method3305() ? arg1.anInt5861 : arg1.anInt5857);
			if (!local31.aBoolean570) {
				return local31.aShort90;
			}
		}
		return arg1.anInt5865;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method3994() {
		Static13.aClass140_10.method3813();
	}
}
