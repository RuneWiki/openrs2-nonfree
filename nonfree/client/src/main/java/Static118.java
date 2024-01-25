import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!dka", name = "i", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_38 = new Class186(141, 4);

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IB)Lclient!av;")
	public static Class20 method2045(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static403.aClass20ArrayArray2[local14] == null || Static403.aClass20ArrayArray2[local14][local18] == null) {
			@Pc(34) boolean local34 = Static255.method3996(local14);
			if (!local34) {
				return null;
			}
		}
		return Static403.aClass20ArrayArray2[local14][local18];
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)I")
	public static int method2049() {
		return Static111.anInt2225;
	}
}
