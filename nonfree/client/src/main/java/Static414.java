import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public static int anInt7056;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
	public static int anInt7057;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)Z")
	public static boolean method5926() {
		if (Static63.aBoolean115) {
			try {
				if ((Boolean) Static600.method2617("showingVideoAd", Static31.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5927(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local12 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(94) int local94;
				if (local25 >= '0' && local25 <= '9') {
					local94 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local94 = local25 - 87;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local94 = local25 + 10 - 65;
				}
				local94 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local94 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local94 += local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local94 += local25 + '\n' - 65;
				}
				local19 += 2;
				if (local94 != 0 && Static91.method1723((byte) local94)) {
					local9.append(Static231.method3591((byte) local94));
				}
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}
}
