import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public static int anInt6212;

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt6210 = -1;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString43 = null;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!vh;II)Lclient!gv;")
	public static Class101 method5025(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method5644(arg1);
		return local16 == null ? null : new Class101(local16);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method5027(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg0[arg1 + local19] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(45) char local45 = Static348.aCharArray5[local29 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local29 = local45;
				}
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([BB)[B")
	public static byte[] method5029(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static460.method4220(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
