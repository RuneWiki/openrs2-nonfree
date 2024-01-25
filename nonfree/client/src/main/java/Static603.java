import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array20;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!dh;")
	public static final Class62 aClass62_14 = new Class62("game3", 2);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!si;")
	public static Class3_Sub37 method8218(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class3_Sub37_Sub1");
			@Pc(15) Class3_Sub37 local15 = (Class3_Sub37) local11.getDeclaredConstructor().newInstance();
			local15.method8300(arg1, arg0, arg2);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub37_Sub2 local28 = new Class3_Sub37_Sub2();
			local28.method8300(arg1, arg0, arg2);
			return local28;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public static void method8219() {
		Static497.aClass5_36 = null;
		Static113.anInt10083 = -1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)Z")
	public static boolean method8220(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 9 || arg0 == 23 || arg0 == 19 || arg0 == 12) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1010;
		}
	}
}
