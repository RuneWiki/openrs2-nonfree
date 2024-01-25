import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!ila", name = "j", descriptor = "I")
	public static int anInt4355;

	@OriginalMember(owner = "client!ila", name = "m", descriptor = "I")
	public static int anInt4357;

	@OriginalMember(owner = "client!ila", name = "r", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_76 = new Class397(120, 3);

	@OriginalMember(owner = "client!ila", name = "t", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static357.aClass108Array6[Static328.anInt8407++] = new Class108(4, arg6, arg4, arg2, arg2, arg4, arg3, arg0, arg0, arg3, arg5, arg5, arg1, arg1);
	}

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(III)Z")
	public static boolean method4011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ila", name = "a", descriptor = "(IBI)Z")
	public static boolean method4012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
