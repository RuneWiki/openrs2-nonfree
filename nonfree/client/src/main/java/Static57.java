import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Z")
	public static boolean aBoolean487 = false;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[S")
	public static short[] aShortArray96 = new short[256];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method4963(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
