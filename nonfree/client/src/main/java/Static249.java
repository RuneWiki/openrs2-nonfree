import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt4238;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_35 = new Class193();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method3548(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub3_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class55 local8 = Static182.aClass55Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static342.anInt5746; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static459.anInt5916; local15++) {
						local1 = local8.q(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static437.anInt7308;
							@Pc(32) int local32 = local12 << Static437.anInt7308;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class55 local41 = Static182.aClass55Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.oa(local15, local12) - local41.oa(local15, local12);
									@Pc(67) int local67 = local8.oa(local15 + 1, local12) - local41.oa(local15 + 1, local12);
									@Pc(85) int local85 = local8.oa(local15 + 1, local12 + 1) - local41.oa(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.oa(local15, local12 + 1) - local41.oa(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
