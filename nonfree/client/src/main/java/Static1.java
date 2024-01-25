import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[8];

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
	public static int anInt41 = 0;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	public static int anInt44 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!fc;)V")
	public static void method29(@OriginalArg(1) Class71 arg0) {
		Static111.aClass71_24 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IIII)I")
	public static int method32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(22) int local22 = 128 - arg2;
		@Pc(36) int local36 = (arg1 & 0x7F) * arg2 + (arg0 & 0x7F) * local22 >> 7;
		@Pc(50) int local50 = local22 * (arg0 & 0x380) + arg2 * (arg1 & 0x380) >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg2 + (arg0 & 0xFC00) * local22 >> 7;
		return local36 & 0x7F | local64 & 0xFC00 | local50 & 0x380;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
	public static int method33(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
