import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!js", name = "U", descriptor = "I")
	public static int anInt4651;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_76 = new Class173(25, 7);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
	public static void method4073() {
		if (Static440.aClass44_12.method4965()) {
			Static440.aClass44_12.method4994(Static475.aCanvas12);
			Static335.method5480();
			Static440.aClass44_12.method5012(Static475.aCanvas12);
			Static440.aClass44_12.method4966(Static475.aCanvas12);
		} else {
			Static547.method7956(Static495.anInt9000);
		}
		Static523.method7617();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!un;)Ljava/lang/String;")
	public static String method4074(@OriginalArg(2) Class4_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4942();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5831 += Static48.aClass76_1.method2213(local7, arg0.aByteArray68, 0, local19, arg0.anInt5831);
			return Static534.method7768(local7, 0, local19);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}
}
