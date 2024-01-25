import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[I")
	public static final int[] anIntArray447 = new int[2048];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5785(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = Static61.method1557(arg0, arg1);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(27) int local27 = 0; local27 < local8; local27++) {
			@Pc(30) int local30;
			for (local30 = local17; arg1.charAt(local30) != arg0; local30++) {
			}
			local13[local15++] = arg1.substring(local17, local30);
			local17 = local30 + 1;
		}
		local13[local8] = arg1.substring(local17);
		return local13;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Z")
	public static boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static474.method7272(arg1, arg0) || Static141.method2863(arg1, arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZII)Z")
	public static boolean method5787(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
