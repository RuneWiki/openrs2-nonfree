import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static466 {

	@OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
	public static int anInt8389;

	@OriginalMember(owner = "client!ti", name = "tb", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_113 = new Class158(18, -1);

	@OriginalMember(owner = "client!ti", name = "yb", descriptor = "[I")
	public static final int[] anIntArray714 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ti", name = "Eb", descriptor = "Lclient!db;")
	public static final Class57 aClass57_15 = new Class57(14, 0, 4, 1);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)I")
	public static int method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
