import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array11;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_44;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Lclient!cf;")
	public static Class12 aClass12_16 = new Class12();

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1603 = Static51.method932("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
	public static int[] anIntArray421 = new int[500];

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1604 = Static51.method932("glow3:");

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1605 = Static51.method932("Username: ");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1606 = aClass10_1604;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1607 = aClass10_1604;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1608 = aClass10_1605;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1609 = Static51.method932("<col=ffffff>");

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1610 = Static51.method932("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BI)I")
	public static int method2697(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static14.method224(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!cd;I)V")
	public static void method2698(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class10 local7 = arg0.method364().method361();
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < Static54.anInt1354; local19++) {
			@Pc(27) Class2_Sub1_Sub3_Sub2_Sub1 local27 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[Static66.anIntArray175[local19]];
			if (local27 != null && local27.aClass10_598 != null && local27.aClass10_598.method343(local7)) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local27.anIntArray365[0], 0, 1, 2, local27.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				if (arg1 == 1) {
					Static141.aClass2_Sub11_Sub1_3.method1495(242);
					Static141.aClass2_Sub11_Sub1_3.method1474(Static66.anIntArray175[local19]);
				} else if (arg1 == 4) {
					Static141.aClass2_Sub11_Sub1_3.method1495(210);
					Static141.aClass2_Sub11_Sub1_3.method1474(Static66.anIntArray175[local19]);
				} else if (arg1 == 6) {
					Static141.aClass2_Sub11_Sub1_3.method1495(54);
					Static141.aClass2_Sub11_Sub1_3.method1480(Static66.anIntArray175[local19]);
				} else if (arg1 == 7) {
					Static141.aClass2_Sub11_Sub1_3.method1495(77);
					Static141.aClass2_Sub11_Sub1_3.method1474(Static66.anIntArray175[local19]);
				}
				local17 = true;
				break;
			}
		}
		if (!local17) {
			Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { Static48.aClass10_528, local7 }));
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2699() {
		anIntArray421 = null;
		aClass2_Sub1_Sub4_Sub2_44 = null;
		aClass10_1604 = null;
		aClass10_1609 = null;
		aClass10_1607 = null;
		aClass10_1603 = null;
		aClass10_1608 = null;
		aClass10_1610 = null;
		aClass12_16 = null;
		aClass10_1605 = null;
		aClass2_Sub1_Sub4_Sub2Array11 = null;
		aClass10_1606 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ua;")
	public static RuntimeException_Sub1 method2700(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString5 = local9.aString5 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
