import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nh", name = "rb", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!nh", name = "Db", descriptor = "I")
	public static int anInt3280;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)Z")
	public static boolean method2864(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method2868(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(8) int local8 = Static170.method2462(arg1, arg0);
		@Pc(13) String[] local13 = new String[local8 + 1];
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local8; local25++) {
			@Pc(28) int local28;
			for (local28 = local23; arg1 != arg0.charAt(local28); local28++) {
			}
			local13[local15++] = arg0.substring(local23, local28);
			local23 = local28 + 1;
		}
		local13[local8] = arg0.substring(local23);
		return local13;
	}

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "(I)Z")
	public static boolean method2877() {
		if (Static359.aClass14_Sub2_Sub20_2 == null) {
			return false;
		} else {
			if (Static359.aClass14_Sub2_Sub20_2.anInt10001 >= 2000) {
				Static359.aClass14_Sub2_Sub20_2.anInt10001 -= 2000;
			}
			return Static359.aClass14_Sub2_Sub20_2.anInt10001 == 1011;
		}
	}
}
