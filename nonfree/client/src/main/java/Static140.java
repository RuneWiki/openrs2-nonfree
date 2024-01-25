import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt2887;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_45 = new Class322(66, 6);

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "[I")
	public static final int[] anIntArray163 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)Z")
	public static boolean method2718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static41.method528(arg1, arg0) || Static13.method182(arg1, arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIILclient!bo;IIIILclient!ha;BII)V")
	public static void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub2_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class75 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg0 > arg5 && arg7 + arg5 > arg0 && arg2 - 13 < arg4 && arg4 < arg2 + 3) {
			arg6 = arg10;
		}
		@Pc(33) String local33 = Static624.method8546(arg3);
		Static205.aClass67_6.method8301(arg6, arg2, arg5 + 3, Static532.aClass49Array14, local33, Static317.anIntArray318);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
	public static void method2721() {
		@Pc(5) Class359 local5 = Static307.aClass359_44;
		synchronized (Static307.aClass359_44) {
			Static307.aClass359_44.method8507();
		}
	}
}
