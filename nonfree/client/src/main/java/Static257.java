import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public static int anInt4919;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "Lclient!in;")
	public static final Class169 aClass169_124 = new Class169(75, 2);

	@OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
	public static int anInt4926 = 0;

	@OriginalMember(owner = "client!ik", name = "I", descriptor = "[I")
	public static final int[] anIntArray250 = new int[2048];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I")
	public static int method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}
}
