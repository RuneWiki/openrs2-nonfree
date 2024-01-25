import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nu", name = "G", descriptor = "[[[Lclient!fl;")
	public static Class82[][][] aClass82ArrayArrayArray3;

	@OriginalMember(owner = "client!nu", name = "U", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
	public static int anInt4366 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BB)C")
	public static char method3514(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(45) char local45 = Static440.aCharArray6[local12 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local12 = local45;
		}
		return (char) local12;
	}
}
