import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "[I")
	public static final int[] anIntArray312 = new int[1000];

	@OriginalMember(owner = "client!me", name = "G", descriptor = "[I")
	public static final int[] anIntArray313 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(ZI)V")
	public static void method5069(@OriginalArg(0) boolean arg0) {
		if (Static440.aString83.length() == 0) {
			return;
		}
		Static83.method6024("--> " + Static440.aString83);
		Static587.method8497(Static440.aString83, arg0, false);
		Static387.anInt6408 = 0;
		Static567.anInt9577 = 0;
		Static440.aString83 = "";
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method5071() {
		try {
			@Pc(22) Method local22 = Runtime.class.getMethod("availableProcessors");
			if (local22 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(32) Integer local32 = (Integer) local22.invoke(local26, (Object[]) null);
					Static306.anInt5334 = local32;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Canvas;BLclient!d;I)Lclient!ha;")
	public static Class133 method5075(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3) {
		return new Class133_Sub2(arg1, arg2, arg0, arg3);
	}
}
