import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!so", name = "L", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "I")
	public static int anInt6488 = 0;

	@OriginalMember(owner = "client!so", name = "O", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_221 = new Class186(11, 5);

	@OriginalMember(owner = "client!so", name = "P", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_118 = new Class36(10, 8);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(III)Z")
	public static boolean method5051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
