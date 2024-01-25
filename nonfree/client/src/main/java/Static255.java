import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!taa;")
	public static Class332 aClass332_1;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_87 = new Class126(50, 2);

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	public static int anInt4818 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZB)I")
	public static int method4045(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static418.anInt7055;
		if (local5 == 0) {
			return arg0 ? 0 : Static88.anInt1938;
		} else if (local5 == 1) {
			return Static88.anInt1938;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4046(@OriginalArg(0) Class16 arg0) {
		Static49.aClass122Array1 = new Class122[Static438.anIntArray459.length];
		for (@Pc(16) int local16 = 0; local16 < Static438.anIntArray459.length; local16++) {
			@Pc(22) int local22 = Static438.anIntArray459[local16];
			@Pc(27) Class202 local27 = Static199.method8735(local22, Static114.aClass143_26);
			@Pc(35) Class69 local35 = arg0.method8117(local27, Static683.method3281(Static647.aClass143_143, local22));
			Static49.aClass122Array1[local16] = new Class122(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Z")
	public static boolean method4048() {
		return Static55.aBoolean127;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method4049() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static636.anInt9818 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(40) Exception local40) {
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BFFF)I")
	public static int method4050(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local17 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
