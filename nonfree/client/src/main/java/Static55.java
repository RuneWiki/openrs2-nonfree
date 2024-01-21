import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Lclient!nd;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_557 = Static78.method1313("Benutzername: ");

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_558 = Static78.method1313("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_559 = Static78.method1313("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_560 = Static78.method1313("overlay_multiway");

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt1314 = 1;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_561 = Static78.method1313(" )2> ");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Lclient!tb;")
	public static Class1_Sub2_Sub18 method1028(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = (Class1_Sub2_Sub18) Static101.aClass63_21.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static14.aClass56_15.method1269(3, arg0);
		local10 = new Class1_Sub2_Sub18();
		if (local20 != null) {
			local10.method1810(new Class1_Sub5(local20));
		}
		Static101.aClass63_21.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	public static int method1030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 2) {
			@Pc(17) int local17 = method1030(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				local17 *= arg0;
			}
			return local17;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!ob;I)Lclient!fc;")
	public static Class25 method1033(@OriginalArg(1) Class1_Sub2_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (!Static5.method95(Static77.method1300(arg0), arg1)) {
			return null;
		} else if (arg0.aClass25Array17 == null || arg1 >= arg0.aClass25Array17.length || arg0.aClass25Array17[arg1] == null || arg0.aClass25Array17[arg1].method773().method762() == 0) {
			return Static34.aBoolean37 ? Static116.method1859(new Class25[] { Static5.aClass25_47, Static74.method1214(arg1) }) : null;
		} else {
			return arg0.aClass25Array17[arg1];
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public static void method1034() {
		aClass25_558 = null;
		aClass25_561 = null;
		aClass25_557 = null;
		aClass25_560 = null;
		aClass58_1 = null;
		aClass25_559 = null;
	}
}
