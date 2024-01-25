import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public static int anInt6371;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_98 = new Class397(6, -2);

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public static int anInt6368 = -1;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_22 = new Class320(16);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
	public static boolean method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
