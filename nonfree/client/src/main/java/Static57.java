import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	public static int anInt1224 = -1;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
	public static int[] anIntArray95 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Z")
	public static boolean method1025(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!fh;B)Ljava/lang/String;")
	public static String method1026(@OriginalArg(1) Class1_Sub13 arg0) {
		try {
			@Pc(13) int local13 = arg0.method1830();
			if (local13 > 32767) {
				local13 = 32767;
			}
			@Pc(22) byte[] local22 = new byte[local13];
			arg0.anInt2018 += Static35.aClass169_1.method4205(arg0.aByteArray63, arg0.anInt2018, 0, local13, local22);
			return Static172.method2963(local22, local13, 0);
		} catch (@Pc(46) Exception local46) {
			return "Cabbage";
		}
	}
}
