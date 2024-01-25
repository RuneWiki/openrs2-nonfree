import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "Lclient!el;")
	public static final Class109 aClass109_68 = new Class109(116, 9);

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "Lclient!eea;")
	public static final Class101 aClass101_1 = new Class101();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
	public static void method2757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static596.method8616(arg0)) {
			Static319.method4857(arg1, Static489.aClass73ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
	public static void method2758() {
		Static21.method316(11);
		Static108.method1562();
		System.gc();
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(CLjava/lang/String;B)I")
	public static int method2759(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			if (arg1.charAt(local20) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
