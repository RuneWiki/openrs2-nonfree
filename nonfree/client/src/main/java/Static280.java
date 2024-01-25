import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt5513;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public static int anInt5512 = 0;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4751(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + Static356.method5624(arg0.charAt(local10)) - local8;
		}
		return local8;
	}
}
