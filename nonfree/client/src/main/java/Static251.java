import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!fc;")
	public static Class71 aClass71_60;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public static int anInt4516;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_159 = new Class221("K", "T", "K", "K");

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public static int anInt4517 = 0;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public static int anInt4518 = 0;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString44 = "";

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public static int anInt4519 = 1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!ms;IIIILclient!vb;I)V")
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class201 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (local11 > arg4) {
			return;
		}
		@Pc(42) int local42 = Math.min(arg1.anInt4170 / 2, arg1.anInt4214 / 2);
		if (local11 <= local42 * local42) {
			Static2.method3449(arg5, arg1, arg3, arg0, arg6, Static196.aClass5Array10[arg7], arg2);
			return;
		}
		local42 -= 10;
		@Pc(64) int local64;
		if (Static283.anInt5017 == 4) {
			local64 = (int) Static18.aFloat8 & 0x3FFF;
		} else {
			local64 = (int) Static18.aFloat8 + Static232.anInt4267 & 0x3FFF;
		}
		@Pc(75) int local75 = Class104.anIntArray705[local64];
		@Pc(79) int local79 = Class104.anIntArray706[local64];
		if (Static283.anInt5017 != 4) {
			local75 = local75 * 256 / (Static48.anInt942 + 256);
			local79 = local79 * 256 / (Static48.anInt942 + 256);
		}
		@Pc(108) int local108 = arg5 * local75 + local79 * arg0 >> 15;
		@Pc(119) int local119 = arg5 * local79 - local75 * arg0 >> 15;
		@Pc(125) double local125 = Math.atan2((double) local108, (double) local119);
		@Pc(132) int local132 = (int) (Math.sin(local125) * (double) local42);
		@Pc(139) int local139 = (int) ((double) local42 * Math.cos(local125));
		Static314.aClass5Array16[arg7].method4993((float) arg1.anInt4170 / 2.0F + (float) arg3 + (float) local132, (float) -local139 + (float) arg1.anInt4214 / 2.0F + (float) arg2, 4096, (int) (-local125 / 6.283185307179586D * 65535.0D));
	}
}
