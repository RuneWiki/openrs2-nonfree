import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method837(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + arg0.charAt(local19) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z")
	public static boolean method838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
