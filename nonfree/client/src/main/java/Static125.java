import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_18 = new Class25(64);

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1139 = Static49.method1293(")2");

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1140 = Static49.method1293("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_19 = new Class25(64);

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1141 = Static49.method1293("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1142 = Static49.method1293("p11_full");

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1143 = Static49.method1293("Hierhin gehen");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)I")
	public static int method2529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	public static int method2530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static24.method518(arg1 - 1, arg0 - 1) + Static24.method518(arg1 - 1, arg0 + 1) + Static24.method518(arg1 + 1, arg0 + -1) + Static24.method518(arg1 + 1, arg0 + 1);
		@Pc(77) int local77 = Static24.method518(arg1, arg0 - 1) + Static24.method518(arg1, arg0 + 1) + Static24.method518(arg1 + -1, arg0) + Static24.method518(arg1 + 1, arg0);
		@Pc(82) int local82 = Static24.method518(arg1, arg0);
		return local82 / 4 + local77 / 8 + local47 / 16;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method2531() {
		aClass70_1139 = null;
		aClass70_1141 = null;
		aClass70_1142 = null;
		aClass70_1143 = null;
		aClass25_19 = null;
		aClass70_1140 = null;
		aClass25_18 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)I")
	public static int method2532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub16 local6 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray251.length) {
			return local6.anIntArray251[arg1];
		} else {
			return 0;
		}
	}
}
