import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
	public static int[] anIntArray304 = new int[100];

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	public static int anInt3666 = 0;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "[I")
	public static int[] anIntArray305 = new int[100];

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString127 = "Loading title screen - ";

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString128 = "Connection lost.";

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public static void method2969() {
		Static278.anIntArray422 = null;
		Static99.aByteArrayArray8 = null;
		Static107.anIntArray188 = null;
		Static246.anIntArray386 = null;
		Static149.anIntArray238 = null;
		Static138.anIntArray228 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!cg;I)[Lclient!ta;")
	public static Class58_Sub2[] method2970(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1) {
		return Static225.method3549(0, arg1, arg0) ? Static76.method1290() : null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)I")
	public static int method2972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = 0;
		while (arg1 > 0) {
			arg1--;
			local9 = local9 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local9;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method2973(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 - arg4;
		@Pc(15) int local15 = arg2 - arg3;
		@Pc(24) int local24 = (arg7 - arg6 << 16) / local15;
		@Pc(33) int local33 = (arg5 - arg1 << 16) / local11;
		Static69.method1189(arg3, local33, arg0, arg4, arg2, arg6, arg1, local24);
	}
}
