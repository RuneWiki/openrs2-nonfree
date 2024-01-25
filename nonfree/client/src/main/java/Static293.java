import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public static int anInt5685 = 0;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)I")
	public static int method5037(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}
}
