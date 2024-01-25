import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sq", name = "jb", descriptor = "Z")
	public static boolean aBoolean645 = true;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!iaa;ZI)Ljava/lang/String;")
	public static String method7262(@OriginalArg(0) Class6_Sub26 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4973();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(22) byte[] local22 = new byte[local7];
			arg0.anInt5769 += Static54.aClass213_1.method5245(arg0.aByteArray65, arg0.anInt5769, 0, local7, local22);
			return Static211.method8131(local7, 0, local22);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!iaa;B)Lclient!mn;")
	public static Class77_Sub4 method7264(@OriginalArg(0) Class6_Sub26 arg0) {
		return new Class77_Sub4(arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4949(), arg0.method4949(), arg0.method4966());
	}
}
