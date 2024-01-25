import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Lclient!uo;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
	public static int anInt2538;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_42 = new Class146(34, 0);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)Lclient!ni;")
	public static Class178 method2008(@OriginalArg(0) int arg0) {
		@Pc(13) Class178[] local13 = Static397.method5245();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class178 local21 = local13[local15];
			if (local21.anInt4367 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
