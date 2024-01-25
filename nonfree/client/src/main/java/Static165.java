import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	public static int anInt3515;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILclient!fi;Lclient!fi;)V")
	public static void method3091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub3 arg3, @OriginalArg(4) Class2_Sub3 arg4) {
		@Pc(4) Class125 local4 = Static188.method3288(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass2_Sub3_2 = arg3;
			local4.aClass2_Sub3_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lclient!fr;")
	public static Class3_Sub2 method3093(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(13) Class local13 = Class.forName("Class3_Sub2_Sub2");
			@Pc(17) Class3_Sub2 local17 = (Class3_Sub2) local13.getDeclaredConstructor().newInstance();
			local17.method8080(arg0);
			return local17;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub2_Sub1 local28 = new Class3_Sub2_Sub1();
			local28.method8080(arg0);
			return local28;
		}
	}
}
