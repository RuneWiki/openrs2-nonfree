import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_69 = new Class38();

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method6888(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) char[] local11 = new char[arg2];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg2; local15++) {
			@Pc(24) int local24 = arg1[local15 + arg0] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(43) char local43 = Static493.aCharArray7[local24 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local24 = local43;
				}
				local11[local13++] = (char) local24;
			}
		}
		return new String(local11, 0, local13);
	}
}
