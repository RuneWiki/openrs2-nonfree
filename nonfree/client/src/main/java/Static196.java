import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gja", name = "e", descriptor = "Lclient!dka;")
	public static Class14_Sub1_Sub2 aClass14_Sub1_Sub2_1;

	@OriginalMember(owner = "client!gja", name = "m", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!gja", name = "k", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_93 = new Class251(48, -1);

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2945(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local12; local20++) {
			@Pc(28) char local28 = arg0.charAt(local20);
			if (local28 == '%' && local12 > local20 + 2) {
				local28 = arg0.charAt(local20 + 1);
				@Pc(87) int local87;
				if (local28 >= '0' && local28 <= '9') {
					local87 = local28 - '0';
				} else if (local28 >= 'a' && local28 <= 'f') {
					local87 = local28 + 10 - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local87 = local28 + '\n' - 65;
				}
				local28 = arg0.charAt(local20 + 2);
				local87 *= 16;
				if (local28 >= '0' && local28 <= '9') {
					local87 += local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local87 += local28 + 10 - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local87 += local28 + '\n' - 65;
				}
				local20 += 2;
				if (local87 != 0 && Static227.method3837((byte) local87)) {
					local9.append(Static223.method3822((byte) local87));
				}
			} else if (local28 == '+') {
				local9.append(' ');
			} else {
				local9.append(local28);
			}
		}
		return local9.toString();
	}
}
