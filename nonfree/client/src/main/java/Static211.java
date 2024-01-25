import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
	public static int anInt4328;

	@OriginalMember(owner = "client!iaa", name = "c", descriptor = "Lclient!iaa;")
	public static final Class153 aClass153_1 = new Class153();

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "Lclient!iaa;")
	public static final Class153 aClass153_2 = new Class153();

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lclient!iaa;")
	public static final Class153 aClass153_3 = new Class153();

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "Lclient!iaa;")
	public static final Class153 aClass153_4 = new Class153();

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "Lclient!rda;")
	public static final Class286 aClass286_5 = new Class286();

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
