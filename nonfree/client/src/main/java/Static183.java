import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!kg", name = "J", descriptor = "Lclient!du;")
	public static final Class56 aClass56_4 = new Class56();

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[S")
	public static final short[] aShortArray64 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public static void method2982() {
		if (Static251.aString44.length() == 0) {
			return;
		}
		Static32.method5235("--> " + Static251.aString44);
		Static71.method1292(Static251.aString44, false);
		Static319.anInt5631 = 0;
		Static194.anInt3430 = 0;
		Static251.aString44 = "";
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BC)Z")
	public static boolean method2984(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static303.aCharArray9;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (arg0 == local40) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
	public static int method2985() {
		return 16;
	}

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)V")
	public static void method2986() {
		Static161.aClass154_18.method3748();
	}
}
