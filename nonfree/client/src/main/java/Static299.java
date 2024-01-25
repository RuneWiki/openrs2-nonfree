import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public static void method4820(@OriginalArg(1) int arg0) {
		Static224.anIntArray633 = new int[arg0];
		Static149.anIntArray245 = new int[arg0];
		Static475.anIntArray644 = new int[arg0];
		Static487.anIntArray656 = new int[arg0];
		Static138.anIntArray232 = new int[arg0];
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method4821() {
		@Pc(1) Class125 local1 = Static218.aClass125_30;
		synchronized (Static218.aClass125_30) {
			Static218.aClass125_30.method3440();
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method4822() {
		Static51.aBoolean637 = true;
	}
}
