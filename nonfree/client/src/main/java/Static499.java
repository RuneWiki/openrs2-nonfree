import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_43 = new Class167(8);

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_44 = new Class167(8);

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
	public static int anInt8421 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6523(@OriginalArg(0) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local17 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(79) int local79;
				if (local25 >= '0' && local25 <= '9') {
					local79 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local79 = local25 + 10 - 'a';
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local79 = local25 + 10 - 65;
				}
				local79 *= 16;
				local25 = arg0.charAt(local19 + 2);
				if (local25 >= '0' && local25 <= '9') {
					local79 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local79 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local79 += local25 - 55;
				}
				if (local79 != 0 && Static292.method4719((byte) local79)) {
					local14.append(Static320.method5004((byte) local79));
				}
				local19 += 2;
			} else if (local25 == '+') {
				local14.append(' ');
			} else {
				local14.append(local25);
			}
		}
		return local14.toString();
	}
}
