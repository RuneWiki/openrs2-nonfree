import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
	public static int anInt9704 = 0;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	public static int anInt9707 = -1;

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(IB)Lclient!ts;")
	public static Class343 method8191() {
		return new Class343(1, false);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!gga;B)Ljava/lang/String;")
	public static String method8194(@OriginalArg(1) Class6_Sub23 arg0) {
		try {
			@Pc(9) int local9 = arg0.method8404();
			if (local9 > 32767) {
				local9 = 32767;
			}
			@Pc(21) byte[] local21 = new byte[local9];
			arg0.anInt9901 += Static586.aClass312_1.method7368(local21, 0, arg0.aByteArray101, local9, arg0.anInt9901);
			return Static232.method3397(local9, 0, local21);
		} catch (@Pc(50) Exception local50) {
			return "Cabbage";
		}
	}
}
