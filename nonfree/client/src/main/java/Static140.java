import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!eka", name = "p", descriptor = "I")
	public static int anInt2654;

	@OriginalMember(owner = "client!eka", name = "I", descriptor = "Lclient!po;")
	public static Class281 aClass281_1;

	@OriginalMember(owner = "client!eka", name = "E", descriptor = "I")
	public static int anInt2658 = 0;

	@OriginalMember(owner = "client!eka", name = "Q", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!eka", name = "kb", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_10 = new Class6(2, 2);

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2430(@OriginalArg(0) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(44) int local44 = arg0.indexOf(" ", "directlogin ".length());
			if (local44 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local44) + " ";
				for (@Pc(65) int local65 = local44 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)I")
	public static int method2434(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
