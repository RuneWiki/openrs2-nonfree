import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!al;")
	public static Class15 aClass15_9;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5273(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static605.method8320(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
