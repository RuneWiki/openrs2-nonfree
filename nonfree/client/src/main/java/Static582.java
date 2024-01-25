import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!ha;")
	public static Class16 aClass16_12;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_133 = new Class376(7, 3);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIBI)V")
	public static void method7834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static178.method2935(arg3, arg1, arg4, arg2);
		} else if (Static303.anInt9951 <= arg4 - arg1 && Static408.anInt6951 >= arg4 + arg1 && Static255.anInt4818 <= arg2 - arg0 && arg2 + arg0 <= Static658.anInt10079) {
			Static502.method7144(arg3, arg0, arg4, arg1, arg2);
		} else {
			Static411.method5825(arg0, arg3, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!ha;BI)Lclient!kc;")
	public static Class202 method7835(@OriginalArg(0) Class16 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class122 local9 = Static345.method5205(true, arg0, arg1);
		return local9 == null ? null : local9.aClass202_4;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V")
	public static void method7836(@OriginalArg(1) int arg0) {
		if (Static490.anInt8296 == 1) {
			Static185.anInt3411 = arg0;
		} else if (Static490.anInt8296 == 2) {
			Static39.anInt1160 = arg0;
		}
	}
}
