import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public static int anInt2039;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_737 = Static169.method2903("<col=ff7000>");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_738 = Static169.method2903("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method1344() {
		for (@Pc(6) Class1_Sub4 local6 = (Class1_Sub4) Static1.aClass56_1.method1853(); local6 != null; local6 = (Class1_Sub4) Static1.aClass56_1.method1855()) {
			if (local6.aClass1_Sub1_Sub3_1 != null) {
				local6.method249();
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method1345() {
		aClass23_737 = null;
		anIntArray269 = null;
		anIntArray268 = null;
		aClass23_738 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
	public static void method1346(@OriginalArg(0) int arg0) {
		if (Static49.method916(arg0)) {
			Static106.method1844(Static9.aClass60ArrayArray1[arg0], -1);
		}
	}
}
