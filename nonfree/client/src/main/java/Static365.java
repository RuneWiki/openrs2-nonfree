import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!si", name = "K", descriptor = "I")
	public static int anInt5847;

	@OriginalMember(owner = "client!si", name = "L", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_132 = new Class253(88, -1);

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "[I")
	public static final int[] anIntArray540 = new int[5];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!gk;II)Ljava/lang/String;")
	public static String method4702(@OriginalArg(0) Class7_Sub14 arg0) {
		try {
			@Pc(17) int local17 = arg0.method3940();
			if (local17 > 32767) {
				local17 = 32767;
			}
			@Pc(29) byte[] local29 = new byte[local17];
			arg0.anInt4989 += Static219.aClass112_1.method2390(arg0.aByteArray75, local29, local17, 0, arg0.anInt4989);
			return Static184.method2672(local29, 0, local17);
		} catch (@Pc(53) Exception local53) {
			return "Cabbage";
		}
	}
}
