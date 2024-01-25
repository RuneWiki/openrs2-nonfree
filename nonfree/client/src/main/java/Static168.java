import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!ps;")
	public static final Class262 aClass262_5 = new Class262(11, 3);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BII)[B")
	public static byte[] method3019(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static601.method2816(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBII)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg2) {
			Static547.method7284(arg4, arg2, arg0, arg1);
		} else if (arg1 - arg2 >= Static469.anInt4270 && Static325.anInt5516 >= arg2 + arg1 && Static395.anInt6904 <= arg4 - arg3 && Static561.anInt2703 >= arg3 + arg4) {
			Static89.method1708(arg0, arg2, arg1, arg3, arg4);
		} else {
			Static130.method6014(arg1, arg0, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lclient!qq;")
	public static Class3_Sub42 method3021() {
		return Static63.anInt1479 == 0 ? new Class3_Sub42() : Static478.aClass3_Sub42Array1[--Static63.anInt1479];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!sca;")
	public static Class3_Sub28 method3022(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub28_Sub2");
			@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) local6.getDeclaredConstructor().newInstance();
			local15.method6899(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class3_Sub28_Sub1 local26 = new Class3_Sub28_Sub1();
			local26.method6899(arg0);
			return local26;
		}
	}
}
