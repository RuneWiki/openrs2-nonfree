import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
	public static void method3118(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static313.anInt4728 = 2;
		Static135.anInt2897 = arg1;
		Static263.method4439(arg2, false, arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
	public static int method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static237.aByteArrayArray14 == null ? 0 : Static237.aByteArrayArray14[arg0][arg1] & 0xFF;
	}
}
