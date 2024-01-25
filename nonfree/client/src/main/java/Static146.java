import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public static int anInt3124 = -1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBII)I")
	public static int method2530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static266.aByteArrayArrayArray10[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static266.aByteArrayArrayArray10[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
	public static void method2531(@OriginalArg(1) int arg0) {
		Static142.method2500(Static223.aClass152_16.method3624(Static142.anInt3088), arg0);
	}
}
