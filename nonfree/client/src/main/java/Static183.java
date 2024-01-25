import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
	public static final int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	public static int anInt3715 = 0;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt3717 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3347(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 < 128 || arg6 < 128 || arg3 > (Static193.anInt3853 - 2) * 128 || Static301.anInt5585 * 128 - 256 < arg6) {
			Static402.anIntArray573[0] = Static402.anIntArray573[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static21.method356(arg3, arg6, arg5) - arg4;
		Static117.aClass72_5.J(arg2, 0, 0);
		Static30.aClass30_3.method2064(Static117.aClass72_5);
		Static30.aClass30_3.XA(arg3, local44, arg6, Static402.anIntArray573);
		Static117.aClass72_5.J(-arg2, 0, 0);
		Static30.aClass30_3.method2064(Static117.aClass72_5);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!ul;Ljava/lang/String;)Lclient!gm;")
	public static Class87 method3349(@OriginalArg(1) int arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method5838(arg2);
		}
		@Pc(43) Class87 local43;
		if (arg0 == 1) {
			try {
				Static476.method5365("openjs", arg1.anApplet1, new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() });
				local43 = new Class87();
				local43.anInt2679 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class87();
				local43.anInt2679 = 2;
				return local43;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class87();
				local43.anInt2679 = 1;
				return local43;
			} catch (@Pc(83) Exception local83) {
				local43 = new Class87();
				local43.anInt2679 = 2;
				return local43;
			}
		} else if (arg0 == 3) {
			try {
				Static476.method5363(arg1.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class87();
				local43.anInt2679 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class87();
				local43.anInt2679 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
