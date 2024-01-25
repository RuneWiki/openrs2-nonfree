import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "Lclient!ir;")
	public static Class100 aClass100_118;

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Lclient!ir;")
	public static Class100 aClass100_119;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "S")
	public static short aShort91 = 256;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "Z")
	public static boolean aBoolean410 = true;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "[Lclient!rr;")
	public static Class58_Sub1[] aClass58_Sub1Array2 = new Class58_Sub1[0];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method5088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 - arg0;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!wh;IILclient!de;ZLjava/awt/Canvas;)Lclient!tj;")
	public static Class122 method5090(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(5) Canvas arg4) {
		try {
			@Pc(14) Class local14 = Class.forName("Class122_Sub2");
			@Pc(60) Constructor local60 = local14.getConstructor(Canvas.class, wh.class, Integer.TYPE, Integer.TYPE, de.class);
			return (Class122) local60.newInstance(arg4, arg0, Integer.valueOf(arg1), new Integer(arg2), arg3);
		} catch (@Pc(93) Exception local93) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	public static void method5091() {
		if (Static267.aBoolean336) {
			return;
		}
		Static105.aBoolean110 = true;
		if (Static165.aBoolean173) {
			Static46.aFloat2 = (int) Static46.aFloat2 - 17 & 0xFFFFFFF0;
		} else {
			Static352.aFloat78 += (-Static352.aFloat78 - 12.0F) / 2.0F;
		}
		Static267.aBoolean336 = true;
	}
}
