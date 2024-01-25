import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
	public static int anInt3343;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	public static int anInt3344;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2873(@OriginalArg(0) String arg0) {
		Static153.aString38 = arg0;
		if (Static32.aClass51_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static32.aClass51_1.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static32.aClass51_1.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static199.method3076(Static354.method4966() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static473.method5057(Static32.aClass51_1.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!i;IIJLclient!ga;II)V")
	public static void method2874(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) Class82 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19 = arg6 * arg6 + arg7 * arg7;
		if ((long) local19 > arg4) {
			return;
		}
		@Pc(39) int local39 = Math.min(arg5.anInt2192 / 2, arg5.anInt2216 / 2);
		if (local39 * local39 >= local19) {
			Static358.method5004(arg7, arg5, arg6, Static125.aClass2Array6[arg0], arg1, arg2, arg3);
			return;
		}
		local39 -= 10;
		@Pc(69) int local69;
		if (Static27.anInt490 == 4) {
			local69 = (int) Static19.aFloat6 & 0x3FFF;
		} else {
			local69 = (int) Static19.aFloat6 + Static139.anInt2475 & 0x3FFF;
		}
		@Pc(83) int local83 = Class65.anIntArray88[local69];
		@Pc(87) int local87 = Class65.anIntArray87[local69];
		if (Static27.anInt490 != 4) {
			local83 = local83 * 256 / (Static197.anInt3551 + 256);
			local87 = local87 * 256 / (Static197.anInt3551 + 256);
		}
		@Pc(118) int local118 = arg6 * local87 + local83 * arg7 >> 15;
		@Pc(129) int local129 = arg7 * local87 - local83 * arg6 >> 15;
		@Pc(135) double local135 = Math.atan2((double) local118, (double) local129);
		@Pc(142) int local142 = (int) (Math.sin(local135) * (double) local39);
		@Pc(149) int local149 = (int) (Math.cos(local135) * (double) local39);
		Static248.aClass2Array13[arg0].method5832((float) arg2 + (float) arg5.anInt2192 / 2.0F + (float) local142, (float) -local149 + (float) arg5.anInt2216 / 2.0F + (float) arg3, 4096, (int) (-local135 / 6.283185307179586D * 65535.0D));
	}
}
