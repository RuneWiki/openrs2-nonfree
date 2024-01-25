import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!he;")
	public static Class100 aClass100_13;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZI)V")
	public static void method1824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static88.method4151(arg1)) {
			Static365.method5494(arg0, Static35.aClass239ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ae;IB)Ljava/lang/String;")
	public static String method1829(@OriginalArg(0) Class6_Sub1 arg0) {
		try {
			@Pc(7) int local7 = arg0.method6445();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt7898 += Static132.aClass147_1.method3283(local15, arg0.aByteArray96, local7, arg0.anInt7898, 0);
			return Static55.method1238(local7, 0, local15);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(IB)Lclient!qp;")
	public static Class152_Sub1 method1830(@OriginalArg(0) int arg0) {
		return Static425.aBoolean363 && Static301.anInt5335 <= arg0 && arg0 <= Static383.anInt6838 ? Static175.aClass152_Sub1Array3[arg0 - Static301.anInt5335] : null;
	}
}
