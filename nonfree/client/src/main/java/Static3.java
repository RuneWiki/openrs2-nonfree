import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt6323 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt6324 = 0;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public static int anInt6328 = 0;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)Lclient!hi;")
	public static Class106 method5298(@OriginalArg(0) int arg0) {
		@Pc(13) Class106[] local13 = Static42.method821();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt2626) {
				return local13[local15];
			}
		}
		return null;
	}
}
