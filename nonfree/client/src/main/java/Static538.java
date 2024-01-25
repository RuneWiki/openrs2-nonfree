import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!te", name = "O", descriptor = "I")
	public static int anInt8989;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_11 = new Class266(0, 3);

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public static int anInt8985 = 0;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "I")
	public static int anInt8988 = 0;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "Lclient!ee;")
	public static final Class86 aClass86_8 = new Class86("LOCAL", 4);

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString82 = null;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_6 = new Class159(2);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ud;IZ)Ljava/lang/String;")
	public static String method7529(@OriginalArg(0) Class2_Sub34 arg0) {
		try {
			@Pc(7) int local7 = arg0.method6863();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt8188 += Static407.aClass193_1.method4639(0, arg0.aByteArray77, arg0.anInt8188, local19, local7);
			return Static307.method4720(local19, local7, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}
}
