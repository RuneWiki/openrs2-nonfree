import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!mo;")
	public static Class143 aClass143_83;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!al;")
	public static final Class11 aClass11_94 = new Class11(128);

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Allocating memory";

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
	public static void method4022(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static43.method1083(arg1.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!ah;Lclient!ap;ILjava/awt/Canvas;I)Lclient!e;")
	public static Class46 method4025(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class46_Sub2");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, ah.class, Integer.TYPE, Integer.TYPE, ap.class);
			return (Class46) local57.newInstance(arg3, arg0, Integer.valueOf(arg4), new Integer(arg2), arg1);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
