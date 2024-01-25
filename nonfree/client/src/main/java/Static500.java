import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!pu;")
	public static Class270 aClass270_114;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
	public static final int[] anIntArray685 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_273 = new Class235(62, 12);

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[B")
	public static final byte[] aByteArray97 = new byte[2048];

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!li;")
	public static final Class209 aClass209_10 = new Class209();

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!vg;IB)I")
	public static int method7452(@OriginalArg(0) Class341 arg0, @OriginalArg(1) int arg1) {
		if (!Static63.method1137(arg0).method7772(arg1) && arg0.anObjectArray17 == null) {
			return -1;
		} else if (arg0.anIntArray697 == null || arg0.anIntArray697.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray697[arg1];
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method7455(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static83.method1474(arg1, arg0);
		@Pc(20) String[] local20 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local20[local22++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local20[local10] = arg1.substring(local24);
		return local20;
	}
}
