import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_112 = new Class85("red:", "", "", "");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method4391() {
		@Pc(5) Class92 local5 = null;
		try {
			@Pc(11) Class16 local11 = Static182.aClass139_5.method3860();
			while (local11.anInt381 == 0) {
				Static20.method408(1L);
			}
			if (local11.anInt381 == 1) {
				local5 = (Class92) local11.anObject1;
				@Pc(39) Class5_Sub12 local39 = new Class5_Sub12(Static63.anInt5176 * 6 + 3);
				local39.method5089(1);
				local39.method5084(Static63.anInt5176);
				for (@Pc(49) int local49 = 0; local49 < Static234.anIntArray427.length; local49++) {
					if (Static346.aBooleanArray25[local49]) {
						local39.method5084(local49);
						local39.method5070(Static234.anIntArray427[local49]);
					}
				}
				local5.method2386(0, local39.anInt5731, local39.aByteArray90);
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local5 != null) {
				local5.method2387();
			}
		} catch (@Pc(88) Exception local88) {
		}
		Static135.aLong29 = Static340.method5863();
		Static235.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLclient!vg;)Ljava/lang/String;")
	public static String method4393(@OriginalArg(0) int arg0, @OriginalArg(2) Class201 arg1) {
		if (!Static45.method707(arg1).method5750(arg0) && arg1.anObjectArray33 == null) {
			return null;
		} else if (arg1.aStringArray65 == null || arg1.aStringArray65.length <= arg0 || arg1.aStringArray65[arg0] == null || arg1.aStringArray65[arg0].trim().length() == 0) {
			return Static346.aBoolean577 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray65[arg0];
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
	public static int method4394(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
