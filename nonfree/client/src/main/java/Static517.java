import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
	public static int anInt8701;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public static void method7132(@OriginalArg(1) int arg0) {
		Static340.anInt6093 = -1;
		if (arg0 == 37) {
			Static118.aFloat11 = 3.0F;
		} else if (arg0 == 50) {
			Static118.aFloat11 = 4.0F;
		} else if (arg0 == 75) {
			Static118.aFloat11 = 6.0F;
		} else if (arg0 == 100) {
			Static118.aFloat11 = 8.0F;
		} else if (arg0 == 200) {
			Static118.aFloat11 = 16.0F;
		}
		Static340.anInt6093 = -1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!kr;)I")
	public static int method7133(@OriginalArg(1) Class171 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method4327(Static156.anInt2895)) {
			local10++;
		}
		if (arg0.method4327(Static320.anInt5858)) {
			local10++;
		}
		return local10;
	}
}
