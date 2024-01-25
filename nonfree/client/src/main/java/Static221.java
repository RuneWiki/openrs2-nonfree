import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static221 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!la;")
	public static final Class136 aClass136_184 = new Class136(2, 6);

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_175 = new Class163(14, 3);

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_35 = new Class140(8);

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
	public static final int[] anIntArray423 = new int[13];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method5545(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_267 != null) {
			arg0.method6288();
		}
		arg0.aClass3_267 = arg1.aClass3_267;
		arg0.aClass3_268 = arg1;
		arg0.aClass3_267.aClass3_268 = arg0;
		arg0.aClass3_268.aClass3_267 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg1) {
			Static195.method3036(arg5, arg0, arg2, arg4, arg6, arg3);
		} else if (arg3 - arg5 >= Static399.anInt2866 && Static372.anInt6316 >= arg5 + arg3 && Static316.anInt5349 <= arg2 - arg1 && arg2 + arg1 <= Static418.anInt7030) {
			Static81.method1463(arg0, arg4, arg3, arg2, arg6, arg1, arg5);
		} else {
			Static430.method5854(arg2, arg4, arg0, arg6, arg1, arg3, arg5);
		}
	}
}
