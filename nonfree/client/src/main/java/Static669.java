import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "[I")
	public static int[] anIntArray609;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
	public static int anInt10712 = 100;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BIIIII)V")
	public static void method8904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg1; local3++) {
			Static197.method3240(arg3, Static16.anIntArrayArray2[local3], arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)[I")
	public static int[] method8920() {
		return new int[] { Static363.anInt9292, Static575.anInt9390, Static620.anInt10161 };
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ICLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method8928(@OriginalArg(2) String arg0, @OriginalArg(3) String arg1) {
		@Pc(6) int local6 = arg1.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = local6;
		@Pc(24) int local24 = local9 - 1;
		if (local24 != 0) {
			@Pc(31) int local31 = 0;
			while (true) {
				local31 = arg1.indexOf(13, local31);
				if (local31 < 0) {
					break;
				}
				local11 += local24;
				local31++;
			}
		}
		@Pc(49) StringBuffer local49 = new StringBuffer(local11);
		@Pc(51) int local51 = 0;
		while (true) {
			@Pc(56) int local56 = arg1.indexOf(13, local51);
			if (local56 < 0) {
				local49.append(arg1.substring(local51));
				return local49.toString();
			}
			local49.append(arg1.substring(local51, local56));
			local49.append(arg0);
			local51 = local56 + 1;
		}
	}
}
