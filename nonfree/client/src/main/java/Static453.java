import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
	public static int anInt6956;

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
	public static int anInt6954 = 0;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)J")
	public static long method6003() {
		return Static477.aClass87_1.method6750();
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	public static void method6004(@OriginalArg(0) int arg0) {
		Static82.method1792(Static153.aClass22_4, (long) Static716.anInt11157);
		if (Static589.anInt8959 != -1) {
			Static548.method7606(Static589.anInt8959);
		}
		for (@Pc(20) int local20 = 0; local20 < Static440.anInt6772; local20++) {
			if (Static572.aBooleanArray23[local20]) {
				Static472.aBooleanArray19[local20] = true;
			}
			Static452.aBooleanArray17[local20] = Static572.aBooleanArray23[local20];
			Static572.aBooleanArray23[local20] = false;
		}
		if (arg0 < 43) {
			anInt6956 = 48;
		}
		Static238.anInt3789 = Static716.anInt11157;
		if (Static589.anInt8959 != -1) {
			Static440.anInt6772 = 0;
			Static650.method8552();
		}
		Static153.aClass22_4.la();
		Static258.method3586(Static153.aClass22_4);
		@Pc(79) int local79 = Static288.method4037();
		if (local79 == -1) {
			local79 = Static167.anInt2966;
		}
		if (local79 == -1) {
			local79 = Static52.anInt1387;
		}
		Static126.method2306(local79);
		Static286.anInt4372 = 0;
	}
}
