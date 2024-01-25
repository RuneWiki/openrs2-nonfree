import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static165 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	public static int anInt6202;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)I")
	public static int method4927(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!m;ILclient!js;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class26 method4928(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new h(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4929(@OriginalArg(0) String arg0) {
		Static187.method5442("", 0, "", arg0, 0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)[Lclient!vf;")
	public static Class254[] method4930() {
		return new Class254[] { Static119.aClass254_1, Static119.aClass254_2, Static119.aClass254_3, Static119.aClass254_4, Static119.aClass254_5, Static119.aClass254_6, Static119.aClass254_7, Static119.aClass254_8, Static119.aClass254_9, Static119.aClass254_10 };
	}
}
