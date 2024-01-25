import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "J")
	public static long aLong192;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public static int anInt7738 = 0;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
	public static int[] anIntArray555 = new int[2];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method6166(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
