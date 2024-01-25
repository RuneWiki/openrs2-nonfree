import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!qa", name = "Rc", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)Lclient!un;")
	public static Class59 method4387() {
		try {
			return (Class59) Class.forName("Class59_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BC)Z")
	public static boolean method4392(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static203.method3644(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static44.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(47) char[] local47 = Static355.aCharArray6;
			for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
				@Pc(55) char local55 = local47[local49];
				if (arg0 == local55) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(B)V")
	public static void method4393() {
		Static85.aClass129_2.method4937(((float) Static37.anInt693 * 0.1F + 0.7F) * 1.1523438F);
		Static85.aClass129_2.method4925(Static136.anInt6461, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static85.aClass129_2.method4955(Static339.anInt6543, -1);
		Static85.aClass129_2.method4973(Static87.aClass132_1);
	}
}
