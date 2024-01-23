import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "[I")
	public static int[] anIntArray379 = new int[2];

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Loading wordpack - ";

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(III)V")
	public static void method3711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static175.aClass4_Sub24_Sub1_1.method3123(127);
		Static175.aClass4_Sub24_Sub1_1.method3070(arg1);
		Static175.aClass4_Sub24_Sub1_1.method3064(arg0);
	}
}
