import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	public static int anInt6936;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "Z")
	public static boolean aBoolean488 = true;

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lclient!fca;I)V")
	public static void method5794(@OriginalArg(0) Class97 arg0) {
		if (Static557.anInt9311 == arg0.anInt2303) {
			Static258.aBooleanArray27[arg0.anInt2353] = true;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method5796(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (long) arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	public static void method5798() {
		Static466.anInt7907 = 1;
		Static177.anInt3167 = -1;
		if (Static89.aString25 == null) {
			Static348.method7153(35);
		} else {
			@Pc(25) Class6_Sub14 local25 = new Class6_Sub14(Static377.method5522(Static273.method3935(Static89.aString25)));
			@Pc(31) long local31 = local25.method6033();
			Static473.aLong205 = local25.method6033();
			Static217.method3195(Static88.method1427(local31), "", true);
		}
	}
}
