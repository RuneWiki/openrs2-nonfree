import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static int anInt9608;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_23 = new Class201(1, 4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!d;Lclient!gj;IILjava/awt/Canvas;I)Lclient!ha;")
	public static synchronized Class16 method8136(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Canvas arg5, @OriginalArg(7) int arg6) {
		if (arg3 == 0) {
			return Static81.method1705(arg5, arg1, arg4, arg0);
		} else if (arg3 == 2) {
			return method8164(arg4, arg1, arg0, arg5);
		} else if (arg3 == 1) {
			return Static660.method8637(arg1, arg6, arg5);
		} else if (arg3 == 5) {
			return Static493.method6428(arg2, arg6, arg5, arg1);
		} else if (arg3 == 3) {
			return Static682.method1778(arg1, arg5, arg2, arg6);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)V")
	public static void method8142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static566.method4437();
		Static614.aLong283 = 0L;
		@Pc(14) int local14 = Static545.method7549();
		if (arg1 == 3 || local14 == 3) {
			arg3 = true;
		}
		if (!Static582.aClass16_12.method8191()) {
			arg3 = true;
		}
		Static370.method5476(arg0, arg2, arg1, local14, arg3);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	private static Class16 method8164(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3) {
		return new oa(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public static int method8185(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
