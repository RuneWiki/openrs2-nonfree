import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!eaa", name = "G", descriptor = "[I")
	public static int[] anIntArray166 = new int[2];

	@OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
	public static int anInt2219 = 0;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_40 = new Class225(101, -1);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public static void method1958(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub6_Sub12 local11 = Static636.method8647(1, (long) arg0);
		local11.method6245();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1959(@OriginalArg(0) String arg0) {
		@Pc(15) String local15 = null;
		@Pc(21) int local21 = arg0.indexOf("--> ");
		if (local21 >= 0) {
			local15 = arg0.substring(0, local21 + 4);
			arg0 = arg0.substring(local21 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(53) int local53 = arg0.indexOf(" ", "directlogin ".length());
			if (local53 >= 0) {
				@Pc(58) int local58 = arg0.length();
				arg0 = arg0.substring(0, local53) + " ";
				for (@Pc(74) int local74 = local53 + 1; local74 < local58; local74++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local15 == null ? arg0 : local15 + arg0;
	}
}
