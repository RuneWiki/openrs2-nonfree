import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36;

	@OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
	public static int anInt9493;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)I")
	public static int method7753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(22) int local22 = 128 - arg0;
		@Pc(36) int local36 = arg0 * (arg2 & 0x7F) + local22 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = local22 * (arg1 & 0x380) + (arg2 & 0x380) * arg0 >> 7;
		@Pc(64) int local64 = (arg2 & 0xFC00) * arg0 + (arg1 & 0xFC00) * local22 >> 7;
		return local50 & 0x380 | local64 & 0xFC00 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)I")
	public static int method7755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static578.aByteArrayArray32 == null ? 0 : Static578.aByteArrayArray32[arg0][arg1] & 0xFF;
	}
}
