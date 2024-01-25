import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
	public static int anInt6929;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)I")
	public static int method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static403.method3683(arg1 - 1, arg0 + -1) + Static403.method3683(arg1 - 1, arg0 + 1) + Static403.method3683(arg1 - -1, arg0 - 1) + Static403.method3683(arg1 - -1, arg0 - -1);
		@Pc(75) int local75 = Static403.method3683(arg1, arg0 - 1) + Static403.method3683(arg1, arg0 + 1) + Static403.method3683(arg1 - 1, arg0) + Static403.method3683(arg1 + 1, arg0);
		@Pc(80) int local80 = Static403.method3683(arg1, arg0);
		return local75 / 8 + local46 / 16 + local80 / 4;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(III)Z")
	public static boolean method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) boolean local20 = (arg1 & 0x37) == 0 ? Static350.method5752(arg1, arg0) : Static618.method8385(arg1, arg0);
		return (arg0 & 0x10000) != 0 | Static297.method5114(arg0, arg1) | local20;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5799(@OriginalArg(1) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}
}
