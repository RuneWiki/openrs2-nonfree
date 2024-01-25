import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vga", name = "g", descriptor = "Z")
	public static boolean aBoolean667;

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "[I")
	public static final int[] anIntArray703 = new int[13];

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)I")
	public static int method7682(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}
}
