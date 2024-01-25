import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
	public static int anInt3058;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBI)Z")
	public static boolean method2597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2598(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static278.method4791(Static466.aClass158_113);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0) + 1);
		Static515.aClass3_Sub27_Sub1_2.method7573(arg1);
		Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBIII)Z")
	public static boolean method2599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static232.aByteArrayArrayArray18[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static232.aByteArrayArrayArray18[arg3][arg0][arg1] & 0x10) == 0) {
			return arg2 == Static332.method5279(arg1, arg0, arg3);
		} else {
			return false;
		}
	}
}
