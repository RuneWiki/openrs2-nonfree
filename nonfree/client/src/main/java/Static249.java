import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "Lclient!om;")
	public static Class246 aClass246_117;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_147 = new Class272(116, 6);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method4040() {
		@Pc(15) String local15 = "www";
		if (Static559.aClass173_9 == Static487.aClass173_7) {
			local15 = "www-wtrc";
		} else if (Static559.aClass173_9 == Static266.aClass173_5) {
			local15 = "www-wtqa";
		} else if (Static184.aClass173_3 == Static559.aClass173_9) {
			local15 = "www-wtwip";
		}
		@Pc(36) String local36 = "";
		if (Static502.aString109 != null) {
			local36 = "/p=" + Static502.aString109;
		}
		return "http://" + local15 + "." + Static227.aClass211_1.aString77 + ".com/l=" + Static131.anInt2839 + "/a=" + Static350.anInt8128 + local36 + "/";
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)B")
	public static byte method4041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
