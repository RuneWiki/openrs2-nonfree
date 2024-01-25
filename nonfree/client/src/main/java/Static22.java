import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!fm;")
	public static Class87 aClass87_7;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "Lclient!rs;")
	public static Class207 aClass207_13;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_102 = new Class131(21, 11);

	@OriginalMember(owner = "client!av", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	public static int anInt3913 = 0;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)Z")
	public static boolean method3260(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)I")
	public static int method3261(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!bs;IZI)V")
	public static void method3264(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static150.aClass33ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3265(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static99.method1540(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static99.method1540(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(49) int local49 = local14 - local11;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local49);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static12.method299(local72)) {
				@Pc(80) char local80 = Static95.method1506(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}
}
