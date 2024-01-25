import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public static int anInt7869;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!da;")
	public static Class67 aClass67_11;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	public static int anInt7871;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_98 = new Class241(10, 16);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!jc;I)Ljava/lang/String;")
	public static String method6968(@OriginalArg(1) Class6_Sub15 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2992();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3174 += Static448.aClass157_1.method4053(arg0.aByteArray20, local7, 0, local19, arg0.anInt3174);
			return Static420.method6420(0, local7, local19);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}
}
