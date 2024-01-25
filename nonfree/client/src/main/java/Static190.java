import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!ol;")
	public static Class3_Sub38 aClass3_Sub38_2 = null;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
	public static boolean method3221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static322.method4682(arg0, arg1) || Static380.method5566(arg1, arg0) || Static285.method4239(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!np;B)Ljava/lang/String;")
	public static String method3222(@OriginalArg(1) Class3_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5217();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt6128 += Static69.aClass75_1.method1893(local15, arg0.aByteArray62, arg0.anInt6128, local7, 0);
			return Static296.method4398(0, local7, local15);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
