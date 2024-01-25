import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public static int anInt6961;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)Lclient!lk;")
	public static Class203 method5954(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static59.aClass203ArrayArray3[local13] == null || Static59.aClass203ArrayArray3[local13][local17] == null) {
			@Pc(31) boolean local31 = Static87.method1968(local13);
			if (!local31) {
				return null;
			}
		}
		return Static59.aClass203ArrayArray3[local13][local17];
	}
}
