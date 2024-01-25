import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!is;)Lclient!is;")
	public static Class155 method5509(@OriginalArg(1) Class155 arg0) {
		if (arg0.anInt4769 != -1) {
			return Static558.method7916(arg0.anInt4769);
		}
		@Pc(25) int local25 = arg0.anInt4793 >>> 16;
		@Pc(30) Class217 local30 = new Class217(Static569.aClass221_27);
		for (@Pc(35) Class4_Sub45 local35 = (Class4_Sub45) local30.method5013(); local35 != null; local35 = (Class4_Sub45) local30.method5016()) {
			if (local35.anInt9096 == local25) {
				return Static558.method7916((int) local35.aLong295);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	public static void method5510() {
		Static433.method6463((long) Static306.anInt6122, Static39.aClass7_2);
		if (Static446.anInt8493 != -1) {
			Static503.method7241(Static446.anInt8493);
		}
		for (@Pc(20) int local20 = 0; local20 < Static365.anInt7047; local20++) {
			if (Static155.aBooleanArray6[local20]) {
				Static322.aBooleanArray15[local20] = true;
			}
			Static222.aBooleanArray13[local20] = Static155.aBooleanArray6[local20];
			Static155.aBooleanArray6[local20] = false;
		}
		Static136.anInt3034 = Static306.anInt6122;
		if (Static446.anInt8493 != -1) {
			Static365.anInt7047 = 0;
			Static289.method4602();
		}
		Static39.aClass7_2.JA();
		Static524.method7425(Static39.aClass7_2);
		@Pc(67) int local67 = Static68.method1512();
		if (local67 == -1) {
			local67 = Static117.anInt2703;
		}
		if (local67 == -1) {
			local67 = Static538.anInt9806;
		}
		Static458.method6742(local67);
		Static92.anInt8628 = 0;
	}
}
