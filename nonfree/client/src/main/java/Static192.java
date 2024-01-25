import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!kj;ILclient!m;Ljava/awt/Canvas;II)Lclient!qa;")
	public static Class109 method2933(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface7 arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) int arg4) {
		return new Class109_Sub1(arg1, arg3, arg2, arg4, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public static void method2935(@OriginalArg(0) int arg0) {
		if (Static130.method1891(arg0)) {
			Static390.method5320(-1, Static448.aClass219ArrayArray2[arg0]);
		}
	}
}
