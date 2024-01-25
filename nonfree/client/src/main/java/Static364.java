import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	public static int anInt5916;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "[I")
	public static final int[] anIntArray424 = new int[13];

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)[Lclient!rl;")
	public static Class210[] method4706() {
		return new Class210[] { Static316.aClass210_1, Static316.aClass210_2, Static316.aClass210_3, Static316.aClass210_4, Static316.aClass210_5, Static316.aClass210_6, Static316.aClass210_7, Static316.aClass210_8, Static316.aClass210_9, Static316.aClass210_10, Static316.aClass210_11, Static316.aClass210_12 };
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static452.aByteArrayArrayArray16[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static452.aByteArrayArrayArray16[arg0][arg1][arg2] & 0x10) == 0) {
			return Static127.method1776(arg2, arg0, arg1) == arg3;
		} else {
			return false;
		}
	}
}
