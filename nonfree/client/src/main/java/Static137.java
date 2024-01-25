import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!he;")
	public static Class100 aClass100_23;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_51 = new Class92(65, 2);

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "[I")
	public static final int[] anIntArray173 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
	public static final int[] anIntArray174 = new int[200];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILclient!rl;II)Lclient!oc;")
	public static Class19_Sub4_Sub1 method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66_Sub2 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean393 || Static99.method4914(arg2) && Static99.method4914(arg0)) {
			return new Class19_Sub4_Sub1(arg3, 3553, arg4, arg1, arg2, arg0, true);
		} else if (arg3.aBoolean396) {
			return new Class19_Sub4_Sub1(arg3, 34037, arg4, arg1, arg2, arg0, true);
		} else {
			return new Class19_Sub4_Sub1(arg3, arg4, arg1, arg2, arg0, Static52.method1203(arg2), Static52.method1203(arg0), true);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZIZ)V")
	public static void method2416(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub37 local8 = Static375.method5604(arg0, arg1);
		if (local8 != null) {
			local8.method6525();
		}
	}
}
