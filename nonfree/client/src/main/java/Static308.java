import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
	public static int anInt5220;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "[S")
	public static final short[] aShortArray96 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(B)Lclient!da;")
	public static Class50 method4584() {
		try {
			return new Class50_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class50) Class.forName("Class50_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class50_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(B)V")
	public static void method4585() {
		@Pc(16) Class1_Sub6_Sub11 local16 = Static295.method4455(0, 15);
		local16.method2998();
	}

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "(B)Z")
	public static boolean method4587() {
		return Static96.aClass73_2 != Static314.aClass73_5 || Static284.anInt4919 >= 2;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!mg;")
	public static Class154 method4588(@OriginalArg(0) Component arg0) {
		return new Class154_Sub1(arg0);
	}
}
