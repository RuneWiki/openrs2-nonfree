import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_41 = new Class93("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_42 = new Class93("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "F")
	public static float aFloat37 = 0.0F;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BC)Z")
	public static boolean method2239(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static248.method4500(arg0)) {
			return true;
		} else {
			@Pc(27) char[] local27 = Static25.aCharArray4;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (local35 == arg0) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static351.aCharArray14;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (local59 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method2240(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static291.method5161(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static124.anInt4221 <= arg1 && arg1 <= Static96.anInt2180) {
			@Pc(19) int local19 = Static24.method734(Static307.anInt6214, arg0, Static228.anInt920);
			@Pc(25) int local25 = Static24.method734(Static307.anInt6214, arg2, Static228.anInt920);
			Static86.method1933(arg1, arg3, local19, local25);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V")
	public static void method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static120.anInt2601 = arg0 - Static127.anInt1567;
		Static2.anInt62 = arg1 - Static127.anInt1568;
	}
}
