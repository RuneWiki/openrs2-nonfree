import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
	public static int anInt4057 = 0;

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
	public static int anInt4060 = 0;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "Lclient!pd;")
	public static final Class250 aClass250_7 = new Class250(4);

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)I")
	public static int method3550(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (local19 * arg0 >> 12) + 40960;
		return local27 * local13 >> 12;
	}
}
