import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[I")
	public static final int[] anIntArray393 = new int[1000];

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_150 = new Class129(113, -1);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)I")
	public static int method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 < 8 ? arg2 : arg1;
		@Pc(33) int local33 = local7 < 4 ? arg1 : local7 == 12 || local7 == 14 ? arg2 : arg3;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local33 : -local33);
	}
}
