import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "Lclient!gm;")
	public static Class87 aClass87_5;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
	public static int anInt4343 = 0;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(ILclient!wn;I)Ljava/lang/String;")
	public static String method3744(@OriginalArg(1) Class4_Sub20 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4575();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5526 += Static13.aClass147_1.method3892(arg0.aByteArray77, arg0.anInt5526, local19, 0, local7);
			return Static268.method4311(local7, local19, 0);
		} catch (@Pc(50) Exception local50) {
			return "Cabbage";
		}
	}
}
