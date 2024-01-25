import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Lclient!br;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!mt;")
	public static Class164 aClass164_3 = new Class164(8);

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_8 = new Class55("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(DB)V")
	public static void method246(@OriginalArg(0) double arg0) {
		if (arg0 == Static204.aDouble10) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static106.anIntArray148[local11] = local23 <= 255 ? local23 : 255;
		}
		Static204.aDouble10 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method247() {
		@Pc(14) int[] local14 = new int[Static259.aClass206_2.anInt5386];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static259.aClass206_2.anInt5386; local18++) {
			@Pc(25) Class45 local25 = Static259.aClass206_2.method4320(local18);
			if (local25.anInt960 >= 0 || local25.anInt1004 >= 0) {
				local14[local16++] = local18;
			}
		}
		Static330.anIntArray492 = new int[local16];
		for (@Pc(49) int local49 = 0; local49 < local16; local49++) {
			Static330.anIntArray492[local49] = local14[local49];
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public static void method249() {
		if (!Static402.aBoolean412) {
			return;
		}
		@Pc(11) Class95 local11 = Static407.method5110(Static228.anInt3966, Static68.anInt1325);
		if (local11 != null && local11.anObjectArray33 != null) {
			@Pc(20) Class7_Sub18 local20 = new Class7_Sub18();
			local20.aClass95_5 = local11;
			local20.anObjectArray1 = local11.anObjectArray33;
			Static159.method2352(local20);
		}
		Static194.anInt3446 = -1;
		Static402.aBoolean412 = false;
		Static175.anInt3126 = -1;
		if (local11 != null) {
			Static413.method5189(local11);
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method250() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static62.anInt1162 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(35) Exception local35) {
		}
	}
}
