import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!kja;")
	public static final Class194 aClass194_4 = new Class194();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method3343(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (arg1.length() > 320 || !Static379.method4946()) {
			return;
		}
		if (Static375.aClass192_2 != null) {
			Static375.aClass192_2.method7791();
			Static375.aClass192_2 = null;
		}
		Static217.method3242();
		Static163.aString26 = arg1;
		Static602.aString115 = arg0;
		Static53.method1256(5);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBI)V")
	public static void method3345(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static47.aByteArrayArrayArray3 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V")
	public static void method3346() {
		Static449.aClass33_11.method8106(Static437.aFloat231, Static615.aFloat209, Static590.aFloat206);
	}
}
