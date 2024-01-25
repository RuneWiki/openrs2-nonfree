import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static489 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt7789;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "[I")
	public static int[] anIntArray420;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_123 = new Class171(72, 6);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)Z")
	public static boolean method6455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
