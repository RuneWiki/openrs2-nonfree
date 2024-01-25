import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
	public static int anInt2568;

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "[Lclient!lr;")
	public static Class203[] aClass203Array1;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
	public static int anInt2571 = -1;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)J")
	public static synchronized long method2047() {
		@Pc(13) long local13 = System.currentTimeMillis();
		if (local13 < Static363.aLong187) {
			Static330.aLong174 += Static363.aLong187 - local13;
		}
		Static363.aLong187 = local13;
		return local13 + Static330.aLong174;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!pi;I)Z")
	public static boolean method2048(@OriginalArg(1) Class262 arg0, @OriginalArg(2) int arg1) {
		Static47.aClass81_1.method6591(arg0.anIntArray419[arg1], arg0.anIntArray417[arg1], arg0.anIntArray418[arg1], Static299.anIntArray330);
		@Pc(22) int local22 = Static299.anIntArray330[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray94[arg1] = (short) (Static299.anIntArray330[0] * Static144.anInt3100 / local22 + Static270.anInt5668);
			arg0.aShortArray92[arg1] = (short) (Static32.anInt1172 * Static299.anIntArray330[1] / local22 + Static568.anInt10300);
			arg0.aShortArray93[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!vo;I)V")
	public static void method2049(@OriginalArg(0) Class348 arg0) {
		Static252.aClass348_54 = arg0;
	}
}
