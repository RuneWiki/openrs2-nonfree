import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!q", name = "E", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!q", name = "G", descriptor = "Lclient!ae;")
	public static Class8 aClass8_114;

	@OriginalMember(owner = "client!q", name = "H", descriptor = "Lclient!uia;")
	public static Class354 aClass354_4;

	@OriginalMember(owner = "client!q", name = "I", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	public static int anInt8062 = 0;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "Lclient!af;")
	public static final Class10 aClass10_47 = new Class10(8);

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(B)V")
	public static void method6899() {
		Static151.aClass10_12.method380();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V")
	public static void method6900(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub4_Sub18 local17 = Static565.method7924((long) arg0, 16);
		local17.method7979();
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V")
	public static void method6902() {
		Static94.aClass209_9.method5041();
		Static187.aClass209_13.method5041();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!aba;")
	public static Class4 method6903(@OriginalArg(1) Component arg0) {
		return new Class4_Sub1(arg0);
	}
}
