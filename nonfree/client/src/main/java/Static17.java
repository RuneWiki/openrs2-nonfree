import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "[J")
	public static long[] aLongArray11 = new long[1000];

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	public static int anInt300 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!sb;)Ljava/lang/String;")
	public static String method298(@OriginalArg(2) Class1_Sub14 arg0) {
		try {
			@Pc(16) int local16 = arg0.method2648();
			if (local16 > 32767) {
				local16 = 32767;
			}
			@Pc(25) byte[] local25 = new byte[local16];
			arg0.anInt3290 += Static309.aClass143_1.method3501(arg0.anInt3290, local25, 0, arg0.aByteArray34, local16);
			return Static13.method198(local16, local25, 0);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}
}
