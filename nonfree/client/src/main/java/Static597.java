import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_41 = new Class66(64);

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	public static void method7829() {
		if (Static31.aClass353_3 != null) {
			Static31.aClass353_3.method7682();
		}
		if (Static261.aThread2 == null) {
			return;
		}
		while (true) {
			try {
				Static261.aThread2.join();
				return;
			} catch (@Pc(21) InterruptedException local21) {
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public static int method7834(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIILclient!pc;I[BI)Lclient!qt;")
	public static Class116_Sub2_Sub1 method7836(@OriginalArg(4) Class33_Sub3 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean571 || Static211.method8993(arg1) && Static211.method8993(arg3)) {
			return new Class116_Sub2_Sub1(arg0, 3553, 6406, arg1, arg3, false, arg2, 6406);
		} else if (arg0.aBoolean568) {
			return new Class116_Sub2_Sub1(arg0, 34037, 6406, arg1, arg3, false, arg2, 6406);
		} else {
			return new Class116_Sub2_Sub1(arg0, 6406, arg1, arg3, Static162.method2593(arg1), Static162.method2593(arg3), arg2, 6406);
		}
	}
}
