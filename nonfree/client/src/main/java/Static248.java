import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	public static int anInt4956;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BJ)V", line = 17)
	public static void method4554(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z", line = 49)
	public static boolean method4556() {
		return Class2_Sub3_Sub24.anInt4949 > 0;
	}
}
