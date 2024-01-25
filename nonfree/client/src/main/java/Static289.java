import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!qs;)V")
	public static void method4248(@OriginalArg(1) Class211 arg0) {
		Static13.aClass211_41 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)V")
	public static void method4249(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static403.method5534(arg0 - 1L);
			Static403.method5534(1L);
		} else {
			Static403.method5534(arg0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method4251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
			@Pc(25) int local25 = arg2[arg1 + local15] & 0xFF;
			if (local25 != 0) {
				if (local25 >= 128 && local25 < 160) {
					@Pc(42) char local42 = Static382.aCharArray5[local25 - 128];
					if (local42 == '\u0000') {
						local42 = '?';
					}
					local25 = local42;
				}
				local6[local8++] = (char) local25;
			}
		}
		return new String(local6, 0, local8);
	}
}
