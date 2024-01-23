import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!pk;")
	public static Class132 aClass132_56;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public static int anInt3264;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47 = new String[500];

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Allocating memory";

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)I")
	public static int method2568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class68.anIntArray139[arg1 * 1024 / arg2] >> 1;
		return ((65536 - local16) * arg3 >> 16) + (arg0 * local16 >> 16);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2569(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(20) String local20 = arg0[arg1];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(30) int local30 = 0;
			@Pc(34) int local34 = arg1 + arg2;
			for (@Pc(36) int local36 = arg1; local36 < local34; local36++) {
				@Pc(47) String local47 = arg0[local36];
				if (local47 == null) {
					local30 += 4;
				} else {
					local30 += local47.length();
				}
			}
			@Pc(65) StringBuffer local65 = new StringBuffer(local30);
			for (@Pc(75) int local75 = arg1; local75 < local34; local75++) {
				@Pc(82) String local82 = arg0[local75];
				if (local82 == null) {
					local65.append("null");
				} else {
					local65.append(local82);
				}
			}
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method2570() {
		for (@Pc(7) int local7 = 0; local7 < Static149.anInt3006; local7++) {
			@Pc(18) Class66 local18 = Static92.method1480(local7);
			if (local18 != null && local18.anInt1953 == 0) {
				Static255.anIntArray392[local7] = 0;
				Static8.anIntArray495[local7] = 0;
			}
		}
		Static138.aClass129_14 = new Class129(16);
	}
}
