import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
	public static int anInt7372;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	public static int anInt7376 = 0;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public static int anInt7377 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5568(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(14) Class1_Sub3_Sub13 local14 = Static397.method4998(3, arg0);
		local14.method3459();
		local14.aString43 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILclient!wo;Lclient!wo;)V")
	public static void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub4 arg3, @OriginalArg(4) Class20_Sub4 arg4) {
		@Pc(4) Class82 local4 = Static15.method238(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub4_1 = arg3;
			local4.aClass20_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBLclient!vg;)Ljava/lang/String;")
	public static String method5570(@OriginalArg(0) int arg0, @OriginalArg(2) Class250 arg1) {
		if (!Static52.method804(arg1).method1721(arg0) && arg1.anObjectArray27 == null) {
			return null;
		} else if (arg1.aStringArray55 == null || arg0 >= arg1.aStringArray55.length || arg1.aStringArray55[arg0] == null || arg1.aStringArray55[arg0].trim().length() == 0) {
			return Static419.aBoolean556 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray55[arg0];
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method5571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg4) {
			Static365.method4745(arg5, arg1, arg3, arg0, arg2, arg6);
		} else if (Static271.anInt4271 <= arg1 - arg0 && Static13.anInt263 >= arg0 + arg1 && arg5 - arg4 >= Static74.anInt1413 && arg4 + arg5 <= Static149.anInt7384) {
			Static375.method4825(arg1, arg6, arg0, arg5, arg3, arg2, arg4);
		} else {
			Static262.method3373(arg5, arg4, arg3, arg0, arg2, arg6, arg1);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
	public static int method5572(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
