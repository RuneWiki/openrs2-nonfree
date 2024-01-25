import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_205 = new Class156(23, 8);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static int anInt10049 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gda;IILjava/awt/Canvas;Lclient!d;III)Lclient!ha;")
	public static synchronized Class100 method8585(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == 0) {
			return Static12.method198(arg3, arg6, arg2, arg1);
		} else if (arg5 == 2) {
			return Static549.method7493(arg2, arg6, arg3, arg1);
		} else if (arg5 == 1) {
			return Static145.method2735(arg4, arg3, arg2);
		} else if (arg5 == 5) {
			return Static500.method6961(arg0, arg2, arg3, arg4);
		} else if (arg5 == 3) {
			return Static690.method6364(arg2, arg3, arg0, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)[Lclient!wh;")
	public static Class392[] method8633() {
		return new Class392[] { Static20.aClass392_1, Static348.aClass392_4, Static439.aClass392_6, Static678.aClass392_10, Static183.aClass392_2, Static626.aClass392_8, Static186.aClass392_3, Static577.aClass392_7, Static428.aClass392_5, Static645.aClass392_9 };
	}
}
