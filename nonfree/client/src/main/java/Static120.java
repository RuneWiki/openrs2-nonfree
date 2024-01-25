import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt8636;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public static void method7553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static278.method4887(arg0)) {
			Static298.method5307(Static511.aClass91ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method7555() {
		Static394.method6257();
		Static303.aClass103_3 = null;
		Static193.aClass103_2 = null;
		Static247.aClass4_7 = null;
		Static442.aClass103_4 = null;
		Static169.aClass126ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!so;ILclient!r;BI)V")
	public static void method7556(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(5) int arg4) {
		if (arg3 != null) {
			arg1.method6981(arg0, arg3.Q(), arg3.wa(), arg3.va(), arg4, arg3.TA(), arg2, arg3.e(), arg3.U(), arg3.n());
		}
	}
}
