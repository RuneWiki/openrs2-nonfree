import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "[I")
	public static int[] anIntArray1157;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	public static int anInt5659 = 127;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	public static int method4878(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return local46 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!nl;)I")
	public static int method4879(@OriginalArg(1) Class171 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3739(Static5.anInt197)) {
			local10++;
		}
		if (arg0.method3739(Static14.anInt358)) {
			local10++;
		}
		return local10;
	}
}
