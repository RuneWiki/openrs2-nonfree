import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "Lclient!ve;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "Lclient!ec;")
	public static Interface3 anInterface3_4;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_126 = new Class221(67, -2);

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	public static int anInt3803 = 0;

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_90 = new Class140("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IBI)B")
	public static byte method3332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
