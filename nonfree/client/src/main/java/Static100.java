import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!k", name = "Ib", descriptor = "[[[Lclient!pf;")
	public static Class1_Sub22[][][] aClass1_Sub22ArrayArrayArray3;

	@OriginalMember(owner = "client!k", name = "rb", descriptor = "Lclient!ge;")
	public static Class39 aClass39_13 = new Class39(64);

	@OriginalMember(owner = "client!k", name = "tb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_753 = Static200.method3116("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!k", name = "Cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_754 = aClass60_753;

	@OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
	public static int anInt2332 = 0;

	@OriginalMember(owner = "client!k", name = "Jb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_756 = Static200.method3116("Connection lost)3");

	@OriginalMember(owner = "client!k", name = "Fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_755 = aClass60_756;

	@OriginalMember(owner = "client!k", name = "Gb", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!k", name = "Kb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_757 = Static200.method3116("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
