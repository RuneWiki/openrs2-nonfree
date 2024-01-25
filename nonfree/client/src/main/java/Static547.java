import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!gu;")
	public static Class131 aClass131_3;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "[I")
	public static int[] anIntArray508 = new int[4];

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!vu;")
	public static final Class368 aClass368_11 = new Class368();

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
	public static boolean method7979(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLjava/io/File;)[B")
	public static byte[] method7981(@OriginalArg(1) File arg0) {
		return Static459.method6832((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)S")
	public static short method7982(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local19 * local15 >> 7;
		@Pc(42) int local42 = local19 + local37;
		@Pc(50) int local50;
		if (local42 == 0) {
			local50 = local37 << 1;
		} else {
			local50 = (local37 << 8) / local42;
		}
		return (short) (local42 | local9 << 10 | local50 >> 4 << 7);
	}
}
