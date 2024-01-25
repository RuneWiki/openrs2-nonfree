import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2313(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static442.method6404(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < Static125.anInt2592; local31++) {
			@Pc(37) String local37 = Static186.aStringArray25[local31];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static442.method6404(local37);
			if (local37 != null && local37.equals(local20)) {
				Static125.anInt2592--;
				for (@Pc(61) int local61 = local31; local61 < Static125.anInt2592; local61++) {
					Static186.aStringArray25[local61] = Static186.aStringArray25[local61 + 1];
					Static22.aStringArray3[local61] = Static22.aStringArray3[local61 + 1];
					Static85.aStringArray9[local61] = Static85.aStringArray9[local61 + 1];
					Static147.aStringArray14[local61] = Static147.aStringArray14[local61 + 1];
					Static286.aBooleanArray19[local61] = Static286.aBooleanArray19[local61 + 1];
				}
				Static185.anInt3634 = Static144.anInt2943;
				Static403.method5961(Static64.aClass92_30);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(arg0));
				Static109.aClass6_Sub1_Sub1_5.method6448(arg0);
				return;
			}
		}
	}
}
