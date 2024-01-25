import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static255 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!v;")
	public static Class244 aClass244_9;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public static int anInt4768 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)I")
	public static int method3878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!m;IBILjava/awt/Canvas;Lclient!hs;)Lclient!qa;")
	public static Class75 method3880(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class103 arg4) {
		return new Class75_Sub2(arg1, arg3, arg0, arg2, arg4);
	}
}
