import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Lclient!ub;")
	public static Class1_Sub49 aClass1_Sub49_1;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!fc;")
	public static Class1_Sub15 method3236(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class1_Sub15_Sub2");
			@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) local6.getDeclaredConstructor().newInstance();
			local15.method7867(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub15_Sub1 local26 = new Class1_Sub15_Sub1();
			local26.method7867(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII)Z")
	public static boolean method3239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static239.method3936(arg1, arg0) || Static357.method5214(arg0, arg1);
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)Lclient!ue;")
	public static Class172 method3240() {
		try {
			return (Class172) Class.forName("Class172_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "()V")
	public static void method3241() {
		Static98.method1831(Static101.anInt2104);
	}
}
