import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
	public static volatile int anInt4156 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Lclient!gm;")
	public static Class3_Sub4_Sub9 method3486(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub4_Sub9 local6 = (Class3_Sub4_Sub9) Static251.aClass33_13.method828((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28;
		if (arg0 >= 32768) {
			local28 = Static25.aClass155_20.method4121(1, arg0 & 0x7FFF);
		} else {
			local28 = Static69.aClass155_34.method4121(1, arg0);
		}
		local6 = new Class3_Sub4_Sub9();
		if (local28 != null) {
			local6.method1583(new Class3_Sub26(local28));
		}
		if (arg0 >= 32768) {
			local6.method1577();
		}
		Static251.aClass33_13.method827(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3488(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static275.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static254.aClass69_1);
		arg0.addFocusListener(Static254.aClass69_1);
	}
}
