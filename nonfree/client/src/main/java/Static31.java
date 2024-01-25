import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_10 = new Class241(57, 3);

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "Lclient!u;")
	public static final Class352 aClass352_1 = new Class352("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method413(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(29) int local29 = local6 + 3 & 0xFFFFFFFC;
		@Pc(35) int local35 = local29 / 4 * 3;
		if (local29 - 2 >= local6 || Static672.method8908(arg0.charAt(local29 - 2)) == -1) {
			local35 -= 2;
		} else if (local6 <= local29 - 1 || Static672.method8908(arg0.charAt(local29 - 1)) == -1) {
			local35--;
		}
		@Pc(85) byte[] local85 = new byte[local35];
		Static150.method2927(arg0, 0, local85);
		return local85;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
	public static void method414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub13 local13 = Static30.method353(Static529.aClass241_103, Static525.aClass260_4.aClass270_2);
		local13.aClass6_Sub15_Sub1_1.method3023(arg0);
		local13.aClass6_Sub15_Sub1_1.method3045(arg1);
		Static525.aClass260_4.method6404(local13);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Z")
	public static boolean method415() {
		if (Static477.aBoolean381) {
			try {
				if ((Boolean) Static692.method2495("showingVideoAd", Static371.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(27) Throwable local27) {
			}
		}
		return true;
	}
}
