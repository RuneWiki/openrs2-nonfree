import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
	public static int anInt1886 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1744(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static11.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static7.aClass93_1);
		arg0.addFocusListener(Static7.aClass93_1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)Lclient!q;")
	public static Class5_Sub9_Sub18 method1745(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub18 local10 = (Class5_Sub9_Sub18) Static338.aClass215_7.method5683((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static262.aClass170_90.method4584(arg0, 0);
		if (local33 == null || local33.length <= 1) {
			return null;
		} else {
			local10 = Static177.method2211(local33);
			Static338.aClass215_7.method5687(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method1746(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 < 128 || arg0 < 128 || arg2 > (Static266.anInt5101 - 2) * 128 || Static339.anInt6352 * 128 - 256 < arg0) {
			Static330.anIntArray121[0] = Static330.anIntArray121[1] = -1;
			return;
		}
		@Pc(54) int local54 = Static66.method1393(arg0, Static156.anInt3123, arg2) - arg5;
		Static110.aClass112_2.method3584(arg3, 0, 0);
		Static15.aClass59_1.method4787(Static110.aClass112_2);
		Static15.aClass59_1.method4870(arg2, local54, arg0, Static330.anIntArray121);
		Static110.aClass112_2.method3584(-arg3, 0, 0);
		Static15.aClass59_1.method4787(Static110.aClass112_2);
	}
}
