import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
	public static final int[] anIntArray45 = new int[6];

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
	public static final int[] anIntArray46 = new int[25];

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	public static int anInt455 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)I")
	public static int method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}
}
