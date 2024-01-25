import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
	public static int anInt304;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
	public static int anInt295 = -1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)I")
	public static int method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static285.method4515(arg0 - 1, arg1 + -1) + Static285.method4515(arg0 - 1, arg1 + 1) + Static285.method4515(arg0 + 1, arg1 - 1) + Static285.method4515(arg0 - -1, arg1 + 1);
		@Pc(78) int local78 = Static285.method4515(arg0, arg1 - 1) + Static285.method4515(arg0, arg1 + 1) + Static285.method4515(arg0 + -1, arg1) + Static285.method4515(arg0 - -1, arg1);
		@Pc(83) int local83 = Static285.method4515(arg0, arg1);
		return local83 / 4 + local48 / 16 + local78 / 8;
	}
}
