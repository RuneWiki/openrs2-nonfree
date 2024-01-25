import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public static int anInt7025 = 0;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
	public static boolean aBoolean508 = false;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[I")
	public static final int[] anIntArray680 = new int[14];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5880(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local12 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(55) int local55;
				if (local25 >= '0' && local25 <= '9') {
					local55 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local55 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local55 = local25 - 55;
				}
				local55 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local55 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local55 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local55 += local25 + '\n' - 65;
				}
				if (local55 != 0 && Static274.method4475((byte) local55)) {
					local9.append(Static147.method2361((byte) local55));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method5882() {
		if (!Static431.aBoolean542) {
			return;
		}
		@Pc(11) Class156 local11 = Static518.method7135(Static379.anInt8819, Static48.anInt942);
		if (local11 != null && local11.anObjectArray5 != null) {
			@Pc(25) Class1_Sub30 local25 = new Class1_Sub30();
			local25.aClass156_11 = local11;
			local25.anObjectArray36 = local11.anObjectArray5;
			Static180.method2683(local25);
		}
		Static196.anInt3862 = -1;
		Static108.anInt2198 = -1;
		Static431.aBoolean542 = false;
		if (local11 != null) {
			Static473.method6593(local11);
		}
	}
}
