import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
	public static int anInt3694;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!lg;")
	public static Class97 aClass97_17 = null;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBILjava/awt/Component;)Lclient!ej;")
	public static Class42 method2979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class42_Sub2");
			@Pc(15) Class42 local15 = (Class42) local11.getDeclaredConstructor().newInstance();
			local15.method3933(arg0, arg1, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class42_Sub1 local28 = new Class42_Sub1();
			local28.method3933(arg0, arg1, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIB)V")
	public static void method2980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub2_Sub15 local16 = Static131.method1210(arg0, 12);
		local16.method2876();
		local16.anInt3536 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method2982() {
		Static161.aClass172_29.method4350();
	}
}
