import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_151 = new Class349(105, 12);

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	public static int anInt9053 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7237(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(44) int local44 = arg0.indexOf(" ", "directlogin ".length());
			if (local44 >= 0) {
				@Pc(52) int local52 = arg0.length();
				arg0 = arg0.substring(0, local44) + " ";
				for (@Pc(68) int local68 = local44 + 1; local68 < local52; local68++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method7240() {
		Static143.anInt7433 = -1;
		Static180.anInt2677 = -1;
		Static449.anInt7189 = 0;
		Static484.anInt7716 = -1;
	}
}
