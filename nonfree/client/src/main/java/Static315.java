import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!kka", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!kka", name = "s", descriptor = "I")
	public static int anInt5265;

	@OriginalMember(owner = "client!kka", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!kka", name = "z", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!fea;")
	public static final Class112 aClass112_22 = new Class112();

	@OriginalMember(owner = "client!kka", name = "k", descriptor = "Lclient!saa;")
	public static final Class317 aClass317_4 = new Class317();

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)Z")
	public static boolean method4516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4523(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)Z")
	public static boolean method4527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static91.method1514(arg1, arg0) | (arg0 & 0x800) != 0 || Static506.method6604(arg1, arg0);
	}
}
