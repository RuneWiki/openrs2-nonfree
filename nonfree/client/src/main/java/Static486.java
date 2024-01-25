import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!re", name = "U", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_271 = new Class288(93, 1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method6810(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static274.anInt4386;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class142 local22 = Static71.aClass345_1.method7728(arg0[local13]);
			if (local22.anInt3590 != -1) {
				@Pc(35) Class61 local35 = (Class61) Static234.aClass32_87.method630((long) local22.anInt3590);
				if (local35 == null) {
					@Pc(43) Class329 local43 = Static655.method7423(Static79.aClass380_22, local22.anInt3590, 0);
					if (local43 != null) {
						local35 = Static192.aClass95_4.method6980(local43, true);
						Static234.aClass32_87.method629(local35, (long) local22.anInt3590);
					}
				}
				if (local35 != null) {
					Static140.aClass61Array4[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
