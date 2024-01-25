import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
	public static int anInt5835;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Lclient!op;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	public static int anInt5836;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "Lclient!qs;")
	public static Class211 aClass211_73;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "[I")
	public static int[] anIntArray545;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "Lclient!lu;")
	public static Class74 aClass74_1;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	public static int anInt5837 = 0;

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
	public static int anInt5840 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4474(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local12 > local9 && Static195.method3158(arg0.charAt(local9))) {
			local9++;
		}
		while (local9 < local12 && Static195.method3158(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(49) int local49 = local12 - local9;
		if (local49 < 1 || local49 > 12) {
			return null;
		}
		@Pc(66) StringBuffer local66 = new StringBuffer(local49);
		for (@Pc(68) int local68 = local9; local68 < local12; local68++) {
			@Pc(73) char local73 = arg0.charAt(local68);
			if (Static153.method3992(local73)) {
				@Pc(81) char local81 = Static42.method787(local73);
				if (local81 != '\u0000') {
					local66.append(local81);
				}
			}
		}
		if (local66.length() == 0) {
			return null;
		} else {
			return local66.toString();
		}
	}
}
