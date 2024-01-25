import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
	public static int anInt5550;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Lclient!mt;")
	public static Class164 aClass164_33 = new Class164(64);

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
	public static int anInt5547 = 0;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	public static int anInt5551 = 0;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "[I")
	public static final int[] anIntArray498 = new int[4096];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4461(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) int local18 = 0;
		@Pc(21) int local21 = arg0.length();
		while (local21 > local18 && Static95.method1666(arg0.charAt(local18))) {
			local18++;
		}
		while (local21 > local18 && Static95.method1666(arg0.charAt(local21 - 1))) {
			local21--;
		}
		@Pc(56) int local56 = local21 - local18;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local56);
		for (@Pc(75) int local75 = local18; local75 < local21; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static268.method3600(local81)) {
				@Pc(89) char local89 = Static27.method305(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}
}
