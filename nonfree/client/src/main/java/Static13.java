import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!b", name = "M", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!b", name = "N", descriptor = "I")
	public static int anInt220 = 1;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)I")
	public static int method197(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI[BI)Ljava/lang/String;")
	public static String method198(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(32) int local32 = arg1[local12 + arg2] & 0xFF;
			if (local32 != 0) {
				if (local32 >= 128 && local32 < 160) {
					@Pc(51) char local51 = Static302.aCharArray10[local32 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local32 = local51;
				}
				local8[local10++] = (char) local32;
			}
		}
		return new String(local8, 0, local10);
	}
}
