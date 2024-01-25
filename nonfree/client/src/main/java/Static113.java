import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_44 = new Class253(71, 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!gw;")
	public static Class7_Sub5 method1928(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(10) Class local10 = Class.forName("Class7_Sub5_Sub2");
			@Pc(14) Class7_Sub5 local14 = (Class7_Sub5) local10.getDeclaredConstructor().newInstance();
			local14.method5134(arg0);
			return local14;
		} catch (@Pc(21) Throwable local21) {
			@Pc(25) Class7_Sub5_Sub1 local25 = new Class7_Sub5_Sub1();
			local25.method5134(arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method1929() {
		for (@Pc(14) Class7_Sub13 local14 = (Class7_Sub13) Static423.aClass85_47.method2010(); local14 != null; local14 = (Class7_Sub13) Static423.aClass85_47.method2000()) {
			if (local14.aBoolean86) {
				local14.method1199();
			}
		}
		for (@Pc(34) Class7_Sub13 local34 = (Class7_Sub13) Static26.aClass85_4.method2010(); local34 != null; local34 = (Class7_Sub13) Static26.aClass85_4.method2000()) {
			if (local34.aBoolean86) {
				local34.method1199();
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	public static boolean method1933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static40.method2438(arg0, arg1) | (arg1 & 0x70000) != 0 || Static45.method605(arg1, arg0);
	}
}
