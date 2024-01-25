import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
	public static int anInt9808;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z")
	public static boolean method7709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static576.method7812(arg0, arg1) : Static252.method3945(arg1, arg0);
		return local22 | Static266.method4068(arg1, arg0) | (arg0 & 0x10000) != 0;
	}
}
