import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static int[] anIntArray429;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!ud;")
	public static Class2_Sub34 aClass2_Sub34_14;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method5513() {
		for (@Pc(7) int local7 = 0; local7 < Static244.aByteArrayArrayArray9.length; local7++) {
			for (@Pc(16) int local16 = 0; local16 < Static244.aByteArrayArrayArray9[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static244.aByteArrayArrayArray9[0][0].length; local20++) {
					Static244.aByteArrayArrayArray9[local7][local16][local20] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([IB[J)V")
	public static void method5515(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static267.method6451(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z")
	public static boolean method5516() {
		@Pc(5) boolean local5 = true;
		if (Static85.aClass120_2 == null) {
			if (Static594.aClass97_144.method2564(Static529.anInt8816)) {
				Static85.aClass120_2 = Static647.method3064(Static594.aClass97_144, Static529.anInt8816);
			} else {
				local5 = false;
			}
		}
		if (Static49.aClass120_1 == null) {
			if (Static594.aClass97_144.method2564(Static502.anInt4162)) {
				Static49.aClass120_1 = Static647.method3064(Static594.aClass97_144, Static502.anInt4162);
			} else {
				local5 = false;
			}
		}
		if (Static329.aClass120_9 == null) {
			if (Static594.aClass97_144.method2564(Static471.anInt8084)) {
				Static329.aClass120_9 = Static647.method3064(Static594.aClass97_144, Static471.anInt8084);
			} else {
				local5 = false;
			}
		}
		if (Static258.aClass114_43 == null) {
			if (Static428.aClass97_107.method2564(Static9.anInt175)) {
				Static258.aClass114_43 = Static528.method7370(Static428.aClass97_107, Static9.anInt175);
			} else {
				local5 = false;
			}
		}
		if (Static150.aClass120Array1 == null) {
			if (Static594.aClass97_144.method2564(Static9.anInt175)) {
				Static150.aClass120Array1 = Static647.method3073(Static594.aClass97_144, Static9.anInt175);
			} else {
				local5 = false;
			}
		}
		return local5;
	}
}
