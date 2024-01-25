import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString44 = "glow2:";

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt1094 = 0;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	public static int anInt1095 = 16777215;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt1098 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
	public static int method969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg0;
		}
		@Pc(16) int local16 = 128 - arg2;
		@Pc(30) int local30 = (arg0 & 0x7F) * local16 + arg2 * (arg1 & 0x7F) >> 7;
		@Pc(44) int local44 = arg2 * (arg1 & 0x380) + local16 * (arg0 & 0x380) >> 7;
		@Pc(58) int local58 = (arg1 & 0xFC00) * arg2 + local16 * (arg0 & 0xFC00) >> 7;
		return local44 & 0x380 | local58 & 0xFC00 | local30 & 0x7F;
	}
}
