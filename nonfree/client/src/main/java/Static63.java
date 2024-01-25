import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_55 = new Class103(46, -1);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)I")
	public static int method1064(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
	public static void method1066(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static363.method4850(arg0, arg1.length - 1, 0, arg1);
	}
}
